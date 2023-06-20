import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HTMLWorkss {
	private final JLabel HTMLWorks2 = new JLabel("");
	private final JLabel HTMLWorks1 = new JLabel("");
	protected Object frmAboutUS;
	
     
    public static void main(String[] args) {
    	HTMLWorkss aboutUs = new HTMLWorkss();
        aboutUs.body();
    	
    	
    }
    public void body() {
    	
        JFrame HTMLWorksFrame = new JFrame("Scroll Multiple Images Example");
        HTMLWorksFrame.setTitle("HTMLWorks");
        HTMLWorksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HTMLWorksFrame.setSize(942, 627);

        // Create a panel to hold the images
        JPanel panel = new JPanel();
        panel.setBounds(new Rectangle(0, 0, 0, 0));
        panel.setBackground(new Color(29, 51, 49));
        panel.setLayout(null);
  

       
        
      
 

        // Create a scroll pane and add the panel to it
        panel.setPreferredSize(new Dimension(900, 1200));
        JScrollPane scrollPane = new JScrollPane(panel);
        
        JPanel HTMLWorks2Panel = new JPanel();
        HTMLWorks2Panel.setBackground(new Color(29, 51, 49));
        HTMLWorks2Panel.setBounds(0, 587, 907, 587);
        panel.add(HTMLWorks2Panel);
        HTMLWorks2Panel.setLayout(null);
        HTMLWorks2.setIcon(new ImageIcon(HTMLWorkss.class.getResource("/image/HtmlWorks2.png")));
        HTMLWorks2.setBounds(0, 0, 907, 587);
        HTMLWorks2Panel.add(HTMLWorks2);
        
        JPanel HTMLWorks1Panel = new JPanel();
        HTMLWorks1Panel.setBackground(new Color(29, 51, 49));
        HTMLWorks1Panel.setBounds(0, 0, 907, 587);
        panel.add(HTMLWorks1Panel);
        HTMLWorks1Panel.setLayout(null);
        
        JButton returnbutton = new JButton("");
        returnbutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		codesProgram window = new codesProgram();
				window.CodesProgramFrame.setVisible(true);
				HTMLWorksFrame.dispose();
        	}
        });
        returnbutton.setBorder(null);
        returnbutton.setBackground(new Color(29, 51, 49));
        returnbutton.setIcon(new ImageIcon(HTMLWorkss.class.getResource("/image/ReturnButton2.png")));
        returnbutton.setBounds(655, 0, 252, 95);
        HTMLWorks1Panel.add(returnbutton);
        HTMLWorks1.setIcon(new ImageIcon(HTMLWorkss.class.getResource("/image/HtmlWorks1.png")));
        HTMLWorks1.setBounds(0, 0, 907, 587);
        HTMLWorks1Panel.add(HTMLWorks1);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollbarUI());

        // Add the scroll pane to the frame's content pane
        HTMLWorksFrame.getContentPane().add(scrollPane);

        HTMLWorksFrame.setVisible(true);
    }

    public static class CustomScrollbarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            // Configure scrollbar colors here
            thumbColor = new Color(152, 121, 57); // Color of the thumb
            trackColor = new Color(240, 240, 240); // Color of the track
            setThumbHighlightColor(Color.YELLOW);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }
    }

	public static void setThumbHighlightColor(Color yellow) {
		// TODO Auto-generated method stub
		
	}
}
