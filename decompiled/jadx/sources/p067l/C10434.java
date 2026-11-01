package p067l;

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
public final class C10434 {

    /* JADX INFO: renamed from: ᩵ */
    public static final Matrix f28843 = new Matrix();

    /* JADX INFO: renamed from: ֫ */
    public float f28844;

    /* JADX INFO: renamed from: ۖ */
    public final C0977 f28845;

    /* JADX INFO: renamed from: ۘ */
    public float f28846;

    /* JADX INFO: renamed from: ۜ */
    public final Path f28847;

    /* JADX INFO: renamed from: ۡ */
    public String f28848;

    /* JADX INFO: renamed from: ۢ */
    public final C3057 f28849;

    /* JADX INFO: renamed from: ۧ */
    public float f28850;

    /* JADX INFO: renamed from: ܳ */
    public final Path f28851;

    /* JADX INFO: renamed from: ܺ */
    public Paint f28852;

    /* JADX INFO: renamed from: ܽ */
    public Paint f28853;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f28854;

    /* JADX INFO: renamed from: ᩳ */
    public final Matrix f28855;

    /* JADX INFO: renamed from: ᩴ */
    public float f28856;

    /* JADX INFO: renamed from: ᩷ */
    public int f28857;

    /* JADX INFO: renamed from: ᩻ */
    public PathMeasure f28858;

    public C10434() {
        this.f28855 = new Matrix();
        this.f28850 = 0.0f;
        this.f28844 = 0.0f;
        this.f28856 = 0.0f;
        this.f28846 = 0.0f;
        this.f28857 = 255;
        this.f28848 = null;
        this.f28854 = null;
        this.f28845 = new C0977();
        this.f28849 = new C3057();
        this.f28851 = new Path();
        this.f28847 = new Path();
    }

    public void setRootAlpha(int i) {
        this.f28857 = i;
    }

    public int getRootAlpha() {
        return this.f28857;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C10434(C10434 c10434) {
        this.f28855 = new Matrix();
        this.f28850 = 0.0f;
        this.f28844 = 0.0f;
        this.f28856 = 0.0f;
        this.f28846 = 0.0f;
        this.f28857 = 255;
        this.f28848 = null;
        this.f28854 = null;
        C0977 c0977 = new C0977();
        this.f28845 = c0977;
        this.f28849 = new C3057(c10434.f28849, c0977);
        this.f28851 = new Path(c10434.f28851);
        this.f28847 = new Path(c10434.f28847);
        this.f28850 = c10434.f28850;
        this.f28844 = c10434.f28844;
        this.f28856 = c10434.f28856;
        this.f28846 = c10434.f28846;
        this.f28857 = c10434.f28857;
        this.f28848 = c10434.f28848;
        String str = c10434.f28848;
        if (str != null) {
            c0977.put(str, this);
        }
        this.f28854 = c10434.f28854;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24129(C3057 c3057, Matrix matrix, Canvas canvas, int i, int i2) {
        C10434 c10434;
        float f;
        int i3;
        float f2;
        C10434 c10435 = this;
        Matrix matrix2 = c3057.f5503;
        ArrayList arrayList = c3057.f5494;
        matrix2.set(matrix);
        Matrix matrix3 = c3057.f5503;
        matrix3.preConcat(c3057.f5500);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC7752 abstractC7752 = (AbstractC7752) arrayList.get(i4);
            if (abstractC7752 instanceof C3057) {
                m24129((C3057) abstractC7752, matrix3, canvas, i, i2);
            } else {
                if (abstractC7752 instanceof AbstractC3728) {
                    AbstractC3728 abstractC3728 = (AbstractC3728) abstractC7752;
                    float f3 = i / c10435.f28856;
                    float f4 = i2 / c10435.f28846;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c10435.f28855;
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
                        c10434 = this;
                    } else {
                        c10434 = this;
                        Path path = c10434.f28851;
                        path.reset();
                        C1703[] c1703Arr = abstractC3728.f7899;
                        if (c1703Arr != null) {
                            C1563.m36819(c1703Arr, path);
                        }
                        Path path2 = c10434.f28847;
                        path2.reset();
                        if (abstractC3728 instanceof C20493) {
                            path2.setFillType(abstractC3728.f7898 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C21164 c21164 = (C21164) abstractC3728;
                            float f6 = c21164.f66482;
                            if (f6 != 0.0f || c21164.f66487 != 1.0f) {
                                float f7 = c21164.f66481;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c21164.f66487 + f7) % 1.0f;
                                if (c10434.f28858 == null) {
                                    c10434.f28858 = new PathMeasure();
                                }
                                c10434.f28858.setPath(path, false);
                                float length = c10434.f28858.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c10434.f28858.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c10434.f28858.getSegment(0.0f, f11, path, true);
                                } else {
                                    c10434.f28858.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c21164.f66488.m54280()) {
                                C2004 c2004 = c21164.f66488;
                                if (c10434.f28853 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c10434.f28853 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c10434.f28853;
                                if (c2004.m54279()) {
                                    Shader shaderM54278 = c2004.m54278();
                                    shaderM54278.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM54278);
                                    paint2.setAlpha(Math.round(c21164.f66489 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM54275 = c2004.m54275();
                                    float f12 = c21164.f66489;
                                    PorterDuff.Mode mode = C23845.f75761;
                                    paint2.setColor((iM54275 & i3) | (((int) (Color.alpha(iM54275) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c21164.f7898 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c21164.f66491.m54280()) {
                                C2004 c2005 = c21164.f66491;
                                if (c10434.f28852 == null) {
                                    Paint paint3 = new Paint(1);
                                    c10434.f28852 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c10434.f28852;
                                Paint.Join join = c21164.f66490;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c21164.f66483;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c21164.f66485);
                                if (c2005.m54279()) {
                                    Shader shaderM54279 = c2005.m54278();
                                    shaderM54279.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM54279);
                                    paint4.setAlpha(Math.round(c21164.f66486 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM54276 = c2005.m54275();
                                    float f13 = c21164.f66486;
                                    PorterDuff.Mode mode2 = C23845.f75761;
                                    paint4.setColor((iM54276 & i3) | (((int) (Color.alpha(iM54276) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c21164.f66484 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c10435 = c10434;
                c = 0;
            }
            c10434 = c10435;
            i4++;
            c10435 = c10434;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24130(Canvas canvas, int i, int i2) {
        m24129(this.f28849, f28843, canvas, i, i2);
    }
}
