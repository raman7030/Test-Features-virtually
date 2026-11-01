package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p004a.C0041a;
import com.alipay.apmobilesecuritysdk.p009f.C0063b;
import com.alipay.sdk.p010m.p018d0.C0106a;
import java.util.HashMap;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a */
    public static TMNTokenClient f203a;

    /* JADX INFO: renamed from: b */
    public Context f204b;

    /* JADX INFO: compiled from: N673 */
    public interface InitResultListener {
        void onResult(String str, int i);
    }

    public TMNTokenClient(Context context) {
        this.f204b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f204b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f203a == null) {
            synchronized (TMNTokenClient.class) {
                if (f203a == null) {
                    f203a = new TMNTokenClient(context);
                }
            }
        }
        return f203a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (C0106a.m564a(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (C0106a.m564a(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f204b));
        map.put("tid", "");
        map.put("userId", "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        C0063b.m382a().m385a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ TMNTokenClient f208d;

            {
                this.f208d = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                int iM281a = new C0041a(this.f208d.f204b).m281a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iM281a != 0) {
                    initResultListener2.onResult("", iM281a);
                } else {
                    initResultListener.onResult(C0041a.m269a(this.f208d.f204b, str), 0);
                }
            }
        });
    }
}
