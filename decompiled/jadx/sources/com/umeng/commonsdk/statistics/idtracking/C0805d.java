package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.d */
/* JADX INFO: compiled from: Z68B */
/* JADX INFO: loaded from: classes.dex */
public class C0805d extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3416a = "idmd5";

    /* JADX INFO: renamed from: b */
    public Context f3417b;

    public C0805d(Context context) {
        super("idmd5");
        this.f3417b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f3417b);
    }
}
