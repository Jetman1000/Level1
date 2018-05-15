package level01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class level1 implements ActionListener{
	JFrame window = new JFrame();
	JPanel panel= new JPanel();
	JButton incButton=new JButton("INC");
	JButton dispButton=new JButton("DISP");
public static void main(String[] args) {
	level1 x=new level1();
	x.buildWindow();
}
	void buildWindow() {
		window.add(panel);
		panel.add(incButton);
		panel.add(dispButton);
		window.setVisible(true);
		window.pack();
		incButton.addActionListener(this);
		dispButton.addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
				System.out.println("AP");
		JButton j=(JButton)e.getSource();
		if (j==incButton) {
			
			
		}
		else if(j==dispButton) {
			
		}
		}
	}
}