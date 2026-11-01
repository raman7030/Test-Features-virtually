package com.alipay.sdk.p010m.p039o;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.alipay.sdk.m.o.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0179a {

    /* JADX INFO: renamed from: a */
    public String f738a = null;

    /* JADX INFO: renamed from: b */
    public String f739b = null;

    /* JADX INFO: renamed from: c */
    public String f740c = null;

    /* JADX INFO: renamed from: d */
    public String f741d = null;

    /* JADX INFO: renamed from: a */
    public void m825a(String str) {
        C0244g.m1203d(C0170a.f659B, "DebugUpgradeWarnData setData:" + str);
        this.f738a = str;
        this.f739b = null;
        this.f740c = null;
        this.f741d = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() >= 3) {
                this.f739b = jSONArray.getString(0);
                this.f741d = jSONArray.getString(1);
                this.f740c = jSONArray.getString(2);
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m826b() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.equals(language, "zh") && TextUtils.equals(country, "CN")) {
            return this.f739b;
        }
        return (TextUtils.equals(language, "zh") && TextUtils.equals(country, "TW")) ? this.f740c : this.f741d;
    }

    /* JADX INFO: renamed from: a */
    public String m824a() {
        return this.f738a;
    }
}
