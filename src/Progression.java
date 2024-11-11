public class Progression {
    private int x;
    private int d;

    public Progression(int x, int d){
        this.x=x;
        this.d=d;

    }

    public Progression(){
        this.x=-3;
        this.d=2;

    }

    public int getElement(int k){
        int i=0,y=x;
        while(i!=k){
            y=y+d;
            i++;
        }
        return y;
    }

    public void showProg(int n){
        int y=x;
        for(int i=0;i<n-1;i++){
            System.out.print(y+",");
            y+=d;
        }
        System.out.println(y);
    }
    public void showProg(){
        showProg(10);
    }

    public void showProgUpTo(int n) {
        int y = x;
        if (y > n) {
            System.out.println("n is smaller than the first digit in the array.");

        }
        while(n-1>y){
            System.out.print(y + ",");
            y += d;
        }

            System.out.println(y);

    }

    public int sum(int n){
        int s=0,y=x;

        for(int i=0;i<n;i++) {

            s += y;
            y +=d;

        }
        return s;
    }
}
