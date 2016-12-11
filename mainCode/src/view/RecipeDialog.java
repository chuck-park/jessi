package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
  

/**
 * @author admin
 * @version 1.0
 * @created 17-3-2016 ���� 3:09:33
 */
public class RecipeDialog extends JDialog {
	// attributes
//	final Image icon = new ImageIcon("recipe_book.gif");
	Image icon = Toolkit.getDefaultToolkit().createImage("RB.png"); 
	private String message;
	private JFrame frame;
	private static final long serialVersionUID = 1L;
	private boolean BloginOK; 
	// components
	private RecipePanel RecipePanel;
	public boolean getLoginOK() {
		// TODO Auto-generated method stub
		return this.BloginOK;
	}
  

    public RecipeDialog(JFrame parent, String message){
		super(parent, "RecipeDialog", true);
		this.frame = parent;
		this.message= message;
		// attributes
		this.setLocationRelativeTo(null);
		this.setSize(1100,660);
		this.setLocation(500, 150);
		// components
		this.RecipePanel = new RecipePanel(parent);
		this.getContentPane().add(this.RecipePanel) ;
	}
	private void cancel(){
		this.dispose();
	}
	

	public class RecipePanel extends JPanel {
		private static final long serialVersionUID = 1L;
		// components
		private JLabel recipe;
		
		private JButton btnOK;
		
		public RecipePanel(JFrame parent) {
			recipe = new JLabel(message);
			recipe.setLocation(0, 600);
			this.add(recipe);		
			

			btnOK = new JButton("OK");
			btnOK.addActionListener(new ButtonListener());
			btnOK.setActionCommand(btnOK.getText());
			this.add(btnOK);
			
		}		
//		public void paint(Graphics g)
//	    {
//	        // Draws the img to the BackgroundPanel.
//	        g.drawImage(icon, 100	, 100, null);
//	    }
		protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(icon, 0, 0, this);
	    }
		private class ButtonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if(e.getActionCommand().equals(btnOK.getText())){
						cancel();
					}else{
						cancel();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	}
	
	
	
}//end Login