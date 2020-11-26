package com.dao.impl;

import com.dao.BaseDao;
import com.dao.MessageDao;
import com.entity.Message;

import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/11/26 19:30
 * 描述:
 */
public class MessageDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int insert(Message message) {
        String sql ="INSERT INTO `msg` (`fromUid`,`toUid`,`mTitle` ,`mContent`,`isRead`,`createTime`) VALUES (?,?,?,?,?,?)";
        return update(sql,message.getFromUid(),message.getToUid(),message.getmTitle(),message.getmContent(),message.getIsRead(),message.getCreateTime());

    }

    @Override
    public int update(Message message) {
       String sql ="UPDATE `msg` SET `fromUid` = ?,`toUid` = ?,`mTitle` = ?,`mContent` = ?,`isRead` = ?,`createTime` = ? WHERE `id` = ?";
        return update(sql,message.getFromUid(),message.getToUid(),message.getmTitle(),message.getmContent(),message.getIsRead(),message.getCreateTime(),message.getId());


    }

    @Override
    public int delete(Integer id) {
        String sql ="DELETE FROM `msg` WHERE `id` = ?";
        return update(sql,id);
    }

    @Override
    public List<Message> queryAll() {
        String sql ="SELECT * FROM `msg`";
        return queryForList(Message.class,sql);
    }

    @Override
    public Message queryMessageById(Integer id) {
        String sql ="SELECT * FROM `msg` WHERE `id` = ?";
        return queryForOne(Message.class,sql,id);
    }

    @Override
    public List<Message> queryMessageByToUid(Integer id) {
        String sql ="SELECT * FROM `msg` WHERE `toUid` = ?";
        return queryForList(Message.class,sql,id);
    }
}
