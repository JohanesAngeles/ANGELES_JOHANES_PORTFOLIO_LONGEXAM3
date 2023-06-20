import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaWorks {
	private final JLabel Javaworks4 = new JLabel("");
	private final JLabel Javaworks2 = new JLabel("");
	private final JLabel Javaworks1 = new JLabel("");
	protected Object frmAboutUS;
	
     
    public static void main(String[] args) {
    	JavaWorks aboutUs = new JavaWorks();
        aboutUs.body();
    	
    	
    }
    public void body() {
    	
        JFrame JavaworksFrame = new JFrame("Scroll Multiple Images Example");
        JavaworksFrame.setTitle("Javaworks");
        JavaworksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JavaworksFrame.setSize(942, 627);

        // Create a panel to hold the images
        JPanel panel = new JPanel();
        panel.setBounds(new Rectangle(0, 0, 0, 0));
        panel.setBackground(new Color(29, 51, 49));
        panel.setLayout(null);
  

       
        
      
 

        // Create a scroll pane and add the panel to it
        panel.setPreferredSize(new Dimension(900, 2500));
        JScrollPane scrollPane = new JScrollPane(panel);
        
       
        
        JPanel Javaworks4Panel = new JPanel();
        Javaworks4Panel.setBackground(new Color(29, 51, 49));
        Javaworks4Panel.setBounds(0, 1761, 907, 587);
        panel.add(Javaworks4Panel);
        Javaworks4Panel.setLayout(null);
        Javaworks4.setIcon(new ImageIcon(JavaWorks.class.getResource("/image/Javaworks4.png")));
        Javaworks4.setBounds(0, 0, 907, 586);
        Javaworks4Panel.add(Javaworks4);
        
        JPanel Javaworks3Panel = new JPanel();
        Javaworks3Panel.setBackground(new Color(29, 51, 49));
        Javaworks3Panel.setBounds(0, 1174, 907, 587);
        panel.add(Javaworks3Panel);
        Javaworks3Panel.setLayout(null);
        
        JLabel Javaworks3 = new JLabel("");
        Javaworks3.setIcon(new ImageIcon(JavaWorks.class.getResource("/image/Javaworks3.png")));
        Javaworks3.setBounds(0, 0, 907, 587);
        Javaworks3Panel.add(Javaworks3);
        
        JPanel Javaworks2Panel = new JPanel();
        Javaworks2Panel.setBackground(new Color(29, 51, 49));
        Javaworks2Panel.setBounds(0, 587, 907, 587);
        panel.add(Javaworks2Panel);
        Javaworks2Panel.setLayout(null);
        Javaworks2.setIcon(new ImageIcon(JavaWorks.class.getResource("/image/Javawroks2.png")));
        Javaworks2.setBounds(0, 0, 907, 587);
        Javaworks2Panel.add(Javaworks2);
        
        JPanel Javaworks1Panel = new JPanel();
        Javaworks1Panel.setBackground(new Color(29, 51, 49));
        Javaworks1Panel.setBounds(0, 0, 907, 587);
        panel.add(Javaworks1Panel);
        Javaworks1Panel.setLayout(null);
        
        JButton returnbutton = new JButton("");
        returnbutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		codesProgram window = new codesProgram();
				window.CodesProgramFrame.setVisible(true);
				JavaworksFrame.dispose();
        	}
        });
        returnbutton.setBorder(null);
        returnbutton.setBackground(new Color(29, 51, 49));
        returnbutton.setIcon(new ImageIcon(JavaWorks.class.getResource("/image/ReturnButton2.png")));
        returnbutton.setBounds(655, 0, 252, 95);
        Javaworks1Panel.add(returnbutton);
        Javaworks1.setIcon(new ImageIcon(JavaWorks.class.getResource("/image/Javaworks1.png")));
        Javaworks1.setBounds(0, 0, 907, 587);
        Javaworks1Panel.add(Javaworks1);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollbarUI());

        // Add the scroll pane to the frame's content pane
        JavaworksFrame.getContentPane().add(scrollPane);

        JavaworksFrame.setVisible(true);
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
