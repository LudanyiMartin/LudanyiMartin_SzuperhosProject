package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String type = parts[0];
                int count = Integer.parseInt(parts[1]);

                Szuperhos szuperhos;
                if (type.equals("Batman")) {
                    szuperhos = new Batman();
                } else if (type.equals("Vasember")) {
                    szuperhos = new Vasember();
                } else {
                    break;
                }

                for (int i = 0; i < count; i++) {
                    if (szuperhos instanceof Batman) {
                        ((Batman) szuperhos).kutyutKeszit();
                    } else if (szuperhos instanceof Vasember) {
                        ((Vasember) szuperhos).kutyutKeszit();
                    }
                }
                szuperhosLista.add(szuperhos);
            }
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }

    public static void main(String[] args) {
        try {
            szereplok("szuperhosok.txt");
        } catch (IOException e) {
            System.out.println("Hiba a fájl beolvasásakor: " + e.getMessage());
        }

        szuperhosok();
    }
}
