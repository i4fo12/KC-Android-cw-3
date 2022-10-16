<<<<<<<< HEAD:MyApplication/app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.java
package com.example.myapplication;
========
package com.example.lounchcontrol;
>>>>>>>> fecff14267f491ab81a2774ffcd330e9e0c41242:lounchcontrol/app/src/androidTest/java/com/example/lounchcontrol/ExampleInstrumentedTest.java

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
<<<<<<<< HEAD:MyApplication/app/src/androidTest/java/com/example/myapplication/ExampleInstrumentedTest.java
        assertEquals("com.example.myapplication", appContext.getPackageName());
========
        assertEquals("com.example.lounchcontrol", appContext.getPackageName());
>>>>>>>> fecff14267f491ab81a2774ffcd330e9e0c41242:lounchcontrol/app/src/androidTest/java/com/example/lounchcontrol/ExampleInstrumentedTest.java
    }
}