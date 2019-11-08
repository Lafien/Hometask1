import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWin extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextArea jta = new JTextArea();
     MainWin() {

        Container c = getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        c.add(new JLabel("Welcome! Press the desired button"));
        c.add(new JLabel("1. To sort arrays, enter the dimension and click button \"Sorting arrays\""));
        c.add(new JLabel("2. Enter a number to calculate the factorial and press button \"Calculate factorial\""));
        c.add(new JLabel("3. To draw pictures, click \"Nested loops\""));
        c.add(new JLabel("4. For tasks on one-dimensional arrays, click \"One-dimensional arrays\""));
        c.add(new JLabel("5. For tasks on multidimensional arrays, click \"Multidimensional arrays\""));
        c.add(new JLabel("6. To clear the screen, press the button \"Screen Clear\""));

        c.add(new JScrollPane(jta));
        JButton jbt = new JButton("Sorting arrays");
        jbt.addActionListener(this);
        c.add(jbt, BorderLayout.SOUTH);

        JButton jbt2 = new JButton("Calculate factorial");
        jbt2.addActionListener(this);
        c.add(jbt2, BorderLayout.SOUTH);
        JButton jbt3 = new JButton("Nested loops");
        jbt3.addActionListener(this);
        c.add(jbt3, BorderLayout.SOUTH);
        JButton jbt4 = new JButton("One-dimensional arrays");
        jbt4.addActionListener(this);
        c.add(jbt4, BorderLayout.SOUTH);
        JButton jbt5 = new JButton("Multidimensional arrays");
        jbt5.addActionListener(this);
        c.add(jbt5, BorderLayout.SOUTH);
        JButton jbt6 = new JButton("Screen Clear");
        jbt6.addActionListener(this);
        c.add(jbt6, BorderLayout.SOUTH);

        jta.setLineWrap(true);

        setTitle("Example window");
        setPreferredSize(new Dimension(860, 540));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getActionCommand().equals("Sorting arrays")) {
            try {
                int n = Integer.parseInt(jta.getText());
                SortArray ar1 = new SortArray(n);
                jta.append("\n" + SortArray.BubbleSort(ar1.arr1) + "\n" + SortArray.DefaultSort(ar1.arr2) + "\n" + SortArray.ChooseSort(ar1.arr3));
            } catch (NumberFormatException e) {
                jta.append("\nIncorrect input. Clear the screen, enter a value and press the button.");
            }

        }
        if (arg0.getActionCommand().equals("Calculate factorial")) {
            try {
                int n = Integer.parseInt(jta.getText());
                Factorial f1 = new Factorial(n);
                jta.append("\n" + Factorial.factorial(f1.n) + "\n" + Factorial.factorialRecurse(f1.n));
            } catch (NumberFormatException e) {
                jta.append("\nIncorrect input. Clear the screen, enter a value and press the button.");
            }
        }

        if (arg0.getActionCommand().equals("Nested loops")) {
            jta.setText("");
            new NestedLoops();
            jta.append(NestedLoops.rectangle()+"\n"+ NestedLoops.triangleClassic() + "\n"+ NestedLoops.triangleReverse() + "\n" + NestedLoops.emptySquare());
        }

        if (arg0.getActionCommand().equals("One-dimensional arrays")) {
            jta.setText("");
            new OneDimensionalArrays();

            jta.append(OneDimensionalArrays.ArrayOfOddNumbers()+ OneDimensionalArrays.EvenAndOddArrayElements()+
                    OneDimensionalArrays.ReplaceAnElementWithAnOddIndex()+ OneDimensionalArrays.MaximumAndMinimumArrayElement()+
                    OneDimensionalArrays.TheAverageValuesOfTwoArrays()
                    + OneDimensionalArrays.RepeatingAnElementInAnArray());
        }

        if (arg0.getActionCommand().equals("Multidimensional arrays")) {
            jta.setText("");
            new MultidimensionalArrays();
            jta.append(MultidimensionalArrays.SumAndMultDiagonal()+MultidimensionalArrays.FindingTheMaximumElementInTwoDimensionalArray()+
                    MultidimensionalArrays.TheLineWithTheLargestProduct() + MultidimensionalArrays.SortingArrayLines());
        }

        if (arg0.getActionCommand().equals("Screen Clear")) {

            jta.setText("");
        }
    }

    public static void main(String args[]) {
        new MainWin();
    }
}




