package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18095 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f56345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Matcher f56346;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f56347;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f56348;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42215(C18095 c18095) {
        this.f56348 = c18095.f56348;
        this.f56345 = c18095.f56345;
        this.f56347 = c18095.f56347;
        this.f56346 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42219() {
        if (this.f56345 || !this.f56347) {
            return;
        }
        this.f56346 = Pattern.compile(this.f56348).matcher("");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42218(String str) {
        if (this.f56345) {
            return true;
        }
        if (this.f56347) {
            return this.f56346.reset(str).matches();
        }
        return str.equals(this.f56348);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42217() {
        return this.f56345 || !TextUtils.isEmpty(this.f56348);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42216(JSONObject jSONObject, char c) throws JSONException {
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
        this.f56348 = str;
        this.f56347 = jSONObject.getInt(strValueOf2) != 0;
        this.f56345 = jSONObject.getInt(strValueOf3) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42220(JSONObject jSONObject, char c) throws JSONException {
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        String str = this.f56348;
        if (str == null) {
            str = "";
        }
        jSONObject.put(strValueOf, str);
        jSONObject.put(strValueOf2, this.f56347 ? 1 : 0);
        jSONObject.put(strValueOf3, this.f56345 ? 1 : 0);
    }

    public final String toString() {
        if (this.f56345) {
            return "*";
        }
        return this.f56347 ? C9045.m23341(new StringBuilder("/"), this.f56348, "/") : this.f56348;
    }
}
