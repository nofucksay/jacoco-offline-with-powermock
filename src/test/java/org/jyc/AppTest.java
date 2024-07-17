package org.jyc;

import static org.junit.Assert.assertTrue;
import static org.powermock.api.mockito.PowerMockito.spy;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.Bytecode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Unit test for simple App.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(App.class)
public class AppTest 
{

    @Test
    public void testMethod() throws Exception {
        App spy = spy(new App());
        PowerMockito.doReturn("mock str").when(spy, "privateMethod");
        String test = spy.testMethod(" test");
        Assert.assertNotNull(test);
    }
}
