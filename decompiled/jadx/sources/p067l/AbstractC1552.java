package p067l;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۚ */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1552 {

    /* JADX INFO: renamed from: ֫ */
    public C1531 f46225;

    /* JADX INFO: renamed from: ۧ */
    public C1475 f46226;

    /* JADX INFO: renamed from: ܽ */
    public String f46228;

    /* JADX INFO: renamed from: ܳ */
    public int f46227 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f46230 = 0;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f46229 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7704(float f, View view);

    public final String toString() {
        String string = this.f46228;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (C1692 c1692 : this.f46229) {
            StringBuilder sbM21133 = C9179.m21133(string, "[");
            sbM21133.append(c1692.f55665);
            sbM21133.append(" , ");
            sbM21133.append(decimalFormat.format(c1692.f55666));
            sbM21133.append("] ");
            string = sbM21133.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36269(String str) {
        this.f46228 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m36265(float f) {
        C1475 c1475 = this.f46226;
        AbstractC1860 abstractC1860 = c1475.f41365;
        if (abstractC1860 != null) {
            abstractC1860.mo9248(f, c1475.f41372);
        } else {
            double[] dArr = c1475.f41372;
            dArr[0] = c1475.f41367[0];
            dArr[1] = c1475.f41366[0];
        }
        return (float) ((c1475.f41369.m12930(f) * c1475.f41372[1]) + c1475.f41372[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m36270(float f) {
        C1475 c1475 = this.f46226;
        C1020 c1020 = c1475.f41369;
        AbstractC1860 abstractC1860 = c1475.f41365;
        if (abstractC1860 != null) {
            double d = f;
            abstractC1860.mo9252(d, c1475.f41368);
            c1475.f41365.mo9248(d, c1475.f41372);
        } else {
            double[] dArr = c1475.f41368;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d2 = f;
        double dM12930 = c1020.m12930(d2);
        double dM12929 = c1020.m12929(d2);
        double[] dArr2 = c1475.f41368;
        return (float) ((dM12929 * c1475.f41372[1]) + (dM12930 * dArr2[1]) + dArr2[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36268(int i, int i2, int i3, float f, float f2, float f3, C1531 c1531) {
        this.f46229.add(new C1692(i, f, f2, f3));
        if (i3 != -1) {
            this.f46230 = i3;
        }
        this.f46227 = i2;
        this.f46225 = c1531;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36267(int i, int i2, int i3, float f, float f2, float f3) {
        this.f46229.add(new C1692(i, f, f2, f3));
        if (i3 != -1) {
            this.f46230 = i3;
        }
        this.f46227 = i2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ֫ */
    public final void m36266() {
        int i;
        ArrayList<C1692> arrayList = this.f46229;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C1825());
        double[] dArr = new double[size];
        char c = 1;
        char c2 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 2);
        int i2 = this.f46227;
        C1475 c1475 = new C1475();
        C1020 c1020 = new C1020();
        c1475.f41369 = c1020;
        new HashMap();
        c1020.m12927(i2);
        c1475.f41366 = new float[size];
        c1475.f41370 = new double[size];
        c1475.f41371 = new float[size];
        c1475.f41367 = new float[size];
        float[] fArr = new float[size];
        this.f46226 = c1475;
        int i3 = 0;
        for (C1692 c1692 : arrayList) {
            float f = c1692.f55664;
            dArr[i3] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i3];
            float f2 = c1692.f55666;
            dArr3[c2] = f2;
            float f3 = c1692.f55663;
            dArr3[c] = f3;
            C1475 c1476 = this.f46226;
            c1476.f41370[i3] = ((double) c1692.f55665) / 100.0d;
            c1476.f41371[i3] = f;
            c1476.f41367[i3] = f3;
            c1476.f41366[i3] = f2;
            i3++;
            c = 1;
            c2 = 0;
        }
        C1475 c1477 = this.f46226;
        float[] fArr2 = c1477.f41371;
        C1020 c1021 = c1477.f41369;
        double[] dArr4 = c1477.f41370;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, dArr4.length, 2);
        float[] fArr3 = c1477.f41366;
        c1477.f41372 = new double[fArr3.length + 1];
        c1477.f41368 = new double[fArr3.length + 1];
        if (dArr4[0] > 0.0d) {
            c1021.m12926(0.0d, fArr2[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            c1021.m12926(1.0d, fArr2[length]);
        }
        for (int i4 = 0; i4 < dArr5.length; i4++) {
            dArr5[i4][0] = c1477.f41367[i4];
            for (int i5 = 0; i5 < fArr3.length; i5++) {
                dArr5[i5][1] = fArr3[i5];
            }
            c1021.m12926(dArr4[i4], fArr2[i4]);
        }
        c1021.m12925();
        if (dArr4.length > 1) {
            i = 0;
            c1477.f41365 = AbstractC1860.m49310(0, dArr4, dArr5);
        } else {
            i = 0;
            c1477.f41365 = null;
        }
        AbstractC1860.m49310(i, dArr, dArr2);
    }
}
