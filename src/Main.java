import java.util.Scanner;

public class Main {

    public static final String displayInfoTeacher = "1. Hiển thị thông tin giáo viên";
    public static final String addTeacher = "2. Nhập thêm giáo viên";
    public static final String caculatorSalary = "3. Tính lương cho mỗi giáo viên";
    public static final String displayTeacherSalaryOver370USD = "4. Hiển thị giáo viên có lương trên 8tr";
    public static final String exit = "5. Thoát";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OfficersManagement officersManagement = new OfficersManagement();
        do {
            System.out.println(displayInfoTeacher);
            System.out.println(addTeacher);
            System.out.println(caculatorSalary);
            System.out.println(displayTeacherSalaryOver370USD);
            System.out.println(exit);
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    officersManagement.displayTeacherList();
                    break;
                }
                case 2: {
                    officersManagement.addTeacher();
                    break;
                }
                case 3:{
                    officersManagement.paymentSalary();
                    break;
                }
                case 4:{
                    officersManagement.displayTeacherSalaryOver370USD();
                    break;
                }
                case 5:{
                    System.exit(0);
                }
            }
        } while (true);

    }
}
