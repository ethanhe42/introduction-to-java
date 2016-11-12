### 1. AWT有哪些容器？
Window, Panel ,Applet, Frame, Dialog,ScrollPane

### 2.AWT有哪些布局？
BorderLayout， BoxLayout， CardLayout，FlowLayout，GridBagLayout，GridLayout， GroupLayout，SpringLayout

### 3.AWT有哪些组件？
类java.awt.Component是许多组件类的父类，Component类中封装了组件通用的方法和属性.

- 标签Label
- 按钮Button 
- 文本框 TextField 
- 文本区TextArea 
- 复选框Checkbox 
- 下拉列表Choice 
- 列表List 
- 滚动条Scrollbar 
- 滚动面板ScrollPane

### 4.AWT的窗口事件、键盘事件和鼠标事件各是什么？
WindowEvent：“窗口事件”，点击关闭按钮，窗口得到与失去焦点，窗口最小化等。

MouseEvent：“鼠标事件”，鼠标按下，鼠标释放，鼠标点击等。 
	1.基本窗体功能实现
	2.鼠标移动监听，当鼠标移动到按钮上时，触发打印事件。
	3.按钮活动监听，当按钮活动时，触发打印事件。
	4.按钮被单击时触发打印事件。

Keyevent:"键盘事件"，键盘按下，键盘释放，键盘输入

### 5.AWT的窗口事件监听函数、键盘事件监听函数和鼠标事件监听函数各是什么？
5.  窗口事件监听函数：windowClosing（WindowsEvent），WindowIconified

(WindowEvent),WindowActivated(WindowEvent)
键盘事件监听函数:keyPressed(KeyEvent),keyReleased(KeyEvent),keyTyped(KeyEvent)
鼠标事件监听函数：

### 6.请说明以下swing容器的用法：JFrame、JPanel、JApplet、JScrollPane
（1）JPanel

JPanel类的常用构造方法有：
JPanel(),创建一个JPanel对象。
JPanel(LayoutManager layout),创建JPanel对象时指定布局layout。

JPanel对象添加组件的方法：
add(组件)，添加组件。
add(字符串，组件)，当面板采用GardLayout布局时，字符串是引用添加组件的代号。

JScrollPane类的构造方法有：
JScrollPane()，先创建JScrollPane对象，然后再用方法setViewportView(Component com)为滚

动面板对象放置组件对象。
JScrollPane(Component com),创建JScrollPane对象，参数com是要放置于JScrollPane对象的组

件对象。为JScrollPane对象指定了显示对象之后，再用add()方法将JScrollPane对象放置于窗口

中。

（2）JScrollPane

JScrollPane对象设置滚动条的方法是：
setHorizontalScrollBarPolicy(int policy),policy 取以下列3个值之一：
    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEED
    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
setVerticalScrollBarPolicy(int policy), policy 取以下列3个值之一：
    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEED
    JScrollPane.VERTICAL_SCROLLBAR_NEVER

（3）JFrame
例如
public static void main(String[] args) {  
JFrame frame = new JFrame("利用JFrame创建窗口"); // 创建指定标题的JFrame窗口对象  
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭按钮的动作为退出窗口  
frame.setSize(400, 300);                          // 设置窗口大小  
Dimension displaySize = Toolkit.getDefaultToolkit().getScreenSize(); // 获得显示器大

小对象  
Dimension frameSize = frame.getSize();             // 获得窗口大小对象  
if (frameSize.width > displaySize.width)  
frameSize.width = displaySize.width;           // 窗口的宽度不能大于显示器的宽度  
if (frameSize.height > displaySize.height)  
frameSize.height = displaySize.height;          // 窗口的高度不能大于显示器的高度  
frame.setLocation((displaySize.width - frameSize.width) / 2,  
(displaySize.height - frameSize.height) / 2); // 设置窗口居中显示器显示  
frame.setVisible(true);                          // 设置窗口为可见的，默认为不可见  
}  

（4）JApplet 
init： 这个方法适用于你的 applet 程序所需要的任何初始化。它在 applet 标记中的参数标签

被处理后被调用。
start： 这个方法在浏览器调用 init 方法后被自动调用。它也在无论何时使用者在去其他页面

后返回到包含 applet 的页面时被调用。
stop： 这个方法在使用者离开有 applet 所在的页面时被自动调用。因此，它在同一个 applet 

中能被重复调用。
destroy： 这个方法仅当浏览器正常关闭时被自动调用。因为 applet 程序是生存在 HTML 页面

上的，你不应该在使用者离开有 applet 的网页后留下资源。
paint： 在 start() 方法之后被立即调用，或是在 applet 需要在浏览器上重现它自身的任何时

