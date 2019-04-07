package BuilderMode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameBuilder extends Builder implements ActionListener {
	
	private JFrame frame=new JFrame();
	private Box box=new Box(BoxLayout.Y_AXIS);
	
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		frame.setTitle(title);
	}

	@Override
	public void makeString(String string) {
		// TODO Auto-generated method stub
		box.add(new JLabel(string));
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		Box innerBox=new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < items.length; i++) {
			JButton button=new JButton(items[i]);
			button.addActionListener(this);
			innerBox.add(button);
		}
		box.add(innerBox);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		frame.getContentPane().add(box);
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event){
				System.exit(0);
			}
		});
	}
	
	public JFrame getResult() {
		return frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent event){
		System.out.println(event.getActionCommand());
	}

}
