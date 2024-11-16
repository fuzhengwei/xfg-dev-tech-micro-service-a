package cn.bugstack.xfg.dev.tech.api;

import cn.bugstack.xfg.dev.tech.api.dto.UserRequestDTO;
import cn.bugstack.xfg.dev.tech.api.dto.UserResponseDTO;

public interface IUserService {

    UserResponseDTO queryUserInfo(UserRequestDTO requestDTO);

}
