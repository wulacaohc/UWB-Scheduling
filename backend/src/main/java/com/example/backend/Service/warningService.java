package com.example.backend.Service;

import com.example.backend.Controller.request.warningPageRequest;
import com.example.backend.Entity.warning;

import java.util.List;

public interface warningService {
    List<warning> Selectwarnings();
    Object page(warningPageRequest warningPageRequest);
}
