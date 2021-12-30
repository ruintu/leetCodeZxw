package suanfa.leetcode;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 22:19 2021/7/29
 * @Modifued By:
 */
public class saolei {

    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
    }

        static public char[][] updateBoard(char[][] board, int[] click) {



            return visit(board,click[0],click[1]);
        }

        static public char[][] visit(char[][] board, int x,int y){
            if(board[x][y] == 'M') {
                board[x][y] = 'X';
                return board;
            }
            int count = 0;
            for(int i =x-1;i<=x+1;i++)
                for(int j =y-1; j<= y+1;j++){
                    if(i>=0 && i < board.length && j>=0 && j<board[0].length)
                        if(board[i][j] == 'M')
                            count++;
                }
            if(count != 0 ) {
                board[x][y] = (char)(count+'0');
            }
            else {
                board[x][y] = 'B';
                for(int i =x-1;i<=x+1;i++)
                    for(int j =y-1; j<= y+1;j++){
                        if(i>=0 && i < board.length && j>=0 && j<board[0].length)
                            if(board[i][j] == 'E')
                                visit(board,i,j);
                    }

            }

            return board;
        }


}