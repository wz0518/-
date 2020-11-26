package com.service;

import com.entity.Message;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/11/26 19:43
 * 描述:
 */
public interface MessageService {
    Message queryMessageById(Integer id);

    List<Message> queryMessageByToUid(Integer id);
}
