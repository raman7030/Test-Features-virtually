package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;

/* JADX INFO: compiled from: OBLD */
/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    public static final String a = "umeng_sp_oaid";
    public static final String b = "key_umeng_sp_oaid";
    public static final String c = "key_umeng_sp_oaid_required_time";
    public static final String d = "oaid";
    public Context e;

    public h(Context context) {
        super(d);
        this.e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        if (!FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.e.getSharedPreferences(a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
