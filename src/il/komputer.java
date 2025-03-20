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
public class komputer extends barang{
    int stok;
    String id, nama, tanggal;
    public komputer(int stok, String id, String nama, String tanggal) {
        super(stok, id, nama, tanggal);
        this.id = Id_Barang;
        this.nama = nama;
        this.tanggal = tanggal;
        this.stok = stok;
    }
    
}
