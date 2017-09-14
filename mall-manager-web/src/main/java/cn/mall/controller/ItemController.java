package cn.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;



@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	@RequestMapping("/Item/{id}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long id){
		TbItem item = itemService.getItemById(id);
		return item;
	}
}
