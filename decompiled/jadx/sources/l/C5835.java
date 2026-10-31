package l;

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
public final class C5835 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7246 f17887;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f17888;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f17889;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Path f17890;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7246 f17891;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16376 f17893;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f17894;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f17895 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f17896 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public RectF f17892 = new RectF();

    public C5835(C16376 c16376, C7246 c7246, C7246 c7247, int i) {
        this.f17893 = c16376;
        this.f17891 = c7246;
        this.f17887 = c7247;
        this.f17889 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16346(String str, String str2) {
        this.f17888 = str;
        this.f17894 = str2;
        Path pathM34681 = C14533.m34681(str2);
        this.f17890 = pathM34681;
        pathM34681.computeBounds(this.f17892, true);
        ArrayList<Path> arrayList = this.f17895;
        arrayList.clear();
        ArrayList arrayList2 = this.f17896;
        arrayList2.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        for (C17356 c17356 : C14533.m34679(str)) {
            float[] fArrM40687 = c17356.m40687();
            char cM40688 = c17356.m40688();
            if (cM40688 == 'C') {
                for (int i = 0; i < fArrM40687.length; i += 6) {
                    Path path = new Path();
                    path.moveTo(f, f2);
                    int i2 = i + 4;
                    int i3 = i + 5;
                    path.cubicTo(fArrM40687[i], fArrM40687[i + 1], fArrM40687[i + 2], fArrM40687[i + 3], fArrM40687[i2], fArrM40687[i3]);
                    arrayList.add(path);
                    f = fArrM40687[i2];
                    f2 = fArrM40687[i3];
                }
            } else if (cM40688 == 'M') {
                if (fArrM40687.length != 2) {
                    throw new RuntimeException(str);
                }
                f = fArrM40687[0];
                f2 = fArrM40687[1];
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16345(Canvas canvas, C1539 c1539, RectF rectF, float f) {
        float f2;
        int i = this.f17889;
        if (i == 1) {
            float f3 = C10069.f30266;
            c1539.setColor(C21943.m49424(-3597012, -65536));
        } else if (i == 2) {
            float f4 = C10069.f30266;
            c1539.setColor(C21943.m49424(-12683063, -14671696));
        } else if (i == 3) {
            float f5 = C10069.f30266;
            c1539.setColor(C21943.m49424(-5334989, -2047968));
        } else if (i != 4 && i == 5) {
            float f6 = C10069.f30266;
            c1539.setColor(C21943.m49424(-12550080, -11503536));
        } else {
            float f7 = C10069.f30266;
            c1539.setColor(C21943.m49424(-4144960, -15724528));
        }
        int i2 = this.f17893.f50391;
        if (i2 == -1) {
            f2 = 2.0f;
        } else if (i2 == this.f17891.f22229 || i2 == this.f17887.f22229) {
            f2 = 4.0f;
        } else {
            c1539.setAlpha(C21943.m49424(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 90));
            f2 = 2.0f;
        }
        float f8 = C10069.f30266;
        float f9 = f2 * f8 * f;
        Path path = new Path();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        int i3 = 0;
        if (i == 3 || i == 5) {
            c1539.setPathEffect(new DashPathEffect(new float[]{8.0f * f8 * f, f8 * 6.0f * f}, 0.0f));
        }
        c1539.setStyle(Paint.Style.STROKE);
        c1539.setStrokeWidth(f9);
        while (true) {
            ArrayList arrayList = this.f17896;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((RectF) arrayList.get(i3)).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                ((Path) this.f17895.get(i3)).transform(matrix, path);
                canvas.drawPath(path, c1539);
            }
            i3++;
        }
        if (i == 3 || i == 5) {
            c1539.setPathEffect(null);
        }
        if (this.f17892.intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
            c1539.setStyle(Paint.Style.FILL);
            this.f17890.transform(matrix, path);
            canvas.drawPath(path, c1539);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5835.class != obj.getClass()) {
            return false;
        }
        C5835 c5835 = (C5835) obj;
        if (this.f17891.equals(c5835.f17891)) {
            return this.f17887.equals(c5835.f17887);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17891.f22229 * 31) + this.f17887.f22229;
    }

    public C5835(C16376 c16376, C12951 c12951) {
        this.f17893 = c16376;
        ArrayList arrayList = c16376.f50393;
        this.f17891 = (C7246) arrayList.get(c12951.readInt());
        this.f17887 = (C7246) arrayList.get(c12951.readInt());
        this.f17889 = c12951.readInt();
        if (c12951.readByte() != 0) {
            m16346(c12951.m31506(), c12951.m31506());
        }
    }
}
