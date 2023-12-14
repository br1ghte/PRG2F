package strings;


import java.util.Scanner;

public class procvicovaninatest {
    public static void main(String[] args) {
        //1. ukol
        String[] users = {"Daniel Havelka", "Tomas Vyletal", "Negr Obecny"};
        for (int i = 0; i < users.length; i++) {
            if (users[i].contains("Negr Obecny")) {
                System.out.println(users[i]);
            }
        }
        //2.ukol
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis libovolne slovo");
        String word = sc.nextLine();
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) == word.charAt(i+1)) {
                System.out.println("Ano, jsou zde zdvojena pismena");
                break;
            }
        }
        //3.ukol
        String oppositeCase = "crazy";
        String znaky = " ";
        for (int i = 0; i < oppositeCase.length(); i++) {
            if ((i+1) % 2 == 0) {
                char znak2 = oppositeCase.charAt(i);
                String znak3 = String.valueOf(znak2);
                znaky = znaky + znak3;
            } else {
                char znak2 = oppositeCase.charAt(i);
                String znak3 = String.valueOf(znak2);
                znak3 = znak3.toUpperCase();
                znaky = znaky+znak3;
            }
        }
        System.out.println(znaky);

      //  //4.ukol
      //  String words = "AHojda, zdravi vas jirka.";
      //  int slova = 0;
      //  for (int i = 0; i < words.length(); i++) {
      //      if (words.charAt(i) == ' ' || word.charAt(i) == '.') {
      //          slova +=1;
      //      }
      //  }
      //  System.out.println(slova);

        //5.ukol
        String[] names = {"Jan", "Kaja", "Franta Dlouhojmenny", "Pablo Diego José Francisco de Paula Juan Nepomuceno María de los Remedios Cipriano de la Sanơsima Trinidad Ruiz y Picasso", "Eva"};
        int delka = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > names[delka].length()) {
                delka = i;
            }
        }
        System.out.println(names[delka]);

        //6.ukol
        String number = "4200";
        String znak = "";
        for (int i = 0; i < number.length(); i++) {
            znak = number.charAt(i)+znak;
        }
        System.out.println(znak);

        //7.ukol
        String name = "gay";
        System.out.println("Zadej typ souboru");
        String type = sc.nextLine();
        System.out.println(name +"."+ type);
    }
}