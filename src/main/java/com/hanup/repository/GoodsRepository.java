package com.hanup.repository;

import com.hanup.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
