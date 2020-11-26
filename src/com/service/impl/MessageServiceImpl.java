package com.service.impl;

import com.dao.MessageDao;
import com.dao.impl.MessageDaoImpl;
import com.entity.Message;
import com.service.MessageService;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/11/26 19:49
 * 描述:
 */
public class MessageServiceImpl implements MessageService {
    MessageDao messageDao =new MessageDaoImpl();

    @Override
    public Message queryMessageById(Integer id) {
        return messageDao.queryMessageById(id);
    }

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        return messageDao.queryMessageByToUid(id);
    }
}
