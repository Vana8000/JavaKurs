public class Main {
    public static void main(String[] args) {
        int a, b, c;
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("������� a: ");
        a = s.nextInt();
        System.out.print("������� b: ");
        b = s.nextInt();
        System.out.print("������� c: ");
        c = s.nextInt();
        System.out.println("�� ����� �����: " + a + ", " + b + ", " + c);
        boolean found = false;

        if (a % 5 == 0) {
            found = true;
            System.out.println("a=" + a);
        }
        if (b % 5 == 0) {
            found = true;
            System.out.println("b=" + b);
        }
        if (c % 5 == 0) {
            found = true;
            System.out.println("c=" + c);
        }

        if (!found) {
            System.out.println("��� ��������, ������� 5 ");
        }

        int result = a / b;

        System.out.println("��������� �������������� ������� a �� b: " + result);

        double a1 = a;
        double b1 = b;
        double result1 = a1 / b1;
        System.out.println("��������� ������� a �� b: " + result1);

        double result2 = Math.ceil((double) a / b);

        System.out.println("��������� � ����������� �� ���������� ������ �������� � ������� �������: " + result2);

        double result3 = Math.floor((double) a / b);
        System.out.println("��������� � ����������� �� ���������� ������ �������� � ������� �������: " + (int) result3);

        double result4 = Math.round((double) a / b);
        System.out.println("��������� � ����������� �� ���������� ������ �������� � �������������� �����������: " + (int) result4);

        int remainder = b % c;

        System.out.println("������� �� ������� b �� c: " + remainder);

        int minValue = Math.min(a, b);

        System.out.println("���������� �������� �� a � b: " + minValue);

        int max = Math.max(b, c);

        System.out.println("���������� �������� �� b � c: " + max);
    }
}