package tm.mes.cpms.dao;

import tm.mes.cpms.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
