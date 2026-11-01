package p067l;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: renamed from: l.ܰ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C15752 {

    /* JADX INFO: renamed from: ۧ */
    public static C15752 f45621;

    /* JADX INFO: renamed from: ֫ */
    public volatile WeakReference f45622;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C15752 m35817() {
        if (f45621 == null) {
            C15752 c15752 = new C15752();
            c15752.f45622 = null;
            f45621 = c15752;
        }
        return f45621;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m35818(Context context, String str) {
        if (this.f45622 == null || this.f45622.get() == null) {
            this.f45622 = new WeakReference(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                C11060.m25467("openSDK_LOG.ServerSetting", "Get host error. url=".concat(str));
                return str;
            }
            String string = ((SharedPreferences) this.f45622.get()).getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                C11060.m25471("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            C11060.m25471("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            StringBuilder sbM11879 = C5410.m11879("getEnvUrl url=", str, "error.: ");
            sbM11879.append(e.getMessage());
            C11060.m25467("openSDK_LOG.ServerSetting", sbM11879.toString());
            return str;
        }
    }
}
