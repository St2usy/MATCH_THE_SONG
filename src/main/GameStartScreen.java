package main;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStartScreen extends JFrame {
    private JPanel panel;
    private JPanel nextScreenPanel;
    private JPanel lobbyPanel;

    public GameStartScreen() {
        setTitle("게임 시작 화면");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        nextScreenPanel = new JPanel();
        lobbyPanel = new JPanel();

        JButton startButton = new JButton("게임 시작");
        JButton exitButton = new JButton("EXIT");
        JButton optionButton = new JButton("옵션");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(panel);
                getContentPane().add(nextScreenPanel);
                revalidate();
                repaint();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // EXIT 버튼 눌렸을 때 동작할 코드 작성
                // 프로그램 종료 등을 추가하면 됩니다.
                System.exit(0);
            }
        });

        optionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 옵션 버튼 눌렸을 때 동작할 코드 작성
                // 옵션 화면으로 이동하는 로직 등을 추가하면 됩니다.
                System.out.println("옵션 버튼이 눌렸습니다.");
            }
        });

        panel.add(startButton);
        panel.add(exitButton);
        panel.add(optionButton);

        getContentPane().add(panel);
        setVisible(true);

        setupNextScreen();
        setupLobbyScreen();
    }

    private void setupNextScreen() {
        JButton createButton = new JButton("방 만들기");
        JButton joinButton = new JButton("참여");

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(nextScreenPanel);
                getContentPane().add(lobbyPanel);
                revalidate();
                repaint();
                System.out.println("방 만들기 버튼이 눌렸습니다.");
            }
        });

        nextScreenPanel.add(createButton);
        nextScreenPanel.add(joinButton);
    }

    private void setupLobbyScreen() {
        JButton lobbyButton = new JButton("로비 화면으로 돌아가기");

        lobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(lobbyPanel);
                getContentPane().add(nextScreenPanel);
                revalidate();
                repaint();
            }
        });

        lobbyPanel.add(lobbyButton);
    }
}