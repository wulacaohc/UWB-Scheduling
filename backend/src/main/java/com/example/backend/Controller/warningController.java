package com.example.backend.Controller;


import com.example.backend.Controller.request.warningPageRequest;
import com.example.backend.Entity.warning;
import com.example.backend.Service.warningService;
import com.example.backend.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping("/security")
public class warningController {

    @Autowired
    warningService warningService;

    @GetMapping("/List")
    public Result Selectwarnings() {
        List<warning> Warnings = warningService.Selectwarnings();
        return Result.success(Warnings);
    }

    @GetMapping("/Page")
    public Result Page(warningPageRequest warningPageRequest) {
        return Result.success(warningService.page(warningPageRequest));
    }
}
