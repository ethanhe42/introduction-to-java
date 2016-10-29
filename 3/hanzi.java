import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hanzi {
	public static void main(String[] args) {
		Pattern p_str = Pattern.compile("[\\u4e00-\\u9fa5]+");
		String str = "×Ö·û´®£º¤ä¤á¤Æmiººcmiu.co¹þ¹þ^&*()_+{";
		System.out.println(str);
		String hanzi = "";
		String zifu = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s = ch + "";
			  Matcher m = p_str.matcher(s);
			  if(m.find()&&m.group(0).equals(s)){
					hanzi += ch;
			  }else
				zifu += ch;
		}
		System.out.println("ºº×Ö£º");
		System.out.println(hanzi);
		System.out.println("³ýÁËºº×ÖÍâµÄ×Ö·û£º");
		System.out.println(zifu);
	}
}
