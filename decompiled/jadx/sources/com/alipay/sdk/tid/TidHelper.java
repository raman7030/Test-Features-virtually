package com.alipay.sdk.tid;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0181c;
import com.alipay.sdk.p010m.p049t.C0210b;
import com.alipay.sdk.p010m.p051u.C0219c;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0241d;
import com.alipay.sdk.p010m.p058y.C0244g;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class TidHelper {
    /* JADX INFO: renamed from: a */
    public static void m1307a(Context context) {
        if (context == null) {
            return;
        }
        C0234b.m1121c().m1124a(context);
    }

    /* JADX INFO: renamed from: b */
    public static Tid m1308b(Context context) {
        try {
            C0210b c0210bM1037a = new C0219c().m1037a(C0233a.m1094f(), context);
            if (c0210bM1037a != null) {
                JSONObject jSONObject = new JSONObject(c0210bM1037a.m1020a());
                C0237a c0237aM1142a = C0237a.m1142a(context);
                String strOptString = jSONObject.optString("tid");
                String string = jSONObject.getString(C0237a.f1130j);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(string)) {
                    c0237aM1142a.m1143a(strOptString, string);
                }
                return m1306a(context, c0237aM1142a);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void clearTID(Context context) {
        C0237a.m1142a(context).m1146b();
    }

    public static String getIMEI(Context context) {
        m1307a(context);
        return C0241d.m1180b(context).m1184b();
    }

    public static String getIMSI(Context context) {
        m1307a(context);
        return C0241d.m1180b(context).m1185c();
    }

    public static String getVirtualImei(Context context) {
        m1307a(context);
        C0181c.m880a();
        return C0181c.m887f();
    }

    public static String getVirtualImsi(Context context) {
        m1307a(context);
        C0181c.m880a();
        return C0181c.m888g();
    }

    public static Tid loadLocalTid(Context context) {
        C0237a c0237aM1142a = C0237a.m1142a(context);
        if (c0237aM1142a.m1155j()) {
            return null;
        }
        return new Tid(c0237aM1142a.m1151f(), c0237aM1142a.m1150e(), c0237aM1142a.m1152g().longValue());
    }

    public static Tid loadTID(Context context) {
        m1307a(context);
        Tid tidM1306a = m1306a(context, C0237a.m1142a(context));
        if (tidM1306a == null) {
            C0244g.m1201b(C0170a.f659B, "load_tid null");
        }
        return tidM1306a;
    }

    public static boolean resetTID(Context context) throws Exception {
        Tid tidM1308b;
        C0244g.m1201b(C0170a.f659B, "reset_tid");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new Exception("Must be called on worker thread");
        }
        m1307a(context);
        clearTID(context);
        try {
            tidM1308b = m1308b(context);
        } catch (Throwable unused) {
            tidM1308b = null;
        }
        return !Tid.isEmpty(tidM1308b);
    }

    /* JADX INFO: renamed from: a */
    public static Tid m1306a(Context context, C0237a c0237a) {
        if (c0237a == null || c0237a.m1156k()) {
            return null;
        }
        return new Tid(c0237a.m1151f(), c0237a.m1150e(), c0237a.m1152g().longValue());
    }

    public static synchronized String getTIDValue(Context context) {
        Tid tidLoadOrCreateTID;
        tidLoadOrCreateTID = loadOrCreateTID(context);
        return Tid.isEmpty(tidLoadOrCreateTID) ? "" : tidLoadOrCreateTID.getTid();
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        C0244g.m1201b(C0170a.f659B, "load_create_tid");
        m1307a(context);
        Tid tidLoadTID = loadTID(context);
        if (Tid.isEmpty(tidLoadTID)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            try {
                tidLoadTID = m1308b(context);
            } catch (Throwable unused) {
            }
        }
        return tidLoadTID;
    }
}
