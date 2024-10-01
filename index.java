import java.util.Scanner;
public class index{
        public static void main(String[] args) {
            int pilih, pilihLauk, jumlahMakanan, punyaKartu;
            double total, totalDiskon, harga, hargaAkhir;
            harga = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("===Warung Sederhana=== \n");
            System.out.println("1. Sate \n - Ayam = 1.500/tusuk \n - Kambing = 3.000/tusuk");
            System.out.println("\n 2. Pecel \n - Lauk ayam = 13.000/porsi \n - Lauk empal = 15.000/porsi");
            System.out.println("\n 3. Penyetan \n - Lauk tahu/tempe = 5.000/porsi \n - Lauk telur = 7.000/porsi \n - Lauk ayam = 10.000/porsi");

            System.out.print("Silahkan pilih menu :  ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("\n 1. Sate Ayam = 1.500/tusuk \n 2. Sate Kambing = 3.000/tusuk \n Ingin yang mana ? = "); pilihLauk = sc.nextInt();
                    if(pilihLauk == 1){
                        harga = 1500;
                    }

                    else if(pilihLauk == 2){
                        harga = 3000;
                    }
                    
                    else{
                        System.out.println("Maaf, terjadi kesalahan");
                    }
                    break;
                
                case 2:
                    System.out.print("\n 1. Lauk Ayam = 13.000/porsi \n 2. Lauk Empal = 15.000/tusuk \n Ingin yang mana ? = "); pilihLauk = sc.nextInt();
                    if(pilihLauk == 1){
                        harga = 13000;
                    }

                    else if(pilihLauk == 2){
                        harga = 15000;
                    }
                    
                    else{
                        System.out.println("Maaf, terjadi kesalahan");
                    }
                    break;
                
                case 3:
                    System.out.print("\n 1. Lauk tahu/tempe = 5.000/porsi \n 2. Lauk telur = 7.000/tusuk \n 3. Lauk ayam = 10.000/porsi \n Ingin yang mana ? = "); pilihLauk = sc.nextInt();
                    switch (pilihLauk) {
                        case 1:
                            harga = 5000;
                            break;

                        case 2:
                            harga = 7000;
                            break;

                        case 3:
                            harga = 10000;
                            break;

                    default:
                        System.out.println("Maaf, lauk tidak tersedia");
                        
                    }
                    break; 
            } 

            System.out.print("Ingin beli berapa banyak? : "); jumlahMakanan = sc.nextInt();
            total = harga * jumlahMakanan;

            System.out.print("\n Apakah anda memiliki kartu member? \n 1. Ya \n 2. Tidak \n = "); punyaKartu = sc.nextInt();
            if(punyaKartu == 1){
                System.out.println("\n Yey! anda mendapatkan diskon 5%");
                totalDiskon = total * 0.05;
                System.out.println("Total diskon : " + totalDiskon);

                hargaAkhir = total - totalDiskon;
                System.out.println("\n Harga akhir anda adalah " + hargaAkhir);
                System.out.println("!!==Terimakasih, datang lagi ya==!!");
            } 

            else if(punyaKartu == 2){
                System.out.println("\n Harga totalnya adalah : " + total);
                System.out.println("!!==Terimakasih, datang lagi ya==!!");
            }
                        
            else{
                System.out.println("Maaf, terjadi kesalahan");
            }
        }
    }
