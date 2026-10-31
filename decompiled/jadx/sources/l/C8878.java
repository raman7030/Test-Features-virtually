package l;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8878 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Paint f27021;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] f27022;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Typeface f27023;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float[] f27024;

    public C8878(Typeface typeface) {
        float[] fArr = new float[C2528.f8015];
        this.f27024 = fArr;
        this.f27022 = new char[40];
        this.f27023 = typeface;
        Paint paint = new Paint(1);
        this.f27021 = paint;
        paint.setTypeface(typeface);
        paint.setTextSize(15.0f);
        Arrays.fill(fArr, Float.NaN);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22930(C8878 c8878, char c, char c2) {
        char[] cArr = c8878.f27022;
        int iM8036 = C2528.m8036(c);
        int iM8037 = C2528.m8036(c2);
        float fM22928 = c8878.m22928(iM8036);
        float fM22929 = c8878.m22928(iM8037);
        for (int i = 0; i < 40; i += 2) {
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return Math.abs(((fM22928 + fM22929) * 20.0f) - c8878.f27021.measureText(cArr, 0, 40)) < 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m22928(int i) {
        float[] fArr = this.f27024;
        float f = fArr[i];
        if (!Float.isNaN(f)) {
            return f;
        }
        char c = C2528.f8018[i];
        char[] cArr = this.f27022;
        cArr[0] = c;
        float fMeasureText = this.f27021.measureText(cArr, 0, 1);
        fArr[i] = fMeasureText;
        return fMeasureText;
    }
}
