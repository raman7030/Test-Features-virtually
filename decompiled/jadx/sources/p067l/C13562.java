package p067l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p052u0.C0227c;
import com.umeng.analytics.pro.C0655am;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۨܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13562 {

    /* JADX INFO: renamed from: ܺ */
    public static C13562 f38141;

    /* JADX INFO: renamed from: ۡ */
    public boolean f38144;

    /* JADX INFO: renamed from: ֫ */
    public String f38142 = "";

    /* JADX INFO: renamed from: ۧ */
    public String f38146 = "";

    /* JADX INFO: renamed from: ܽ */
    public String f38148 = "";

    /* JADX INFO: renamed from: ᩳ */
    public String f38150 = "";

    /* JADX INFO: renamed from: ܿ */
    public String f38149 = "";

    /* JADX INFO: renamed from: ܳ */
    public String f38147 = "";

    /* JADX INFO: renamed from: ᩻ */
    public String f38152 = "";

    /* JADX INFO: renamed from: ۜ */
    public List f38143 = C18426.m41997();

    /* JADX INFO: renamed from: ᩷ */
    public List f38151 = C18426.m41997();

    /* JADX INFO: renamed from: ۢ */
    public Executor f38145 = C18455.m42011();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C13562 m30863() {
        if (f38141 == null) {
            f38141 = new C13562();
        }
        return f38141;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30866(Context context) {
        C11060.m25471("AttaReporter", "init");
        this.f38142 = "101492915";
        this.f38146 = C9718.m22693(context);
        this.f38150 = C19797.m45006(context, C24158.m53418());
        this.f38149 = C24158.m53418();
        this.f38147 = C9718.m22699(context) ? "1" : "0";
        this.f38152 = C19797.m45004(context);
        while (true) {
            List list = this.f38151;
            if (list.isEmpty()) {
                break;
            }
            C24290 c24290 = (C24290) list.remove(0);
            HashMap map = c24290.f76941;
            map.put(C0227c.f1027d, this.f38142);
            map.put("app_name", this.f38146);
            map.put("app_ver", this.f38150);
            map.put("pkg_name", this.f38149);
            map.put("qq_install", this.f38147);
            map.put("qq_ver", this.f38152);
            map.put("openid", this.f38148);
            map.put("time_appid_openid", ((String) map.get("time")) + "_" + this.f38142 + "_" + this.f38148);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c24290);
            C11060.m25471("AttaReporter", sb.toString());
            this.f38143.add(c24290);
        }
        Context contextM53410 = C24158.m53410();
        if (contextM53410 == null) {
            return;
        }
        contextM53410.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30867(String str) {
        C11060.m25471("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f38148 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30868(String str, String str2, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("attaid", "09400051119");
        map.put("token", "9389887874");
        map.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f38142 + "_" + this.f38148);
        map.put("time", String.valueOf(jCurrentTimeMillis));
        map.put("openid", this.f38148);
        map.put(C0227c.f1027d, this.f38142);
        map.put("app_name", this.f38146);
        map.put("app_ver", this.f38150);
        map.put("pkg_name", this.f38149);
        map.put(C0655am.f2363x, "AND");
        map.put("os_ver", Build.VERSION.RELEASE);
        map.put("sdk_ver", "3.5.18.lite");
        map.put("mn", C12401.m28567().m28572());
        map.put("interface_name", str);
        map.put("interface_data", str2);
        map.put("interface_result", obj == null ? "" : obj.toString());
        map.put("qq_install", this.f38147);
        map.put("qq_ver", this.f38152);
        C24290 c24290 = new C24290(map);
        if (TextUtils.isEmpty(this.f38142) || TextUtils.isEmpty(this.f38146) || C24158.m53410() == null) {
            C11060.m25471("AttaReporter", "attaReport cancel appid=" + this.f38142 + ", mAppName=" + this.f38146 + ", context=" + C24158.m53410() + ", " + c24290);
            this.f38151.add(c24290);
            return;
        }
        this.f38145.execute(new RunnableC8197(this, c24290));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m30865(C13562 c13562) {
        List list = c13562.f38143;
        C11060.m25471("AttaReporter", "attaReportAtSubThread");
        if (!c13562.f38144) {
            List listM41997 = C18426.m41997();
            c13562.f38144 = listM41997.isEmpty();
            list.addAll(listM41997);
            Iterator it = listM41997.iterator();
            while (it.hasNext()) {
                C11060.m25471("AttaReporter", "attaReportAtSubThread from db = " + ((Serializable) it.next()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = 1;
            int i2 = 0;
            if (list.isEmpty()) {
                break;
            }
            C24290 c24290 = (C24290) list.remove(0);
            while (true) {
                i2 += i;
                try {
                    C11060.m25471("AttaReporter", "doAttaReportItem post " + c24290);
                    if (C21609.m48810().m48815(c24290.f76941, "https://h.trace.qq.com/kv").mo15701d() != 200) {
                        arrayList.add(c24290);
                        break;
                    }
                    break;
                } catch (Exception e) {
                    C11060.m25468("AttaReporter", "Exception", e);
                    if (i2 >= 2) {
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (c13562.f38144) {
                return;
            }
            C11060.m25471("AttaReporter", "attaReportAtSubThread clear db");
            c13562.f38144 = true;
            return;
        }
        C11060.m25471("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C11060.m25471("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C24290) ((Serializable) it2.next())));
        }
        c13562.f38144 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m30864() {
        return m30863().f38142;
    }
}
