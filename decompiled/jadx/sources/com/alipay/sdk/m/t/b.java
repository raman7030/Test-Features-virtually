package com.alipay.sdk.m.t;

import android.text.TextUtils;
import com.alipay.sdk.m.y.g;
import l.C20087;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        try {
            return new JSONObject(this.b);
        } catch (Exception e) {
            g.a(e);
            return null;
        }
    }

    public String toString() {
        return C20087.m46306("<Letter envelop=", this.a, " body=", this.b, ">");
    }
}
