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
public class barang {
    int stok_barang;
    String Id_Barang, Nama_Barang, tanggal_masuk;
    barang(int stok, String id, String nama, String tanggal){
        this.stok_barang = stok;
        this.Id_Barang = id;
        this.Nama_Barang = nama;
        this.tanggal_masuk = tanggal;
    }
}
