package pl.akademiakodu.helloHibernate;


public class Pair {

    private User firstPerson;
    private User secondPerson;

    public Pair(User firstPerson, User secondPerson) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
    }

    public User getFirstPerson() {
        return firstPerson;
    }

    public void setFirstPerson(User firstPerson) {
        this.firstPerson = firstPerson;
    }

    public User getSecondPerson() {
        return secondPerson;
    }

    public void setSecondPerson(User secondPerson) {
        this.secondPerson = secondPerson;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstPerson=" + firstPerson +
                ", secondPerson=" + secondPerson +
                '}';
    }
}
