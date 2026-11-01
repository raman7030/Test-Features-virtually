package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.apmobilesecuritysdk.p004a.C0041a;
import com.alipay.apmobilesecuritysdk.p005b.C0043a;
import com.alipay.apmobilesecuritysdk.p008e.C0053a;
import com.alipay.apmobilesecuritysdk.p008e.C0056d;
import com.alipay.apmobilesecuritysdk.p008e.C0059g;
import com.alipay.apmobilesecuritysdk.p008e.C0060h;
import com.alipay.apmobilesecuritysdk.p008e.C0061i;
import com.alipay.apmobilesecuritysdk.p009f.C0063b;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p022f0.InterfaceC0118f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class APSecuritySdk implements InterfaceC0118f {

    /* JADX INFO: renamed from: a */
    public static APSecuritySdk f195a;
    public static APSecBgCheckerInterface bgChecker;

    /* JADX INFO: renamed from: c */
    public static IDeviceInfo f196c;

    /* JADX INFO: renamed from: d */
    public static Object f197d = new Object();

    /* JADX INFO: renamed from: b */
    public Context f198b;

    /* JADX INFO: compiled from: N673 */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* JADX INFO: compiled from: N673 */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f198b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f196c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f195a == null) {
            synchronized (f197d) {
                if (f195a == null) {
                    f195a = new APSecuritySdk(context);
                }
            }
        }
        return f195a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f196c = iDeviceInfo;
    }

    @Override // com.alipay.sdk.p010m.p022f0.InterfaceC0118f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f196c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String strM269a = C0041a.m269a(this.f198b, "");
        if (C0106a.m564a(strM269a)) {
            initToken(0, new HashMap(), null);
        }
        return strM269a;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202507280853";
    }

    @Override // com.alipay.sdk.p010m.p022f0.InterfaceC0118f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f196c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = C0041a.m269a(this.f198b, "");
            tokenResult.clientKey = C0060h.m355f(this.f198b);
            tokenResult.apdid = C0041a.m275b(this.f198b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f198b);
            if (C0106a.m564a(tokenResult.apdid) || C0106a.m564a(tokenResult.apdidToken) || C0106a.m564a(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map map, final InitResultListener initResultListener) {
        C0043a.m284a().m286a(i);
        String strM347b = C0060h.m347b(this.f198b);
        String strM288c = C0043a.m284a().m288c();
        if (C0106a.m567b(strM347b) && !C0106a.m565a(strM347b, strM288c)) {
            C0053a.m315b(this.f198b);
            C0056d.m320a(this.f198b);
            C0059g.m339a(this.f198b);
            C0061i.m377h();
        }
        if (!C0106a.m565a(strM347b, strM288c)) {
            C0060h.m349c(this.f198b, strM288c);
        }
        String strM563a = C0106a.m563a(map, "utdid", "");
        String strM563a2 = C0106a.m563a(map, "tid", "");
        String strM563a3 = C0106a.m563a(map, "userId", "");
        if (C0106a.m564a(strM563a)) {
            strM563a = UtdidWrapper.getUtdid(this.f198b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strM563a);
        map2.put("tid", strM563a2);
        map2.put("userId", strM563a3);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        C0063b.m382a().m385a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ APSecuritySdk f201c;

            {
                this.f201c = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                new C0041a(this.f201c.f198b).m281a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(this.f201c.getTokenResult());
                }
            }
        });
    }

    @Override // com.alipay.sdk.p010m.p022f0.InterfaceC0118f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
