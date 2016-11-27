package Weather;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import Weather.Weather;

public class NewJFrame extends javax.swing.JFrame {
	private JButton jButton1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextPane jTextPane1;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("weather");
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("search");
				jButton1.setBounds(50, 200, 100, 50);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jTextPane1 = new JTextPane();
				getContentPane().add(jTextPane1);
				jTextPane1.setBounds(200, 100, 200, 100);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("info");
				jLabel1.setBounds(250, 50, 50, 50);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(50, 100, 100, 50);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("city");
				jLabel2.setBounds(100, 50, 50, 50);
			}
			pack();
			this.setSize(800, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		String a=this.jTextField1.getText();
		Weather weather=new Weather(a);
		jTextPane1.setText(weather.search());

		
		
	}

}
