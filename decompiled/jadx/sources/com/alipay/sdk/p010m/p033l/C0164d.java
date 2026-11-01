package com.alipay.sdk.p010m.p033l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.l.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0164d {

    /* JADX INFO: renamed from: a */
    public static final int f561a = 1010;

    /* JADX INFO: renamed from: b */
    public static a f562b;

    /* JADX INFO: renamed from: com.alipay.sdk.m.l.d$a */
    /* JADX INFO: compiled from: N673 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo532a(boolean z, JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m744a(C0233a c0233a, Context context) {
        return C0254q.m1268a(c0233a, context, Collections.singletonList(new C0180b.b("com.taobao.taobao", 0, "")), false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m743a(C0233a c0233a, Activity activity, int i, String str, String str2, a aVar) {
        try {
            C0167a.m749a(c0233a, C0168b.f618l, C0168b.f637u0);
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i);
            f562b = aVar;
            return true;
        } catch (Throwable th) {
            aVar.mo532a(false, null, "UNKNOWN_ERROR");
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f645y0, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m742a(C0233a c0233a, int i, int i2, Intent intent) {
        if (i != 1010 || intent == null) {
            return false;
        }
        a aVar = f562b;
        if (aVar == null) {
            return true;
        }
        f562b = null;
        if (i2 == -1) {
            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f643x0, intent.toUri(1));
            aVar.mo532a(true, C0254q.m1264a(intent), "OK");
        } else if (i2 != 0) {
            C0167a.m755b(c0233a, C0168b.f618l, C0168b.f641w0, "" + i2);
        } else {
            C0167a.m750a(c0233a, C0168b.f618l, C0168b.f639v0, intent.toUri(1));
            aVar.mo532a(false, null, "CANCELED");
        }
        return true;
    }
}
