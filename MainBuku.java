import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> listBuku = new ArrayList<>();

        try {
            System.out.print("Masukkan id: ");
            String id = input.nextLine();

            System.out.print("Masukkan judul: ");
            String judul = input.nextLine();

            System.out.print("Masukkan tahun terbit: ");
            int tahun = input.nextInt();

            Buku buku = new Buku(id, judul, tahun);
            listBuku.add(buku);

            for (Buku b : listBuku) {
                System.out.println("\nID: " + b.getId());
                System.out.println("Judul: " + b.getJudul());
                System.out.println("Tahun: " + b.getTahunTerbit());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Inputan tahun harus angka!!");
        }
    }
}
