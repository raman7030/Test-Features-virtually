package p067l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۚ֨ */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1091 extends AbstractC1126 {

    /* JADX INFO: renamed from: ۖ */
    public SparseArray f18616;

    /* JADX INFO: renamed from: ۘ */
    public float[] f18617;

    /* JADX INFO: renamed from: ۡ */
    public String f18618;

    /* JADX INFO: renamed from: ܺ */
    public float[] f18619;

    /* JADX INFO: renamed from: ᩴ */
    public SparseArray f18620;

    public C1091() {
        throw null;
    }

    @Override // p067l.AbstractC1126
    /* JADX INFO: renamed from: ֫ */
    public final void mo16406(int i) {
        SparseArray sparseArray = this.f18616;
        int size = sparseArray.size();
        int iM35416 = ((C1531) sparseArray.valueAt(0)).m35416();
        double[] dArr = new double[size];
        int i2 = iM35416 + 2;
        this.f18617 = new float[i2];
        this.f18619 = new float[iM35416];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            C1531 c1531 = (C1531) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.f18620.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            c1531.m35414(this.f18617);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f18617;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iM35416] = fArr[0];
            dArr3[iM35416 + 1] = fArr[1];
        }
        this.f20477 = AbstractC1860.m49310(i, dArr, dArr2);
    }

    @Override // p067l.AbstractC1126
    /* JADX INFO: renamed from: ֫ */
    public final void mo16405(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }

    @Override // p067l.AbstractC1126
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3415(float f, long j, View view, C1580 c1580) {
        this.f20477.mo9249(f, this.f18617);
        float[] fArr = this.f18617;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.f20478;
        if (Float.isNaN(this.f20476)) {
            float fM37424 = c1580.m37424(view, this.f18618);
            this.f20476 = fM37424;
            if (Float.isNaN(fM37424)) {
                this.f20476 = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f20476)) % 1.0d);
        this.f20476 = f4;
        this.f20478 = j;
        float fM18068 = m18068(f4);
        this.f20479 = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f18619;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.f20479;
            float f5 = this.f18617[i];
            this.f20479 = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fM18068) + f3;
            i++;
        }
        ((C1531) this.f18616.valueAt(0)).m35412(view, this.f18619);
        if (f2 != 0.0f) {
            this.f20479 = true;
        }
        return this.f20479;
    }
}
