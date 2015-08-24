import java.awt.Container;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class work {

public static void main(String[] args) {
new TestingFile();
}
}
class TestingFile extends JFrame
{
public TestingFile()
{
this.setVisible(true);
this.setSize(600,600);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c=this.getContentPane();
c.setLayout(new FlowLayout());
final JTextField text=new JTextField("這是一個文字方塊",20);
JButton button=new JButton("清空文本");
text.setSize(30, 30);
c.add(text);
c.add(button);
button.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e) {
text.setText("已完成清空處理！");
}
});
}
}