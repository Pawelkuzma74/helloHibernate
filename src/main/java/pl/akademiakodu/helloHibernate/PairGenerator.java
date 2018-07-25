package pl.akademiakodu.helloHibernate;

import java.util.*;


public class PairGenerator {


    public static List<Pair> generatePairs(List<User> personList) {
        List<Pair> pairs = new ArrayList<>();
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();

        while (personList.size() != hashSet.size()) {
            int indexFirst = random.nextInt(personList.size());
            int secondIndex = random.nextInt(personList.size());

            if (indexFirst == secondIndex || hashSet.contains(indexFirst) ||
                    hashSet.contains(secondIndex)) {
                continue;
            } else {
                hashSet.add(indexFirst);
                hashSet.add(secondIndex);
                User user = new User();
                user.setName(personList.get(indexFirst).getName());
                User user2 = new User();
                user2.setName(personList.get(secondIndex).getName());


                pairs.add(
                        new Pair(user,user2));
            }

        }
        return pairs;
    }
}
