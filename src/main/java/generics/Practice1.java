package generics;

import java.util.ArrayList;

public class Practice1 {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Rahim");
        names.add("Karim");
        names.add("Ishak");
        names.add("Shawkyy");
        names.add("Rashid");

        printLastName(names);

    }

    private static void printLastName(ArrayList<String> names){
        for(String n:names){
            System.out.println(n +" Humayoun");
        }

    }


}
