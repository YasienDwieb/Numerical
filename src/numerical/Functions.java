package numerical;

/**
 *
 * @author Yasien
 */
public class Functions {
    public double x;
    public double y;
    public Functions(double x){
        this.x=x;
        y = 3 *x;
    }

    
    public double cos(double mo3amel,int power,double additional){
        return Math.cos(mo3amel*Math.pow(x,power)+additional);
    }
    
    public double sin(double mo3amel,int power,double additional){
        return Math.sin(mo3amel*Math.pow(x,power)+additional);
    }
}
