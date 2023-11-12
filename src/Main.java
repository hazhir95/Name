// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;


public class Main {
    public static void main(String[] args) {


        int fn;
        String Name = "";

        String[][] Letters = {{".","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
                {".","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}
        };


        //finding H
        while (true) {
            fn = RN();
            System.out.println(Letters[0][fn]);
            if (fn == 8) {
                Name = Letters[0][fn];
                break;
            }
        }

        //finding a
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 1) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding j
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 10) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding i
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 9) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding r
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 18) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //putting space character
        Name = Name + " ";

        //finding R
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[0][fn]);
            if (fn == 18) {
                Name = Name + Letters[0][fn];
                break;
            }
        }

        //finding a
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 1) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding s
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 19) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding o
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 15) {
                Name = Name + Letters[1][fn];
                break;
            }

        }

        //finding u
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 21) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding l
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 12) {
                Name = Name + Letters[1][fn];
                break;
            }
        }

        //finding i
        while (true) {
            fn = RN();
            System.out.println(Name + Letters[1][fn]);
            if (fn == 9) {
                Name = Name + Letters[1][fn];
                break;
            }
        }
    }




    public static int RN() {
        Random random = new Random();
        return random.nextInt(26) + 1;
    }


}
