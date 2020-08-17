package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.DatabaseBackup;
import org.springframework.stereotype.Repository;

/**
 * DatabaseBackupMapper继承基类
 */
@Repository
public interface DatabaseBackupMapper extends MyBatisBaseDao<DatabaseBackup, Integer> {
}