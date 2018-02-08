package practicalfour;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * This class paints boxes using a complementary color scheme.
 *
 * <p>Bugs: This program has no known bugs, but is missing code.
 *
 * @author Janyl Jumadinova
 */
public class PaintComplementaryDrawingCanvas extends JApplet {

  // declare the variables for the origin of the canvas
  private static final int HORIZONTAL_ORIGIN = 0;
  private static final int VERTICAL_ORIGIN = 0;

  // define the CANVAS_HEIGHT and CANVAS_WIDTH of the graphic
  public static final int CANVAS_WIDTH = 600;
  public static final int CANVAS_HEIGHT = 400;

  // define the maximum RGB value that is possible
  public static final int RGB_MAXIMUM = 255;

  /**
   * This method paints boxes using a complementary color scheme.
   *
   * @author Janyl Jumadinova
   */
  public void paint(Graphics page) {
    // Create the color based on the input values from the user
    Color userColor =
        new Color(DisplayComplementaryDrawingCanvas.redValue,
                  DisplayComplementaryDrawingCanvas.greenValue,
                  DisplayComplementaryDrawingCanvas.blueValue);

    // TODO: fill the first half (left-to-right) with the user's color
    // make calls to page.setColor and page.fillRect with the correct parameters


    // TODO: calculate the "complementary" color of the provided color
    // and store it in a new Color object called userComplementaryColor.
    // Refer to notes in the practical assignment sheet about this calculation.
    // Make sure to add your own calculation to replace the value of null!
    Color userComplementaryColor = null;

    // TODO: fill the second half (left-to-right) with the complement of the user's color
    // make calls to page.setColor and page.fillRect with the correct parameters

  }
}
