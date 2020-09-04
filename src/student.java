public class student {
    student(String name, int age, int course, float gr1, float gr2, float gr3, float gr4, type_of_learning lean, boolean act) {
        SetName(name);
        SetAge(age);
        SetCour(course);
        SetGr1(gr1);
        SetGr2(gr2);
        SetGr3(gr3);
        SetGr4(gr3);
        SetLean(lean);
        SetAct(act);
    }
    private String full_name;
    private int age;
    private int course;
    private float gr1, gr2, gr3, gr4;
    private type_of_learning type_learning;
    private boolean activity;

    private void SetName(String name) { full_name = name; }
    private void SetAge(int ag) { age = ag; }
    private void SetCour(int cour) { course = cour; }
    private void SetGr1(float gr) { gr1 = gr; }
    private void SetGr2(float gr) { gr2 = gr; }
    private void SetGr3(float gr) { gr3 = gr; }
    private void SetGr4(float gr) { gr4 = gr; }
    private void SetLean(type_of_learning lean) { type_learning = lean; }
    private void SetAct(boolean act) { activity = act; }

    public type_of_learning GetLean() { return type_learning; }
    public int GetAge() { return age; }
    public String GetName() { return full_name; }
    public float GetGr1() { return gr1; }
    public float GetGr2() { return gr2; }
    public float GetGr3() { return gr3; }
    public float GetGr4() { return gr4; }
    public boolean GetAct() { return activity; }
    public int GetCourse() { return course; }
    public float SrBall() {
        float sr_ball = (gr1+gr2+gr3+gr4)/4;
        return sr_ball;
    }
}
