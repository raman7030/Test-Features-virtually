package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: 94PO */
/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    public static final String a = "imei";
    public Context b;

    public f(Context context) {
        super(a);
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getImeiNew(this.b);
    }
}
