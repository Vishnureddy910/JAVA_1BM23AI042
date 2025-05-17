package BM23AI042;

public class boxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(10);
        Double boxedDouble = Double.valueOf(20.5);
        Character boxedChar = Character.valueOf('A');
        Boolean boxedBoolean = Boolean.valueOf(true);
        Float boxedFloat = Float.valueOf(30.5f);
        int unboxedInt = boxedInt.intValue();
        double unboxedDouble = boxedDouble.doubleValue();
        char unboxedChar = boxedChar.charValue();
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        float unboxedFloat = boxedFloat.floatValue();

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}
