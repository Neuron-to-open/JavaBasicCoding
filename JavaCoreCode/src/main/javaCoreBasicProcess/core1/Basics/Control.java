package core1.Basics;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("请输入数字哦");
        int data1 = scanner.nextInt() ;
        int data2 = scanner.nextInt() ;
        int data3 = scanner.nextInt() ;
        /*
        * if-else
        * if-else-else
        * switch
        * */
        if (data1 == data2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        switch (data3){
            case 1:
                System.out.println("鹅鹅鹅");
                break ;
            case 2:
                System.out.println("曲项向天歌");
                break ;
            case 3:
                System.out.println("白毛浮绿水");
                break ;
            case 4:
                System.out.println("红掌拨清波");
                break ;
            case 5:
                System.out.println("下面没有了");
                break ;
            default:
                System.out.println("None");
                break ;
        }

    }
}
