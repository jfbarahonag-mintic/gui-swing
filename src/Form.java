import javax.swing.JFrame;
import javax.swing.JLabel;

public class Form extends JFrame {
    private JLabel labelMTIC_, labelUTP_;
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
    }
}
