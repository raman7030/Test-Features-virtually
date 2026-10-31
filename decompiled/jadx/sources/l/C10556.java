package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۤ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f31688 = "";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f31689 = "";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C10556 m26534() {
        return C12672.f38187;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26536(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f31689;
        if (str == null || str.trim().isEmpty()) {
            this.f31689 = sharedPreferences.getString("build_model", "");
            C9145.m23518("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f31689);
        }
        String str2 = this.f31688;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f31688 = sharedPreferences.getString("build_device", "");
            C9145.m23518("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f31688);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26535() {
        return this.f31688;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26538() {
        return this.f31689;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m26539() {
        String str = this.f31689;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes(a.D), 2);
            } catch (UnsupportedEncodingException e) {
                C9145.m23516("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26537(Context context, String str) {
        C9145.m23518("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f31689 = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f31689;
        if (str2 != null && str2.equals(str)) {
            C9145.m23518("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f31689 = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f31689).commit();
            C9145.m23518("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }
}
