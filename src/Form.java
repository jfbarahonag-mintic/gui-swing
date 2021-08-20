import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener, ItemListener, ChangeListener {

    private JLabel labelMTIC_, labelUTP_, labelName_;
    private JButton buttonHello_, buttonGreetings_, buttonAdd_, buttonRemove_;
    private JTextField fieldName_;
    private JTextArea areaInfo_;
    private JScrollPane scrollInfo_;
    private JComboBox<String> comboNames_;
    private ArrayList<String> names_;
    private JMenu menuSize_, menuBgColor_;
    private JMenuBar menuBar_;
    private JMenuItem menuItemSizeDefault_, menuItemSize640_480_, menuItemSize1024_768_;
    private JMenuItem menuItemColorDefault_, menuItemColorRed_, menuItemColorBlue_;
    private JCheckBox chBoxDisable_;

    private int defaultWidth_, defaultHeight_;
    private Color defaultBg_;

    public Form(int width, int height)
    {
        // establish all components needed
        setLayout(null);

        setBounds(0, 0, width, height);

        defaultHeight_ = getHeight();
        defaultWidth_ = getWidth();
        defaultBg_ = getBackground();
        
        labelMTIC_ = new JLabel("Mision TIC 2022");
        labelMTIC_.setBounds(10,20, 300, 30);
        add(labelMTIC_);
        
        labelUTP_ = new JLabel("UTP");
        labelUTP_.setBounds(10,40, 30, 30);
        add(labelUTP_);
        
        labelName_ = new JLabel("Name");
        labelName_.setBounds(10, 170, 70, 30);
        add(labelName_);

        buttonHello_ = new JButton("Hello");
        buttonHello_.setBounds(270, 200, 70, 25);
        // where is the listener can be found?
        buttonHello_.addActionListener(this);
        add(buttonHello_);
        
        buttonGreetings_ = new JButton("Say Hi");
        buttonGreetings_.setBounds(190, 200, 70, 25);
        // where the listener can be found?
        buttonGreetings_.addActionListener(this);
        add(buttonGreetings_);
        
        buttonAdd_ = new JButton("Add");
        buttonAdd_.setBounds(190, 235, 70, 25);
        // where the listener can be found?
        buttonAdd_.addActionListener(this);
        add(buttonAdd_);
        
        buttonRemove_ = new JButton("Remove");
        buttonRemove_.setBounds(270, 235, 81, 25);
        // where the listener can be found?
        buttonRemove_.addActionListener(this);
        add(buttonRemove_);

        fieldName_ = new JTextField();
        fieldName_.setBounds(10, 200, 170, 25);
        fieldName_.setFont(new Font("Arial", Font.ITALIC, 12));
        add(fieldName_);

        areaInfo_ = new JTextArea();
        scrollInfo_ = new JScrollPane(areaInfo_);
        scrollInfo_.setBounds(10, 80, 365, 90);
        areaInfo_.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sollicitudin molestie malesuada. Cras ultricies ligula sed magna dictum porta. Curabitur aliquet quam id dui posuere blandit. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Donec sollicitudin molestie malesuada. Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Donec sollicitudin molestie malesuada. Nulla porttitor accumsan tincidunt. Quisque velit nisi, pretium ut lacinia in, elementum id enim. Donec rutrum congue leo eget malesuada.\n"
        +"Donec rutrum congue leo eget malesuada. Proin eget tortor risus. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Pellentesque in ipsum id orci porta dapibus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Proin eget tortor risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque in ipsum id orci porta dapibus.\n"
        +"Vivamus magna justo, lacinia eget consectetur sed, convallis at tellus. Vivamus suscipit tortor eget felis porttitor volutpat. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Quisque velit nisi, pretium ut lacinia in, elementum id enim. Vivamus suscipit tortor eget felis porttitor volutpat. Pellentesque in ipsum id orci porta dapibus. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Vivamus suscipit tortor eget felis porttitor volutpat. Nulla quis lorem ut libero malesuada feugiat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula.\n"
        +"Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec velit neque, auctor sit amet aliquam vel, ullamcorper sit amet ligula. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Curabitur aliquet quam id dui posuere blandit. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Sed porttitor lectus nibh. Vestibulum ac diam sit amet quam vehicula elementum sed sit amet dui. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Curabitur aliquet quam id dui posuere blandit. Nulla quis lorem ut libero malesuada feugiat.\n"
        +"Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Proin eget tortor risus. Curabitur arcu erat, accumsan id imperdiet et, porttitor at sem. Nulla quis lorem ut libero malesuada feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris blandit aliquet elit, eget tincidunt nibh pulvinar a. Pellentesque in ipsum id orci porta dapibus. Nulla porttitor accumsan tincidunt. Proin eget tortor risus. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        add(scrollInfo_);

        names_ = new ArrayList<String>();
        names_.add("Viviana");
        names_.add("Felipe");
        names_.add("Teresa");
        names_.add("Carolina");
        names_.add("Carlos");
        names_.add("Emiliano");

        comboNames_ = new JComboBox<String>();
        comboNames_.setBounds(10, 235, 80, 20);
        // fill the combobox
        for (String name : names_) {
            comboNames_.addItem(name);
        }
        comboNames_.addItemListener(this);
        add(comboNames_);
        /**
         * menuBar[menu{menuItem}]
         */
        menuBar_ = new JMenuBar();
        setJMenuBar(menuBar_);
        /* ----------Sizes---------- */
        menuSize_ = new JMenu("Sizes");
        menuBar_.add(menuSize_);

        menuItemSize640_480_ = new JMenuItem("640*680");
        menuItemSize1024_768_ = new JMenuItem("1024*768");
        menuItemSizeDefault_ = new JMenuItem("Default");
        
        menuItemSize640_480_.addActionListener(this);
        menuItemSize1024_768_.addActionListener(this);
        menuItemSizeDefault_.addActionListener(this);
        
        menuSize_.add(menuItemSize640_480_);
        menuSize_.add(menuItemSize1024_768_);
        menuSize_.add(menuItemSizeDefault_);
        /* ----------Color---------- */
        menuBgColor_ = new JMenu("Color");
        menuBar_.add(menuBgColor_);

        menuItemColorBlue_ = new JMenuItem("Blue");
        menuItemColorRed_ = new JMenuItem("Red");
        menuItemColorDefault_ = new JMenuItem("Default");

        menuItemColorBlue_.addActionListener(this);
        menuItemColorRed_.addActionListener(this);
        menuItemColorDefault_.addActionListener(this);

        menuBgColor_.add(menuItemColorBlue_);
        menuBgColor_.add(menuItemColorRed_);
        menuBgColor_.add(menuItemColorDefault_);

        chBoxDisable_ = new JCheckBox("Disable Add/Remove");
        chBoxDisable_.setBounds(10, 265, 150, 20);
        chBoxDisable_.addChangeListener(this);
        add(chBoxDisable_);
    }

    /* buttons menuItems */
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

        if(e.getSource() == buttonGreetings_)
        {
            JDialog tempDlg = new JDialog(this, "Mouse event");
            tempDlg.setBounds(50, 50, 200, 100);
            JLabel tempLbl = new JLabel("Hello " + fieldName_.getText().toUpperCase());
            tempLbl.setBounds(0, 0, 0, 0);
            tempDlg.setVisible(true);
            tempDlg.add(tempLbl);
        }

        if(e.getSource() == buttonAdd_)
        {
            if (fieldName_.getText().length() == 0) {
                System.out.println("Not valid name");
                JOptionPane.showMessageDialog(this, "Not valid", "Add issue", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // repeated names should be ignored?
            comboNames_.addItem(fieldName_.getText());
            fieldName_.setText("");
        }
        
        if(e.getSource() == buttonRemove_)
        {
            String name = comboNames_.getSelectedItem().toString();
            comboNames_.removeItem(name);
            fieldName_.setText(name);
        }

        if (e.getSource() == menuItemSize640_480_) {
            setSize(640, 480);
        }
        
        if (e.getSource() == menuItemSize1024_768_) {
            setSize(1024, 768);
        }
        
        if (e.getSource() == menuItemSizeDefault_) {
            setSize(defaultWidth_, defaultHeight_);
        }

        if(e.getSource() == menuItemColorBlue_) {
            getContentPane().setBackground(new Color(0, 0, 255));
        }
        
        if(e.getSource() == menuItemColorRed_) {
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        
        if(e.getSource() == menuItemColorDefault_) {
            getContentPane().setBackground(defaultBg_);
        }
    }

    /* comboboxes */
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboNames_) {
            String name = comboNames_.getSelectedItem().toString();
            setTitle(name);
        }
    }

    /* checkbox */
    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == chBoxDisable_)
        {
            boolean enable = chBoxDisable_.isSelected() == true ? false : true; 
            buttonAdd_.setEnabled(enable);
            buttonRemove_.setEnabled(enable);
        }
    }
}
