package l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩻ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23772 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f76942;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f76943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f76944;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f76945;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21451 f76946;

    public AbstractC23772(C21451 c21451) {
        this.f76946 = c21451;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle m52445() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", C10556.m26534().m26539());
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        C21451 c21451 = this.f76946;
        if (c21451.m48597()) {
            bundle.putString("access_token", c21451.m48592());
            bundle.putString("oauth_consumer_key", "101492915");
            bundle.putString("openid", c21451.m48596());
        }
        SharedPreferences sharedPreferences = C22927.m51019().getSharedPreferences("pfStore", 0);
        if (f76945) {
            bundle.putString("pf", "desktop_m_qq-" + f76943 + "-android-" + f76944 + "-" + f76942);
            return bundle;
        }
        bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52446() {
        Bundle bundleM52445 = m52445();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty("")) {
            bundleM52445.putString("need_version", "");
        }
        sb.append(C21845.m49234(bundleM52445));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle m52447() {
        Bundle bundle = new Bundle();
        bundle.putString(c.d, "101492915");
        C21451 c21451 = this.f76946;
        if (c21451.m48597()) {
            bundle.putString("keystr", c21451.m48592());
            bundle.putString("keytype", "0x80");
        }
        String strM48596 = c21451.m48596();
        if (strM48596 != null) {
            bundle.putString("hopenid", strM48596);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = C22927.m51019().getSharedPreferences("pfStore", 0);
        if (f76945) {
            bundle.putString("pf", "desktop_m_qq-" + f76943 + "-android-" + f76944 + "-" + f76942);
        } else {
            bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
            bundle.putString("pf", "openmobile_android");
        }
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m52443(Activity activity, Intent intent) {
        PendingIntent activity2;
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        try {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent2.putExtra("key_request_orientation", activity.getRequestedOrientation());
        intent2.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", intent);
        try {
            C9145.m23518("openSDK_LOG.BaseApi", "setActivityIntent requestCode: 11101");
            if (Build.VERSION.SDK_INT >= 23) {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1140850688);
            } else {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1073741824);
            }
            intent2.putExtra("key_extra_pending_intent", activity2);
        } catch (Throwable th2) {
            C9145.m23514("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52444(Activity activity, Intent intent) {
        intent.putExtra("key_request_code", 11101);
        try {
            activity.startActivityForResult(m52443(activity, intent), 11101);
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }
}
