pclass Person {
private String name;
private String familyName;

public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
        }

public String getName() {
        return name;
        }

public String getFamilyName() {
        return familyName;
        }
        }

class BankAccount {
    private Person person;
    private double balance;

    public BankAccount(Person person) {
        this.person = person;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Nie wystarczające środki na koncie");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

    public static void main(String[] args) {
        Person person = new Person("Adam", "Małysz");
        BankAccount account = new BankAccount(person);
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance()); // 500
    }
}
