package l;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.۟۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C7339 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8045 f22553;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21451 f22554;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7339 m19705(Context context) {
        C22927.m51024(context.getApplicationContext());
        C9145.m23518("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C7339 c7339 = new C7339();
        C9145.m23518("openSDK_LOG.QQAuth", "new QQAuth() --start");
        C21451 c21451 = new C21451();
        c7339.f22554 = c21451;
        c7339.f22553 = new C8045(c21451);
        C8751.m22649(context, c21451);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", "3.5.18.lite");
        editorEdit.apply();
        C9145.m23518("openSDK_LOG.QQAuth", "new QQAuth() --end");
        C9145.m23518("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c7339;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19706(Activity activity, InterfaceC4227 interfaceC4227) {
        C8045 c8045 = this.f22553;
        C9145.m23518("openSDK_LOG.QQAuth", "login()");
        C9145.m23518("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        try {
            String strM20712 = C7733.m20712(activity);
            if (strM20712 != null) {
                String strM10684 = C3500.m10684(new File(strM20712));
                if (!TextUtils.isEmpty(strM10684)) {
                    C9145.m23520("openSDK_LOG.QQAuth", "-->login channelId: " + strM10684);
                    C9145.m23518("openSDK_LOG.QQAuth", "loginWithOEM");
                    AbstractC23772.f76945 = true;
                    String str = strM10684.equals("") ? "null" : strM10684;
                    if (strM10684.equals("")) {
                        strM10684 = "null";
                    }
                    AbstractC23772.f76943 = strM10684;
                    AbstractC23772.f76944 = str;
                    AbstractC23772.f76942 = "null";
                    return c8045.m21377(activity, interfaceC4227);
                }
            }
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        C9145.m23513("openSDK_LOG.QQAuth", "-->login channelId is null ");
        AbstractC23772.f76945 = false;
        return c8045.m21377(activity, interfaceC4227);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21451 m19707() {
        return this.f22554;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19708() {
        C21451 c21451 = this.f22554;
        C9145.m23518("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(c21451.m48597() ? "true" : "false"));
        return c21451.m48597();
    }
}
