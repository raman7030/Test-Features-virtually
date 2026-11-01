package p067l;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.analytics.pro.C0655am;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۧ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13072 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C19777 f36754;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Bundle f36755;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f36756;

    public RunnableC13072(C19777 c19777, Bundle bundle, boolean z) {
        this.f36754 = c19777;
        this.f36755 = bundle;
        this.f36756 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM45006 = "";
        C19777 c19777 = this.f36754;
        List list = c19777.f60171;
        Handler handler = c19777.f60173;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("uin", "1000");
            bundle.putString("platform", "1");
            bundle.putString("os_ver", Build.VERSION.RELEASE);
            bundle.putString("position", "");
            int i = C12221.f34155;
            bundle.putString("network", "unknown");
            bundle.putString(C0655am.f2259N, Locale.getDefault().getLanguage());
            bundle.putString(C0655am.f2365z, C15572.m35422(C24158.m53410()));
            bundle.putString("apn", "");
            bundle.putString("mn", C12401.m28567().m28572());
            bundle.putString(C0655am.f2258M, TimeZone.getDefault().getID());
            bundle.putString("sdk_ver", "3.5.18.lite");
            bundle.putString("qz_ver", C19797.m45006(C24158.m53410(), "com.qzone"));
            bundle.putString("qq_ver", C19797.m45004(C24158.m53410()));
            Context contextM53410 = C24158.m53410();
            String strM53418 = C24158.m53418();
            if (contextM53410 != null) {
                strM45006 = C19797.m45006(contextM53410, strM53418);
            }
            bundle.putString("qua", strM45006);
            bundle.putString("packagename", C24158.m53418());
            bundle.putString("app_ver", C19797.m45006(C24158.m53410(), C24158.m53418()));
            bundle.putAll(this.f36755);
            list.add(new C24290(bundle));
            int size = list.size();
            int iM53971 = C24470.m53965(C24158.m53410(), (String) null).m53971("Agent_ReportTimeInterval");
            if (iM53971 == 0) {
                iM53971 = 10000;
            }
            int iM53972 = C24470.m53965(C24158.m53410(), (String) null).m53971("Agent_ReportBatchCount");
            if (iM53972 == 0) {
                iM53972 = 5;
            }
            C11060.m25471("openSDK_LOG.ReportManager", "-->availableCount, report: report_via | dataSize: " + size + " | maxcount: " + iM53972);
            if (!(size >= iM53972) && !this.f36756) {
                if (handler.hasMessages(1001)) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001;
                handler.sendMessageDelayed(messageObtain, iM53971);
                return;
            }
            if (C19797.m45001(C24158.m53410())) {
                c19777.f60172.execute(new RunnableC18435(c19777));
            }
            handler.removeMessages(1001);
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
        }
    }
}
