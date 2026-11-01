package p067l;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵֨ */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1791 {

    /* JADX INFO: renamed from: ֫ */
    public int f63499;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC1860 f63500;

    /* JADX INFO: renamed from: ܽ */
    public int[] f63501 = new int[10];

    /* JADX INFO: renamed from: ܿ */
    public float[] f63502 = new float[10];

    /* JADX INFO: renamed from: ᩳ */
    public String f63503;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7386(float f, View view);

    public final String toString() {
        String string = this.f63503;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f63499; i++) {
            StringBuilder sbM21133 = C9179.m21133(string, "[");
            sbM21133.append(this.f63501[i]);
            sbM21133.append(" , ");
            sbM21133.append(decimalFormat.format(this.f63502[i]));
            sbM21133.append("] ");
            string = sbM21133.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46441(String str) {
        this.f63503 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m46440(float f) {
        return (float) this.f63500.mo9247(f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m46442(float f) {
        return (float) this.f63500.mo9251(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28784(float f, int i) {
        int[] iArr = this.f63501;
        if (iArr.length < this.f63499 + 1) {
            this.f63501 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f63502;
            this.f63502 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f63501;
        int i2 = this.f63499;
        iArr2[i2] = i;
        this.f63502[i2] = f;
        this.f63499 = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX INFO: renamed from: ֫ */
    public void mo28785(int i) {
        int i2 = this.f63499;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f63501;
        float[] fArr = this.f63502;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        int i15 = 1;
        for (int i16 = 1; i16 < this.f63499; i16++) {
            int[] iArr3 = this.f63501;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f63499; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f63501;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f63501[i18]) * 0.01d;
                    dArr2[i17][0] = this.f63502[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f63501[i18]) * 0.01d;
                dArr2[i17][0] = this.f63502[i18];
                i17++;
            }
        }
        this.f63500 = AbstractC1860.m49310(i, dArr, dArr2);
    }
}
