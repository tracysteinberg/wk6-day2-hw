import static org.junit.Assert.*;
import org.junit.*;



public class PhotographerTest {

    Photographer photographer;
    DigitalCamera digitalCamera;
    AnalogCamera analogCamera;
    Printable printable;
  

    @Before
    public void before() {
      photographer = new Photographer("Polaroid Land", "SX-70", "Nd Filter", "Lo", false);
      analogCamera = new AnalogCamera();
      digitalCamera = new DigitalCamera();
    

    }


    
    @Test
    public void hasName() {
       assertEquals( "Polaroid Land", photographer.getName() );

    }


    @Test
    public void hasModel() {
       assertEquals( "SX-70", photographer.getModel() );

    }


    @Test
    public void hasFilter() {
       assertEquals( "Nd Filter", photographer.getFilter() );

    }



    @Test
    public void hasResolution() {
       assertEquals( "Lo", photographer.getResolution() );

    }

     @Test
    public void hasNoiseReduction() {
       assertEquals( false, photographer.getNoiseReduction() );

    }


    @Test
    public void bagStartEmpty(camera) {
      assertEquals(0, photographer.cameraCount());


    }
    
    @Test
    public void canAddCamera() {
       photographer.add( digitalCamera);
       photographer.add( analogCamera);

       assertEquals(2, photographer.cameraCount());
    }

    

    @Test
    public void  canRemoveCamera() {
      photographer.remove(digitalCamera);
      assertEquals(1, photographer.cameraCount());

    }

    // @Test
    // public void canStoreHuman() {

    //  bear.eat(human);
    //  assertEquals (1, bear.foodCount());
    // }

    

}