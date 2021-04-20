import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficersManagement {
    public static final String inputHardSalary = "Nhập lương cứng: ";
    public static final String inputRemuneration = "Nhập lương thưởng: ";
    public static final String inputPenalty = "Nhập tiền phạt: ";
    public static final String inputInfoTeacher = "Nhập thông tin cá nhân giáo viên";
    public static final String inputName = "Nhập tên: ";
    public static final String inputDateOfBirth = "Nhập ngày tháng năm sinh: ";
    public static final String inputAddress = "Nhập quê quán: ";
    public static final String notfound = "Không tìm thấy giáo viên có lương trên 8tr";
    Scanner sc = new Scanner(System.in);
    List<Officers> teacherList = new ArrayList<>();
    public OfficersManagement(){
        teacherList.add(new Officers(100, 190.250, 0.500,
                new Teacher("Hoàng", "12/1/1992", "Nam Định")));
        teacherList.add(new Officers(150, 250.000, 1.500,
                new Teacher("Hiếu", "2/3/1995", "Hà Nội")));
    }

    // Hiển thị danh sách giáo viên
    public void displayTeacherList(){
        for (Officers list: teacherList) {
            System.out.println(list);
        }
    }
//    double hardSalary, double remuneration, double penalty, Teacher teacher
    // Nhập thêm giáo viên
    public void addTeacher(){
        Teacher teacher = inputInfoTeacher();
        Officers officers = inputInfoOfficer(teacher);
        teacherList.add(officers);
    }

    private Officers inputInfoOfficer(Teacher teacher) {
        System.out.println(inputHardSalary);
        double hardSalary = sc.nextDouble();
        System.out.println(inputRemuneration);
        double remuneration = sc.nextDouble();
        System.out.println(inputPenalty);
        double penalty = sc.nextDouble();
        Officers officers = new Officers(hardSalary, remuneration, penalty, teacher);
        return officers;
    }

    private Teacher inputInfoTeacher() {
        System.out.println(inputInfoTeacher);
        System.out.println(inputName);
        String name = sc.nextLine();
        System.out.println(inputDateOfBirth);
        String dateOfBirth = sc.nextLine();
        System.out.println(inputAddress);
        String address = sc.nextLine();
        Teacher teacher = new Teacher(name, dateOfBirth, address);
        return teacher;
    }

    // Tính lương cho các giáo viên
    public void paymentSalary(){
        for (int i = 0; i < teacherList.size(); i++) {
            Officers officers = teacherList.get(i);
            double salary = officers.getHardSalary() + officers.getRemuneration() - officers.getPenalty();
            System.out.printf("Tiền lương của giáo viên %s: %f\n USD", officers.getTeacher().getName(), salary);
        }
    }

    // Hiển thị các giáo viên có số tiền lương trên 8tr
    public void displayTeacherSalaryOver370USD(){
        Officers officers = findTeacherHaveSalaryOver370USD();
        if (officers == null){
            System.out.println(notfound);
        } else {
            System.out.println("Giáo viên có lương trên 8tr có tên: " + officers.getTeacher().getName());
        }
    };
    public Officers findTeacherHaveSalaryOver370USD(){
        int count = -1;
        for (int i = 0; i < teacherList.size(); i++) {
            Officers officers = teacherList.get(i);
            double salary = officers.getHardSalary() + officers.getRemuneration() - officers.getPenalty();
            if (salary > 370){
                count = i;
                break;
            }
        }
        if (count == -1){
            return null;
        }return teacherList.get(count);
    }
}
