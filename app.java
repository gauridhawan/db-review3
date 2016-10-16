import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.entities.Student;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.util.List;

/**
 * Created by GAURI DHAWAN on 9/3/2016.
 */
public class app {
    public static void main(String[] args) {
        StudentDaoImpl sdi = new StudentDaoImpl();
        // sdi.createStudentTable();
        // Student student= new Student("Abxx","14BCL1212");
        //sdi.insert(student);
        //  Student student=sdi.selectById("14BCE1248");
        // System.out.println(student.getId()+", "+student.getFirstName());
        // sdi.delete("14BCL1212");
        List<Student> students = sdi.selectAll();
        for (Student student : students) {
            System.out.println(student.getId() + ", " + student.getFirstName());
        }
   /* Student student=new Student("ZZZZZ","14BCE1248");
        sdi.update(student,"14BCE1248");
    }*/
    }
}
        /*Connection connection = null;
        try {
            connection = ConnectionConfiguration.getConnection();
            if (connection != null) {
                System.out.println("Connection Established");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
*/