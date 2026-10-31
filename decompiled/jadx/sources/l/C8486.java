package l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8486 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Matrix f25928 = new Matrix();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f25929;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2727 f25930;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f25931;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Path f25932;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f25933;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0724 f25934;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f25935;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Path f25936;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Paint f25937;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Paint f25938;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f25939;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Matrix f25940;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f25941;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25942;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PathMeasure f25943;

    public C8486() {
        this.f25940 = new Matrix();
        this.f25935 = 0.0f;
        this.f25929 = 0.0f;
        this.f25941 = 0.0f;
        this.f25931 = 0.0f;
        this.f25942 = 255;
        this.f25933 = null;
        this.f25939 = null;
        this.f25930 = new C2727();
        this.f25934 = new C0724();
        this.f25936 = new Path();
        this.f25932 = new Path();
    }

    public void setRootAlpha(int i) {
        this.f25942 = i;
    }

    public int getRootAlpha() {
        return this.f25942;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C8486(C8486 c8486) {
        this.f25940 = new Matrix();
        this.f25935 = 0.0f;
        this.f25929 = 0.0f;
        this.f25941 = 0.0f;
        this.f25931 = 0.0f;
        this.f25942 = 255;
        this.f25933 = null;
        this.f25939 = null;
        C2727 c2727 = new C2727();
        this.f25930 = c2727;
        this.f25934 = new C0724(c8486.f25934, c2727);
        this.f25936 = new Path(c8486.f25936);
        this.f25932 = new Path(c8486.f25932);
        this.f25935 = c8486.f25935;
        this.f25929 = c8486.f25929;
        this.f25941 = c8486.f25941;
        this.f25931 = c8486.f25931;
        this.f25942 = c8486.f25942;
        this.f25933 = c8486.f25933;
        String str = c8486.f25933;
        if (str != null) {
            c2727.put(str, this);
        }
        this.f25939 = c8486.f25939;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22161(C0724 c0724, Matrix matrix, Canvas canvas, int i, int i2) {
        C8486 c8486;
        float f;
        int i3;
        float f2;
        C8486 c8487 = this;
        Matrix matrix2 = c0724.f2731;
        ArrayList arrayList = c0724.f2722;
        matrix2.set(matrix);
        Matrix matrix3 = c0724.f2731;
        matrix3.preConcat(c0724.f2728);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC5664 abstractC5664 = (AbstractC5664) arrayList.get(i4);
            if (abstractC5664 instanceof C0724) {
                m22161((C0724) abstractC5664, matrix3, canvas, i, i2);
            } else {
                if (abstractC5664 instanceof AbstractC1430) {
                    AbstractC1430 abstractC1430 = (AbstractC1430) abstractC5664;
                    float f3 = i / c8487.f25941;
                    float f4 = i2 / c8487.f25931;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c8487.f25940;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs == 0.0f) {
                        c8486 = this;
                    } else {
                        c8486 = this;
                        Path path = c8486.f25936;
                        path.reset();
                        C17356[] c17356Arr = abstractC1430.f5126;
                        if (c17356Arr != null) {
                            C14533.m34676(c17356Arr, path);
                        }
                        Path path2 = c8486.f25932;
                        path2.reset();
                        if (abstractC1430 instanceof C19070) {
                            path2.setFillType(abstractC1430.f5125 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C19776 c19776 = (C19776) abstractC1430;
                            float f6 = c19776.f63844;
                            if (f6 != 0.0f || c19776.f63849 != 1.0f) {
                                float f7 = c19776.f63843;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c19776.f63849 + f7) % 1.0f;
                                if (c8486.f25943 == null) {
                                    c8486.f25943 = new PathMeasure();
                                }
                                c8486.f25943.setPath(path, false);
                                float length = c8486.f25943.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c8486.f25943.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c8486.f25943.getSegment(0.0f, f11, path, true);
                                } else {
                                    c8486.f25943.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c19776.f63850.m51882()) {
                                C23418 c23418 = c19776.f63850;
                                if (c8486.f25938 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c8486.f25938 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c8486.f25938;
                                if (c23418.m51881()) {
                                    Shader shaderM51880 = c23418.m51880();
                                    shaderM51880.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM51880);
                                    paint2.setAlpha(Math.round(c19776.f63851 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM51877 = c23418.m51877();
                                    float f12 = c19776.f63851;
                                    PorterDuff.Mode mode = C22597.f73034;
                                    paint2.setColor((iM51877 & i3) | (((int) (Color.alpha(iM51877) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c19776.f5125 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c19776.f63853.m51882()) {
                                C23418 c23419 = c19776.f63853;
                                if (c8486.f25937 == null) {
                                    Paint paint3 = new Paint(1);
                                    c8486.f25937 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c8486.f25937;
                                Paint.Join join = c19776.f63852;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c19776.f63845;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c19776.f63847);
                                if (c23419.m51881()) {
                                    Shader shaderM51881 = c23419.m51880();
                                    shaderM51881.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM51881);
                                    paint4.setAlpha(Math.round(c19776.f63848 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM51878 = c23419.m51877();
                                    float f13 = c19776.f63848;
                                    PorterDuff.Mode mode2 = C22597.f73034;
                                    paint4.setColor((iM51878 & i3) | (((int) (Color.alpha(iM51878) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c19776.f63846 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c8487 = c8486;
                c = 0;
            }
            c8486 = c8487;
            i4++;
            c8487 = c8486;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22162(Canvas canvas, int i, int i2) {
        m22161(this.f25934, f25928, canvas, i, i2);
    }
}
