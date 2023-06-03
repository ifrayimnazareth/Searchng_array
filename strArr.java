import java.util.Scanner;

public class strArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        String val;
        Boolean log;

        System.out.print("    Searching Array\n-----------------------\nMasukkan total array\t: ");
        n = inp.nextInt();

        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan Array\t: ");
            arr[i] = inp.next(); 
        }

        System.out.print("\n    Pencarian\n-----------------------\nKetik value yg ingin dicari\t: ");
        val = inp.next();
        log = false;
        for(int i = 0; i < n; i++){
            if(val.equalsIgnoreCase(arr[i])){
                System.out.println("Data ditemukan\nPosisi data array\t: " + i);
                log = true;
                break;
            }
        }
        if(! log){
            System.out.println("Not Found");
        }
        
        // System.out.println("\n    Hasil Output\n-----------------------");
        // for(int i = 0; i < n; i++){
        //     System.out.print(arr[i] + "\t");
        // }
    }
}
