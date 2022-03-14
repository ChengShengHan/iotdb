package org.apache.iotdb.db.query.mpp.common;

/**
 * The traversal order for operators by timestamp
 */
public enum OrderBy {
    TIMESTAMP_ASC,
    TIMESTAMP_DESC,
    DEVICE_NAME_ASC,
    DEVICE_NAME_DESC,
}