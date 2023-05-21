package temp;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    private GameStartScreen gameStartScreen;

    public StartPanel(GameStartScreen gameStartScreen) {
        this.gameStartScreen = gameStartScreen;

        JButton startButton = new JButton("게임 시작");
        JButton exitButton = new JButton("EXIT");
        JButton optionButton = new JButton("옵션");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStartScreen.showNextScreen();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        optionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("옵션 버튼이 눌렸습니다.");
            }
        });

        add(startButton);
        add(exitButton);
        add(optionButton);
    }
}