package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.۟۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C9343 {

    /* JADX INFO: renamed from: ֫ */
    public C10014 f25466;

    /* JADX INFO: renamed from: ۧ */
    public C22755 f25467;

    /* JADX INFO: renamed from: ֫ */
    public static C9343 m21678(Context context) {
        C24158.m53415(context.getApplicationContext());
        C11060.m25469("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C9343 c9343 = new C9343();
        C11060.m25469("openSDK_LOG.QQAuth", "new QQAuth() --start");
        C22755 c22755 = new C22755();
        c9343.f25467 = c22755;
        c9343.f25466 = new C10014(c22755);
        C10685.m24619(context, c22755);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", "3.5.18.lite");
        editorEdit.apply();
        C11060.m25469("openSDK_LOG.QQAuth", "new QQAuth() --end");
        C11060.m25469("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c9343;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m21679(Activity activity, InterfaceC6386 interfaceC6386) {
        C10014 c10014 = this.f25466;
        C11060.m25469("openSDK_LOG.QQAuth", "login()");
        C11060.m25469("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        try {
            String strM22692 = C9718.m22692(activity);
            if (strM22692 != null) {
                String strM12679 = C5695.m12679(new File(strM22692));
                if (!TextUtils.isEmpty(strM12679)) {
                    C11060.m25471("openSDK_LOG.QQAuth", "-->login channelId: " + strM12679);
                    C11060.m25469("openSDK_LOG.QQAuth", "loginWithOEM");
                    AbstractC24961.f79698 = true;
                    String str = strM12679.equals("") ? "null" : strM12679;
                    if (strM12679.equals("")) {
                        strM12679 = "null";
                    }
                    AbstractC24961.f79696 = strM12679;
                    AbstractC24961.f79697 = str;
                    AbstractC24961.f79695 = "null";
                    return c10014.m23344(activity, interfaceC6386);
                }
            }
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        C11060.m25464("openSDK_LOG.QQAuth", "-->login channelId is null ");
        AbstractC24961.f79698 = false;
        return c10014.m23344(activity, interfaceC6386);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22755 m21680() {
        return this.f25467;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m21681() {
        C22755 c22755 = this.f25467;
        C11060.m25469("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(c22755.m50934() ? "true" : "false"));
        return c22755.m50934();
    }
}
