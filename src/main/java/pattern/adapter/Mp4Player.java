package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class Mp4Player implements VideoPlayer{

    private String filename;
   public   Mp4Player(String filename){
        this.filename=filename;
    }

    @Override
    public void play() {
        System.out.println("Mp4:"+filename);
    }
}
