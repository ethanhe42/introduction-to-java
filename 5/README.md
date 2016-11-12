### 1. AWT有哪些容器？
Window, Panel ,Applet, Frame, Dialog, ScrollPane

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
- 窗口事件, WindowEvent, 点击关闭按钮，窗口得到与失去焦点，窗口最小化
- 鼠标事件, MouseEvent, 鼠标按下，鼠标释放，鼠标点击
- 键盘事件,Keyevent, 键盘按下，键盘释放，键盘输入

### 5.AWT的窗口事件监听函数、键盘事件监听函数和鼠标事件监听函数各是什么？
- 窗口事件监听函数：windowClosing（WindowsEvent），WindowIconified(WindowEvent),WindowActivated(WindowEvent)
- 键盘事件监听函数: keyPressed(KeyEvent),keyReleased(KeyEvent),keyTyped(KeyEvent)
- 鼠标事件监听函数：mouseClicked(MouseEvent e), mouseEntered(MouseEvent e) ,mouseExited(MouseEvent e) ,mousePressed(MouseEvent e) ,mouseReleased(MouseEvent e) 

### 6.请说明以下swing容器的用法：JFrame、JPanel、JApplet、JScrollPane
##### Jpanel
- JPanel(),创建一个JPanel对象。
- JPanel(LayoutManager layout),创建JPanel对象时指定布局layout。
- add(组件)，添加组件。
- add(字符串，组件)，当面板采用GardLayout布局时，字符串是引用添加组件的代号。

##### JScrollPane
- ScrollPane()，创建JScrollPane对象
- JScrollPane(Component com), 参数com是要放置于JScrollPane对象的组象
- setViewportView(Component com)为滚动面板对象放置组件对象。
- setHorizontalScrollBarPolicy(int policy),policy取, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
- setVerticalScrollBarPolicy(int policy), policy取JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.VERTICAL_SCROLLBAR_AS_NEED, JScrollPane.VERTICAL_SCROLLBAR_NEVER
- setPreferredSize
- revalidate();
- repaint();

##### JFrame
- JFrame("利用JFrame创建窗口"); // 创建指定标题的JFrame窗口对象  
- setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭按钮的动作为退出窗口  
- setSize(h, w);   // 设置窗口大小  
- getSize();             // 获得窗口大小对象  
- getSize().width
- getSize().height
- setLocation(x, y); // 设置窗口居中显示器显示  
- setVisible(true);                          // 设置窗口为可见的，默认为不可见   

##### JApplet 
- Applet() // 创建对象
- init（） //初始化
- start //applet 处于激活状态时首先应该执行的任务
- stop // applet 处于非激活状态时首先应该执行的任务
- destory // 销毁
- getAppletContext（） // 允性环境
- getAudioClip（url） // 返回音频剪辑指定对象
- play（url） //播放
- getCodebase（）//返回url
- getImage（url）//图片
- ressize（）//调整大小
- showStatus（）//现实msg信息

### 7.请说明以下swing组件的用法：JLabel、JTextField、JTextArea、JPasswordField、JButton、JTable
##### JLabel 
- JLabel() // 创建无图像并且其标题为空字符串的 JLabel。
- JLabel(Icon image)
- JLabel(Icon image, int horizontalAlignment)
- JLabel(String text)
- JLabel(String text, Icon icon, int horizontalAlignment) //创建具有指定文本、图像和水平对齐方式的 JLabel 实例。
- JLabel(String text, int horizontalAlignment)
- String getText() //          返回该标签所显示的文本字符串。
- void setText(String text)//          定义此组件将要显示的单行文本。
- Icon getIcon()//          返回该标签显示的图形图像（字形、图标）。
- void setIcon(Icon icon)//          定义此组件将要显示的图标。

##### JTextField 
- JTextField()
- JTextField(Document doc, String text, int columns)//     构造一个新的 JTextField，它使用给定文本存储模型和给定的列数。
- JTextField(int columns)
- JTextField(String text)
- JTextField(String text, int columns)
- void setFont(Font f)//          设置当前字体。
- void setHorizontalAlignment(int alignment)//          设置文本的水平对齐方式。
- void setScrollOffset(int scrollOffset)//          获取滚动偏移量（以像素为单位

##### JTextArea 
- JTextArea() 构造新的 TextArea。
- JTextArea(String  text)
- JTextArea(int rows, int columns)
- JTextArea(String  text, int rows, int columns)  构造具有指定文本、行数和列数的新的 TextArea。
- setText("JTextArea1");// 设置文本显示的内容
- append("JTextArea2");// 方法会将给定文本追加到文档结尾。
- setLineWrap(true);// 设置文本区的换行策略。
- setFont(new Font("标楷体", Font.BOLD, 16));  //设置当前字体。
- setTabSize(2);//设置[Tab]键的跳离距离

##### JPasswordField
- JPasswordField("1234"); // 初始化
- get/setEchoChar()：获取/设置每次字符输入时在 JPasswordField 中显示的字符。在获取口令时返回实际的字符
- getText()
- getPassword() // 返回一个包含口令的 char[]

##### JButton 
- JButton():建立一个按钮。
- JButton(Icon icon)
- JButton(String icon)
- JButton(String text,Icon icon):建立一个有图像与文字的按钮。
- setHorizontalTextPosition
- setVerticalTextPosition
- setIcon
- setPressedIcon
- addActionListener

##### JTable 
- Jtable（） // 初始化
- Jtable（rows， cols） //空单元格
- getRowcount（）
- getColumnCount()
- int getSelectedRow() //返回首个选定的索引
- int getSelectedColumn() //返回首个选定的索引
- Object getValueAt(row, col) //返回单元格内容
- void setValueAt（row，col) //设置单元格
- void updateUI（） // 刷新表
