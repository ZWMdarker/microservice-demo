package com.darker.order.service;

import com.darker.order.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {

    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    @Value("${myspcloud.item.url}")
    private String itemUrl;

    public Item queryItemById(Long id) {
        return restTemplate.getForObject(itemUrl + id, Item.class);
    }

}
