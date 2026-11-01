package com.alipay.sdk.p010m.p012a0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.p010m.p015c.C0090c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p048s0.C0203a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0240c;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.alipay.sdk.m.a0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0084b {

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements C0083a.a {
        @Override // com.alipay.sdk.p010m.p012a0.C0083a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo448a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$b */
    /* JADX INFO: compiled from: N673 */
    public class b implements Callable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f296a;

        public b(Context context) {
            this.f296a = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return C0090c.m480a(this.f296a);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$c */
    /* JADX INFO: compiled from: N673 */
    public class c implements C0083a.a {
        @Override // com.alipay.sdk.p010m.p012a0.C0083a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo448a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$d */
    /* JADX INFO: compiled from: N673 */
    public class d implements Callable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f297a;

        public d(Context context) {
            this.f297a = context;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f297a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$e */
    /* JADX INFO: compiled from: N673 */
    public class e implements C0083a.a {
        @Override // com.alipay.sdk.p010m.p012a0.C0083a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo448a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$f */
    /* JADX INFO: compiled from: N673 */
    public class f implements Callable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f298a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0233a f299b;

        public f(Context context, C0233a c0233a) {
            this.f298a = context;
            this.f299b = c0233a;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return C0203a.m983c(this.f298a);
            } catch (Throwable th) {
                C0167a.m755b(this.f299b, C0168b.f624o, C0168b.f636u, th.getClass().getName());
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$g */
    /* JADX INFO: compiled from: N673 */
    public class g implements C0083a.a {
        @Override // com.alipay.sdk.p010m.p012a0.C0083a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo448a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$h */
    /* JADX INFO: compiled from: N673 */
    public class h implements Callable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f301b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f302c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0233a f303d;

        /* JADX INFO: renamed from: com.alipay.sdk.m.a0.b$h$a */
        /* JADX INFO: compiled from: N673 */
        public class a implements APSecuritySdk.InitResultListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String[] f304a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ConditionVariable f305b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f304a = strArr;
                this.f305b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f304a[0] = tokenResult.apdidToken;
                }
                this.f305b.open();
            }
        }

        public h(String str, String str2, Context context, C0233a c0233a) {
            this.f300a = str;
            this.f301b = str2;
            this.f302c = context;
            this.f303d = c0233a;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap map = new HashMap();
            map.put("tid", this.f300a);
            map.put("utdid", this.f301b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f302c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, map, new a(strArr, conditionVariable));
                conditionVariable.block(C0240c.f1145a);
            } catch (Throwable th) {
                C0244g.m1199a(th);
                C0167a.m755b(this.f303d, C0168b.f624o, C0168b.f630r, th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                C0167a.m755b(this.f303d, C0168b.f624o, C0168b.f632s, "missing token");
            }
            return strArr[0];
        }
    }

    /* JADX INFO: renamed from: a */
    public static NetworkInfo m449a(C0233a c0233a, Context context) {
        Context contextM443a = C0083a.m443a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) C0083a.m445a(2, 10L, timeUnit, new c(), new d(contextM443a), false, 10L, timeUnit, c0233a, false);
    }

    /* JADX INFO: renamed from: b */
    public static String m451b(C0233a c0233a, Context context) {
        if (!C0180b.m829i().m875z()) {
            return "";
        }
        return (String) C0083a.m445a(1, 1L, TimeUnit.DAYS, new a(), new b(C0083a.m443a(context)), true, 200L, TimeUnit.MILLISECONDS, c0233a, true);
    }

    /* JADX INFO: renamed from: c */
    public static String m452c(C0233a c0233a, Context context) {
        return (String) C0083a.m445a(3, 1L, TimeUnit.DAYS, new e(), new f(C0083a.m443a(context), c0233a), true, 3L, TimeUnit.SECONDS, c0233a, false);
    }

    /* JADX INFO: renamed from: a */
    public static String m450a(C0233a c0233a, Context context, String str, String str2) {
        Context contextM443a = C0083a.m443a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) C0083a.m445a(4, 10L, timeUnit, new g(), new h(str, str2, contextM443a, c0233a), true, 3L, timeUnit, c0233a, true);
    }
}
