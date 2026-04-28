public class Permutation {
    public static void permutation(String str,String ans){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"==> want to delete 'c' =>"ab"+"de"
            String newString=str.substring(0,i)+str.substring(i+1);
            permutation(newString, ans+curr);
        }
    }
    public static void main(String args[]){
        String str="abc";
        permutation(str, "");
    }
}
