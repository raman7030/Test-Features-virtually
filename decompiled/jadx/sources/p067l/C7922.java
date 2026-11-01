package p067l;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: l.ۛۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C7922 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18292(Context context, C12498 c12498) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C11946 c11946 = new C11946(c12498);
            telephonyManager.registerTelephonyCallback(c12498.f35034, c11946);
            telephonyManager.unregisterTelephonyCallback(c11946);
        } catch (RuntimeException unused) {
            c12498.m28789(5);
        }
    }
}
