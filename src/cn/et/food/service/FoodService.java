package cn.et.food.service;

import java.util.List;

import cn.et.food.entity.Food;

public interface FoodService {

	//��ѯ
	public abstract List<Food> queryFood(String foodname);

	//����
	public abstract void saveFood(Food food);
	
	//ɾ��
	public abstract void deleteFood(Integer foodid);
	
	//�޸�
	public abstract void updateFood(Food food);
}