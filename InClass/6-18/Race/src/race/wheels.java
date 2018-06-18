package race;

public class wheels {

    public int size;
    
    public wheels ( int size){
        this.size = size;
    }
   
            
    public int getFactor(){
        int factor = this.size/20;
        return factor;
    }
    
}
