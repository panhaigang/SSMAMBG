package cn.et.food.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.food.dao.FoodMapper;
import cn.et.food.entity.Food;
import cn.et.food.entity.FoodExample;
import cn.et.food.entity.FoodExample.Criteria;
import cn.et.food.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	FoodMapper food;
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.EmpService#queryEmp(java.lang.String)
	 */
	public List<Food> queryFood(String foodname){
		if(foodname==null){
			foodname="";
		}
		FoodExample e=new FoodExample();
		Criteria createCriteria = e.createCriteria();
		createCriteria.andFoodnameLike("%"+foodname+"%");
		return food.selectByExample(e);
		
	}
	
	
	public void saveFood(Food s) {
		food.insertSelective(s);
	}


	public void deleteFood(Integer foodid) {
		food.deleteByPrimaryKey(foodid);
	}


	public void updateFood(Food s) {
		food.updateByPrimaryKey(s);
		
	}
}