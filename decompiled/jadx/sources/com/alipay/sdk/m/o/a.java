package com.alipay.sdk.m.o;

import android.text.TextUtils;
import com.alipay.sdk.m.y.g;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;

    public void a(String str) {
        g.d(com.alipay.sdk.m.n.a.B, "DebugUpgradeWarnData setData:" + str);
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() >= 3) {
                this.b = jSONArray.getString(0);
                this.d = jSONArray.getString(1);
                this.c = jSONArray.getString(2);
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public String b() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.equals(language, "zh") && TextUtils.equals(country, "CN")) {
            return this.b;
        }
        return (TextUtils.equals(language, "zh") && TextUtils.equals(country, "TW")) ? this.c : this.d;
    }

    public String a() {
        return this.a;
    }
}
