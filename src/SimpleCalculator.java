import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{

    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private javax.swing.JPanel JPanel;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextArea textArea1;

    public SimpleCalculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String n1, n2;
                    n1 = tfNumber1.getText();
                    n2 = tfNumber2.getText();
                    double num1 = Double.parseDouble(n1);
                    double num2 = Double.parseDouble(n2);
                    double res = 0;

                    if(cbOperations.getSelectedIndex() == 0){
                        res = num1 + num2;
                        lblResult.setText(String.valueOf(res));

                    } else if (cbOperations.getSelectedIndex() == 1) {
                        res = num1 - num2;
                        lblResult.setText(String.valueOf(res));

                    } else if (cbOperations.getSelectedIndex() == 2) {
                        res = num1 * num2;
                        lblResult.setText(String.valueOf(res));

                    } else if (cbOperations.getSelectedIndex() == 3) {
                        res = num1 / num2;
                        lblResult.setText(String.valueOf(res));
                    }
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Invalid input! Must not be empty or must be a number! ");
                }

            }
        });
    }
    public static void main(String[] args) {
            SimpleCalculator app = new SimpleCalculator();
            app.setContentPane(app.JPanel);
            JButton btn = new JButton("Compute Result");
            app.setSize(1000, 600);
            app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            app.setTitle("Simple Calculator");
            app.setVisible(true);

    }
}
