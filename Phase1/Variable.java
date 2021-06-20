class Variable{
    public static void main(String[] args) {
        //No Default
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        //Has default
        int number = 10;
        float count = 20.5f;
        char c = 'A';
        boolean s = true;

        //many Variable
        int a = 0, b = 1, d = 2;

        final int NUM1 = 10; //ค่าเรื่มต้น 10
        int num2 = 20; //ค่าเริ่มต้น 20
        final int NUM3;
        NUM3 = 422;
        // NUM1 = 50; ไม่ได้ เพราะกำหนด final แล้ว
        num2 = 100;
        System.out.println("ค่าตัวเลขที่ 1 = "+ NUM1); //แสดงผล num1
        System.out.println("ค่าตัวเลขที่ 2 = "+ num2); //แสดงผล num2
        System.out.println("ค่าตัวเลขที่ 3 = "+ NUM3); //แสดงผล num3

        /*int num1$ = 100;   ****กฏการตั้งชื่อ****
        int _num1 = 100;        ห้ามซ้ำกับคำสงวน
        int @num1 = 100;        ใช้สัญลักษณ์พิเศษได้ บางตัว
        int $num1 = 100;
        int %num1 = 100;
        System.out.println(num1$);
         */

        { // Local Variable
            // ทำงานแค่ในปีกกา แสดงผลของนอกปีกกาไม่ได้
            int fk = 300;
            System.out.println(fk);
            // เอาตัว Global Variable มาใช้คำสั่งในปีกกาได้
            System.out.println("a = "+a);
        }

    }
}