package com.chu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chu.reggie.dto.SetmealDto;
import com.chu.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
