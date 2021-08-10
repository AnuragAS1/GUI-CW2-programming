public class Non_Academic_Course extends course{
    private String instructor;
    private String startDate;
    private String completionDate;
    private String prerequisite;
    private String examDate;
    private int courseDuration;
    private boolean isRegistered;
    private boolean isRemoved;
    
    public Non_Academic_Course(String courseID,String courseName,String prerquisite,int courseDuration)
    {
        super(courseID,courseName,courseDuration);
        this.prerequisite = prerequisite;
        startDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = false;
        isRemoved = false;
    }
    
    
    public String getInstructor()
    {
        return instructor;
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    public String getExamDate()
    {
        return examDate;
    }
    
    public String getprerequisite()
    {
        return prerequisite;
    }
    
    public int getCourseDuration()
    {
        return courseDuration;
    }
    
    public boolean getISRegistered()
    {
        return isRegistered;
    }
    
    public boolean getIsRemoved()
    {
        return isRemoved;
    }
    
    
    public void setInstructor(String instructor)
    {
        if (isRegistered == false)
        {
            this.instructor = instructor;
        }
        else {
            System.out.println("The instructor name cannot be changed");
        }
    }
    
    
    public void register(String courseLeader,String instructor,String startDate,String completionDate,String examDate)
    {
        if (isRegistered == false)
        {
            setInstructor(instructor);
            isRegistered = true;
            super.setcourseLeader(courseLeader);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
        }
        else {
            System.out.println("The Non Academic course is already taken");
        }
    }
    
    
    public void remove()
    {
        if (isRemoved == true) 
        {
            System.out.println("The Non Academic course is already removed");
        }
        else
        {
            super.setcourseLeader("");
            startDate = "";
            completionDate = "";
            examDate = "";
            isRegistered = false;
            isRemoved = true;
        }
    }
    
    
    public void display()
    {
        super.display();
        if (isRegistered == true) 
        {
            System.out.println(instructor + " Is the instructor of the course");
            System.out.println("the course start's on " + startDate+ " and will be finished on " + completionDate + ".");
            System.out.println("The exam will be on " + examDate + ".");
        }
    }
}
