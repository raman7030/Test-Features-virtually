package l;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: l.ۛۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5844 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16367(Context context, C10659 c10659) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            C10078 c10078 = new C10078(c10659);
            telephonyManager.registerTelephonyCallback(c10659.f32063, c10078);
            telephonyManager.unregisterTelephonyCallback(c10078);
        } catch (RuntimeException unused) {
            c10659.m26750(5);
        }
    }
}
