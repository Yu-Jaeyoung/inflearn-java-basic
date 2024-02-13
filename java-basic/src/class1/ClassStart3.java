package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 설계도를 기반으로 메모리에 실체를 만듬 (실체 = 객체(인스턴스))
        // 클래스와의 관계를 명확하게 할 때 인스턴스라는 개념을 사용 -> instance of
        // 객체(Object)는 클래스에서 정의한 속성과 기능을 가진 실체
        // 두 용어는 자주 혼용됨 -> 클래스에서 나온 실체라는 핵심 의미는 같음
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
