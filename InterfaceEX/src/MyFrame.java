import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class MyFrame extends JFrame{
	
	JButton b;
	
	public MyFrame(){
		
		super( "My Example" );       
	    setSize( 150, 100 );
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    
	    setLayout( new FlowLayout() );      
	    b = new JButton("Click Here");  
	    b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"You have clicked me");
			}
		});
	    add( b );                      
	}
}
