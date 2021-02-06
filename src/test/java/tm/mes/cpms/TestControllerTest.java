package tm.mes.cpms;

//import com.naughty.userlogin02.dao.MenuDao;
import tm.mes.cpms.dao.MenuDao;
import tm.mes.cpms.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

    @Autowired
    UserDao userDao;
    @Autowired
    MenuDao menuDao;

    @Test
    void run() {
        int count = userDao.getUserByMassage("admin","123456");
        if(count>0)
            System.out.println("ok");
        else
            System.out.println("error");
    }

}
