package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AutoGrade[] values = AutoGrade.values();
        for (AutoGrade value : values) {
            printGrade(value);
        }
    }

    private static void printGrade(AutoGrade grade) {
        System.out.println("grade = " + grade.name() +
                ", level = "+ grade.getLevel() +
                ", 설명 = " + grade.getDescription());
    }
}
