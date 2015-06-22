import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame{

	private static final long serialVersionUID = 1L;
	private String details;
	private JLabel statusbar;
	
	public Test()
	{
		super("Mouse Adapter Example");
		statusbar = new JLabel("this is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new MouseClass());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(300, 200);
		setVisible(true);    
	}
	
	private class MouseClass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event)
		{
			details = String.format("You clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
			{
				details += " right mouse button";
			}
			else if (event.isAltDown())
			{
				details += " centre mouse button";
			}
			else
			{
				details += " left mouse button";
			}
			statusbar.setText(details);
		}
	}
}