package priv.zg.service.impl;

import org.springframework.stereotype.Service;

import priv.zg.mapper.ItemMapper;
import priv.zg.service.ItemService;

import javax.annotation.Resource;

/**
 * 商品服务impl
 *
 * @author tsz
 * @date 2021/11/05
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;


}
