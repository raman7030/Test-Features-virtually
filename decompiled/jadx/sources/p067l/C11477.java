package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۢ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes3.dex */
public class C11477 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C20579 f31994;

    /* JADX INFO: renamed from: ۟ */
    public static final String[] f31995;

    /* JADX INFO: renamed from: ܰ */
    public static final String[] f31996;

    /* JADX INFO: renamed from: ֡ */
    public boolean f31997;

    /* JADX INFO: renamed from: ֨ */
    public float f31998;

    /* JADX INFO: renamed from: ֫ */
    public final float[] f31999;

    /* JADX INFO: renamed from: ۖ */
    public final float f32000;

    /* JADX INFO: renamed from: ۗ */
    public int f32001;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC24887 f32002;

    /* JADX INFO: renamed from: ۙ */
    public float f32003;

    /* JADX INFO: renamed from: ۚ */
    public float f32004;

    /* JADX INFO: renamed from: ۛ */
    public final C3831 f32005;

    /* JADX INFO: renamed from: ۜ */
    public boolean f32006;

    /* JADX INFO: renamed from: ۠ */
    public float f32007;

    /* JADX INFO: renamed from: ۡ */
    public float f32008;

    /* JADX INFO: renamed from: ۢ */
    public float f32009;

    /* JADX INFO: renamed from: ۤ */
    public int f32010;

    /* JADX INFO: renamed from: ۧ */
    public final float[] f32011;

    /* JADX INFO: renamed from: ۨ */
    public C4771 f32012;

    /* JADX INFO: renamed from: ۫ */
    public int f32013;

    /* JADX INFO: renamed from: ۬ */
    public float f32014;

    /* JADX INFO: renamed from: ܳ */
    public final float f32015;

    /* JADX INFO: renamed from: ܶ */
    public float f32016;

    /* JADX INFO: renamed from: ܺ */
    public int f32017;

    /* JADX INFO: renamed from: ܽ */
    public final char[] f32018;

    /* JADX INFO: renamed from: ܿ */
    public float f32019;

    /* JADX INFO: renamed from: ᩳ */
    public final C14224 f32020;

    /* JADX INFO: renamed from: ᩴ */
    public final Rect f32021;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f32022;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f32023;

    /* JADX INFO: renamed from: ᩷ */
    public float f32024;

    /* JADX INFO: renamed from: ᩸ */
    public float f32025;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f32026;

    /* JADX INFO: renamed from: ᩺ */
    public final C20194 f32027;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f32028;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = String.valueOf(c);
        }
        f31995 = strArr;
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = "NUL";
        strArr2[1] = "SOH";
        strArr2[2] = "STX";
        strArr2[3] = "ETX";
        strArr2[4] = "EOT";
        strArr2[5] = "ENQ";
        strArr2[6] = "ACK";
        strArr2[7] = "BEL";
        strArr2[8] = "BS";
        strArr2[11] = "VT";
        strArr2[12] = "FF";
        strArr2[14] = "SO";
        strArr2[15] = "SI";
        strArr2[16] = "DLE";
        strArr2[17] = "DC1";
        strArr2[18] = "DC2";
        strArr2[19] = "DC3";
        strArr2[20] = "DC4";
        strArr2[21] = "NAK";
        strArr2[22] = "SYN";
        strArr2[23] = "ETB";
        strArr2[24] = "CAN";
        strArr2[25] = "EM";
        strArr2[26] = "SUB";
        strArr2[27] = "ESC";
        strArr2[28] = "FS";
        strArr2[29] = "GS";
        strArr2[30] = "RS";
        strArr2[31] = "US";
        strArr2[127] = "DEL";
        f31996 = strArr2;
        char[] cArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 173, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8287, 8288, 8289, 8290, 8291, 8292, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 65279};
        String[] strArr3 = {"HOP", "BPH", "NBH", "IND", "NEL", "SSA", "ESA", "HTS", "HTJ", "VTS", "PLD", "PLU", "RI", "SS2", "SS3", "DCS", "PU1", "PU2", "STS", "CCH", "MW", "SPA", "EPA", "SOS", "SGCI", "SCI", "CSI", "ST", "OSC", "PM", "APC", "NBSP", "SHY", "NQSP", "MQSP", "ENSP", "EMSP", "3/MSP", "4/MSP", "6/MSP", "FSP", "PSP", "THSP", "HSP", "ZWSP", "ZWNJ", "ZWJ", "LRM", "RLM", "LSEP", "PSEP", "LRE", "RLE", "PDF", "LRO", "RLO", "NNBSP", "MMSP", "WJ", "f()", "x", ",", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "LRI", "RLI", "FSI", "PDI", "ISS", "ASS", "IAFS", "AAFS", "NADS", "NODS", "ZWNBSP"};
        C20579 c20579 = new C20579(74);
        for (int i = 0; i < 74; i++) {
            c20579.mo15129(cArr[i], strArr3[i]);
        }
        f31994 = c20579;
    }

    public C11477(Context context) {
        this.f32025 = 1.0f;
        this.f32027 = new C20194();
        this.f32020 = C12213.m28193(new C22531());
        this.f32028 = false;
        this.f32006 = false;
        this.f31997 = false;
        this.f32013 = 4;
        this.f32026 = false;
        this.f32023 = true;
        this.f32022 = false;
        this.f32011 = new float[128];
        this.f31999 = new float[128];
        this.f32021 = new Rect();
        this.f32018 = new char[256];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f32015 = displayMetrics.density;
        this.f32000 = displayMetrics.scaledDensity;
        C3831 c3831 = new C3831(0);
        this.f32005 = c3831;
        c3831.setTextAlign(Paint.Align.LEFT);
        c3831.setStyle(Paint.Style.FILL);
        c3831.setTypeface(Typeface.DEFAULT);
        m26495();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11477 m26500() {
        return new C11477(this);
    }

    public C11477(C11477 c11477) {
        this.f32025 = 1.0f;
        this.f32027 = new C20194();
        this.f32020 = C12213.m28193(new C22531());
        this.f32028 = false;
        this.f32006 = false;
        this.f31997 = false;
        this.f32013 = 4;
        this.f32026 = false;
        this.f32023 = true;
        this.f32022 = false;
        float[] fArr = new float[128];
        this.f32011 = fArr;
        float[] fArr2 = new float[128];
        this.f31999 = fArr2;
        this.f32021 = new Rect();
        this.f32018 = new char[256];
        this.f32015 = c11477.f32015;
        this.f32000 = c11477.f32000;
        this.f32005 = new C3831(c11477.f32005);
        this.f32010 = c11477.f32010;
        this.f32008 = c11477.f32008;
        this.f32017 = c11477.f32017;
        this.f32009 = c11477.f32009;
        this.f32025 = c11477.f32025;
        this.f32016 = c11477.f32016;
        this.f32007 = c11477.f32007;
        this.f32019 = c11477.f32019;
        this.f32024 = c11477.f32024;
        this.f32003 = c11477.f32003;
        this.f32014 = c11477.f32014;
        this.f32028 = c11477.f32028;
        this.f32006 = c11477.f32006;
        this.f31997 = c11477.f31997;
        this.f32013 = c11477.f32013;
        this.f31998 = c11477.f31998;
        this.f32004 = c11477.f32004;
        this.f32026 = c11477.f32026;
        this.f32023 = c11477.f32023;
        this.f32001 = c11477.f32001;
        System.arraycopy(c11477.f32011, 0, fArr, 0, 128);
        System.arraycopy(c11477.f31999, 0, fArr2, 0, 128);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m26508() {
        return this.f32009;
    }

    /* JADX INFO: renamed from: ۜ */
    public final float m26496() {
        return this.f32016;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final float m26513() {
        return this.f32007;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final float m26512() {
        return this.f32025;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26489(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        this.f32025 = f;
        m26478(this.f32005.getFontMetrics());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26478(Paint.FontMetrics fontMetrics) {
        float fontSpacing = this.f32005.getFontSpacing() * this.f32025;
        this.f32016 = fontSpacing;
        Math.ceil(fontSpacing);
        float f = fontMetrics.ascent;
        this.f32007 = ((this.f32016 - (fontMetrics.descent - f)) / 2.0f) + (-f);
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m26507() {
        return this.f32008;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m26503() {
        return this.f32017;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m26505() {
        return this.f32019;
    }

    /* JADX INFO: renamed from: ۢ */
    public final float m26498() {
        return this.f32003;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m26504() {
        return this.f32010;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26501(int i) {
        this.f32010 = i;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m26494() {
        return this.f32028;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26491(boolean z) {
        this.f32028 = z;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m26510() {
        return this.f31997;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26502(boolean z) {
        this.f31997 = z;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m26497() {
        return this.f32013;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26490(int i) {
        this.f32013 = i;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m26511() {
        return this.f32026;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26506(boolean z) {
        this.f32026 = z;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m26482() {
        return this.f32023;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26509(boolean z) {
        this.f32023 = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۖ */
    public final void m26493() {
        float[] fArr;
        float[] fArr2;
        C3831 c3831 = this.f32005;
        Paint.FontMetrics fontMetrics = c3831.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f32008 = f;
        this.f32017 = (int) Math.ceil(f);
        this.f32001 = (int) Math.ceil(this.f32008 / 25.0f);
        this.f32019 = c3831.measureText("我");
        this.f32024 = c3831.measureText("�");
        this.f32009 = -fontMetrics.top;
        m26478(fontMetrics);
        float fMeasureText = c3831.measureText("n");
        float fMeasureText2 = c3831.measureText(" ");
        if (fMeasureText2 < fMeasureText) {
            fMeasureText2 = C21740.m49018(fMeasureText, fMeasureText2, 0.62f, fMeasureText2);
        }
        this.f32003 = (float) Math.ceil(fMeasureText2);
        this.f32014 = (float) Math.ceil(fMeasureText2 / 2.0f);
        int i = 0;
        while (true) {
            fArr = this.f31999;
            fArr2 = this.f32011;
            if (i >= 128) {
                break;
            }
            String str = f31995[i];
            String str2 = f31996[i];
            if (str.equals(str2)) {
                float fMeasureText3 = c3831.measureText(str);
                fArr[i] = fMeasureText3;
                fArr2[i] = fMeasureText3;
            } else {
                fArr2[i] = c3831.measureText(str);
                fArr[i] = c3831.measureText(str2) + (this.f32001 * 2);
            }
            i++;
        }
        float f2 = this.f32003;
        fArr2[0] = f2 / 50.0f;
        fArr2[32] = f2;
        fArr2[10] = f2;
        fArr2[13] = f2;
        fArr[32] = f2;
        fArr[10] = f2;
        fArr[13] = f2;
        this.f32006 = fArr2[105] == fArr2[119] && fArr2[46] == fArr2[109];
        int iMeasureText = (int) (c3831.measureText("Z") + 1.0f);
        int i2 = (int) (this.f32008 + 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        c3831.setColor(-16777216);
        canvas.drawText("Z", 0.0f, this.f32009, c3831);
        int[] iArr = new int[i2];
        bitmapCreateBitmap.getPixels(iArr, 0, 1, iMeasureText / 2, 0, 1, i2);
        bitmapCreateBitmap.recycle();
        this.f31998 = 0.0f;
        this.f32004 = this.f32008;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != -1) {
                this.f31998 = i3;
                break;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (iArr[i4] != -1) {
                this.f32004 = i4;
                break;
            }
        }
        this.f32027.m45695();
        this.f32020.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m26499(CharSequence charSequence, int i, int i2, float f) {
        return m26481(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m26487(CharSequence charSequence, int i, int i2, float f, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid maximum text width");
        }
        return m26481(charSequence, i, i2, f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c A[PHI: r7
      0x016c: PHI (r7v29 java.lang.String) = (r7v25 java.lang.String), (r7v28 java.lang.String), (r7v37 java.lang.String) binds: [B:96:0x016a, B:90:0x0157, B:85:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0116. Please report as an issue. */
    /* JADX INFO: renamed from: ۧ */
    private float m26481(CharSequence charSequence, int i, int i2, float f, float f2) {
        C3831 c3831;
        C20194 c20194;
        boolean z;
        boolean z2;
        char c;
        char c2;
        C22206 c22206;
        int i3;
        boolean z3;
        float fM26480;
        float fFloatValue;
        int iM52676;
        String str;
        Float fM45694;
        float fFloatValue2;
        int i4;
        int i5;
        String string;
        Float fM45695;
        if (i < 0) {
            return 0.0f;
        }
        boolean z4 = this.f32026;
        float[] fArr = this.f32011;
        float[] fArr2 = z4 ? this.f31999 : fArr;
        boolean z5 = this.f32023;
        C22206 c22207 = (f2 == Float.POSITIVE_INFINITY && (charSequence instanceof C22206)) ? (C22206) charSequence : null;
        int i6 = i;
        int i7 = i6;
        float fFloatValue3 = 0.0f;
        boolean z6 = false;
        while (true) {
            c3831 = this.f32005;
            c20194 = this.f32027;
            if (i6 >= i2 || fFloatValue3 >= f2) {
                z = z6;
                i6 = i7;
                z2 = z;
            } else {
                if (z6) {
                    int iM52677 = C23669.m52676(i6, i2, charSequence);
                    c2 = 0;
                    boolean z7 = z6;
                    if (iM52677 - i6 == 1) {
                        char cCharAt = charSequence.charAt(i6);
                        byte bM32656 = C14177.m32656(cCharAt);
                        i5 = iM52677;
                        if (bM32656 == 15) {
                            if (C15517.m35316(cCharAt)) {
                                string = charSequence.subSequence(i7, i6).toString();
                                fM45695 = c20194.m45694(string);
                                if (fM45695 == null) {
                                    fM45695 = Float.valueOf(c3831.measureText(string));
                                    c20194.m45696(string, fM45695);
                                }
                                fFloatValue3 += fM45695.floatValue();
                                if (fFloatValue3 >= f2) {
                                    z2 = false;
                                } else {
                                    i7 = i6;
                                    z6 = false;
                                    c = 1;
                                }
                            }
                        } else if (bM32656 != 8 || z5) {
                            string = charSequence.subSequence(i7, i6).toString();
                            fM45695 = c20194.m45694(string);
                            if (fM45695 == null) {
                                fM45695 = Float.valueOf(c3831.measureText(string));
                                c20194.m45696(string, fM45695);
                            }
                            fFloatValue3 += fM45695.floatValue();
                            if (fFloatValue3 >= f2) {
                                z2 = false;
                            } else {
                                i7 = i6;
                                z6 = false;
                                c = 1;
                            }
                        }
                    } else {
                        i5 = iM52677;
                    }
                    z6 = z7;
                    i6 = i5;
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (c22207 != null) {
                    c22207.m50027(i6);
                    char[] cArr = c22207.f70234;
                    i3 = i7;
                    int iMin = Math.min(i2, c22207.f70232);
                    int i8 = i6 - c22207.f70231;
                    while (true) {
                        if (i6 < iMin) {
                            c22206 = c22207;
                            char c3 = cArr[i8];
                            z3 = z6;
                            if (c3 <= 127 && c3 != '\t') {
                                int i9 = C8142.f21498;
                                if ((('0' <= c3 && c3 <= '9') || c3 == '#' || c3 == '*') && (i4 = i6 + 1) < i2) {
                                    if (i4 == iMin || cArr[i8 + 1] > 127) {
                                    }
                                }
                                fFloatValue3 += fArr2[c3];
                                i8++;
                                i6++;
                                c22207 = c22206;
                                z6 = z3;
                                cArr = cArr;
                            }
                        } else {
                            c22206 = c22207;
                            z3 = z6;
                        }
                    }
                    if (i6 == i2) {
                        i6 = i3;
                        z = z3;
                        z2 = z;
                    } else {
                        if (i6 == iMin) {
                            i7 = i3;
                            z6 = z3;
                        }
                        c22207 = c22206;
                    }
                } else {
                    c22206 = c22207;
                    i3 = i7;
                    z3 = z6;
                }
                char cCharAt2 = charSequence.charAt(i6);
                byte bM32657 = C14177.m32656(cCharAt2);
                C20579 c20579 = f31994;
                switch (bM32657) {
                    case 0:
                        fM26480 = this.f32019;
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 1:
                        fM26480 = this.f32003;
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 2:
                        float f3 = f + fFloatValue3;
                        float f4 = this.f32003;
                        float f5 = this.f32013 * f4;
                        float f6 = ((((int) (f3 / f5)) + 1) * f5) - f3;
                        if (f6 < f4) {
                            f6 += f5;
                        }
                        fFloatValue3 += f6;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 3:
                        int i10 = i2 - i6;
                        if (i10 >= 3 && charSequence.charAt(i6 + 1) == 65039 && charSequence.charAt(i6 + 2) == 8419) {
                            char[] cArr2 = new char[3];
                            cArr2[c2] = cCharAt2;
                            cArr2[c] = 65039;
                            cArr2[2] = 8419;
                            String str2 = new String(cArr2);
                            Float fM45696 = c20194.m45694(str2);
                            if (fM45696 == null) {
                                fM45696 = Float.valueOf(c3831.measureText(str2));
                                c20194.m45696(str2, fM45696);
                            }
                            fFloatValue = fM45696.floatValue() + fFloatValue3;
                            i6 += 3;
                        } else if (i10 >= 2 && charSequence.charAt(i6 + 1) == 8419) {
                            char[] cArr3 = new char[2];
                            cArr3[c2] = cCharAt2;
                            cArr3[c] = 8419;
                            String str3 = new String(cArr3);
                            Float fM45697 = c20194.m45694(str3);
                            if (fM45697 == null) {
                                fM45697 = Float.valueOf(c3831.measureText(str3));
                                c20194.m45696(str3, fM45697);
                            }
                            fFloatValue = fM45697.floatValue() + fFloatValue3;
                            i6 += 2;
                        } else {
                            fM26480 = fArr2[cCharAt2];
                            fFloatValue3 += fM26480;
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        }
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 4:
                        fM26480 = fArr2[cCharAt2];
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 5:
                        fM26480 = this.f32024;
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 6:
                        fM26480 = fArr[c2];
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 7:
                        fM26480 = m26480(cCharAt2);
                        fFloatValue3 += fM26480;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 8:
                        if (!z5) {
                            iM52676 = C23669.m52676(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM52676;
                        } else {
                            str = (String) c20579.mo15132(cCharAt2);
                            fM45694 = c20194.m45694(str);
                            if (fM45694 == null) {
                                fM45694 = Float.valueOf(c3831.measureText(str));
                                c20194.m45696(str, fM45694);
                            }
                            fFloatValue2 = fM45694.floatValue() + (this.f32001 * 2);
                            fFloatValue = fFloatValue2 + fFloatValue3;
                            i6++;
                            i7 = i3;
                            fFloatValue3 = fFloatValue;
                            z6 = z3;
                        }
                        break;
                    case 9:
                        if (!z5) {
                            fFloatValue2 = fArr[c2];
                        } else {
                            str = (String) c20579.mo15132(cCharAt2);
                            fM45694 = c20194.m45694(str);
                            if (fM45694 == null) {
                                fM45694 = Float.valueOf(c3831.measureText(str));
                                c20194.m45696(str, fM45694);
                            }
                            fFloatValue2 = fM45694.floatValue() + (this.f32001 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 10:
                        if (!z5) {
                            fFloatValue2 = this.f32003;
                        } else {
                            str = (String) c20579.mo15132(cCharAt2);
                            fM45694 = c20194.m45694(str);
                            if (fM45694 == null) {
                                fM45694 = Float.valueOf(c3831.measureText(str));
                                c20194.m45696(str, fM45694);
                            }
                            fFloatValue2 = fM45694.floatValue() + (this.f32001 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    default:
                        if (C15517.m35316(cCharAt2)) {
                            if (i6 > 0 && C15517.m35316(charSequence.charAt(i6 - 1))) {
                                if (C15517.m35313(cCharAt2)) {
                                    fM26480 = m26480(cCharAt2);
                                } else {
                                    fM26480 = this.f32014;
                                }
                                fFloatValue3 += fM26480;
                            }
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        } else {
                            iM52676 = C23669.m52676(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM52676;
                        }
                        break;
                }
                c22207 = c22206;
            }
        }
        if (z2) {
            String string2 = charSequence.subSequence(i6, i2).toString();
            Float fM45698 = c20194.m45694(string2);
            if (fM45698 == null) {
                fM45698 = Float.valueOf(c3831.measureText(string2));
                c20194.m45696(string2, fM45698);
            }
            fFloatValue3 += fM45698.floatValue();
        }
        return Math.min(fFloatValue3, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8794 m26488(CharSequence charSequence, int i, int i2, float f, C19627 c19627) {
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        return new C8794(this, charSequence, i, i2, f, c19627);
    }

    /* JADX INFO: renamed from: ۧ */
    private float m26480(char c) {
        C14224 c14224 = this.f32020;
        float fM32699 = c14224.m32699(c);
        if (fM32699 != -1.0f) {
            return fM32699;
        }
        float fMeasureText = this.f32005.measureText(String.valueOf(c));
        c14224.mo10447(fMeasureText, c);
        return fMeasureText;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m26483(char c) {
        return (this.f32026 ? this.f31999 : this.f32011)[c];
    }

    /* JADX INFO: renamed from: ֫ */
    public final float[] m26492() {
        return this.f32026 ? this.f31999 : this.f32011;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m26486(CharSequence charSequence, int i, int i2, float f) {
        boolean z = this.f32026;
        float[] fArr = this.f32011;
        float[] fArr2 = z ? this.f31999 : fArr;
        boolean z2 = this.f32023;
        int i3 = i2 - i;
        C20194 c20194 = this.f32027;
        if (i3 == 1) {
            char cCharAt = charSequence.charAt(i);
            byte bM32656 = C14177.m32656(cCharAt);
            C3831 c3831 = this.f32005;
            C20579 c20579 = f31994;
            switch (bM32656) {
                case 0:
                    return this.f32019;
                case 1:
                    return this.f32003;
                case 2:
                    return m26481(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
                case 3:
                case 4:
                    return fArr2[cCharAt];
                case 5:
                    return this.f32024;
                case 6:
                    return fArr[0];
                case 7:
                    return m26480(cCharAt);
                case 8:
                    if (z2) {
                        String str = (String) c20579.mo15132(cCharAt);
                        Float fM45694 = c20194.m45694(str);
                        if (fM45694 == null) {
                            fM45694 = Float.valueOf(c3831.measureText(str));
                            c20194.m45696(str, fM45694);
                        }
                        return fM45694.floatValue() + (this.f32001 * 2);
                    }
                    break;
                case 9:
                    if (!z2) {
                        return fArr[0];
                    }
                    String str2 = (String) c20579.mo15132(cCharAt);
                    Float fM45695 = c20194.m45694(str2);
                    if (fM45695 == null) {
                        fM45695 = Float.valueOf(c3831.measureText(str2));
                        c20194.m45696(str2, fM45695);
                    }
                    return fM45695.floatValue() + (this.f32001 * 2);
                case 10:
                    if (!z2) {
                        return this.f32003;
                    }
                    String str3 = (String) c20579.mo15132(cCharAt);
                    Float fM45696 = c20194.m45694(str3);
                    if (fM45696 == null) {
                        fM45696 = Float.valueOf(c3831.measureText(str3));
                        c20194.m45696(str3, fM45696);
                    }
                    return fM45696.floatValue() + (this.f32001 * 2);
            }
            if (C15517.m35316(cCharAt)) {
                if (i > 0 && C15517.m35316(charSequence.charAt(i - 1))) {
                    if (C15517.m35313(cCharAt)) {
                        return m26480(cCharAt);
                    }
                    return this.f32014;
                }
            } else if (cCharAt != 8205) {
                return m26480(cCharAt);
            }
            return 0.0f;
        }
        String string = charSequence.subSequence(i, i2).toString();
        Float fM45697 = c20194.m45694(string);
        if (fM45697 == null) {
            fM45697 = Float.valueOf(m26481(string, 0, string.length(), 0.0f, Float.POSITIVE_INFINITY));
            c20194.m45696(string, fM45697);
        }
        return fM45697.floatValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m26485(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z, C15427 c15427) {
        InterfaceC24887 interfaceC24887 = this.f32002;
        this.f32002 = c15427;
        try {
            return m26484(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
        } finally {
            this.f32002 = interfaceC24887;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26476(final Canvas canvas, final CharSequence charSequence, final int i, final int i2, final float f, final float f2, final Paint paint) {
        if (this.f32002 == null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            return;
        }
        boolean z = charSequence instanceof String;
        Rect rect = this.f32021;
        if (z) {
            paint.getTextBounds((String) charSequence, i, i2, rect);
        } else if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(charSequence, i, i2, rect);
        } else {
            int i3 = i2 - i;
            char[] cArr = new char[i3];
            TextUtils.getChars(charSequence, i, i2, cArr, 0);
            paint.getTextBounds(cArr, 0, i3, rect);
        }
        m26474(canvas, f, f2, paint, new Runnable() { // from class: l.ᩳ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawText(charSequence, i, i2, f, f2, paint);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26477(final Canvas canvas, final char[] cArr, final int i, final float f, final float f2, final Paint paint) {
        if (this.f32002 == null) {
            canvas.drawText(cArr, 0, i, f, f2, paint);
        } else {
            paint.getTextBounds(cArr, 0, i, this.f32021);
            m26474(canvas, f, f2, paint, new Runnable() { // from class: l.ܽ۫ۡ
                @Override // java.lang.Runnable
                public final void run() {
                    canvas.drawText(cArr, 0, i, f, f2, paint);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26474(Canvas canvas, float f, float f2, Paint paint, Runnable runnable) {
        Rect rect = this.f32021;
        if (rect.isEmpty()) {
            runnable.run();
        } else if (this.f32002.mo29367(canvas, paint, f + rect.left, f2 + rect.top, f + rect.right, f2 + rect.bottom, runnable)) {
            this.f32002 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26475(final Canvas canvas, final Paint paint, final float f, final float f2, final float f3, final float f4) {
        InterfaceC24887 interfaceC24887 = this.f32002;
        if (interfaceC24887 == null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else if (interfaceC24887.mo29367(canvas, paint, f, f2, f3, f4, new Runnable() { // from class: l.ܿ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        })) {
            this.f32002 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:325:0x0794  */
    /* JADX WARN: Code duplicated, block: B:327:0x0797  */
    /* JADX WARN: Code duplicated, block: B:351:0x07e1 A[PHI: r1 r5
      0x07e1: PHI (r1v92 int) = (r1v89 int), (r1v89 int), (r1v95 int), (r1v95 int) binds: [B:328:0x0798, B:330:0x079c, B:551:0x07e1, B:349:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x07e1: PHI (r5v39 float) = (r5v36 float), (r5v36 float), (r5v43 float), (r5v43 float) binds: [B:328:0x0798, B:330:0x079c, B:551:0x07e1, B:349:0x07d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x0911  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a85 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:458:0x0a8b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:465:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:466:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:468:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:470:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:473:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:475:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:478:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:480:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:481:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:484:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:487:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:492:0x0b51 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX INFO: renamed from: ֫ */
    public final float m26484(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
        float f4;
        int i6;
        CharSequence charSequence2;
        float f5;
        int i7;
        boolean z2;
        boolean z3;
        float fMeasureText;
        float fMeasureText2;
        float f6;
        float strikeThruPosition;
        float textSize;
        float underlinePosition;
        float textSize2;
        C4771 c4771;
        int i8;
        char c;
        C4771 c4772;
        int i9;
        boolean z4;
        float f7;
        char cCharAt;
        boolean z5;
        int i10;
        C4771 c4773;
        char c2;
        float fMeasureText3;
        int i11;
        boolean z6;
        float f8;
        int i12;
        int iM52676;
        float f9;
        C4771 c4774;
        float f10;
        C4771 c4775;
        float f11;
        int i13;
        C4771 c4776;
        boolean z7;
        int i14;
        boolean zM35316;
        canvas = canvas;
        CharSequence charSequence3 = charSequence;
        paint = paint;
        boolean z8 = this.f32022;
        boolean z9 = this.f32026;
        String[] strArr = z9 ? f31996 : f31995;
        float[] fArr = this.f32011;
        float[] fArr2 = z9 ? this.f31999 : fArr;
        boolean z10 = this.f32023;
        boolean z11 = (i5 & 1) != 0;
        boolean z12 = (i5 & 2) != 0;
        boolean z13 = (i5 & 4) != 0;
        boolean z14 = (i5 & 8) != 0;
        boolean z15 = (z || !(z13 || z14)) ? z : true;
        if (z11) {
            paint.setFakeBoldText(true);
        }
        final InterfaceC24887 interfaceC24887 = this.f32002;
        if (z12) {
            int iSave = canvas.save();
            float f12 = this.f32008 / 2.0f;
            canvas.translate(0.0f, (f2 - this.f32009) + f12);
            float f13 = this.f32009 - f12;
            canvas.skew(-0.2f, 0.0f);
            if (interfaceC24887 != null) {
                final float f14 = (f2 - this.f32009) + f12;
                this.f32002 = new InterfaceC24887() { // from class: l.ۧ۫ۡ
                    @Override // p067l.InterfaceC24887
                    /* JADX INFO: renamed from: ֫ */
                    public final boolean mo29367(final Canvas canvas2, Paint paint2, float f15, float f16, float f17, float f18, final Runnable runnable) {
                        final float f19 = f14;
                        InterfaceC24887 interfaceC24888 = interfaceC24887;
                        int iSave2 = canvas2.save();
                        try {
                            canvas2.skew(0.2f, 0.0f);
                            canvas2.translate(0.0f, -f19);
                            return interfaceC24888.mo29367(canvas2, paint2, f15 - (f18 * 0.2f), f16 + f19, f17 - (f16 * 0.2f), f18 + f19, new Runnable() { // from class: l.ܳ۫ۡ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    float f20 = f19;
                                    Runnable runnable2 = runnable;
                                    Canvas canvas3 = canvas2;
                                    int iSave3 = canvas3.save();
                                    try {
                                        canvas3.translate(0.0f, f20);
                                        canvas3.skew(-0.2f, 0.0f);
                                        runnable2.run();
                                    } finally {
                                        canvas3.restoreToCount(iSave3);
                                    }
                                }
                            });
                        } finally {
                            canvas2.restoreToCount(iSave2);
                        }
                    }
                };
            }
            i6 = iSave;
            f4 = f13;
        } else {
            f4 = f2;
            i6 = -1;
        }
        C4771 c4777 = this.f32012;
        int i15 = i;
        int iM52677 = i15;
        float f15 = f;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            boolean z18 = false;
            while (true) {
                if (iM52677 < i2) {
                    if (z8) {
                        int iM52678 = C23669.m52676(iM52677, i2, charSequence3);
                        c4771 = c4777;
                        i6 = i6;
                        if (iM52678 - iM52677 == 1) {
                            char cCharAt2 = charSequence3.charAt(iM52677);
                            byte bM32656 = C14177.m32656(cCharAt2);
                            interfaceC24887 = interfaceC24887;
                            if (bM32656 == 15) {
                                zM35316 = C15517.m35316(cCharAt2);
                                if (!zM35316) {
                                    interfaceC24887 = interfaceC24887;
                                }
                                if (zM35316) {
                                    if (cCharAt2 >= 768 || cCharAt2 > 1023) {
                                        zM35316 = false;
                                    } else {
                                        zM35316 = true;
                                    }
                                }
                                float fMeasureText4 = paint.measureText(charSequence3, i15, iM52677);
                                if (!z16 || f15 + fMeasureText4 < i3) {
                                    z2 = z16;
                                } else {
                                    z2 = true;
                                }
                                if (zM35316) {
                                    iM52677++;
                                }
                                i7 = iM52677;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c4771 = c4771;
                                    m26476(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c4771 = c4771;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText4;
                                z7 = this.f32022;
                                if ((z2 || f15 <= i4) && i7 < i2) {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                } else {
                                    charSequence2 = charSequence3;
                                    i14 = i7;
                                    canvas = canvas;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                }
                            } else if (bM32656 != 8 || z10) {
                                zM35316 = false;
                                if (zM35316) {
                                    if (cCharAt2 >= 768) {
                                        zM35316 = false;
                                    } else {
                                        zM35316 = false;
                                    }
                                }
                                float fMeasureText5 = paint.measureText(charSequence3, i15, iM52677);
                                if (z16) {
                                    z2 = z16;
                                } else {
                                    z2 = z16;
                                }
                                if (zM35316) {
                                    iM52677++;
                                }
                                i7 = iM52677;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c4771 = c4771;
                                    m26476(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c4771 = c4771;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText5;
                                z7 = this.f32022;
                                if (z2) {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                } else {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                }
                                charSequence2 = charSequence3;
                                i14 = i7;
                                canvas = canvas;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                interfaceC24887 = interfaceC24887;
                            }
                            if (!z8 || z3) {
                                if (z2) {
                                    fMeasureText = -1.0f;
                                } else {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                }
                                if (z2) {
                                    m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            } else {
                                f = f;
                            }
                            if (z11) {
                                paint.setFakeBoldText(false);
                            }
                            if (z12) {
                                canvas.restoreToCount(i6);
                                f4 = f2;
                            }
                            this.f32002 = interfaceC24887;
                            f6 = this.f32015;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f32008 * 0.85f) - this.f32009;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f16 = underlinePosition + f4;
                                m26475(canvas, paint, (int) f, f16, (int) (f15 + 1.0f), f16 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f32008 * 0.551f) - this.f32009;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f17 = f4 + strikeThruPosition;
                                m26475(canvas, paint, (int) f, f17, (int) (f15 + 1.0f), f17 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        interfaceC24887 = interfaceC24887;
                        i15 = i15;
                        iM52677 = iM52678;
                        c4777 = c4771;
                        z10 = z10;
                        i6 = i6;
                        interfaceC24887 = interfaceC24887;
                        fArr = fArr;
                        canvas = canvas;
                    } else {
                        c4771 = c4777;
                        i6 = i6;
                        interfaceC24887 = interfaceC24887;
                        z10 = z10;
                        fArr = fArr;
                        i8 = i15;
                        c = 0;
                        f5 = 0.0f;
                        i7 = iM52677;
                    }
                    char cCharAt3 = charSequence3.charAt(i7);
                    if (!z17) {
                        cCharAt3 = cCharAt3;
                        z18 = z18;
                        f15 = f15;
                        z17 = z17;
                        i15 = i8;
                    } else {
                        if (!C14177.m32657(cCharAt3)) {
                            float fMeasureText6 = paint.measureText(charSequence3, i8, i7);
                            z2 = (z16 || f15 + fMeasureText6 < ((float) i3)) ? z16 : true;
                            if (z2) {
                                m26476(canvas, charSequence, i8, i7, f15, f4, paint);
                            }
                            f15 += fMeasureText6;
                            if (!z2 || f15 <= i4) {
                                z18 = false;
                                i15 = i7;
                                z16 = z2;
                                f15 = f15;
                                z17 = false;
                            } else {
                                z3 = false;
                                charSequence2 = charSequence3;
                                canvas = canvas;
                            }
                            if (z8) {
                                if (z2) {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                } else {
                                    fMeasureText = -1.0f;
                                }
                                if (z2) {
                                    m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            } else {
                                if (z2) {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                } else {
                                    fMeasureText = -1.0f;
                                }
                                if (z2) {
                                    m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            }
                            if (z11) {
                                paint.setFakeBoldText(false);
                            }
                            if (z12) {
                                canvas.restoreToCount(i6);
                                f4 = f2;
                            }
                            this.f32002 = interfaceC24887;
                            f6 = this.f32015;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f32008 * 0.85f) - this.f32009;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f18 = underlinePosition + f4;
                                m26475(canvas, paint, (int) f, f18, (int) (f15 + 1.0f), f18 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f32008 * 0.551f) - this.f32009;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f19 = f4 + strikeThruPosition;
                                m26475(canvas, paint, (int) f, f19, (int) (f15 + 1.0f), f19 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        i15 = i8;
                        iM52677 = i7 + 1;
                        c4777 = c4771;
                        z10 = z10;
                        i6 = i6;
                        interfaceC24887 = interfaceC24887;
                        fArr = fArr;
                        canvas = canvas;
                    }
                    byte bM32657 = C14177.m32656(cCharAt3);
                    C3831 c3831 = this.f32005;
                    C20579 c20579 = f31994;
                    C20194 c20194 = this.f32027;
                    char[] cArr = this.f32018;
                    switch (bM32657) {
                        case 0:
                            char c3 = cCharAt3;
                            c4776 = c4771;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            boolean z19 = (z16 || f15 + this.f32019 < ((float) i3)) ? z16 : true;
                            if (z19) {
                                cArr[0] = c3;
                                m26477(canvas, cArr, 1, f15, f4, paint);
                            }
                            float f20 = f15 + this.f32019;
                            int i16 = i7 + 1;
                            if (z19 && f20 > i4) {
                                z16 = z19;
                                boolean z20 = z17;
                                f15 = f20;
                                i15 = i15;
                                z17 = z20;
                            } else {
                                f7 = f20;
                                iM52677 = i16;
                                z16 = z19;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas2 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas2;
                            }
                            break;
                        case 1:
                            CharSequence charSequence4 = charSequence3;
                            c4772 = c4771;
                            charSequence2 = charSequence4;
                            boolean z21 = (z16 || f15 + this.f32003 < ((float) i3)) ? z16 : true;
                            if (z21 && this.f32028) {
                                if (this.f31997 && !z18 && (i7 >= charSequence.length() - 1 || (cCharAt = charSequence2.charAt(i7 + 1)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                                    z18 = true;
                                }
                                if (!this.f31997 || z18) {
                                    float fCeil = (float) Math.ceil((this.f32003 / 2.0f) + f15);
                                    float fCeil2 = (float) Math.ceil((this.f32008 / 2.0f) + (f4 - this.f32009));
                                    float f21 = this.f32008 * 0.042f;
                                    int color = paint.getColor();
                                    paint.setColor((this.f32010 & 16777215) | (C23223.m51761(100, 50) << 24));
                                    canvas = canvas;
                                    canvas.drawCircle(fCeil, fCeil2, f21, paint);
                                    paint.setColor(color);
                                } else {
                                    canvas = canvas;
                                }
                            } else {
                                canvas = canvas;
                            }
                            float f22 = f15 + this.f32003;
                            i9 = i7 + 1;
                            if (z21 && f22 > i4) {
                                z2 = z21;
                                i7 = i15;
                                z3 = z17;
                                f15 = f22;
                            } else {
                                z4 = z21;
                                f7 = f22;
                                iM52677 = i9;
                                z16 = z4;
                                c4777 = c4772;
                                i15 = i15;
                                f15 = f7;
                                z18 = true;
                                Canvas canvas3 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas3;
                            }
                            break;
                        case 2:
                            CharSequence charSequence5 = charSequence3;
                            C4771 c4778 = c4771;
                            charSequence2 = charSequence5;
                            float f23 = (f3 + f15) - f;
                            float f24 = this.f32003;
                            float f25 = this.f32013 * f24;
                            float f26 = ((((int) (f23 / f25)) + 1) * f25) - f23;
                            if (f26 < f24) {
                                f26 += f25;
                            }
                            float f27 = f26;
                            z4 = (z16 || f15 + f27 < ((float) i3)) ? z16 : true;
                            if (z4 && this.f32028) {
                                float f28 = f24 * 0.15f;
                                float f29 = f28 + f15;
                                float f30 = (f15 + f27) - f28;
                                float f31 = f4 - this.f32009;
                                float f32 = this.f32008;
                                float f33 = (f32 / 2.0f) + f31;
                                int iMax = Math.max((int) (f32 * 0.02f), 1);
                                int iCeil = (int) Math.ceil(f33 - iMax);
                                int color2 = paint.getColor();
                                paint.setColor((this.f32010 & 16777215) | (C23223.m51761(100, 50) << 24));
                                canvas.drawRect(f29, iCeil, f30, iCeil + iMax + iMax, paint);
                                paint.setColor(color2);
                            }
                            f7 = f15 + f27;
                            i9 = i7 + 1;
                            if (z4 && f7 > i4) {
                                canvas = canvas;
                                i7 = i15;
                                z3 = z17;
                                f15 = f7;
                                z2 = z4;
                            } else {
                                c4772 = c4778;
                                canvas = canvas;
                                iM52677 = i9;
                                z16 = z4;
                                c4777 = c4772;
                                i15 = i15;
                                f15 = f7;
                                z18 = true;
                                Canvas canvas4 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas4;
                            }
                            break;
                        case 3:
                            char c4 = cCharAt3;
                            CharSequence charSequence6 = charSequence3;
                            c4773 = c4771;
                            charSequence2 = charSequence6;
                            cArr[c] = c4;
                            int i17 = i2 - i7;
                            if (i17 >= 3 && charSequence2.charAt(i7 + 1) == 65039) {
                                c2 = 8419;
                                if (charSequence2.charAt(i7 + 2) == 8419) {
                                    cArr[1] = 65039;
                                    cArr[2] = 8419;
                                    i11 = 3;
                                    paint = paint;
                                    fMeasureText3 = paint.measureText(cArr, 0, 3);
                                }
                                if (!z16 || f15 + fMeasureText3 < i3) {
                                    z6 = z16;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    if (i11 == 1 || c4 < '0') {
                                        i12 = i11;
                                    } else {
                                        int iMin = Math.min(cArr.length, i17);
                                        while (true) {
                                            if (i11 < iMin) {
                                                char cCharAt4 = charSequence2.charAt(i7 + i11);
                                                int i18 = C4771.f10808;
                                                if ((('a' <= cCharAt4 && cCharAt4 <= 'z') || (('A' <= cCharAt4 && cCharAt4 <= 'Z') || ('0' <= cCharAt4 && cCharAt4 <= '9'))) && c4773.m10070(c4, cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    fMeasureText3 += fArr2[cCharAt4];
                                                    i11++;
                                                    c4 = cCharAt4;
                                                } else if (C15517.m35315(cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    i12 = i11 + 1;
                                                }
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    m26477(canvas, cArr, i12, f15, f4, paint);
                                    i11 = i12;
                                    fMeasureText3 = fMeasureText3;
                                }
                                f8 = f15 + fMeasureText3;
                                iM52677 = i11 + i7;
                                if (!z6 && f8 > i4) {
                                    f7 = f8;
                                    z5 = z6;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    z18 = false;
                                    z16 = z6;
                                    c4777 = c4773;
                                    z10 = z10;
                                    i6 = i6;
                                    interfaceC24887 = interfaceC24887;
                                    fArr = fArr;
                                    charSequence3 = charSequence2;
                                    canvas = canvas;
                                    boolean z22 = z17;
                                    f15 = f8;
                                    i15 = i15;
                                    z17 = z22;
                                }
                            } else {
                                c2 = 8419;
                            }
                            if (i17 >= 2 && charSequence2.charAt(i7 + 1) == c2) {
                                cArr[1] = c2;
                                fMeasureText3 = paint.measureText(cArr, 0, 2);
                                i11 = 2;
                            } else if (this.f32006 && (c4 == '#' || c4 == '*')) {
                                iM52676 = i7 + 1;
                                z17 = true;
                                c4777 = c4773;
                                charSequence3 = charSequence2;
                                iM52677 = iM52676;
                                i15 = i7;
                            } else {
                                fMeasureText3 = fArr2[c4];
                                i11 = 1;
                            }
                            if (z16) {
                                z6 = z16;
                            } else {
                                z6 = z16;
                            }
                            if (z6) {
                                if (i11 == 1) {
                                    i12 = i11;
                                } else {
                                    i12 = i11;
                                }
                                m26477(canvas, cArr, i12, f15, f4, paint);
                                i11 = i12;
                                fMeasureText3 = fMeasureText3;
                            }
                            f8 = f15 + fMeasureText3;
                            iM52677 = i11 + i7;
                            if (!z6) {
                            }
                            z18 = false;
                            z16 = z6;
                            c4777 = c4773;
                            z10 = z10;
                            i6 = i6;
                            interfaceC24887 = interfaceC24887;
                            fArr = fArr;
                            charSequence3 = charSequence2;
                            canvas = canvas;
                            boolean z23 = z17;
                            f15 = f8;
                            i15 = i15;
                            z17 = z23;
                            break;
                        case 4:
                            char c5 = cCharAt3;
                            C4771 c4779 = c4771;
                            charSequence2 = charSequence3;
                            if (this.f32006 && C14177.m32657(c5)) {
                                iM52676 = i7 + 1;
                                c4773 = c4779;
                                paint = paint;
                                z17 = true;
                                c4777 = c4773;
                                charSequence3 = charSequence2;
                                iM52677 = iM52676;
                                i15 = i7;
                            } else {
                                float f34 = fArr2[c5];
                                boolean z24 = (z16 || f15 + f34 < ((float) i3)) ? z16 : true;
                                if (f34 > f5 && z24) {
                                    String str = strArr[c5];
                                    if (str.length() <= 1) {
                                        f9 = f34;
                                        if (c5 > 0) {
                                            cArr[c] = c5;
                                            int i19 = C4771.f10808;
                                            if (('a' > c5 || c5 > 'z') && (('A' > c5 || c5 > 'Z') && ('0' > c5 || c5 > '9'))) {
                                                c4775 = c4779;
                                                f11 = f9;
                                                i13 = 1;
                                            } else {
                                                int iMin2 = Math.min(cArr.length, i2 - i7);
                                                int i20 = 1;
                                                f11 = f9;
                                                char c6 = c5;
                                                while (true) {
                                                    if (i20 >= iMin2) {
                                                        c4775 = c4779;
                                                    } else {
                                                        char cCharAt5 = charSequence2.charAt(i7 + i20);
                                                        if (('a' > cCharAt5 || cCharAt5 > 'z') && (('A' > cCharAt5 || cCharAt5 > 'Z') && ('0' > cCharAt5 || cCharAt5 > '9'))) {
                                                            c4775 = c4779;
                                                        } else {
                                                            c4775 = c4779;
                                                            if (c4775.m10070(c6, cCharAt5)) {
                                                                cArr[i20] = cCharAt5;
                                                                f11 += fArr2[cCharAt5];
                                                                i20++;
                                                                c6 = cCharAt5;
                                                                c4779 = c4775;
                                                            }
                                                        }
                                                        if (C15517.m35315(cCharAt5)) {
                                                            cArr[i20] = cCharAt5;
                                                            i13 = i20 + 1;
                                                        }
                                                    }
                                                    i13 = i20;
                                                }
                                            }
                                            float f35 = f11;
                                            c4774 = c4775;
                                            m26477(canvas, cArr, i13, f15, f4, paint);
                                            i7 += i13 - 1;
                                            f10 = f35;
                                        }
                                        f7 = f15 + f10;
                                        i10 = i7 + 1;
                                        if (!z24 && f7 > i4) {
                                            z5 = z24;
                                            paint = paint;
                                            z7 = z8;
                                            i14 = i15;
                                            z17 = z17;
                                            f15 = f7;
                                            z2 = z5;
                                            z8 = z7;
                                            i7 = i14;
                                            z3 = z17;
                                        } else {
                                            z5 = z24;
                                            paint = paint;
                                            c4776 = c4774;
                                            iM52677 = i10;
                                            z16 = z5;
                                            canvas = canvas;
                                            c4777 = c4776;
                                            z17 = z17;
                                            f15 = f7;
                                            Canvas canvas5 = canvas;
                                            charSequence3 = charSequence2;
                                            canvas = canvas5;
                                        }
                                    } else {
                                        int i21 = this.f32001;
                                        float f36 = i21;
                                        float f37 = f15 + f36;
                                        m26476(canvas, str, 0, str.length(), f37, f4, paint);
                                        float f38 = f4 - this.f32009;
                                        int i22 = i21 * 3;
                                        float f39 = i22;
                                        int iCeil2 = (int) Math.ceil((this.f31998 + f38) - f39);
                                        int iCeil3 = (int) Math.ceil(f38 + this.f32004 + f39);
                                        float f40 = f15 + f34;
                                        float f41 = iCeil2 + i21;
                                        float f42 = f15;
                                        f9 = f34;
                                        m26475(canvas, paint, f42, iCeil2, f40, f41);
                                        float f43 = iCeil2 + i22;
                                        m26475(canvas, paint, f42, f41, f37, f43);
                                        float f44 = f40 - f36;
                                        m26475(canvas, paint, f44, f41, f40, f43);
                                        float f45 = iCeil3 - i21;
                                        float f46 = f15;
                                        m26475(canvas, paint, f46, f45, f40, iCeil3);
                                        float f47 = iCeil3 - i22;
                                        m26475(canvas, paint, f46, f45, f37, f47);
                                        m26475(canvas, paint, f44, f45, f40, f47);
                                    }
                                } else {
                                    f9 = f34;
                                }
                                c4774 = c4779;
                                f10 = f9;
                                f7 = f15 + f10;
                                i10 = i7 + 1;
                                if (!z24) {
                                }
                                z5 = z24;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas6 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas6;
                            }
                            break;
                        case 5:
                            c4771 = c4771;
                            charSequence2 = charSequence3;
                            z6 = (z16 || this.f32024 + f15 < ((float) i3)) ? z16 : true;
                            if (z6) {
                                cArr[c] = 65533;
                                m26477(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + this.f32024;
                            i10 = i7 + 1;
                            if (z6 && f7 > i4) {
                                paint = paint;
                                z5 = z6;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z6;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas7 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas7;
                            }
                            break;
                        case 6:
                            c4771 = c4771;
                            charSequence2 = charSequence3;
                            if (!z16 && fArr[c] + f15 >= i3) {
                                z16 = true;
                            }
                            f7 = f15 + fArr[c];
                            i10 = i7 + 1;
                            if (!z16 && f7 > i4) {
                                canvas = canvas;
                                paint = paint;
                                z5 = z16;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z16;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas8 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas8;
                            }
                            break;
                        case 7:
                            char c7 = cCharAt3;
                            c4771 = c4771;
                            charSequence2 = charSequence3;
                            float fM26480 = m26480(c7);
                            boolean z25 = (z16 || f15 + fM26480 < ((float) i3)) ? z16 : true;
                            if (z25) {
                                cArr[c] = c7;
                                m26477(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + fM26480;
                            i10 = i7 + 1;
                            if (z25 && f7 > i4) {
                                paint = paint;
                                z5 = z25;
                                canvas = canvas;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z25;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas9 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas9;
                            }
                            break;
                        case 8:
                            char c8 = cCharAt3;
                            c4771 = c4771;
                            if (!z10) {
                                iM52676 = C23669.m52676(i7, i2, charSequence);
                                z8 = true;
                                c4777 = c4771;
                                paint = paint;
                                charSequence3 = charSequence;
                                z17 = z17;
                                iM52677 = iM52676;
                                i15 = i7;
                            } else {
                                String str2 = (String) c20579.mo15132(c8);
                                Float fM45694 = c20194.m45694(str2);
                                if (fM45694 == null) {
                                    fM45694 = Float.valueOf(paint.measureText(str2));
                                    c20194.m45696(str2, fM45694);
                                }
                                float fFloatValue = fM45694.floatValue() + (this.f32001 * 2);
                                boolean z26 = (z16 || f15 + fFloatValue < ((float) i3)) ? z16 : true;
                                if (z26) {
                                    int i23 = this.f32001;
                                    float f48 = i23;
                                    float f49 = f15 + f48;
                                    m26476(canvas, str2, 0, str2.length(), f49, f4, paint);
                                    float f50 = f4 - this.f32009;
                                    int i24 = i23 * 3;
                                    float f51 = i24;
                                    int iCeil4 = (int) Math.ceil((this.f31998 + f50) - f51);
                                    int iCeil5 = (int) Math.ceil(f50 + this.f32004 + f51);
                                    float f52 = f15 + fFloatValue;
                                    float f53 = iCeil4 + i23;
                                    float f54 = f15;
                                    m26475(canvas, paint, f54, iCeil4, f52, f53);
                                    float f55 = iCeil4 + i24;
                                    m26475(canvas, paint, f54, f53, f49, f55);
                                    float f56 = f52 - f48;
                                    m26475(canvas, paint, f56, f53, f52, f55);
                                    float f57 = iCeil5 - i23;
                                    float f58 = f15;
                                    m26475(canvas, paint, f58, f57, f52, iCeil5);
                                    float f59 = iCeil5 - i24;
                                    m26475(canvas, paint, f58, f57, f49, f59);
                                    m26475(canvas, paint, f56, f57, f52, f59);
                                }
                                f7 = f15 + fFloatValue;
                                i10 = i7 + 1;
                                if (z26 && f7 > i4) {
                                    z5 = z26;
                                    charSequence2 = charSequence;
                                    paint = paint;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    z5 = z26;
                                    charSequence2 = charSequence;
                                    c4774 = c4771;
                                    paint = paint;
                                    c4776 = c4774;
                                    iM52677 = i10;
                                    z16 = z5;
                                    canvas = canvas;
                                    c4777 = c4776;
                                    z17 = z17;
                                    f15 = f7;
                                    Canvas canvas10 = canvas;
                                    charSequence3 = charSequence2;
                                    canvas = canvas10;
                                }
                            }
                            break;
                        case 9:
                            char c9 = cCharAt3;
                            c4771 = c4771;
                            if (!z10) {
                                charSequence2 = charSequence;
                                if (!z16) {
                                    z16 = true;
                                }
                                f7 = f15 + fArr[c];
                                i10 = i7 + 1;
                                if (!z16) {
                                }
                                z5 = z16;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas11 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas11;
                            } else {
                                String str3 = (String) c20579.mo15132(c9);
                                String str4 = (String) c20579.mo15132(c9);
                                Float fM45695 = c20194.m45694(str4);
                                if (fM45695 == null) {
                                    fM45695 = Float.valueOf(c3831.measureText(str4));
                                    c20194.m45696(str4, fM45695);
                                }
                                float fFloatValue2 = fM45695.floatValue();
                                int i25 = this.f32001;
                                float f60 = fFloatValue2 + (i25 * 2);
                                z5 = (z16 || f15 + f60 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f61 = i25;
                                    float f62 = f15 + f61;
                                    m26476(canvas, str3, 0, str3.length(), f62, f4, paint);
                                    float f63 = f4 - this.f32009;
                                    int i26 = i25 * 3;
                                    float f64 = i26;
                                    int iCeil6 = (int) Math.ceil((this.f31998 + f63) - f64);
                                    int iCeil7 = (int) Math.ceil(f63 + this.f32004 + f64);
                                    float f65 = f15 + f60;
                                    float f66 = iCeil6 + i25;
                                    float f67 = f15;
                                    m26475(canvas, paint, f67, iCeil6, f65, f66);
                                    float f68 = iCeil6 + i26;
                                    m26475(canvas, paint, f67, f66, f62, f68);
                                    float f69 = f65 - f61;
                                    m26475(canvas, paint, f69, f66, f65, f68);
                                    float f70 = iCeil7 - i25;
                                    float f71 = f15;
                                    m26475(canvas, paint, f71, f70, f65, iCeil7);
                                    float f72 = iCeil7 - i26;
                                    m26475(canvas, paint, f71, f70, f62, f72);
                                    m26475(canvas, paint, f69, f70, f65, f72);
                                }
                                f7 = f15 + f60;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                    charSequence2 = charSequence;
                                    paint = paint;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                }
                                charSequence2 = charSequence;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas12 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas12;
                            }
                            break;
                        case 10:
                            if (z10) {
                                char c10 = cCharAt3;
                                String str5 = (String) c20579.mo15132(c10);
                                String str6 = (String) c20579.mo15132(c10);
                                Float fM45696 = c20194.m45694(str6);
                                if (fM45696 == null) {
                                    fM45696 = Float.valueOf(c3831.measureText(str6));
                                    c20194.m45696(str6, fM45696);
                                }
                                float fFloatValue3 = fM45696.floatValue();
                                int i27 = this.f32001;
                                float f73 = fFloatValue3 + (i27 * 2);
                                z5 = (z16 || f15 + f73 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f74 = i27;
                                    float f75 = f15 + f74;
                                    m26476(canvas, str5, 0, str5.length(), f75, f4, paint);
                                    float f76 = f4 - this.f32009;
                                    int i28 = i27 * 3;
                                    float f77 = i28;
                                    int iCeil8 = (int) Math.ceil((this.f31998 + f76) - f77);
                                    int iCeil9 = (int) Math.ceil(f76 + this.f32004 + f77);
                                    float f78 = f15 + f73;
                                    float f79 = iCeil8 + i27;
                                    float f80 = f15;
                                    m26475(canvas, paint, f80, iCeil8, f78, f79);
                                    float f81 = iCeil8 + i28;
                                    m26475(canvas, paint, f80, f79, f75, f81);
                                    float f82 = f78 - f74;
                                    m26475(canvas, paint, f82, f79, f78, f81);
                                    float f83 = iCeil9 - i27;
                                    float f84 = f15;
                                    m26475(canvas, paint, f84, f83, f78, iCeil9);
                                    float f85 = iCeil9 - i28;
                                    m26475(canvas, paint, f84, f83, f75, f85);
                                    m26475(canvas, paint, f82, f83, f78, f85);
                                }
                                f7 = f15 + f73;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                }
                                charSequence2 = charSequence;
                                c4774 = c4771;
                                paint = paint;
                                c4776 = c4774;
                                iM52677 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c4777 = c4776;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas13 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas13;
                            } else {
                                C4771 c47710 = c4771;
                                if (!z16 && f15 + this.f32003 >= i3) {
                                    z16 = true;
                                }
                                f7 = f15 + this.f32003;
                                int i29 = i7 + 1;
                                if (!z16 || f7 <= i4) {
                                    c4772 = c47710;
                                    charSequence2 = charSequence3;
                                    iM52677 = i29;
                                    canvas = canvas;
                                    c4777 = c4772;
                                    i15 = i15;
                                    f15 = f7;
                                    z18 = true;
                                    Canvas canvas14 = canvas;
                                    charSequence3 = charSequence2;
                                    canvas = canvas14;
                                } else {
                                    z5 = z16;
                                }
                            }
                            charSequence2 = charSequence;
                            paint = paint;
                            z7 = z8;
                            i14 = i15;
                            z17 = z17;
                            f15 = f7;
                            z2 = z5;
                            z8 = z7;
                            i7 = i14;
                            z3 = z17;
                            break;
                        default:
                            char c11 = cCharAt3;
                            C4771 c47711 = c4771;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            if (!C15517.m35316(c11)) {
                                z8 = true;
                                c4777 = c47711;
                                f15 = f15;
                                z18 = z18;
                                iM52677 = C23669.m52676(i7, i2, charSequence2);
                                i15 = i7;
                                Canvas canvas15 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas15;
                            } else {
                                float fM26481 = (i7 <= 0 || !C15517.m35316(charSequence2.charAt(i7 - 1))) ? 0.0f : C15517.m35313(c11) ? m26480(c11) : this.f32014;
                                boolean z27 = (z16 || f15 + fM26481 < ((float) i3)) ? z16 : true;
                                if (z27) {
                                    cArr[c] = c11;
                                    m26477(canvas, cArr, 1, f15, f4, paint);
                                }
                                float f86 = f15 + fM26481;
                                iM52677 = i7 + 1;
                                if (z27 && f86 > i4) {
                                    f7 = f86;
                                    z5 = z27;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    c4777 = c47711;
                                    z16 = z27;
                                    boolean z28 = z17;
                                    f15 = f86;
                                    z17 = z28;
                                    charSequence3 = charSequence2;
                                    canvas = canvas;
                                }
                            }
                            break;
                    }
                    if (z8) {
                        if (z2) {
                            fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                            if (f15 + fMeasureText2 >= i3) {
                                z2 = true;
                            }
                            fMeasureText = fMeasureText2;
                        } else {
                            fMeasureText = -1.0f;
                        }
                        if (z2) {
                            m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                        }
                        if (z15) {
                            if (fMeasureText < f5) {
                                fMeasureText = paint.measureText(charSequence2, i7, i2);
                            }
                            f15 += fMeasureText;
                        }
                    } else {
                        if (z2) {
                            fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                            if (f15 + fMeasureText2 >= i3) {
                                z2 = true;
                            }
                            fMeasureText = fMeasureText2;
                        } else {
                            fMeasureText = -1.0f;
                        }
                        if (z2) {
                            m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                        }
                        if (z15) {
                            if (fMeasureText < f5) {
                                fMeasureText = paint.measureText(charSequence2, i7, i2);
                            }
                            f15 += fMeasureText;
                        }
                    }
                    if (z11) {
                        paint.setFakeBoldText(false);
                    }
                    if (z12) {
                        canvas.restoreToCount(i6);
                        f4 = f2;
                    }
                    this.f32002 = interfaceC24887;
                    f6 = this.f32015;
                    if (z13) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            underlinePosition = paint.getUnderlinePosition();
                            textSize2 = paint.getUnderlineThickness();
                        } else {
                            underlinePosition = (this.f32008 * 0.85f) - this.f32009;
                            textSize2 = paint.getTextSize() * 0.019f * f6;
                        }
                        float f110 = underlinePosition + f4;
                        m26475(canvas, paint, (int) f, f110, (int) (f15 + 1.0f), f110 + textSize2);
                    }
                    if (z14) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            strikeThruPosition = paint.getStrikeThruPosition();
                            textSize = paint.getStrikeThruThickness();
                        } else {
                            strikeThruPosition = (this.f32008 * 0.551f) - this.f32009;
                            textSize = paint.getTextSize() * 0.021f * f6;
                        }
                        float f111 = f4 + strikeThruPosition;
                        m26475(canvas, paint, (int) f, f111, (int) (f15 + 1.0f), f111 + textSize);
                    }
                    if (z15) {
                        return f15 - f;
                    }
                    return f5;
                }
                i6 = i6;
                interfaceC24887 = interfaceC24887;
                CharSequence charSequence7 = charSequence3;
                canvas = canvas;
                charSequence2 = charSequence7;
                f5 = 0.0f;
                i7 = i15;
                z2 = z16;
                z3 = z17;
                if (z8) {
                    if (z2) {
                        fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                        if (f15 + fMeasureText2 >= i3) {
                            z2 = true;
                        }
                        fMeasureText = fMeasureText2;
                    } else {
                        fMeasureText = -1.0f;
                    }
                    if (z2) {
                        m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                    }
                    if (z15) {
                        if (fMeasureText < f5) {
                            fMeasureText = paint.measureText(charSequence2, i7, i2);
                        }
                        f15 += fMeasureText;
                    }
                } else {
                    if (z2) {
                        fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                        if (f15 + fMeasureText2 >= i3) {
                            z2 = true;
                        }
                        fMeasureText = fMeasureText2;
                    } else {
                        fMeasureText = -1.0f;
                    }
                    if (z2) {
                        m26476(canvas, charSequence, i7, i2, f15, f4, paint);
                    }
                    if (z15) {
                        if (fMeasureText < f5) {
                            fMeasureText = paint.measureText(charSequence2, i7, i2);
                        }
                        f15 += fMeasureText;
                    }
                }
                if (z11) {
                    paint.setFakeBoldText(false);
                }
                if (z12) {
                    canvas.restoreToCount(i6);
                    f4 = f2;
                }
                this.f32002 = interfaceC24887;
                f6 = this.f32015;
                if (z13) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        underlinePosition = paint.getUnderlinePosition();
                        textSize2 = paint.getUnderlineThickness();
                    } else {
                        underlinePosition = (this.f32008 * 0.85f) - this.f32009;
                        textSize2 = paint.getTextSize() * 0.019f * f6;
                    }
                    float f112 = underlinePosition + f4;
                    m26475(canvas, paint, (int) f, f112, (int) (f15 + 1.0f), f112 + textSize2);
                }
                if (z14) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        strikeThruPosition = paint.getStrikeThruPosition();
                        textSize = paint.getStrikeThruThickness();
                    } else {
                        strikeThruPosition = (this.f32008 * 0.551f) - this.f32009;
                        textSize = paint.getTextSize() * 0.021f * f6;
                    }
                    float f113 = f4 + strikeThruPosition;
                    m26475(canvas, paint, (int) f, f113, (int) (f15 + 1.0f), f113 + textSize);
                }
                if (z15) {
                    return f15 - f;
                }
                return f5;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m26495() {
        C4771 c4771 = this.f32012;
        C3831 c3831 = this.f32005;
        if (c4771 == null || !c4771.f10813.equals(c3831.getTypeface())) {
            this.f32012 = C4771.m10067(c3831.getTypeface());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m26473(int i, int i2) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float f = 1.0f - fAlpha;
        return Color.rgb((int) ((Color.red(i2) * fAlpha) + (Color.red(i) * f)), (int) ((Color.green(i2) * fAlpha) + (Color.green(i) * f)), (int) ((Color.blue(i2) * fAlpha) + (Color.blue(i) * f)));
    }
}
