
import java.util.*;

public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input daftar angka
        System.out.print("Masukkan daftar angka (pisahkan dengan spasi): ");
        String[] angkaStr = input.nextLine().split(" ");
        int[] angka = new int[angkaStr.length];
        for (int i = 0; i < angkaStr.length; i++) {
            angka[i] = Integer.parseInt(angkaStr[i]);
        }

        // Membuat Set dari array untuk menghapus duplikat
        Set<Integer> setAngka = new HashSet<>();
        for (int i = 0; i < angka.length; i++) {
            setAngka.add(angka[i]);
        }

        // Memeriksa apakah ada duplikat
        boolean isDuplikat = angka.length != setAngka.size();

        if (isDuplikat) {
            // Jika ada duplikat, menampilkan daftar angka yang sama beserta jumlahnya
            System.out.println("Daftar angka yang sama beserta jumlahnya:");
            Map<Integer, Integer> mapAngka = new HashMap<>();
            for (int i = 0; i < angka.length; i++) {
                if (mapAngka.containsKey(angka[i])) {
                    mapAngka.put(angka[i], mapAngka.get(angka[i])+1);
                } else {
                    mapAngka.put(angka[i], 1);
                }
            }
            for (int i : mapAngka.keySet()) {
                int jumlah = mapAngka.get(i);
                if (jumlah > 1) {
                    System.out.println(i +" ada "+ jumlah );
                }
            }

            System.out.println("True");
        } else {
            System.out.println(" False");
        }
    }
}
