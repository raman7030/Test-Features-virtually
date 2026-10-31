package com.umeng.commonsdk.statistics.common;

import com.umeng.commonsdk.statistics.idtracking.f;
import com.umeng.commonsdk.statistics.idtracking.g;
import com.umeng.commonsdk.statistics.idtracking.h;

/* JADX INFO: loaded from: classes.dex */
public enum DeviceTypeEnum {
    IMEI(f.a, f.a),
    OAID(h.d, h.d),
    ANDROIDID(com.umeng.commonsdk.statistics.idtracking.b.a, com.umeng.commonsdk.statistics.idtracking.b.a),
    MAC(g.a, g.a),
    SERIALNO("serial_no", "serial_no"),
    IDFA(com.umeng.commonsdk.statistics.idtracking.c.a, com.umeng.commonsdk.statistics.idtracking.c.a),
    DEFAULT("null", "null");

    public String description;
    public String deviceIdType;

    DeviceTypeEnum(String str, String str2) {
        this.deviceIdType = str;
        this.description = str2;
    }

    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public String getDescription() {
        return this.description;
    }
}
