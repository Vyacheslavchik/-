public class Grades {
    private int maths;
    private int rusLanguge;
    private int informatics;
    private float averageMark;

    public Grades(int maths,int rusLanguge,int informatics) {
        this.maths=maths;
        this.rusLanguge=rusLanguge;
        this.informatics=informatics;
        averageMark=findAverageMark();
    }
    private float findAverageMark() {
        float answer =(float) (maths+rusLanguge+informatics)/3;
        int a =(int) (answer*100);
        answer = (float)a/100;
        return answer;
    }
    public float getAverageMark() {
        return averageMark;
    }
    public float getMathsk() {
        return maths;
    }
    public float getRusLanguge() {
        return rusLanguge;
    }
    public float getInformatics() {
        return informatics;
    }
}
