package software;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static sun.misc.ClassFileTransformer.add;
public class TinhTong extends JFrame {
JTextField tfa, tfb, tfkq;
JLabel lb, lba, lbb, lbkq;
JButton btketqua;
TinhTong() {
super("Tinh tong hai so nguyen");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(450, 200);
setVisible(true);
setLayout(null);
lb = new JLabel("Tính tổng hai số nguyên");
lb.setBounds(100, 10, 300, 20);
this.add(lb);

lba = new JLabel("Nhap so thu nhat");
lba.setBounds(10, 40, 200, 20);
this.add(lba);

lbb = new JLabel("Nhap so thu hai ");
lbb.setBounds(10, 70, 200, 20);
this.add(lbb);

lbkq = new JLabel("Ket qua :");
lbkq.setBounds(10, 100, 200, 20);
this.add(lbkq);

tfa = new JTextField();
tfa.setBounds(210, 40, 200, 20);
add(tfa);

tfb = new JTextField();
tfb.setBounds(210, 70, 200, 20);
add(tfb);

tfkq = new JTextField();
tfkq.setBounds(210, 100, 200, 20);
add(tfkq);

btketqua = new JButton("Ket qua");
btketqua.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tfa.getText());
int b = Integer.parseInt(tfb.getText());
int kq = 0;
if (e.getSource() == btketqua) {
kq = a + b;
tfkq.setText(String.valueOf(kq));
}
}
});
btketqua.setSize(150, 30);
btketqua.setLocation(150, 130);
add(btketqua);
}
public static void main(String[] args) {
new TinhTong();
}
}