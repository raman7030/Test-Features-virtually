package l;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14307 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13888 f43133;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12751 f43134;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f43136;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43135 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f43138 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f43137 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5474(float f, View view);

    public final String toString() {
        String string = this.f43136;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (C17130 c17130 : this.f43137) {
            StringBuilder sbM19190 = C7166.m19190(string, "[");
            sbM19190.append(c17130.f52482);
            sbM19190.append(" , ");
            sbM19190.append(decimalFormat.format(c17130.f52483));
            sbM19190.append("] ");
            string = sbM19190.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34136(String str) {
        this.f43136 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m34132(float f) {
        C12751 c12751 = this.f43134;
        AbstractC20513 abstractC20513 = c12751.f38325;
        if (abstractC20513 != null) {
            abstractC20513.mo7169(f, c12751.f38332);
        } else {
            double[] dArr = c12751.f38332;
            dArr[0] = c12751.f38327[0];
            dArr[1] = c12751.f38326[0];
        }
        return (float) ((c12751.f38329.m10954(f) * c12751.f38332[1]) + c12751.f38332[0]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m34137(float f) {
        C12751 c12751 = this.f43134;
        C3579 c3579 = c12751.f38329;
        AbstractC20513 abstractC20513 = c12751.f38325;
        if (abstractC20513 != null) {
            double d = f;
            abstractC20513.mo7173(d, c12751.f38328);
            c12751.f38325.mo7169(d, c12751.f38332);
        } else {
            double[] dArr = c12751.f38328;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d2 = f;
        double dM10954 = c3579.m10954(d2);
        double dM10953 = c3579.m10953(d2);
        double[] dArr2 = c12751.f38328;
        return (float) ((dM10953 * c12751.f38332[1]) + (dM10954 * dArr2[1]) + dArr2[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34135(int i, int i2, int i3, float f, float f2, float f3, C13888 c13888) {
        this.f43137.add(new C17130(i, f, f2, f3));
        if (i3 != -1) {
            this.f43138 = i3;
        }
        this.f43135 = i2;
        this.f43133 = c13888;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34134(int i, int i2, int i3, float f, float f2, float f3) {
        this.f43137.add(new C17130(i, f, f2, f3));
        if (i3 != -1) {
            this.f43138 = i3;
        }
        this.f43135 = i2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34133() {
        int i;
        ArrayList<C17130> arrayList = this.f43137;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C19808());
        double[] dArr = new double[size];
        char c = 1;
        char c2 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 2);
        int i2 = this.f43135;
        C12751 c12751 = new C12751();
        C3579 c3579 = new C3579();
        c12751.f38329 = c3579;
        new HashMap();
        c3579.m10951(i2);
        c12751.f38326 = new float[size];
        c12751.f38330 = new double[size];
        c12751.f38331 = new float[size];
        c12751.f38327 = new float[size];
        float[] fArr = new float[size];
        this.f43134 = c12751;
        int i3 = 0;
        for (C17130 c17130 : arrayList) {
            float f = c17130.f52481;
            dArr[i3] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i3];
            float f2 = c17130.f52483;
            dArr3[c2] = f2;
            float f3 = c17130.f52480;
            dArr3[c] = f3;
            C12751 c12752 = this.f43134;
            c12752.f38330[i3] = ((double) c17130.f52482) / 100.0d;
            c12752.f38331[i3] = f;
            c12752.f38327[i3] = f3;
            c12752.f38326[i3] = f2;
            i3++;
            c = 1;
            c2 = 0;
        }
        C12751 c12753 = this.f43134;
        float[] fArr2 = c12753.f38331;
        C3579 c35710 = c12753.f38329;
        double[] dArr4 = c12753.f38330;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, dArr4.length, 2);
        float[] fArr3 = c12753.f38326;
        c12753.f38332 = new double[fArr3.length + 1];
        c12753.f38328 = new double[fArr3.length + 1];
        if (dArr4[0] > 0.0d) {
            c35710.m10950(0.0d, fArr2[0]);
        }
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            c35710.m10950(1.0d, fArr2[length]);
        }
        for (int i4 = 0; i4 < dArr5.length; i4++) {
            dArr5[i4][0] = c12753.f38327[i4];
            for (int i5 = 0; i5 < fArr3.length; i5++) {
                dArr5[i5][1] = fArr3[i5];
            }
            c35710.m10950(dArr4[i4], fArr2[i4]);
        }
        c35710.m10949();
        if (dArr4.length > 1) {
            i = 0;
            c12753.f38325 = AbstractC20513.m46987(0, dArr4, dArr5);
        } else {
            i = 0;
            c12753.f38325 = null;
        }
        AbstractC20513.m46987(i, dArr, dArr2);
    }
}
