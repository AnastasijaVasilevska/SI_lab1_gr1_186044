import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> studenti=new ArrayList<>();

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    double pointAverage(){
        int suma=0;
        for(int i=0;i<getStudenti().size();i++){
            suma+=getStudenti().get(i).getAverage();
        }
        return suma/getStudenti().size();
    }
    int Signatures(){
        int suma=0;
        for(int i=0;i<getStudenti().size();i++){
            if(getStudenti().get(i).hasSignature()){
                suma+=1;
            }
        }
        return suma;
    }

}
