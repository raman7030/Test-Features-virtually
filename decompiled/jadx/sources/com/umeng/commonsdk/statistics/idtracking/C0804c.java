package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.c */
/* JADX INFO: compiled from: 966L */
/* JADX INFO: loaded from: classes.dex */
public class C0804c extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3414a = "idfa";

    /* JADX INFO: renamed from: b */
    public Context f3415b;

    public C0804c(Context context) {
        super(f3414a);
        this.f3415b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        return DeviceConfig.getIdfa(this.f3415b);
    }
}
