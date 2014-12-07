package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class NewPlayer   implements MediaPlayer{
    private String filename;
    private  String audioType;
    private MediaPlayer mediaPlayer;

    public NewPlayer(String filename,String audioType){
        this.filename=filename;
        this.audioType=audioType;
    }

    @Override
    public void play() {
        if ("mp3".equalsIgnoreCase(audioType)){
            mediaPlayer=new Mp3Player(filename);
        }else{
            mediaPlayer=new MediaAdapter(filename,audioType);
        }
        mediaPlayer.play();
    }
}
