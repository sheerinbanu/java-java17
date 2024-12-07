package java17.data;

public class Account {

    private Person owner;
    private Integer balance;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Account(Integer balance, Person owner) {
        this.balance = balance;
        this.owner = owner;
    }
}
