package p067l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19566 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f59557;

    /* JADX INFO: renamed from: ۧ */
    public Matcher f59558;

    /* JADX INFO: renamed from: ܽ */
    public boolean f59559;

    /* JADX INFO: renamed from: ᩳ */
    public String f59560;

    /* JADX INFO: renamed from: ֫ */
    public final void m44474(C19566 c19566) {
        this.f59560 = c19566.f59560;
        this.f59557 = c19566.f59557;
        this.f59559 = c19566.f59559;
        this.f59558 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44478() {
        if (this.f59557 || !this.f59559) {
            return;
        }
        this.f59558 = Pattern.compile(this.f59560).matcher("");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44477(String str) {
        if (this.f59557) {
            return true;
        }
        if (this.f59559) {
            return this.f59558.reset(str).matches();
        }
        return str.equals(this.f59560);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44476() {
        return this.f59557 || !TextUtils.isEmpty(this.f59560);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: ֫ */
    public final void m44475(JSONObject jSONObject, char c) throws JSONException {
        String str;
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        if (jSONObject.has(strValueOf)) {
            Object obj = jSONObject.get(strValueOf);
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        this.f59560 = str;
        this.f59559 = jSONObject.getInt(strValueOf2) != 0;
        this.f59557 = jSONObject.getInt(strValueOf3) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44479(JSONObject jSONObject, char c) throws JSONException {
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        String str = this.f59560;
        if (str == null) {
            str = "";
        }
        jSONObject.put(strValueOf, str);
        jSONObject.put(strValueOf2, this.f59559 ? 1 : 0);
        jSONObject.put(strValueOf3, this.f59557 ? 1 : 0);
    }

    public final String toString() {
        if (this.f59557) {
            return "*";
        }
        return this.f59559 ? C10965.m25286(new StringBuilder("/"), this.f59560, "/") : this.f59560;
    }
}
