package p067l;

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
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
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
public final class C19884 {

    /* JADX INFO: renamed from: ۖ */
    public static HashSet f60406;

    /* JADX INFO: renamed from: ۡ */
    public C10496 f60409;

    /* JADX INFO: renamed from: ۢ */
    public Stack f60410;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f60412;

    /* JADX INFO: renamed from: ܺ */
    public Stack f60413;

    /* JADX INFO: renamed from: ܿ */
    public Canvas f60415;

    /* JADX INFO: renamed from: ᩷ */
    public Stack f60417;

    /* JADX INFO: renamed from: ᩻ */
    public C17871 f60418;

    /* JADX INFO: renamed from: ܽ */
    public final Matrix f60414 = new Matrix();

    /* JADX INFO: renamed from: ۧ */
    public final Matrix f60411 = new Matrix();

    /* JADX INFO: renamed from: ᩳ */
    public final float[] f60416 = new float[8];

    /* JADX INFO: renamed from: ֫ */
    public final C18522 f60407 = new C18522(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: ۜ */
    public float f60408 = 96.0f;

    /* JADX INFO: renamed from: ֫ */
    public static int m45121(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public C19884(Canvas canvas, boolean z) {
        this.f60415 = canvas;
        this.f60412 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m45176() {
        return this.f60408;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m45172() {
        return this.f60409.f29063.getTextSize();
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m45174() {
        return this.f60409.f29063.getTextSize() / 2.0f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18522 m45175() {
        C10496 c10496 = this.f60409;
        C18522 c18522 = c10496.f29070;
        return c18522 != null ? c18522 : c10496.f29064;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45173(C17871 c17871, C19193 c19193) {
        this.f60418 = c17871;
        C11286 c11286M40624 = c17871.m40624();
        if (c11286M40624 == null) {
            return;
        }
        C18522 c18522 = c11286M40624.f71564;
        C17851 c17851 = c11286M40624.f27540;
        this.f60409 = new C10496();
        this.f60413 = new Stack();
        m45142(this.f60409, C22015.m49618());
        C10496 c10496 = this.f60409;
        c10496.f29064 = null;
        c10496.f29069 = false;
        this.f60413.push(new C10496(c10496));
        this.f60417 = new Stack();
        this.f60410 = new Stack();
        Boolean bool = c11286M40624.f63861;
        if (bool != null) {
            this.f60409.f29069 = bool.booleanValue();
        }
        m45160();
        C18522 c18523 = new C18522(c19193.f57368);
        C3099 c3099 = c11286M40624.f31447;
        if (c3099 != null) {
            c18523.f55314 = c3099.m5258(this, c18523.f55314);
        }
        C3099 c30910 = c11286M40624.f31450;
        if (c30910 != null) {
            c18523.f55311 = c30910.m5258(this, c18523.f55311);
        }
        m45144(c11286M40624, c18523, c18522, c17851);
        m45170();
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
    /* JADX INFO: renamed from: ֫ */
    private void m45139(C7262 c7262) {
        ?? r14;
        RectF rectF;
        C3099 c3099;
        String str;
        int iIndexOf;
        Set setMo9655;
        C3099 c30910;
        AbstractC20674 abstractC20674M40613;
        Boolean bool;
        if (c7262 instanceof InterfaceC23217) {
            return;
        }
        m45160();
        if ((c7262 instanceof AbstractC20674) && (bool = ((AbstractC20674) c7262).f63861) != null) {
            this.f60409.f29069 = bool.booleanValue();
        }
        if (c7262 instanceof C11286) {
            C11286 c11286 = (C11286) c7262;
            m45144(c11286, m45134(c11286.f31449, c11286.f31448, c11286.f31447, c11286.f31450), c11286.f71564, c11286.f27540);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            boolean zM45158 = true;
            float fM5261 = 0.0f;
            if (c7262 instanceof C3790) {
                C3790 c3790 = (C3790) c7262;
                Canvas canvas = this.f60415;
                C3099 c30911 = c3790.f8110;
                if ((c30911 == null || !c30911.m5262()) && ((c30910 = c3790.f8113) == null || !c30910.m5262())) {
                    m45141(this.f60409, c3790);
                    if (m45169() && (abstractC20674M40613 = c3790.f18929.m40613(c3790.f8114)) != null) {
                        Matrix matrix = c3790.f63457;
                        if (matrix != null) {
                            canvas.concat(matrix);
                        }
                        C3099 c30912 = c3790.f8112;
                        float fM5260 = c30912 != null ? c30912.m5260(this) : 0.0f;
                        C3099 c30913 = c3790.f8111;
                        canvas.translate(fM5260, c30913 != null ? c30913.m5261(this) : 0.0f);
                        m45164(c3790, c3790.f60813);
                        boolean zM45159 = m45158();
                        m45138(c3790);
                        if (abstractC20674M40613 instanceof C11286) {
                            C11286 c11287 = (C11286) abstractC20674M40613;
                            C18522 c18522M45134 = m45134(null, null, c3790.f8110, c3790.f8113);
                            m45160();
                            m45144(c11287, c18522M45134, c11287.f71564, c11287.f27540);
                            m45170();
                        } else if (abstractC20674M40613 instanceof C21344) {
                            C3099 c30914 = c3790.f8110;
                            if (c30914 == null) {
                                c30914 = new C3099(100.0f, EnumC9273.percent);
                            }
                            C3099 c30915 = c3790.f8113;
                            if (c30915 == null) {
                                c30915 = new C3099(100.0f, EnumC9273.percent);
                            }
                            C18522 c18522M45135 = m45134(null, null, c30914, c30915);
                            m45160();
                            C21344 c21344 = (C21344) abstractC20674M40613;
                            if (c18522M45135.f55314 != 0.0f && c18522M45135.f55311 != 0.0f) {
                                C17851 c17851 = c21344.f27540;
                                if (c17851 == null) {
                                    c17851 = C17851.f53250;
                                }
                                m45141(this.f60409, c21344);
                                C10496 c10496 = this.f60409;
                                c10496.f29064 = c18522M45135;
                                if (!c10496.f29066.f69296.booleanValue()) {
                                    C18522 c18522 = this.f60409.f29064;
                                    m45135(c18522.f55312, c18522.f55313, c18522.f55314, c18522.f55311);
                                }
                                C18522 c18523 = c21344.f71564;
                                if (c18523 != null) {
                                    canvas.concat(m45124(this.f60409.f29064, c18523, c17851));
                                    this.f60409.f29070 = c21344.f71564;
                                } else {
                                    C18522 c18524 = this.f60409.f29064;
                                    canvas.translate(c18524.f55312, c18524.f55313);
                                }
                                boolean zM451510 = m45158();
                                m45150(c21344, true);
                                if (zM451510) {
                                    m45151(c21344.f60813);
                                }
                                m45167(c21344);
                            }
                            m45170();
                        } else {
                            m45139(abstractC20674M40613);
                        }
                        this.f60410.pop();
                        this.f60417.pop();
                        if (zM45159) {
                            m45151(c3790.f60813);
                        }
                        m45167(c3790);
                    }
                }
            } else if (c7262 instanceof C23355) {
                C23355 c23355 = (C23355) c7262;
                m45141(this.f60409, c23355);
                if (m45169()) {
                    Matrix matrix2 = c23355.f63457;
                    if (matrix2 != null) {
                        this.f60415.concat(matrix2);
                    }
                    m45164(c23355, c23355.f60813);
                    boolean zM451511 = m45158();
                    String language = Locale.getDefault().getLanguage();
                    for (?? r4 : c23355.f51671) {
                        if (r4 instanceof InterfaceC10615) {
                            InterfaceC10615 interfaceC10615 = (InterfaceC10615) r4;
                            if (interfaceC10615.mo9658() == null && ((setMo9655 = interfaceC10615.mo9655()) == null || (!setMo9655.isEmpty() && setMo9655.contains(language)))) {
                                Set setMo9663 = interfaceC10615.mo9663();
                                if (setMo9663 != null) {
                                    if (f60406 == null) {
                                        synchronized (C19884.class) {
                                            HashSet hashSet = new HashSet();
                                            f60406 = hashSet;
                                            hashSet.add("Structure");
                                            f60406.add("BasicStructure");
                                            f60406.add("ConditionalProcessing");
                                            f60406.add("Image");
                                            f60406.add("Style");
                                            f60406.add("ViewportAttribute");
                                            f60406.add("Shape");
                                            f60406.add("BasicText");
                                            f60406.add("PaintAttribute");
                                            f60406.add("BasicPaintAttribute");
                                            f60406.add("OpacityAttribute");
                                            f60406.add("BasicGraphicsAttribute");
                                            f60406.add("Marker");
                                            f60406.add("Gradient");
                                            f60406.add("Pattern");
                                            f60406.add("Clip");
                                            f60406.add("BasicClip");
                                            f60406.add("Mask");
                                            f60406.add("View");
                                        }
                                    }
                                    if (setMo9663.isEmpty() || !f60406.containsAll(setMo9663)) {
                                    }
                                }
                                Set setMo9662 = interfaceC10615.mo9662();
                                if (setMo9662 == null) {
                                    Set setMo9660 = interfaceC10615.mo9660();
                                    if (setMo9660 == null) {
                                        m45139(r4);
                                        break;
                                    }
                                    setMo9660.isEmpty();
                                } else {
                                    setMo9662.isEmpty();
                                }
                            }
                        }
                    }
                    if (zM451511) {
                        m45151(c23355.f60813);
                    }
                    m45167(c23355);
                }
            } else if (c7262 instanceof C20535) {
                C20535 c20535 = (C20535) c7262;
                m45141(this.f60409, c20535);
                if (m45169()) {
                    Matrix matrix3 = c20535.f63457;
                    if (matrix3 != null) {
                        this.f60415.concat(matrix3);
                    }
                    m45164(c20535, c20535.f60813);
                    boolean zM451512 = m45158();
                    m45150(c20535, true);
                    if (zM451512) {
                        m45151(c20535.f60813);
                    }
                    m45167(c20535);
                }
            } else if (c7262 instanceof C7123) {
                r14 = (C7123) c7262;
                Canvas canvas2 = this.f60415;
                C3099 c30916 = r14.f18601;
                if (c30916 != null && !c30916.m5262() && (c3099 = r14.f18603) != null && !c3099.m5262() && (str = r14.f18604) != null) {
                    C17851 c17852 = r14.f27540;
                    if (c17852 == null) {
                        c17852 = C17851.f53250;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception unused) {
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C18522 c18525 = new C18522(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        m45141(this.f60409, r14);
                        if (m45169() && m45166()) {
                            Matrix matrix4 = r14.f18599;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            C3099 c30917 = r14.f18600;
                            float fM5262 = c30917 != null ? c30917.m5260(this) : 0.0f;
                            C3099 c30918 = r14.f18602;
                            float fM5263 = c30918 != null ? c30918.m5261(this) : 0.0f;
                            float fM5264 = r14.f18601.m5260(this);
                            float fM5265 = r14.f18603.m5260(this);
                            C10496 c10497 = this.f60409;
                            c10497.f29064 = new C18522(fM5262, fM5263, fM5264, fM5265);
                            if (!c10497.f29066.f69296.booleanValue()) {
                                C18522 c18526 = this.f60409.f29064;
                                m45135(c18526.f55312, c18526.f55313, c18526.f55314, c18526.f55311);
                            }
                            r14.f60813 = this.f60409.f29064;
                            m45167(r14);
                            m45164(r14, r14.f60813);
                            boolean zM451513 = m45158();
                            m45159();
                            canvas2.save();
                            canvas2.concat(m45124(this.f60409.f29064, c18525, c17852));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f60409.f29066.f69260 == EnumC19332.optimizeSpeed ? 0 : 2));
                            canvas2.restore();
                            if (zM451513) {
                                m45151(r14.f60813);
                            }
                        }
                    }
                }
            } else if (c7262 instanceof C6453) {
                r14 = (C6453) c7262;
                Canvas canvas3 = this.f60415;
                if (r14.f16680 != null) {
                    m45141(this.f60409, r14);
                    if (m45169() && m45166()) {
                        C10496 c10498 = this.f60409;
                        if (c10498.f29067 || c10498.f29065) {
                            Matrix matrix5 = r14.f60375;
                            if (matrix5 != null) {
                                canvas3.concat(matrix5);
                            }
                            Path path = new C24577(r14.f16680).f77810;
                            if (r14.f60813 == null) {
                                r14.f60813 = m45133(path);
                            }
                            m45167(r14);
                            m45153(r14);
                            m45164(r14, r14.f60813);
                            C18522 c18527 = r14.f60813;
                            if (this.f60409.f29066.f69280.floatValue() >= 1.0f && this.f60409.f29066.f69284 == null) {
                                zM45158 = false;
                            } else if (this.f60412 && !canvas3.isHardwareAccelerated()) {
                                C22015 c22015 = this.f60409.f29066;
                                if (c22015.f69284 == null && c22015.f69285 == null && c22015.f69283 == null && c22015.f69275 == null && !(c22015.f69277 instanceof C21206) && !(c22015.f69261 instanceof C21206) && c22015.f69294 != EnumC8603.NonScalingStroke) {
                                    float[] fArr = new float[9];
                                    canvas3.getMatrix().getValues(fArr);
                                    int i = 0;
                                    while (true) {
                                        if (i >= 9) {
                                            if (fArr[1] != 0.0f || fArr[3] != 0.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 1.0f) {
                                                zM45158 = m45158();
                                                break;
                                            }
                                            float fAbs = Math.abs(fArr[0]);
                                            float fAbs2 = Math.abs(fArr[4]);
                                            if (fAbs != 0.0f && fAbs2 != 0.0f) {
                                                C10496 c10499 = this.f60409;
                                                if (!c10499.f29067) {
                                                    c18527.getClass();
                                                    rectF = new RectF(c18527.f55312, c18527.f55313, c18527.m42099(), c18527.m42100());
                                                    float f = -fM5261;
                                                    rectF.inset(f - (2.0f / fAbs), f - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left)) {
                                                        zM45158 = m45158();
                                                        break;
                                                    } else {
                                                        zM45158 = m45158();
                                                        break;
                                                    }
                                                }
                                                float strokeWidth = c10499.f29068.getStrokeWidth();
                                                if (strokeWidth > 0.0f) {
                                                    fM5261 = (this.f60409.f29068.getStrokeJoin() == Paint.Join.MITER ? Math.max(2.0f, this.f60409.f29068.getStrokeMiter()) : 2.0f) * strokeWidth * 0.5f;
                                                    c18527.getClass();
                                                    rectF = new RectF(c18527.f55312, c18527.f55313, c18527.m42099(), c18527.m42100());
                                                    float f2 = -fM5261;
                                                    rectF.inset(f2 - (2.0f / fAbs), f2 - (2.0f / fAbs2));
                                                    if (!Float.isNaN(rectF.left) && !Float.isInfinite(rectF.left) && !Float.isNaN(rectF.top) && !Float.isInfinite(rectF.top) && !Float.isNaN(rectF.right) && !Float.isInfinite(rectF.right) && !Float.isNaN(rectF.bottom) && !Float.isInfinite(rectF.bottom)) {
                                                        canvas3.clipRect(rectF);
                                                        canvas3.saveLayerAlpha(rectF, m45121(this.f60409.f29066.f69280.floatValue()), 31);
                                                        this.f60413.push(this.f60409);
                                                        break;
                                                    }
                                                    zM45158 = m45158();
                                                    break;
                                                }
                                                zM45158 = m45158();
                                                break;
                                            }
                                            zM45158 = m45158();
                                            break;
                                        }
                                        float f3 = fArr[i];
                                        if (Float.isNaN(f3) || Float.isInfinite(f3)) {
                                            zM45158 = m45158();
                                            break;
                                        }
                                        i++;
                                    }
                                } else {
                                    zM45158 = m45158();
                                }
                            } else {
                                zM45158 = m45158();
                            }
                            C10496 c104910 = this.f60409;
                            if (c104910.f29065) {
                                EnumC9135 enumC9135 = c104910.f29066.f69268;
                                path.setFillType((enumC9135 == null || enumC9135 != EnumC9135.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                m45154(r14, path);
                            }
                            if (this.f60409.f29067) {
                                m45163(path);
                            }
                            m45152(r14);
                            if (zM45158) {
                                m45151(r14.f60813);
                            }
                        }
                    }
                }
            } else if (c7262 instanceof C13159) {
                r14 = (C13159) c7262;
                C3099 c30919 = r14.f36981;
                if (c30919 != null && r14.f36983 != null && !c30919.m5262() && !r14.f36983.m5262()) {
                    m45141(this.f60409, r14);
                    if (m45169() && m45166()) {
                        Matrix matrix6 = r14.f60375;
                        if (matrix6 != null) {
                            this.f60415.concat(matrix6);
                        }
                        Path pathM45126 = m45126(r14);
                        m45167(r14);
                        m45153(r14);
                        m45164(r14, r14.f60813);
                        boolean zM451514 = m45158();
                        if (this.f60409.f29065) {
                            m45154(r14, pathM45126);
                        }
                        if (this.f60409.f29067) {
                            m45163(pathM45126);
                        }
                        if (zM451514) {
                            m45151(r14.f60813);
                        }
                    }
                }
            } else if (c7262 instanceof C24557) {
                r14 = (C24557) c7262;
                C3099 c30920 = r14.f77760;
                if (c30920 != null && !c30920.m5262()) {
                    m45141(this.f60409, r14);
                    if (m45169() && m45166()) {
                        Matrix matrix7 = r14.f60375;
                        if (matrix7 != null) {
                            this.f60415.concat(matrix7);
                        }
                        Path pathM45129 = m45129(r14);
                        m45167(r14);
                        m45153(r14);
                        m45164(r14, r14.f60813);
                        boolean zM451515 = m45158();
                        if (this.f60409.f29065) {
                            m45154(r14, pathM45129);
                        }
                        if (this.f60409.f29067) {
                            m45163(pathM45129);
                        }
                        if (zM451515) {
                            m45151(r14.f60813);
                        }
                    }
                }
            } else if (c7262 instanceof C17180) {
                r14 = (C17180) c7262;
                C3099 c30921 = r14.f51146;
                if (c30921 != null && r14.f51147 != null && !c30921.m5262() && !r14.f51147.m5262()) {
                    m45141(this.f60409, r14);
                    if (m45169() && m45166()) {
                        Matrix matrix8 = r14.f60375;
                        if (matrix8 != null) {
                            this.f60415.concat(matrix8);
                        }
                        Path pathM45127 = m45127(r14);
                        m45167(r14);
                        m45153(r14);
                        m45164(r14, r14.f60813);
                        boolean zM451516 = m45158();
                        if (this.f60409.f29065) {
                            m45154(r14, pathM45127);
                        }
                        if (this.f60409.f29067) {
                            m45163(pathM45127);
                        }
                        if (zM451516) {
                            m45151(r14.f60813);
                        }
                    }
                }
            } else if (c7262 instanceof C9805) {
                r14 = (C9805) c7262;
                m45141(this.f60409, r14);
                if (m45169() && m45166() && this.f60409.f29067) {
                    Matrix matrix9 = r14.f60375;
                    if (matrix9 != null) {
                        this.f60415.concat(matrix9);
                    }
                    C3099 c30922 = r14.f27141;
                    float fM5266 = c30922 == null ? 0.0f : c30922.m5260(this);
                    C3099 c30923 = r14.f27139;
                    float fM5267 = c30923 == null ? 0.0f : c30923.m5261(this);
                    C3099 c30924 = r14.f27142;
                    float fM5268 = c30924 == null ? 0.0f : c30924.m5260(this);
                    C3099 c30925 = r14.f27140;
                    fM5261 = c30925 != null ? c30925.m5261(this) : 0.0f;
                    if (r14.f60813 == null) {
                        r14.f60813 = new C18522(Math.min(fM5266, fM5268), Math.min(fM5267, fM5261), Math.abs(fM5268 - fM5266), Math.abs(fM5261 - fM5267));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fM5266, fM5267);
                    path2.lineTo(fM5268, fM5261);
                    m45167(r14);
                    m45153(r14);
                    m45164(r14, r14.f60813);
                    boolean zM451517 = m45158();
                    m45163(path2);
                    m45152(r14);
                    if (zM451517) {
                        m45151(r14.f60813);
                    }
                }
            } else if (c7262 instanceof C7794) {
                r14 = (C7794) c7262;
                m45141(this.f60409, r14);
                if (m45169() && m45166()) {
                    C10496 c104911 = this.f60409;
                    if (c104911.f29067 || c104911.f29065) {
                        Matrix matrix10 = r14.f60375;
                        if (matrix10 != null) {
                            this.f60415.concat(matrix10);
                        }
                        if (r14.f32982.length >= 2) {
                            Path pathM45125 = m45125((C11818) r14);
                            m45167(r14);
                            m45153(r14);
                            m45164(r14, r14.f60813);
                            boolean zM451518 = m45158();
                            if (this.f60409.f29065) {
                                m45154(r14, pathM45125);
                            }
                            if (this.f60409.f29067) {
                                m45163(pathM45125);
                            }
                            m45152(r14);
                            if (zM451518) {
                                m45151(r14.f60813);
                            }
                        }
                    }
                }
            } else if (c7262 instanceof C11818) {
                r14 = (C11818) c7262;
                m45141(this.f60409, r14);
                if (m45169() && m45166()) {
                    C10496 c104912 = this.f60409;
                    if (c104912.f29067 || c104912.f29065) {
                        Matrix matrix11 = r14.f60375;
                        if (matrix11 != null) {
                            this.f60415.concat(matrix11);
                        }
                        if (r14.f32982.length >= 2) {
                            Path pathM45128 = m45125((C11818) r14);
                            m45167(r14);
                            EnumC9135 enumC9136 = this.f60409.f29066.f69268;
                            pathM45128.setFillType((enumC9136 == null || enumC9136 != EnumC9135.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            m45153(r14);
                            m45164(r14, r14.f60813);
                            boolean zM451519 = m45158();
                            if (this.f60409.f29065) {
                                m45154(r14, pathM45128);
                            }
                            if (this.f60409.f29067) {
                                m45163(pathM45128);
                            }
                            m45152(r14);
                            if (zM451519) {
                                m45151(r14.f60813);
                            }
                        }
                    }
                }
            } else if (c7262 instanceof C14637) {
                r14 = (C14637) c7262;
                m45141(this.f60409, r14);
                if (m45169()) {
                    Matrix matrix12 = r14.f41776;
                    if (matrix12 != null) {
                        this.f60415.concat(matrix12);
                    }
                    ArrayList arrayList = r14.f37355;
                    float fM5269 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C3099) r14.f37355.get(0)).m5260(this);
                    ArrayList arrayList2 = r14.f37352;
                    float fM52610 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C3099) r14.f37352.get(0)).m5261(this);
                    ArrayList arrayList3 = r14.f37353;
                    float fM52611 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C3099) r14.f37353.get(0)).m5260(this);
                    ArrayList arrayList4 = r14.f37354;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fM5261 = ((C3099) r14.f37354.get(0)).m5261(this);
                    }
                    EnumC18661 enumC18661M45165 = m45165();
                    if (enumC18661M45165 != EnumC18661.Start) {
                        float fM45120 = m45120(r14);
                        if (enumC18661M45165 == EnumC18661.Middle) {
                            fM45120 /= 2.0f;
                        }
                        fM5269 -= fM45120;
                    }
                    if (r14.f60813 == null) {
                        C17200 c17200 = new C17200(this, fM5269, fM52610);
                        m45146(r14, c17200);
                        RectF rectF2 = c17200.f51199;
                        r14.f60813 = new C18522(rectF2.left, rectF2.top, rectF2.width(), c17200.f51199.height());
                    }
                    m45167(r14);
                    m45153(r14);
                    m45164(r14, r14.f60813);
                    boolean zM451520 = m45158();
                    m45146(r14, new C21896(this, fM5269 + fM52611, fM52610 + fM5261));
                    if (zM451520) {
                        m45151(r14.f60813);
                    }
                }
            }
        }
        m45170();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45150(AbstractC17319 abstractC17319, boolean z) {
        if (z) {
            m45138((InterfaceC5921) abstractC17319);
        }
        Iterator it = abstractC17319.f51671.iterator();
        while (it.hasNext()) {
            m45139((C7262) it.next());
        }
        if (z) {
            this.f60410.pop();
            this.f60417.pop();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private void m45160() {
        this.f60415.save();
        this.f60413.push(this.f60409);
        this.f60409 = new C10496(this.f60409);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m45170() {
        this.f60415.restore();
        this.f60409 = (C10496) this.f60413.pop();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45138(InterfaceC5921 interfaceC5921) {
        this.f60410.push(interfaceC5921);
        Canvas canvas = this.f60415;
        Matrix matrix = this.f60411;
        canvas.getMatrix(matrix);
        Matrix matrix2 = new Matrix();
        Stack stack = this.f60417;
        if (!matrix.invert(matrix2)) {
            matrix2 = null;
        }
        stack.push(matrix2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45141(C10496 c10496, AbstractC20674 abstractC20674) {
        boolean z = abstractC20674.f18930 == null;
        C22015 c22015 = c10496.f29066;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c22015.f69278 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c22015.f69296 = bool;
        c22015.f69291 = null;
        c22015.f69293 = null;
        c22015.f69280 = fValueOf;
        c22015.f69272 = C21876.f68815;
        c22015.f69282 = fValueOf;
        c22015.f69284 = null;
        c22015.f69269 = null;
        c22015.f69290 = fValueOf;
        c22015.f69289 = null;
        c22015.f69266 = fValueOf;
        c22015.f69294 = EnumC8603.None;
        C22015 c22016 = abstractC20674.f63862;
        if (c22016 != null) {
            m45142(c10496, c22016);
        }
        if (this.f60418.m40622()) {
            for (C15030 c15030 : (ArrayList) this.f60418.m40612()) {
                if (C24418.m53888(c15030.f42938, abstractC20674)) {
                    m45142(c10496, c15030.f42940);
                }
            }
        }
        C22015 c22017 = abstractC20674.f63865;
        if (c22017 != null) {
            m45142(c10496, c22017);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020b A[LOOP:3: B:104:0x0205->B:106:0x020b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX INFO: renamed from: ֫ */
    private void m45154(AbstractC20003 abstractC20003, Path path) {
        float fM5260;
        float fM5261;
        float fM5262;
        float fM5263;
        Canvas canvas;
        C17851 c17851;
        Iterator it;
        AbstractC3238 abstractC3238 = this.f60409.f29066.f69277;
        boolean z = abstractC3238 instanceof C21206;
        Canvas canvas2 = this.f60415;
        if (z) {
            AbstractC20674 abstractC20674M40613 = this.f60418.m40613(((C21206) abstractC3238).f66690);
            if (abstractC20674M40613 instanceof C13829) {
                C13829 c13829 = (C13829) abstractC20674M40613;
                Boolean bool = c13829.f39083;
                boolean z2 = bool != null && bool.booleanValue();
                String str = c13829.f39080;
                if (str != null) {
                    m45147(c13829, str);
                }
                if (z2) {
                    C3099 c3099 = c13829.f39086;
                    fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
                    C3099 c30910 = c13829.f39087;
                    fM5262 = c30910 != null ? c30910.m5261(this) : 0.0f;
                    C3099 c30911 = c13829.f39084;
                    fM5263 = c30911 != null ? c30911.m5260(this) : 0.0f;
                    C3099 c30912 = c13829.f39085;
                    fM5261 = c30912 != null ? c30912.m5261(this) : 0.0f;
                } else {
                    C3099 c30913 = c13829.f39086;
                    float fM5258 = c30913 != null ? c30913.m5258(this, 1.0f) : 0.0f;
                    C3099 c30914 = c13829.f39087;
                    float fM5259 = c30914 != null ? c30914.m5258(this, 1.0f) : 0.0f;
                    C3099 c30915 = c13829.f39084;
                    float fM52510 = c30915 != null ? c30915.m5258(this, 1.0f) : 0.0f;
                    C3099 c30916 = c13829.f39085;
                    float fM52511 = c30916 != null ? c30916.m5258(this, 1.0f) : 0.0f;
                    C18522 c18522 = abstractC20003.f60813;
                    float f = c18522.f55312;
                    float f2 = c18522.f55314;
                    fM5260 = (fM5258 * f2) + f;
                    float f3 = c18522.f55313;
                    float f4 = c18522.f55311;
                    float f5 = fM52510 * f2;
                    fM5261 = fM52511 * f4;
                    fM5262 = (fM5259 * f4) + f3;
                    fM5263 = f5;
                }
                if (fM5263 == 0.0f || fM5261 == 0.0f) {
                    return;
                }
                C17851 c17852 = c13829.f27540;
                if (c17852 == null) {
                    c17852 = C17851.f53250;
                }
                m45160();
                canvas2.clipPath(path);
                C10496 c10496 = new C10496();
                m45142(c10496, C22015.m49618());
                c10496.f29066.f69296 = Boolean.FALSE;
                m45140(c13829, c10496);
                this.f60409 = c10496;
                C18522 c18523 = abstractC20003.f60813;
                Matrix matrix = c13829.f39081;
                if (matrix != null) {
                    canvas2.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c13829.f39081.invert(matrix2)) {
                        C18522 c18524 = abstractC20003.f60813;
                        float f6 = c18524.f55312;
                        float f7 = c18524.f55313;
                        float fM42099 = c18524.m42099();
                        C18522 c18525 = abstractC20003.f60813;
                        float f8 = c18525.f55313;
                        float fM420910 = c18525.m42099();
                        float fM42100 = abstractC20003.f60813.m42100();
                        C18522 c18526 = abstractC20003.f60813;
                        float[] fArr = {f6, f7, fM42099, f8, fM420910, fM42100, c18526.f55312, c18526.m42100()};
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
                        c18523 = new C18522(f13, f14, rectF.right - f13, rectF.bottom - f14);
                    }
                }
                float fFloor = (((float) Math.floor((c18523.f55312 - fM5260) / fM5263)) * fM5263) + fM5260;
                float fM420911 = c18523.m42099();
                float fM42101 = c18523.m42100();
                C18522 c18527 = new C18522(0.0f, 0.0f, fM5263, fM5261);
                boolean zM45158 = m45158();
                for (float fFloor2 = (((float) Math.floor((c18523.f55313 - fM5262) / fM5261)) * fM5261) + fM5262; fFloor2 < fM42101; fFloor2 += fM5261) {
                    float f15 = fFloor;
                    while (f15 < fM420911) {
                        c18527.f55312 = f15;
                        c18527.f55313 = fFloor2;
                        m45160();
                        if (!this.f60409.f29066.f69296.booleanValue()) {
                            m45135(c18527.f55312, c18527.f55313, c18527.f55314, c18527.f55311);
                        }
                        C18522 c18528 = c13829.f71564;
                        if (c18528 != null) {
                            c17851 = c17852;
                            canvas = canvas2;
                            canvas.concat(m45124(c18527, c18528, c17851));
                        } else {
                            canvas = canvas2;
                            c17851 = c17852;
                            Boolean bool2 = c13829.f39082;
                            boolean z3 = bool2 == null || bool2.booleanValue();
                            canvas.translate(f15, fFloor2);
                            if (!z3) {
                                C18522 c18529 = abstractC20003.f60813;
                                canvas.scale(c18529.f55314, c18529.f55311);
                            }
                            it = c13829.f51671.iterator();
                            while (it.hasNext()) {
                                m45139((C7262) it.next());
                            }
                            m45170();
                            f15 += fM5263;
                            c17852 = c17851;
                            canvas2 = canvas;
                        }
                        it = c13829.f51671.iterator();
                        while (it.hasNext()) {
                            m45139((C7262) it.next());
                        }
                        m45170();
                        f15 += fM5263;
                        c17852 = c17851;
                        canvas2 = canvas;
                    }
                }
                if (zM45158) {
                    m45151(c13829.f60813);
                }
                m45170();
                return;
            }
        }
        canvas2.drawPath(path, this.f60409.f29063);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45163(Path path) {
        C10496 c10496 = this.f60409;
        EnumC8603 enumC8603 = c10496.f29066.f69294;
        EnumC8603 enumC8604 = EnumC8603.NonScalingStroke;
        Canvas canvas = this.f60415;
        if (enumC8603 == enumC8604) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = this.f60409.f29068.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, this.f60409.f29068);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, c10496.f29068);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45144(C11286 c11286, C18522 c18522, C18522 c18523, C17851 c17851) {
        if (c18522.f55314 == 0.0f || c18522.f55311 == 0.0f) {
            return;
        }
        if (c17851 == null && (c17851 = c11286.f27540) == null) {
            c17851 = C17851.f53250;
        }
        m45141(this.f60409, c11286);
        if (m45169()) {
            C10496 c10496 = this.f60409;
            c10496.f29064 = c18522;
            if (!c10496.f29066.f69296.booleanValue()) {
                C18522 c18524 = this.f60409.f29064;
                m45135(c18524.f55312, c18524.f55313, c18524.f55314, c18524.f55311);
            }
            m45164(c11286, this.f60409.f29064);
            Canvas canvas = this.f60415;
            if (c18523 != null) {
                canvas.concat(m45124(this.f60409.f29064, c18523, c17851));
                this.f60409.f29070 = c11286.f71564;
            } else {
                C18522 c18525 = this.f60409.f29064;
                canvas.translate(c18525.f55312, c18525.f55313);
            }
            boolean zM45158 = m45158();
            m45159();
            m45150((AbstractC17319) c11286, true);
            if (zM45158) {
                m45151(c11286.f60813);
            }
            m45167(c11286);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C18522 m45134(C3099 c3099, C3099 c30910, C3099 c30911, C3099 c30912) {
        float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
        float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
        C18522 c18522M45175 = m45175();
        return new C18522(fM5260, fM5261, c30911 != null ? c30911.m5260(this) : c18522M45175.f55314, c30912 != null ? c30912.m5261(this) : c18522M45175.f55311);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m45167(AbstractC20003 abstractC20003) {
        Matrix matrix;
        if (abstractC20003.f18930 == null || abstractC20003.f60813 == null || (matrix = (Matrix) this.f60417.peek()) == null) {
            return;
        }
        Matrix matrix2 = this.f60414;
        matrix2.set(matrix);
        Canvas canvas = this.f60415;
        Matrix matrix3 = this.f60411;
        canvas.getMatrix(matrix3);
        matrix2.preConcat(matrix3);
        C18522 c18522 = abstractC20003.f60813;
        float f = c18522.f55312;
        float[] fArr = this.f60416;
        fArr[6] = f;
        fArr[0] = f;
        float f2 = c18522.f55313;
        fArr[3] = f2;
        fArr[1] = f2;
        float fM42099 = c18522.m42099();
        fArr[4] = fM42099;
        fArr[2] = fM42099;
        float fM42100 = abstractC20003.f60813.m42100();
        fArr[7] = fM42100;
        fArr[5] = fM42100;
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
        AbstractC20003 abstractC20004 = (AbstractC20003) this.f60410.peek();
        C18522 c18523 = abstractC20004.f60813;
        if (c18523 == null) {
            abstractC20004.f60813 = new C18522(f3, f4, f6 - f3, f5 - f4);
            return;
        }
        C18522 c18524 = this.f60407;
        c18524.f55312 = f3;
        c18524.f55313 = f4;
        c18524.f55314 = f6 - f3;
        c18524.f55311 = f5 - f4;
        c18523.getClass();
        float f9 = c18524.f55312;
        if (f9 < c18523.f55312) {
            c18523.f55312 = f9;
        }
        float f10 = c18524.f55313;
        if (f10 < c18523.f55313) {
            c18523.f55313 = f10;
        }
        if (c18524.m42099() > c18523.m42099()) {
            c18523.f55314 = c18524.m42099() - c18523.f55312;
        }
        if (c18524.m42100() > c18523.m42100()) {
            c18523.f55311 = c18524.m42100() - c18523.f55313;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45151(C18522 c18522) {
        if (this.f60409.f29066.f69284 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f60415;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C22547 c22547 = (C22547) this.f60418.m40613(this.f60409.f29066.f69284);
            m45155(c22547, c18522);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m45155(c22547, c18522);
            canvas.restore();
            canvas.restore();
        }
        m45170();
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m45158() {
        AbstractC20674 abstractC20674M40613;
        if (this.f60409.f29066.f69280.floatValue() >= 1.0f && this.f60409.f29066.f69284 == null) {
            return false;
        }
        this.f60415.saveLayerAlpha(null, m45121(this.f60409.f29066.f69280.floatValue()), 31);
        this.f60413.push(this.f60409);
        C10496 c10496 = new C10496(this.f60409);
        this.f60409 = c10496;
        String str = c10496.f29066.f69284;
        if (str != null && ((abstractC20674M40613 = this.f60418.m40613(str)) == null || !(abstractC20674M40613 instanceof C22547))) {
            C22015 c22015 = this.f60409.f29066;
            String str2 = c22015.f69284;
            c22015.f69284 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18522 m45133(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C18522(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX INFO: renamed from: ܳ */
    private EnumC18661 m45165() {
        EnumC18661 enumC18661;
        C22015 c22015 = this.f60409.f29066;
        if (c22015.f69262 == EnumC24696.LTR || (enumC18661 = c22015.f69281) == EnumC18661.Middle) {
            return c22015.f69281;
        }
        EnumC18661 enumC18662 = EnumC18661.Start;
        return enumC18661 == enumC18662 ? EnumC18661.End : enumC18662;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45146(AbstractC11956 abstractC11956, AbstractC4461 abstractC4461) {
        float f;
        float fM5261;
        float fM5260;
        EnumC18661 enumC18661M45165;
        AbstractC20674 abstractC20674M40613;
        if (m45169()) {
            Iterator it = abstractC11956.f51671.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C7262 c7262 = (C7262) it.next();
                if (c7262 instanceof C15307) {
                    abstractC4461.mo9366(m45131(((C15307) c7262).f43690, z, !it.hasNext()));
                } else if (abstractC4461.mo9367((AbstractC11956) c7262)) {
                    float fM5262 = 0.0f;
                    if (c7262 instanceof C7932) {
                        m45160();
                        C7932 c7932 = (C7932) c7262;
                        m45141(this.f60409, c7932);
                        if (m45169() && m45166() && (abstractC20674M40613 = c7932.f18929.m40613(c7932.f20806)) != null) {
                            C6453 c6453 = (C6453) abstractC20674M40613;
                            Path path = new C24577(c6453.f16680).f77810;
                            Matrix matrix = c6453.f60375;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            C3099 c3099 = c7932.f20807;
                            fM5262 = c3099 != null ? c3099.m5258(this, pathMeasure.getLength()) : 0.0f;
                            EnumC18661 enumC18661M45166 = m45165();
                            if (enumC18661M45166 != EnumC18661.Start) {
                                float fM45120 = m45120((AbstractC11956) c7932);
                                if (enumC18661M45166 == EnumC18661.Middle) {
                                    fM45120 /= 2.0f;
                                }
                                fM5262 -= fM45120;
                            }
                            m45153((AbstractC20003) c7932.mo11325());
                            boolean zM45158 = m45158();
                            m45146(c7932, new C8484(this, path, fM5262));
                            if (zM45158) {
                                m45151(c7932.f60813);
                            }
                        }
                        m45170();
                    } else if (c7262 instanceof C5250) {
                        m45160();
                        C5250 c5250 = (C5250) c7262;
                        m45141(this.f60409, c5250);
                        if (m45169()) {
                            ArrayList arrayList = c5250.f37355;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC4461 instanceof C21896;
                            if (z3) {
                                float fM5263 = !z2 ? ((C21896) abstractC4461).f68873 : ((C3099) c5250.f37355.get(0)).m5260(this);
                                ArrayList arrayList2 = c5250.f37352;
                                fM5261 = (arrayList2 == null || arrayList2.size() == 0) ? ((C21896) abstractC4461).f68874 : ((C3099) c5250.f37352.get(0)).m5261(this);
                                ArrayList arrayList3 = c5250.f37353;
                                fM5260 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C3099) c5250.f37353.get(0)).m5260(this);
                                ArrayList arrayList4 = c5250.f37354;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fM5262 = ((C3099) c5250.f37354.get(0)).m5261(this);
                                }
                                f = fM5262;
                                fM5262 = fM5263;
                            } else {
                                f = 0.0f;
                                fM5261 = 0.0f;
                                fM5260 = 0.0f;
                            }
                            if (z2 && (enumC18661M45165 = m45165()) != EnumC18661.Start) {
                                float fM45121 = m45120((AbstractC11956) c5250);
                                if (enumC18661M45165 == EnumC18661.Middle) {
                                    fM45121 /= 2.0f;
                                }
                                fM5262 -= fM45121;
                            }
                            m45153((AbstractC20003) c5250.mo11325());
                            if (z3) {
                                C21896 c21896 = (C21896) abstractC4461;
                                c21896.f68873 = fM5262 + fM5260;
                                c21896.f68874 = fM5261 + f;
                            }
                            boolean zM45159 = m45158();
                            m45146(c5250, abstractC4461);
                            if (zM45159) {
                                m45151(c5250.f60813);
                            }
                        }
                        m45170();
                    } else if (c7262 instanceof C6591) {
                        m45160();
                        C6591 c6591 = (C6591) c7262;
                        m45141(this.f60409, c6591);
                        if (m45169()) {
                            m45153((AbstractC20003) c6591.mo11325());
                            AbstractC20674 abstractC20674M40614 = c7262.f18929.m40613(c6591.f17018);
                            if (abstractC20674M40614 != null && (abstractC20674M40614 instanceof AbstractC11956)) {
                                StringBuilder sb = new StringBuilder();
                                m45145((AbstractC11956) abstractC20674M40614, sb);
                                if (sb.length() > 0) {
                                    abstractC4461.mo9366(sb.toString());
                                }
                            }
                        }
                        m45170();
                    }
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private float m45120(AbstractC11956 abstractC11956) {
        C5802 c5802 = new C5802(this);
        m45146(abstractC11956, c5802);
        return c5802.f14260;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45145(AbstractC11956 abstractC11956, StringBuilder sb) {
        Iterator it = abstractC11956.f51671.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C7262 c7262 = (C7262) it.next();
            if (c7262 instanceof AbstractC11956) {
                m45145((AbstractC11956) c7262, sb);
            } else if (c7262 instanceof C15307) {
                sb.append(m45131(((C15307) c7262).f43690, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m45131(String str, boolean z, boolean z2) {
        if (this.f60409.f29069) {
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

    /* JADX INFO: renamed from: ܿ */
    private boolean m45169() {
        Boolean bool = this.f60409.f29066.f69278;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public boolean m45166() {
        Boolean bool = this.f60409.f29066.f69263;
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix m45124(C18522 c18522, C18522 c18523, C17851 c17851) {
        int i;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (c17851 != null && c17851.m40525() != null) {
            float f3 = c18522.f55314 / c18523.f55314;
            float f4 = c18522.f55311 / c18523.f55311;
            float f5 = -c18523.f55312;
            float f6 = -c18523.f55313;
            if (c17851.equals(C17851.f53251)) {
                matrix.preTranslate(c18522.f55312, c18522.f55313);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float fMax = c17851.m40526() == EnumC12488.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = c18522.f55314 / fMax;
            float f8 = c18522.f55311 / fMax;
            int[] iArr = C19213.f57407;
            switch (iArr[c17851.m40525().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (c18523.f55314 - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = c18523.f55314 - f7;
                    break;
                default:
                    i = iArr[c17851.m40525().ordinal()];
                    if (i == 2) {
                        f = (c18523.f55311 - f8) / 2.0f;
                        f6 -= f;
                    } else {
                        if (i != 3) {
                            if (i != 5) {
                                if (i != 6) {
                                    if (i != 7) {
                                    }
                                }
                            }
                            f = (c18523.f55311 - f8) / 2.0f;
                            f6 -= f;
                        }
                        f = c18523.f55311 - f8;
                        f6 -= f;
                    }
                    matrix.preTranslate(c18522.f55312, c18522.f55313);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f5, f6);
                    break;
            }
            f5 -= f2;
            i = iArr[c17851.m40525().ordinal()];
            if (i == 2) {
                f = (c18523.f55311 - f8) / 2.0f;
                f6 -= f;
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f = (c18523.f55311 - f8) / 2.0f;
                    f6 -= f;
                }
                f = c18523.f55311 - f8;
                f6 -= f;
            }
            matrix.preTranslate(c18522.f55312, c18522.f55313);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45157(C22015 c22015, long j) {
        return (j & c22015.f69273) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45142(C10496 c10496, C22015 c22015) {
        if (m45157(c22015, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c10496.f29066.f69265 = c22015.f69265;
        }
        if (m45157(c22015, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c10496.f29066.f69280 = c22015.f69280;
        }
        boolean zM45157 = m45157(c22015, 1L);
        C21876 c21876 = C21876.f68814;
        if (zM45157) {
            c10496.f29066.f69277 = c22015.f69277;
            AbstractC3238 abstractC3238 = c22015.f69277;
            c10496.f29065 = (abstractC3238 == null || abstractC3238 == c21876) ? false : true;
        }
        if (m45157(c22015, 4L)) {
            c10496.f29066.f69274 = c22015.f69274;
        }
        if (m45157(c22015, 6149L)) {
            m45143(c10496, true, c10496.f29066.f69277);
        }
        if (m45157(c22015, 2L)) {
            c10496.f29066.f69268 = c22015.f69268;
        }
        if (m45157(c22015, 8L)) {
            c10496.f29066.f69261 = c22015.f69261;
            AbstractC3238 abstractC3239 = c22015.f69261;
            c10496.f29067 = (abstractC3239 == null || abstractC3239 == c21876) ? false : true;
        }
        if (m45157(c22015, 16L)) {
            c10496.f29066.f69259 = c22015.f69259;
        }
        if (m45157(c22015, 6168L)) {
            m45143(c10496, false, c10496.f29066.f69261);
        }
        if (m45157(c22015, 34359738368L)) {
            c10496.f29066.f69294 = c22015.f69294;
        }
        if (m45157(c22015, 32L)) {
            C22015 c22016 = c10496.f29066;
            C3099 c3099 = c22015.f69271;
            c22016.f69271 = c3099;
            c10496.f29068.setStrokeWidth(c3099.m5257(this));
        }
        if (m45157(c22015, 64L)) {
            C22015 c22017 = c10496.f29066;
            Paint paint = c10496.f29068;
            c22017.f69287 = c22015.f69287;
            int i = C19213.f57408[c22015.f69287.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m45157(c22015, 128L)) {
            C22015 c22018 = c10496.f29066;
            Paint paint2 = c10496.f29068;
            c22018.f69258 = c22015.f69258;
            int i2 = C19213.f57409[c22015.f69258.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m45157(c22015, 256L)) {
            c10496.f29066.f69267 = c22015.f69267;
            c10496.f29068.setStrokeMiter(c22015.f69267.floatValue());
        }
        if (m45157(c22015, 512L)) {
            c10496.f29066.f69264 = c22015.f69264;
        }
        if (m45157(c22015, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)) {
            c10496.f29066.f69286 = c22015.f69286;
        }
        Typeface typefaceM45130 = null;
        if (m45157(c22015, 1536L)) {
            C22015 c22019 = c10496.f29066;
            Paint paint3 = c10496.f29068;
            C3099[] c3099Arr = c22019.f69264;
            if (c3099Arr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c3099Arr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float fM5257 = c22019.f69264[i4 % length].m5257(this);
                    fArr[i4] = fM5257;
                    f += fM5257;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fM5258 = c22019.f69286.m5257(this);
                    if (fM5258 < 0.0f) {
                        fM5258 = (fM5258 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fM5258));
                }
            }
        }
        if (m45157(c22015, 16384L)) {
            float fM45172 = m45172();
            c10496.f29066.f69295 = c22015.f69295;
            c10496.f29063.setTextSize(c22015.f69295.m5258(this, fM45172));
            c10496.f29068.setTextSize(c22015.f69295.m5258(this, fM45172));
        }
        if (m45157(c22015, 8192L)) {
            c10496.f29066.f69276 = c22015.f69276;
        }
        if (m45157(c22015, X931RNG.BLOCK64_RESEED_MAX)) {
            if (c22015.f69270.intValue() == -1 && c10496.f29066.f69270.intValue() > 100) {
                C22015 c220110 = c10496.f29066;
                c220110.f69270 = Integer.valueOf(c220110.f69270.intValue() - 100);
            } else if (c22015.f69270.intValue() == 1 && c10496.f29066.f69270.intValue() < 900) {
                C22015 c220111 = c10496.f29066;
                c220111.f69270 = Integer.valueOf(c220111.f69270.intValue() + 100);
            } else {
                c10496.f29066.f69270 = c22015.f69270;
            }
        }
        if (m45157(c22015, 65536L)) {
            c10496.f29066.f69279 = c22015.f69279;
        }
        if (m45157(c22015, 106496L)) {
            C22015 c220112 = c10496.f29066;
            ArrayList arrayList = c220112.f69276;
            if (arrayList != null && this.f60418 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceM45130 = m45130((String) it.next(), c220112.f69270, c220112.f69279)) == null) {
                }
            }
            if (typefaceM45130 == null) {
                typefaceM45130 = m45130("serif", c220112.f69270, c220112.f69279);
            }
            c10496.f29063.setTypeface(typefaceM45130);
            c10496.f29068.setTypeface(typefaceM45130);
        }
        if (m45157(c22015, 131072L)) {
            C22015 c220113 = c10496.f29066;
            Paint paint4 = c10496.f29068;
            Paint paint5 = c10496.f29063;
            c220113.f69292 = c22015.f69292;
            EnumC15978 enumC15978 = c22015.f69292;
            EnumC15978 enumC15979 = EnumC15978.LineThrough;
            paint5.setStrikeThruText(enumC15978 == enumC15979);
            EnumC15978 enumC159710 = c22015.f69292;
            EnumC15978 enumC159711 = EnumC15978.Underline;
            paint5.setUnderlineText(enumC159710 == enumC159711);
            paint4.setStrikeThruText(c22015.f69292 == enumC15979);
            paint4.setUnderlineText(c22015.f69292 == enumC159711);
        }
        if (m45157(c22015, 68719476736L)) {
            c10496.f29066.f69262 = c22015.f69262;
        }
        if (m45157(c22015, 262144L)) {
            c10496.f29066.f69281 = c22015.f69281;
        }
        if (m45157(c22015, 524288L)) {
            c10496.f29066.f69296 = c22015.f69296;
        }
        if (m45157(c22015, 2097152L)) {
            c10496.f29066.f69285 = c22015.f69285;
        }
        if (m45157(c22015, 4194304L)) {
            c10496.f29066.f69283 = c22015.f69283;
        }
        if (m45157(c22015, X931RNG.BLOCK128_RESEED_MAX)) {
            c10496.f29066.f69275 = c22015.f69275;
        }
        if (m45157(c22015, 16777216L)) {
            c10496.f29066.f69278 = c22015.f69278;
        }
        if (m45157(c22015, 33554432L)) {
            c10496.f29066.f69263 = c22015.f69263;
        }
        if (m45157(c22015, 1048576L)) {
            c10496.f29066.f69291 = c22015.f69291;
        }
        if (m45157(c22015, 268435456L)) {
            c10496.f29066.f69293 = c22015.f69293;
        }
        if (m45157(c22015, 536870912L)) {
            c10496.f29066.f69288 = c22015.f69288;
        }
        if (m45157(c22015, 1073741824L)) {
            c10496.f29066.f69284 = c22015.f69284;
        }
        if (m45157(c22015, 67108864L)) {
            c10496.f29066.f69272 = c22015.f69272;
        }
        if (m45157(c22015, 134217728L)) {
            c10496.f29066.f69282 = c22015.f69282;
        }
        if (m45157(c22015, 8589934592L)) {
            c10496.f29066.f69289 = c22015.f69289;
        }
        if (m45157(c22015, 17179869184L)) {
            c10496.f29066.f69266 = c22015.f69266;
        }
        if (m45157(c22015, 137438953472L)) {
            c10496.f29066.f69260 = c22015.f69260;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45143(C10496 c10496, boolean z, AbstractC3238 abstractC3238) {
        int i;
        C22015 c22015 = c10496.f29066;
        float fFloatValue = (z ? c22015.f69274 : c22015.f69259).floatValue();
        if (abstractC3238 instanceof C21876) {
            i = ((C21876) abstractC3238).f68816;
        } else if (!(abstractC3238 instanceof C11147)) {
            return;
        } else {
            i = c10496.f29066.f69265.f68816;
        }
        int iM45122 = m45122(fFloatValue, i);
        if (z) {
            c10496.f29063.setColor(iM45122);
        } else {
            c10496.f29068.setColor(iM45122);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX INFO: renamed from: ֫ */
    public static Typeface m45130(String str, Integer num, EnumC3909 enumC3909) {
        int i;
        boolean z = enumC3909 == EnumC3909.Italic;
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

    /* JADX INFO: renamed from: ֫ */
    public static int m45122(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45135(float f, float f2, float f3, float f4) {
        float fM5260 = f3 + f;
        float fM5261 = f4 + f2;
        C15839 c15839 = this.f60409.f29066.f69291;
        if (c15839 != null) {
            f += c15839.f45892.m5260(this);
            f2 += this.f60409.f29066.f69291.f45894.m5261(this);
            fM5260 -= this.f60409.f29066.f69291.f45893.m5260(this);
            fM5261 -= this.f60409.f29066.f69291.f45891.m5261(this);
        }
        this.f60415.clipRect(f, f2, fM5260, fM5261);
    }

    /* JADX INFO: renamed from: ۡ */
    private void m45159() {
        int iM45122;
        C22015 c22015 = this.f60409.f29066;
        AbstractC3238 abstractC3238 = c22015.f69289;
        if (abstractC3238 instanceof C21876) {
            iM45122 = ((C21876) abstractC3238).f68816;
        } else if (!(abstractC3238 instanceof C11147)) {
            return;
        } else {
            iM45122 = c22015.f69265.f68816;
        }
        Float f = c22015.f69266;
        if (f != null) {
            iM45122 = m45122(f.floatValue(), iM45122);
        }
        this.f60415.drawColor(iM45122);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45136(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC14499 interfaceC14499) {
        double dAcos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC14499.mo10895(f6, f7);
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
            interfaceC14499.mo10892(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45152(AbstractC19864 abstractC19864) {
        C16510 c16510;
        C16510 c16511;
        C16510 c16512;
        ArrayList arrayList;
        float f;
        float f2;
        ArrayList arrayListM42216;
        int size;
        C22015 c22015 = this.f60409.f29066;
        String str = c22015.f69285;
        if (str == null && c22015.f69283 == null && c22015.f69275 == null) {
            return;
        }
        if (str == null) {
            c16510 = null;
        } else {
            AbstractC20674 abstractC20674M40613 = abstractC19864.f18929.m40613(str);
            if (abstractC20674M40613 != null) {
                c16510 = (C16510) abstractC20674M40613;
            } else {
                String str2 = this.f60409.f29066.f69285;
                c16510 = null;
            }
        }
        String str3 = this.f60409.f29066.f69283;
        if (str3 == null) {
            c16511 = null;
        } else {
            AbstractC20674 abstractC20674M40614 = abstractC19864.f18929.m40613(str3);
            if (abstractC20674M40614 != null) {
                c16511 = (C16510) abstractC20674M40614;
            } else {
                String str4 = this.f60409.f29066.f69283;
                c16511 = null;
            }
        }
        String str5 = this.f60409.f29066.f69275;
        if (str5 == null) {
            c16512 = null;
        } else {
            AbstractC20674 abstractC20674M40615 = abstractC19864.f18929.m40613(str5);
            if (abstractC20674M40615 != null) {
                c16512 = (C16510) abstractC20674M40615;
            } else {
                String str6 = this.f60409.f29066.f69275;
                c16512 = null;
            }
        }
        if (abstractC19864 instanceof C6453) {
            arrayListM42216 = new C18542(this, ((C6453) abstractC19864).f16680).m42216();
        } else {
            if (abstractC19864 instanceof C9805) {
                C9805 c9805 = (C9805) abstractC19864;
                C3099 c3099 = c9805.f27141;
                float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
                C3099 c30910 = c9805.f27139;
                float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
                C3099 c30911 = c9805.f27142;
                float fM5262 = c30911 != null ? c30911.m5260(this) : 0.0f;
                C3099 c30912 = c9805.f27140;
                float fM5263 = c30912 != null ? c30912.m5261(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f3 = fM5262 - fM5260;
                float f4 = fM5263 - fM5261;
                arrayList.add(new C15859(fM5260, fM5261, f3, f4));
                arrayList.add(new C15859(fM5262, fM5263, f3, f4));
            } else {
                C11818 c11818 = (C11818) abstractC19864;
                int length = c11818.f32982.length;
                if (length < 2) {
                    arrayListM42216 = null;
                } else {
                    arrayList = new ArrayList();
                    float[] fArr = c11818.f32982;
                    C15859 c15859 = new C15859(fArr[0], fArr[1], 0.0f, 0.0f);
                    int i = 2;
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    while (true) {
                        f = c15859.f45937;
                        f2 = c15859.f45938;
                        if (i >= length) {
                            break;
                        }
                        float[] fArr2 = c11818.f32982;
                        float f7 = fArr2[i];
                        float f8 = fArr2[i + 1];
                        c15859.m35995(f7, f8);
                        arrayList.add(c15859);
                        c15859 = new C15859(f7, f8, f7 - f2, f8 - f);
                        i += 2;
                        f6 = f8;
                        f5 = f7;
                    }
                    if (c11818 instanceof C7794) {
                        float[] fArr3 = c11818.f32982;
                        float f9 = fArr3[0];
                        if (f5 != f9) {
                            float f10 = fArr3[1];
                            if (f6 != f10) {
                                c15859.m35995(f9, f10);
                                arrayList.add(c15859);
                                C15859 c158510 = new C15859(f9, f10, f9 - f2, f10 - f);
                                c158510.m35996((C15859) arrayList.get(0));
                                arrayList.add(c158510);
                                arrayList.set(0, c158510);
                            }
                        }
                    } else {
                        arrayList.add(c15859);
                    }
                }
            }
            arrayListM42216 = arrayList;
        }
        if (arrayListM42216 == null || (size = arrayListM42216.size()) == 0) {
            return;
        }
        C22015 c22016 = this.f60409.f29066;
        c22016.f69275 = null;
        c22016.f69283 = null;
        c22016.f69285 = null;
        if (c16510 != null) {
            m45148(c16510, (C15859) arrayListM42216.get(0));
        }
        if (c16511 != null && arrayListM42216.size() > 2) {
            int i2 = 1;
            C15859 c158511 = (C15859) arrayListM42216.get(0);
            C15859 c158512 = (C15859) arrayListM42216.get(1);
            while (i2 < size - 1) {
                i2++;
                C15859 c158513 = (C15859) arrayListM42216.get(i2);
                if (c158512.f45936) {
                    float f11 = c158512.f45934;
                    float f12 = c158512.f45935;
                    float f13 = c158512.f45938;
                    float f14 = f13 - c158511.f45938;
                    float f15 = c158512.f45937;
                    float f16 = ((f15 - c158511.f45937) * f12) + (f14 * f11);
                    if (f16 == 0.0f) {
                        f16 = ((c158513.f45938 - f13) * f11) + ((c158513.f45937 - f15) * f12);
                    }
                    if (f16 <= 0.0f && (f16 != 0.0f || (f11 <= 0.0f && f12 < 0.0f))) {
                        c158512.f45934 = -f11;
                        c158512.f45935 = -f12;
                    }
                }
                m45148(c16511, c158512);
                c158511 = c158512;
                c158512 = c158513;
            }
        }
        if (c16512 != null) {
            m45148(c16512, (C15859) arrayListM42216.get(size - 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0104, code lost:
    
        if (r8 != 8) goto L67;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m45148(C16510 c16510, C15859 c15859) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        m45160();
        Float f4 = c16510.f48531;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = c15859.f45934;
            if (f6 == 0.0f && c15859.f45935 == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(c15859.f45935, f6));
            }
        } else {
            fFloatValue = c16510.f48531.floatValue();
        }
        float fM5256 = c16510.f48530 ? 1.0f : this.f60409.f29066.f69271.m5256(this.f60408);
        this.f60409 = m45132((AbstractC20674) c16510);
        Matrix matrix = new Matrix();
        matrix.preTranslate(c15859.f45938, c15859.f45937);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fM5256, fM5256);
        C3099 c3099 = c16510.f48533;
        float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
        C3099 c30910 = c16510.f48534;
        float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
        C3099 c30911 = c16510.f48532;
        float fM5262 = c30911 != null ? c30911.m5260(this) : 3.0f;
        C3099 c30912 = c16510.f48535;
        float fM5263 = c30912 != null ? c30912.m5261(this) : 3.0f;
        C18522 c18522 = c16510.f71564;
        Canvas canvas = this.f60415;
        if (c18522 != null) {
            float fMax = fM5262 / c18522.f55314;
            float f7 = fM5263 / c18522.f55311;
            C17851 c17851 = c16510.f27540;
            if (c17851 == null) {
                c17851 = C17851.f53250;
            }
            if (!c17851.equals(C17851.f53251)) {
                fMax = c17851.m40526() == EnumC12488.slice ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fM5260) * fMax, (-fM5261) * f7);
            canvas.concat(matrix);
            C18522 c18523 = c16510.f71564;
            float f8 = c18523.f55314 * fMax;
            float f9 = c18523.f55311 * f7;
            int[] iArr = C19213.f57407;
            switch (iArr[c17851.m40525().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f = (fM5262 - f8) / 2.0f;
                    f2 = 0.0f - f;
                    break;
                case 4:
                case 5:
                case 6:
                    f = fM5262 - f8;
                    f2 = 0.0f - f;
                    break;
                default:
                    f2 = 0.0f;
                    break;
            }
            int i = iArr[c17851.m40525().ordinal()];
            if (i == 2) {
                f3 = (fM5263 - f9) / 2.0f;
                f5 = 0.0f - f3;
            } else {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                    f3 = (fM5263 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                }
                f3 = fM5263 - f9;
                f5 = 0.0f - f3;
            }
            if (!this.f60409.f29066.f69296.booleanValue()) {
                m45135(f2, f5, fM5262, fM5263);
            }
            matrix.reset();
            matrix.preScale(fMax, f7);
            canvas.concat(matrix);
        } else {
            matrix.preTranslate(-fM5260, -fM5261);
            canvas.concat(matrix);
            if (!this.f60409.f29066.f69296.booleanValue()) {
                m45135(0.0f, 0.0f, fM5262, fM5263);
            }
        }
        boolean zM45158 = m45158();
        m45150((AbstractC17319) c16510, false);
        if (zM45158) {
            m45151(c16510.f60813);
        }
        m45170();
    }

    /* JADX INFO: renamed from: ֫ */
    private C10496 m45132(AbstractC20674 abstractC20674) {
        C10496 c10496 = new C10496();
        m45142(c10496, C22015.m49618());
        m45140(abstractC20674, c10496);
        return c10496;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45140(C7262 c7262, C10496 c10496) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c7262 instanceof AbstractC20674) {
                arrayList.add(0, (AbstractC20674) c7262);
            }
            Object obj = c7262.f18930;
            if (obj == null) {
                break;
            } else {
                c7262 = (C7262) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m45141(c10496, (AbstractC20674) it.next());
        }
        C10496 c10497 = this.f60409;
        c10496.f29070 = c10497.f29070;
        c10496.f29064 = c10497.f29064;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45153(AbstractC20003 abstractC20003) {
        AbstractC3238 abstractC3238 = this.f60409.f29066.f69277;
        if (abstractC3238 instanceof C21206) {
            m45156(true, abstractC20003.f60813, (C21206) abstractC3238);
        }
        AbstractC3238 abstractC3239 = this.f60409.f29066.f69261;
        if (abstractC3239 instanceof C21206) {
            m45156(false, abstractC20003.f60813, (C21206) abstractC3239);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45156(boolean z, C18522 c18522, C21206 c21206) {
        float fM5258;
        float fM5259;
        float fM52510;
        float fM52511;
        float f;
        float f2;
        float f3;
        AbstractC20674 abstractC20674M40613 = this.f60418.m40613(c21206.f66690);
        int i = 0;
        int i2 = 0;
        if (abstractC20674M40613 == null) {
            AbstractC3238 abstractC3238 = c21206.f66689;
            if (abstractC3238 != null) {
                m45143(this.f60409, z, abstractC3238);
                return;
            } else if (z) {
                this.f60409.f29065 = false;
                return;
            } else {
                this.f60409.f29067 = false;
                return;
            }
        }
        boolean z2 = abstractC20674M40613 instanceof C2567;
        C21876 c21876 = C21876.f68815;
        float f4 = -1.0f;
        if (z2) {
            C2567 c2567 = (C2567) abstractC20674M40613;
            String str = c2567.f9965;
            if (str != null) {
                m45137(c2567, str);
            }
            Boolean bool = c2567.f9966;
            boolean z3 = bool != null && bool.booleanValue();
            C10496 c10496 = this.f60409;
            Paint paint = z ? c10496.f29063 : c10496.f29068;
            if (z3) {
                C18522 c18522M45175 = m45175();
                C3099 c3099 = c2567.f4233;
                float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
                C3099 c30910 = c2567.f4235;
                float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
                C3099 c30911 = c2567.f4234;
                float fM5262 = c30911 != null ? c30911.m5260(this) : c18522M45175.f55314;
                C3099 c30912 = c2567.f4236;
                f3 = fM5262;
                f = fM5260;
                f2 = fM5261;
                fM52511 = c30912 != null ? c30912.m5261(this) : 0.0f;
            } else {
                C3099 c30913 = c2567.f4233;
                float fM52512 = c30913 != null ? c30913.m5258(this, 1.0f) : 0.0f;
                C3099 c30914 = c2567.f4235;
                float fM52513 = c30914 != null ? c30914.m5258(this, 1.0f) : 0.0f;
                C3099 c30915 = c2567.f4234;
                float fM52514 = c30915 != null ? c30915.m5258(this, 1.0f) : 1.0f;
                C3099 c30916 = c2567.f4236;
                fM52511 = c30916 != null ? c30916.m5258(this, 1.0f) : 0.0f;
                f = fM52512;
                f2 = fM52513;
                f3 = fM52514;
            }
            m45160();
            this.f60409 = m45132((AbstractC20674) c2567);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c18522.f55312, c18522.f55313);
                matrix.preScale(c18522.f55314, c18522.f55311);
            }
            Matrix matrix2 = c2567.f9968;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c2567.f9964.size();
            if (size == 0) {
                m45170();
                if (z) {
                    this.f60409.f29065 = false;
                    return;
                } else {
                    this.f60409.f29067 = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c2567.f9964.iterator();
            while (it.hasNext()) {
                C15169 c15169 = (C15169) ((C7262) it.next());
                Float f5 = c15169.f43279;
                float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
                if (i == 0 || fFloatValue >= f4) {
                    fArr[i] = fFloatValue;
                    f4 = fFloatValue;
                } else {
                    fArr[i] = f4;
                }
                m45160();
                m45141(this.f60409, c15169);
                C22015 c22015 = this.f60409.f29066;
                C21876 c21877 = (C21876) c22015.f69272;
                if (c21877 == null) {
                    c21877 = c21876;
                }
                iArr[i] = m45122(c22015.f69282.floatValue(), c21877.f68816);
                i++;
                m45170();
            }
            if ((f == f3 && f2 == fM52511) || size == 1) {
                m45170();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            EnumC5782 enumC5782 = c2567.f9967;
            if (enumC5782 != null) {
                if (enumC5782 == EnumC5782.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC5782 == EnumC5782.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m45170();
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, fM52511, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m45121(this.f60409.f29066.f69274.floatValue()));
            return;
        }
        if (abstractC20674M40613 instanceof C16648) {
            C16648 c16648 = (C16648) abstractC20674M40613;
            String str2 = c16648.f9965;
            if (str2 != null) {
                m45137(c16648, str2);
            }
            Boolean bool2 = c16648.f9966;
            boolean z4 = bool2 != null && bool2.booleanValue();
            C10496 c10497 = this.f60409;
            Paint paint2 = z ? c10497.f29063 : c10497.f29068;
            if (z4) {
                C3099 c30917 = new C3099(50.0f, EnumC9273.percent);
                C3099 c30918 = c16648.f48915;
                fM5258 = c30918 != null ? c30918.m5260(this) : c30917.m5260(this);
                C3099 c30919 = c16648.f48916;
                fM5259 = c30919 != null ? c30919.m5261(this) : c30917.m5261(this);
                C3099 c30920 = c16648.f48914;
                fM52510 = c30920 != null ? c30920.m5257(this) : c30917.m5257(this);
            } else {
                C3099 c30921 = c16648.f48915;
                fM5258 = c30921 != null ? c30921.m5258(this, 1.0f) : 0.5f;
                C3099 c30922 = c16648.f48916;
                fM5259 = c30922 != null ? c30922.m5258(this, 1.0f) : 0.5f;
                C3099 c30923 = c16648.f48914;
                fM52510 = c30923 != null ? c30923.m5258(this, 1.0f) : 0.5f;
            }
            float f6 = fM52510;
            float f7 = fM5258;
            float f8 = fM5259;
            m45160();
            this.f60409 = m45132((AbstractC20674) c16648);
            Matrix matrix3 = new Matrix();
            if (!z4) {
                matrix3.preTranslate(c18522.f55312, c18522.f55313);
                matrix3.preScale(c18522.f55314, c18522.f55311);
            }
            Matrix matrix4 = c16648.f9968;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c16648.f9964.size();
            if (size2 == 0) {
                m45170();
                if (z) {
                    this.f60409.f29065 = false;
                    return;
                } else {
                    this.f60409.f29067 = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator it2 = c16648.f9964.iterator();
            while (it2.hasNext()) {
                C15169 c151610 = (C15169) ((C7262) it2.next());
                Float f9 = c151610.f43279;
                float fFloatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                if (i2 == 0 || fFloatValue2 >= f4) {
                    fArr2[i2] = fFloatValue2;
                    f4 = fFloatValue2;
                } else {
                    fArr2[i2] = f4;
                }
                m45160();
                m45141(this.f60409, c151610);
                C22015 c22016 = this.f60409.f29066;
                C21876 c21878 = (C21876) c22016.f69272;
                if (c21878 == null) {
                    c21878 = c21876;
                }
                iArr2[i2] = m45122(c22016.f69282.floatValue(), c21878.f68816);
                i2++;
                m45170();
            }
            if (f6 == 0.0f || size2 == 1) {
                m45170();
                paint2.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            EnumC5782 enumC5783 = c16648.f9967;
            if (enumC5783 != null) {
                if (enumC5783 == EnumC5782.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (enumC5783 == EnumC5782.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            m45170();
            RadialGradient radialGradient = new RadialGradient(f7, f8, f6, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint2.setShader(radialGradient);
            paint2.setAlpha(m45121(this.f60409.f29066.f69274.floatValue()));
            return;
        }
        if (abstractC20674M40613 instanceof C23887) {
            C23887 c23887 = (C23887) abstractC20674M40613;
            if (z) {
                if (m45157(c23887.f63862, 2147483648L)) {
                    C10496 c10498 = this.f60409;
                    C22015 c22017 = c10498.f29066;
                    AbstractC3238 abstractC3239 = c23887.f63862.f69269;
                    c22017.f69277 = abstractC3239;
                    c10498.f29065 = abstractC3239 != null;
                }
                if (m45157(c23887.f63862, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                    this.f60409.f29066.f69274 = c23887.f63862.f69290;
                }
                if (m45157(c23887.f63862, 6442450944L)) {
                    C10496 c10499 = this.f60409;
                    m45143(c10499, z, c10499.f29066.f69277);
                    return;
                }
                return;
            }
            if (m45157(c23887.f63862, 2147483648L)) {
                C10496 c104910 = this.f60409;
                C22015 c22018 = c104910.f29066;
                AbstractC3238 abstractC32310 = c23887.f63862.f69269;
                c22018.f69261 = abstractC32310;
                c104910.f29067 = abstractC32310 != null;
            }
            if (m45157(c23887.f63862, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                this.f60409.f29066.f69259 = c23887.f63862.f69290;
            }
            if (m45157(c23887.f63862, 6442450944L)) {
                C10496 c104911 = this.f60409;
                m45143(c104911, z, c104911.f29066.f69261);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45137(AbstractC4441 abstractC4441, String str) {
        AbstractC20674 abstractC20674M40613 = abstractC4441.f18929.m40613(str);
        if (abstractC20674M40613 == null || !(abstractC20674M40613 instanceof AbstractC4441) || abstractC20674M40613 == abstractC4441) {
            return;
        }
        AbstractC4441 abstractC4442 = (AbstractC4441) abstractC20674M40613;
        if (abstractC4441.f9966 == null) {
            abstractC4441.f9966 = abstractC4442.f9966;
        }
        if (abstractC4441.f9968 == null) {
            abstractC4441.f9968 = abstractC4442.f9968;
        }
        if (abstractC4441.f9967 == null) {
            abstractC4441.f9967 = abstractC4442.f9967;
        }
        if (abstractC4441.f9964.isEmpty()) {
            abstractC4441.f9964 = abstractC4442.f9964;
        }
        try {
            if (abstractC4441 instanceof C2567) {
                C2567 c2567 = (C2567) abstractC4441;
                C2567 c2568 = (C2567) abstractC20674M40613;
                if (c2567.f4233 == null) {
                    c2567.f4233 = c2568.f4233;
                }
                if (c2567.f4235 == null) {
                    c2567.f4235 = c2568.f4235;
                }
                if (c2567.f4234 == null) {
                    c2567.f4234 = c2568.f4234;
                }
                if (c2567.f4236 == null) {
                    c2567.f4236 = c2568.f4236;
                }
            } else {
                m45149((C16648) abstractC4441, (C16648) abstractC20674M40613);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC4442.f9965;
        if (str2 != null) {
            m45137(abstractC4441, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45149(C16648 c16648, C16648 c16649) {
        if (c16648.f48915 == null) {
            c16648.f48915 = c16649.f48915;
        }
        if (c16648.f48916 == null) {
            c16648.f48916 = c16649.f48916;
        }
        if (c16648.f48914 == null) {
            c16648.f48914 = c16649.f48914;
        }
        if (c16648.f48917 == null) {
            c16648.f48917 = c16649.f48917;
        }
        if (c16648.f48918 == null) {
            c16648.f48918 = c16649.f48918;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45164(AbstractC20003 abstractC20003, C18522 c18522) {
        Path pathM45128;
        if (this.f60409.f29066.f69293 == null || (pathM45128 = m45128(abstractC20003, c18522)) == null) {
            return;
        }
        this.f60415.clipPath(pathM45128);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: ֫ */
    private Path m45128(AbstractC20003 abstractC20003, C18522 c18522) {
        Path pathM45161;
        AbstractC20674 abstractC20674M40613 = abstractC20003.f18929.m40613(this.f60409.f29066.f69293);
        if (abstractC20674M40613 == null) {
            String str = this.f60409.f29066.f69293;
            return null;
        }
        C8464 c8464 = (C8464) abstractC20674M40613;
        this.f60413.push(this.f60409);
        this.f60409 = m45132((AbstractC20674) c8464);
        Boolean bool = c8464.f22721;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c18522.f55312, c18522.f55313);
            matrix.preScale(c18522.f55314, c18522.f55311);
        }
        Matrix matrix2 = c8464.f63457;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C7262 c7262 : c8464.f51671) {
            if ((c7262 instanceof AbstractC20003) && (pathM45161 = m45161((AbstractC20003) c7262)) != null) {
                path.op(pathM45161, Path.Op.UNION);
            }
        }
        if (this.f60409.f29066.f69293 != null) {
            if (c8464.f60813 == null) {
                c8464.f60813 = m45133(path);
            }
            Path pathM45128 = m45128(c8464, c8464.f60813);
            if (pathM45128 != null) {
                path.op(pathM45128, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f60409 = (C10496) this.f60413.pop();
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01aa  */
    @TargetApi(19)
    /* JADX INFO: renamed from: ۧ */
    private Path m45161(AbstractC20003 abstractC20003) {
        Path path;
        Path pathM45128;
        this.f60413.push(this.f60409);
        C10496 c10496 = new C10496(this.f60409);
        this.f60409 = c10496;
        m45141(c10496, abstractC20003);
        if (!m45169() || !m45166()) {
            this.f60409 = (C10496) this.f60413.pop();
            return null;
        }
        if (abstractC20003 instanceof C3790) {
            C3790 c3790 = (C3790) abstractC20003;
            AbstractC20674 abstractC20674M40613 = abstractC20003.f18929.m40613(c3790.f8114);
            if (abstractC20674M40613 == null) {
                this.f60409 = (C10496) this.f60413.pop();
                return null;
            }
            if (!(abstractC20674M40613 instanceof AbstractC20003)) {
                this.f60409 = (C10496) this.f60413.pop();
                return null;
            }
            path = m45161((AbstractC20003) abstractC20674M40613);
            if (path != null) {
                if (c3790.f60813 == null) {
                    c3790.f60813 = m45133(path);
                }
                Matrix matrix = c3790.f63457;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f60409.f29066.f69293 != null && (pathM45128 = m45128(abstractC20003, abstractC20003.f60813)) != null) {
                    path.op(pathM45128, Path.Op.INTERSECT);
                }
                this.f60409 = (C10496) this.f60413.pop();
                return path;
            }
            return null;
        }
        if (abstractC20003 instanceof AbstractC19864) {
            AbstractC19864 abstractC19864 = (AbstractC19864) abstractC20003;
            if (abstractC20003 instanceof C6453) {
                path = new C24577(((C6453) abstractC20003).f16680).f77810;
                if (abstractC20003.f60813 == null) {
                    abstractC20003.f60813 = m45133(path);
                }
            } else if (abstractC20003 instanceof C13159) {
                path = m45126((C13159) abstractC20003);
            } else if (abstractC20003 instanceof C24557) {
                path = m45129((C24557) abstractC20003);
            } else if (abstractC20003 instanceof C17180) {
                path = m45127((C17180) abstractC20003);
            } else {
                path = abstractC20003 instanceof C11818 ? m45125((C11818) abstractC20003) : null;
            }
            if (path != null) {
                if (abstractC19864.f60813 == null) {
                    abstractC19864.f60813 = m45133(path);
                }
                Matrix matrix2 = abstractC19864.f60375;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(m45171());
                if (this.f60409.f29066.f69293 != null) {
                    path.op(pathM45128, Path.Op.INTERSECT);
                }
                this.f60409 = (C10496) this.f60413.pop();
                return path;
            }
            return null;
        }
        if (abstractC20003 instanceof C14637) {
            C14637 c14637 = (C14637) abstractC20003;
            ArrayList arrayList = c14637.f37355;
            float fM5261 = 0.0f;
            float fM5260 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C3099) c14637.f37355.get(0)).m5260(this);
            ArrayList arrayList2 = c14637.f37352;
            float fM5262 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C3099) c14637.f37352.get(0)).m5261(this);
            ArrayList arrayList3 = c14637.f37353;
            float fM5263 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C3099) c14637.f37353.get(0)).m5260(this);
            ArrayList arrayList4 = c14637.f37354;
            if (arrayList4 != null && arrayList4.size() != 0) {
                fM5261 = ((C3099) c14637.f37354.get(0)).m5261(this);
            }
            if (this.f60409.f29066.f69281 != EnumC18661.Start) {
                float fM45120 = m45120((AbstractC11956) c14637);
                if (this.f60409.f29066.f69281 == EnumC18661.Middle) {
                    fM45120 /= 2.0f;
                }
                fM5260 -= fM45120;
            }
            if (c14637.f60813 == null) {
                C17200 c17200 = new C17200(this, fM5260, fM5262);
                m45146(c14637, c17200);
                RectF rectF = c17200.f51199;
                c14637.f60813 = new C18522(rectF.left, rectF.top, rectF.width(), c17200.f51199.height());
            }
            path = new Path();
            m45146(c14637, new C11167(this, fM5260 + fM5263, fM5262 + fM5261, path));
            Matrix matrix3 = c14637.f41776;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(m45171());
            if (this.f60409.f29066.f69293 != null) {
                path.op(pathM45128, Path.Op.INTERSECT);
            }
            this.f60409 = (C10496) this.f60413.pop();
            return path;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩻ */
    private Path.FillType m45171() {
        EnumC9135 enumC9135 = this.f60409.f29066.f69288;
        if (enumC9135 != null && enumC9135 == EnumC9135.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* JADX INFO: renamed from: ֫ */
    private Path m45126(C13159 c13159) {
        float fM5260;
        float fM5261;
        Path path;
        C3099 c3099 = c13159.f36984;
        if (c3099 == null && c13159.f36979 == null) {
            fM5260 = 0.0f;
            fM5261 = 0.0f;
        } else {
            if (c3099 == null) {
                fM5260 = c13159.f36979.m5261(this);
            } else if (c13159.f36979 == null) {
                fM5260 = c3099.m5260(this);
            } else {
                fM5260 = c3099.m5260(this);
                fM5261 = c13159.f36979.m5261(this);
            }
            fM5261 = fM5260;
        }
        float fMin = Math.min(fM5260, c13159.f36981.m5260(this) / 2.0f);
        float fMin2 = Math.min(fM5261, c13159.f36983.m5261(this) / 2.0f);
        C3099 c30910 = c13159.f36980;
        float fM5262 = c30910 != null ? c30910.m5260(this) : 0.0f;
        C3099 c30911 = c13159.f36982;
        float fM5263 = c30911 != null ? c30911.m5261(this) : 0.0f;
        float fM5264 = c13159.f36981.m5260(this);
        float fM5265 = c13159.f36983.m5261(this);
        if (c13159.f60813 == null) {
            c13159.f60813 = new C18522(fM5262, fM5263, fM5264, fM5265);
        }
        float f = fM5264 + fM5262;
        float f2 = fM5263 + fM5265;
        Path path2 = new Path();
        if (fMin == 0.0f || fMin2 == 0.0f) {
            path = path2;
            path.moveTo(fM5262, fM5263);
            path.lineTo(f, fM5263);
            path.lineTo(f, f2);
            path.lineTo(fM5262, f2);
            path.lineTo(fM5262, fM5263);
        } else {
            float f3 = fMin * 0.5522848f;
            float f4 = 0.5522848f * fMin2;
            float f5 = fM5263 + fMin2;
            path2.moveTo(fM5262, f5);
            float f6 = f5 - f4;
            float f7 = fM5262 + fMin;
            float f8 = f7 - f3;
            path2.cubicTo(fM5262, f6, f8, fM5263, f7, fM5263);
            float f9 = f - fMin;
            path2.lineTo(f9, fM5263);
            float f10 = f9 + f3;
            path2.cubicTo(f10, fM5263, f, f6, f, f5);
            float f11 = f2 - fMin2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, fM5262, f12, fM5262, f11);
            path.lineTo(fM5262, f5);
        }
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫ */
    private Path m45129(C24557 c24557) {
        C3099 c3099 = c24557.f77761;
        float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
        C3099 c30910 = c24557.f77762;
        float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
        float fM5257 = c24557.f77760.m5257(this);
        float f = fM5260 - fM5257;
        float f2 = fM5261 - fM5257;
        float f3 = fM5260 + fM5257;
        float f4 = fM5261 + fM5257;
        if (c24557.f60813 == null) {
            float f5 = 2.0f * fM5257;
            c24557.f60813 = new C18522(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fM5257;
        Path path = new Path();
        path.moveTo(fM5260, f2);
        float f7 = fM5260 + f6;
        float f8 = fM5261 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fM5261);
        float f9 = fM5261 + f6;
        path.cubicTo(f3, f9, f7, f4, fM5260, f4);
        float f10 = fM5260 - f6;
        path.cubicTo(f10, f4, f, f9, f, fM5261);
        path.cubicTo(f, f8, f10, f2, fM5260, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫ */
    private Path m45127(C17180 c17180) {
        C3099 c3099 = c17180.f51148;
        float fM5260 = c3099 != null ? c3099.m5260(this) : 0.0f;
        C3099 c30910 = c17180.f51149;
        float fM5261 = c30910 != null ? c30910.m5261(this) : 0.0f;
        float fM5262 = c17180.f51146.m5260(this);
        float fM5263 = c17180.f51147.m5261(this);
        float f = fM5260 - fM5262;
        float f2 = fM5261 - fM5263;
        float f3 = fM5260 + fM5262;
        float f4 = fM5261 + fM5263;
        if (c17180.f60813 == null) {
            c17180.f60813 = new C18522(f, f2, fM5262 * 2.0f, 2.0f * fM5263);
        }
        float f5 = fM5262 * 0.5522848f;
        float f6 = 0.5522848f * fM5263;
        Path path = new Path();
        path.moveTo(fM5260, f2);
        float f7 = fM5260 + f5;
        float f8 = fM5261 - f6;
        float f9 = fM5261;
        path.cubicTo(f7, f2, f3, f8, f3, f9);
        float f10 = f6 + fM5261;
        path.cubicTo(f3, f10, f7, f4, fM5260, f4);
        float f11 = fM5260 - f5;
        path.cubicTo(f11, f4, f, f10, f, f9);
        path.cubicTo(f, f8, f11, f2, fM5260, f2);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Path m45125(C11818 c11818) {
        Path path = new Path();
        float[] fArr = c11818.f32982;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c11818.f32982;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c11818 instanceof C7794) {
            path.close();
        }
        if (c11818.f60813 == null) {
            c11818.f60813 = m45133(path);
        }
        return path;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45147(C13829 c13829, String str) {
        AbstractC20674 abstractC20674M40613 = c13829.f18929.m40613(str);
        if (abstractC20674M40613 == null || !(abstractC20674M40613 instanceof C13829) || abstractC20674M40613 == c13829) {
            return;
        }
        C13829 c138210 = (C13829) abstractC20674M40613;
        if (c13829.f39083 == null) {
            c13829.f39083 = c138210.f39083;
        }
        if (c13829.f39082 == null) {
            c13829.f39082 = c138210.f39082;
        }
        if (c13829.f39081 == null) {
            c13829.f39081 = c138210.f39081;
        }
        if (c13829.f39086 == null) {
            c13829.f39086 = c138210.f39086;
        }
        if (c13829.f39087 == null) {
            c13829.f39087 = c138210.f39087;
        }
        if (c13829.f39084 == null) {
            c13829.f39084 = c138210.f39084;
        }
        if (c13829.f39085 == null) {
            c13829.f39085 = c138210.f39085;
        }
        if (c13829.f51671.isEmpty()) {
            c13829.f51671 = c138210.f51671;
        }
        if (c13829.f71564 == null) {
            c13829.f71564 = c138210.f71564;
        }
        if (c13829.f27540 == null) {
            c13829.f27540 = c138210.f27540;
        }
        String str2 = c138210.f39080;
        if (str2 != null) {
            m45147(c13829, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45155(C22547 c22547, C18522 c18522) {
        float fM5260;
        float fM5261;
        Boolean bool = c22547.f71124;
        if (bool != null && bool.booleanValue()) {
            C3099 c3099 = c22547.f71121;
            fM5260 = c3099 != null ? c3099.m5260(this) : c18522.f55314;
            C3099 c30910 = c22547.f71122;
            fM5261 = c30910 != null ? c30910.m5261(this) : c18522.f55311;
        } else {
            C3099 c30911 = c22547.f71121;
            float fM5258 = c30911 != null ? c30911.m5258(this, 1.0f) : 1.2f;
            C3099 c30912 = c22547.f71122;
            float fM5259 = c30912 != null ? c30912.m5258(this, 1.0f) : 1.2f;
            fM5260 = fM5258 * c18522.f55314;
            fM5261 = fM5259 * c18522.f55311;
        }
        if (fM5260 == 0.0f || fM5261 == 0.0f) {
            return;
        }
        m45160();
        C10496 c10496M45132 = m45132((AbstractC20674) c22547);
        this.f60409 = c10496M45132;
        c10496M45132.f29066.f69280 = Float.valueOf(1.0f);
        boolean zM45158 = m45158();
        Canvas canvas = this.f60415;
        canvas.save();
        Boolean bool2 = c22547.f71123;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c18522.f55312, c18522.f55313);
            canvas.scale(c18522.f55314, c18522.f55311);
        }
        m45150((AbstractC17319) c22547, false);
        canvas.restore();
        if (zM45158) {
            m45151(c18522);
        }
        m45170();
    }
}
