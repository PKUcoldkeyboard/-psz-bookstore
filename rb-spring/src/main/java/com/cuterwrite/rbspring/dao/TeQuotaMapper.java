package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.TeQuota;
import com.cuterwrite.rbspring.entity.TeQuotaKey;
import org.springframework.stereotype.Repository;

/**
 * TeQuotaMapper继承基类
 */
@Repository
public interface TeQuotaMapper extends MyBatisBaseDao<TeQuota, TeQuotaKey> {
}