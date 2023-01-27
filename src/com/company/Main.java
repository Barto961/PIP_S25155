package com.company;

public class Main {

    public static String[] splitBy(String line, String separator) {
        return line.split(separator);
    }

    public static void main(String[] args) throws IOException {
        // Zadanie 2
        BufferedReader reader = new BufferedReader(new FileReader("src/pip10/data.txt"));
        String[] lines = new String[10];
        for (int i = 0; i < 10; i++) {
            lines[i] = reader.readLine();
        }
        reader.close();

        // Zadanie 3
        String[][] data2D = new String[10][];
        for (int i = 0; i < 10; i++) {
            data2D[i] = splitBy(lines[i], ",");
        }

        // Zadanie 3 - metoda wyświetlająca tablicę 2D w konsoli
        public static void print2DArray(String[][] array) {
            for (String[] row : array) {
                System.out.println(Arrays.toString(row));
            }
        }
        print2DArray(data2D);

        // Zadanie 4
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/pip10/output.txt"));
        for (int i = 0; i < 10; i++) {
            writer.write(i + "," + String.join(",", data2D[i]));
            writer.newLine();
        }
        writer.close();
    }
}
