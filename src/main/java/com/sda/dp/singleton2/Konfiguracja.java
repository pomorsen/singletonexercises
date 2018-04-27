package com.sda.dp.singleton2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ppomorsk on 26/04/2018.
 */
public class Konfiguracja {

    private int zakresLiczby1;
    private int zakresLiczby2;
    private int iloscZapytan;
    private List<Character> listaDostępnychDziałań = new ArrayList<>();
    private BufferedReader plikKonfiguracyjny;

    public Konfiguracja() {
    }

    public int getZakresLiczby1() {
        return zakresLiczby1;
    }

    public int getZakresLiczby2() {
        return zakresLiczby2;
    }

    public int getIloscZapytan() {
        return iloscZapytan;
    }

    public List<Character> getListaDostępnychDziałań() {
        return listaDostępnychDziałań;
    }

    public BufferedReader getPlikKonfiguracyjny() {
        return plikKonfiguracyjny;
    }

    public void wczytajKonfiguracje(){
        try {
            File file = new File("src/main/java/com/sda/dp/singleton2/settings.conf");
            System.out.println(file.getAbsolutePath());
            this.plikKonfiguracyjny = new BufferedReader(new FileReader(file));
            Scanner scanner = new Scanner(plikKonfiguracyjny);

            String linia = "";
            int indeksParametru = 0;
            String parametr = "";
            String wartoscParametru = "";

            while((linia = this.plikKonfiguracyjny.readLine()) != null) {

                indeksParametru = linia.indexOf("=");
                parametr = linia.substring(0, indeksParametru);
                wartoscParametru = linia.substring(indeksParametru + 1, linia.length()).trim();

                switch (parametr) {
                    case "zakres_liczby_1":
                        this.zakresLiczby1 = Integer.parseInt(wartoscParametru);
                        break;
                    case "zakres_liczby_2":
                        this.zakresLiczby2 = Integer.parseInt(wartoscParametru);
                        break;
                    case "dostepne_dzialania":
                        for (int i = 0; i < wartoscParametru.length(); i++) {
                            this.listaDostępnychDziałań.add(wartoscParametru.charAt(i));
                        }
                        break;
                    case "ilosc_rund":
                        this.iloscZapytan = Integer.parseInt(wartoscParametru);
                    default:
                        break;
                }
            }


            this.plikKonfiguracyjny.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
