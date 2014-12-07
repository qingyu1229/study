package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class AviPlayer implements VideoPlayer{

    private String filename;
   public AviPlayer(String filename){
        this.filename=filename;
    }
    
    @Override
    public void play() {
        System.out.println("Avi:"+filename);
    }
}
