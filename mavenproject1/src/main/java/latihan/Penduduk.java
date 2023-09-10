/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
public class Penduduk {
 String nama, jeniskelamin, alamat;
    int umur;
    public void setNama (String nm)
    {
        nama = nm;
    }
    public void setJenisKelamin (String jk)
    {
        jeniskelamin = jk;
    }
    public void setAlamat (String almt) 
    {
        alamat = almt;
    }
    public void setUmur (int u ) 
    {
        umur = u;
    }
    public String getNama() 
    {
    return nama;
    }
    public String getJenisKelamin() 
    {
    return jeniskelamin;
    }
    public String getAlamat() 
    {
    return alamat;
    }
    public int getUmur() 
    {
    return umur;
    }
    
    public static void main (String[] args) {
    Penduduk pd = new Penduduk();
    pd.setNama("Fazan");
    pd.setJenisKelamin("Lakilaki");
    pd.setAlamat("katapang");
    pd.setUmur(28);
    
    System.out.println("Nama : " +pd.getNama());
    System.out.println("Jenis Kelamin : " +pd.getJenisKelamin());
    System.out.println("Alamat : " +pd.getAlamat());
    System.out.println("Umur : " +pd.getUmur());
    }
}



    