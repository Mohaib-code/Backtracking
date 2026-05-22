public class rat_maze{
    public static void printSol(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean mazeSolve(int maze[][],int row,int col,int sol[][]){
        //Base Case
        if(row==maze.length-1&&col==maze.length-1){
            sol[row][col]=1;
            return true;
        }
        //Safe check
        if(row>=0 && col>=0 && row<maze.length && col<maze.length && 
        maze[row][col]==1){
            sol[row][col]=1;
            //Down
            if(mazeSolve(maze, row+1, col, sol)){
                return true;
            }
            //Right
            if(mazeSolve(maze, row, col+1, sol)){
                return true;
            }
            //Backtrack
            sol[row][col]=0;
        }
        return false;
    }
    public static void main (String args[]){
        int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int sol[][]=new int[4][4];
        if(mazeSolve(maze, 0, 0, sol)){
            System.out.println("Solution Exist");
            printSol(sol);
        }
        else{
            System.out.println("Solution not Exist");
        }

    }
}