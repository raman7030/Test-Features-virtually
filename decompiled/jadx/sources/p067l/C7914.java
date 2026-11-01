package p067l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R147 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7914 {

    /* JADX INFO: renamed from: ֫ */
    public final C9255 f20739;

    /* JADX INFO: renamed from: ۜ */
    public String f20740;

    /* JADX INFO: renamed from: ۢ */
    public final int f20741;

    /* JADX INFO: renamed from: ۧ */
    public Path f20742;

    /* JADX INFO: renamed from: ܳ */
    public final C9255 f20743;

    /* JADX INFO: renamed from: ܿ */
    public final C17932 f20745;

    /* JADX INFO: renamed from: ᩳ */
    public String f20746;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f20747 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f20748 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public RectF f20744 = new RectF();

    public C7914(C17932 c17932, C9255 c9255, C9255 c9256, int i) {
        this.f20745 = c17932;
        this.f20743 = c9255;
        this.f20739 = c9256;
        this.f20741 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18271(String str, String str2) {
        this.f20740 = str;
        this.f20746 = str2;
        Path pathM36824 = C1563.m36824(str2);
        this.f20742 = pathM36824;
        pathM36824.computeBounds(this.f20744, true);
        ArrayList<Path> arrayList = this.f20747;
        arrayList.clear();
        ArrayList arrayList2 = this.f20748;
        arrayList2.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C1703 c1703 : C1563.m36822(str)) {
            float[] fArrM42938 = c1703.m42938();
            char cM42939 = c1703.m42939();
            if (cM42939 == 'C') {
                for (int i = 0; i < fArrM42938.length; i += 6) {
                    Path path = new Path();
                    path.moveTo(f, f2);
                    int i2 = i + 4;
                    int i3 = i + 5;
                    path.cubicTo(fArrM42938[i], fArrM42938[i + 1], fArrM42938[i + 2], fArrM42938[i + 3], fArrM42938[i2], fArrM42938[i3]);
                    arrayList.add(path);
                    f = fArrM42938[i2];
                    f2 = fArrM42938[i3];
                }
            } else if (cM42939 == 'M') {
                if (fArrM42938.length != 2) {
                    throw new RuntimeException(str);
                }
                f = fArrM42938[0];
                f2 = fArrM42938[1];
            } else {
                throw new RuntimeException(str);
            }
        }
        for (Path path2 : arrayList) {
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            arrayList2.add(rectF);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18270(Canvas canvas, C3831 c3831, RectF rectF, float f) {
        float f2;
        int i = this.f20741;
        if (i == 1) {
            float f3 = C11938.f33224;
            c3831.setColor(C23223.m51761(-3597012, -65536));
        } else if (i == 2) {
            float f4 = C11938.f33224;
            c3831.setColor(C23223.m51761(-12683063, -14671696));
        } else if (i == 3) {
            float f5 = C11938.f33224;
            c3831.setColor(C23223.m51761(-5334989, -2047968));
        } else if (i != 4 && i == 5) {
            float f6 = C11938.f33224;
            c3831.setColor(C23223.m51761(-12550080, -11503536));
        } else {
            float f7 = C11938.f33224;
            c3831.setColor(C23223.m51761(-4144960, -15724528));
        }
        int i2 = this.f20745.f53562;
        if (i2 == -1) {
            f2 = 2.0f;
        } else if (i2 == this.f20743.f25111 || i2 == this.f20739.f25111) {
            f2 = 4.0f;
        } else {
            c3831.setAlpha(C23223.m51761(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 90));
            f2 = 2.0f;
        }
        float f8 = C11938.f33224;
        float f9 = f2 * f8 * f;
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        int i3 = 0;
        if (i == 3 || i == 5) {
            c3831.setPathEffect(new DashPathEffect(new float[]{8.0f * f8 * f, f8 * 6.0f * f}, 0.0f));
        }
        c3831.setStyle(Paint.Style.STROKE);
        c3831.setStrokeWidth(f9);
        while (true) {
            ArrayList arrayList = this.f20748;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((RectF) arrayList.get(i3)).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                ((Path) this.f20747.get(i3)).transform(matrix, path);
                canvas.drawPath(path, c3831);
            }
            i3++;
        }
        if (i == 3 || i == 5) {
            c3831.setPathEffect(null);
        }
        if (this.f20744.intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
            c3831.setStyle(Paint.Style.FILL);
            this.f20742.transform(matrix, path);
            canvas.drawPath(path, c3831);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7914.class != obj.getClass()) {
            return false;
        }
        C7914 c7914 = (C7914) obj;
        if (this.f20743.equals(c7914.f20743)) {
            return this.f20739.equals(c7914.f20739);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20743.f25111 * 31) + this.f20739.f25111;
    }

    public C7914(C17932 c17932, C14677 c14677) {
        this.f20745 = c17932;
        ArrayList arrayList = c17932.f53564;
        this.f20743 = (C9255) arrayList.get(c14677.readInt());
        this.f20739 = (C9255) arrayList.get(c14677.readInt());
        this.f20741 = c14677.readInt();
        if (c14677.readByte() != 0) {
            m18271(c14677.m33593(), c14677.m33593());
        }
    }
}
