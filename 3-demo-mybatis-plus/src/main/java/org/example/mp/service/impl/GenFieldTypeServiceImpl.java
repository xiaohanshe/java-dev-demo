package org.example.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import org.example.mp.entity.GenFieldType;
import org.example.mp.mapper.GenFieldTypeMapper;
import org.example.mp.service.GenFieldTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@Service
public class GenFieldTypeServiceImpl extends ServiceImpl<GenFieldTypeMapper, GenFieldType> implements GenFieldTypeService {
    @Override
    public List<GenFieldType> pageGenFieldType() {
        QueryWrapper<GenFieldType> wrapper = new QueryWrapper<>();
        wrapper.lambda().orderByDesc(GenFieldType::getCreateTime);
        PageHelper.startPage(1,5);
        return this.baseMapper.selectList(wrapper);
    }
}
