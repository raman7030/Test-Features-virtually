package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5011 extends AbstractC5717 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SparseArray f15784;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float[] f15785;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f15786;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float[] f15787;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public SparseArray f15788;

    public C5011() {
        throw null;
    }

    @Override // l.AbstractC5717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14502(int i) {
        SparseArray sparseArray = this.f15784;
        int size = sparseArray.size();
        int iM33297 = ((C13888) sparseArray.valueAt(0)).m33297();
        double[] dArr = new double[size];
        int i2 = iM33297 + 2;
        this.f15785 = new float[i2];
        this.f15787 = new float[iM33297];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            C13888 c13888 = (C13888) sparseArray.valueAt(i3);
            float[] fArr = (float[]) this.f15788.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            c13888.m33295(this.f15785);
            int i4 = 0;
            while (true) {
                float[] fArr2 = this.f15785;
                if (i4 < fArr2.length) {
                    dArr2[i3][i4] = fArr2[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iM33297] = fArr[0];
            dArr3[iM33297 + 1] = fArr[1];
        }
        this.f17632 = AbstractC20513.m46987(i, dArr, dArr2);
    }

    @Override // l.AbstractC5717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14501(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }

    @Override // l.AbstractC5717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1019(float f, long j, View view, C14867 c14867) {
        this.f17632.mo7170(f, this.f15785);
        float[] fArr = this.f15785;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.f17633;
        if (Float.isNaN(this.f17631)) {
            float fM35271 = c14867.m35271(view, this.f15786);
            this.f17631 = fM35271;
            if (Float.isNaN(fM35271)) {
                this.f17631 = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f17631)) % 1.0d);
        this.f17631 = f4;
        this.f17633 = j;
        float fM16149 = m16149(f4);
        this.f17634 = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.f15787;
            if (i >= fArr2.length) {
                break;
            }
            boolean z = this.f17634;
            float f5 = this.f15785[i];
            this.f17634 = z | (((double) f5) != 0.0d);
            fArr2[i] = (f5 * fM16149) + f3;
            i++;
        }
        ((C13888) this.f15784.valueAt(0)).m33293(view, this.f15787);
        if (f2 != 0.0f) {
            this.f17634 = true;
        }
        return this.f17634;
    }
}
