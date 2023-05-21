package temp;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LobbyPanel extends JPanel {
    private GameStartScreen gameStartScreen;

    public LobbyPanel(GameStartScreen gameStartScreen) {
        this.gameStartScreen = gameStartScreen;

        JButton lobbyButton = new JButton("로비 화면으로 돌아가기");

        lobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStartScreen.backtoNextScreen();
            }
        });

        add(lobbyButton);
    }
}