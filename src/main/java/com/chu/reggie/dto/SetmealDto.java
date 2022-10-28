package com.chu.reggie.dto;

import com.chu.reggie.entity.Setmeal;
import com.chu.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
