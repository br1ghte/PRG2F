package strings;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //string input
        //string password
        //ověř, že uživatel zadal správné heslo

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej heslo:");
        String input = sc.nextLine();
        String psswd = "secret";
        if (input.equals(psswd)){
            System.out.println("They're same");
        }
        //promenna rc - rodne cislo
        //over, zda je spravne napsano
        //over, zda se jedna o muze nebo zenu
        String rc = "015911/1234";
        //kontrola lomítka
        if (rc.charAt(6) == '/'){
            //delka 11 znaků
            System.out.println("Lomítko OK");
            //delka 11 znaku
            if (rc.length() == 11){
                System.out.println("delka rc OK");
                if (rc.charAt(2) == '5' || rc.charAt(2) == '6'){
                    System.out.println("Jedná se o ženu");
                } else{
                    System.out.println("Jedná se o muže");
                }
            }
        }

        //prochazi hesla
        //urci, zda uzivatel heslo uhodl (alespon jedno)
        String[] passwords = {"alkohol", "sobota", "klíč","strom"};
        System.out.println("Zadej heslo");
        input = sc.nextLine();
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i].equals(input)){
                System.out.println("Uhadl jste heslo");
                break;
            }
        }

        //pole jmen
        String[] names = {"Adam Klíma","Venca Matoušek", "Jana Nová", "Jan Boháč", "Jan Fehér"};
        //vypiš z pole všechny Honzy
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("Jan ")){
                System.out.println(names[i]);
            }
        }

    }
}

