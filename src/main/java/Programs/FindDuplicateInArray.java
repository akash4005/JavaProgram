package Programs;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateInArray {


    //akash kawade

    public static void main(String[] args) {

        int arr[]={1,2,3,4,1,2,3,12,14};
        //



        //Option 1:Using HashMap
        System.out.println("=========Using HashMap=====================================");

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i:arr){

            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);

            }else {
                map.put(i,1);
            }
        }

        map.forEach((key, value) -> {


                System.out.println(key + " :"+value);

        });

        System.out.println("=========Using HashSet=====================================");
        //Option 2:Using Hashset

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();

        for(int p:arr){


            if(!set.add(p)){
                duplicate.add(p);
            }
        }
        duplicate.forEach(integer -> System.out.println(integer));


        //Option3 Using adjecent Comparing
        System.out.println("===========Adjecent Comparing=========");



        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    System.out.println("Duplicate :"+arr[i]);
                }
            }

        }


        System.out.println("=============using Hashset=========");


        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };

        //calculate length of the arrayWithDuplicates
        int len = arrayWithDuplicates.length;

        // Creates an empty hashset to store distinct elements
        HashSet<Integer> hashset = new HashSet<>();

        // travers the arrayWithDuplicates array to store elements in the hashset
        for (int i = 0; i < len; i++)
        {
            // check whether the element is present in the hashset or not. If it is not present in the hashset, add in it.
            if (!hashset.contains(arrayWithDuplicates[i]))
            {
                hashset.add(arrayWithDuplicates[i]);
            }
        }
        //print hash set that contains distinct element
        System.out.print(hashset);
    }
}

