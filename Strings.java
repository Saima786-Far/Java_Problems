import java.util.Scanner;

public class Strings {
    public static void main(String args[]){
        // String name = "Saim";
        // String fullName = "Saima Farheen";
        // String sentence =  "My name is Saima Farheen";



        //User Input
        // Scanner sc = new Scanner(System.in);
        // // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);


//concatenation
//length
//         String firstName =  "Saima";
//         String lastName = " Farheen";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName);
//         System.out.println(fullName.length());
// //charAt
//         for(int i = 0; i<fullName.length(); i++){
//             System.out.println(fullName.charAt(i));

//         }


//Compare
// s1> s2: +ve value
// s1== s2 : 0
// s1<s2 : -ve value
// hello wello  h<w true
//String are objects in java

        // String name1 = "Saima";
        // String name2 = "Saima";
        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }


        //substring(beg index , end index)
        //lastindex is exclusive in substring
 String sentence = "Saimafarheen";
//  String name = sentence.substring(0, sentence.length());
 String name = sentence.substring(5);
 System.out.println(name);

 //String are immutable - non changeable

    }
    
}
