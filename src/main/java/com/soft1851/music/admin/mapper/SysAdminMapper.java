package com.soft1851.music.admin.mapper;

import com.soft1851.music.admin.entity.SysAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wqy
 * @since 2020-04-21
 */
public interface SysAdminMapper extends BaseMapper<SysAdmin> {
    /**
     * @param name
     * @return
     */
    SysAdmin selectByName(String name);

}
