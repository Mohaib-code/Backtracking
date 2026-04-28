public class subSetString {
public static void subSet(String str,String n,int i){
    //base case
    if (i==str.length()){
        if(n.length()==0){
            System.out.println("null");
        }
        else{
               System.out.println(n);
        }
     
        return;
    }
    //if YES
    subSet(str, n+str.charAt(i), i+1);
    //if NO
    subSet(str, n, i+1);
}

    public static void main(String args[]){
        String str="abc";
        subSet(str, "", 0);


    }
}
