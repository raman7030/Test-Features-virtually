package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܺۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15683 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f48328;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f48330;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f48331;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f48332;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48333;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f48334;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f48335;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f48336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f48337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f48338;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f48339;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f48341;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f48342;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f48343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f48340 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f48329 = -1;

    static {
        byte[] bArr = new byte[32];
        f48328 = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    public C15683(String str, String str2, String str3, long j, long j2, String str4) {
        this.f48334 = str;
        this.f48337 = str2;
        this.f48339 = str3;
        this.f48341 = j;
        this.f48343 = j2;
        this.f48330 = str4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36958() {
        byte[] bytes = JSON.object().add(am.aE, 1).add(MotionUtils.EASING_TYPE_PATH, this.f48334).add("query", this.f48337).add("encoding", this.f48339).add("size", this.f48341).add("modified", this.f48343).add("sample", this.f48330).add("anchorLine", this.f48338).add("anchorByte", this.f48335).add("line", this.f48336).add("pending", this.f48333).add("outputLine", this.f48342).add("outputColumn", this.f48332).add("delivered", this.f48340).add("afterThrough", this.f48329).add("searched", this.f48331).toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(m36957(bytes), 11);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15683 m36956(String str, String str2) throws C3059 {
        try {
            if (str.length() > 32768) {
                throw new IllegalArgumentException();
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46)) {
                throw new IllegalArgumentException();
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(m36957(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw new IllegalArgumentException();
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            if (jSONObjectAsObject.getInt(am.aE) != 1 || !str2.equals(jSONObjectAsObject.getString(MotionUtils.EASING_TYPE_PATH))) {
                throw new IllegalArgumentException();
            }
            C15683 c15683 = new C15683(str2, jSONObjectAsObject.getString("query"), jSONObjectAsObject.getString("encoding"), jSONObjectAsObject.getLong("size"), jSONObjectAsObject.getLong("modified"), jSONObjectAsObject.getString("sample"));
            c15683.f48338 = jSONObjectAsObject.getLong("anchorLine");
            c15683.f48335 = jSONObjectAsObject.getLong("anchorByte");
            c15683.f48336 = jSONObjectAsObject.getLong("line");
            c15683.f48333 = jSONObjectAsObject.getBoolean("pending");
            c15683.f48342 = jSONObjectAsObject.getLong("outputLine");
            c15683.f48332 = jSONObjectAsObject.getLong("outputColumn");
            c15683.f48340 = jSONObjectAsObject.getLong("delivered");
            c15683.f48329 = jSONObjectAsObject.getLong("afterThrough");
            c15683.f48331 = jSONObjectAsObject.getLong("searched");
            return c15683;
        } catch (RuntimeException unused) {
            throw C3059.m9365("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m36957(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f48328, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }
}
