import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGUI extends JFrame{
    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel textLabel;
    private int characterX;
    private int characterY;
    public GameGUI(){
        setTitle("Game Zombie Run");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon backgroundImage = new ImageIcon("src/asset/background.jpg");
        backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0,0,800,900);
        add(backgroundLabel);
        ImageIcon characterImage = new ImageIcon("src/asset/jombi.png");
        characterLabel = new JLabel(characterImage);
        characterLabel.setBounds(200,200,228,405);
        backgroundLabel.add(characterLabel);

        textLabel = new JLabel("Hello, welcome to my game!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(Color.BLACK);
        textLabel.setBounds(350,200,400,30);
        backgroundLabel.add(textLabel);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode){
                    case KeyEvent.VK_W :
                        characterY -= 10;
                        break;
                    case KeyEvent.VK_S:
                        characterY += 10;
                        break;
                    case KeyEvent.VK_A:
                        characterX -= 10;
                        break;
                    case KeyEvent.VK_D:
                        characterX += 10;
                        break;
                }
                characterLabel.setLocation(characterX, characterY);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });



        setVisible(true);

    }

    public SIGUI

}
