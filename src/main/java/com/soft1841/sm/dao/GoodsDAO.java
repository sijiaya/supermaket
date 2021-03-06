package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

/**
 * 商品信息的增删改查
 */
public interface GoodsDAO {


    /**
     * 查看商品列表的DAO
     * @return
     * @throws SQLException
     */
    List<Goods> selectGoods() throws SQLException;

    /**
     * 往数据库中插入商品
     * @param goods
     * @return
     */
    Long insertGoods(Goods goods) throws SQLException;

    /**
     *根据商品编号查找
     * @param typeId
     * @return
     * @throws SQLException
     */

    List<Goods> selectGoodsByTypeId(int typeId) throws SQLException;
    List<Goods> selectGoodsByBarcode(Long barcode)throws SQLException;

    /**
     * 根据商品名关键词模糊查询商品
     * @param keywords
     * @return
     * @throws SQLException
     */
    List<Goods> selectGoodLike(String keywords) throws SQLException;


    /**
     * 根据id删除商品
     * @param id
     * @return
     * @throws SQLException
     */
    int deleteGoodsById(long id) throws SQLException;

    /**
     *
     * @param typeId
     * @return
     * @throws SQLException
     */
    int countByType( long typeId) throws SQLException;
    int updategoods(Goods goods) throws SQLException;


}
