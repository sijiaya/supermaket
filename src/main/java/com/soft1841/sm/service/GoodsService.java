package com.soft1841.sm.service;

import com.soft1841.sm.entity.Goods;

import java.util.List;

public interface GoodsService {




    /**
     * 新增商品
     * @param goods
     * @return
     */
    Long addGoods(Goods goods);

    /**
     *

    /**
     * 获取所有商品
     * @return
     */
    List<Goods> getAllGoods();

    /**
     * 根据商品编号查询
     * @param typeId
     * @return
     */
    List<Goods> getGoodsByTypeId(int typeId);

    /**
     *
     * @param barcode
     * @return
     */
    List<Goods> getGoodsByBarcode(long barcode);

    /**
     *
     * @param keywords
     * @return
     */
    List<Goods> getGoodsLike(String keywords);



    /**
     * 删除商品
     * @param id
     */
    void deleteGoods(long id);

    /**
     *  根据商品类别统计
     * @param typeId
     * @return
     */

    int countByType(long typeId);
    void updateGoods(Goods goods);
}

