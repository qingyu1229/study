package pattern.adapter;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class Test {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer =new NewPlayer("test.avi","avi");
        mediaPlayer.play();
    }

}
