package p067l;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10806 {

    /* JADX INFO: renamed from: ֫ */
    public final Paint f29945;

    /* JADX INFO: renamed from: ۧ */
    public final char[] f29946;

    /* JADX INFO: renamed from: ܽ */
    public final Typeface f29947;

    /* JADX INFO: renamed from: ᩳ */
    public final float[] f29948;

    public C10806(Typeface typeface) {
        float[] fArr = new float[C4771.f10806];
        this.f29948 = fArr;
        this.f29946 = new char[40];
        this.f29947 = typeface;
        Paint paint = new Paint(1);
        this.f29945 = paint;
        paint.setTypeface(typeface);
        paint.setTextSize(15.0f);
        Arrays.fill(fArr, Float.NaN);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24901(C10806 c10806, char c, char c2) {
        char[] cArr = c10806.f29946;
        int iM10066 = C4771.m10066(c);
        int iM10067 = C4771.m10066(c2);
        float fM24899 = c10806.m24899(iM10066);
        float fM248910 = c10806.m24899(iM10067);
        for (int i = 0; i < 40; i += 2) {
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return Math.abs(((fM24899 + fM248910) * 20.0f) - c10806.f29945.measureText(cArr, 0, 40)) < 1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    private float m24899(int i) {
        float[] fArr = this.f29948;
        float f = fArr[i];
        if (!Float.isNaN(f)) {
            return f;
        }
        char c = C4771.f10809[i];
        char[] cArr = this.f29946;
        cArr[0] = c;
        float fMeasureText = this.f29945.measureText(cArr, 0, 1);
        fArr[i] = fMeasureText;
        return fMeasureText;
    }
}
