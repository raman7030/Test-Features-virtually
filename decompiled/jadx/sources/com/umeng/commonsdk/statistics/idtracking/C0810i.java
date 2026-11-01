package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.i */
/* JADX INFO: compiled from: S60Z */
/* JADX INFO: loaded from: classes.dex */
public class C0810i extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3439a = "serial";

    public C0810i() {
        super(f3439a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        return DeviceConfig.getSerial();
    }
}
