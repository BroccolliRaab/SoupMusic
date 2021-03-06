package FutureSoup.SoupMusic;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SkipButton extends Button{
    public static final int FORWARD = 1;
    public static final int BACKWARD = -1;

    private Image imageSkipForward = new Image(getClass().getResourceAsStream("resources/images/FF.png"), 50, 50, true, true);
    private Image imageSkipBackward = new Image(getClass().getResourceAsStream("resources/images/RR.png"), 50, 50, true, true);
    private ImageView imageViewSkipForward= new ImageView(imageSkipForward);
    private ImageView imageViewSkipBackward = new ImageView(imageSkipBackward);

    public SkipButton(int direction){
        if ( direction == FORWARD ){
            this.setGraphic(imageViewSkipForward);
        }else if (direction == BACKWARD){
            this.setGraphic(imageViewSkipBackward);
        }
    }
}
