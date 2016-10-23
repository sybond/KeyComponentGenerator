package keycomponentgenerator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.AbstractDocument;

public class MainJFrame
  extends JFrame
{
  private static final byte[] jdField_a_of_type_ArrayOfByte = { -13, -13, -82, 18, 123, 83, 6, 58, 109, -15, -76, -108, -24, -128, -78, -48, -69, -115, -78, -125, 45, -117, 36, 60, -71, -102, 121, -24, 118, 107, -14, 97, -49, 112, 26, -85, -43, 22, -83, -2, -32, 44, -37, 98, -8, 4, -110, 79, 88, -8, -107, 63, 77, -80, -1, 1, -65, -115, 34, 50, 43, 7, -36, 58, 9, -32, -100, -61, -73, 29, -2, -94, -103, -115, 74, 71, -24, -55, 96, -97, -116, -85, -40, 86, -24, 73, 127, -6, 84, -96, 89, -96, -115, -30, 15, 18, -4, 88, 33, 1, -104, -11, -30, 80, 55, -88, 38, -83, 78, 83, 80, -16, 126, 75, 84, 115, -22, -108, -85, 22, -8, 17, 21, -123, 8, 60, -87, 123, -121, -82, -21, 96, 107, 51, -41, -58, -12, 36, -122, -85, -57, 18, -25, -88, 73, -63, 22, 120, 61, -44, 75, -20, 47, 16, -98, 74, -54, -77, -90, -17, 43, -11, 58, -96, 105, 31, -47, 2 };
  private static final String jdField_a_of_type_JavaLangString = new String(b.b(new byte[] { -120, -90, -25, 2, 8, 12, 91, 122, 50, -81, -31, -54, -84, -112, -59, -123, -33 }));
  private static final String jdField_b_of_type_JavaLangString = new String(b.b(new byte[] { -26, -51, -25, 31, 1, 125, 70, 12, 99, -78, -73, -89, -73, -5, -37, -24, -22, -77, -16, -49, 96, -91, 123, 86, -8, -31, 122, -57, 126, 50, -79, 62, -110, 101 }));
  private JMenuItem jdField_a_of_type_JavaxSwingJMenuItem;
  private JMenu jdField_a_of_type_JavaxSwingJMenu;
  private JButton jdField_a_of_type_JavaxSwingJButton;
  private JPasswordField jdField_a_of_type_JavaxSwingJPasswordField;
  private JPanel jdField_a_of_type_JavaxSwingJPanel;
  private JScrollPane jdField_a_of_type_JavaxSwingJScrollPane;
  private JLabel jdField_a_of_type_JavaxSwingJLabel;
  private JLabel jdField_b_of_type_JavaxSwingJLabel;
  private JLabel c;
  private JMenuBar jdField_a_of_type_JavaxSwingJMenuBar;
  private JSpinner jdField_a_of_type_JavaxSwingJSpinner;
  private JTextArea jdField_a_of_type_JavaxSwingJTextArea;
  
  public MainJFrame()
  {
    Object localObject1 = this;
    this.jdField_a_of_type_JavaxSwingJPanel = new JPanel();
    ((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel = new JLabel();
    ((MainJFrame)localObject1).c = new JLabel();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner = new JSpinner();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel = new JLabel();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton = new JButton();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField = new JPasswordField();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJScrollPane = new JScrollPane();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea = new JTextArea();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuBar = new JMenuBar();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenu = new JMenu();
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuItem = new JMenuItem();
    ((MainJFrame)localObject1).setDefaultCloseOperation(3);
    ((MainJFrame)localObject1).setTitle("Key Component Generator v1.2");
    ((MainJFrame)localObject1).setAlwaysOnTop(true);
    ((MainJFrame)localObject1).setMinimumSize(new Dimension(463, 322));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPanel.setBorder(null);
    ((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.setFont(((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.getFont().deriveFont(((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.getFont().getStyle() | 0x1, 11.0F));
    ((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.setIcon(new ImageIcon(localObject1.getClass().getResource("/keycomponentgenerator/key.png")));
    ((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.setText("Key");
    ((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel.setToolTipText("");
    ((MainJFrame)localObject1).c.setFont(((MainJFrame)localObject1).c.getFont());
    ((MainJFrame)localObject1).c.setText("Number of key components :");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner.setFont(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner.getFont().deriveFont(12.0F));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner.setModel(new SpinnerNumberModel(3, 2, 9, 1));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner.setToolTipText("Number of key components to be generated");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.setFont(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.getFont().deriveFont(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.getFont().getStyle() | 0x1));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.setForeground(new Color(0, 0, 255));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.setIcon(new ImageIcon(localObject1.getClass().getResource("/keycomponentgenerator/checked.png")));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.setText("000000");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel.setToolTipText("The is the key check value of the key");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.setFont(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.getFont().deriveFont(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.getFont().getStyle() | 0x1, 12.0F));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.setIcon(new ImageIcon(localObject1.getClass().getResource("/keycomponentgenerator/gear.png")));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.setText("Generate");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.setToolTipText("Click to generate key components");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton.addMouseListener(new b((MainJFrame)localObject1));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField.setFont(new Font("Monospaced", 1, 12));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField.setToolTipText("Enter your key here (hex string format)");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField.addCaretListener(new c((MainJFrame)localObject1));
    Object localObject2 = new GroupLayout(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPanel);
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPanel.setLayout((LayoutManager)localObject2);
    ((GroupLayout)localObject2).setHorizontalGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)localObject2).createSequentialGroup().addContainerGap().addGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField).addGroup(((GroupLayout)localObject2).createSequentialGroup().addComponent(((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel)).addGroup(((GroupLayout)localObject2).createSequentialGroup().addComponent(((MainJFrame)localObject1).c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton, -2, 199, -2).addGap(0, 31, 32767))).addContainerGap()));
    ((GroupLayout)localObject2).setVerticalGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, ((GroupLayout)localObject2).createSequentialGroup().addContainerGap().addGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(((MainJFrame)localObject1).jdField_b_of_type_JavaxSwingJLabel).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJLabel)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPasswordField, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(((MainJFrame)localObject1).c).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJSpinner, -2, -1, -2).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJButton)).addContainerGap(-1, 32767)));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea.setColumns(20);
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea.setFont(new Font("Monospaced", 0, 12));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea.setRows(5);
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea.setMargin(new Insets(4, 4, 4, 4));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJScrollPane.setViewportView(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJTextArea);
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenu.setIcon(new ImageIcon(localObject1.getClass().getResource("/keycomponentgenerator/help.png")));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenu.setText("Help");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuItem.setText("About");
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuItem.addMouseListener(new d((MainJFrame)localObject1));
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenu.add(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuItem);
    ((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuBar.add(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenu);
    ((MainJFrame)localObject1).setJMenuBar(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJMenuBar);
    localObject2 = new GroupLayout(((MainJFrame)localObject1).getContentPane());
    ((MainJFrame)localObject1).getContentPane().setLayout((LayoutManager)localObject2);
    ((GroupLayout)localObject2).setHorizontalGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPanel, -1, -1, 32767).addGroup(((GroupLayout)localObject2).createSequentialGroup().addContainerGap().addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJScrollPane).addContainerGap()));
    ((GroupLayout)localObject2).setVerticalGroup(((GroupLayout)localObject2).createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(((GroupLayout)localObject2).createSequentialGroup().addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJPanel, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(((MainJFrame)localObject1).jdField_a_of_type_JavaxSwingJScrollPane, -1, 167, 32767).addContainerGap()));
    ((MainJFrame)localObject1).pack();
    localObject1 = ClassLoader.getSystemResource("keycomponentgenerator/main.png");
    setIconImage(Toolkit.getDefaultToolkit().getImage((URL)localObject1));
    localObject1 = this;
    (localObject2 = (AbstractDocument)this.jdField_a_of_type_JavaxSwingJPasswordField.getDocument()).setDocumentFilter(new a((MainJFrame)localObject1));
  }
  
  private static String a(String paramString)
  {
    if (paramString.length() <= 16) {
      return paramString.concat(jdField_a_of_type_JavaLangString).substring(0, 16);
    }
    if (paramString.length() <= 32) {
      return paramString.concat(jdField_a_of_type_JavaLangString).substring(0, 32);
    }
    if (paramString.length() <= 48) {
      return paramString.concat(jdField_a_of_type_JavaLangString).substring(0, 48);
    }
    return paramString.substring(0, 48);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    try
    {
      for (String str : ) {
        if ("Nimbus".equals(str.getName()))
        {
          UIManager.setLookAndFeel(str.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException paramArrayOfString)
    {
      Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, paramArrayOfString);
    }
    catch (InstantiationException paramArrayOfString)
    {
      Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, paramArrayOfString);
    }
    catch (IllegalAccessException paramArrayOfString)
    {
      Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, paramArrayOfString);
    }
    catch (UnsupportedLookAndFeelException paramArrayOfString)
    {
      Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, paramArrayOfString);
    }
    EventQueue.invokeLater(new e());
  }
}
