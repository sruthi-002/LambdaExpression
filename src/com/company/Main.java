package com.company;
import java.util.Scanner;
import com.company.pojo.Sorting;
public class Main {
    public static void main(String[] args) {
        Sorting s= () -> {
            int n,i,j,temp;
            int a[] = new int [20];
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            for(i=0;i<n;i++)
            {
                a[i] = in.nextInt();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i]<a[j])
                    {
                        temp = a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            for(i=0;i<n;i++)
                System.out.println(a[i]);
        };
        s.sort();
    }
}
