package jsoup;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import java.io.IOException;
import java.net.URL;

/**
 * Created by liangqingyu on 2014/12/7.
 */
public class Cleaner {

    public static void main(String[] args) {
        HtmlCleaner htmlCleaner=new HtmlCleaner();
        try {
            URL url=new URL("http://www.baidu.com");
            TagNode tagNode= htmlCleaner.clean(url);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
