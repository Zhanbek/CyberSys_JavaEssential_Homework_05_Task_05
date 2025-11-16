import model.Friends;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[5];
        List<Friends>  friendsList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print("Вкажіть ім'я " +  (i + 1) + " го друга: ");
            array[i] = sc.nextLine();
            friendsList.add(new Friends(array[i]));
        }
        sc.close();
        System.out.println();
        System.out.println("Ваші друзі:");
        System.out.println("------------------------------");
        Iterator<Friends> iterator = friendsList.iterator();
        while (iterator.hasNext()) {
            Friends friend = iterator.next();
            System.out.println(friend.getName());
        }
        System.out.println("------------------------------");
        Collections.sort(friendsList, new Comparator<Friends>() {
            @Override
            public int compare(Friends o1, Friends o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println();
        System.out.println("Ваші друзі після сортування:");
        System.out.println("------------------------------");
        iterator = friendsList.iterator();
        while (iterator.hasNext()) {
            Friends friend = iterator.next();
            System.out.println(friend.getName());
        }
        System.out.println("------------------------------");
    }
}