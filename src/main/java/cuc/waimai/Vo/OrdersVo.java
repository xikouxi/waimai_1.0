package cuc.waimai.Vo;

import cuc.waimai.Dao.Orders;

import java.util.Date;
import java.util.List;

public class OrdersVo {
    private String order_number;
    private String order_status;
    private Date order_time;
    private Date arrive_time;
    private int horseman_id;
    private int shop_id;
    private  int horseman_tel;
    private String user_name;
    private String user_add;
    private int user_tel;
    private List<FoodVo> food_list;

    public String getOrder_number() {
        return order_number;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Date getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(Date arrive_time) {
        this.arrive_time = arrive_time;
    }

    public int getHorseman_id() {
        return horseman_id;
    }

    public void setHorseman_id(int horseman_id) {
        this.horseman_id = horseman_id;
    }

    public int getHorseman_tel() {
        return horseman_tel;
    }

    public void setHorseman_tel(int horseman_tel) {
        this.horseman_tel = horseman_tel;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_add() {
        return user_add;
    }

    public void setUser_add(String user_add) {
        this.user_add = user_add;
    }

    public int getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(int user_tel) {
        this.user_tel = user_tel;
    }

    public List<FoodVo> getFood_list() {
        return food_list;
    }

    public void setFood_list(List<FoodVo> food_list) {
        this.food_list = food_list;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}