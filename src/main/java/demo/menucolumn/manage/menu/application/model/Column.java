package demo.menucolumn.manage.menu.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by taesu on 2019-08-09.
 */
@Builder @Getter @NoArgsConstructor @AllArgsConstructor
public class Column {
    private float order;
    private String id;
    private String nameCode;
    private FilterType filterType;
    private boolean visible;
}
