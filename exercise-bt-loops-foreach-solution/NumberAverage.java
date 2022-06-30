package d1;

import java.util.Scanner;

public class NumberAverage {
    public int[] a=new int[20];
    public int n;
    public void findAverage(int[] a){
        boolean flag=true;
        int sum=0;
        for(int i:a){
            if(i<0){
                flag=false;
            }
            if(flag==false){
                System.out.println("Give proper positive integer values");
                break;
            }
        }
        if(flag==true) {
            for (int i : a) {
                sum += i;
            }
            int avg = sum / n;
            if (a == null) {
                System.err.println("Array is empty");
            } else {
                System.out.println("The average value is:" + avg);
            }
        }
    }
    public void getArrayValues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values:");
        n=sc.nextInt();
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        NumberAverage obj=new NumberAverage();
        obj.getArrayValues();
        obj.findAverage(obj.a);
    }
}
