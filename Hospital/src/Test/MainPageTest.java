package Test;

import junit.framework.TestCase;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class MainPageTest extends TestCase {
    private JFrame testFrame;

    protected void tearDown(  ) throws Exception {
        if (this.testFrame != null) {
            this.testFrame.dispose(  );
            this.testFrame = null;
        }
    }

    public JFrame getTestFrame(  ) {
        if (this.testFrame == null) {
            this.testFrame = new JFrame("Test");
        }
        return this.testFrame;
    }
}