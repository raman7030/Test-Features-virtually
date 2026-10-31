package l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ᩴ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18430 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static HashSet f57188;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8552 f57191;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Stack f57192;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f57194;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Stack f57195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Canvas f57197;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Stack f57199;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16312 f57200;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f57196 = new Matrix();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Matrix f57193 = new Matrix();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float[] f57198 = new float[8];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16997 f57189 = new C16997(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f57190 = 96.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42848(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public C18430(Canvas canvas, boolean z) {
        this.f57197 = canvas;
        this.f57194 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m42903() {
        return this.f57190;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m42899() {
        return this.f57191.f26148.getTextSize();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m42901() {
        return this.f57191.f26148.getTextSize() / 2.0f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16997 m42902() {
        C8552 c8552 = this.f57191;
        C16997 c16997 = c8552.f26155;
        return c16997 != null ? c16997 : c8552.f26149;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42900(C16312 c16312, C17703 c17703) {
        this.f57200 = c16312;
        C9383 c9383M38409 = c16312.m38409();
        if (c9383M38409 == null) {
            return;
        }
        C16997 c16997 = c9383M38409.f68869;
        C16291 c16291 = c9383M38409.f24627;
        this.f57191 = new C8552();
        this.f57195 = new Stack();
        m42869(this.f57191, C20672.m47291());
        C8552 c8552 = this.f57191;
        c8552.f26149 = null;
        c8552.f26154 = false;
        this.f57195.push(new C8552(c8552));
        this.f57199 = new Stack();
        this.f57192 = new Stack();
        Boolean bool = c9383M38409.f60631;
        if (bool != null) {
            this.f57191.f26154 = bool.booleanValue();
        }
        m42887();
        C16997 c16998 = new C16997(c17703.f54176);
        C0769 c0769 = c9383M38409.f28498;
        if (c0769 != null) {
            c16998.f52134 = c0769.m2930(this, c16998.f52134);
        }
        C0769 c07610 = c9383M38409.f28501;
        if (c07610 != null) {
            c16998.f52131 = c07610.m2930(this, c16998.f52131);
        }
        m42871(c9383M38409, c16998, c16997, c16291);
        m42897();
    }

    /* JADX WARN: Code duplicated, block: B:306:0x059e A[EDGE_INSN: B:306:0x059e->B:310:0x05b1 BREAK  A[LOOP:1: B:254:0x0494->B:260:0x04a5]] */
    /* JADX WARN: Code duplicated, block: B:309:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:376:0x0697 A[PHI: r14
      0x0697: PHI (r14v9 ??) = (r14v1 ??), (r14v2 ??), (r14v3 ??), (r14v4 ??), (r14v5 ??), (r14v6 ??), (r14v7 ??), (r14v8 ??), (r14v11 ??) binds: [B:548:0x093e, B:501:0x086e, B:467:0x07f7, B:439:0x0794, B:403:0x06ff, B:375:0x0695, B:351:0x063d, B:323:0x05d8, B:204:0x03de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ᩴ֨ܺ] */
    /* JADX WARN: Type inference failed for: r14v1, types: [l.ۤۚܺ, l.ۨۚܺ, l.۬ۚܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v11, types: [l.ۚ֡ܺ, l.۠ۚܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v2, types: [l.ۤ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.ۛ֡ܺ, l.ۤ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l.۠֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v5, types: [l.ܺ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v6, types: [l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ, l.᩻֡ܺ] */
    /* JADX WARN: Type inference failed for: r14v7, types: [l.ۨ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v8, types: [l.ۙ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v9, types: [l.ᩴۚܺ] */
    /* JADX WARN: Type inference failed for: r4v25, types: [l.ۚۚܺ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42866(C5149 c5149) {
        ?? r14;
        RectF rectF;
        C0769 c0769;
        String str;
        int iIndexOf;
        Set setMo7585;
        C0769 c07610;
        AbstractC19261 abstractC19261M38398;
        Boolean bool;
        if (c5149 instanceof InterfaceC21937) {
            return;
        }
        m42887();
        if ((c5149 instanceof AbstractC19261) && (bool = ((AbstractC19261) c5149).f60631) != null) {
            this.f57191.f26154 = bool.booleanValue();
        }
        if (c5149 instanceof C9383) {
            C9383 c9383 = (C9383) c5149;
            m42871(c9383, m42861(c9383.f28500, c9383.f28499, c9383.f28498, c9383.f28501), c9383.f68869, c9383.f24627);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            boolean zM42885 = true;
            float fM2933 = 0.0f;
            if (c5149 instanceof C1496) {
                C1496 c1496 = (C1496) c5149;
                Canvas canvas = this.f57197;
                C0769 c07611 = c1496.f5337;
                if ((c07611 == null || !c07611.m2934()) && ((c07610 = c1496.f5340) == null || !c07610.m2934())) {
                    m42868(this.f57191, c1496);
                    if (m42896() && (abstractC19261M38398 = c1496.f16090.m38398(c1496.f5341)) != null) {
                        Matrix matrix = c1496.f60225;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        C0769 c07612 = c1496.f5339;
                        float fM2932 = c07612 != null ? c07612.m2932(this) : 0.0f;
                        C0769 c07613 = c1496.f5338;
                        canvas.translate(fM2932, c07613 != null ? c07613.m2933(this) : 0.0f);
                        m42891(c1496, c1496.f57590);
                        boolean zM42886 = m42885();
                        m42865(c1496);
                        if (abstractC19261M38398 instanceof C9383) {
                            C9383 c9384 = (C9383) abstractC19261M38398;
                            C16997 c16997M42861 = m42861(null, null, c1496.f5337, c1496.f5340);
                            m42887();
                            m42871(c9384, c16997M42861, c9384.f68869, c9384.f24627);
                            m42897();
                        } else if (abstractC19261M38398 instanceof C19966) {
                            C0769 c07614 = c1496.f5337;
                            if (c07614 == null) {
                                c07614 = new C0769(100.0f, EnumC7265.percent);
                            }
                            C0769 c07615 = c1496.f5340;
                            if (c07615 == null) {
                                c07615 = new C0769(100.0f, EnumC7265.percent);
                            }
                            C16997 c16997M42862 = m42861(null, null, c07614, c07615);
                            m42887();
                            C19966 c19966 = (C19966) abstractC19261M38398;
                            if (c16997M42862.f52134 != 0.0f && c16997M42862.f52131 != 0.0f) {
                                C16291 c16291 = c19966.f24627;
                                if (c16291 == null) {
                                    c16291 = C16291.f50083;
                                }
                                m42868(this.f57191, c19966);
                                C8552 c8552 = this.f57191;
                                c8552.f26149 = c16997M42862;
                                if (!c8552.f26151.f66614.booleanValue()) {
                                    C16997 c16997 = this.f57191.f26149;
                                    m42862(c16997.f52132, c16997.f52133, c16997.f52134, c16997.f52131);
                                }
                                C16997 c16998 = c19966.f68869;
                                if (c16998 != null) {
                                    canvas.concat(m42851(this.f57191.f26149, c16998, c16291));
                                    this.f57191.f26155 = c19966.f68869;
                                } else {
                                    C16997 c16999 = this.f57191.f26149;
                                    canvas.translate(c16999.f52132, c16999.f52133);
                                }
                                boolean zM42887 = m42885();
                                m42877(c19966, true);
                                if (zM42887) {
                                    m42878(c19966.f57590);
                                }
                                m42894(c19966);
                            }
                            m42897();
                        } else {
                            m42866(abstractC19261M38398);
                        }
                        this.f57192.pop();
                        this.f57199.pop();
                        if (zM42886) {
                            m42878(c1496.f57590);
                        }
                        m42894(c1496);
                    }
                }
            } else if (c5149 instanceof C22082) {
                C22082 c22082 = (C22082) c5149;
                m42868(this.f57191, c22082);
                if (m42896()) {
                    Matrix matrix2 = c22082.f60225;
                    if (matrix2 != null) {
                        this.f57197.concat(matrix2);
                    }
                    m42891(c22082, c22082.f57590);
                    boolean zM42888 = m42885();
                    String language = Locale.getDefault().getLanguage();
                    for (?? r4 : c22082.f48531) {
                        if (r4 instanceof InterfaceC8677) {
                            InterfaceC8677 interfaceC8677 = (InterfaceC8677) r4;
                            if (interfaceC8677.mo7588() == null && ((setMo7585 = interfaceC8677.mo7585()) == null || (!setMo7585.isEmpty() && setMo7585.contains(language)))) {
                                Set setMo7593 = interfaceC8677.mo7593();
                                if (setMo7593 != null) {
                                    if (f57188 == null) {
                                        synchronized (C18430.class) {
                                            HashSet hashSet = new HashSet();
                                            f57188 = hashSet;
                                            hashSet.add("Structure");
                                            f57188.add("BasicStructure");
                                            f57188.add("ConditionalProcessing");
                                            f57188.add("Image");
                                            f57188.add("Style");
                                            f57188.add("ViewportAttribute");
                                            f57188.add("Shape");
                                            f57188.add("BasicText");
                                            f57188.add("PaintAttribute");
                                            f57188.add("BasicPaintAttribute");
                                            f57188.add("OpacityAttribute");
                                            f57188.add("BasicGraphicsAttribute");
                                            f57188.add("Marker");
                                            f57188.add("Gradient");
                                            f57188.add("Pattern");
                                            f57188.add("Clip");
                                            f57188.add("BasicClip");
                                            f57188.add("Mask");
                                            f57188.add("View");
                                        }
                                    }
                                    if (setMo7593.isEmpty() || !f57188.containsAll(setMo7593)) {
                                    }
                                }
                                Set setMo7592 = interfaceC8677.mo7592();
                                if (setMo7592 == null) {
                                    Set setMo7590 = interfaceC8677.mo7590();
                                    if (setMo7590 == null) {
                                        m42866(r4);
                                        break;
                                    }
                                    setMo7590.isEmpty();
                                } else {
                                    setMo7592.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM42888) {
                        m42878(c22082.f57590);
                    }
                    m42894(c22082);
                }
            } else if (c5149 instanceof C19115) {
                C19115 c19115 = (C19115) c5149;
                m42868(this.f57191, c19115);
                if (m42896()) {
                    Matrix matrix3 = c19115.f60225;
                    if (matrix3 != null) {
                        this.f57197.concat(matrix3);
                    }
                    m42891(c19115, c19115.f57590);
                    boolean zM42889 = m42885();
                    m42877(c19115, true);
                    if (zM42889) {
                        m42878(c19115.f57590);
                    }
                    m42894(c19115);
                }
            } else if (c5149 instanceof C5003) {
                r14 = (C5003) c5149;
                Canvas canvas2 = this.f57197;
                C0769 c07616 = r14.f15768;
                if (c07616 != null && !c07616.m2934() && (c0769 = r14.f15770) != null && !c0769.m2934() && (str = r14.f15771) != null) {
                    C16291 c16292 = r14.f24627;
                    if (c16292 == null) {
                        c16292 = C16291.f50083;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C16997 c169910 = new C16997(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        m42868(this.f57191, r14);
                        if (m42896() && m42893()) {
                            Matrix matrix4 = r14.f15766;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C0769 c07617 = r14.f15767;
                            float fM2934 = c07617 != null ? c07617.m2932(this) : 0.0f;
                            C0769 c07618 = r14.f15769;
                            float fM2935 = c07618 != null ? c07618.m2933(this) : 0.0f;
                            float fM2936 = r14.f15768.m2932(this);
                            float fM2937 = r14.f15770.m2932(this);
                            C8552 c8553 = this.f57191;
                            c8553.f26149 = new C16997(fM2934, fM2935, fM2936, fM2937);
                            if (!c8553.f26151.f66614.booleanValue()) {
                                C16997 c169911 = this.f57191.f26149;
                                m42862(c169911.f52132, c169911.f52133, c169911.f52134, c169911.f52131);
                            }
                            r14.f57590 = this.f57191.f26149;
                            m42894(r14);
                            m42891(r14, r14.f57590);
                            boolean zM428810 = m42885();
                            m42886();
                            canvas2.save();
                            canvas2.concat(m42851(this.f57191.f26149, c169910, c16292));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f57191.f26151.f66578 == EnumC17849.optimizeSpeed ? 0 : 2));
                            canvas2.restore();
                            if (zM428810) {
                                m42878(r14.f57590);
                            }
                        }
                    }
                }
            } else if (c5149 instanceof C4298) {
                r14 = (C4298) c5149;
                Canvas canvas3 = this.f57197;
                if (r14.f13865 != null) {
                    m42868(this.f57191, r14);
                    if (m42896() && m42893()) {
                        C8552 c8554 = this.f57191;
                        if (c8554.f26152 || c8554.f26150) {
                            Matrix matrix5 = r14.f57156;
                            if (matrix5 != null) {
                                canvas3.concat(matrix5);
                            }
                            Path path = new C23368(r14.f13865).f75064;
                            if (r14.f57590 == null) {
                                r14.f57590 = m42860(path);
                            }
                            m42894(r14);
                            m42880(r14);
                            m42891(r14, r14.f57590);
                            C16997 c169912 = r14.f57590;
                            if (this.f57191.f26151.f66598.floatValue() >= 1.0f && this.f57191.f26151.f66602 == null) {
                                zM42885 = false;
                            } else if (this.f57194 && !canvas3.isHardwareAccelerated()) {
                                C20672 c20672 = this.f57191.f26151;
                                if (c20672.f66602 == null && c20672.f66603 == null && c20672.f66601 == null && c20672.f66593 == null && !(c20672.f66595 instanceof C19821) && !(c20672.f66579 instanceof C19821) && c20672.f66612 != EnumC6560.NonScalingStroke) {
                                    float[] fArr = new float[9];
                                    canvas3.getMatrix().getValues(fArr);
                                    int i = 0;
                                    while (true) {
                                        if (i >= 9) {
                                            if (fArr[1] != 0.0f || fArr[3] != 0.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 1.0f) {
                                                zM42885 = m42885();
                                                break;
                                            }
                                            float fAbs = Math.abs(fArr[0]);
                                            float fAbs2 = Math.abs(fArr[4]);
                                            if (fAbs != 0.0f && fAbs2 != 0.0f) {
                                                C8552 c8555 = this.f57191;
                                                if (!c8555.f26152) {
                                                    c169912.getClass();
                                                    rectF = new RectF(c169912.f52132, c169912.f52133, c169912.m39856(), c169912.m39857());
                                                    float f = -fM2933;
                                                    rectF.inset(f - (2.0f / fAbs), f - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left)) {
                                                        zM42885 = m42885();
                                                        break;
                                                    } else {
                                                        zM42885 = m42885();
                                                        break;
                                                    }
                                                }
                                                float strokeWidth = c8555.f26153.getStrokeWidth();
                                                if (strokeWidth > 0.0f) {
                                                    fM2933 = (this.f57191.f26153.getStrokeJoin() == Paint.Join.MITER ? Math.max(2.0f, this.f57191.f26153.getStrokeMiter()) : 2.0f) * strokeWidth * 0.5f;
                                                    c169912.getClass();
                                                    rectF = new RectF(c169912.f52132, c169912.f52133, c169912.m39856(), c169912.m39857());
                                                    float f2 = -fM2933;
                                                    rectF.inset(f2 - (2.0f / fAbs), f2 - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left) && !Float.isInfinite(rectF.left) && !Float.isNaN(rectF.top) && !Float.isInfinite(rectF.top) && !Float.isNaN(rectF.right) && !Float.isInfinite(rectF.right) && !Float.isNaN(rectF.bottom) && !Float.isInfinite(rectF.bottom)) {
                                                        canvas3.clipRect(rectF);
                                                        canvas3.saveLayerAlpha(rectF, m42848(this.f57191.f26151.f66598.floatValue()), 31);
                                                        this.f57195.push(this.f57191);
                                                        break;
                                                    }
                                                    zM42885 = m42885();
                                                    break;
                                                }
                                                zM42885 = m42885();
                                                break;
                                            }
                                            zM42885 = m42885();
                                            break;
                                        }
                                        float f3 = fArr[i];
                                        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
                                            zM42885 = m42885();
                                            break;
                                        }
                                        i++;
                                    }
                                } else {
                                    zM42885 = m42885();
                                }
                            } else {
                                zM42885 = m42885();
                            }
                            C8552 c8556 = this.f57191;
                            if (c8556.f26150) {
                                EnumC7120 enumC7120 = c8556.f26151.f66586;
                                path.setFillType((enumC7120 == null || enumC7120 != EnumC7120.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m42881(r14, path);
                            }
                            if (this.f57191.f26152) {
                                m42890(path);
                            }
                            m42879(r14);
                            if (zM42885) {
                                m42878(r14.f57590);
                            }
                        }
                    }
                }
            } else if (c5149 instanceof C11354) {
                r14 = (C11354) c5149;
                C0769 c07619 = r14.f33984;
                if (c07619 != null && r14.f33986 != null && !c07619.m2934() && !r14.f33986.m2934()) {
                    m42868(this.f57191, r14);
                    if (m42896() && m42893()) {
                        Matrix matrix6 = r14.f57156;
                        if (matrix6 != null) {
                            this.f57197.concat(matrix6);
                        }
                        Path pathM42853 = m42853(r14);
                        m42894(r14);
                        m42880(r14);
                        m42891(r14, r14.f57590);
                        boolean zM428811 = m42885();
                        if (this.f57191.f26150) {
                            m42881(r14, pathM42853);
                        }
                        if (this.f57191.f26152) {
                            m42890(pathM42853);
                        }
                        if (zM428811) {
                            m42878(r14.f57590);
                        }
                    }
                }
            } else if (c5149 instanceof C23347) {
                r14 = (C23347) c5149;
                C0769 c07620 = r14.f75014;
                if (c07620 != null && !c07620.m2934()) {
                    m42868(this.f57191, r14);
                    if (m42896() && m42893()) {
                        Matrix matrix7 = r14.f57156;
                        if (matrix7 != null) {
                            this.f57197.concat(matrix7);
                        }
                        Path pathM42856 = m42856(r14);
                        m42894(r14);
                        m42880(r14);
                        m42891(r14, r14.f57590);
                        boolean zM428812 = m42885();
                        if (this.f57191.f26150) {
                            m42881(r14, pathM42856);
                        }
                        if (this.f57191.f26152) {
                            m42890(pathM42856);
                        }
                        if (zM428812) {
                            m42878(r14.f57590);
                        }
                    }
                }
            } else if (c5149 instanceof C15585) {
                r14 = (C15585) c5149;
                C0769 c07621 = r14.f48014;
                if (c07621 != null && r14.f48015 != null && !c07621.m2934() && !r14.f48015.m2934()) {
                    m42868(this.f57191, r14);
                    if (m42896() && m42893()) {
                        Matrix matrix8 = r14.f57156;
                        if (matrix8 != null) {
                            this.f57197.concat(matrix8);
                        }
                        Path pathM42854 = m42854(r14);
                        m42894(r14);
                        m42880(r14);
                        m42891(r14, r14.f57590);
                        boolean zM428813 = m42885();
                        if (this.f57191.f26150) {
                            m42881(r14, pathM42854);
                        }
                        if (this.f57191.f26152) {
                            m42890(pathM42854);
                        }
                        if (zM428813) {
                            m42878(r14.f57590);
                        }
                    }
                }
            } else if (c5149 instanceof C7825) {
                r14 = (C7825) c5149;
                m42868(this.f57191, r14);
                if (m42896() && m42893() && this.f57191.f26152) {
                    Matrix matrix9 = r14.f57156;
                    if (matrix9 != null) {
                        this.f57197.concat(matrix9);
                    }
                    C0769 c07622 = r14.f24225;
                    float fM2938 = c07622 == null ? 0.0f : c07622.m2932(this);
                    C0769 c07623 = r14.f24223;
                    float fM2939 = c07623 == null ? 0.0f : c07623.m2933(this);
                    C0769 c07624 = r14.f24226;
                    float fM29310 = c07624 == null ? 0.0f : c07624.m2932(this);
                    C0769 c07625 = r14.f24224;
                    fM2933 = c07625 != null ? c07625.m2933(this) : 0.0f;
                    if (r14.f57590 == null) {
                        r14.f57590 = new C16997(Math.min(fM2938, fM29310), Math.min(fM2939, fM2933), Math.abs(fM29310 - fM2938), Math.abs(fM2933 - fM2939));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fM2938, fM2939);
                    path2.lineTo(fM29310, fM2933);
                    m42894(r14);
                    m42880(r14);
                    m42891(r14, r14.f57590);
                    boolean zM428814 = m42885();
                    m42890(path2);
                    m42879(r14);
                    if (zM428814) {
                        m42878(r14.f57590);
                    }
                }
            } else if (c5149 instanceof C5709) {
                r14 = (C5709) c5149;
                m42868(this.f57191, r14);
                if (m42896() && m42893()) {
                    C8552 c8557 = this.f57191;
                    if (c8557.f26152 || c8557.f26150) {
                        Matrix matrix10 = r14.f57156;
                        if (matrix10 != null) {
                            this.f57197.concat(matrix10);
                        }
                        if (r14.f30025.length >= 2) {
                            Path pathM42852 = m42852((C9943) r14);
                            m42894(r14);
                            m42880(r14);
                            m42891(r14, r14.f57590);
                            boolean zM428815 = m42885();
                            if (this.f57191.f26150) {
                                m42881(r14, pathM42852);
                            }
                            if (this.f57191.f26152) {
                                m42890(pathM42852);
                            }
                            m42879(r14);
                            if (zM428815) {
                                m42878(r14.f57590);
                            }
                        }
                    }
                }
            } else if (c5149 instanceof C9943) {
                r14 = (C9943) c5149;
                m42868(this.f57191, r14);
                if (m42896() && m42893()) {
                    C8552 c8558 = this.f57191;
                    if (c8558.f26152 || c8558.f26150) {
                        Matrix matrix11 = r14.f57156;
                        if (matrix11 != null) {
                            this.f57197.concat(matrix11);
                        }
                        if (r14.f30025.length >= 2) {
                            Path pathM42855 = m42852((C9943) r14);
                            m42894(r14);
                            EnumC7120 enumC7121 = this.f57191.f26151.f66586;
                            pathM42855.setFillType((enumC7121 == null || enumC7121 != EnumC7120.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            m42880(r14);
                            m42891(r14, r14.f57590);
                            boolean zM428816 = m42885();
                            if (this.f57191.f26150) {
                                m42881(r14, pathM42855);
                            }
                            if (this.f57191.f26152) {
                                m42890(pathM42855);
                            }
                            m42879(r14);
                            if (zM428816) {
                                m42878(r14.f57590);
                            }
                        }
                    }
                }
            } else if (c5149 instanceof C12909) {
                r14 = (C12909) c5149;
                m42868(this.f57191, r14);
                if (m42896()) {
                    Matrix matrix12 = r14.f38734;
                    if (matrix12 != null) {
                        this.f57197.concat(matrix12);
                    }
                    ArrayList arrayList = r14.f34358;
                    float fM29311 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C0769) r14.f34358.get(0)).m2932(this);
                    ArrayList arrayList2 = r14.f34355;
                    float fM29312 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C0769) r14.f34355.get(0)).m2933(this);
                    ArrayList arrayList3 = r14.f34356;
                    float fM29313 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C0769) r14.f34356.get(0)).m2932(this);
                    ArrayList arrayList4 = r14.f34357;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fM2933 = ((C0769) r14.f34357.get(0)).m2933(this);
                    }
                    EnumC17143 enumC17143M42892 = m42892();
                    if (enumC17143M42892 != EnumC17143.Start) {
                        float fM42847 = m42847(r14);
                        if (enumC17143M42892 == EnumC17143.Middle) {
                            fM42847 /= 2.0f;
                        }
                        fM29311 -= fM42847;
                    }
                    if (r14.f57590 == null) {
                        C15606 c15606 = new C15606(this, fM29311, fM29312);
                        m42873(r14, c15606);
                        RectF rectF2 = c15606.f48068;
                        r14.f57590 = new C16997(rectF2.left, rectF2.top, rectF2.width(), c15606.f48068.height());
                    }
                    m42894(r14);
                    m42880(r14);
                    m42891(r14, r14.f57590);
                    boolean zM428817 = m42885();
                    m42873(r14, new C20547(this, fM29311 + fM29313, fM29312 + fM2933));
                    if (zM428817) {
                        m42878(r14.f57590);
                    }
                }
            }
        }
        m42897();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42877(AbstractC15731 abstractC15731, boolean z) {
        if (z) {
            m42865((InterfaceC3738) abstractC15731);
        }
        Iterator it = abstractC15731.f48531.iterator();
        while (it.hasNext()) {
            m42866((C5149) it.next());
        }
        if (z) {
            this.f57192.pop();
            this.f57199.pop();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m42887() {
        this.f57197.save();
        this.f57195.push(this.f57191);
        this.f57191 = new C8552(this.f57191);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42897() {
        this.f57197.restore();
        this.f57191 = (C8552) this.f57195.pop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42865(InterfaceC3738 interfaceC3738) {
        this.f57192.push(interfaceC3738);
        Canvas canvas = this.f57197;
        Matrix matrix = this.f57193;
        canvas.getMatrix(matrix);
        Matrix matrix2 = new Matrix();
        Stack stack = this.f57199;
        if (!matrix.invert(matrix2)) {
            matrix2 = null;
        }
        stack.push(matrix2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42868(C8552 c8552, AbstractC19261 abstractC19261) {
        boolean z = abstractC19261.f16091 == null;
        C20672 c20672 = c8552.f26151;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c20672.f66596 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c20672.f66614 = bool;
        c20672.f66609 = null;
        c20672.f66611 = null;
        c20672.f66598 = fValueOf;
        c20672.f66590 = C20526.f66138;
        c20672.f66600 = fValueOf;
        c20672.f66602 = null;
        c20672.f66587 = null;
        c20672.f66608 = fValueOf;
        c20672.f66607 = null;
        c20672.f66584 = fValueOf;
        c20672.f66612 = EnumC6560.None;
        C20672 c20673 = abstractC19261.f60632;
        if (c20673 != null) {
            m42869(c8552, c20673);
        }
        if (this.f57200.m38407()) {
            for (C13322 c13322 : (ArrayList) this.f57200.m38397()) {
                if (C23200.m51492(c13322.f39872, abstractC19261)) {
                    m42869(c8552, c13322.f39874);
                }
            }
        }
        C20672 c20674 = abstractC19261.f60635;
        if (c20674 != null) {
            m42869(c8552, c20674);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020b A[LOOP:3: B:104:0x0205->B:106:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42881(AbstractC18555 abstractC18555, Path path) {
        float fM2932;
        float fM2933;
        float fM2934;
        float fM2935;
        Canvas canvas;
        C16291 c16291;
        Iterator it;
        AbstractC0915 abstractC0915 = this.f57191.f26151.f66595;
        boolean z = abstractC0915 instanceof C19821;
        Canvas canvas2 = this.f57197;
        if (z) {
            AbstractC19261 abstractC19261M38398 = this.f57200.m38398(((C19821) abstractC0915).f64053);
            if (abstractC19261M38398 instanceof C12059) {
                C12059 c12059 = (C12059) abstractC19261M38398;
                Boolean bool = c12059.f36072;
                boolean z2 = bool != null && bool.booleanValue();
                String str = c12059.f36069;
                if (str != null) {
                    m42874(c12059, str);
                }
                if (z2) {
                    C0769 c0769 = c12059.f36075;
                    fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
                    C0769 c07610 = c12059.f36076;
                    fM2934 = c07610 != null ? c07610.m2933(this) : 0.0f;
                    C0769 c07611 = c12059.f36073;
                    fM2935 = c07611 != null ? c07611.m2932(this) : 0.0f;
                    C0769 c07612 = c12059.f36074;
                    fM2933 = c07612 != null ? c07612.m2933(this) : 0.0f;
                } else {
                    C0769 c07613 = c12059.f36075;
                    float fM2930 = c07613 != null ? c07613.m2930(this, 1.0f) : 0.0f;
                    C0769 c07614 = c12059.f36076;
                    float fM2931 = c07614 != null ? c07614.m2930(this, 1.0f) : 0.0f;
                    C0769 c07615 = c12059.f36073;
                    float fM2936 = c07615 != null ? c07615.m2930(this, 1.0f) : 0.0f;
                    C0769 c07616 = c12059.f36074;
                    float fM2937 = c07616 != null ? c07616.m2930(this, 1.0f) : 0.0f;
                    C16997 c16997 = abstractC18555.f57590;
                    float f = c16997.f52132;
                    float f2 = c16997.f52134;
                    fM2932 = (fM2930 * f2) + f;
                    float f3 = c16997.f52133;
                    float f4 = c16997.f52131;
                    float f5 = fM2936 * f2;
                    fM2933 = fM2937 * f4;
                    fM2934 = (fM2931 * f4) + f3;
                    fM2935 = f5;
                }
                if (fM2935 == 0.0f || fM2933 == 0.0f) {
                    return;
                }
                C16291 c16292 = c12059.f24627;
                if (c16292 == null) {
                    c16292 = C16291.f50083;
                }
                m42887();
                canvas2.clipPath(path);
                C8552 c8552 = new C8552();
                m42869(c8552, C20672.m47291());
                c8552.f26151.f66614 = Boolean.FALSE;
                m42867(c12059, c8552);
                this.f57191 = c8552;
                C16997 c16998 = abstractC18555.f57590;
                Matrix matrix = c12059.f36070;
                if (matrix != null) {
                    canvas2.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c12059.f36070.invert(matrix2)) {
                        C16997 c16999 = abstractC18555.f57590;
                        float f6 = c16999.f52132;
                        float f7 = c16999.f52133;
                        float fM39856 = c16999.m39856();
                        C16997 c169910 = abstractC18555.f57590;
                        float f8 = c169910.f52133;
                        float fM39857 = c169910.m39856();
                        float fM39858 = abstractC18555.f57590.m39857();
                        C16997 c169911 = abstractC18555.f57590;
                        float[] fArr = {f6, f7, fM39856, f8, fM39857, fM39858, c169911.f52132, c169911.m39857()};
                        matrix2.mapPoints(fArr);
                        float f9 = fArr[0];
                        float f10 = fArr[1];
                        RectF rectF = new RectF(f9, f10, f9, f10);
                        for (int i = 2; i <= 6; i += 2) {
                            float f11 = fArr[i];
                            if (f11 < rectF.left) {
                                rectF.left = f11;
                            }
                            if (f11 > rectF.right) {
                                rectF.right = f11;
                            }
                            float f12 = fArr[i + 1];
                            if (f12 < rectF.top) {
                                rectF.top = f12;
                            }
                            if (f12 > rectF.bottom) {
                                rectF.bottom = f12;
                            }
                        }
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        c16998 = new C16997(f13, f14, rectF.right - f13, rectF.bottom - f14);
                    }
                }
                float fFloor = (((float) Math.floor((c16998.f52132 - fM2932) / fM2935)) * fM2935) + fM2932;
                float fM39859 = c16998.m39856();
                float fM398510 = c16998.m39857();
                C16997 c169912 = new C16997(0.0f, 0.0f, fM2935, fM2933);
                boolean zM42885 = m42885();
                for (float fFloor2 = (((float) Math.floor((c16998.f52133 - fM2934) / fM2933)) * fM2933) + fM2934; fFloor2 < fM398510; fFloor2 += fM2933) {
                    float f15 = fFloor;
                    while (f15 < fM39859) {
                        c169912.f52132 = f15;
                        c169912.f52133 = fFloor2;
                        m42887();
                        if (!this.f57191.f26151.f66614.booleanValue()) {
                            m42862(c169912.f52132, c169912.f52133, c169912.f52134, c169912.f52131);
                        }
                        C16997 c169913 = c12059.f68869;
                        if (c169913 != null) {
                            c16291 = c16292;
                            canvas = canvas2;
                            canvas.concat(m42851(c169912, c169913, c16291));
                        } else {
                            canvas = canvas2;
                            c16291 = c16292;
                            Boolean bool2 = c12059.f36071;
                            boolean z3 = bool2 == null || bool2.booleanValue();
                            canvas.translate(f15, fFloor2);
                            if (!z3) {
                                C16997 c169914 = abstractC18555.f57590;
                                canvas.scale(c169914.f52134, c169914.f52131);
                            }
                            it = c12059.f48531.iterator();
                            while (it.hasNext()) {
                                m42866((C5149) it.next());
                            }
                            m42897();
                            f15 += fM2935;
                            c16292 = c16291;
                            canvas2 = canvas;
                        }
                        it = c12059.f48531.iterator();
                        while (it.hasNext()) {
                            m42866((C5149) it.next());
                        }
                        m42897();
                        f15 += fM2935;
                        c16292 = c16291;
                        canvas2 = canvas;
                    }
                }
                if (zM42885) {
                    m42878(c12059.f57590);
                }
                m42897();
                return;
            }
        }
        canvas2.drawPath(path, this.f57191.f26148);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42890(Path path) {
        C8552 c8552 = this.f57191;
        EnumC6560 enumC6560 = c8552.f26151.f66612;
        EnumC6560 enumC6561 = EnumC6560.NonScalingStroke;
        Canvas canvas = this.f57197;
        if (enumC6560 == enumC6561) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = this.f57191.f26153.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, this.f57191.f26153);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, c8552.f26153);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42871(C9383 c9383, C16997 c16997, C16997 c16998, C16291 c16291) {
        if (c16997.f52134 == 0.0f || c16997.f52131 == 0.0f) {
            return;
        }
        if (c16291 == null && (c16291 = c9383.f24627) == null) {
            c16291 = C16291.f50083;
        }
        m42868(this.f57191, c9383);
        if (m42896()) {
            C8552 c8552 = this.f57191;
            c8552.f26149 = c16997;
            if (!c8552.f26151.f66614.booleanValue()) {
                C16997 c16999 = this.f57191.f26149;
                m42862(c16999.f52132, c16999.f52133, c16999.f52134, c16999.f52131);
            }
            m42891(c9383, this.f57191.f26149);
            Canvas canvas = this.f57197;
            if (c16998 != null) {
                canvas.concat(m42851(this.f57191.f26149, c16998, c16291));
                this.f57191.f26155 = c9383.f68869;
            } else {
                C16997 c169910 = this.f57191.f26149;
                canvas.translate(c169910.f52132, c169910.f52133);
            }
            boolean zM42885 = m42885();
            m42886();
            m42877((AbstractC15731) c9383, true);
            if (zM42885) {
                m42878(c9383.f57590);
            }
            m42894(c9383);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16997 m42861(C0769 c0769, C0769 c07610, C0769 c07611, C0769 c07612) {
        float fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        float fM2933 = c07610 != null ? c07610.m2933(this) : 0.0f;
        C16997 c16997M42902 = m42902();
        return new C16997(fM2932, fM2933, c07611 != null ? c07611.m2932(this) : c16997M42902.f52134, c07612 != null ? c07612.m2933(this) : c16997M42902.f52131);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42894(AbstractC18555 abstractC18555) {
        Matrix matrix;
        if (abstractC18555.f16091 == null || abstractC18555.f57590 == null || (matrix = (Matrix) this.f57199.peek()) == null) {
            return;
        }
        Matrix matrix2 = this.f57196;
        matrix2.set(matrix);
        Canvas canvas = this.f57197;
        Matrix matrix3 = this.f57193;
        canvas.getMatrix(matrix3);
        matrix2.preConcat(matrix3);
        C16997 c16997 = abstractC18555.f57590;
        float f = c16997.f52132;
        float[] fArr = this.f57198;
        fArr[6] = f;
        fArr[0] = f;
        float f2 = c16997.f52133;
        fArr[3] = f2;
        fArr[1] = f2;
        float fM39856 = c16997.m39856();
        fArr[4] = fM39856;
        fArr[2] = fM39856;
        float fM39857 = abstractC18555.f57590.m39857();
        fArr[7] = fM39857;
        fArr[5] = fM39857;
        matrix2.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = f4;
        float f6 = f3;
        for (int i = 2; i <= 6; i += 2) {
            float f7 = fArr[i];
            if (f7 < f3) {
                f3 = f7;
            }
            if (f7 > f6) {
                f6 = f7;
            }
            float f8 = fArr[i + 1];
            if (f8 < f4) {
                f4 = f8;
            }
            if (f8 > f5) {
                f5 = f8;
            }
        }
        AbstractC18555 abstractC18556 = (AbstractC18555) this.f57192.peek();
        C16997 c16998 = abstractC18556.f57590;
        if (c16998 == null) {
            abstractC18556.f57590 = new C16997(f3, f4, f6 - f3, f5 - f4);
            return;
        }
        C16997 c16999 = this.f57189;
        c16999.f52132 = f3;
        c16999.f52133 = f4;
        c16999.f52134 = f6 - f3;
        c16999.f52131 = f5 - f4;
        c16998.getClass();
        float f9 = c16999.f52132;
        if (f9 < c16998.f52132) {
            c16998.f52132 = f9;
        }
        float f10 = c16999.f52133;
        if (f10 < c16998.f52133) {
            c16998.f52133 = f10;
        }
        if (c16999.m39856() > c16998.m39856()) {
            c16998.f52134 = c16999.m39856() - c16998.f52132;
        }
        if (c16999.m39857() > c16998.m39857()) {
            c16998.f52131 = c16999.m39857() - c16998.f52133;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42878(C16997 c16997) {
        if (this.f57191.f26151.f66602 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f57197;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C21232 c21232 = (C21232) this.f57200.m38398(this.f57191.f26151.f66602);
            m42882(c21232, c16997);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m42882(c21232, c16997);
            canvas.restore();
            canvas.restore();
        }
        m42897();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m42885() {
        AbstractC19261 abstractC19261M38398;
        if (this.f57191.f26151.f66598.floatValue() >= 1.0f && this.f57191.f26151.f66602 == null) {
            return false;
        }
        this.f57197.saveLayerAlpha(null, m42848(this.f57191.f26151.f66598.floatValue()), 31);
        this.f57195.push(this.f57191);
        C8552 c8552 = new C8552(this.f57191);
        this.f57191 = c8552;
        String str = c8552.f26151.f66602;
        if (str != null && ((abstractC19261M38398 = this.f57200.m38398(str)) == null || !(abstractC19261M38398 instanceof C21232))) {
            C20672 c20672 = this.f57191.f26151;
            String str2 = c20672.f66602;
            c20672.f66602 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16997 m42860(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C16997(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private EnumC17143 m42892() {
        EnumC17143 enumC17143;
        C20672 c20672 = this.f57191.f26151;
        if (c20672.f66580 == EnumC23493.LTR || (enumC17143 = c20672.f66599) == EnumC17143.Middle) {
            return c20672.f66599;
        }
        EnumC17143 enumC17144 = EnumC17143.Start;
        return enumC17143 == enumC17144 ? EnumC17143.End : enumC17144;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42873(AbstractC10088 abstractC10088, AbstractC2202 abstractC2202) {
        float f;
        float fM2933;
        float fM2932;
        EnumC17143 enumC17143M42892;
        AbstractC19261 abstractC19261M38398;
        if (m42896()) {
            Iterator it = abstractC10088.f48531.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C5149 c5149 = (C5149) it.next();
                if (c5149 instanceof C13614) {
                    abstractC2202.mo7287(m42858(((C13614) c5149).f40613, z, !it.hasNext()));
                } else if (abstractC2202.mo7288((AbstractC10088) c5149)) {
                    float fM2934 = 0.0f;
                    if (c5149 instanceof C5854) {
                        m42887();
                        C5854 c5854 = (C5854) c5149;
                        m42868(this.f57191, c5854);
                        if (m42896() && m42893() && (abstractC19261M38398 = c5854.f16090.m38398(c5854.f17955)) != null) {
                            C4298 c4298 = (C4298) abstractC19261M38398;
                            Path path = new C23368(c4298.f13865).f75064;
                            Matrix matrix = c4298.f57156;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            C0769 c0769 = c5854.f17956;
                            fM2934 = c0769 != null ? c0769.m2930(this, pathMeasure.getLength()) : 0.0f;
                            EnumC17143 enumC17143M42893 = m42892();
                            if (enumC17143M42893 != EnumC17143.Start) {
                                float fM42847 = m42847((AbstractC10088) c5854);
                                if (enumC17143M42893 == EnumC17143.Middle) {
                                    fM42847 /= 2.0f;
                                }
                                fM2934 -= fM42847;
                            }
                            m42880((AbstractC18555) c5854.mo9283());
                            boolean zM42885 = m42885();
                            m42873(c5854, new C6435(this, path, fM2934));
                            if (zM42885) {
                                m42878(c5854.f57590);
                            }
                        }
                        m42897();
                    } else if (c5149 instanceof C3032) {
                        m42887();
                        C3032 c3032 = (C3032) c5149;
                        m42868(this.f57191, c3032);
                        if (m42896()) {
                            ArrayList arrayList = c3032.f34358;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC2202 instanceof C20547;
                            if (z3) {
                                float fM2935 = !z2 ? ((C20547) abstractC2202).f66196 : ((C0769) c3032.f34358.get(0)).m2932(this);
                                ArrayList arrayList2 = c3032.f34355;
                                fM2933 = (arrayList2 == null || arrayList2.size() == 0) ? ((C20547) abstractC2202).f66197 : ((C0769) c3032.f34355.get(0)).m2933(this);
                                ArrayList arrayList3 = c3032.f34356;
                                fM2932 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C0769) c3032.f34356.get(0)).m2932(this);
                                ArrayList arrayList4 = c3032.f34357;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fM2934 = ((C0769) c3032.f34357.get(0)).m2933(this);
                                }
                                f = fM2934;
                                fM2934 = fM2935;
                            } else {
                                f = 0.0f;
                                fM2933 = 0.0f;
                                fM2932 = 0.0f;
                            }
                            if (z2 && (enumC17143M42892 = m42892()) != EnumC17143.Start) {
                                float fM42848 = m42847((AbstractC10088) c3032);
                                if (enumC17143M42892 == EnumC17143.Middle) {
                                    fM42848 /= 2.0f;
                                }
                                fM2934 -= fM42848;
                            }
                            m42880((AbstractC18555) c3032.mo9283());
                            if (z3) {
                                C20547 c20547 = (C20547) abstractC2202;
                                c20547.f66196 = fM2934 + fM2932;
                                c20547.f66197 = fM2933 + f;
                            }
                            boolean zM42886 = m42885();
                            m42873(c3032, abstractC2202);
                            if (zM42886) {
                                m42878(c3032.f57590);
                            }
                        }
                        m42897();
                    } else if (c5149 instanceof C4443) {
                        m42887();
                        C4443 c4443 = (C4443) c5149;
                        m42868(this.f57191, c4443);
                        if (m42896()) {
                            m42880((AbstractC18555) c4443.mo9283());
                            AbstractC19261 abstractC19261M38399 = c5149.f16090.m38398(c4443.f14194);
                            if (abstractC19261M38399 != null && (abstractC19261M38399 instanceof AbstractC10088)) {
                                StringBuilder sb = new StringBuilder();
                                m42872((AbstractC10088) abstractC19261M38399, sb);
                                if (sb.length() > 0) {
                                    abstractC2202.mo7287(sb.toString());
                                }
                            }
                        }
                        m42897();
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m42847(AbstractC10088 abstractC10088) {
        C3613 c3613 = new C3613(this);
        m42873(abstractC10088, c3613);
        return c3613.f11456;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42872(AbstractC10088 abstractC10088, StringBuilder sb) {
        Iterator it = abstractC10088.f48531.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C5149 c5149 = (C5149) it.next();
            if (c5149 instanceof AbstractC10088) {
                m42872((AbstractC10088) c5149, sb);
            } else if (c5149 instanceof C13614) {
                sb.append(m42858(((C13614) c5149).f40613, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m42858(String str, boolean z, boolean z2) {
        if (this.f57191.f26154) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m42896() {
        Boolean bool = this.f57191.f26151.f66596;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean m42893() {
        Boolean bool = this.f57191.f26151.f66581;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r11 != 8) goto L37;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix m42851(C16997 c16997, C16997 c16998, C16291 c16291) {
        int i;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (c16291 != null && c16291.m38310() != null) {
            float f3 = c16997.f52134 / c16998.f52134;
            float f4 = c16997.f52131 / c16998.f52131;
            float f5 = -c16998.f52132;
            float f6 = -c16998.f52133;
            if (c16291.equals(C16291.f50084)) {
                matrix.preTranslate(c16997.f52132, c16997.f52133);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float fMax = c16291.m38311() == EnumC10648.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = c16997.f52134 / fMax;
            float f8 = c16997.f52131 / fMax;
            int[] iArr = C17724.f54216;
            switch (iArr[c16291.m38310().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (c16998.f52134 - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = c16998.f52134 - f7;
                    break;
                default:
                    i = iArr[c16291.m38310().ordinal()];
                    if (i == 2) {
                        f = (c16998.f52131 - f8) / 2.0f;
                        f6 -= f;
                    } else {
                        if (i != 3) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                    }
                                }
                            }
                            f = (c16998.f52131 - f8) / 2.0f;
                            f6 -= f;
                        }
                        f = c16998.f52131 - f8;
                        f6 -= f;
                    }
                    matrix.preTranslate(c16997.f52132, c16997.f52133);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f5, f6);
                    break;
            }
            f5 -= f2;
            i = iArr[c16291.m38310().ordinal()];
            if (i == 2) {
                f = (c16998.f52131 - f8) / 2.0f;
                f6 -= f;
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f = (c16998.f52131 - f8) / 2.0f;
                    f6 -= f;
                }
                f = c16998.f52131 - f8;
                f6 -= f;
            }
            matrix.preTranslate(c16997.f52132, c16997.f52133);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42884(C20672 c20672, long j) {
        return (j & c20672.f66591) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42869(C8552 c8552, C20672 c20672) {
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c8552.f26151.f66583 = c20672.f66583;
        }
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c8552.f26151.f66598 = c20672.f66598;
        }
        boolean zM42884 = m42884(c20672, 1L);
        C20526 c20526 = C20526.f66137;
        if (zM42884) {
            c8552.f26151.f66595 = c20672.f66595;
            AbstractC0915 abstractC0915 = c20672.f66595;
            c8552.f26150 = (abstractC0915 == null || abstractC0915 == c20526) ? false : true;
        }
        if (m42884(c20672, 4L)) {
            c8552.f26151.f66592 = c20672.f66592;
        }
        if (m42884(c20672, 6149L)) {
            m42870(c8552, true, c8552.f26151.f66595);
        }
        if (m42884(c20672, 2L)) {
            c8552.f26151.f66586 = c20672.f66586;
        }
        if (m42884(c20672, 8L)) {
            c8552.f26151.f66579 = c20672.f66579;
            AbstractC0915 abstractC0916 = c20672.f66579;
            c8552.f26152 = (abstractC0916 == null || abstractC0916 == c20526) ? false : true;
        }
        if (m42884(c20672, 16L)) {
            c8552.f26151.f66577 = c20672.f66577;
        }
        if (m42884(c20672, 6168L)) {
            m42870(c8552, false, c8552.f26151.f66579);
        }
        if (m42884(c20672, 34359738368L)) {
            c8552.f26151.f66612 = c20672.f66612;
        }
        if (m42884(c20672, 32L)) {
            C20672 c20673 = c8552.f26151;
            C0769 c0769 = c20672.f66589;
            c20673.f66589 = c0769;
            c8552.f26153.setStrokeWidth(c0769.m2929(this));
        }
        if (m42884(c20672, 64L)) {
            C20672 c20674 = c8552.f26151;
            Paint paint = c8552.f26153;
            c20674.f66605 = c20672.f66605;
            int i = C17724.f54217[c20672.f66605.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m42884(c20672, 128L)) {
            C20672 c20675 = c8552.f26151;
            Paint paint2 = c8552.f26153;
            c20675.f66576 = c20672.f66576;
            int i2 = C17724.f54218[c20672.f66576.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m42884(c20672, 256L)) {
            c8552.f26151.f66585 = c20672.f66585;
            c8552.f26153.setStrokeMiter(c20672.f66585.floatValue());
        }
        if (m42884(c20672, 512L)) {
            c8552.f26151.f66582 = c20672.f66582;
        }
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)) {
            c8552.f26151.f66604 = c20672.f66604;
        }
        Typeface typefaceM42857 = null;
        if (m42884(c20672, 1536L)) {
            C20672 c20676 = c8552.f26151;
            Paint paint3 = c8552.f26153;
            C0769[] c0769Arr = c20676.f66582;
            if (c0769Arr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c0769Arr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fM2929 = c20676.f66582[i4 % length].m2929(this);
                    fArr[i4] = fM2929;
                    f += fM2929;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fM29210 = c20676.f66604.m2929(this);
                    if (fM29210 < 0.0f) {
                        fM29210 = (fM29210 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fM29210));
                }
            }
        }
        if (m42884(c20672, 16384L)) {
            float fM42899 = m42899();
            c8552.f26151.f66613 = c20672.f66613;
            c8552.f26148.setTextSize(c20672.f66613.m2930(this, fM42899));
            c8552.f26153.setTextSize(c20672.f66613.m2930(this, fM42899));
        }
        if (m42884(c20672, 8192L)) {
            c8552.f26151.f66594 = c20672.f66594;
        }
        if (m42884(c20672, X931RNG.BLOCK64_RESEED_MAX)) {
            if (c20672.f66588.intValue() == -1 && c8552.f26151.f66588.intValue() > 100) {
                C20672 c20677 = c8552.f26151;
                c20677.f66588 = Integer.valueOf(c20677.f66588.intValue() - 100);
            } else if (c20672.f66588.intValue() == 1 && c8552.f26151.f66588.intValue() < 900) {
                C20672 c20678 = c8552.f26151;
                c20678.f66588 = Integer.valueOf(c20678.f66588.intValue() + 100);
            } else {
                c8552.f26151.f66588 = c20672.f66588;
            }
        }
        if (m42884(c20672, 65536L)) {
            c8552.f26151.f66597 = c20672.f66597;
        }
        if (m42884(c20672, 106496L)) {
            C20672 c20679 = c8552.f26151;
            ArrayList arrayList = c20679.f66594;
            if (arrayList != null && this.f57200 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceM42857 = m42857((String) it.next(), c20679.f66588, c20679.f66597)) == null) {
                }
            }
            if (typefaceM42857 == null) {
                typefaceM42857 = m42857("serif", c20679.f66588, c20679.f66597);
            }
            c8552.f26148.setTypeface(typefaceM42857);
            c8552.f26153.setTypeface(typefaceM42857);
        }
        if (m42884(c20672, 131072L)) {
            C20672 c206710 = c8552.f26151;
            Paint paint4 = c8552.f26153;
            Paint paint5 = c8552.f26148;
            c206710.f66610 = c20672.f66610;
            EnumC14320 enumC14320 = c20672.f66610;
            EnumC14320 enumC14321 = EnumC14320.LineThrough;
            paint5.setStrikeThruText(enumC14320 == enumC14321);
            EnumC14320 enumC14322 = c20672.f66610;
            EnumC14320 enumC14323 = EnumC14320.Underline;
            paint5.setUnderlineText(enumC14322 == enumC14323);
            paint4.setStrikeThruText(c20672.f66610 == enumC14321);
            paint4.setUnderlineText(c20672.f66610 == enumC14323);
        }
        if (m42884(c20672, 68719476736L)) {
            c8552.f26151.f66580 = c20672.f66580;
        }
        if (m42884(c20672, 262144L)) {
            c8552.f26151.f66599 = c20672.f66599;
        }
        if (m42884(c20672, 524288L)) {
            c8552.f26151.f66614 = c20672.f66614;
        }
        if (m42884(c20672, 2097152L)) {
            c8552.f26151.f66603 = c20672.f66603;
        }
        if (m42884(c20672, 4194304L)) {
            c8552.f26151.f66601 = c20672.f66601;
        }
        if (m42884(c20672, X931RNG.BLOCK128_RESEED_MAX)) {
            c8552.f26151.f66593 = c20672.f66593;
        }
        if (m42884(c20672, 16777216L)) {
            c8552.f26151.f66596 = c20672.f66596;
        }
        if (m42884(c20672, 33554432L)) {
            c8552.f26151.f66581 = c20672.f66581;
        }
        if (m42884(c20672, 1048576L)) {
            c8552.f26151.f66609 = c20672.f66609;
        }
        if (m42884(c20672, 268435456L)) {
            c8552.f26151.f66611 = c20672.f66611;
        }
        if (m42884(c20672, 536870912L)) {
            c8552.f26151.f66606 = c20672.f66606;
        }
        if (m42884(c20672, 1073741824L)) {
            c8552.f26151.f66602 = c20672.f66602;
        }
        if (m42884(c20672, 67108864L)) {
            c8552.f26151.f66590 = c20672.f66590;
        }
        if (m42884(c20672, 134217728L)) {
            c8552.f26151.f66600 = c20672.f66600;
        }
        if (m42884(c20672, 8589934592L)) {
            c8552.f26151.f66607 = c20672.f66607;
        }
        if (m42884(c20672, 17179869184L)) {
            c8552.f26151.f66584 = c20672.f66584;
        }
        if (m42884(c20672, 137438953472L)) {
            c8552.f26151.f66578 = c20672.f66578;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42870(C8552 c8552, boolean z, AbstractC0915 abstractC0915) {
        int i;
        C20672 c20672 = c8552.f26151;
        float fFloatValue = (z ? c20672.f66592 : c20672.f66577).floatValue();
        if (abstractC0915 instanceof C20526) {
            i = ((C20526) abstractC0915).f66139;
        } else if (!(abstractC0915 instanceof C9237)) {
            return;
        } else {
            i = c8552.f26151.f66583.f66139;
        }
        int iM42849 = m42849(fFloatValue, i);
        if (z) {
            c8552.f26148.setColor(iM42849);
        } else {
            c8552.f26153.setColor(iM42849);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m42857(String str, Integer num, EnumC1621 enumC1621) {
        int i;
        boolean z = enumC1621 == EnumC1621.Italic;
        if (num.intValue() > 500) {
            i = z ? 3 : 1;
        } else {
            i = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "serif":
                return Typeface.create(Typeface.SERIF, i);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42849(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42862(float f, float f2, float f3, float f4) {
        float fM2932 = f3 + f;
        float fM2933 = f4 + f2;
        C14174 c14174 = this.f57191.f26151.f66609;
        if (c14174 != null) {
            f += c14174.f42805.m2932(this);
            f2 += this.f57191.f26151.f66609.f42807.m2933(this);
            fM2932 -= this.f57191.f26151.f66609.f42806.m2932(this);
            fM2933 -= this.f57191.f26151.f66609.f42804.m2933(this);
        }
        this.f57197.clipRect(f, f2, fM2932, fM2933);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m42886() {
        int iM42849;
        C20672 c20672 = this.f57191.f26151;
        AbstractC0915 abstractC0915 = c20672.f66607;
        if (abstractC0915 instanceof C20526) {
            iM42849 = ((C20526) abstractC0915).f66139;
        } else if (!(abstractC0915 instanceof C9237)) {
            return;
        } else {
            iM42849 = c20672.f66583.f66139;
        }
        Float f = c20672.f66584;
        if (f != null) {
            iM42849 = m42849(f.floatValue(), iM42849);
        }
        this.f57197.drawColor(iM42849);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42863(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC12764 interfaceC12764) {
        double dAcos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC12764.mo8828(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (d2 * dCos) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        float f8 = fAbs;
        float f9 = fAbs2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos2 = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = (d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d;
        double d28 = d26 / dSqrt3;
        if (d28 < -1.0d) {
            dAcos = 3.141592653589793d;
        } else {
            dAcos = d28 > 1.0d ? 0.0d : Math.acos(d28);
        }
        double d29 = d27 * dAcos;
        if (!z2 && d29 > 0.0d) {
            d29 -= 6.283185307179586d;
        } else if (z2 && d29 < 0.0d) {
            d29 += 6.283185307179586d;
        }
        double d30 = d29 % 6.283185307179586d;
        double d31 = dAcos2 % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d30) * 2.0d) / 3.141592653589793d);
        double d32 = d30 / ((double) iCeil);
        double d33 = d32 / 2.0d;
        double dSin2 = (Math.sin(d33) * 1.3333333333333333d) / (Math.cos(d33) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            int i4 = iCeil;
            double d34 = (((double) i2) * d32) + d31;
            double dCos2 = Math.cos(d34);
            double dSin3 = Math.sin(d34);
            fArr[i3] = (float) (dCos2 - (dSin2 * dSin3));
            double d35 = d20;
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d36 = d34 + d32;
            double dCos3 = Math.cos(d36);
            double dSin4 = Math.sin(d36);
            fArr[i3 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i3 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            int i5 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i5] = (float) dSin4;
            i2++;
            i = i;
            d31 = d31;
            d32 = d32;
            iCeil = i4;
            dSin2 = dSin2;
            d20 = d35;
        }
        int i6 = i;
        Matrix matrix = new Matrix();
        matrix.postScale(f8, f9);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i6 - 2] = f6;
        fArr[i6 - 1] = f7;
        for (int i7 = 0; i7 < i6; i7 += 6) {
            interfaceC12764.mo8825(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42879(AbstractC18409 abstractC18409) {
        C14880 c14880;
        C14880 c14881;
        C14880 c14882;
        ArrayList arrayList;
        float f;
        float f2;
        ArrayList arrayListM39973;
        int size;
        C20672 c20672 = this.f57191.f26151;
        String str = c20672.f66603;
        if (str == null && c20672.f66601 == null && c20672.f66593 == null) {
            return;
        }
        if (str == null) {
            c14880 = null;
        } else {
            AbstractC19261 abstractC19261M38398 = abstractC18409.f16090.m38398(str);
            if (abstractC19261M38398 != null) {
                c14880 = (C14880) abstractC19261M38398;
            } else {
                String str2 = this.f57191.f26151.f66603;
                c14880 = null;
            }
        }
        String str3 = this.f57191.f26151.f66601;
        if (str3 == null) {
            c14881 = null;
        } else {
            AbstractC19261 abstractC19261M38399 = abstractC18409.f16090.m38398(str3);
            if (abstractC19261M38399 != null) {
                c14881 = (C14880) abstractC19261M38399;
            } else {
                String str4 = this.f57191.f26151.f66601;
                c14881 = null;
            }
        }
        String str5 = this.f57191.f26151.f66593;
        if (str5 == null) {
            c14882 = null;
        } else {
            AbstractC19261 abstractC19261M383910 = abstractC18409.f16090.m38398(str5);
            if (abstractC19261M383910 != null) {
                c14882 = (C14880) abstractC19261M383910;
            } else {
                String str6 = this.f57191.f26151.f66593;
                c14882 = null;
            }
        }
        if (abstractC18409 instanceof C4298) {
            arrayListM39973 = new C17018(this, ((C4298) abstractC18409).f13865).m39973();
        } else {
            if (abstractC18409 instanceof C7825) {
                C7825 c7825 = (C7825) abstractC18409;
                C0769 c0769 = c7825.f24225;
                float fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
                C0769 c07610 = c7825.f24223;
                float fM2933 = c07610 != null ? c07610.m2933(this) : 0.0f;
                C0769 c07611 = c7825.f24226;
                float fM2934 = c07611 != null ? c07611.m2932(this) : 0.0f;
                C0769 c07612 = c7825.f24224;
                float fM2935 = c07612 != null ? c07612.m2933(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f3 = fM2934 - fM2932;
                float f4 = fM2935 - fM2933;
                arrayList.add(new C14195(fM2932, fM2933, f3, f4));
                arrayList.add(new C14195(fM2934, fM2935, f3, f4));
            } else {
                C9943 c9943 = (C9943) abstractC18409;
                int length = c9943.f30025.length;
                if (length < 2) {
                    arrayListM39973 = null;
                } else {
                    arrayList = new ArrayList();
                    float[] fArr = c9943.f30025;
                    C14195 c14195 = new C14195(fArr[0], fArr[1], 0.0f, 0.0f);
                    int i = 2;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    while (true) {
                        f = c14195.f42850;
                        f2 = c14195.f42851;
                        if (i >= length) {
                            break;
                        }
                        float[] fArr2 = c9943.f30025;
                        float f7 = fArr2[i];
                        float f8 = fArr2[i + 1];
                        c14195.m33863(f7, f8);
                        arrayList.add(c14195);
                        c14195 = new C14195(f7, f8, f7 - f2, f8 - f);
                        i += 2;
                        f6 = f8;
                        f5 = f7;
                    }
                    if (c9943 instanceof C5709) {
                        float[] fArr3 = c9943.f30025;
                        float f9 = fArr3[0];
                        if (f5 != f9) {
                            float f10 = fArr3[1];
                            if (f6 != f10) {
                                c14195.m33863(f9, f10);
                                arrayList.add(c14195);
                                C14195 c14196 = new C14195(f9, f10, f9 - f2, f10 - f);
                                c14196.m33864((C14195) arrayList.get(0));
                                arrayList.add(c14196);
                                arrayList.set(0, c14196);
                            }
                        }
                    } else {
                        arrayList.add(c14195);
                    }
                }
            }
            arrayListM39973 = arrayList;
        }
        if (arrayListM39973 == null || (size = arrayListM39973.size()) == 0) {
            return;
        }
        C20672 c20673 = this.f57191.f26151;
        c20673.f66593 = null;
        c20673.f66601 = null;
        c20673.f66603 = null;
        if (c14880 != null) {
            m42875(c14880, (C14195) arrayListM39973.get(0));
        }
        if (c14881 != null && arrayListM39973.size() > 2) {
            int i2 = 1;
            C14195 c14197 = (C14195) arrayListM39973.get(0);
            C14195 c14198 = (C14195) arrayListM39973.get(1);
            while (i2 < size - 1) {
                i2++;
                C14195 c14199 = (C14195) arrayListM39973.get(i2);
                if (c14198.f42849) {
                    float f11 = c14198.f42847;
                    float f12 = c14198.f42848;
                    float f13 = c14198.f42851;
                    float f14 = f13 - c14197.f42851;
                    float f15 = c14198.f42850;
                    float f16 = ((f15 - c14197.f42850) * f12) + (f14 * f11);
                    if (f16 == 0.0f) {
                        f16 = ((c14199.f42851 - f13) * f11) + ((c14199.f42850 - f15) * f12);
                    }
                    if (f16 <= 0.0f && (f16 != 0.0f || (f11 <= 0.0f && f12 < 0.0f))) {
                        c14198.f42847 = -f11;
                        c14198.f42848 = -f12;
                    }
                }
                m42875(c14881, c14198);
                c14197 = c14198;
                c14198 = c14199;
            }
        }
        if (c14882 != null) {
            m42875(c14882, (C14195) arrayListM39973.get(size - 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        if (r8 != 8) goto L67;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m42875(C14880 c14880, C14195 c14195) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        m42887();
        Float f4 = c14880.f45416;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = c14195.f42847;
            if (f6 == 0.0f && c14195.f42848 == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(c14195.f42848, f6));
            }
        } else {
            fFloatValue = c14880.f45416.floatValue();
        }
        float fM2928 = c14880.f45415 ? 1.0f : this.f57191.f26151.f66589.m2928(this.f57190);
        this.f57191 = m42859((AbstractC19261) c14880);
        Matrix matrix = new Matrix();
        matrix.preTranslate(c14195.f42851, c14195.f42850);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fM2928, fM2928);
        C0769 c0769 = c14880.f45418;
        float fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        C0769 c07610 = c14880.f45419;
        float fM2933 = c07610 != null ? c07610.m2933(this) : 0.0f;
        C0769 c07611 = c14880.f45417;
        float fM2934 = c07611 != null ? c07611.m2932(this) : 3.0f;
        C0769 c07612 = c14880.f45420;
        float fM2935 = c07612 != null ? c07612.m2933(this) : 3.0f;
        C16997 c16997 = c14880.f68869;
        Canvas canvas = this.f57197;
        if (c16997 != null) {
            float fMax = fM2934 / c16997.f52134;
            float f7 = fM2935 / c16997.f52131;
            C16291 c16291 = c14880.f24627;
            if (c16291 == null) {
                c16291 = C16291.f50083;
            }
            if (!c16291.equals(C16291.f50084)) {
                fMax = c16291.m38311() == EnumC10648.slice ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fM2932) * fMax, (-fM2933) * f7);
            canvas.concat(matrix);
            C16997 c16998 = c14880.f68869;
            float f8 = c16998.f52134 * fMax;
            float f9 = c16998.f52131 * f7;
            int[] iArr = C17724.f54216;
            switch (iArr[c16291.m38310().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f = (fM2934 - f8) / 2.0f;
                    f2 = 0.0f - f;
                    break;
                case 4:
                case 5:
                case 6:
                    f = fM2934 - f8;
                    f2 = 0.0f - f;
                    break;
                default:
                    f2 = 0.0f;
                    break;
            }
            int i = iArr[c16291.m38310().ordinal()];
            if (i == 2) {
                f3 = (fM2935 - f9) / 2.0f;
                f5 = 0.0f - f3;
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f3 = (fM2935 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                }
                f3 = fM2935 - f9;
                f5 = 0.0f - f3;
            }
            if (!this.f57191.f26151.f66614.booleanValue()) {
                m42862(f2, f5, fM2934, fM2935);
            }
            matrix.reset();
            matrix.preScale(fMax, f7);
            canvas.concat(matrix);
        } else {
            matrix.preTranslate(-fM2932, -fM2933);
            canvas.concat(matrix);
            if (!this.f57191.f26151.f66614.booleanValue()) {
                m42862(0.0f, 0.0f, fM2934, fM2935);
            }
        }
        boolean zM42885 = m42885();
        m42877((AbstractC15731) c14880, false);
        if (zM42885) {
            m42878(c14880.f57590);
        }
        m42897();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8552 m42859(AbstractC19261 abstractC19261) {
        C8552 c8552 = new C8552();
        m42869(c8552, C20672.m47291());
        m42867(abstractC19261, c8552);
        return c8552;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42867(C5149 c5149, C8552 c8552) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c5149 instanceof AbstractC19261) {
                arrayList.add(0, (AbstractC19261) c5149);
            }
            Object obj = c5149.f16091;
            if (obj == null) {
                break;
            } else {
                c5149 = (C5149) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m42868(c8552, (AbstractC19261) it.next());
        }
        C8552 c8553 = this.f57191;
        c8552.f26155 = c8553.f26155;
        c8552.f26149 = c8553.f26149;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42880(AbstractC18555 abstractC18555) {
        AbstractC0915 abstractC0915 = this.f57191.f26151.f66595;
        if (abstractC0915 instanceof C19821) {
            m42883(true, abstractC18555.f57590, (C19821) abstractC0915);
        }
        AbstractC0915 abstractC0916 = this.f57191.f26151.f66579;
        if (abstractC0916 instanceof C19821) {
            m42883(false, abstractC18555.f57590, (C19821) abstractC0916);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42883(boolean z, C16997 c16997, C19821 c19821) {
        float fM2930;
        float fM2931;
        float fM2932;
        float fM2933;
        float f;
        float f2;
        float f3;
        AbstractC19261 abstractC19261M38398 = this.f57200.m38398(c19821.f64053);
        int i = 0;
        int i2 = 0;
        if (abstractC19261M38398 == null) {
            AbstractC0915 abstractC0915 = c19821.f64052;
            if (abstractC0915 != null) {
                m42870(this.f57191, z, abstractC0915);
                return;
            } else if (z) {
                this.f57191.f26150 = false;
                return;
            } else {
                this.f57191.f26152 = false;
                return;
            }
        }
        boolean z2 = abstractC19261M38398 instanceof C0209;
        C20526 c20526 = C20526.f66138;
        float f4 = -1.0f;
        if (z2) {
            C0209 c0209 = (C0209) abstractC19261M38398;
            String str = c0209.f7180;
            if (str != null) {
                m42864(c0209, str);
            }
            Boolean bool = c0209.f7181;
            boolean z3 = bool != null && bool.booleanValue();
            C8552 c8552 = this.f57191;
            Paint paint = z ? c8552.f26148 : c8552.f26153;
            if (z3) {
                C16997 c16997M42902 = m42902();
                C0769 c0769 = c0209.f1454;
                float fM2934 = c0769 != null ? c0769.m2932(this) : 0.0f;
                C0769 c07610 = c0209.f1456;
                float fM2935 = c07610 != null ? c07610.m2933(this) : 0.0f;
                C0769 c07611 = c0209.f1455;
                float fM2936 = c07611 != null ? c07611.m2932(this) : c16997M42902.f52134;
                C0769 c07612 = c0209.f1457;
                f3 = fM2936;
                f = fM2934;
                f2 = fM2935;
                fM2933 = c07612 != null ? c07612.m2933(this) : 0.0f;
            } else {
                C0769 c07613 = c0209.f1454;
                float fM2937 = c07613 != null ? c07613.m2930(this, 1.0f) : 0.0f;
                C0769 c07614 = c0209.f1456;
                float fM2938 = c07614 != null ? c07614.m2930(this, 1.0f) : 0.0f;
                C0769 c07615 = c0209.f1455;
                float fM2939 = c07615 != null ? c07615.m2930(this, 1.0f) : 1.0f;
                C0769 c07616 = c0209.f1457;
                fM2933 = c07616 != null ? c07616.m2930(this, 1.0f) : 0.0f;
                f = fM2937;
                f2 = fM2938;
                f3 = fM2939;
            }
            m42887();
            this.f57191 = m42859((AbstractC19261) c0209);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c16997.f52132, c16997.f52133);
                matrix.preScale(c16997.f52134, c16997.f52131);
            }
            Matrix matrix2 = c0209.f7183;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c0209.f7179.size();
            if (size == 0) {
                m42897();
                if (z) {
                    this.f57191.f26150 = false;
                    return;
                } else {
                    this.f57191.f26152 = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c0209.f7179.iterator();
            while (it.hasNext()) {
                C13469 c13469 = (C13469) ((C5149) it.next());
                Float f5 = c13469.f40209;
                float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
                if (i == 0 || fFloatValue >= f4) {
                    fArr[i] = fFloatValue;
                    f4 = fFloatValue;
                } else {
                    fArr[i] = f4;
                }
                m42887();
                m42868(this.f57191, c13469);
                C20672 c20672 = this.f57191.f26151;
                C20526 c20527 = (C20526) c20672.f66590;
                if (c20527 == null) {
                    c20527 = c20526;
                }
                iArr[i] = m42849(c20672.f66600.floatValue(), c20527.f66139);
                i++;
                m42897();
            }
            if ((f == f3 && f2 == fM2933) || size == 1) {
                m42897();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            EnumC3592 enumC3592 = c0209.f7182;
            if (enumC3592 != null) {
                if (enumC3592 == EnumC3592.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC3592 == EnumC3592.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m42897();
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, fM2933, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m42848(this.f57191.f26151.f66592.floatValue()));
            return;
        }
        if (abstractC19261M38398 instanceof C15025) {
            C15025 c15025 = (C15025) abstractC19261M38398;
            String str2 = c15025.f7180;
            if (str2 != null) {
                m42864(c15025, str2);
            }
            Boolean bool2 = c15025.f7181;
            boolean z4 = bool2 != null && bool2.booleanValue();
            C8552 c8553 = this.f57191;
            Paint paint2 = z ? c8553.f26148 : c8553.f26153;
            if (z4) {
                C0769 c07617 = new C0769(50.0f, EnumC7265.percent);
                C0769 c07618 = c15025.f45799;
                fM2930 = c07618 != null ? c07618.m2932(this) : c07617.m2932(this);
                C0769 c07619 = c15025.f45800;
                fM2931 = c07619 != null ? c07619.m2933(this) : c07617.m2933(this);
                C0769 c07620 = c15025.f45798;
                fM2932 = c07620 != null ? c07620.m2929(this) : c07617.m2929(this);
            } else {
                C0769 c07621 = c15025.f45799;
                fM2930 = c07621 != null ? c07621.m2930(this, 1.0f) : 0.5f;
                C0769 c07622 = c15025.f45800;
                fM2931 = c07622 != null ? c07622.m2930(this, 1.0f) : 0.5f;
                C0769 c07623 = c15025.f45798;
                fM2932 = c07623 != null ? c07623.m2930(this, 1.0f) : 0.5f;
            }
            float f6 = fM2932;
            float f7 = fM2930;
            float f8 = fM2931;
            m42887();
            this.f57191 = m42859((AbstractC19261) c15025);
            Matrix matrix3 = new Matrix();
            if (!z4) {
                matrix3.preTranslate(c16997.f52132, c16997.f52133);
                matrix3.preScale(c16997.f52134, c16997.f52131);
            }
            Matrix matrix4 = c15025.f7183;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c15025.f7179.size();
            if (size2 == 0) {
                m42897();
                if (z) {
                    this.f57191.f26150 = false;
                    return;
                } else {
                    this.f57191.f26152 = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator it2 = c15025.f7179.iterator();
            while (it2.hasNext()) {
                C13469 c134610 = (C13469) ((C5149) it2.next());
                Float f9 = c134610.f40209;
                float fFloatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                if (i2 == 0 || fFloatValue2 >= f4) {
                    fArr2[i2] = fFloatValue2;
                    f4 = fFloatValue2;
                } else {
                    fArr2[i2] = f4;
                }
                m42887();
                m42868(this.f57191, c134610);
                C20672 c20673 = this.f57191.f26151;
                C20526 c20528 = (C20526) c20673.f66590;
                if (c20528 == null) {
                    c20528 = c20526;
                }
                iArr2[i2] = m42849(c20673.f66600.floatValue(), c20528.f66139);
                i2++;
                m42897();
            }
            if (f6 == 0.0f || size2 == 1) {
                m42897();
                paint2.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            EnumC3592 enumC3593 = c15025.f7182;
            if (enumC3593 != null) {
                if (enumC3593 == EnumC3592.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (enumC3593 == EnumC3592.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            m42897();
            RadialGradient radialGradient = new RadialGradient(f7, f8, f6, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint2.setShader(radialGradient);
            paint2.setAlpha(m42848(this.f57191.f26151.f66592.floatValue()));
            return;
        }
        if (abstractC19261M38398 instanceof C22642) {
            C22642 c22642 = (C22642) abstractC19261M38398;
            if (z) {
                if (m42884(c22642.f60632, 2147483648L)) {
                    C8552 c8554 = this.f57191;
                    C20672 c20674 = c8554.f26151;
                    AbstractC0915 abstractC0916 = c22642.f60632.f66587;
                    c20674.f66595 = abstractC0916;
                    c8554.f26150 = abstractC0916 != null;
                }
                if (m42884(c22642.f60632, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                    this.f57191.f26151.f66592 = c22642.f60632.f66608;
                }
                if (m42884(c22642.f60632, 6442450944L)) {
                    C8552 c8555 = this.f57191;
                    m42870(c8555, z, c8555.f26151.f66595);
                    return;
                }
                return;
            }
            if (m42884(c22642.f60632, 2147483648L)) {
                C8552 c8556 = this.f57191;
                C20672 c20675 = c8556.f26151;
                AbstractC0915 abstractC0917 = c22642.f60632.f66587;
                c20675.f66579 = abstractC0917;
                c8556.f26152 = abstractC0917 != null;
            }
            if (m42884(c22642.f60632, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                this.f57191.f26151.f66577 = c22642.f60632.f66608;
            }
            if (m42884(c22642.f60632, 6442450944L)) {
                C8552 c8557 = this.f57191;
                m42870(c8557, z, c8557.f26151.f66579);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42864(AbstractC2181 abstractC2181, String str) {
        AbstractC19261 abstractC19261M38398 = abstractC2181.f16090.m38398(str);
        if (abstractC19261M38398 == null || !(abstractC19261M38398 instanceof AbstractC2181) || abstractC19261M38398 == abstractC2181) {
            return;
        }
        AbstractC2181 abstractC2182 = (AbstractC2181) abstractC19261M38398;
        if (abstractC2181.f7181 == null) {
            abstractC2181.f7181 = abstractC2182.f7181;
        }
        if (abstractC2181.f7183 == null) {
            abstractC2181.f7183 = abstractC2182.f7183;
        }
        if (abstractC2181.f7182 == null) {
            abstractC2181.f7182 = abstractC2182.f7182;
        }
        if (abstractC2181.f7179.isEmpty()) {
            abstractC2181.f7179 = abstractC2182.f7179;
        }
        try {
            if (abstractC2181 instanceof C0209) {
                C0209 c0209 = (C0209) abstractC2181;
                C0209 c02010 = (C0209) abstractC19261M38398;
                if (c0209.f1454 == null) {
                    c0209.f1454 = c02010.f1454;
                }
                if (c0209.f1456 == null) {
                    c0209.f1456 = c02010.f1456;
                }
                if (c0209.f1455 == null) {
                    c0209.f1455 = c02010.f1455;
                }
                if (c0209.f1457 == null) {
                    c0209.f1457 = c02010.f1457;
                }
            } else {
                m42876((C15025) abstractC2181, (C15025) abstractC19261M38398);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC2182.f7180;
        if (str2 != null) {
            m42864(abstractC2181, str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42876(C15025 c15025, C15025 c15026) {
        if (c15025.f45799 == null) {
            c15025.f45799 = c15026.f45799;
        }
        if (c15025.f45800 == null) {
            c15025.f45800 = c15026.f45800;
        }
        if (c15025.f45798 == null) {
            c15025.f45798 = c15026.f45798;
        }
        if (c15025.f45801 == null) {
            c15025.f45801 = c15026.f45801;
        }
        if (c15025.f45802 == null) {
            c15025.f45802 = c15026.f45802;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42891(AbstractC18555 abstractC18555, C16997 c16997) {
        Path pathM42855;
        if (this.f57191.f26151.f66611 == null || (pathM42855 = m42855(abstractC18555, c16997)) == null) {
            return;
        }
        this.f57197.clipPath(pathM42855);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42855(AbstractC18555 abstractC18555, C16997 c16997) {
        Path pathM42888;
        AbstractC19261 abstractC19261M38398 = abstractC18555.f16090.m38398(this.f57191.f26151.f66611);
        if (abstractC19261M38398 == null) {
            String str = this.f57191.f26151.f66611;
            return null;
        }
        C6414 c6414 = (C6414) abstractC19261M38398;
        this.f57195.push(this.f57191);
        this.f57191 = m42859((AbstractC19261) c6414);
        Boolean bool = c6414.f19849;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c16997.f52132, c16997.f52133);
            matrix.preScale(c16997.f52134, c16997.f52131);
        }
        Matrix matrix2 = c6414.f60225;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C5149 c5149 : c6414.f48531) {
            if ((c5149 instanceof AbstractC18555) && (pathM42888 = m42888((AbstractC18555) c5149)) != null) {
                path.op(pathM42888, Path.Op.UNION);
            }
        }
        if (this.f57191.f26151.f66611 != null) {
            if (c6414.f57590 == null) {
                c6414.f57590 = m42860(path);
            }
            Path pathM42855 = m42855(c6414, c6414.f57590);
            if (pathM42855 != null) {
                path.op(pathM42855, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f57191 = (C8552) this.f57195.pop();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    @TargetApi(19)
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Path m42888(AbstractC18555 abstractC18555) {
        Path path;
        Path pathM42855;
        this.f57195.push(this.f57191);
        C8552 c8552 = new C8552(this.f57191);
        this.f57191 = c8552;
        m42868(c8552, abstractC18555);
        if (!m42896() || !m42893()) {
            this.f57191 = (C8552) this.f57195.pop();
            return null;
        }
        if (abstractC18555 instanceof C1496) {
            C1496 c1496 = (C1496) abstractC18555;
            AbstractC19261 abstractC19261M38398 = abstractC18555.f16090.m38398(c1496.f5341);
            if (abstractC19261M38398 == null) {
                this.f57191 = (C8552) this.f57195.pop();
                return null;
            }
            if (!(abstractC19261M38398 instanceof AbstractC18555)) {
                this.f57191 = (C8552) this.f57195.pop();
                return null;
            }
            path = m42888((AbstractC18555) abstractC19261M38398);
            if (path != null) {
                if (c1496.f57590 == null) {
                    c1496.f57590 = m42860(path);
                }
                Matrix matrix = c1496.f60225;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f57191.f26151.f66611 != null && (pathM42855 = m42855(abstractC18555, abstractC18555.f57590)) != null) {
                    path.op(pathM42855, Path.Op.INTERSECT);
                }
                this.f57191 = (C8552) this.f57195.pop();
                return path;
            }
            return null;
        }
        if (abstractC18555 instanceof AbstractC18409) {
            AbstractC18409 abstractC18409 = (AbstractC18409) abstractC18555;
            if (abstractC18555 instanceof C4298) {
                path = new C23368(((C4298) abstractC18555).f13865).f75064;
                if (abstractC18555.f57590 == null) {
                    abstractC18555.f57590 = m42860(path);
                }
            } else if (abstractC18555 instanceof C11354) {
                path = m42853((C11354) abstractC18555);
            } else if (abstractC18555 instanceof C23347) {
                path = m42856((C23347) abstractC18555);
            } else if (abstractC18555 instanceof C15585) {
                path = m42854((C15585) abstractC18555);
            } else {
                path = abstractC18555 instanceof C9943 ? m42852((C9943) abstractC18555) : null;
            }
            if (path != null) {
                if (abstractC18409.f57590 == null) {
                    abstractC18409.f57590 = m42860(path);
                }
                Matrix matrix2 = abstractC18409.f57156;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(m42898());
                if (this.f57191.f26151.f66611 != null) {
                    path.op(pathM42855, Path.Op.INTERSECT);
                }
                this.f57191 = (C8552) this.f57195.pop();
                return path;
            }
            return null;
        }
        if (abstractC18555 instanceof C12909) {
            C12909 c12909 = (C12909) abstractC18555;
            ArrayList arrayList = c12909.f34358;
            float fM2933 = 0.0f;
            float fM2932 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C0769) c12909.f34358.get(0)).m2932(this);
            ArrayList arrayList2 = c12909.f34355;
            float fM2934 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C0769) c12909.f34355.get(0)).m2933(this);
            ArrayList arrayList3 = c12909.f34356;
            float fM2935 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C0769) c12909.f34356.get(0)).m2932(this);
            ArrayList arrayList4 = c12909.f34357;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fM2933 = ((C0769) c12909.f34357.get(0)).m2933(this);
            }
            if (this.f57191.f26151.f66599 != EnumC17143.Start) {
                float fM42847 = m42847((AbstractC10088) c12909);
                if (this.f57191.f26151.f66599 == EnumC17143.Middle) {
                    fM42847 /= 2.0f;
                }
                fM2932 -= fM42847;
            }
            if (c12909.f57590 == null) {
                C15606 c15606 = new C15606(this, fM2932, fM2934);
                m42873(c12909, c15606);
                RectF rectF = c15606.f48068;
                c12909.f57590 = new C16997(rectF.left, rectF.top, rectF.width(), c15606.f48068.height());
            }
            path = new Path();
            m42873(c12909, new C9258(this, fM2932 + fM2935, fM2934 + fM2933, path));
            Matrix matrix3 = c12909.f38734;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(m42898());
            if (this.f57191.f26151.f66611 != null) {
                path.op(pathM42855, Path.Op.INTERSECT);
            }
            this.f57191 = (C8552) this.f57195.pop();
            return path;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Path.FillType m42898() {
        EnumC7120 enumC7120 = this.f57191.f26151.f66606;
        if (enumC7120 != null && enumC7120 == EnumC7120.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42853(C11354 c11354) {
        float fM2932;
        float fM2933;
        Path path;
        C0769 c0769 = c11354.f33987;
        if (c0769 == null && c11354.f33982 == null) {
            fM2932 = 0.0f;
            fM2933 = 0.0f;
        } else {
            if (c0769 == null) {
                fM2932 = c11354.f33982.m2933(this);
            } else if (c11354.f33982 == null) {
                fM2932 = c0769.m2932(this);
            } else {
                fM2932 = c0769.m2932(this);
                fM2933 = c11354.f33982.m2933(this);
            }
            fM2933 = fM2932;
        }
        float fMin = Math.min(fM2932, c11354.f33984.m2932(this) / 2.0f);
        float fMin2 = Math.min(fM2933, c11354.f33986.m2933(this) / 2.0f);
        C0769 c07610 = c11354.f33983;
        float fM2934 = c07610 != null ? c07610.m2932(this) : 0.0f;
        C0769 c07611 = c11354.f33985;
        float fM2935 = c07611 != null ? c07611.m2933(this) : 0.0f;
        float fM2936 = c11354.f33984.m2932(this);
        float fM2937 = c11354.f33986.m2933(this);
        if (c11354.f57590 == null) {
            c11354.f57590 = new C16997(fM2934, fM2935, fM2936, fM2937);
        }
        float f = fM2936 + fM2934;
        float f2 = fM2935 + fM2937;
        Path path2 = new Path();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            path = path2;
            path.moveTo(fM2934, fM2935);
            path.lineTo(f, fM2935);
            path.lineTo(f, f2);
            path.lineTo(fM2934, f2);
            path.lineTo(fM2934, fM2935);
        } else {
            float f3 = fMin * 0.5522848f;
            float f4 = 0.5522848f * fMin2;
            float f5 = fM2935 + fMin2;
            path2.moveTo(fM2934, f5);
            float f6 = f5 - f4;
            float f7 = fM2934 + fMin;
            float f8 = f7 - f3;
            path2.cubicTo(fM2934, f6, f8, fM2935, f7, fM2935);
            float f9 = f - fMin;
            path2.lineTo(f9, fM2935);
            float f10 = f9 + f3;
            path2.cubicTo(f10, fM2935, f, f6, f, f5);
            float f11 = f2 - fMin2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, fM2934, f12, fM2934, f11);
            path.lineTo(fM2934, f5);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42856(C23347 c23347) {
        C0769 c0769 = c23347.f75015;
        float fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        C0769 c07610 = c23347.f75016;
        float fM2933 = c07610 != null ? c07610.m2933(this) : 0.0f;
        float fM2929 = c23347.f75014.m2929(this);
        float f = fM2932 - fM2929;
        float f2 = fM2933 - fM2929;
        float f3 = fM2932 + fM2929;
        float f4 = fM2933 + fM2929;
        if (c23347.f57590 == null) {
            float f5 = 2.0f * fM2929;
            c23347.f57590 = new C16997(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fM2929;
        Path path = new Path();
        path.moveTo(fM2932, f2);
        float f7 = fM2932 + f6;
        float f8 = fM2933 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fM2933);
        float f9 = fM2933 + f6;
        path.cubicTo(f3, f9, f7, f4, fM2932, f4);
        float f10 = fM2932 - f6;
        path.cubicTo(f10, f4, f, f9, f, fM2933);
        path.cubicTo(f, f8, f10, f2, fM2932, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42854(C15585 c15585) {
        C0769 c0769 = c15585.f48016;
        float fM2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        C0769 c07610 = c15585.f48017;
        float fM2933 = c07610 != null ? c07610.m2933(this) : 0.0f;
        float fM2934 = c15585.f48014.m2932(this);
        float fM2935 = c15585.f48015.m2933(this);
        float f = fM2932 - fM2934;
        float f2 = fM2933 - fM2935;
        float f3 = fM2932 + fM2934;
        float f4 = fM2933 + fM2935;
        if (c15585.f57590 == null) {
            c15585.f57590 = new C16997(f, f2, fM2934 * 2.0f, 2.0f * fM2935);
        }
        float f5 = fM2934 * 0.5522848f;
        float f6 = 0.5522848f * fM2935;
        Path path = new Path();
        path.moveTo(fM2932, f2);
        float f7 = fM2932 + f5;
        float f8 = fM2933 - f6;
        float f9 = fM2933;
        path.cubicTo(f7, f2, f3, f8, f3, f9);
        float f10 = f6 + fM2933;
        path.cubicTo(f3, f10, f7, f4, fM2932, f4);
        float f11 = fM2932 - f5;
        path.cubicTo(f11, f4, f, f10, f, f9);
        path.cubicTo(f, f8, f11, f2, fM2932, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Path m42852(C9943 c9943) {
        Path path = new Path();
        float[] fArr = c9943.f30025;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c9943.f30025;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c9943 instanceof C5709) {
            path.close();
        }
        if (c9943.f57590 == null) {
            c9943.f57590 = m42860(path);
        }
        return path;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42874(C12059 c12059, String str) {
        AbstractC19261 abstractC19261M38398 = c12059.f16090.m38398(str);
        if (abstractC19261M38398 == null || !(abstractC19261M38398 instanceof C12059) || abstractC19261M38398 == c12059) {
            return;
        }
        C12059 c120510 = (C12059) abstractC19261M38398;
        if (c12059.f36072 == null) {
            c12059.f36072 = c120510.f36072;
        }
        if (c12059.f36071 == null) {
            c12059.f36071 = c120510.f36071;
        }
        if (c12059.f36070 == null) {
            c12059.f36070 = c120510.f36070;
        }
        if (c12059.f36075 == null) {
            c12059.f36075 = c120510.f36075;
        }
        if (c12059.f36076 == null) {
            c12059.f36076 = c120510.f36076;
        }
        if (c12059.f36073 == null) {
            c12059.f36073 = c120510.f36073;
        }
        if (c12059.f36074 == null) {
            c12059.f36074 = c120510.f36074;
        }
        if (c12059.f48531.isEmpty()) {
            c12059.f48531 = c120510.f48531;
        }
        if (c12059.f68869 == null) {
            c12059.f68869 = c120510.f68869;
        }
        if (c12059.f24627 == null) {
            c12059.f24627 = c120510.f24627;
        }
        String str2 = c120510.f36069;
        if (str2 != null) {
            m42874(c12059, str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42882(C21232 c21232, C16997 c16997) {
        float fM2932;
        float fM2933;
        Boolean bool = c21232.f68441;
        if (bool != null && bool.booleanValue()) {
            C0769 c0769 = c21232.f68438;
            fM2932 = c0769 != null ? c0769.m2932(this) : c16997.f52134;
            C0769 c07610 = c21232.f68439;
            fM2933 = c07610 != null ? c07610.m2933(this) : c16997.f52131;
        } else {
            C0769 c07611 = c21232.f68438;
            float fM2930 = c07611 != null ? c07611.m2930(this, 1.0f) : 1.2f;
            C0769 c07612 = c21232.f68439;
            float fM2931 = c07612 != null ? c07612.m2930(this, 1.0f) : 1.2f;
            fM2932 = fM2930 * c16997.f52134;
            fM2933 = fM2931 * c16997.f52131;
        }
        if (fM2932 == 0.0f || fM2933 == 0.0f) {
            return;
        }
        m42887();
        C8552 c8552M42859 = m42859((AbstractC19261) c21232);
        this.f57191 = c8552M42859;
        c8552M42859.f26151.f66598 = Float.valueOf(1.0f);
        boolean zM42885 = m42885();
        Canvas canvas = this.f57197;
        canvas.save();
        Boolean bool2 = c21232.f68440;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c16997.f52132, c16997.f52133);
            canvas.scale(c16997.f52134, c16997.f52131);
        }
        m42877((AbstractC15731) c21232, false);
        canvas.restore();
        if (zM42885) {
            m42878(c16997);
        }
        m42897();
    }
}
