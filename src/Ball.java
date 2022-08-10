import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int startSpeed =2;

    Ball(int xPosition, int yPosition, int width, int height){
        super(xPosition,yPosition,width,height);
        random = new Random();

        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0 )
            randomXDirection--;
        setXDirection((randomXDirection*startSpeed));

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0 )
            randomYDirection--;
        setYDirection((randomYDirection*startSpeed));
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void move(){
        x += xVelocity;
        y +=yVelocity;
    }
    public void draw (Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(x,y,height,width);
    }
}
