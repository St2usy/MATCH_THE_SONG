package temp;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStartScreen extends JFrame {
    private StartPanel startPanel;
    private NextScreenPanel nextScreenPanel;
    private LobbyPanel lobbyPanel;

    public GameStartScreen() {
        setTitle("게임 시작 화면");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startPanel = new StartPanel(this);
        nextScreenPanel = new NextScreenPanel(this);
        lobbyPanel = new LobbyPanel(this);

        getContentPane().add(startPanel);
        setVisible(true);
    }

    public void showNextScreen() {
        getContentPane().remove(startPanel);
        getContentPane().add(nextScreenPanel);
        revalidate();
        repaint();
    }

    public void showLobbyScreen() {
        getContentPane().remove(nextScreenPanel);
        getContentPane().add(lobbyPanel);
        revalidate();
        repaint();
    }

    public void backtoNextScreen() {
        getContentPane().remove(lobbyPanel);
        getContentPane().add(nextScreenPanel);
        revalidate();
        repaint();
    }
}