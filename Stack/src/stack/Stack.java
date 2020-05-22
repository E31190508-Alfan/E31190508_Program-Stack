package stack;
import java.util.Scanner;
/*Author Alf*/
public class Stack {
    //membuat variabel
    int stack[]; //inisialisasi int stack
    int index; //inisialisasi int index
    //Memesan Panjang Stack
    public Stack(int a){
        stack = new int [a];
}
    
    //Menghitung Panjang Stack
    public void Count(){ //membuat method
        int hasil = stack.length;
        System.out.println("Jumlah Stak \t:\t"+hasil);
}
    
    //Mengisi Nilai dalam Stack
    public void push(int isi){ //membuat method
        stack[index] = isi;
        index++;
}
    
    //Untuk Melihat Elemen Paling Atas
    public void Peek(){ //membuat method
        int hasil = 0;
        hasil+=stack.length-1;
        System.out.println("Peek Stack Adalah\t:\t"+stack[hasil]);
}
    
    public void Print(){ //membuat method
        for(int i = stack.length-1 ;i>=0 ; i--){
            System.out.println(stack[i]);
    }
}
    
    public void pop(int angka){ //membuat method
        for(int i = 0; i<stack.length ; i++){
            if(stack[i]==angka){
                stack[i]=0;
        }
    }
}
    
    public static void main(String[]args){ //untuk menentukan mainnya
        Scanner ir = new Scanner(System.in);
        System.out.print("Masukan Batas \t:\t");
        int batas = ir.nextInt();
        Stack irin = new Stack(batas);
        for(int i = 0; i<batas ; i++){
            System.out.print("Masukan Isi "+(i+1)+"\t:\t");
            int isi = ir.nextInt();
            irin.push(isi);
}
        
        System.out.print("______________________________________\n");
        irin.Count();
        System.out.print("______________________________________\n");
        irin.Print();
        System.out.print("______________________________________\n");
        irin.Peek();
        System.out.print("______________________________________\n");
        System.out.print("Berapa Kali Anda Melakukan POP\t:\t");
        int bts = ir.nextInt();
        int angka;
        for(int i = 1 ; i<=bts ; i++){
            System.out.print("Masukan Angka POP\t:\t");
            angka = ir.nextInt();
            irin.pop(angka);
            System.out.print("______________________________________\n");
}
        
        irin.Print();
    }
}