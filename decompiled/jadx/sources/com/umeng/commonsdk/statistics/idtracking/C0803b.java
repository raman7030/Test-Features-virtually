package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.b */
/* JADX INFO: compiled from: 54MT */
/* JADX INFO: loaded from: classes.dex */
public class C0803b extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3412a = "android_id";

    /* JADX INFO: renamed from: b */
    public Context f3413b;

    public C0803b(Context context) {
        super(f3412a);
        this.f3413b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        return DeviceConfig.getAndroidId(this.f3413b);
    }
}
