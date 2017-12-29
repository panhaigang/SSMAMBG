package cn.et.food.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.et.food.entity.Food;
import cn.et.food.service.FoodService;

@Controller
public class FoodController {
	@Autowired
	FoodService food;
	@ResponseBody
	@RequestMapping(value="/queryFoodList",method=RequestMethod.GET)
	//�ڲ�������� (@RequestParam(required=false) String ename)���Բ����ݲ���
	public List<Food> queryFood(String ename) {
		return food.queryFood(ename);
	}
	
	@RequestMapping(value="/deleteFood/{foodid}",method=RequestMethod.DELETE)
	public String deleteFood(@PathVariable Integer foodid, OutputStream os) throws UnsupportedEncodingException, IOException{
		try{
			food.deleteFood(foodid);
			os.write("1".getBytes("UTF-8"));
		}catch(Exception e){
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
	@RequestMapping(value="/updateFood/{foodid}",method=RequestMethod.PUT)
	public String updateFood(@PathVariable String foodid,String foodname,String price, OutputStream os) throws UnsupportedEncodingException, IOException{
		Food f=new Food();
		f.setFoodid(Integer.valueOf(foodid));
		f.setFoodname(foodname);
		f.setPrice(Integer.valueOf(price));
		try{
			 food.updateFood(f);
			//�����Դ���ɹ�
			os.write("1".getBytes("UTF-8"));
		}catch(Exception e){
			//����0����ʧ��
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
	
	//����
	@RequestMapping(value="/saveFood",method=RequestMethod.POST)
	public String saveFood(String foodname,String price, OutputStream os) throws UnsupportedEncodingException, IOException{
		Food f=new Food();
		f.setFoodname(foodname);
		f.setPrice(Integer.valueOf(price));
		try{
			food.saveFood(f);
			os.write("1".getBytes("UTF-8"));
		}catch(Exception e){
			os.write("0".getBytes("UTF-8"));
		}
		return null;
	}
	
}