package demo.menucolumn.manage.menu.interfaces.dto;

import demo.menucolumn.manage.menu.application.model.Column;
import demo.menucolumn.manage.menu.application.model.FilterType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by taesu on 2019-08-10.
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class ColumnRetrieveResponse {
    private float order;
    private String id;
    private String name;
    private FilterType filterType;
    private boolean visible;

    public static ColumnRetrieveResponse from(Column column, String name){
        return new ColumnRetrieveResponse(
                column.getOrder(),
                column.getId(),
                name,
                column.getFilterType(),
                column.isVisible()
        );
    }
}
