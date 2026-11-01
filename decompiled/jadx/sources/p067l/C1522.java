package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܰۡ */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1522 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m35069(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m35066(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35067(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35068(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }
}
