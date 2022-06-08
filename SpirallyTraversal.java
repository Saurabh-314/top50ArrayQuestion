class Solution {
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        
         int x, y, round =1;
       int left=0, right=c-1, top=0, deep=r-1;
       ArrayList<Integer> alSpiralMatrix = new ArrayList<Integer>();
   
       while( left<=right && top<=deep ){
           switch(round%5){
               case 1:
                   for(x=left, y=top; x<=right; x++) alSpiralMatrix.add(matrix[y][x]);
                   top++; break;
               case 2:
                   for(x=right, y=top; y<=deep; y++) alSpiralMatrix.add(matrix[y][x]);
                   right--; break;
               case 3:
                   for(x=right, y=deep; x>=left; x--) alSpiralMatrix.add(matrix[y][x]);
                   deep--; break;
               case 4:
                   for(x=left, y=deep; y>=top; y--) alSpiralMatrix.add(matrix[y][x]);
                   left++; break;
           }
           round++;
       }
       
       return alSpiralMatrix;
       
    }
}