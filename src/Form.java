import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;

public class Form extends JFrame implements ActionListener {
    private JLabel labelMTIC_, labelUTP_;
    private JButton buttonHello_;
    public Form()
    {
        // establish all components needed
        setLayout(null);
        
        labelMTIC_ = new JLabel("Mision TIC 2022");
        labelMTIC_.setBounds(10,20, 300, 30);
        add(labelMTIC_);
        
        labelUTP_ = new JLabel("UTP");
        labelUTP_.setBounds(10,40, 30, 30);
        add(labelUTP_);

        buttonHello_ = new JButton("Hello");
        buttonHello_.setBounds(270, 200, 70, 25);
        // where is the listener can be found?
        buttonHello_.addActionListener(this);

        add(buttonHello_);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonHello_)
        {
            JDialog tempDlg = new JDialog(this, "Mouse event");
            tempDlg.setBounds(50, 50, 80, 200);
            JLabel tempLbl = new JLabel("Hello world");
            tempLbl.setBounds(0, 0, 0, 0);
            tempDlg.setVisible(true);
            tempDlg.add(tempLbl);
        }
    }
}
