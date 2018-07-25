package pl.akademiakodu.helloHibernate;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ExampleUser {
    static List<String> people = new ArrayList<>();
    static {
        people.add("Hanna Hulka");
        people.add("Pawel Skiba");
        people.add("Kacper Slodzinski");
        people.add("Maciej Witos");
        people.add("Kamil Figarski");
        people.add("Dawid Czartoszewski");
        people.add("Pawel Kuzma");
        people.add("Paulina Wojcik");
        people.add("Aleksandra Ciesielska");
        people.add("Rafal Gil");
        people.add("Adrian Lachowicz");
        people.add("Mariusz Przybylski");
    }

    public static List<String> getPeople() {
        return people;
    }

    static void createPeople(){
        List<Person> persons = new ArrayList<>();
    }

    @Autowired
    private UserRepository userRepository;


    public void createUsers(){
        for (String person: people){
            this.userRepository.save(new User(person));
        }
    }



}
