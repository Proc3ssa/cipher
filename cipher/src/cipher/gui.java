package cipher;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.Caret;

public class gui implements ActionListener {
	
	
	
	public static JLabel label;
	public static JTextField results;
	public static JTextField text;
	public static JFrame frame;
	public static JPanel panel;


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("cipher/decipher");
		label = new JLabel("Code: ");
		results = new JTextField();
		text = new JTextField();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("cipher");
		frame.add(panel);
		frame.setBounds(500, 200, 350, 150);
		frame.add(panel);
		frame.setResizable(false);
		
		
		panel.setLayout(null);
		panel.add(label);
		panel.add(text);
		panel.add(button);
		
		
		label.setBounds(10,10,500,20);
		results.setBounds(10,10,500,20);
		text.setBounds(70,10,250,20);
		button.setBounds(100,50,130,25);
		button.addActionListener(new gui());
		
		if(text.getText().isEmpty()) {
			
			button.getBackground();
			
		}
		
		frame.setVisible(true);
		
		
		
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cipher = text.getText();
		  
		  if(cipher.isEmpty()) {
		        	
		        	
		        }
		        
		  else {
		      int a;
		      int wordlen;
		      wordlen = cipher.length();
		      char nn;
		    for(a=2;a<=wordlen;a++) {
		    	nn = cipher.charAt(wordlen - a);
		   
		    System.out.print(nn);
		    }
		    
		    char fn = cipher.charAt(wordlen-1);
		   System.out.print(fn);
		        }
		
		
	}

}
