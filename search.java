import java.util.Scanner;
class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the sizee of array");
        n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the elemnt to search in an array");
        int k;
        k=sc.nextInt();
        for(int j=0;j<n;j++){
            if(array[j]==k){
                System.out.println("the elemnt is found in array at position "+j);
            }
            else{
                System.out.println("the elemnt is not found ");
            }
        }
    }
}
