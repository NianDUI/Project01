import com.niandui.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemplatesTest {

    // prsf private static final
    private static final int NUM = 1;
    // psf  public static final
    public static final Customer CUST = new Customer();
    // psfi public static final int
    public static final int NUM2 = 2;
    // psfs public static final String
    public static final String NATION = "china";

    // psvm
    public static void main(String[] args) {
        int[] a = new int[]{1, 3};

        // sout
        System.out.println();
        // soutp
        System.out.println("args = " + Arrays.deepToString(args));
        // soutm
        System.out.println("TemplatesTest.main");
        // soutv
        System.out.println("a = " + a);
        // xxx.sout
        System.out.println(a);

        // fori
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // iter
        for (int i : a) {
            System.out.println(i);
        }
        // itar
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            System.out.println(i1);
        }


        // list.for
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new int[]{1, 2, 3, 4, 8}));
        // list.for
        for (Object o : arrayList) {

        }
        // list.fori
        for (int i = 0; i < arrayList.size(); i++) {

        }
        // list.forr
        for (int i = arrayList.size() - 1; i >= 0; i--) {

        }


    }

    public void method() {
        List list = Arrays.asList(new int[]{1, 2, 3, 5});

        // ifn
        if (list == null) {
            
        }
        // inn
        if (list != null) {
            
        }
        // xxx.null
        if (list == null) {

        }
        // xxx.nn
        if (list != null) {

        }
    }


}
