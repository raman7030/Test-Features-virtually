package p067l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3707 {

    /* JADX INFO: renamed from: ᩵ */
    public static final Matrix f7830 = new Matrix();

    /* JADX INFO: renamed from: ֫ */
    public float f7831;

    /* JADX INFO: renamed from: ۖ */
    public final C0977 f7832;

    /* JADX INFO: renamed from: ۘ */
    public float f7833;

    /* JADX INFO: renamed from: ۜ */
    public final Path f7834;

    /* JADX INFO: renamed from: ۡ */
    public String f7835;

    /* JADX INFO: renamed from: ۢ */
    public final C21143 f7836;

    /* JADX INFO: renamed from: ۧ */
    public float f7837;

    /* JADX INFO: renamed from: ܳ */
    public final Path f7838;

    /* JADX INFO: renamed from: ܺ */
    public Paint f7839;

    /* JADX INFO: renamed from: ܽ */
    public Paint f7840;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f7841;

    /* JADX INFO: renamed from: ᩳ */
    public final Matrix f7842;

    /* JADX INFO: renamed from: ᩴ */
    public float f7843;

    /* JADX INFO: renamed from: ᩷ */
    public int f7844;

    /* JADX INFO: renamed from: ᩻ */
    public PathMeasure f7845;

    public C3707() {
        this.f7842 = new Matrix();
        this.f7837 = 0.0f;
        this.f7831 = 0.0f;
        this.f7843 = 0.0f;
        this.f7833 = 0.0f;
        this.f7844 = 255;
        this.f7835 = null;
        this.f7841 = null;
        this.f7832 = new C0977();
        this.f7836 = new C21143();
        this.f7838 = new Path();
        this.f7834 = new Path();
    }

    public C3707(C3707 c3707) {
        this.f7842 = new Matrix();
        this.f7837 = 0.0f;
        this.f7831 = 0.0f;
        this.f7843 = 0.0f;
        this.f7833 = 0.0f;
        this.f7844 = 255;
        this.f7835 = null;
        this.f7841 = null;
        C0977 c0977 = new C0977();
        this.f7832 = c0977;
        this.f7836 = new C21143(c3707.f7836, c0977);
        this.f7838 = new Path(c3707.f7838);
        this.f7834 = new Path(c3707.f7834);
        this.f7837 = c3707.f7837;
        this.f7831 = c3707.f7831;
        this.f7843 = c3707.f7843;
        this.f7833 = c3707.f7833;
        this.f7844 = c3707.f7844;
        this.f7835 = c3707.f7835;
        String str = c3707.f7835;
        if (str != null) {
            c0977.put(str, this);
        }
        this.f7841 = c3707.f7841;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7137(C21143 c21143, Matrix matrix, Canvas canvas, int i, int i2) {
        C3707 c3707;
        float f;
        int i3;
        float f2;
        C3707 c3708 = this;
        Matrix matrix2 = c21143.f66444;
        ArrayList arrayList = c21143.f66435;
        matrix2.set(matrix);
        Matrix matrix3 = c21143.f66444;
        matrix3.preConcat(c21143.f66441);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC3036 abstractC3036 = (AbstractC3036) arrayList.get(i4);
            if (abstractC3036 instanceof C21143) {
                m7137((C21143) abstractC3036, matrix3, canvas, i, i2);
            } else {
                if (abstractC3036 instanceof AbstractC7731) {
                    AbstractC7731 abstractC7731 = (AbstractC7731) abstractC3036;
                    float f3 = i / c3708.f7843;
                    float f4 = i2 / c3708.f7833;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c3708.f7842;
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
                        c3707 = this;
                    } else {
                        c3707 = this;
                        Path path = c3707.f7838;
                        path.reset();
                        C1703[] c1703Arr = abstractC7731.f20267;
                        if (c1703Arr != null) {
                            try {
                                C1563.m36819(c1703Arr, path);
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                path.reset();
                            }
                        }
                        Path path2 = c3707.f7834;
                        path2.reset();
                        if (abstractC7731 instanceof C6390) {
                            path2.setFillType(abstractC7731.f20266 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C20472 c20472 = (C20472) abstractC7731;
                            float f6 = c20472.f63220;
                            if (f6 != 0.0f || c20472.f63212 != 1.0f) {
                                float f7 = c20472.f63213;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c20472.f63212 + f7) % 1.0f;
                                if (c3707.f7845 == null) {
                                    c3707.f7845 = new PathMeasure();
                                }
                                c3707.f7845.setPath(path, false);
                                float length = c3707.f7845.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c3707.f7845.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c3707.f7845.getSegment(0.0f, f11, path, true);
                                } else {
                                    c3707.f7845.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c20472.f63217.m54280()) {
                                C2004 c2004 = c20472.f63217;
                                if (c3707.f7840 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c3707.f7840 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c3707.f7840;
                                if (c2004.m54279()) {
                                    Shader shaderM54278 = c2004.m54278();
                                    C12826.requireNonNull(shaderM54278);
                                    shaderM54278.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM54278);
                                    paint2.setAlpha(Math.round(c20472.f63219 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM54275 = c2004.m54275();
                                    float f12 = c20472.f63219;
                                    int i5 = C17117.f50558;
                                    paint2.setColor((iM54275 & i3) | (((int) (Color.alpha(iM54275) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c20472.f20266 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c20472.f63214.m54280()) {
                                C2004 c2005 = c20472.f63214;
                                if (c3707.f7839 == null) {
                                    Paint paint3 = new Paint(1);
                                    c3707.f7839 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c3707.f7839;
                                Paint.Join join = c20472.f63216;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c20472.f63221;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c20472.f63215);
                                if (c2005.m54279()) {
                                    Shader shaderM54279 = c2005.m54278();
                                    C12826.requireNonNull(shaderM54279);
                                    shaderM54279.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM54279);
                                    paint4.setAlpha(Math.round(c20472.f63222 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM54276 = c2005.m54275();
                                    float f13 = c20472.f63222;
                                    int i6 = C17117.f50558;
                                    paint4.setColor((iM54276 & i3) | (((int) (Color.alpha(iM54276) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c20472.f63218 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c3708 = c3707;
                c = 0;
            }
            c3707 = c3708;
            i4++;
            c3708 = c3707;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7138(Canvas canvas, int i, int i2) {
        m7137(this.f7836, f7830, canvas, i, i2);
    }
}
