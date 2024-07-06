package com.example.backend.Service.Impl;

import com.example.backend.Controller.request.MaterialPageRequest;
import com.example.backend.Entity.Material;
import com.example.backend.Mapper.MaterialMapper;
import com.example.backend.Service.MaterialService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
//必须引用Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    MaterialMapper materialMapper;

    @Override
    public List<Material> SelectMaterials() {
        return materialMapper.SelectMaterials();
    }
    @Override
    public List<String> listMaterialtag(){
        return materialMapper.listMaterialtag();
    }

    public Map<String, Integer> addlabel() {
        Map<String, Integer> map = new HashMap<>();
        List<String> mtag = materialMapper.listMaterialtag();
        int a1 = 0, a2 = 0, b1 = 0, b2 = 0; // 初始化计数器为0
        for (int i = 0; i < mtag.size(); i++) {
            String value = mtag.get(i);
            if (value.equals("A")) {
                a1++; // 增加计数器
            } else if (value.equals("B")) {
                a2++; // 增加计数器
            } else if (value.equals("C")) {
                b1++; // 增加计数器
            } else if (value.equals("D")) {
                b2++; // 增加计数器
            }
        }
        map.put("A", a1);
        map.put("B", a2);
        map.put("C", b1);
        map.put("D", b2);
        return map;
    }

    @Override
    public Object page(MaterialPageRequest materialPageRequest) {
        String type=materialPageRequest.getMaterialType();
        PageHelper.startPage(materialPageRequest.getPageNum(), materialPageRequest.getPageSize());
        List<Material> materials = materialMapper.listByCondition(materialPageRequest);
        return new PageInfo<>(materials);
    }

    @Override
    public void addMaterial(Material material) {
        materialMapper.addMaterial(material);
    }
    public void updateMaterial(Material material) {
        materialMapper.updateMaterial(material);
    }

    @Override
    public void deleteMaterial(String id) {
        materialMapper.deleteMaterial(id);
    }
}