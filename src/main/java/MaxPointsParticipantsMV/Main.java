package MaxPointsParticipantsMV;

import MaxPointsParticipantsMV.Repository.NoteRepo;
import MaxPointsParticipantsMV.Repository.StudentRepo;
import MaxPointsParticipantsMV.Repository.TemeRepo;
import MaxPointsParticipantsMV.Service.ServiceNote;
import MaxPointsParticipantsMV.Service.ServiceStudent;
import MaxPointsParticipantsMV.Service.ServiceTeme;
import MaxPointsParticipantsMV.UI.UI;
import MaxPointsParticipantsMV.Validator.NotaValidator;
import MaxPointsParticipantsMV.Validator.StudentValidator;
import MaxPointsParticipantsMV.Validator.TemeValidator;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        StudentRepo rep=new StudentRepo(new StudentValidator(),"C:\\Users\\Vlad\\Desktop\\MaxPointsParticipants\\src\\main\\java\\MaxPointsParticipantsMV\\studenti.xml");
        TemeRepo repo=new TemeRepo(new TemeValidator(),"C:\\Users\\Vlad\\Desktop\\MaxPointsParticipants\\src\\main\\java\\MaxPointsParticipantsMV\\teme.xml");
        NoteRepo r=new NoteRepo(new NotaValidator());
        ServiceStudent srv=new ServiceStudent(rep);
        ServiceTeme serv=new ServiceTeme(repo);
        ServiceNote sv=new ServiceNote(r);
        UI ui=new UI(srv,serv,sv);
        ui.show();

    }
}
