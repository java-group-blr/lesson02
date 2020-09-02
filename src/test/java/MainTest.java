import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainTest {

    private Class myCityClass;

    @Test
    public void getNameFieldTest() throws ClassNotFoundException, NoSuchFieldException {
        Field field = myCityClass.getDeclaredField("name");
        Assert.assertEquals(field.getGenericType(), String.class);
        Assert.assertEquals(Modifier.isPrivate(field.getModifiers()), true);
    }

    @Test
    public void getPopulationFieldTest() throws ClassNotFoundException, NoSuchFieldException {
        Field field = myCityClass.getDeclaredField("population");
        Assert.assertEquals(field.getGenericType(), int.class);
        Assert.assertEquals(Modifier.isPrivate(field.getModifiers()), true);

    }

    @Test
    public void getMAX_NUMBER_OF_PEOPLEFieldTest() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Field field = myCityClass.getDeclaredField("MAX_NUMBER_OF_PEOPLE");
        Assert.assertEquals(field.getGenericType(), Long.class);
        Assert.assertEquals(Modifier.isPublic(field.getModifiers()), true);
        Assert.assertEquals(Modifier.isFinal(field.getModifiers()), true);
        Assert.assertEquals(Modifier.isStatic(field.getModifiers()), true);
    }

    @Test
    public void getMethodTest() throws NoSuchMethodException {
        Method method = myCityClass.getMethod("printInfo");
        Assert.assertEquals(method.getGenericReturnType(), void.class);
        Assert.assertEquals(Modifier.isPublic(method.getModifiers()), true);
    }

    @Test
    public void getDefaultConstructorTest() throws NoSuchMethodException {
        Constructor constructor = myCityClass.getConstructor();
        Assert.assertEquals(Modifier.isPublic(constructor.getModifiers()), true);
    }

    @Test
    public void getCustomConstructorTest() throws NoSuchMethodException {
        Constructor constructor = myCityClass.getConstructor(int.class, String.class);
        Assert.assertEquals(Modifier.isPublic(constructor.getModifiers()), true);
    }

    @Test
    public void creatingTest() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor<?> ctor = myCityClass.getConstructor();
        Object object = ctor.newInstance(new Object[] {});
    }

    @Before
    public void setup() throws ClassNotFoundException {
        myCityClass = Class.forName("org.example.Main.City");
    }
}
