import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class text {
	private static final String dir = "D://javaworkspace1//HelloWorld//src//a.txt";

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		FlowLayout flow = new FlowLayout();
		final JTextArea jtextarea = new JTextArea(10, 30);
		JButton write = new JButton("write");
		JButton read = new JButton("read");
		JPanel textpanel = new JPanel();
		JPanel buttons = new JPanel();
		Container contentPane = frame.getContentPane();
		contentPane.add(textpanel, "Center");
		contentPane.add(buttons, "North");
		textpanel.add(jtextarea);
		buttons.setLayout(flow);
		buttons.add(read);
		buttons.add(write);
		frame.setTitle("text I/O");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					Reader reader = new FileReader(dir);
					jtextarea.read(reader, null);
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

			}
		});
		write.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				BufferedWriter bw = null;
				try {
					OutputStream os = new FileOutputStream(dir);
					bw = new BufferedWriter(new OutputStreamWriter(os));
					for (String value : jtextarea.getText().split("\n")) {
						bw.write(value);
						bw.newLine();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					if (bw != null) {
						try {
							bw.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
	}
}
