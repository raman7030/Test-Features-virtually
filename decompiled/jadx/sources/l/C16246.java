package l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.ܺ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16246 implements TypeEvaluator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16246 f49996 = new C16246();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16246 m38211() {
        return f49996;
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
        float fM46695 = C20382.m46695(f3, f2, f, f2);
        float fM46696 = C20382.m46695(fPow4, fPow, f, fPow);
        float fM46697 = C20382.m46695(fPow5, fPow2, f, fPow2);
        float fM46698 = C20382.m46695(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM46696, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM46697, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM46698, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM46695 * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
