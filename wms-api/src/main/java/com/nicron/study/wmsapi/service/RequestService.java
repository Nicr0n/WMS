package com.nicron.study.wmsapi.service;

import com.nicron.study.wmsapi.entity.Request;
import com.nicron.study.wmsapi.utils.result.Result;

public interface RequestService {
    Result selectAllRequest();

    Result insertRequest(Request request);

    Result selectRequestByUserId(Integer userId);
}
