package semestr2;

import java.util.*;



public class ListDemo {

    public static List<Human> listOfNamesakes(List<Human> listOfPeople, Human people) {
        List<Human> listOfNamesakes = new ArrayList<>();
        for (Human human : listOfPeople) {
            if (human.getSurname().equals(people.getSurname())) {
                listOfNamesakes.add(human);
            }
        }
        return listOfNamesakes;
    }

    public static List<Human> listWithoutAPeople(List<Human> listOfPeople, Human people) {
        List<Human> listWithoutAPeople = new ArrayList<>();
        for (Human human : listOfPeople) {
            Human human1 = new Human(human.getSurname(), human.getName(),human.getPatronymic(), human.getAge());
            listWithoutAPeople.add(human1);
        }
        listWithoutAPeople.removeAll(Collections.singleton(people));
        return listWithoutAPeople;
    }

    public static List<Set<Integer>> disjointSets(List<Set<Integer>> listOfSets, Set<Integer> set) {
        List<Set<Integer>> disjointSets = new ArrayList<>(listOfSets);
        for (Set<Integer> i : listOfSets) {
            if (i.removeAll(set)) {
                disjointSets.remove(i);
            }
        }
        return disjointSets;
    }

    public static Set<Human> listMaxAge(List<Human> list) {
        int maxAge = 0;
        Set<Human> setMaxAge = new HashSet<Human>();
        for (Human human : list) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }
        }
        for (Human human : list) {
            if (human.getAge() == maxAge) {
                setMaxAge.add(human);
            }
        }
        return setMaxAge;
    }

    public static Set<Human> listIdPeople(Map<Integer, Human> idPeople, Set<Integer> id) {
        Set<Human> peopleId = new HashSet<>();
        for (Integer key : id) {
            if (idPeople.containsKey(key)) {
                peopleId.add(idPeople.get(key));
            }
        }
        return peopleId;
    }

    public static List<Integer> listOfAdults(Map<Integer, Human> idPeople) {
        List<Integer> id = new ArrayList<>();
        Set<Integer> key = idPeople.keySet();
        for (Integer k : key) {
            if (idPeople.get(k).getAge() >= 18) {
                id.add(k);
            }
        }
        return id;
    }

    public static Map<Integer, Integer> listIdAge(Map<Integer, Human> idPeople) {
        Map<Integer, Integer> idAge = new HashMap<>();
        Set<Integer> keys = idPeople.keySet();
        for (Integer id : keys) {
            idAge.put(id, idPeople.get(id).getAge());
        }
        return idAge;
    }

    public static Map<Integer, List<Human>> listAgeHuman(Set<Human> humans) {
        Map<Integer, List<Human>> ageHuman = new HashMap<>();
        for (Human human : humans) {
            List<Human> people = new ArrayList<>();
            if (ageHuman.containsKey(human.getAge())) {
                people = ageHuman.get(human.getAge());
            }
            people.add(human);
            ageHuman.put(human.getAge(), people);

        }
        return ageHuman;
    }

    public static Map<Integer, Map<Character, List<Human>>> listAgeCharHuman(Set<Human> humans) {
        Map<Integer, List<Human>> mapAgeListHuman = listAgeHuman(humans);
        Map<Integer, Map<Character, List<Human>>> result = new HashMap<>();
        for (int age : mapAgeListHuman.keySet()) {
            Map<Character, List<Human>> mapCharListHuman = new HashMap<>();
            for (Human human : mapAgeListHuman.get(age)) {
                List<Human> humanList = new ArrayList<>();
                char firstLetter = human.getSurname().charAt(0);
                if (mapCharListHuman.containsKey(firstLetter)) {
                    humanList = mapCharListHuman.get(firstLetter);
                }
                humanList.add(human);
                mapCharListHuman.put(firstLetter, humanList);
                result.put(human.getAge(), mapCharListHuman);
            }
        }
        return result;
    }
}
