import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class INGCollege implements ActionListener 
{
    JFrame f;
    JPanel p1,p2;
    JLabel acadlabel,nonacadlabel,idlabel,coursenamelabel,durationlabel,instructorlabel,leaderlabel,levellabel,creditlabel,noalabel,nonidlabel,noncourselabel,nondurationlabel,nonprelabel,noninstructorlabel,nonleaderlabel,startdatelabel,comdatelabel,nonstartlabel,noncomlabel,nonexamlabel; 
    JTextField txtid,txtcourse,txtduration,txtnoa,txtinstructor,txtleader,txtlevel,txtcredit,txtnonid,txtnoncourse,txtnonduration,txtnonpre,txtnoninstructor,txtnonleader,txtstartdate,txtcomdate,txtnonstartdate,txtnoncomdate,txtnonexamdate;
    JButton addbtn,regbtn,displaybtn,clearbtn,nonaddbtn,nonregbtn,nondisplaybtn,nonremovebtn,nonclearbtn,nextbtn,previousbtn;
    ArrayList<course>al=new ArrayList();
    Academic_Course objAC;
    Non_Academic_Course objNAC;
    
    INGCollege()
    {
        f= new JFrame("Register Form");
        p1=new JPanel();
        p2=new JPanel();
        
          
        acadlabel=new JLabel("Academic Course");
        acadlabel.setFont(new Font("Arial",Font.BOLD,20));
        acadlabel.setBounds(270,20,200,50);
        p1.add(acadlabel);
          
        idlabel=new JLabel("Course ID:");
        idlabel.setBounds(20,125,100,30);
        p1.add(idlabel);
          
        txtid=new JTextField();
        txtid.setBounds(130,125,150,30);
        p1.add(txtid);
        
        durationlabel=new JLabel("Duration:");
        durationlabel.setBounds(20,175,100,30);
        p1.add(durationlabel);
        
        txtduration=new JTextField();
        txtduration.setBounds(130,175,150,30);
        p1.add(txtduration);
        
          
        coursenamelabel=new JLabel("Course Name:");
        coursenamelabel.setBounds(420,125,120,30);
        p1.add(coursenamelabel);
        
        txtcourse=new JTextField();
        txtcourse.setBounds(550,125,150,30);
        p1.add(txtcourse);
        
        
        noalabel=new JLabel("Assessments:");
        noalabel.setBounds(420,175,120,30);
        p1.add(noalabel);
        
        txtnoa=new JTextField();
        txtnoa.setBounds(550,175,150,30);
        p1.add(txtnoa);
        
        levellabel=new JLabel("Level:");
        levellabel.setBounds(20,225,120,30);
        p1.add(levellabel);
        
        txtlevel=new JTextField();
        txtlevel.setBounds(130,225,150,30);
        p1.add(txtlevel);
        
        creditlabel=new JLabel("Credit:");
        creditlabel.setBounds(420,225,120,30);
        p1.add(creditlabel);
        
        txtcredit=new JTextField();
        txtcredit.setBounds(550,225,150,30);
        p1.add(txtcredit);
        
        addbtn=new JButton("Add");
        addbtn.setBounds(565,285,120,30);
        p1.add(addbtn);
        addbtn.addActionListener(this);
        
        leaderlabel=new JLabel("Course Leader:");
        leaderlabel.setBounds(20,350,120,30);
        p1.add(leaderlabel);
        
        txtleader=new JTextField();
        txtleader.setBounds(130,350,150,30);
        p1.add(txtleader);
        
        instructorlabel=new JLabel("Instructor Name:");
        instructorlabel.setBounds(420,350,120,30);
        p1.add(instructorlabel);
        
        txtinstructor=new JTextField();
        txtinstructor.setBounds(550,350,150,30);
        p1.add(txtinstructor);
        
        startdatelabel=new JLabel("Start Date:");
        startdatelabel.setBounds(20,400,120,30);
        p1.add(startdatelabel);
        
        txtstartdate=new JTextField();
        txtstartdate.setBounds(130,400,150,30);
        p1.add(txtstartdate);
        
        comdatelabel=new JLabel("Completion Date:");
        comdatelabel.setBounds(420,400,120,30);
        p1.add(comdatelabel);
        
        txtcomdate=new JTextField();
        txtcomdate.setBounds(550,400,150,30);
        p1.add(txtcomdate);
        
        regbtn=new JButton("Register");
        regbtn.setBounds(565,500,120,30);
        p1.add(regbtn);
        
        displaybtn=new JButton("Display");
        displaybtn.setBounds(20,575,120,30);
        p1.add(displaybtn);
        displaybtn.addActionListener(this);
        
        clearbtn=new JButton("Clear");
        clearbtn.setBounds(160,575,120,30);
        p1.add(clearbtn);
        
        nextbtn= new JButton("Next Page");
        nextbtn.setBounds(550,575,150,30);
        p1.add(nextbtn);
        nextbtn.addActionListener(this);
        
        nonacadlabel=new JLabel("Non-Academic Course");
        nonacadlabel.setFont(new Font("Arial",Font.BOLD,20));
        nonacadlabel.setBounds(280,20,250,50);
        p2.add(nonacadlabel);
        
        nonidlabel=new JLabel("Course ID:");
        nonidlabel.setBounds(20,125,120,30);
        p2.add(nonidlabel);
        
        txtnonid=new JTextField();
        txtnonid.setBounds(130,125,150,30);
        p2.add(txtnonid);
        
        noncourselabel=new JLabel("Course Name:");
        noncourselabel.setBounds(420,125,120,30);
        p2.add(noncourselabel);
        
        txtnoncourse=new JTextField();
        txtnoncourse.setBounds(550,125,150,30);
        p2.add(txtnoncourse);
        
        nondurationlabel=new JLabel("Duration:");
        nondurationlabel.setBounds(20,175,120,30);
        p2.add(nondurationlabel);
        
        txtnonduration=new JTextField();
        txtnonduration.setBounds(130,175,150,30);
        p2.add(txtnonduration);
        
        nonprelabel=new JLabel("Prerequisite:");
        nonprelabel.setBounds(420,175,120,30);
        p2.add(nonprelabel);
        
        txtnonpre=new JTextField();
        txtnonpre.setBounds(550,175,150,30);
        p2.add(txtnonpre);
        
        nonaddbtn=new JButton("Add");
        nonaddbtn.setBounds(565,250,120,30);
        p2.add(nonaddbtn);
        nonaddbtn.addActionListener(this);
        
        nonleaderlabel=new JLabel("Course Leader:");
        nonleaderlabel.setBounds(20,325,120,30);
        p2.add(nonleaderlabel);
        
        txtnonleader=new JTextField();
        txtnonleader.setBounds(130,325,150,30);
        p2.add(txtnonleader);
        
        
        noninstructorlabel=new JLabel("Instructor Name:");
        noninstructorlabel.setBounds(420,325,120,30);
        p2.add(noninstructorlabel);
        
        txtnoninstructor=new JTextField();
        txtnoninstructor.setBounds(550,325,150,30);
        p2.add(txtnoninstructor);
        
        nonstartlabel=new JLabel("Start Date:");
        nonstartlabel.setBounds(20,375,120,30);
        p2.add(nonstartlabel);
        
        txtnonstartdate=new JTextField();
        txtnonstartdate.setBounds(130,375,150,30);
        p2.add(txtnonstartdate);
        
        noncomlabel=new JLabel("Completion Date:");
        noncomlabel.setBounds(420,375,120,30);
        p2.add(noncomlabel);
        
        txtnoncomdate=new JTextField();
        txtnoncomdate.setBounds(550,375,150,30);
        p2.add(txtnoncomdate);
        
        nonexamlabel=new JLabel("Exam Date:");
        nonexamlabel.setBounds(20,425,120,30);
        p2.add(nonexamlabel);
        
        txtnonexamdate=new JTextField();
        txtnonexamdate.setBounds(130,425,150,30);
        p2.add(txtnonexamdate);
        
        nonregbtn=new JButton("Register");
        nonregbtn.setBounds(420,500,120,30);
        p2.add(nonregbtn);
        
        nonremovebtn=new JButton("Remove");
        nonremovebtn.setBounds(565,500,120,30);
        p2.add(nonremovebtn);
        
        nondisplaybtn=new JButton("Display");
        nondisplaybtn.setBounds(20,575,120,30);
        p2.add(nondisplaybtn);
        nondisplaybtn.addActionListener(this);
        
        nonclearbtn=new JButton("Clear");
        nonclearbtn.setBounds(160,575,120,30);
        p2.add(nonclearbtn);
        
        previousbtn=new JButton("Previous Page");
        previousbtn.setBounds(550,575,150,30);
        p2.add(previousbtn);
        previousbtn.addActionListener(this);
        
        
        p1.setSize(750,700);
        p1.setLayout(null);
        p1.setVisible(true);
        p2.setSize(750,700);
        p2.setLayout(null);
        f.setLayout(null);
        f.setSize(750,700);
        f.setVisible(true);
        f.add(p1);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==nextbtn)
        {
            p1.setVisible(false);
            p2.setVisible(true);
            f.add(p2);
        }
        else if(e.getSource()==previousbtn)
        {
            p1.setVisible(true);
            p2.setVisible(false);
        }
        if(e.getSource()==addbtn)
        {
            String courseID=txtid.getText();
            String course=txtcourse.getText();
            int duration=Integer.parseInt(txtduration.getText());
            String level=txtlevel.getText();
            String credit=txtcredit.getText();
            int assessment=Integer.parseInt(txtnoa.getText());
            
            objAC=new Academic_Course(courseID,course,duration,level,credit,assessment);
            al.add(objAC);
        }
        if(e.getSource()==displaybtn)
        {
            objAC.display();
        }
        if(e.getSource()==nonaddbtn)
        {
            String courseID=txtnonid.getText();
            String course=txtnoncourse.getText();
            int courseDuration=Integer.parseInt(txtnonduration.getText());
            String prerequisite=txtnonpre.getText();
            
            objNAC=new Non_Academic_Course(courseID,course,prerequisite,courseDuration);
            al.add(objNAC);
        }
        if(e.getSource()==nondisplaybtn)
        {
            objNAC.display();
        }
    }
    
    public static void main(String args[])
    {
        new INGCollege();
    }
}
