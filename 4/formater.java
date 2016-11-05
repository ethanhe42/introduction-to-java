import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class strs implements Comparable<strs> {
	private String name;
	private Integer order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@Override
	public int compareTo(strs arg0) {
		return this.getOrder().compareTo(arg0.getOrder());
	}
}

public class formater {
	static BufferedReader in;
	static BufferedWriter out;
	
	
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(
				new FileReader(new File("D://javaworkspace1//HelloWorld//src//c.txt")));
		out = new BufferedWriter(new FileWriter(
				new File("D://javaworkspace1//HelloWorld//src//d.txt")));
		int i = 0;
		String str;
		List<strs> ss = new ArrayList<strs>();
		
		while ((str = in.readLine()) != null) {
			strs tmp = new strs();
			tmp.setName(str);
			tmp.setOrder(Integer.parseInt(str.charAt(0) + ""));
			ss.add(tmp);
			i++;
		}
		Collections.sort(ss);
		for (strs tmp: ss){
			out.write(tmp.getName());
			out.write(" :" + tmp.getName().length() + "");
			out.write("\r\n");
		}

		in.close();
		out.close();
	}
}
