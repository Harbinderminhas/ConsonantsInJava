import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {

        System.out.print("Enter The String:");
        Scanner s1 =new Scanner(System.in);
        String sentence = s1.nextLine();

        int count =0 ;

        for (int i=0 ;i<sentence.length();i++)
        {

            //Char letter = sentence.charAt(i) ;
            String letter = Character.toString(sentence.charAt(i)).toLowerCase();




            switch (letter)
            {

                case "b" :
                    count++ ;
                    break;


                case "c" :
                    count++ ;
                    break;



                case "d" :
                    count++ ;
                    break;



                case "f" :
                    count++ ;
                    break;


                case "g" :
                    count++ ;
                    break;

                case "h":
                    count++;
                    break;

                case"j":
                    count++;
                    break;

                    case"k":
                        count++;
                        break;

                case"l":
                    count++;
                    break;


                case "m" :
                    count++ ;
                    break;


                case "n" :
                    count++ ;
                    break;



                case "p" :
                    count++ ;
                    break;



                case "q" :
                    count++ ;
                    break;


                case "r" :
                    count++ ;
                    break;

                case "s":
                    count++;
                    break;

                case"t":
                    count++;
                    break;

                case"u":
                    count++;
                    break;

                case"v":
                    count++;
                    break;


                case "w" :
                    count++ ;
                    break;

                case "x":
                    count++;
                    break;

                case"y":
                    count++;
                    break;

                case"z":
                    count++;
                    break;



            }


        }

        System.out.println("Count for Vowels :::"+ count);


    }
}
