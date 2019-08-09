package demo.menucolumn.manage.menu.application.model;

import java.util.List;

/**
 * Created by taesu on 2019-08-09.
 */
public interface ListScreenColumns {

    String getMenuURI();

    List<Column> getColumns();

    FilterType getFilterType(String columnId);
}
