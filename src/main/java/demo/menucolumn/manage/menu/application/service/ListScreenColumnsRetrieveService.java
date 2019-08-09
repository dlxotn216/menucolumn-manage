package demo.menucolumn.manage.menu.application.service;

import demo.menucolumn.manage.menu.application.model.Column;
import demo.menucolumn.manage.menu.application.model.ListScreenColumns;
import demo.menucolumn.manage.menu.application.model.TemplateListColumns;
import demo.menucolumn.manage.menu.interfaces.dto.ColumnRetrieveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static demo.menucolumn.manage.menu.interfaces.dto.ColumnRetrieveResponse.from;

/**
 * Created by taesu on 2019-08-10.
 */
@Component @RequiredArgsConstructor
public class ListScreenColumnsRetrieveService {
    private final MessageSource messageSource;

    private static final List<ListScreenColumns> LIST_SCREEN_COLUMNS = Arrays.asList(
            TemplateListColumns.getInstance()
    );

    public List<ColumnRetrieveResponse> retrieveColumns(String menuURI) {
        return LIST_SCREEN_COLUMNS.stream().filter(listScreenColumns -> listScreenColumns.getMenuURI().equalsIgnoreCase(menuURI))
                .findAny().orElseThrow(IllegalArgumentException::new)
                .getColumns()
                .stream()
                .map(column -> from(column, getColumnName(column)))
                .collect(Collectors.toList());
    }

    private String getColumnName(Column column) {
        return this.messageSource.getMessage(column.getNameCode(), null, LocaleContextHolder.getLocale());
    }
}
