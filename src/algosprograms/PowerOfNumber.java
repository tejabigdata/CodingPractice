package algosprograms;

/**
 * Created by pnall on 1/27/17.
 */
public class PowerOfNumber {

    public static void main(String[] args){

        System.out.println(powerOf(2,1));

    }

    public static double powerOf(double x, int m){

        if(x==0)
            return 0;
        if(m==0)
            return 1;
        double temp = x;
        temp = powerOf(x,m/2);
        if(m%2==0){
            return temp*temp;
        }
        else{

            if(m>0){
                return temp*temp*x;
            }
            else{
                return temp*temp/x;
            }
        }
    }





}
