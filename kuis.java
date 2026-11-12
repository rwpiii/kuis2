import java.util.Scanner;

public class kuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nim2 = 79;
        int batas = (nim2 % 3) + 2;

        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int lamaParkirTerlama = 0;
        int kendaraanLebihDari3Jam = 0;
        int invalidBeruntun = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();

        while (jam != 0) {
            if (jam < 1 || jam > 24) {
                System.out.println("Input tidak valid");
                invalidBeruntun++;

                if (invalidBeruntun >= batas) {
                    System.out.println("Batas input tidak valid berturut-turut tercapai. Program dihentikan.");
                    break;
                }
            } else {
                invalidBeruntun = 0;

                int biaya = 5000 + (jam - 1) * 3000;
                total += biaya;
                jumlahKendaraan++;

                if (jam > lamaParkirTerlama) {
                    lamaParkirTerlama = jam;
                }

                if (jam > 3) {
                    kendaraanLebihDari3Jam++;
                }

                System.out.println("Biaya parkir: Rp " + biaya);
            }

            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Parkir terlama   : " + lamaParkirTerlama + " jam");
        System.out.println("Lebih dari 3 jam : " + kendaraanLebihDari3Jam);

        sc.close();
    }
}