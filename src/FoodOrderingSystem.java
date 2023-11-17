import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private javax.swing.JPanel JPanel;

    public FoodOrderingSystem(){
        JRadioButton [] rbDiscounts = {rb5, rb10, rb15, rbNone};
        rbNone.setSelected(true);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float sum = 0.00F;

                if(cPizza.isSelected()){
                    sum += 100;
                }
                if(cBurger.isSelected()){
                    sum += 80;
                }
                if(cFries.isSelected()){
                    sum += 65;
                }
                if(cSoftDrinks.isSelected()){
                    sum += 55;
                }
                if(cTea.isSelected()){
                    sum += 50;
                }
                if(cSundae.isSelected()){
                    sum += 40;
                }
                if(rbNone.isSelected()){
                    sum += 0;
                }
                if(rb15.isSelected()){
                    sum *= 0.85;
                }
                if(rb10.isSelected()){
                    sum *= 0.90;
                }
                if(rb5.isSelected()){
                    sum *= 0.95;
                }

                JOptionPane.showMessageDialog(null,"The total price is Php " + String.format("%.2f",sum));
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.JPanel);
        JButton btn = new JButton("Order");
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);

    }
}
