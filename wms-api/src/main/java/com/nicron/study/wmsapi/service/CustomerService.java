package com.nicron.study.wmsapi.service;

import com.nicron.study.wmsapi.utils.result.Result;

public interface CustomerService {
    Result selectStorageByGoodsName(String goods);

    Result selectAllStorage();
}
