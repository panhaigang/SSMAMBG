package cn.et.food.service;

import java.util.List;

import cn.et.food.entity.Food;

public interface FoodService {

	//查询
	public abstract List<Food> queryFood(String foodname);

	//增加
	public abstract void saveFood(Food food);
	
	//删除
	public abstract void deleteFood(Integer foodid);
	
	//修改
	public abstract void updateFood(Food food);
}