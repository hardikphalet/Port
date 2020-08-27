import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.*;
// import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
// import javax.swing.ImageIcon;
import javax.swing.JButton;
// import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class Resources extends JFrame{
    private static final long serialVersionUID = 1L;
    private static boolean shouldFill = true;
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField tNo;
    private JTextField name;
    private JTextField to;
    private JTextField from;
    private JButton submit;
    private JButton reset;
    private JLabel window1;
    private JLabel window2;
    private JLabel window3;
    private JLabel window4;
    // private JLabel window5;

    public Resources(){
        super("Port");
        tabbedPane = new JTabbedPane();

        panel1 = new JPanel(false);
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            gbc.fill = GridBagConstraints.HORIZONTAL;
        }

        window1 = new JLabel("Ticket No.: ");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(window1, gbc);

        window2 = new JLabel("Name: ");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(window2, gbc);
        
        window3 = new JLabel("To: ");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel1.add(window3, gbc);

        window4 = new JLabel("From: ");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel1.add(window4, gbc);

        // window5 = new JLabel("Date: ");
        // gbc.gridx = 0;
        // gbc.gridy = 4;
        // panel1.add(window5, gbc);

        tNo = new JTextField(10);
        tNo.setFont(new Font("Serif",Font.PLAIN,14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel1.add(tNo, gbc);

        name = new JTextField(10);
        name.setFont(new Font("Serif",Font.PLAIN,14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(name, gbc);

        to = new JTextField(10);
        to.setFont(new Font("Serif",Font.PLAIN,14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(to, gbc);
        
        from = new JTextField(10);
        from.setFont(new Font("Serif",Font.PLAIN,14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel1.add(from, gbc);
        

        submit = new JButton("Submit");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10,10,10,0);  //top padding
        gbc.gridwidth = 1;
        gbc.weightx = 3;
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel1.add(submit, gbc);

        reset = new JButton("Reset");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10,10,10,0);  //top padding
        gbc.weightx = 3;
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel1.add(reset, gbc);

        tabbedPane.addTab("Checking", null, panel1,"Check reservation");
        



        panel2 = new JPanel(false);
        panel2.setLayout(new GridBagLayout());
        tabbedPane.addTab("Booking", null, panel2,"Book reservation");
        add(tabbedPane, BorderLayout.CENTER);
    }

}