/**
 * File: LeftRightPanel.java
 *
 * Description: This class defines a GUI in a JPanel which contains
 * two JButtons with initial labels "Left" and "Right" and a
 * JTextField. Pressing a button causes the label of that button
 * to be printed into the textfield.
 *
 * Assignment: 1) Create a centerButton (label it "Center")
 *             2) Create another JPanel
 *             3) Add the Left,Center,Right Buttons to the JPanel
 *                in step 2
 *             4) Change the Layout Manager of LeftRightPanel to
 *                BorderLayout
 *             5) Place the JPanel of step 2 in the center position
 *                of LeftRightPanel
 *             6) Place the JTextField( outField ) in the south
 *                position of LeftRightPanel
 *             7) Change the ActionEvent code so the pressing the
 *                centerButton displays "center' in the outField
 */
/**
 * import java.awt.BorderLayout;
 import javax.swing.JButton;
 import javax.swing.JFrame;
 */



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class LeftRightPanel extends JPanel implements ActionListener
{
    private JButton leftButton, rightButton, centerButton;

    private JTextField outField;

    public LeftRightPanel()
    {
// HINT: setLayout Manager
        JPanel panel = new JPanel(new BorderLayout());
// HINT: create a new JPanel

        leftButton = new JButton("Left");
        leftButton.addActionListener(this);
        rightButton = new JButton("Right");
        rightButton.addActionListener(this);
        centerButton = new JButton("Center");
        centerButton.addActionListener(this);

// HINT: create Middle button, add event handler


        outField = new JTextField(10);
        outField.add(panel,BorderLayout.SOUTH);
        //panel.add(LeftRightPanel, BorderLayout.CENTER);


// HINT: add three buttons to the JPanel
        panel.add(leftButton, BorderLayout.LINE_START);
        panel.add(centerButton, BorderLayout.CENTER);
        panel.add(rightButton, BorderLayout.LINE_END);
// HINT: put everything together
//       JPanel goes in the CENTER position of LeftRightPanel
//       outField goes in the SOUTH position


// HINT: these are not needed in the new layout

        //add(leftButton);
        //add(outField);
       // add(rightButton);
       //add(centerButton);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton b = (JButton) e.getSource();
        outField.setText( b.getText() );

    } // actionPeformed()
} // LeftRightPanel class
