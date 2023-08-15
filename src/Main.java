import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, kmUcret = 0.10, yas12Indirimi = 0.50, yas24Indirimi = 0.10, yas65Indirimi = 0.30, gidisDonus = 0.20, araTutar, Total;
        int yas, yolculukTipi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km türünden giriniz : ");
        km = input.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Lütfen Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if (km > 0){
            if (yas > 0){
                if ((yolculukTipi == 1) || (yolculukTipi == 2)){
                    if (yas < 12){
                        araTutar = (kmUcret * km) * (1 - yas12Indirimi) ;
                        if (yolculukTipi == 2){
                            Total = (araTutar * (1 - gidisDonus)) * 2;
                            System.out.println(Total);
                        } else {
                            Total = araTutar;
                            System.out.println(Total);
                        }
                    }
                    else if (yas >= 12 && yas <= 24){
                        araTutar = (kmUcret * km) * (1 - yas24Indirimi) ;
                        if (yolculukTipi == 2){
                            Total = (araTutar * (1 - gidisDonus)) * 2;
                            System.out.println(Total);
                        } else {
                            Total = araTutar;
                            System.out.println(Total);
                        }
                    }
                    else if (yas >= 65){
                        araTutar = (kmUcret * km) * (1 - yas65Indirimi) ;
                        if (yolculukTipi == 2){
                            Total = (araTutar * (1 - gidisDonus)) * 2;
                            System.out.println(Total);
                        } else {
                            Total = araTutar;
                            System.out.println(Total);
                        }
                    } else {
                        araTutar = kmUcret * km;
                        if (yolculukTipi == 2){
                            Total = (araTutar * (1 - gidisDonus)) * 2;
                            System.out.println(Total);
                        } else {
                            Total = araTutar;
                            System.out.println(Total);
                        }
                    }
                }
            }
        }
    }
}