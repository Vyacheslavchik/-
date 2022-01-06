public class Abiturient {
    static int value=0;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Grades grades;

    public Abiturient(String surname, String name,String patronymic,int maths,int rusLanguge,int informatics) {
        value++;
        id=value;
        grades = new Grades(maths,rusLanguge,informatics);
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }

    @Override
    public String toString() {
        return id+"\t"+surname+" "+name+" "+patronymic+"\n"+"\t"
                +"Отметки:"+"\t"+"\n"+"\t"
                +"Математика: "+(int)grades.getMathsk()+"\n"+"\t"+
                "Рус.яз.: "+(int)grades.getRusLanguge()+"\n"+"\t"+
                "Информатика: "+(int)grades.getInformatics()+"\n"+"\t"+
                "___________________"+"\n"+"\t"+
                "Средний балл: "+grades.getAverageMark()+"\n";
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public Grades getGrades() {
        return grades;
    }
    public int getId() {
        return id;
    }

}
