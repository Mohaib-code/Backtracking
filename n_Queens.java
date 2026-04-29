public class n_Queens {
    static int count =0;
    //Queen isSafe
    public static boolean isSafe(char board[][],int row,int col){
        //Vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    // public static void board(char board[][],int row){
    //     //Base case
    //     if(row==board.length){
    //         printBoard(board);
    //         count ++;
    //         return;
    //     }
        
    //     //column loop
        
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board,row,j)){
    //         board[row][j]='Q';
    //         board(board, row+1);//recursion
    //         board[row][j]='.';//backtracking
    //     }
    //     }
      
    // }
     public static boolean board(char board[][],int row){
        //Base case
        if(row==board.length){
            printBoard(board);
            count ++;
            return true;
        }
        
        //column loop
        
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(board(board, row+1)){
            return true;
            }//recursion
            board[row][j]='.';//backtracking
        }
        }
        return false;
      
    }
    public static void printBoard(char board[][]){
        System.out.println("-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
      
    }
    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        //Initalize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
         

          if (board(board, 0)==true){
            System.out.println("solution exist");
          }
          else{
            System.out.println("No solution");
          }
          
          
    }
  
}
