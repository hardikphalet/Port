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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Resources extends JFrame {
    private static final long serialVersionUID = 1L;
    private static boolean shouldFill = true;
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel window1;
    private JLabel window2;
    private JLabel window3;
    private JLabel window4;
    private JTextField tNo;
    private JTextField name;
    private JTextField to;
    private JTextField from;
    private JButton submit;
    private JButton reset;
    private JLabel window1_;
    private JLabel window2_;
    private JLabel window3_;
    private JLabel window4_;
    private JTextField tNo_;
    private JTextField name_;
    private JTextField to_;
    private JTextField from_;
    private JButton submit_;
    private JButton reset_;

    // private JLabel window5;

    public Resources() {
        super("Port");
        tabbedPane = new JTabbedPane();

        panel1 = new JPanel(false);
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        if (shouldFill) {
            // natural height, maximum width
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
        tNo.setFont(new Font("Serif", Font.PLAIN, 14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel1.add(tNo, gbc);

        name = new JTextField(10);
        name.setFont(new Font("Serif", Font.PLAIN, 14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel1.add(name, gbc);

        to = new JTextField(10);
        to.setFont(new Font("Serif", Font.PLAIN, 14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel1.add(to, gbc);

        from = new JTextField(10);
        from.setFont(new Font("Serif", Font.PLAIN, 14));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel1.add(from, gbc);

        submit = new JButton("Submit");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10, 10, 10, 0); // top padding
        gbc.gridwidth = 1;
        gbc.weightx = 3;
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel1.add(submit, gbc);

        reset = new JButton("Reset");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10, 10, 10, 0); // top padding
        gbc.weightx = 3;
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel1.add(reset, gbc);

        tabbedPane.addTab("Checking", null, panel1, "Check reservation");

        panel2 = new JPanel(false);
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints _gbc = new GridBagConstraints();
        if (shouldFill) {
            // natural height, maximum width
            _gbc.fill = GridBagConstraints.HORIZONTAL;
        }

        window1_ = new JLabel("Ticket No.: ");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridx = 0;
        _gbc.gridy = 0;
        panel2.add(window1_, _gbc);

        window2_ = new JLabel("Name: ");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridx = 0;
        _gbc.gridy = 1;
        panel2.add(window2_, _gbc);

        window3_ = new JLabel("To: ");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridx = 0;
        _gbc.gridy = 2;
        panel2.add(window3_, _gbc);

        window4_ = new JLabel("From: ");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridx = 0;
        _gbc.gridy = 3;
        panel2.add(window4_, _gbc);

        // window5 = new JLabel("Date: ");
        // _gbc.gridx = 0;
        // _gbc.gridy = 4;
        // panel2.add(window5, _gbc);

        tNo_ = new JTextField(10);
        tNo_.setFont(new Font("Serif", Font.PLAIN, 14));
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridwidth = 3;
        _gbc.gridx = 1;
        _gbc.gridy = 0;
        panel2.add(tNo_, _gbc);

        name_ = new JTextField(10);
        name_.setFont(new Font("Serif", Font.PLAIN, 14));
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridwidth = 3;
        _gbc.gridx = 1;
        _gbc.gridy = 1;
        panel2.add(name_, _gbc);

        to_ = new JTextField(10);
        to_.setFont(new Font("Serif", Font.PLAIN, 14));
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridwidth = 3;
        _gbc.gridx = 1;
        _gbc.gridy = 2;
        panel2.add(to_, _gbc);

        from_ = new JTextField(10);
        from_.setFont(new Font("Serif", Font.PLAIN, 14));
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridwidth = 3;
        _gbc.gridx = 1;
        _gbc.gridy = 3;
        panel2.add(from_, _gbc);

        submit_ = new JButton("Submit");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.anchor = GridBagConstraints.PAGE_END;
        _gbc.insets = new Insets(10, 10, 10, 0); // top padding
        _gbc.gridwidth = 1;
        _gbc.weightx = 3;
        _gbc.gridx = 1;
        _gbc.gridy = 4;
        panel2.add(submit_, _gbc);

        reset_ = new JButton("Reset");
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.anchor = GridBagConstraints.PAGE_END;
        _gbc.insets = new Insets(10, 10, 10, 0); // top padding
        _gbc.weightx = 3;
        _gbc.gridx = 2;
        _gbc.gridy = 4;
        panel2.add(reset_, _gbc);

        tabbedPane.addTab("Booking", null, panel2, "Book reservation");

        add(tabbedPane, BorderLayout.CENTER);

        HandlerClass handler = new HandlerClass();
        submit.addActionListener(handler);
        submit_.addActionListener(handler);
        reset.addActionListener(handler);
        reset_.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ResultSet _rs;
            if (event.getSource() == submit || event.getSource() == reset) {
                if (event.getSource() == submit) {
                    String aaa = null;
                    String t = tNo.getText();
                    String n = name.getText();
                    String tow = to.getText();
                    String fro = from.getText();
                    String[] stat = { t, n, tow, fro };

                    Checking check = new Checking(stat);
                    _rs = check.find(stat);
                    try {
                        aaa = Ender.ender(_rs);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println(aaa);
                    JOptionPane.showMessageDialog(null, aaa);
            }
            else if (event.getSource()==reset){
                tNo.setText("");
                name.setText("");
                to.setText("");
                from.setText("");
            }
        }
        
        else if (event.getSource()==submit_){
            String t = tNo_.getText();
            String n = name_.getText();
            String tow = to_.getText();
            String fro = from_.getText();
            String rquery = String.format("Insert into bookings Values(%s,'%s','%s','%s')",t,n,tow,fro);
            Reservation.book(rquery);

            JOptionPane.showMessageDialog(null, "Done!");
            tNo_.setText("");
            name_.setText("");
            to_.setText("");
            from_.setText("");

        }
        else if (event.getSource()==reset_){
            tNo_.setText("");
            name_.setText("");
            to_.setText("");
            from_.setText("");
        }
    }
}
}