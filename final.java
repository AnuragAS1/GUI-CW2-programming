import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class INGCollege implements ActionListener 
{
    private JFrame f;
    private JPanel p1,p2;
    private JLabel acadlabel,nonacadlabel,idlabel,coursenamelabel,durationlabel,instructorlabel,leaderlabel,levellabel,creditlabel,noalabel,nonidlabel,noncourselabel,nondurationlabel,nonprelabel,noninstructorlabel,nonleaderlabel,startdatelabel,comdatelabel,nonstartlabel,noncomlabel,nonexamlabel; 
    private JTextField txtid,txtcourse,txtduration,txtnoa,txtinstructor,txtleader,txtlevel,txtcredit,txtnonid,txtnoncourse,txtnonduration,txtnonpre,txtnoninstructor,txtnonleader,txtstartdate,txtcomdate,txtnonstartdate,txtnoncomdate,txtnonexamdate;
    private JButton addbtn,regbtn,displaybtn,clearbtn,nonaddbtn,nonregbtn,nondisplaybtn,nonremovebtn,nonclearbtn,nextbtn,previousbtn;
    private ArrayList<course>al=new ArrayList();
    private Academic_Course objAC;
    private Non_Academic_Course objNAC;
    
    INGCollege()
    {
        f= new JFrame("Form Registration");
        p1=new JPanel();
        p2=new JPanel();
        
        Title00 = new JLabel("Academic Course");
        JcourseID = new JLabel("Course ID :");
        JcourseName = new JLabel("Course Name :");
        JCredits = new JLabel("Credit :");
        JNumberofassessments = new JLabel("Number of Assessments :");
        JLevel = new JLabel("Level :");
        JcourseDuration = new JLabel("Duration :");
        
        Title01 = new JLabel("Non-Academic Course");
        JcourseName01 = new JLabel("Course Name : ");
        JcourseID01 = new JLabel("Course ID : ");
        JcourseDuration01 = new JLabel("Duration : ");
        JPrerequisite = new JLabel("Prerequisite : ");
        
        JcourseID02 = new JLabel("Course ID : ");
        JCourseLeader = new JLabel("Course Leader : ");
        JLecturerName = new JLabel("Lecturer Name : ");
        JStartingDate = new JLabel("Starting Date : ");
        JCompletionDate = new JLabel("Completion Date : ");
        
        JcourseID03 = new JLabel("Course ID : ");
        JCourseLeader01 = new JLabel("Course Leader : ");
        JStartingDate01 = new JLabel("Starting Date : ");
        JCompletionDate01 = new JLabel("Completion Date : ");
        JInstructor = new JLabel("Instructor Name : ");       
        JExamDate = new JLabel("Exam Date : ");
        
        JCourseID04 = new JLabel("Course ID :");
        
        JcourseID00 = new JTextField();
        JcourseName00 = new JTextField();
        JcourseDuration00 = new JTextField();
        JLevel00 = new JTextField();
        JCredits00 = new JTextField();
        
        JcourseID100 = new JTextField();
        JcourseName100 = new JTextField();
        JcourseDuration100 = new JTextField();
        JPrerequisite00 = new JTextField();
        JNumberofassessments00 = new JTextField();
        
        JcourseID200 = new JTextField();
        JLecturerName00 = new JTextField();
        JcourseLeader00 = new JTextField();
        JStartingDate00 = new JTextField();
        JCompletionDate00 = new JTextField();
        
        JcourseID300 = new JTextField();
        Jinstructor300 = new JTextField();
        JcourseLeader100 = new JTextField();
        JStartingDate100 = new JTextField();
        JCompletionDate100 = new JTextField();
        JExamDate00 = new JTextField();
        
        JCourseID400 = new JTextField();

         f.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(false);

        f.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);
        
         f.setSize(920,740);
        p1.setSize(920,740);
        p2.setSize(920,740);

        Add = new JButton("Add");
        Register = new JButton("Register");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        NextPage = new JButton("Next Page");
        
        Add1 = new JButton("Add");
        Register1 = new JButton("Register");
        Display1 = new JButton("Display");
        Clear1 = new JButton("Clear");
        Remove = new JButton("Remove");
        PreviousPage = new JButton("Previous Page");
        
        Title00.setFont(new Font("Arial",Font.BOLD,30));
        Title01.setFont(new Font("Arial",Font.BOLD,30));

        Title1.setBounds(350,20,450,50);
        JCourseID.setBounds(40,150,120,30);
        JCourseName.setBounds(470,150,120,30);
        JDuration.setBounds(40,150,120,30);
        JLevel.setBounds(450,150,120,30);
        JCredit.setBounds(40,200,120,30);
        JNumberOfAssessments.setBounds(470,200,150,30);
        
        Title01.setBounds(350,20,450,50);
        JcourseID01.setBounds(40,150,120,30);
        JcourseName01.setBounds(470,150,120,30);
        JcourseDuration01.setBounds(40,150,120,30);
        JPrerequisite.setBounds(450,150,120,30);
        
        JcourseID02.setBounds(40,310,120,30);
        JLecturerName.setBounds(450,310,120,30);
        JcourseLeader.setBounds(40,350,120,30); 
        JStartingDate.setBounds(430,350,120,30);
        JCompletionDate.setBounds(40,400,120,30);
        
        JcourseID03.setBounds(40,260,120,30);
        JInstructor.setBounds(450,260,120,30);
        JcourseLeader01.setBounds(40,300,120,30);
        JStartingDate01.setBounds(450,300,120,30);
        JCompletionDate01.setBounds(40,350,120,30);
        JExamDate.setBounds(450,350,120,30);
        
        JcourseID04.setBounds(40,460,120,30);
        
        JcourseID00.setBounds(160,100,180,30);
        JcourseName00.setBounds(585,100,180,30);
        JcourseDuration00.setBounds(160,150,180,30);
        JLevel00.setBounds(585,150,180,30);
        JCredits00.setBounds(160,200,180,30);
        JNumberofassessments00.setBounds(585,200,180,30);
        
        JcourseID100.setBounds(160,100,180,30);
        JcourseName100.setBounds(585,100,180,30);
        JcourseDuration100.setBounds(160,150,180,30);
        JPrerequisite00.setBounds(585,150,180,30);
        
        JcourseID200.setBounds(160,310,180,30);
        JLecturerName00.setBounds(585,310,180,30);
        JcourseLeader00.setBounds(160,360,180,30);
        JStartingDate00.setBounds(585,360,180,30);
        JCompletionDate00.setBounds(160,410,180,30);
        
        JcourseID300.setBounds(160,250,180,30);
        JInstructor00.setBounds(585,250,180,30);
        JcourseLeader100.setBounds(160,300,180,30);
        JStartingDate100.setBounds(585,300,180,30);
        JCompletionDate100.setBounds(160,350,180,30);
        JExamDate00.setBounds(600,350,180,30);
        
        JCourseID400.setBounds(150,450,180,30);

        Add.setBounds(600,250,120,30);
        Register.setBounds(600,460,120,30);
        Display.setBounds(220,510,120,30);
        Clear.setBounds(380,510,120,30);
        NextPage.setBounds(540,510,120,30);

        Add01.setBounds(600,200,120,30);
        Register01.setBounds(600,410,120,30);
        Remove.setBounds(160,510,120,30);
        Display01.setBounds(220,560,120,30);
        Clear01.setBounds(380,560,120,30);
        PreviousPage.setBounds(540,560,120,30);
        
        p1.add(Title1);
        p1.add(JCourseID);
        p1.add(JCourseName);
        p1.add(JDuration);
        p1.add(JCourseID_);
        p1.add(JCourseName_);
        p1.add(JDuration_);
        p1.add(Add);
        p1.add(JCourseID2);
        p1.add(JLecturerName);
        p1.add(JCourseLeader);
        p1.add(JLevel);
        p1.add(JCredit);
        p1.add(JStartingDate);
        p1.add(JCompletionDate);
        p1.add(JNumberOfAssessments);
        p1.add(JCourseID2_);
        p1.add(JLecturerName_);
        p1.add(JCourseLeader_);
        p1.add(JLevel_);
        p1.add(JCredit_);
        p1.add(JStartingDate_);
        p1.add(JCompletionDate_);
        p1.add(JNumberOfAssessments_);
        p1.add(Register);
        p1.add(Display);
        p1.add(Clear);
        p1.add(NextPage);

        p2.add(Title2);
        p2.add(JCourseID1);
        p2.add(JCourseName1);
        p2.add(JDuration1);
        p2.add(JCourseID1_);
        p2.add(JCourseName1_);
        p2.add(JDuration1_);
        p2.add(Add1);
        p2.add(JCourseID3);
        p2.add(JInstructorName);
        p2.add(JCourseLeader1);
        p2.add(JStartingDate1);
        p2.add(JCompletionDate1);
        p2.add(JExamDate);
        p2.add(JPrerequisite);
        p2.add(JCourseID4);
        p2.add(JCourseID3_);
        p2.add(JInstructorName_);
        p2.add(JCourseLeader1_);
        p2.add(JStartingDate1_);
        p2.add(JCompletionDate1_);
        p2.add(JExamDate_);
        p2.add(JPrerequisite_);
        p2.add(JCourseID4_);
        p2.add(Register1);
        p2.add(Display1);
        p2.add(Remove);
        p2.add(Clear1);
        p2.add(PreviousPage);

        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Add.addActionListener(this);
        Add1.addActionListener(this);
        Register.addActionListener(this);
        Register1.addActionListener(this);
        Display.addActionListener(this);
        Display1.addActionListener(this);
        Remove.addActionListener(this);
        Clear.addActionListener(this);
        Clear1.addActionListener(this);
        NextPage.addActionListener(this);
        PreviousPage.addActionListener(this);
    }
    
      public void actionPerformed(ActionEvent A)
    {
        if(A.getSource()==Add)
        {
            String courseID="";
            String courseName="";
            int courseDuration = 0;
            String Level = "";
            String Credits = "";
            int Numberofassessments = 0;            
            try
            {
                courseID = JcourseID00.getText();
                courseName = JcourseName00.getText();
                courseDuration = Integer.parseInt(JcourseDuration00.getText());
                Level = JLevel00.getText();
                Credits = JCredit00.getText();
                Numberofassessments = Integer.parseInt(JNumberOfAssessments00.getText());
                boolean SameAC = false;
                for(course C:AL)
                {
                    if (C.getcourseID().equals(courseID))
                    {
                        SameAC = true;          
                    }
                }   
                if(SameAC==false)
                {
                    AC = new Academic_Course(courseID,courseName,courseDuration,Level,Credits,Numberofassessments);
                    AL.add(AC);
                    JOptionPane.showMessageDialog(f,"The Academic Course has been added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Academic Course has already been added.");
                }
            }
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Add1)
        {            
            String courseID = "";
            String courseName = "";
            int courseDuration=0;
            String Prerequisite = "";
            try
            {
                courseID = JcourseID100.getText();
                courseName = JcourseName100.getText();
                courseDuration = Integer.parseInt(JDuration1_.getText());
                Prerequisite = JPrerequisite00.getText();  
                boolean SameNAC = false;
                for(course C:AL)
                {
                    if(C.getcourseID().equals(courseID))
                    {
                        SameNAC = true;    
                    }
                }
                if(SameNAC == false)
                {
                    NAC = new Non_Academic_Course(courseID, courseName, courseDuration, Prerequisite);
                    AL.add(NAC);
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course is added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course has already been added");
                }
            }
            catch(Exception A)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }
        
          else if (A.getSource()==Register)
        {
            String courseID = "";
            String courseLeader = "";
            String LecturerName = "";
            String StartingDate = "";
            String CompletionDate = "";
            
            {
                CourseID = JcourseID200.getText();
                CourseLeader = JcourseID200.getText();
                LecturerName = JLecturerName00.getText();
                StartingDate = JStartingDate00.getText();
                CompletionDate = JCompletionDate00.getText();
                boolean SameAC1 = false;
                for(Course CO:AL)
                 {
                    if(CO.getcourseID().equals(courseID))
                    {
                        SameAC1 = true;
                        if (CO instanceof Academic_Course)
                        {
                            AC = (Academic_Course) CO;
                            if (AC.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(f,"Academic Course has already been registered.");
                            }
                            else
                            {
                                AC.Register(courseLeader, LecturerName, StartingDate, CompletionDate);
                                JOptionPane.showMessageDialog(f,"The academic course has been registered.");                                
                            }
                        }
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(f,"The CourseID do not match.");
                       break;
                    }
                }
            }

            catch (Exception E)
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the forms properly !");
            }
        }
    
        
        
         else if (A.getSource()==Register1)
        {
            String courseID = "";
            String courseLeader = "";
            String Instructor = "";
            String StartingDate = "";
            String CompletionDate = "";
            String ExamDate = "";
            try
            {
                courseID = JCourseID300getText();
                courseLeader = JcourseLeader00.getText();
                Instructor = JLecturerName00.getText();
                StartingDate = JStartingDate00.getText();
                CompletionDate = JCompletionDate00.getText();
                ExamDate = JExamDate00.getText();
                boolean SameNAC01 = false;
                for(course CO:AL)
                {
                    if(CO.getCourseID().equals(courseID))
                    {
                        SameNAC1 = true;
                        if (CO instanceof Non_Academic_Course)
                        {
                            NAC = (Non_Academic_Course)CO;
                            if (NAC.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(f,"Non-Academic Course has already been registered.");
                            }
                            else
                            {
                                NAC.Register(courseLeader, InstructorN, StartingDate, CompletionDate, ExamDate);
                                JOptionPane.showMessageDialog(f,"The non-academic course has been registered.");   
                            }
                        }
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(f,"The CourseID do not match.");
                        break;
                    }    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Remove)
        {
            String CourseID = JCourseID4_.getText();
            try{
                for(Course C:AL){
                    if(C.getCourseID().equals(CourseID))
                    {
                        if(C instanceof NonAcademicCourse)
                        {
                            NAC=(NonAcademicCourse)C;
                            if(NAC.getisRemoved()==false)
                            {
                                NAC.Remove();
                                JOptionPane.showMessageDialog(f,"The Course has been removed.");
                                
                            }
                            else if(NAC.getisRemoved()==true)
                            {
                                JOptionPane.showMessageDialog(f,"The Course has been already removed.");
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f,"Enter valid CourseID");
                        break;
                    }
                }
            }
            
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Display)
        {
            for(course CO:AL)
            {
                if(CO instanceof Academic_Course)
                {
                    Academic_Course AC = (Academic_Course)CO;

                    AC.Display();
                }
            }                         
        }
        else if (A.getSource()==Display1)
        {
            for(course CO:AL)
            {
                if(CO instanceof Non_Academic_Course)
                {
                    Non_Academic_Course NAC = (Non_Academic_Course)CO;

                    NAC.Display();
                }
            }
        }
        
         else if (A.getSource()==Clear)
        {
            JcourseID00.setText("");
            JcourseName00.setText("");
            JcourseDuration00.setText("");
            JLecturerName00.setText("");
            JcourseLeader00.setText("");
            JLevel00.setText("");
            JCredits00.setText("");
            JStartingDate00.setText("");
            JCompletionDate00.setText("");
            JNumberofassessments00.setText("");
            JcourseID200.setText("");
        }
        
        else if (A.getSource()==Clear1)
        {
            JcourseID100.setText("");
            JcourseName100.setText("");
            JcourseDuration100.setText("");
            JInstructor00.setText("");
            JcourseLeader100.setText("");
            JStartingDate100.setText("");
            JCompletionDate100.setText("");
            JExamDate00.setText("");
            JPrerequisite00.setText("");
            JcourseID300.setText("");
            JcourseID400.setText("");
        }
         else if(A.getSource()==NextPage)
        {
            p1.setVisible(false);
            p2.setVisible(true);
            f.add(p2);
        } 
        else if(A.getSource()==PreviousPage)
        {
            p2.setVisible(false);
            p1.setVisible(true);
        }
    }

       public static void main(String[]args)
    {
        new INGCollege();
    }
}
