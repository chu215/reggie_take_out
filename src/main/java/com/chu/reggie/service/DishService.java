package com.chu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chu.reggie.dto.DishDto;
import com.chu.reggie.entity.Dish;

public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
