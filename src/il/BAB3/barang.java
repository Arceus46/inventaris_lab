/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package il.BAB3;
import il.BAB2.inventaris_lab;
/**
 *
 * @author Shadow
 */
public class barang extends inventaris_lab {
    int stok_barang;
    String Id_Barang, Nama_Barang, tanggal_masuk;
    barang(int stok, String id, String nama, String tanggal){
        this.stok_barang = stok;
        this.Id_Barang = id;
        this.Nama_Barang = nama;
        this.tanggal_masuk = tanggal;
    }
}
