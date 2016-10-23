package keycomponentgenerator;
public class KeyComponentGenerator {
    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        MainJFrame a = new MainJFrame();
        a.setVisible(true);
    }

}
