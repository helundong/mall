package cn.mall.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mall.mapper.TbItemMapper;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem getItemById(Long id) {
		// TODO Auto-generated method stub
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		return tbItem;
	}

}
