package cuc.waimai.controller.shopcontroller;

import cuc.waimai.entity.Shop;
import cuc.waimai.entity.ShopEvaluate;
import cuc.waimai.Vo.ShopVo;
import cuc.waimai.service.ShopEvaluateService;
import cuc.waimai.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShopHandlerController {
    @Autowired
    ShopService shopService;
    @Autowired
    ShopEvaluateService shopEvaluateService;
    @RequestMapping("/shopSelectAll.do")
    @ResponseBody
    public List<Shop> shopSelectAll(){
        return shopService.selectAll();
    }

    @RequestMapping("/shopSelectByShopId.do")
    @ResponseBody
    public ShopVo shopSelectByShopId(@RequestParam("shopId") Integer shopId) {
        Shop shop=shopService.selectByPrimaryKey(shopId);
        ShopVo shopVo=new ShopVo();
        shopVo.setShopimageFragment3(shop.getShopImg());
        shopVo.setShopaddFragment3(shop.getShopAdd());
        shopVo.setShopnameFragment3(shop.getShopName());
        shopVo.setShopcreateFragment3(shop.getShopCreatetime().toString());
        shopVo.setShopproclamationFragment3(shop.getShopProclamation());
        return shopVo;
    }
    @RequestMapping("/shopSelectEvaAllByShopId.do")
    @ResponseBody
    public List<ShopEvaluate> shopSelectEvaAll(@RequestParam("shopId") Integer shopId){
        return shopEvaluateService.selectByShopId(shopId);
    }

    @RequestMapping("/shopEvaInsert.do")
    @ResponseBody
    public int shopEvaInsert(@RequestParam("shopId") Integer shopId,
                             @RequestParam("userId") Integer userId,
                             @RequestParam("evAll") String  evAll,
                             @RequestParam("evComment") String evComment
                             ){
        ShopEvaluate shopEvaluate=new ShopEvaluate();
        shopEvaluate.setShopId(shopId);
        shopEvaluate.setUserId(userId);
        shopEvaluate.setEvAll(Double.parseDouble(evAll));
        shopEvaluate.setEvComment(evComment);
        return shopEvaluateService.insert(shopEvaluate);
    }
}
