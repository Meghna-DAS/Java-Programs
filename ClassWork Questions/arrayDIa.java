import java.util.Random;


public class arrayDIa {
    public static void main(final String[] args) {
      
       
       
        // friends program
        int i = 0;
        int totalFriends = 0;
        int[] friends = new int[10];
        Random rand = new Random();
        while (i<10){
            int randnum = rand.nextInt(2);
            friends[i] = randnum;
            i++;
        }


        System.out.println("Initial friends Array: ");
        for (int j : friends) {
            System.out.print(j + " ");
        }
        System.out.println();


        for (int j = 0; j < friends.length; j++) {
            if(friends[j]==1)
                totalFriends = totalFriends + 1;
        }
        System.out.println("Total Number of friends: " + totalFriends);

    }


}