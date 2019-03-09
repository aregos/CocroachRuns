import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.File;
import java.io.IOException;

public class Cockroach extends Canvas implements Runnable{
    private static final int STEP = 20;
    private String name;
    private int speed;
    private int x;
    private int y;
    private BufferStrategy bs = null;
    private String imagePath = "C:\\Users\\Roman\\IdeaProjects\\CocroachRuns\\src\\images\\cockroach.jpg";
    Image image;
    public int id;
    public Cockroach(int id) throws IOException {
        image =  ImageIO.read(new File(imagePath));
        this.id = id;
        x = 200;
        y = 100 + id * 50;
        setVisible(true);
    }

    @Override
    public void run() {
        try {
                while (x != 1000) {
                    render();
                    Thread.sleep(300);
                    update();
                }
                System.out.println("Cocroach with id " + id + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void render(){
        if (bs == null){
            createBufferStrategy(2);
            bs = getBufferStrategy();
        }
        Graphics g = bs.getDrawGraphics();
        paintComponent(g);
        g.dispose();
        bs.show();
    }

    private void update(){
        x += STEP;
    }

    public void paintComponent(Graphics g){
        super.paint(g);
        if (image != null){
            g.drawImage(image,getX(),getY() ,null);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int x){
        setX(x);
    }

}
