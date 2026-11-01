package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.f */
/* JADX INFO: compiled from: 94PO */
/* JADX INFO: loaded from: classes.dex */
public class C0807f extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3430a = "imei";

    /* JADX INFO: renamed from: b */
    public Context f3431b;

    public C0807f(Context context) {
        super(f3430a);
        this.f3431b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        return DeviceConfig.getImeiNew(this.f3431b);
    }
}
