import java.util.Scanner;
public class Siakad27modifikasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis (20%): ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nila tugas (15%): ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS (30%): ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS (35%): ");
        nilaiUas = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
