package Kuis2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListKlasemen klasemen = new LinkedListKlasemen();

        // Daftar pembalap
        String[] namaPembalap = {
                "Maverick Vinales", "Lorenzo Savadori", "Fransesco Bagnaia",
                "Alex Marquez", "Marc Marquez", "Stefan Bradl",
                "Johann Zarco", "Fabio Quartaro", "Marco Bezzechi",
                "Franco Morbidelli", "Jorge Martin", "Pedro Acosta",
                "Dani Pedrosa", "Jack Miller", "Luca Marini",
                "Juan Mir", "Raul Fernandez", "Miguel Oliveira"
        };
        String[] timPembalap = {
                "Aprilia Racing", "Aprilia Racing", "Ducati Lenovo Team",
                "Gresini Racing MotoGP", "Gresini Racing MotoGP", "HRC Test Team",
                "LCR Honda", "Monster Energy Yamaha MotoGP", "Pertamina Enduro VR46",
                "Prima Pramac Racing", "Prima Pramac Racing", "Red Bull GASGAS",
                "Red Bull KTM Factory Racing", "Red Bull KTM Factory Racing", "Repsol Honda Team",
                "Repsol Honda Team", "Trackhouse Racing", "Trackhouse Racing"
        };
        String[] konstruktorPembalap = {
                "Aprilia", "Aprilia", "Ducati",
                "Ducati", "Ducati", "Honda",
                "Honda", "Yamaha", "Ducati",
                "Ducati", "Ducati", "KTM",
                "KTM", "KTM", "Honda",
                "Honda", "Aprilia", "Aprilia"
        };

        for (int i = 0; i < namaPembalap.length; i++) {
            klasemen.tambahPembalap(namaPembalap[i], timPembalap[i], konstruktorPembalap[i]);
        }

        Scanner scanner = new Scanner(System.in);

        for (int match = 0; match < 20; match++) {
            int[] availablePositions = new int[namaPembalap.length];
            for (int i = 0; i < namaPembalap.length; i++) {
                availablePositions[i] = i + 1;
            }
            shuffleArray(availablePositions);

            for (int i = 0; i < namaPembalap.length; i++) {
                int posisi = availablePositions[i];
                klasemen.updatePoin(namaPembalap[i], posisi, match);
            }

            System.out.println("Klasemen setelah pertandingan ke-" + (match + 1) + ":");
            klasemen.printKlasemen();

            System.out.println("=> Enter untuk lanjut, Ctrl + C untuk keluar");
            scanner.nextLine();
        }

        scanner.close();
    }

    static void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
