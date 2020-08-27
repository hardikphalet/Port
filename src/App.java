import javax.swing.JFrame;

class App{
    public static void main(String[] args) {
        Resources app = new Resources();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}