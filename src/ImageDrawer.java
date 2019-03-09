import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageDrawer extends JPanel {
    private Image image;

    public ImageDrawer(Image image) {
        this.image = image;
    }

    public void setImage(String path) throws IOException {
        image = ImageIO.read(new File(path));
    }

    public Image getImage() {
        return image;
    }

    public void paint(Graphics g){

        super.paint(g);
        if (image != null){
            g.drawImage(image,400,400 ,null);
        }
    }

    public static ImageDrawer paintFuckingCock() throws IOException {
        Image image = ImageIO.read(new File("C:\\Users\\Roman\\IdeaProjects\\CocroachRuns\\src\\images\\cockroach.jpg"));
        ImageDrawer imageDrawer = new ImageDrawer(image);
        imageDrawer.paint(image.getGraphics());
        return imageDrawer;
    }


}
