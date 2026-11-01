package p067l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p052u0.C0227c;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.᩻ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24961 {

    /* JADX INFO: renamed from: ۧ */
    public static String f79695;

    /* JADX INFO: renamed from: ܽ */
    public static String f79696;

    /* JADX INFO: renamed from: ܿ */
    public static String f79697;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f79698;

    /* JADX INFO: renamed from: ֫ */
    public C22755 f79699;

    public AbstractC24961(C22755 c22755) {
        this.f79699 = c22755;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bundle m54854() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", C12401.m28567().m28572());
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", C0655am.f2320av);
        C22755 c22755 = this.f79699;
        if (c22755.m50934()) {
            bundle.putString("access_token", c22755.m50929());
            bundle.putString("oauth_consumer_key", "101492915");
            bundle.putString("openid", c22755.m50933());
        }
        SharedPreferences sharedPreferences = C24158.m53410().getSharedPreferences("pfStore", 0);
        if (f79698) {
            bundle.putString("pf", "desktop_m_qq-" + f79696 + "-android-" + f79697 + "-" + f79695);
            return bundle;
        }
        bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m54855() {
        Bundle bundleM54854 = m54854();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty("")) {
            bundleM54854.putString("need_version", "");
        }
        sb.append(C23130.m51585(bundleM54854));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Bundle m54856() {
        Bundle bundle = new Bundle();
        bundle.putString(C0227c.f1027d, "101492915");
        C22755 c22755 = this.f79699;
        if (c22755.m50934()) {
            bundle.putString("keystr", c22755.m50929());
            bundle.putString("keytype", "0x80");
        }
        String strM50933 = c22755.m50933();
        if (strM50933 != null) {
            bundle.putString("hopenid", strM50933);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = C24158.m53410().getSharedPreferences("pfStore", 0);
        if (f79698) {
            bundle.putString("pf", "desktop_m_qq-" + f79696 + "-android-" + f79697 + "-" + f79695);
        } else {
            bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
            bundle.putString("pf", "openmobile_android");
        }
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", C0655am.f2320av);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Intent m54852(Activity activity, Intent intent) {
        PendingIntent activity2;
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        try {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent2.putExtra("key_request_orientation", activity.getRequestedOrientation());
        intent2.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", intent);
        try {
            C11060.m25469("openSDK_LOG.BaseApi", "setActivityIntent requestCode: 11101");
            if (Build.VERSION.SDK_INT >= 23) {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1140850688);
            } else {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1073741824);
            }
            intent2.putExtra("key_extra_pending_intent", activity2);
        } catch (Throwable th2) {
            C11060.m25465("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54853(Activity activity, Intent intent) {
        intent.putExtra("key_request_code", 11101);
        try {
            activity.startActivityForResult(m54852(activity, intent), 11101);
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }
}
