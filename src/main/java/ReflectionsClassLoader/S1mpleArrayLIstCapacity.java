package ReflectionsClassLoader;

import com.sun.jdi.Bootstrap;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class S1mpleArrayLIstCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
          System.out.println(getCapacity(arrayList));
//        arrayList.add(1);
//        arrayList.remove(0);
        for (int i = 0; i < 23; i++) {
            arrayList.add(i);
        }
        System.out.println(getCapacity(arrayList));
        System.out.println(1 + 1 + "1")
;


    }
    public static int getCapacity(ArrayList<?> al) throws NoSuchFieldException, IllegalAccessException {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[])dataField.get(al)).length;
    }


}
