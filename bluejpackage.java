import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class INGCollege implements ActionListener 
{
      JFrame f;
     JPanel p1,p2;
     JLabel Title00, Title01, JcourseID, JcourseName, JcourseDuration, JLevel, JCredits, JNumberofassessments, JcourseID02, JLecturerName, JcourseLeader,JStartingDate, JCompletionDate, JcourseID01, JcourseName01, JcourseDuration01, JPrerequisite, JcourseID03, JInstructor, JcourseLeader01, JStartingDate01, JCompletionDate01, JExamDate, JcourseID04;
     JTextField JcourseID00, JcourseName00, JcourseDuration00, JcourseID200, JLecturerName00, JcourseLeader00, JLevel00, JCredits00, JStartingDate00, JCompletionDate00, JNumberofassessments00, JcourseID100, JcourseName100, JcourseDuration100, JPrerequisite00, JcourseID300, JInstructor00, JcourseLeader100, JStartingDate100, JCompletionDate100, JExamDate00, JcourseID400;
     JButton Add, Register, Display, Clear, NextPage, Add1, Register1, Display1, Clear1, Remove,PreviousPage;
     ArrayList<course>AL=new ArrayList<>();
     Academic_Course AC;
     Non_Academic_Course NAC;
    
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
        JcourseLeader = new JLabel("Course Leader : ");
        JLecturerName = new JLabel("Lecturer Name : ");
        JStartingDate = new JLabel("Starting Date : ");
        JCompletionDate = new JLabel("Completion Date : ");
        
        JcourseID03 = new JLabel("Course ID : ");
        JcourseLeader01 = new JLabel("Course Leader : ");
        JStartingDate01 = new JLabel("Starting Date : ");
        JCompletionDate01 = new JLabel("Completion Date : ");
        JInstructor = new JLabel("Instructor Name : ");       
        JExamDate = new JLabel("Exam Date : ");
        
        JcourseID04 = new JLabel("Course ID :");
        
        JcourseID00 = new JTextField();
        JcourseName00 = new JTextField();
        JcourseDuration00 = new JTextField();
        JLevel00 = new JTextField();
        JCredits00 = new JTextField();
        
        JcourseID100 = new JTextField();
        JcourseName100 = new JTextField();
        JcourseDuration100 = new JTextField();
        JPrerequisite00 = new JTextField();
        
        
        JcourseID200 = new JTextField();
        JLecturerName00 = new JTextField();
        JcourseLeader00 = new JTextField();
        JStartingDate00 = new JTextField();
        JCompletionDate00 = new JTextField();
        
        JcourseID300 = new JTextField();
        JInstructor00 = new JTextField();
        JcourseLeader100 = new JTextField();
        JStartingDate100 = new JTextField();
        JCompletionDate100 = new JTextField();
        JExamDate00 = new JTextField();
        JNumberofassessments00 = new JTextField();
        JcourseID400 = new JTextField();

         f.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(false);

        f.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);
        
        f.setSize(850,740);
        p1.setSize(800,740);
        p2.setSize(800,740);

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
        
        Title00.setBounds(300,20,450,50);
        JcourseID.setBounds(40,100,120,30);
        JcourseName.setBounds(430,100,120,30);
        JcourseDuration.setBounds(40,150,120,30);
        JLevel.setBounds(430,150,120,30);
        JCredits.setBounds(40,200,120,30);
        JNumberofassessments.setBounds(430,200,150,30);
        
        Title01.setBounds(250,20,450,50);
        JcourseID01.setBounds(40,100,120,30);
        JcourseName01.setBounds(450,100,120,30);
        JcourseDuration01.setBounds(40,150,120,30);
        JPrerequisite.setBounds(450,150,120,30);
        //p1
        JcourseID02.setBounds(40,310,120,30);
        JLecturerName.setBounds(430,250,120,30);
        JcourseLeader.setBounds(40,250,120,30); 
        JStartingDate.setBounds(40,360,120,30);
        JCompletionDate.setBounds(430,310,120,30);
        
        //p2 
        JInstructor.setBounds(430,200,120,30);
        JcourseLeader01.setBounds(40,200,120,30);
        JStartingDate01.setBounds(40,250,120,30);
        JCompletionDate01.setBounds(430,250,120,30);
        JExamDate.setBounds(40,300,120,30);
        
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
        JStartingDate100.setBounds(160,250,180,30);
        JCompletionDate100.setBounds(585,250,180,30);
        JExamDate00.setBounds(160,300,180,30);
        //p1
        JcourseID200.setBounds(160,310,180,30);
        JLecturerName00.setBounds(585,250,180,30);
        JcourseLeader00.setBounds(160,250,180,30);
        JStartingDate00.setBounds(160,360,180,30);
        JCompletionDate00.setBounds(585,310,180,30);
        
        JcourseID300.setBounds(160,200,180,30);
        JInstructor00.setBounds(585,200,180,30);
       
        
        
        

        Add.setBounds(60,510,120,30);
        Display.setBounds(200,510,120,30);
        Clear.setBounds(340,510,120,30);
        NextPage.setBounds(480,510,120,30);
        Register.setBounds(620,510,120,30);
        

        Add1.setBounds(60,510,120,30);
        Register1.setBounds(620,510,120,30);
        Remove.setBounds(60,560,120,30);
        Display1.setBounds(200,510,120,30);
        Clear1.setBounds(340,510,120,30);
        PreviousPage.setBounds(480,510,120,30);
        
        p1.add(Title00);
        p1.add(JcourseID);
        p1.add(JcourseName);
        p1.add(JcourseDuration);
        p1.add(JcourseID00);
        p1.add(JcourseName00);
        p1.add(JcourseDuration00);
        p1.add(Add);
        p1.add(JcourseID02);
        p1.add(JLecturerName);
        p1.add(JcourseLeader);
        p1.add(JLevel);
        p1.add(JCredits);
        p1.add(JStartingDate);
        p1.add(JCompletionDate);
        p1.add(JNumberofassessments);
        p1.add(JcourseID200);
        p1.add(JLecturerName00);
        p1.add(JcourseLeader00);
        p1.add(JLevel00);
        p1.add(JCredits00);
        p1.add(JStartingDate00);
        p1.add(JCompletionDate00);
        p1.add(JNumberofassessments00);
        p1.add(Register);
        p1.add(Display);
        p1.add(Clear);
        p1.add(NextPage);

        p2.add(Title01);
        p2.add(JcourseID01);
        p2.add(JcourseName01);
        p2.add(JcourseDuration01);
        p2.add(JcourseID100);
        p2.add(JcourseName100);
        p2.add(JcourseDuration100);
        p2.add(Add1);
        p2.add(JcourseID300);
        p2.add(JInstructor);
        p2.add(JcourseLeader01);
        p2.add(JStartingDate01);
        p2.add(JCompletionDate01);
        p2.add(JExamDate);
        p2.add(JPrerequisite);
        p2.add(JcourseID04);
        p2.add(JcourseID300);
        p2.add(JInstructor00);
        p2.add(JcourseLeader100);
        p2.add(JStartingDate100);
        p2.add(JCompletionDate100);
        p2.add(JExamDate00);
        p2.add(JPrerequisite00);
        p2.add(JcourseID400);
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
                Credits = JCredits00.getText();
                Numberofassessments = Integer.parseInt(JNumberofassessments00.getText());
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
                courseDuration = Integer.parseInt(JcourseDuration100.getText());
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
                    NAC = new Non_Academic_Course(courseID, courseName, Prerequisite, courseDuration);
                    AL.add(NAC);
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course is added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course has already been added");
                }
            }
            catch(Exception E)
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
            
            try
            {
                courseID = JcourseID200.getText();
                courseLeader = JcourseID200.getText();
                LecturerName = JLecturerName00.getText();
                StartingDate = JStartingDate00.getText();
                CompletionDate = JCompletionDate00.getText();
                boolean SameAC1 = false;
                for(course CO:AL)
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
                courseID = JcourseID300.getText();
                courseLeader = JcourseLeader00.getText();
                Instructor = JLecturerName00.getText();
                StartingDate = JStartingDate00.getText();
                CompletionDate = JCompletionDate00.getText();
                ExamDate = JExamDate00.getText();
                boolean SameNAC01 = false;
                for(course CO:AL)
                {
                    if(NAC.getcourseID().equals(courseID))
                    {
                        SameNAC01 = true;
                        if (CO instanceof Non_Academic_Course)
                        {
                            
                            NAC = (Non_Academic_Course)CO;
                        
                            if (NAC.getISRegistered () ==true)
        
                            {
                                JOptionPane.showMessageDialog(f,"Non-Academic Course has already been registered.");
                            }
                            else
                            {
                                NAC.register( courseLeader, Instructor, StartingDate, CompletionDate, ExamDate);
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
            String CourseID = JcourseID400.getText();
            try{
                for(course C:AL){
                    if(C.getcourseID().equals(JcourseID))
                    {
                        if(C instanceof Non_Academic_Course)
                        {
                            NAC=(Non_Academic_Course)C;
                            if(NAC.getIsRemoved()==false)
                            {
                                NAC.remove();
                                JOptionPane.showMessageDialog(f,"The Course has been removed.");
                                
                            }
                            else if(NAC.getIsRemoved()==true)
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

                    AC.display();
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

                    NAC.display();
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

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
