package com.dao;

import com.entity.Message;


import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/11/26 19:28
 * 描述:
 */
public interface MessageDao {
    int insert(Message message);

    int update(Message message);

    int delete(Integer id);

    List<Message> queryAll();

    Message queryMessageById(Integer id);

    List<Message> queryMessageByToUid(Integer id);
}
