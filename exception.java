import java.util.*;
class excepn{
    int x,y,ans;
    int a[]=new int[2];
    String s;
    excepn(int x, int y, String s){
        a[0]=x;
        a[1]=y;
        this.s=s;
    }
    void exceptions(){
        try{
            ans=a[0]/a[5];
            ans=a[0]/0;
            // ans= Interger.parseInt(s);

        }
        catch(ArithmeticException e){
            System.out.println("Exception= "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception= " + e);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception= " + e);
        }
        finally{
            System.out.println(a[0]);
        }
    }
}



public class exception {
    public static void main(String[]args){
        excepn obj= new excepn(2,3,"1a");
        obj.exceptions();

    }
}
