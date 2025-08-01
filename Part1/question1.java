import java.util.ArrayList;
import java.util.Scanner;

// what this code does is 
// user enters an id 
// various other elements inside that array can have the same id ( which means they are connected )
// so inside the connection we find the largest element among the ones having same id as the user entered


public class question1 {
    int[] data =  {0,1,1,3,4,1,1,1,3,2};

    public int CalculateTheIndex(int input)
    {
            ArrayList<Integer> matchingIndexes = new ArrayList<>();

            for (int i = 0; i < data.length; i++) {
            {
                if(data[i] == input) 
                {

                    matchingIndexes.add(i);
                }
            }
    }
    System.out.println(matchingIndexes);
    int maxIndex = -1;
    for (int index : matchingIndexes) {
    if (index > maxIndex) {
        maxIndex = index;
    }
}
return maxIndex;
}

    public static void main(String[] args)
    {
        System.out.println("Enter the elemnt to find the largest component in the connection of that element: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        question1 q = new question1();
        int res = q.CalculateTheIndex(index);
        System.out.println("The largest id in the connnection is: " + res);
        sc.close();
    }
}
// user enteres an index of the array
// i need to find what other indexes have the same id as the id of index that user entered
// after finding all the other indexes with the same id , return the biggest index 
