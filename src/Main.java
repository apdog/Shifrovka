import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Crypt crypt = new Crypt();
        System.out.println("��������� 1.0");

        while (true){
            System.out.println("�������� ����������� ��������.\n d-���������� ������\n e-������������ ������");
            Scanner scanOption = new Scanner(System.in);
            String so = scanOption.nextLine();
            if (so.equals("E") || so.equals("e")) {
                System.out.println("������� ����� ��� ����������: ");
                Scanner scanText = new Scanner(System.in);
                crypt.setTextToCrypt(scanText.nextLine());
                crypt.enCrypt();
                break;
            }
            else if (so.equals("D") || so.equals("d")) {
                System.out.println("������� ����� ��� ��������: ");
                Scanner scanText = new Scanner(System.in);
                crypt.setTextToCrypt(scanText.nextLine());
                crypt.deCrypt();
                break;
            }
            else
                System.out.println("������� �������� �������!");
        }


    }
}
