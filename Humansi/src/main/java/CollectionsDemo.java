import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CollectionsDemo<T extends Human> {
    public int firstLiteral(List<String> wordList, char literal) {
        if (wordList == null) {
            throw new IllegalArgumentException("List is null");
        }
        int counter = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf(literal) == 0) {
                counter++;
            }
        }
        return counter;
    }

    public List<Human> equalsFirstName(List<Human> humansi, Human human) {
        if (humansi == null) {
            throw new IllegalArgumentException("List is null");
        }
        if (human == null) {
            throw new IllegalArgumentException("List is null");
        }
        List<Human> returnList = new LinkedList<Human>();
        for (int i = 0; i < humansi.size(); i++) {
            if (humansi.get(i).getFirstName().equals(human.getFirstName())) {
                returnList.add(humansi.get(i));
            }
        }
        return returnList;
    }

    public List<Set<Integer>> setList(LinkedList<Set<Integer>> listSet, Set<Integer> set) {
        List<Set<Integer>> returnList = new LinkedList<>();
        boolean flag = true;
        if (listSet == null)
            throw new IllegalArgumentException("List is null");
        if (set == null)
            throw new IllegalArgumentException("Set is null");
        for (Set<Integer> a : listSet) {
            for (Integer b : a) {
                for (Integer c : set) {
                    if (b.equals(c)) {
                        flag = false;
                    }
                }
            }
            if (flag == true)
                returnList.add(a);
            flag = true;
        }
        return returnList;
    }

    public Set<Integer> List18(Map<Integer, T> humans) {
        Set<Integer> a = new HashSet<Integer>();
        boolean flag = false;
        int f = 0;
        Set<Integer> collection = humans.keySet();

        for (T i : humans.values()) {
            if (i.getAge() >= 18) {
                for (Integer j : collection) {
                    if (humans.get(j).equals(i))
                        a.add(j);
                }
            }
        }

        return a;
    }

    public <T extends Human> Set<T> mapSearchHumans(Map<Integer, T> humans, Set<Integer> identificators) {
        Set<T> a = new HashSet<T>();
        boolean flag = false;
        int f = 0;
        for (Integer i : identificators) {
            if (humans.get(i) != null) {
                a.add(humans.get(i));
            }
        }

        return a;
    }

    public List<Human> deleteHuman(List<Human> list, Human human) {
        LinkedList<Human> a = new LinkedList<Human>(list);
        for (Human t : a) {
            if (t.equals(human)) {
                a.pop();
            }
        }
        return a;
    }

    public <T extends Human> Set<T> maxAgeSet(List<T> list) {
        Set<T> returnSet = new HashSet<T>();
        int maxAge = 0;
        for (T a : list) {
            if (a.getAge() > maxAge)
                maxAge = a.getAge();
        }
        for (T a : list) {
            if (a.getAge() == maxAge)
                returnSet.add(a);
        }
        return returnSet;
    }

    public Map<Integer, Integer> listAge(Map<Integer, T> humans) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : humans.keySet()) {

            map.put(i, humans.get(i).getAge());
        }
        return map;
    }

    public Map<Integer, List<T>> mapList(Set<T> a, int age) {
        Map<Integer, List<T>> ret = new HashMap<Integer, List<T>>();
        List<T> list = new LinkedList<T>();
        boolean flag = false;
        for (T i : a) {
            if (i.getAge() == age) {
                list.add(i);
            }

        }
        ret.put(age, list);
        return ret;
    }

    public Map<Integer, Map<Character, List<Human>>> wordList(Set<Human> humanSet, Map<Integer, Character> map,
                                                              int age) {
        Map<Integer, Map<Character, List<Human>>> ret = new HashMap<Integer, Map<Character, List<Human>>>();
        LinkedList<Human> list = new LinkedList<Human>(humanSet);
        Map<Character, List<Human>> map1 = new HashMap<Character, List<Human>>();
        List<Human> list1 = new LinkedList<Human>();
        Character literal = ' ';
        boolean flag = true;
        for (Human k : list) {
            if (k.getAge() == age) {
                String str = k.getFirstName();
                literal = str.charAt(0);
                for (Character c : map.values()) {
                    if (c == literal) {
                        if (map1.containsKey(c)) {
                            list1 = map1.get(c);
                            list1.add(k);
                            map1.put(c, list1);
                        } else {
                            list1 = new LinkedList<Human>();
                            list1.add(k);
                            map1.put(c, list1);
                        }
                        flag = false;
                    }
                }
                if (flag == true) {
                    ret.put(k.getAge(), map1);
                }
                flag = true;
            }
        }
        return ret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionsDemo<?> that = (CollectionsDemo<?>) o;
        return Objects.equals(wordList, that.wordList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordList);
    }
}
