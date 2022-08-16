import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle {
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Moja", Font.PLAIN, 60));

        // draww score
        g.drawString((player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 60);
        g.drawString((player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 60);

        g.setColor(Color.gray);
        // draw linw
        g.drawLine(GAME_WIDTH / 2, 5, GAME_WIDTH / 2, GAME_HEIGHT - 5); // line in center
        g.drawOval(GAME_WIDTH / 2 - 50, GAME_HEIGHT / 2 - 50, 100, 100); // circle in center
        g.fillOval(GAME_WIDTH / 2 - 5, GAME_HEIGHT / 2 - 5, 10, 10); // dot in center
        g.drawLine(0, 5, GAME_WIDTH, 5);// upper line
        g.drawLine(0, GAME_HEIGHT - 5, GAME_WIDTH, GAME_HEIGHT - 5);// bottom line
        g.drawRect(GAME_WIDTH / 2 - 100, 5, 200, 70); // draw box for score
        g.drawRect(GAME_WIDTH / 2 - 105, 0, 210, 80); // draw box 2 for score
    }
}
