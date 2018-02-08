package practicalfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * This class uses another class to produce simple graphical output.
 * The program will display a complementary color scheme.
 *
 * <p>Bugs: This program has no known bugs, but is missing code.
 *
 * @author Janyl Jumadinova
 */
public class DisplayComplementaryDrawingCanvas {

  // declare variables that can store the user's color values
  public static int redValue;
  public static int greenValue;
  public static int blueValue;

  // define the CANVAS_HEIGHT and CANVAS_WIDTH of the graphic
  public static final int CANVAS_WIDTH = 600;
  public static final int CANVAS_HEIGHT = 400;

  /**
   * The main method will input values from a file and display the canvas.
   * The program will display a complementary color scheme, using some
   * methods that are provided by another Java class.
   *
   * <p>Bugs: This program has no known bugs.
   *
   * @author Janyl Jumadinova
   */
  public static void main(String[] args) {
    // declare the starting file and scanner
    File colorValuesInputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      colorValuesInputFile = new File("input/color_values.txt");
      scanner = new Scanner(colorValuesInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // TODO Step One: Read in the RED color value

    // TODO Step Two: Read in the GREEN color value

    // TODO Step Three: Read in the BLUE color value

    // Step Four: Create the JFrame window
    JFrame window = new JFrame("Janyl Jumadinova " + new Date());
    // Step Five: Add the drawing canvas and do necessary things to
    // make the window appear on the screen!
    window.getContentPane().add(new PaintComplementaryDrawingCanvas());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Step Six: ensure that the window is visible, enabling it to display boxes
    window.setVisible(true);
    
    // TODO Step Seven: set the size for the window that will contain the colored boxes

  }
}
