package se.lexicon.model;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static se.lexicon.model.PetSequencer.*;

public class PetSequencerTest {

    @AfterClass
    public static void afterAll()  {
        System.out.println("I am running last");
    }

    @BeforeClass
    public static void beforeAll(){
        System.out.println("I am running first");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Setup is being executed");
        reset();
    }

    @After
    public void tearDown(){
        System.out.println("Tear down is being executed");
    }

    @Test
    public void nextPetId_should_return_1(){
        System.out.println("Running test 1");
        int expected = 1;

        int actual = nextPetId();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentId_should_return_0(){
        System.out.println("Running test 2");
        int expected = 0;

        int actual = getCurrentId();

        assertEquals(expected, actual);
    }

}
