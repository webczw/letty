package com.webczw.letty.api.converter;

import com.webczw.letty.api.model.req.UserReq;
import com.webczw.letty.api.model.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserVo userReqConverterUserVo(UserReq userReq);
}
