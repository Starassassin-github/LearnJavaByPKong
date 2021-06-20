class Typecasting{
    public static void main(String[] args) {
        // จากเล็กไป => ใหญ่
        int numInt = 10;
        double numDouble = numInt;
        System.out.println(numInt);
        System.out.println(numDouble);

        // จากใหญ่ไป => เล็ก
        double numDouble2 = 10.0;
        // ทำแบบนี้ไม่ได้ จากใหญ่ไปเล็ก int numInt2 = numDouble2;
        int numInt2 = (int)numDouble2;
        System.out.println(numInt2);
    }
}