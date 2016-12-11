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
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import valueObject.RecipeInfo;

/**
 * @author admin
 * @version 1.0
 * @created 17-3-2016 ���� 3:09:33
 */

public class RecipeDialog extends JDialog {
  Image icon = Toolkit.getDefaultToolkit().createImage("RB.png");
  private String message;
  private JFrame frame;
  private RecipeView recipeView;
  private static final long serialVersionUID = 1L;
  private boolean BloginOK;
  public int index;
  // components
  private RecipePanel RecipePanel;

  public boolean getLoginOK() {
    // TODO Auto-generated method stub
    return this.BloginOK;
  }

  public RecipeDialog(JFrame parent, String message, int index, Vector<RecipeInfo> resultlist, RecipeView recipeView) {
    super(parent, "RecipeDialog", true);
    this.frame = parent;
    this.message = message;
    this.index = index;
    this.recipeView = recipeView;
    // attributes
    this.setLocationRelativeTo(null);
    this.setSize(1100, 660);
    this.setLocation(500, 150);
    // components
    this.RecipePanel = new RecipePanel(parent, resultlist, this.index, recipeView);
    this.getContentPane().add(this.RecipePanel);
  }

  private void cancel() {
    this.dispose();
  }
  
  public class RecipePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    // components
    private JLabel recipe;
    public int index;
    private JButton btnOK;
    private JButton btnGood;
    private RecipeView recipeView;

    public RecipePanel(JFrame parent, Vector<RecipeInfo> resultlist, int index, RecipeView recipeView) {
      recipe = new JLabel(message);
      recipe.setLocation(0, 600);
      this.add(recipe);
      this.index = index;

      btnOK = new JButton("OK");
      btnOK.addActionListener(new ButtonListener(resultlist, this.index, this.recipeView));
      btnOK.setActionCommand(btnOK.getText());
      this.add(btnOK);

      btnGood = new JButton("좋아요!");
      btnGood.addActionListener(new ButtonListener(resultlist, this.index, this.recipeView));
      btnGood.setActionCommand(btnGood.getText());
      this.add(btnGood);

    }

    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(icon, 0, 0, this);
    }

    private class ButtonListener implements ActionListener {
      int index;
      Vector<RecipeInfo> resultlist;

      public ButtonListener(Vector<RecipeInfo> resultlist, int index, RecipeView recipeView) {
        this.index = index;
        this.resultlist = resultlist;
      }

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try {
          if (e.getActionCommand().equals(btnOK.getText())) {
            cancel();
          } else if (e.getActionCommand().equals(btnGood.getText())) {
            this.resultlist.get(index).setLikeINC();
            System.out.println("좋아요++, " + "현재 좋아요 : " + this.resultlist.get(index).getLike());

          } else {
            cancel();
          }
        } catch (Exception e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      }
    }
    
  }

}