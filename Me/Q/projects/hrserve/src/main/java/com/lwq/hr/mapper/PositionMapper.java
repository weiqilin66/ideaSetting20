package com.lwq.hr.mapper;

import com.lwq.hr.entity.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LinWeiQi
 * @since 2020-01-28
 */
public interface PositionMapper extends BaseMapper<Position> {

    @Select("select * from position")
    List<Position> queryAll();
}
