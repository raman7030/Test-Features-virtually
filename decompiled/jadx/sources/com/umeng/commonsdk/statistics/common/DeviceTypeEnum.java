package com.umeng.commonsdk.statistics.common;

import com.umeng.commonsdk.statistics.idtracking.C0803b;
import com.umeng.commonsdk.statistics.idtracking.C0804c;
import com.umeng.commonsdk.statistics.idtracking.C0807f;
import com.umeng.commonsdk.statistics.idtracking.C0808g;
import com.umeng.commonsdk.statistics.idtracking.C0809h;

/* JADX INFO: loaded from: classes.dex */
public enum DeviceTypeEnum {
    IMEI(C0807f.f3430a, C0807f.f3430a),
    OAID(C0809h.f3437d, C0809h.f3437d),
    ANDROIDID(C0803b.f3412a, C0803b.f3412a),
    MAC(C0808g.f3432a, C0808g.f3432a),
    SERIALNO("serial_no", "serial_no"),
    IDFA(C0804c.f3414a, C0804c.f3414a),
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
