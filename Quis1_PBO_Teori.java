import java.util.Scanner;

class Quis1_PBO_Teori{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int biayabeban = 0;
		String nama;
		int tipe, bayar, totalharga, kembalian, jummeteran;
		boolean loop = true;
		
			
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
		System.out.println("Tipe Rumah 31  =  Rp. 100.000");
		System.out.println("Tipe Rumah 32  =  Rp. 125.000");
		System.out.println("Tipe Rumah 33  =  Rp. 450.000");
		System.out.println("Tipe Rumah 34  =  Rp. 480.000");
		System.out.println("Tipe Rumah 35  =  Rp. 500.000");
		System.out.println("Tipe Rumah 40  =  Rp. 550.000");
		
		while(loop){
		System.out.print("Masukkan Tipe Rumah Anda (31 / 32 / 33 / 34 / 35 / 40) = ");
		tipe = input.nextInt();

		
	
		 switch(tipe){
            case 31 :
                biayabeban = 100000;
                System.out.println("Biaya beban : "+biayabeban);
                
                loop = false;
                break;
            case 32 :
               biayabeban = 125000;
                 System.out.println("Biaya beban :" +biayabeban);
                 
                loop= false;
                break;
            case 33 :
               biayabeban = 450000;
                 System.out.println("Biaya beban : " +biayabeban);
                 
                loop = false;
                break;
            case 34 :
               biayabeban = 480000;
                 System.out.println("Biaya beban : " +biayabeban);
                 
                loop= false;
                break;
            case 35 :
               biayabeban = 500000;
                 System.out.println("Biaya beban : " +biayabeban);
                 
                loop= false;
                break;
            case 40 :
               biayabeban = 550000;
                 System.out.println("Biaya beban : " +biayabeban);
                 
                loop= false;
                break;
                
            
               default :
                System.out.println("Tidak Ada Pilihan");    
                
        }
        
	  
	}
	
    	System.out.print("Masukkan Jumlah Meteran Pemakaian Anda : ");
		jummeteran = input.nextInt();
		
		totalharga = jummeteran * biayabeban;
		
	    System.out.print("Masukkan Jumlah Uang Anda : ");
		bayar = input.nextInt();
		
		kembalian = bayar - totalharga;
		
	   System.out.println("Nama Anda      : "+nama );
	   System.out.println("Total Harga    : "+totalharga);
	   System.out.println("Pembayaran     : "+bayar);
	   System.out.println("Kembalian      : "+kembalian);  
	    	
		
				
	}
}