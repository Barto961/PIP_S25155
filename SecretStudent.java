public class SecretStudent {
    private String name = "default name";

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        SecretStudent student = new SecretStudent();
        System.out.println(student.getName());
        private String name = "default name"; // prywatne pole o nazwie "name" typu String z wartością domyślną "default name"

        // metoda publiczna getter dla zmiennej name
        public String getName() {
            return name;
        }

        // metoda publiczna setter dla zmiennej name
        public void setName(String newName) {
            if (newName != null && !newName.isEmpty()) { // sprawdzanie czy nie jest to pusty String
                this.name = newName;
            }
        }
    }
}
