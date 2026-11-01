package p067l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۧ֨ */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C1371 extends AbstractC1791 {

    /* JADX INFO: renamed from: ܳ */
    public SparseArray f35027;

    /* JADX INFO: renamed from: ᩻ */
    public float[] f35028;

    public C1371() {
        throw null;
    }

    @Override // p067l.AbstractC1791
    /* JADX INFO: renamed from: ֫ */
    public final void mo28785(int i) {
        SparseArray sparseArray = this.f35027;
        int size = sparseArray.size();
        int iM35416 = ((C1531) sparseArray.valueAt(0)).m35416();
        double[] dArr = new double[size];
        this.f35028 = new float[iM35416];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM35416);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C1531 c1531 = (C1531) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            c1531.m35414(this.f35028);
            int i3 = 0;
            while (true) {
                float[] fArr = this.f35028;
                if (i3 < fArr.length) {
                    dArr2[i2][i3] = fArr[i3];
                    i3++;
                }
            }
        }
        this.f63500 = AbstractC1860.m49310(i, dArr, dArr2);
    }

    @Override // p067l.AbstractC1791
    /* JADX INFO: renamed from: ֫ */
    public final void mo28784(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // p067l.AbstractC1791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7386(float f, View view) {
        this.f63500.mo9249(f, this.f35028);
        ((C1531) this.f35027.valueAt(0)).m35412(view, this.f35028);
    }
}
