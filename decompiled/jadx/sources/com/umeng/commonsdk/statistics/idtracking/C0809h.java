package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C0832d;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.h */
/* JADX INFO: compiled from: OBLD */
/* JADX INFO: loaded from: classes.dex */
public class C0809h extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3434a = "umeng_sp_oaid";

    /* JADX INFO: renamed from: b */
    public static final String f3435b = "key_umeng_sp_oaid";

    /* JADX INFO: renamed from: c */
    public static final String f3436c = "key_umeng_sp_oaid_required_time";

    /* JADX INFO: renamed from: d */
    public static final String f3437d = "oaid";

    /* JADX INFO: renamed from: e */
    public Context f3438e;

    public C0809h(Context context) {
        super(f3437d);
        this.f3438e = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        if (!FieldManager.allow(C0832d.f3593G)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = this.f3438e.getSharedPreferences(f3434a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(f3435b, "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
