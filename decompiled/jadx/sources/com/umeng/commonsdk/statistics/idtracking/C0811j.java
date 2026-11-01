package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.utils.C0832d;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.j */
/* JADX INFO: compiled from: X5H8 */
/* JADX INFO: loaded from: classes.dex */
public class C0811j extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3440a = "utdid";

    /* JADX INFO: renamed from: b */
    public Context f3441b;

    public C0811j(Context context) {
        super("utdid");
        this.f3441b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        try {
            if (FieldManager.allow(C0832d.f3650u)) {
                String strM3087h = m3087h();
                return TextUtils.isEmpty(strM3087h) ? m3086g() : strM3087h;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private String m3086g() {
        try {
            return this.f3441b.getSharedPreferences("Alvin2", 0).getString("UTDID2", null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private String m3087h() {
        try {
            return this.f3441b.getSharedPreferences("um_push_ut", 0).getString("d_id", null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
