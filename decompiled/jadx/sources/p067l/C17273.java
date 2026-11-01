package p067l;

import android.util.Base64;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܺۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17273 {

    /* JADX INFO: renamed from: ᩵ */
    public static final byte[] f51466;

    /* JADX INFO: renamed from: ۖ */
    public final String f51468;

    /* JADX INFO: renamed from: ۘ */
    public long f51469;

    /* JADX INFO: renamed from: ۜ */
    public long f51470;

    /* JADX INFO: renamed from: ۡ */
    public boolean f51471;

    /* JADX INFO: renamed from: ۢ */
    public final String f51472;

    /* JADX INFO: renamed from: ۧ */
    public long f51473;

    /* JADX INFO: renamed from: ܳ */
    public long f51474;

    /* JADX INFO: renamed from: ܺ */
    public final String f51475;

    /* JADX INFO: renamed from: ܽ */
    public long f51476;

    /* JADX INFO: renamed from: ܿ */
    public final String f51477;

    /* JADX INFO: renamed from: ᩴ */
    public final long f51479;

    /* JADX INFO: renamed from: ᩷ */
    public long f51480;

    /* JADX INFO: renamed from: ᩻ */
    public final long f51481;

    /* JADX INFO: renamed from: ᩳ */
    public long f51478 = -1;

    /* JADX INFO: renamed from: ֫ */
    public long f51467 = -1;

    static {
        byte[] bArr = new byte[32];
        f51466 = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    public C17273(String str, String str2, String str3, long j, long j2, String str4) {
        this.f51472 = str;
        this.f51475 = str2;
        this.f51477 = str3;
        this.f51479 = j;
        this.f51481 = j2;
        this.f51468 = str4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m39124() {
        byte[] bytes = JSON.object().add(C0655am.f2277aE, 1).add(MotionUtils.EASING_TYPE_PATH, this.f51472).add("query", this.f51475).add("encoding", this.f51477).add("size", this.f51479).add("modified", this.f51481).add("sample", this.f51468).add("anchorLine", this.f51476).add("anchorByte", this.f51473).add("line", this.f51474).add("pending", this.f51471).add("outputLine", this.f51480).add("outputColumn", this.f51470).add("delivered", this.f51478).add("afterThrough", this.f51467).add("searched", this.f51469).toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(m39123(bytes), 11);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17273 m39122(String str, String str2) throws C5276 {
        try {
            if (str.length() > 32768) {
                throw new IllegalArgumentException();
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46)) {
                throw new IllegalArgumentException();
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(m39123(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw new IllegalArgumentException();
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            if (jSONObjectAsObject.getInt(C0655am.f2277aE) != 1 || !str2.equals(jSONObjectAsObject.getString(MotionUtils.EASING_TYPE_PATH))) {
                throw new IllegalArgumentException();
            }
            C17273 c17273 = new C17273(str2, jSONObjectAsObject.getString("query"), jSONObjectAsObject.getString("encoding"), jSONObjectAsObject.getLong("size"), jSONObjectAsObject.getLong("modified"), jSONObjectAsObject.getString("sample"));
            c17273.f51476 = jSONObjectAsObject.getLong("anchorLine");
            c17273.f51473 = jSONObjectAsObject.getLong("anchorByte");
            c17273.f51474 = jSONObjectAsObject.getLong("line");
            c17273.f51471 = jSONObjectAsObject.getBoolean("pending");
            c17273.f51480 = jSONObjectAsObject.getLong("outputLine");
            c17273.f51470 = jSONObjectAsObject.getLong("outputColumn");
            c17273.f51478 = jSONObjectAsObject.getLong("delivered");
            c17273.f51467 = jSONObjectAsObject.getLong("afterThrough");
            c17273.f51469 = jSONObjectAsObject.getLong("searched");
            return c17273;
        } catch (RuntimeException unused) {
            throw C5276.m11407("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m39123(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f51466, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }
}
