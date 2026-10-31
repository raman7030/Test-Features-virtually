package l;

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
public final class C1408 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Matrix f5059 = new Matrix();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f5060;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2727 f5061;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f5062;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Path f5063;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f5064;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C19754 f5065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f5066;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Path f5067;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Paint f5068;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Paint f5069;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f5070;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Matrix f5071;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f5072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f5073;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PathMeasure f5074;

    public C1408() {
        this.f5071 = new Matrix();
        this.f5066 = 0.0f;
        this.f5060 = 0.0f;
        this.f5072 = 0.0f;
        this.f5062 = 0.0f;
        this.f5073 = 255;
        this.f5064 = null;
        this.f5070 = null;
        this.f5061 = new C2727();
        this.f5065 = new C19754();
        this.f5067 = new Path();
        this.f5063 = new Path();
    }

    public C1408(C1408 c1408) {
        this.f5071 = new Matrix();
        this.f5066 = 0.0f;
        this.f5060 = 0.0f;
        this.f5072 = 0.0f;
        this.f5062 = 0.0f;
        this.f5073 = 255;
        this.f5064 = null;
        this.f5070 = null;
        C2727 c2727 = new C2727();
        this.f5061 = c2727;
        this.f5065 = new C19754(c1408.f5065, c2727);
        this.f5067 = new Path(c1408.f5067);
        this.f5063 = new Path(c1408.f5063);
        this.f5066 = c1408.f5066;
        this.f5060 = c1408.f5060;
        this.f5072 = c1408.f5072;
        this.f5062 = c1408.f5062;
        this.f5073 = c1408.f5073;
        this.f5064 = c1408.f5064;
        String str = c1408.f5064;
        if (str != null) {
            c2727.put(str, this);
        }
        this.f5070 = c1408.f5070;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4898(C19754 c19754, Matrix matrix, Canvas canvas, int i, int i2) {
        C1408 c1408;
        float f;
        int i3;
        float f2;
        C1408 c1409 = this;
        Matrix matrix2 = c19754.f63809;
        ArrayList arrayList = c19754.f63800;
        matrix2.set(matrix);
        Matrix matrix3 = c19754.f63809;
        matrix3.preConcat(c19754.f63806);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC0702 abstractC0702 = (AbstractC0702) arrayList.get(i4);
            if (abstractC0702 instanceof C19754) {
                m4898((C19754) abstractC0702, matrix3, canvas, i, i2);
            } else {
                if (abstractC0702 instanceof AbstractC5642) {
                    AbstractC5642 abstractC5642 = (AbstractC5642) abstractC0702;
                    float f3 = i / c1409.f5072;
                    float f4 = i2 / c1409.f5062;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c1409.f5071;
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
                        c1408 = this;
                    } else {
                        c1408 = this;
                        Path path = c1408.f5067;
                        path.reset();
                        C17356[] c17356Arr = abstractC5642.f17421;
                        if (c17356Arr != null) {
                            try {
                                C14533.m34676(c17356Arr, path);
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                path.reset();
                            }
                        }
                        Path path2 = c1408.f5063;
                        path2.reset();
                        if (abstractC5642 instanceof C4231) {
                            path2.setFillType(abstractC5642.f17420 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C19048 c19048 = (C19048) abstractC5642;
                            float f6 = c19048.f59991;
                            if (f6 != 0.0f || c19048.f59983 != 1.0f) {
                                float f7 = c19048.f59984;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c19048.f59983 + f7) % 1.0f;
                                if (c1408.f5074 == null) {
                                    c1408.f5074 = new PathMeasure();
                                }
                                c1408.f5074.setPath(path, false);
                                float length = c1408.f5074.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c1408.f5074.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c1408.f5074.getSegment(0.0f, f11, path, true);
                                } else {
                                    c1408.f5074.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c19048.f59988.m51882()) {
                                C23418 c23418 = c19048.f59988;
                                if (c1408.f5069 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c1408.f5069 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c1408.f5069;
                                if (c23418.m51881()) {
                                    Shader shaderM51880 = c23418.m51880();
                                    C11003.requireNonNull(shaderM51880);
                                    shaderM51880.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM51880);
                                    paint2.setAlpha(Math.round(c19048.f59990 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM51877 = c23418.m51877();
                                    float f12 = c19048.f59990;
                                    int i5 = C15518.f47426;
                                    paint2.setColor((iM51877 & i3) | (((int) (Color.alpha(iM51877) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c19048.f17420 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c19048.f59985.m51882()) {
                                C23418 c23419 = c19048.f59985;
                                if (c1408.f5068 == null) {
                                    Paint paint3 = new Paint(1);
                                    c1408.f5068 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c1408.f5068;
                                Paint.Join join = c19048.f59987;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c19048.f59992;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c19048.f59986);
                                if (c23419.m51881()) {
                                    Shader shaderM51881 = c23419.m51880();
                                    C11003.requireNonNull(shaderM51881);
                                    shaderM51881.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM51881);
                                    paint4.setAlpha(Math.round(c19048.f59993 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM51878 = c23419.m51877();
                                    float f13 = c19048.f59993;
                                    int i6 = C15518.f47426;
                                    paint4.setColor((iM51878 & i3) | (((int) (Color.alpha(iM51878) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c19048.f59989 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c1409 = c1408;
                c = 0;
            }
            c1408 = c1409;
            i4++;
            c1409 = c1408;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4899(Canvas canvas, int i, int i2) {
        m4898(this.f5065, f5059, canvas, i, i2);
    }
}
