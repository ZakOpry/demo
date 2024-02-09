package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

public class DemoControllerTest {

    @InjectMocks
    private DemoController demoController;

    @Mock
    private GetJokes getJokes;


    @Before
    public void init(){
        openMocks(this);
    }

    @Test
    public void testController() throws IOException, InterruptedException {
        when(demoController.getJoke()).thenReturn("TEST");
        assertEquals("TEST", demoController.getJoke());
    }

}
