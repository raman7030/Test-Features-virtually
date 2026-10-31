package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13704 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32955(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32952(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32953(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32954(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }
}
