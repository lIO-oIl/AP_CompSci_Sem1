/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
    public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture saw = new Picture("smallerSaw.jpg");
	saw.explore();
    saw.keepOnlyBlue();
    saw.explore();
  }
  
  public static void testNegate()
  {
    Picture saw = new Picture("smallerSaw.jpg");
    saw.negate();
    saw.explore();
  }
  
  public static void testGrayscale()
  {
    Picture saw = new Picture("smallerSaw.jpg");
    saw.grayscale();
    saw.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture fish = new Picture("water.jpg");
    fish.explore();
    fish.FixUnderwater();
    fish.explore();
  }
  
  public static void testMirrorArms()
  {
	Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture beach = new Picture("seagull.jpg");
	beach.explore();
	beach.MirrorGull();
	beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture saw = new Picture("smallerSaw.jpg");
    saw.mirrorVerticalRightToLeft();
    saw.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture mot = new Picture("redMotorcycle.jpg");
    mot.mirrorHorizontal();
    mot.explore();
  }
  
  public static void testMirrorBotToTop()
  {
    Picture saw = new Picture("redMotorcycle.jpg");
    saw.mirrorBotToTop();
    saw.explore();
  }
  
  public static void testCopy()
  {
    Picture saw = new Picture("smallerSaw.jpg");
	Picture motor = new Picture("redMotorcycle.jpg");
    saw.copy2(motor, 10, 200, 10, 200);
    saw.explore();
  }
  
  public static void testMyCollage()
  {
	Picture swan = new Picture("swan.jpg");
    Picture saw = new Picture("smallerSaw.jpg");
	Picture motor = new Picture("redMotorcycle.jpg");
	Picture myCollage = new Picture("myCollage.jpg");
	myCollage.createMyCollage(swan, saw, motor);
	myCollage.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	testMirrorHorizontal();
    //testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
	testMirrorVerticalRightToLeft();
	//testMirrorBotToTop();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMyCollage();
  }
}