package cuc.waimai.Vo;

import cuc.waimai.entity.FoodShop;

public class FoodVo {
    private int food_id;
    private String food_name;
    private Integer food_count;
    private String category;
    private FoodShop foodShop;

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public FoodShop getFoodShop() {
        return foodShop;
    }

    public void setFoodShop(FoodShop foodShop) {
        this.foodShop = foodShop;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getFood_count() {
        return food_count;
    }

    public void setFood_count(Integer food_count) {
        this.food_count = food_count;
    }
}
