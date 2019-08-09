package demo.menucolumn.manage.menu.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by taesu on 2019-08-09.
 */
@AllArgsConstructor @Getter
public enum FilterType {
    NONE("NONE"), LIKE("LIKE"), LIKE_CHECKBOX("LIKE_CHECKBOX"), CHECKBOX("CHECKBOX"), DATE_RANGE("DATE_RANGE");
    private String type;


}
