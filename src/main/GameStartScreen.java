package main;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStartScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("게임 시작 화면");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton startButton = new JButton("게임 시작");
        JButton exitButton = new JButton("EXIT");
        JButton optionButton = new JButton("옵션");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 게임 시작 버튼 눌렸을 때 동작할 코드 작성
                // 다음 화면으로 이동하는 로직 등을 추가하면 됩니다.
                System.out.println("게임 시작 버튼이 눌렸습니다.");
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

        frame.add(panel);
        frame.setVisible(true);
    }
}
