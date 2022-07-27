/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebobekok;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class EbobEkok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("n1 sayisini giriniz:");
        int n1=input.nextInt();
        
        System.out.print("n2 sayisini giriniz:");
        int n2=input.nextInt();
        
        int kucukSayi;
        int ebob;
        
        if(n1<=n2){
            kucukSayi=n1;
        }else{
            kucukSayi=n2;
        }
        
        int i=kucukSayi;
        
        while(i>=1){
            if((n1%i==0)&&(n2%i==0)){
                ebob=i;
                System.out.println("Ebob:"+i);
                break;
            }else{
                i--;
            }
        }
        
        int j=kucukSayi;
        int ekok;
        
        while(j<=n1*n2){
            if(j%n1==0&&j%n2==0){
                ekok=j;
                System.out.println("Ekok:"+ekok);
                break;
            }else{
                j++;
            }
        }
    }
    
}
