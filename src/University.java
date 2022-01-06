import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добрый день! Вас приветствует система \"Абитуриент КГУ\"");
        Abiturient[] abiturients = makeAbiturients();

        while(true) {
            System.out.println();
            System.out.println("Выберете действие:");
            System.out.println("(1) список абитуриентов, имеющих неудовлетворительные оценки");
            System.out.println("(2) список абитуриентов, средний балл у которых выше заданного");
            System.out.println("(3) n абитуриентов, имеющих самый высокий средний балл ");
            System.out.println("(4) список абитуриентов, имеющих проходной балл (3.66)");
            System.out.println("(5) выйти из программы");
            int answer =in.nextInt();
            if(answer==1) neut(abiturients);
            else if(answer==2) zadanSrBall(abiturients,in);
            else if(answer==3) nBestStudents(abiturients,in);
            else if(answer==4) prohodnoiBall(abiturients);
            else if(answer==5) break;
        }
    }

    private static void prohodnoiBall(Abiturient[] abiturients) {
        float ball = (float) 3.66;
        for(int i=0;i<abiturients.length;i++) {
            if(abiturients[i].getGrades().getAverageMark()>ball)System.out.println(abiturients[i]);
        }
    }

    private static void nBestStudents(Abiturient[] abiturients,Scanner in) {
        System.out.println("Введите число студентов:");
        int value =in.nextInt();
        if(value<=10) {
            Abiturient[] m = abiturients;
            for(int q=0;q<2;q++) {
                for(int i=0;i<m.length-1;i++) {
                    if(m[i].getGrades().getAverageMark()<m[i+1].getGrades().getAverageMark()) {
                        Abiturient n = m[i];
                        m[i]=m[i+1];
                        m[i+1]=n;
                        i=0;
                    }
                }
            }
            for(int i=0;i<value;i++) {
                System.out.println(m[i]);
            }
        } else System.out.println ("!Ошибка: некорректное число.");
    }

    private static void zadanSrBall(Abiturient[] abiturients,Scanner in) {
        System.out.println("Выберете балл:");
        float ball =in.nextFloat();
        for(int i=0;i<abiturients.length;i++) {
            if(abiturients[i].getGrades().getAverageMark()>ball)System.out.println(abiturients[i]);
        }
    }

    private static void neut(Abiturient[] abiturients) {
        for(int i=0;i<abiturients.length;i++) {
            if(abiturients[i].getGrades().getMathsk()<3) System.out.println(abiturients[i]);
            else if(abiturients[i].getGrades().getRusLanguge()<3) System.out.println(abiturients[i]);
            else if(abiturients[i].getGrades().getInformatics()<3) System.out.println(abiturients[i]);
        }
    }

    public static Abiturient[] makeAbiturients() {
        Abiturient[] massiv = new Abiturient[10];
        massiv[0]= new Abiturient("Павлов", "Вячеслав", "Александрович", 5, 4, 5);
        massiv[1]= new Abiturient("Кудрявцева", "Полина", "Евгеньевна", 5, 5, 5);
        massiv[2]= new Abiturient("Кандрашёва", "Мария", "Андреевна", 3, 5, 2);
        massiv[3]= new Abiturient("Мастиков", "Михаил", "Сергеевич", 3, 3, 4);
        massiv[4]= new Abiturient("Плаксенкова", "Ксения", "Сергеевна", 5, 4, 4);
        massiv[5]= new Abiturient("Гантимуров", "Владислав", "Андреевич", 2, 3, 2);
        massiv[6]= new Abiturient("Асланян", "Георгий", "Валерьевич", 4, 4, 4);
        massiv[7]= new Abiturient("Макаров", "Константин", "Сергеевич", 5, 4, 5);
        massiv[8]= new Abiturient("Меньшикова", "Галина", "Павловна", 3, 5, 4);
        massiv[9]= new Abiturient("Самоходкина", "Мария", "Борисовна", 2, 3, 2);
        return massiv;
    }
}
