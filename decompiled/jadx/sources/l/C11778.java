package l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.umeng.analytics.pro.am;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۨܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11778 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C11778 f35142;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f35145;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f35143 = "";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f35147 = "";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f35149 = "";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f35151 = "";

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f35150 = "";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f35148 = "";

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f35153 = "";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f35144 = C16895.m39756();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f35152 = C16895.m39756();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Executor f35146 = C16926.m39770();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C11778 m28815() {
        if (f35142 == null) {
            f35142 = new C11778();
        }
        return f35142;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28818(Context context) {
        C9145.m23520("AttaReporter", "init");
        this.f35143 = "101492915";
        this.f35147 = C7733.m20713(context);
        this.f35151 = C18338.m42744(context, C22927.m51027());
        this.f35150 = C22927.m51027();
        this.f35148 = C7733.m20719(context) ? "1" : "0";
        this.f35153 = C18338.m42742(context);
        while (true) {
            List list = this.f35152;
            if (list.isEmpty()) {
                break;
            }
            C23066 c23066 = (C23066) list.remove(0);
            HashMap map = c23066.f74196;
            map.put(c.d, this.f35143);
            map.put("app_name", this.f35147);
            map.put("app_ver", this.f35151);
            map.put("pkg_name", this.f35150);
            map.put("qq_install", this.f35148);
            map.put("qq_ver", this.f35153);
            map.put("openid", this.f35149);
            map.put("time_appid_openid", ((String) map.get("time")) + "_" + this.f35143 + "_" + this.f35149);
            StringBuilder sb = new StringBuilder("fixDirtyData--------------------------");
            sb.append(c23066);
            C9145.m23520("AttaReporter", sb.toString());
            this.f35144.add(c23066);
        }
        Context contextM51019 = C22927.m51019();
        if (contextM51019 == null) {
            return;
        }
        contextM51019.deleteDatabase("sdk_report.db");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28819(String str) {
        C9145.m23520("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f35149 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28820(String str, String str2, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("attaid", "09400051119");
        map.put("token", "9389887874");
        map.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f35143 + "_" + this.f35149);
        map.put("time", String.valueOf(jCurrentTimeMillis));
        map.put("openid", this.f35149);
        map.put(c.d, this.f35143);
        map.put("app_name", this.f35147);
        map.put("app_ver", this.f35151);
        map.put("pkg_name", this.f35150);
        map.put(am.x, "AND");
        map.put("os_ver", Build.VERSION.RELEASE);
        map.put("sdk_ver", "3.5.18.lite");
        map.put("mn", C10556.m26534().m26539());
        map.put("interface_name", str);
        map.put("interface_data", str2);
        map.put("interface_result", obj == null ? "" : obj.toString());
        map.put("qq_install", this.f35148);
        map.put("qq_ver", this.f35153);
        C23066 c23066 = new C23066(map);
        if (TextUtils.isEmpty(this.f35143) || TextUtils.isEmpty(this.f35147) || C22927.m51019() == null) {
            C9145.m23520("AttaReporter", "attaReport cancel appid=" + this.f35143 + ", mAppName=" + this.f35147 + ", context=" + C22927.m51019() + ", " + c23066);
            this.f35152.add(c23066);
            return;
        }
        this.f35146.execute(new RunnableC6133(this, c23066));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m28817(C11778 c11778) {
        List list = c11778.f35144;
        C9145.m23520("AttaReporter", "attaReportAtSubThread");
        if (!c11778.f35145) {
            List listM39756 = C16895.m39756();
            c11778.f35145 = listM39756.isEmpty();
            list.addAll(listM39756);
            Iterator it = listM39756.iterator();
            while (it.hasNext()) {
                C9145.m23520("AttaReporter", "attaReportAtSubThread from db = " + ((Serializable) it.next()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = 1;
            int i2 = 0;
            if (list.isEmpty()) {
                break;
            }
            C23066 c23066 = (C23066) list.remove(0);
            while (true) {
                i2 += i;
                try {
                    C9145.m23520("AttaReporter", "doAttaReportItem post " + c23066);
                    if (C20245.m46489().m46494(c23066.f74196, "https://h.trace.qq.com/kv").d() != 200) {
                        arrayList.add(c23066);
                        break;
                    }
                    break;
                } catch (Exception e) {
                    C9145.m23517("AttaReporter", "Exception", e);
                    if (i2 >= 2) {
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (c11778.f35145) {
                return;
            }
            C9145.m23520("AttaReporter", "attaReportAtSubThread clear db");
            c11778.f35145 = true;
            return;
        }
        C9145.m23520("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C9145.m23520("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((C23066) ((Serializable) it2.next())));
        }
        c11778.f35145 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28816() {
        return m28815().f35143;
    }
}
