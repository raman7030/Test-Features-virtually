package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: 966L */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    public static final String a = "idfa";
    public Context b;

    public c(Context context) {
        super(a);
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getIdfa(this.b);
    }
}
