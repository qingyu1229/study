package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/**
 * Created by liangqingyu on 2014/12/6.
 */
public class base {


    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://news.xinhuanet.com/legal/2014-12/06/c_127282822.htm").get();
            Element element = doc.body();
            /**
             * <div id="center">
             <div class="c_left">
             <div class="main_tit">
             <h1 id="title">
             二代身份证有"先天缺陷":挂失后仍可买车办信用卡
             </h1>
             <div class="info">
             <span id="pubtime">
             2014年12月06日 20:25:38
             </span>

             */
            //根据ID获取节点内容
            Element timeElement = element.getElementById("pubtime");
            //获取包含class属性的所有Element
            Elements classElements = element.getElementsByAttribute("class");
            //获取所有包含有属性以typ开头的Element
            Elements typElements = element.getElementsByAttributeStarting("typ");
            //获取class属性等于info的所有Element
            Elements AVelements = element.getElementsByAttributeValue("class", "info");
            //获取class属性包含info的所有Element
            Elements VCElement = element.getElementsByAttributeValueContaining("class", "info");
            //获取所有class属性以fo结束的Element
            Elements AVEElement = element.getElementsByAttributeValueEnding("class", "fo");
            //获取所有id属性值满足正则表达式gd_(.*)的Element
            Pattern pattern = Pattern.compile("gd_(.*)");
            Elements AVMElements = element.getElementsByAttributeValueMatching("id", pattern);
            //同上
            Elements AVM2Element = element.getElementsByAttributeValueMatching("id", "gd_(.*)");
            //获取所有id属性值不等于info的Element
            Elements AVNElement = element.getElementsByAttributeValueNot("id", "info");
            //获取所有id属性值以gd_开头的Element
            Elements AVSElement = element.getElementsByAttributeValueStarting("id", "gd_");
            //获取所有Class等于info的Element
            Elements CElement = element.getElementsByClass("info");
            //获取序列值等于1的Element
            element.getElementsByIndexEquals(1);
            //获取序列值大于2的Element
            element.getElementsByIndexGreaterThan(2);
            //获取序列值小于3的Element
            element.getElementsByIndexLessThan(3);
            //获取所有A标签
            element.getElementsByTag("a");
            //获取所有文字包含“我有话说”的Element
            element.getElementsContainingOwnText("我有话说");
            //获取包含的文字是
            element.getElementsContainingText("我有话说");
            Pattern p = Pattern.compile("");
            //获取所有文字内容中有符合某个正则表达式的Element
            element.getElementsMatchingOwnText(pattern);
            //同上
            element.getElementsMatchingOwnText("");
            //获取文字内容符合正则表达式的Element
            element.getElementsMatchingText(pattern);
            //同上
            element.getElementsMatchingText("");

            String cssQuery="";
            element.select(cssQuery);


            System.out.println(CElement);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
