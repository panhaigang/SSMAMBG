package cn.et.food.entity;

public class Food {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.foodid
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    private Integer foodid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.foodName
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    private String foodname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.price
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.imagePath
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    private String imagepath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.foodid
     *
     * @return the value of food.foodid
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public Integer getFoodid() {
        return foodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.foodid
     *
     * @param foodid the value for food.foodid
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.foodName
     *
     * @return the value of food.foodName
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public String getFoodname() {
        return foodname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.foodName
     *
     * @param foodname the value for food.foodName
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.price
     *
     * @return the value of food.price
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.price
     *
     * @param price the value for food.price
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.imagePath
     *
     * @return the value of food.imagePath
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public String getImagepath() {
        return imagepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.imagePath
     *
     * @param imagepath the value for food.imagePath
     *
     * @mbg.generated Fri Dec 01 08:55:48 CST 2017
     */
    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }
}