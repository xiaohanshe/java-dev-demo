package org.example.dynamic.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dynamic.entity.SysDatasourceConfig;
import org.example.dynamic.mapper.SysDatasourceConfigMapper;
import org.springframework.stereotype.Service;

/**
 * 系统数据源服务
 *
 * @author han
 * @since 2023/06/28
 */
@Service
public class SysDatasourceConfigService extends ServiceImpl<SysDatasourceConfigMapper, SysDatasourceConfig> {
}
