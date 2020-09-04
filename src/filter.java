import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args)
    {
        student student1 = new student("Денис Сизов", 19, 2, 8, 7, 9, 10, type_of_learning.budget, true);
        student student2 = new student("Андрей Ким", 21, 2, 7, 8, 8, 7, type_of_learning.budget, false);
        student student3 = new student("Ворончихин Илья", 19, 2, 6, 6, 4, 6, type_of_learning.budget, true);
        student student4 = new student("Микехин Артем", 20, 2, 7, 8, 9, 7, type_of_learning.handkerchief, false);
        student student5 = new student("Тихонова Екатерина", 20, 2, 9, 10, 9, 10, type_of_learning.budget, true);
        List<student>students = Arrays.asList(student1, student2, student3, student4, student5);
        int i = 19;
        List<student> result = students.stream()
                .filter(student -> student.GetAge() > i)
                .collect(Collectors.toList());
        System.out.println("Студенты старше " + i + " лет");
        result.forEach(p -> System.out.println(p.GetName()));
        List<student> level1 = students.stream()
                .filter(student -> student.GetLean() == type_of_learning.handkerchief)
                .collect(Collectors.toList());
        System.out.println("\nСтуденты, обучающиеся на платке");
        level1.forEach(p -> System.out.println(p.GetName()));
        List<student> level2 = students.stream()
                .filter(student -> (student.GetLean() == type_of_learning.budget) && (student.GetGr1() > 6) && (student.GetGr1() > 6)
                        && (student.GetGr2() > 6) && (student.GetGr3() > 6) && (student.GetGr4() > 6))
                .collect(Collectors.toList());
        System.out.println("\nСтуденты, получающие обычную стипендию");
        level2.forEach(p -> System.out.println(p.GetName()));
        List<student> level3 = students.stream()
                .filter(student -> (student.GetLean() == type_of_learning.budget) && (student.SrBall() > 9.01))
                .collect(Collectors.toList());
        System.out.println("\nСтуденты, получающие повышенную учебную стипендию");
        level3.forEach(p -> System.out.println(p.GetName()));
        List<student> level4 = students.stream()
                .filter(student -> student.GetAct())
                .collect(Collectors.toList());
        System.out.println("\nСтуденты, получающие повышенную внеучебную стипендию");
        level4.forEach(p -> System.out.println(p.GetName()));
    }
}
