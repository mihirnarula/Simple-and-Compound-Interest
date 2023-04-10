package simple;

public class Simple {

    public static void sim(){
        String str = "S I M P L E";
        
        for(int i = 1; i < 12; i=i+2){
            System.out.println(str.substring(0,i));
        }
        
        for(int j = 10; j > 1; j=j-2){
            System.out.println(str.substring(0,j));
        }
        
    }
    
    
    public static void main(String[] args) {

        Simple ob = new Simple();
        ob.sim();
        
    }
    
}
