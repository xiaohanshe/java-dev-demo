package org.example.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.mp.entity.GenFieldType;

import java.util.List;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
public interface GenFieldTypeService extends IService<GenFieldType> {
    List<GenFieldType> pageGenFieldType();
}
