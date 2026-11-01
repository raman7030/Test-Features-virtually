package p067l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.ܺ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17809 implements TypeEvaluator {

    /* JADX INFO: renamed from: ֫ */
    public static final C17809 f53165 = new C17809();

    /* JADX INFO: renamed from: ֫ */
    public static C17809 m40425() {
        return f53165;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM49018 = C21740.m49018(f3, f2, f, f2);
        float fM49019 = C21740.m49018(fPow4, fPow, f, fPow);
        float fM490110 = C21740.m49018(fPow5, fPow2, f, fPow2);
        float fM490111 = C21740.m49018(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM49019, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM490110, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM490111, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM49018 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
