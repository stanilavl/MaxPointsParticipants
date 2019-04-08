package MaxPointsParticipantsMV;

import static org.junit.Assert.assertTrue;

import MaxPointsParticipantsMV.Domain.Nota;
import MaxPointsParticipantsMV.Domain.Student;
import MaxPointsParticipantsMV.Domain.Teme;
import MaxPointsParticipantsMV.Repository.NoteRepo;
import MaxPointsParticipantsMV.Repository.StudentRepo;
import MaxPointsParticipantsMV.Repository.TemeRepo;
import MaxPointsParticipantsMV.Validator.NotaValidator;
import MaxPointsParticipantsMV.Validator.StudentValidator;
import MaxPointsParticipantsMV.Validator.TemeValidator;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;

import java.io.Console;
import java.util.Map;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    StudentRepo studentRepo;
    TemeRepo temeRepo;
    NoteRepo noteRepo;

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Before
    public void setUp(){
        studentRepo=new StudentRepo(new StudentValidator(),"C:\\Users\\Vlad\\Desktop\\MaxPointsParticipants\\src\\main\\java\\MaxPointsParticipantsMV\\studenti.xml");
        temeRepo=new TemeRepo(new TemeValidator(),"C:\\Users\\Vlad\\Desktop\\MaxPointsParticipants\\src\\main\\java\\MaxPointsParticipantsMV\\teme.xml");
        noteRepo=new NoteRepo(new NotaValidator());
    }

    @Test
    public void addStudent(){
        Student newStudent = new Student("4","StudentTest",933,"@.com","ProfTest");
        studentRepo.save(newStudent);
        assertTrue(studentRepo.findOne("4").getNume().equals("StudentTest"));
    }

    @Test
    public void addAssignment(){
        Teme newAssignment = new Teme(4,"TemaTest",3,5);
        temeRepo.save(newAssignment);
        assertTrue(temeRepo.findOne(4).getDescriere().equals("TemaTest"));
    }

    @Test
    public void addGrade(){
        Student newStudent = new Student("4","StudentTest",933,"@.com","ProfTest");
        Teme newAssignment = new Teme(4,"TemaTest",3,5);
    }
}
