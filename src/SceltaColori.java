package Modulo;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class SceltaColori extends JFrame implements ActionListener{
	JButton rosso = new JButton ("Rosso");
	JButton blu = new JButton ("Blu");
	JButton verde = new JButton("Verde");
	
	public SceltaColori() {
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(rosso);
		rosso.addActionListener(e -> r());
		c.add(verde);
		verde.addActionListener(e -> b());
		c.add(blu);
		blu.addActionListener(e -> v());
		setSize(400,200);
		setVisible(true);
	}
		public void r() {getContentPane().setBackground(Color.red);}
		public void v() {getContentPane().setBackground(Color.green);}
		public void b() {getContentPane().setBackground(Color.blue);}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==rosso) {
			r();
			}
		else if (e.getSource()==blu) {
			b();
			}
		else if (e.getSource()==verde) {
			v();
		}
	}
}