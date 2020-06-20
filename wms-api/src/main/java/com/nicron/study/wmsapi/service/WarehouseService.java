package com.nicron.study.wmsapi.service;

import com.nicron.study.wmsapi.utils.result.Result;


public interface WarehouseService {
    Result selectAllWarehouse();

    Result selectAvailableWarehouse();
}
