/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package il;

/**
 *
 * @author Shadow
 */
public class MainKomputer {
    public static void main(String[] args) {
         komputer aio = new komputer(20, "B001", "Komputer AIO", "27 Februari 2025");
          System.out.println("ID Barang : " + aio.id);
        System.out.println("Nama Barang : " + aio.nama);
        System.out.println("Tanggal Masuk : " + aio.tanggal);
        System.out.println("Stok : " + aio.stok);
     }
}
