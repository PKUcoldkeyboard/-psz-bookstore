package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.TeQuota;
import com.cuterwrite.rbspring.entity.TeQuotaKey;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * TeQuotaMapper继承基类
 */
@Repository
public interface TeQuotaMapper extends MyBatisBaseDao<TeQuota, TeQuotaKey> {
	List<TeQuota>selectByTeId(String teId);
}