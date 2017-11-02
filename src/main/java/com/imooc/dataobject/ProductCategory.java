package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by kinglas on 2017/8/23.
 * 这里的类名对应表名，如果表名与类名不一致的话，比如表名是 s_product_category,这时
 * 可以直接 @Table("s_product_category")
 * @Data包含了生成 getter setter 以及toString 的功能，这样就不用咋实体类里面写get set 以及 toString()方法了，
 * 而且当我们修改了实体类里面某个属性的类型或者属性名时，他会自动生成相应的get set 方法，便于我们代码的维护和管理
 * 但是前提是要安装 lombok插件以及添加 lombok插件以及添加(@Data注解在lombok包里，而Lombok插件是为了是程序不飘红
 * 强迫症的福音)
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /*类目 id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /*类目名称*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