候。paint() 方法实际上是继承自 java.awt。

### 7.请说明以下swing组件的用法：JLabel、JTextField、JTextArea、JPasswordField、

JButton、JTable
JLabel；标签组件
JLabel:
一個JLabel物件可顯示文字或影像，但JLabel物件是一個被動的元件，不能讓使用者選擇點選 ，

例如滑鼠的相關動作並不能使JLabel物件有所反應，且它只能唯讀文字，不能更改Label的內容。
此外，JLabel物件可以透過setDisplayedMnemonic(char aChar)方法來設定輔助鍵，以及設定輔

助鍵時必須同時呼叫setLabelFor(Component c)方法好指定這個標籤所伴隨的元件，也就是當使

用者使用輔助鍵時，焦點也會轉移到所指定的元件c上。
-------------------------------------------------------------------------------------

----------------------------------
声明：JLabel label=new JLabel(String string[,Icon icon][,Int Alignment]);

JTextField；文本框
一個JTextField元件可讓使用者在GUI程式裡輸入一行的文字，且也可以透過JTextField的方法來

設定使用者輸入文字的字型和對齊方式等。
此外，如希望輸入文字後，按下ENTER鍵有反應，則須定義相對應的事件傾聽器，導引到指定的動

作。
public JTextField() --建立一個空白的文字欄位。
public JTextField(Document doc, String text, int columns) --建立一個文字欄位。
public JTextField(int columns) --建立一個空白的文字欄位，且指定文字欄位的長度大小。 
public JTextField(String text) -- 以指定的字串當作文字欄位的預設值。
public JTextField(String text, int columns) --以指定的字串當作文字欄位的預設值，並且

指定文字欄位的長度大小。

JTextArea；多行文本框，文本域
相較於JTextField元件只能輸入一行的文字，JTextArea元件則可設定讓使用者最多可以輸入多少

行的文字。不過得注意的是，JTextArea元件必須放在JScrollPane元件中。
public JTextArea( ) --建立一個新的文字區域方塊，預設值是null，且rows和columns為0。
public JtextArea(Document doc) --以指定的Document元件作為文字區域方塊的模型樣式。
public JTextArea(Document doc, String text, int rows, int columns) --以指定的Document

元件作為文字區域方塊的模型樣式，且初始字串設為text，文字區域方塊的長和寬須大於等於0，

否則會有IllArgumentException。
public JTextArea(int rows, int columns) --設定文字區域方塊的長和寬，參數值必須大於等

於0，否則會有IllArgumentException。
public JTextArea(String text) --設定文字區域方塊的初始顯示字串text。
public JTextArea(String text, int rows, int columns) --設定文字區域方塊的初始顯示字串

text，且文字區域方塊的長和寬，參數值必須大於等於0，否則會有IllArgumentException。

JPasswordField；密码框
這元件和JTextField元件類似，只有單行輸入，不過看不到輸入的實際內容，而是用其他符號回

應在螢幕上，這也符合輸入密碼的隱私性，不能隨意讓別人看到內容。
public JPasswordField( ) --建立一個空白的密碼欄位元件。
public JPasswordField(Document doc, String text, int columns) --指定一種文件模型
public JPasswordField(int columns) --設定密碼欄位元件的長度。
public JPasswordField(String text) --設定一個字串為密碼欄位的初始值。
public JPasswordField(String text, int columns) --設定一個字串為密碼欄位的初始值及長

度。
 

JTable：将数据以表格显示

一.创建表格控件的各种方式:
1)  调用无参构造函数.
JTable table = new JTable();

2)  以表头和表数据创建表格.
Object[][] cellData = {{"row1-col1", "row1-col2"},{"row2-col1", "row2-col2"}};
String[] columnNames = {"col1", "col2"};
    
JTable table = new JTable(cellData, columnNames);

二.对表格列的控制
3) 设置当前列数.
DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
int count=5;
tableModel.setColumnCount(count);

4) 取得表格列数
int cols = table.getColumnCount();

5) 添加列
DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
tableModel.addColumn("新列名");

6) 删除列
table.removeColumn(table.getColumnModel().getColumn(columnIndex));// columnIndex是要

删除的列序号
四.存取表格单元格的数据
1) 取单元格数据
DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
String cellValue=(String) tableModel.getValueAt(row, column);// 取单元格数据,row是行

号,column是列号

2) 填充数据到表格.
注:数据是Member类型的链表,Member类如下:
public class Member{
    // 名称
    private String name;
    
    // 年龄
    private String age;
    
    // 职务
    private String title;
}
