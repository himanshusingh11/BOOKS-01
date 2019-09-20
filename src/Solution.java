import java.io.*;
import java.util.*;
class Book{
    private String c;
    private String a;
    private String i;
    public void setBookName(String c){
        this.c=c;
    }
    public void setAuthorName(String a){
        this.a=a;
    }
    public void setISBN(String i){
        this.i=i;
    }
    public String getBookName(){
        return c;
    }
    public String getAuthorName(){
        return a;
    }
    public String getISBN(){
        return i;
    }

    Book(String bookName,String authorName,String isbnNumber){
        c=bookName;
        a=authorName;
        i=isbnNumber;
    }
    @Override
    public String toString(){
        return "-----------------------------\n"+
                "Book Name:      "+getBookName()+"\nAuthor Name:    "+getAuthorName()+
                "\nISBN:   "+getISBN()+"\n-----------------------------";
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.next();
        Book[] b=new Book[n];
        if(n<1){
            System.out.println("N/A");
        }
        else
        {
            //sc.nextLine().trim();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String bookName=sc.nextLine();
                String authorName=sc.nextLine();
                String isbnNumber=sc.nextLine();
                b[i] =new Book(bookName,authorName,isbnNumber);
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}