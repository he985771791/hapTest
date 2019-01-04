package com.hand.hap.order.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.order.dto.Order;
import com.hand.hap.order.service.IOrderService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/12/29
 */
@Controller
public class OrderController extends BaseController {
    @Autowired
    IOrderService orderService;
    @RequestMapping("/order/collect")
    @ResponseBody
    public ResponseData collect(HttpServletRequest request, Order order,
                                @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize){
       /* orderService.selectCollect(request,order,page,pageSize);
        return new ResponseData();*/
       if(order!=null){
           System.out.println(order.toString());
       }
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderService.selectCollect(requestContext,order,page,pageSize));
    }
    @RequestMapping("order/detail")
    public ResponseData detail(HttpServletRequest request,Order order,
                               @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                               @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize){
        if(order !=null){
            if(order.getHeaderId()!=null){
                IRequest requestContext = createRequestContext(request);
                return new ResponseData(orderService.selectDetails(requestContext,order,page,pageSize));
            }
        }
        return new ResponseData();
    }
}