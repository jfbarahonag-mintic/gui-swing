import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        Form f =  new Form();
        f.setBounds(0, 0, 400, 600);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
