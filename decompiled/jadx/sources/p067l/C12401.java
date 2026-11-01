package p067l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۤ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12401 {

    /* JADX INFO: renamed from: ֫ */
    public String f34652 = "";

    /* JADX INFO: renamed from: ۧ */
    public String f34653 = "";

    /* JADX INFO: renamed from: ᩳ */
    public static C12401 m28567() {
        return C14412.f41214;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28569(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f34653;
        if (str == null || str.trim().isEmpty()) {
            this.f34653 = sharedPreferences.getString("build_model", "");
            C11060.m25469("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f34653);
        }
        String str2 = this.f34652;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f34652 = sharedPreferences.getString("build_device", "");
            C11060.m25469("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f34652);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28568() {
        return this.f34652;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m28571() {
        return this.f34653;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m28572() {
        String str = this.f34653;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes(C0233a.f1077D), 2);
            } catch (UnsupportedEncodingException e) {
                C11060.m25467("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28570(Context context, String str) {
        C11060.m25469("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f34653 = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f34653;
        if (str2 != null && str2.equals(str)) {
            C11060.m25469("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f34653 = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f34653).commit();
            C11060.m25469("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }
}
