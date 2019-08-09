package demo.menucolumn.manage.menu.interfaces.controller;

import demo.menucolumn.manage.menu.application.service.ListScreenColumnsRetrieveService;
import demo.menucolumn.manage.menu.interfaces.dto.ColumnRetrieveResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by taesu on 2019-08-10.
 */
@RestController @RequiredArgsConstructor
public class ListScreenColumnsRetrieveController {
    private final ListScreenColumnsRetrieveService listScreenColumnsRetrieveService;

    @GetMapping("/columns")
    public ResponseEntity<List<ColumnRetrieveResponse>> retrieve(@RequestParam("menuURI") String menuURI) {
        return ResponseEntity.ok(this.listScreenColumnsRetrieveService.retrieveColumns(menuURI));
    }
}
