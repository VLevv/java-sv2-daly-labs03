package day04;

public class Prison {
    private boolean[] cells=new boolean[100];

    public void openFreeCells(){
        for(int i =1;i<=cells.length;++i){
            for (int j=1;j<=cells.length;++j){
                if(j%i==0){
                    cells[j-1]=!cells[j-1];
                }
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
