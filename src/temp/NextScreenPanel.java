package temp;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextScreenPanel extends JPanel {
    private GameStartScreen gameStartScreen;

    public NextScreenPanel(GameStartScreen gameStartScreen) {
        this.gameStartScreen = gameStartScreen;

        JButton createButton = new JButton("방 만들기");
        JButton joinButton = new JButton("참여");

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStartScreen.showLobbyScreen();
                System.out.println("방 만들기 버튼이 눌렸습니다.");
            }
        });

        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("참여 버튼이 눌렸습니다.");
            }
        });

        add(createButton);
        add(joinButton);
    }
}