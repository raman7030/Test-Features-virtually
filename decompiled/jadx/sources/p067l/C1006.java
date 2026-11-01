package p067l;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۗܶ */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1006 {

    /* JADX INFO: renamed from: ֫ */
    public float[] f13162 = new float[20];

    /* JADX INFO: renamed from: ܽ */
    public ColorMatrix f13165 = new ColorMatrix();

    /* JADX INFO: renamed from: ܳ */
    public ColorMatrix f13164 = new ColorMatrix();

    /* JADX INFO: renamed from: ۧ */
    public float f13163 = 1.0f;

    /* JADX INFO: renamed from: ܿ */
    public float f13166 = 1.0f;

    /* JADX INFO: renamed from: ᩳ */
    public float f13167 = 1.0f;

    /* JADX INFO: renamed from: ᩻ */
    public float f13168 = 1.0f;

    /* JADX INFO: renamed from: ֫ */
    public final void m12138(ImageView imageView) {
        boolean z;
        float[] fArr;
        ColorMatrix colorMatrix;
        char c;
        char c2;
        float f;
        char c3;
        char c4;
        char c5;
        char c6;
        float f2;
        float fLog;
        float fPow;
        float f3;
        float fLog2;
        ColorMatrix colorMatrix2 = this.f13165;
        colorMatrix2.reset();
        float f4 = this.f13166;
        float[] fArr2 = this.f13162;
        boolean z2 = true;
        if (f4 != 1.0f) {
            float f5 = 1.0f - f4;
            float f6 = 0.2999f * f5;
            float f7 = 0.587f * f5;
            float f8 = f5 * 0.114f;
            fArr2[0] = f6 + f4;
            fArr2[1] = f7;
            fArr2[2] = f8;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = f6;
            fArr2[6] = f7 + f4;
            fArr2[7] = f8;
            fArr2[8] = 0.0f;
            fArr2[9] = 0.0f;
            fArr2[10] = f6;
            fArr2[11] = f7;
            fArr2[12] = f8 + f4;
            fArr2[13] = 0.0f;
            fArr2[14] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            colorMatrix2.set(fArr2);
            z = true;
        } else {
            z = false;
        }
        float f9 = this.f13167;
        ColorMatrix colorMatrix3 = this.f13164;
        if (f9 != 1.0f) {
            colorMatrix3.setScale(f9, f9, f9, 1.0f);
            colorMatrix2.postConcat(colorMatrix3);
            z = true;
        }
        float f10 = this.f13168;
        if (f10 != 1.0f) {
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            if (f11 > 66.0f) {
                f2 = 161.11957f;
                c3 = 14;
                c4 = '\r';
                double d = f11 - 60.0f;
                c = '\f';
                c5 = 11;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                c6 = '\t';
            } else {
                c = '\f';
                c3 = 14;
                f2 = 161.11957f;
                c4 = '\r';
                c5 = 11;
                c6 = '\t';
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 >= 66.0f) {
                c2 = '\n';
                f3 = 138.51773f;
                fLog2 = 255.0f;
            } else if (f11 > 19.0f) {
                c2 = '\n';
                f3 = 138.51773f;
                fLog2 = (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                c2 = '\n';
                f3 = 138.51773f;
                fLog2 = 0.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - f2;
            float fLog4 = (((float) Math.log(40.0f)) * f3) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            fArr2[0] = fMin / fMin4;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            fArr2[4] = 0.0f;
            fArr2[5] = 0.0f;
            fArr2[6] = fMin2 / fMin5;
            fArr2[7] = 0.0f;
            fArr2[8] = 0.0f;
            fArr2[c6] = 0.0f;
            fArr2[c2] = 0.0f;
            fArr2[c5] = 0.0f;
            fArr2[c] = fMin6;
            fArr2[c4] = 0.0f;
            fArr2[c3] = 0.0f;
            fArr2[15] = 0.0f;
            fArr2[16] = 0.0f;
            fArr2[17] = 0.0f;
            fArr2[18] = 1.0f;
            fArr2[19] = 0.0f;
            fArr = fArr2;
            colorMatrix = colorMatrix3;
            colorMatrix.set(fArr);
            colorMatrix2.postConcat(colorMatrix);
            z = true;
            f = 1.0f;
        } else {
            fArr = fArr2;
            colorMatrix = colorMatrix3;
            c = '\f';
            c2 = '\n';
            f = 1.0f;
            c3 = 14;
            c4 = '\r';
            c5 = 11;
            c6 = '\t';
        }
        float f12 = this.f13163;
        if (f12 != f) {
            fArr[0] = f12;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f12;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[c6] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c] = f12;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            colorMatrix2.postConcat(colorMatrix);
        } else {
            z2 = z;
        }
        if (z2) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        } else {
            imageView.clearColorFilter();
        }
    }
}
