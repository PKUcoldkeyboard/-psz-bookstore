package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.UsNotice;
import com.cuterwrite.rbspring.entity.UsNoticeKey;
import org.springframework.stereotype.Repository;

/**
 * UsNoticeMapper继承基类
 */
@Repository
public interface UsNoticeMapper extends MyBatisBaseDao<UsNotice, UsNoticeKey> {
}