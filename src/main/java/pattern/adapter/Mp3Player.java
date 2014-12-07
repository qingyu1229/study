package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class Mp3Player implements MediaPlayer {
    private String filename;

    public Mp3Player(String filename){
        this.filename=filename;
    }
    @Override
    public void play() {
        System.out.println("Mp3:"+filename);
    }
}
