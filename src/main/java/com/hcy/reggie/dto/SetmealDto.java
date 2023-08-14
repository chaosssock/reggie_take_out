package com.hcy.reggie.dto;

import com.hcy.reggie.entity.Setmeal;
import com.hcy.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
