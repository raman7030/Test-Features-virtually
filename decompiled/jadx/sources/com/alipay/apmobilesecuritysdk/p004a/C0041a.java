package com.alipay.apmobilesecuritysdk.p004a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.common.C0047a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.p005b.C0043a;
import com.alipay.apmobilesecuritysdk.p006c.C0044a;
import com.alipay.apmobilesecuritysdk.p006c.C0046c;
import com.alipay.apmobilesecuritysdk.p007d.C0052e;
import com.alipay.apmobilesecuritysdk.p008e.C0053a;
import com.alipay.apmobilesecuritysdk.p008e.C0054b;
import com.alipay.apmobilesecuritysdk.p008e.C0055c;
import com.alipay.apmobilesecuritysdk.p008e.C0056d;
import com.alipay.apmobilesecuritysdk.p008e.C0059g;
import com.alipay.apmobilesecuritysdk.p008e.C0060h;
import com.alipay.apmobilesecuritysdk.p008e.C0061i;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p022f0.C0114b;
import com.alipay.sdk.p010m.p028i0.C0148d;
import com.alipay.sdk.p010m.p032k0.C0159c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.a.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0041a {

    /* JADX INFO: renamed from: a */
    public Context f164a;

    /* JADX INFO: renamed from: b */
    public C0043a f165b = C0043a.m284a();

    /* JADX INFO: renamed from: c */
    public int f166c = 4;

    public C0041a(Context context) {
        this.f164a = context;
    }

    /* JADX INFO: renamed from: a */
    public static String m268a(Context context) {
        try {
            String strM366b = C0061i.m366b();
            if (!C0106a.m564a(strM366b)) {
                return strM366b;
            }
            C0055c c0055cM323c = C0056d.m323c(context);
            if (c0055cM323c != null) {
                C0061i.m363a(c0055cM323c);
                String str = c0055cM323c.f174a;
                if (C0106a.m567b(str)) {
                    return str;
                }
            }
            C0054b c0054bM316c = C0053a.m316c(context);
            if (c0054bM316c == null) {
                return "";
            }
            C0061i.m362a(c0054bM316c);
            String str2 = c0054bM316c.f171a;
            return C0106a.m567b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m269a(Context context, String str) {
        try {
            m276b();
            String strM360a = C0061i.m360a(str);
            if (!C0106a.m564a(strM360a)) {
                return strM360a;
            }
            String strM338a = C0059g.m338a(context, str);
            C0061i.m364a(str, strM338a);
            return !C0106a.m564a(strM338a) ? strM338a : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private void m270a(String str, C0159c c0159c, Map map) {
        C0060h.m346a(this.f164a, c0159c.m723b());
        C0060h.m352d(this.f164a, c0159c.m722a());
        C0060h.m354e(this.f164a, c0159c.f529g);
        C0060h.m343a(this.f164a, c0159c.f530h);
        C0060h.m356f(this.f164a, c0159c.f531i);
        C0060h.m357g(this.f164a, c0159c.f533k);
        C0061i.m369c(C0052e.m310b(this.f164a, map));
        C0061i.m364a(str, c0159c.f526d);
        C0061i.m367b(c0159c.f525c);
        C0061i.m371d(c0159c.f532j);
        C0061i.m373e(m280e(map));
        C0061i.m375f(m279d(map));
        C0061i.m361a();
        C0056d.m321a(this.f164a, C0061i.m376g());
        C0056d.m322b(this.f164a);
        C0053a.m314a(this.f164a, new C0054b(C0061i.m366b(), C0061i.m368c(), C0061i.m374f()));
        C0053a.m313a(this.f164a);
        C0059g.m340a(this.f164a, str, C0061i.m360a(str));
        C0059g.m341b(this.f164a, str);
        C0060h.m344a(this.f164a, str, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    private boolean m271a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] strArrSplit = strArr[i].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m272a(String str) {
        return C0106a.m564a(m269a(this.f164a, str)) || C0106a.m564a(m268a(this.f164a));
    }

    /* JADX INFO: renamed from: a */
    private boolean m273a(Map map, String str) {
        if (m271a() || C0047a.m300a(this.f164a)) {
            return m272a(str);
        }
        C0052e.m309a();
        if (!C0106a.m565a(C0052e.m310b(this.f164a, map), C0061i.m368c())) {
            return true;
        }
        String strM563a = C0106a.m563a(map, "tid", "");
        String strM563a2 = C0106a.m563a(map, "utdid", "");
        if (!C0106a.m567b(strM563a) || C0106a.m565a(strM563a, C0061i.m370d())) {
            return (C0106a.m567b(strM563a2) && !C0106a.m565a(strM563a2, C0061i.m372e())) || !C0061i.m365a(this.f164a, str) || C0106a.m564a(m269a(this.f164a, str)) || C0106a.m564a(m268a(this.f164a));
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private int m274b(Map map) {
        String str;
        String strM563a = C0106a.m563a(map, "appName", "");
        m276b();
        m277b(strM563a);
        boolean zM273a = m273a(map, strM563a);
        Context context = this.f164a;
        C0060h.m348b(context, String.valueOf(C0114b.m597a(APSecuritySdk.getInstance(context)).m625m()));
        if (!zM273a) {
            return 0;
        }
        C0046c.m297a(this.f164a).m299b();
        UmidSdkWrapper.startUmidTaskSync(this.f164a, C0043a.m284a().m287b());
        C0159c c0159cM278c = m278c(map);
        int iM724c = c0159cM278c != null ? c0159cM278c.m724c() : 2;
        if (iM724c == 1) {
            m270a(strM563a, c0159cM278c, map);
            return 0;
        }
        if (iM724c == 3) {
            return 1;
        }
        if (c0159cM278c != null) {
            str = "Server error, result:" + c0159cM278c.f519b;
        } else {
            str = "Server error, returned null";
        }
        C0044a.m292a(str);
        return C0106a.m564a(m269a(this.f164a, strM563a)) ? 4 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m275b(Context context) {
        String strM268a = m268a(context);
        return C0106a.m564a(strM268a) ? C0060h.m355f(context) : strM268a;
    }

    /* JADX INFO: renamed from: b */
    public static void m276b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m277b(String str) {
        m268a(this.f164a);
        m269a(this.f164a, str);
        C0061i.m361a();
    }

    /* JADX INFO: renamed from: c */
    private C0159c m278c(Map map) {
        try {
            return C0148d.m715b(this.f164a, this.f165b.m288c()).mo745a(C0042b.m282a(this.f164a, map));
        } catch (Throwable th) {
            C0044a.m293a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private String m279d(Map map) {
        String strM563a = C0106a.m563a(map, "utdid", "");
        if (!C0106a.m567b(strM563a) || C0106a.m565a(strM563a, C0061i.m372e())) {
            return C0061i.m372e();
        }
        C0061i.m375f(strM563a);
        return strM563a;
    }

    /* JADX INFO: renamed from: e */
    private String m280e(Map map) {
        String strM563a = C0106a.m563a(map, "tid", "");
        if (!C0106a.m567b(strM563a) || C0106a.m565a(strM563a, C0061i.m370d())) {
            return C0061i.m370d();
        }
        C0061i.m373e(strM563a);
        return strM563a;
    }

    /* JADX INFO: renamed from: a */
    public int m281a(Map map) {
        try {
            C0044a.m291a(this.f164a, C0106a.m563a(map, "tid", ""), C0106a.m563a(map, "utdid", ""), m275b(this.f164a));
            this.f166c = m274b(map);
            C0044a.m290a(this.f164a, C0148d.m715b(this.f164a, this.f165b.m288c()));
        } catch (Exception e) {
            C0044a.m293a(e);
        }
        return this.f166c;
    }
}
