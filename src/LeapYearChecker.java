import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame{
    private JButton btnCheckYear;
    private JTextField tfYear;
    private JLabel label1;
    private javax.swing.JPanel JPanel;

    public LeapYearChecker(){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String year = tfYear.getText();
                int yr = Integer.parseInt(year);
                if(yr%4 == 0 && yr%100 != 0 || yr%400 == 0){
                    JOptionPane.showMessageDialog(null, "Leap year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }

        });

    }
    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.JPanel);
        JButton btn = new JButton("Check");
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
