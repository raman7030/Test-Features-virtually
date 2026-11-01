package p067l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛ֨ */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1126 {

    /* JADX INFO: renamed from: ֫ */
    public int f20473;

    /* JADX INFO: renamed from: ۜ */
    public String f20474;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC1860 f20477;

    /* JADX INFO: renamed from: ܽ */
    public long f20478;

    /* JADX INFO: renamed from: ۢ */
    public int f20475 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f20482 = new int[10];

    /* JADX INFO: renamed from: ᩷ */
    public float[][] f20481 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: ᩳ */
    public float[] f20480 = new float[3];

    /* JADX INFO: renamed from: ܿ */
    public boolean f20479 = false;

    /* JADX INFO: renamed from: ۧ */
    public float f20476 = Float.NaN;

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo3415(float f, long j, View view, C1580 c1580);

    public final String toString() {
        String string = this.f20474;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f20473; i++) {
            StringBuilder sbM21133 = C9179.m21133(string, "[");
            sbM21133.append(this.f20482[i]);
            sbM21133.append(" , ");
            sbM21133.append(decimalFormat.format(this.f20481[i]));
            sbM21133.append("] ");
            string = sbM21133.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18070(String str) {
        this.f20474 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m18069(float f, long j, View view, C1580 c1580) {
        float[] fArr = this.f20480;
        this.f20477.mo9249(f, fArr);
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.f20479 = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f20476)) {
            float fM37424 = c1580.m37424(view, this.f20474);
            this.f20476 = fM37424;
            if (Float.isNaN(fM37424)) {
                this.f20476 = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f20478) * 1.0E-9d) * ((double) f2)) + ((double) this.f20476)) % 1.0d);
        this.f20476 = f3;
        String str = this.f20474;
        HashMap map = c1580.f48466;
        if (!map.containsKey(view)) {
            HashMap map2 = new HashMap();
            map2.put(str, new float[]{f3});
            map.put(view, map2);
        } else {
            HashMap map3 = (HashMap) map.get(view);
            if (!map3.containsKey(str)) {
                map3.put(str, new float[]{f3});
                map.put(view, map3);
            } else {
                float[] fArrCopyOf = (float[]) map3.get(str);
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map3.put(str, fArrCopyOf);
            }
        }
        this.f20478 = j;
        float f4 = fArr[0];
        float fM18068 = (m18068(this.f20476) * f4) + fArr[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.f20479 = z;
        return fM18068;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m18068(float f) {
        float fAbs;
        switch (this.f20475) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16405(float f, float f2, float f3, int i, int i2) {
        int i3 = this.f20473;
        this.f20482[i3] = i;
        float[] fArr = this.f20481[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f20475 = Math.max(this.f20475, i2);
        this.f20473++;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16406(int i) {
        float[][] fArr;
        int i2 = this.f20473;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f20482;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.f20481;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f20473; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = ((double) iArr[i18]) * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f20477 = AbstractC1860.m49310(i, dArr, dArr2);
    }
}
