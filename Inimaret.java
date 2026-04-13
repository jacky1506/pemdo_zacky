import java.util.Scanner;
public class Inimaret {
    static String nama1="",nama2="",nama3="",nama4="",nama5="";
    static int qty1,qty2,qty3,qty4,qty5,harga1,harga2,harga3,harga4,harga5,jumlahItem;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("\n1. Entri Data Penjualan\n2. Print Struk\n0. Keluar");
            System.out.print("Pilihan : "); pilihan=sc.nextInt(); sc.nextLine();
            if(pilihan==1) entriDataPenjualan(sc);
            else if(pilihan==2) printStruk();
            else if(pilihan==0) System.out.println("Sampai jumpa!");
            else System.out.println("Pilihan tidak valid!");
        }while(pilihan!=0);
        sc.close();
    }
    static void entriDataPenjualan(Scanner sc){
        System.out.print("Jumlah barang (1-5): "); int n=sc.nextInt(); sc.nextLine();
        if(n<1) n=1; if(n>5) n=5;
        for(int i=0;i<n;i++){
            System.out.print("Nama   : "); String nama=sc.nextLine();
            System.out.print("Qty    : "); int qty=sc.nextInt();
            System.out.print("Harga  : "); int harga=sc.nextInt(); sc.nextLine();
            if(i==0){nama1=nama;qty1=qty;harga1=harga;}
            else if(i==1){nama2=nama;qty2=qty;harga2=harga;}
            else if(i==2){nama3=nama;qty3=qty;harga3=harga;}
            else if(i==3){nama4=nama;qty4=qty;harga4=harga;}
            else if(i==4){nama5=nama;qty5=qty;harga5=harga;}
            jumlahItem++;
        }
        System.out.println("Total item: "+jumlahItem);
    }
    static void printStruk(){
        if(jumlahItem==0){ System.out.println("Belum ada data penjualan."); return; }
        int total=0;
        if(jumlahItem>=1){int s=qty1*harga1; total+=s; System.out.println("1. "+nama1+" -> "+qty1+" x "+harga1+" = "+s);}        
        if(jumlahItem>=2){int s=qty2*harga2; total+=s; System.out.println("2. "+nama2+" -> "+qty2+" x "+harga2+" = "+s);}        
        if(jumlahItem>=3){int s=qty3*harga3; total+=s; System.out.println("3. "+nama3+" -> "+qty3+" x "+harga3+" = "+s);}        
        if(jumlahItem>=4){int s=qty4*harga4; total+=s; System.out.println("4. "+nama4+" -> "+qty4+" x "+harga4+" = "+s);}        
        if(jumlahItem>=5){int s=qty5*harga5; total+=s; System.out.println("5. "+nama5+" -> "+qty5+" x "+harga5+" = "+s);}        
        System.out.println("Total Belanja = "+total+" | Terima kasih telah berbelanja!");
    }
}