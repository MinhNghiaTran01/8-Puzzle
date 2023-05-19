package view;
import java.util.*;

public class IDAStar {
    
    int SIZE = 3;
    // Hàm tính h(n), hàm heuristic
    private static int heuristic(int[] state) {
        int manhattanDistance = 0;
        int SIZE = 3;
        for(int i=0;i<SIZE*SIZE;i++){
            if(state[i]!=0){
                int row = i/SIZE;
                int col = i%SIZE;
                int targetRow = (state[i]-1)/SIZE;
                int targetCol = (state[i]-1)%SIZE;
                manhattanDistance+= Math.abs(row - targetRow) + Math.abs(col - targetCol);
            }
        }
        int linerConfict = 0;
        // xet linerConfict tren hang
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE-1;j++){
                for(int k=1;k<SIZE-j;k++){
                    // hang cua state hien tai trong trang thai dich 
                    int rowState1 = (state[i*SIZE+j]-1)/SIZE;
                    int rowState2 = (state[i*SIZE+j+k]-1)/SIZE;
                    if(state[i*SIZE+j+k]>0&&state[i*SIZE+j]>state[i*SIZE+j+k]&&rowState1==rowState2
                        &&i==rowState1) linerConfict+=2;
                }
            }
        }
        // xet linerConfict tren cot
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE-1;j++){
                for(int k=1;k<SIZE-j;k++){
                    // cot cua state hien tai trong trang thai dich
                    int colState1 = (state[j*SIZE+i]-1)%SIZE;
                    int colState2 = (state[(j+k)*SIZE+i]-1)%SIZE;
                    if(state[(j+k)*SIZE+i]>0&&state[j*SIZE+i]>state[(j+k)*SIZE+i]&&colState1==colState2
                        &&j==colState1) {
                        
                        linerConfict+=2;
                    }
                }
            }
        }
        return  ( manhattanDistance + linerConfict);
    }

    public ArrayList<model> idaStar(model puzzle) {
        
        // neu trang thai hien tai win thi return ve list rong
        if (puzzle.checkWin()) {
            return new ArrayList<>();
        }
        
        // dua ve trang thai hien tai ve mang 1 chieu de tinh heuritics
        int [] state = new int[SIZE*SIZE];
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                state[i*SIZE+j] = puzzle.board[i][j];
            }
        }
        
        long t1 = System.nanoTime();
        // khoi tao nguong
        int bound = heuristic(state);
        
        // dung de luu cac trang thai model duyet
        ArrayList<model> path = new ArrayList<>();
        
        // dung de luu duong di da duoc duyet
        ArrayList<String> savestate = new ArrayList<>();
        
        // them trang thai va duong di hien tai
        path.add(puzzle);
        savestate.add(puzzle.transfer());
        
        // khoi tao stack luu cac huong da di chuyen 
        Stack<int[]> dirs = new Stack<>();
        
        // su dung vong lap de duyet lai khi tat ca duong di deu vuot qua bound
        while (true) {
            int rem = search(savestate,path, 0, bound, dirs);
            if (rem == 1) {
                double tDelta = (System.nanoTime() - t1) / 1e9;
                System.out.printf("Took %.2f seconds to find a solution of %d moves\n", tDelta, path.size() - 1);
                return path;
            } else if (rem == Integer.MAX_VALUE) {
                return null;
            }
            // cap nhat lai nguong
            bound = rem;
        }
    }

    private int search(ArrayList<String> savestate,ArrayList<model> path, int g, int bound, Stack<int[]> dirs) {
        model cur = path.get(path.size() - 1);
        int [] state= new int[SIZE*SIZE];
        
        // dua mang 2 chieu ve mang 1 chieu de tinh ham heuritics
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                state[i*SIZE+j] = cur.board[i][j];
            }
        }
        
        // so buoc uoc tinh den dich
        int f = g + heuristic(state);
        
        // neu vuot nguong thi return ve f
        if (f > bound) {
            return f;
        }
        // kiem tra xem trang thai hien tai co phai la dich hay khong
        if (cur.checkWin()) {
            return 1;
        }
        
        int min = Integer.MAX_VALUE;
        
        // xet cac huong di cho trang thai hien tai
        for (int[] dir : cur.getDIRECTIONS()) {
            // neu di tro ve trang thai truoc no thi khong xet 
            if (!dirs.isEmpty() && dir[0] == -dirs.peek()[0] && dir[1] == -dirs.peek()[1]) {
                continue;
            }
            
            // sao chep trang thai hien tai
            model simmodel = cur.simulateMove();
            
            // kiem tra xem no di chuyen duoc den trang thai tiep theo hay khong
            boolean moveNextState = simmodel.move(dir);
            
            // duong di trang thai tiep theo dang String
            String strDuongdi = simmodel.transfer();
            
            // neu trang thai hien tai khong di chuyen duoc hoac no da duoc duyet tu truoc thi 
            // cotinue
            if ( !moveNextState|| savestate.contains(strDuongdi) ) continue;
            
            // them trang thai moi
            path.add(simmodel);
            
            //them duong di chuyen hien tai  (UP, DOWN , LEFT, RIGHT)
            dirs.add(dir);
            // luu trang thai da duoc duyet
            savestate.add(strDuongdi);
            
            // tim kiem tiep tu trang thai moi
            int t = search(savestate,path, g + 1, bound, dirs);
            
            if (t == 1) {
                return 1;
            }
            if (t < min) {
                min = t;
            }
            
            // xoa trang thai moi khi da duyet xong
            path.remove(path.size() - 1);
            dirs.pop();
            savestate.remove(savestate.size() - 1);
        }

        return min;
    }

}
