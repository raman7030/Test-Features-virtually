package com.alipay.sdk.p010m.p044q0;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0194d {
    /* JADX INFO: renamed from: a */
    public static String m939a() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bArrM938a = C0193c.m938a(iCurrentTimeMillis);
        byte[] bArrM938a2 = C0193c.m938a(iNanoTime);
        byte[] bArrM938a3 = C0193c.m938a(iNextInt);
        byte[] bArrM938a4 = C0193c.m938a(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrM938a, 0, bArr, 0, 4);
        System.arraycopy(bArrM938a2, 0, bArr, 4, 4);
        System.arraycopy(bArrM938a3, 0, bArr, 8, 4);
        System.arraycopy(bArrM938a4, 0, bArr, 12, 4);
        return C0192b.m935c(bArr, 2);
    }

    /* JADX INFO: renamed from: b */
    public static String m941b() {
        String strM949a = C0197g.m949a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(strM949a)) {
            strM949a = C0197g.m949a("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(strM949a) ? m943c() : strM949a;
    }

    /* JADX INFO: renamed from: b */
    public static String m942b(Context context) {
        return "";
    }

    /* JADX INFO: renamed from: c */
    public static String m943c() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", null).invoke(null, null);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m940a(Context context) {
        String strM941b = C0196f.m948b(null) ? m941b() : null;
        return C0196f.m948b(strM941b) ? m939a() : strM941b;
    }
}
