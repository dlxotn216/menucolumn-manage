package demo.menucolumn.manage.menu.application.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by taesu on 2019-08-09.
 */
public final class TemplateListColumns implements ListScreenColumns {

    private static TemplateListColumns instance = new TemplateListColumns();

    public static TemplateListColumns getInstance() {
        return instance;
    }

    private final List<Column> columns;

    private TemplateListColumns() {
        Column templateKey = Column.builder().order(10).id("templateKey").nameCode("TEMPLATE_LIST_TEMPLATE_KEY").filterType(FilterType.NONE).visible(false).build();
        Column templateName = Column.builder().order(20).id("templateName").nameCode("TEMPLATE_LIST_TEMPLATE_NAME").filterType(FilterType.LIKE_CHECKBOX).visible(true).build();
        Column templateType = Column.builder().order(30).id("templateType").nameCode("TEMPLATE_LIST_TEMPLATE_TYPE").filterType(FilterType.CHECKBOX).visible(true).build();
        Column fileName = Column.builder().order(40).id("fileName").nameCode("TEMPLATE_LIST_FILE_NAME").filterType(FilterType.LIKE).visible(true).build();

        columns = Arrays.asList(templateKey, templateName, templateType, fileName);
        columns.sort((o1, o2) -> Float.compare(o1.getOrder(), o2.getOrder()));
    }


    @Override
    public String getMenuURI() {
        return "/templates";
    }

    @Override
    public List<Column> getColumns() {
        return columns;
    }

    @Override
    public FilterType getFilterType(String columnId) {
        return columns.stream().filter(column -> column.getId().equalsIgnoreCase(columnId)).findAny()
                .map(Column::getFilterType)
                .orElse(FilterType.NONE);
    }
}
