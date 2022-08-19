
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"Hoang");
//        map.put(2,"Hieu");
//        map.put(3,"Giang");
//        System.out.println(map);
//        System.out.println(map.get(2));

        Map<Integer, User> map1 = new HashMap<>();
        map1.put(1, new User("Hieu",30));
        map1.put(2, new User("Hoang",26));
       User user = map1.get(2);
        System.out.println(user);
        user.setName("Chu ba thong");
        System.out.println(user);
        System.out.println(map1);

        Set<Integer> set = map1.keySet();
        int sum = 0;
        for (Integer s: set){
            sum+=map1.get(s).getAge();
            System.out.println(s);
        }
    }
}
