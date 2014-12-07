package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class MediaAdapter implements MediaPlayer {
    private String filename;
    private  String mediaType;
    private VideoPlayer videoPlayer;

    public MediaAdapter(String filename,String mediaType){
        this.filename=filename;
        this.mediaType=mediaType;
    }

    @Override
    public void play() {
        if("mp4".equalsIgnoreCase(mediaType)){
            videoPlayer=new Mp4Player(filename);
        }else if("avi".equalsIgnoreCase(mediaType)){
            videoPlayer=new AviPlayer(filename);
        }
        videoPlayer.play();
    }
}
