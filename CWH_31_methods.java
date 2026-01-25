public class CWH_31_methods {
    static int logic(int x, int y){
        int z;
        if( x>y ){
            z = x+y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = logic(a,b);
        System.out.println(c);
    }
}
