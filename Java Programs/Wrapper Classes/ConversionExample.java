public class ConversionExample {
    public static void main(String[] args) {
        int a = 10;
        Integer aObj = Integer.valueOf(a);
        System.out.println("Int a : " + a + "  " + "Integer object : " + aObj);
        /*
        Primitive       wrapper class       Manual conversion(Boxing)          Manual conversion(Unboxing)
        int             Integer             Integer.value(i)                    obj.intValue()
        float           Float               Float.value(i)                      obj.intValue()
        double          Double              Double.value(i)                     obj.intValue()
        char            Character           Character.value(i)                  obj.intValue()
        boolean         Boolean             Boolean.value(i)                    obj.intValue()
        */
    }
}
