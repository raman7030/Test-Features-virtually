package l;

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
public class C9584 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C19161 f29047;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f29048;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f29049;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f29050;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f29051;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f29052;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f29053;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f29054;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC23694 f29055;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29056;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f29057;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C1539 f29058;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f29059;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f29060;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f29061;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f29062;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f29063;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f29064;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2528 f29065;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29066;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f29067;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f29068;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f29069;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29070;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f29071;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f29072;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12474 f29073;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f29074;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f29075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29076;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f29077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f29078;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29079;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18756 f29080;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f29081;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = String.valueOf(c);
        }
        f29048 = strArr;
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
        f29049 = strArr2;
        char[] cArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 173, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8287, 8288, 8289, 8290, 8291, 8292, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 65279};
        String[] strArr3 = {"HOP", "BPH", "NBH", "IND", "NEL", "SSA", "ESA", "HTS", "HTJ", "VTS", "PLD", "PLU", "RI", "SS2", "SS3", "DCS", "PU1", "PU2", "STS", "CCH", "MW", "SPA", "EPA", "SOS", "SGCI", "SCI", "CSI", "ST", "OSC", "PM", "APC", "NBSP", "SHY", "NQSP", "MQSP", "ENSP", "EMSP", "3/MSP", "4/MSP", "6/MSP", "FSP", "PSP", "THSP", "HSP", "ZWSP", "ZWNJ", "ZWJ", "LRM", "RLM", "LSEP", "PSEP", "LRE", "RLE", "PDF", "LRO", "RLO", "NNBSP", "MMSP", "WJ", "f()", "x", ",", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "LRI", "RLI", "FSI", "PDI", "ISS", "ASS", "IAFS", "AAFS", "NADS", "NODS", "ZWNBSP"};
        C19161 c19161 = new C19161(74);
        for (int i = 0; i < 74; i++) {
            c19161.mo13246(cArr[i], strArr3[i]);
        }
        f29047 = c19161;
    }

    public C9584(Context context) {
        this.f29078 = 1.0f;
        this.f29080 = new C18756();
        this.f29073 = C10358.m26166(new C21214());
        this.f29081 = false;
        this.f29059 = false;
        this.f29050 = false;
        this.f29066 = 4;
        this.f29079 = false;
        this.f29076 = true;
        this.f29075 = false;
        this.f29064 = new float[128];
        this.f29052 = new float[128];
        this.f29074 = new Rect();
        this.f29071 = new char[256];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f29068 = displayMetrics.density;
        this.f29053 = displayMetrics.scaledDensity;
        C1539 c1539 = new C1539(0);
        this.f29058 = c1539;
        c1539.setTextAlign(Paint.Align.LEFT);
        c1539.setStyle(Paint.Style.FILL);
        c1539.setTypeface(Typeface.DEFAULT);
        m24483();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9584 m24488() {
        return new C9584(this);
    }

    public C9584(C9584 c9584) {
        this.f29078 = 1.0f;
        this.f29080 = new C18756();
        this.f29073 = C10358.m26166(new C21214());
        this.f29081 = false;
        this.f29059 = false;
        this.f29050 = false;
        this.f29066 = 4;
        this.f29079 = false;
        this.f29076 = true;
        this.f29075 = false;
        float[] fArr = new float[128];
        this.f29064 = fArr;
        float[] fArr2 = new float[128];
        this.f29052 = fArr2;
        this.f29074 = new Rect();
        this.f29071 = new char[256];
        this.f29068 = c9584.f29068;
        this.f29053 = c9584.f29053;
        this.f29058 = new C1539(c9584.f29058);
        this.f29063 = c9584.f29063;
        this.f29061 = c9584.f29061;
        this.f29070 = c9584.f29070;
        this.f29062 = c9584.f29062;
        this.f29078 = c9584.f29078;
        this.f29069 = c9584.f29069;
        this.f29060 = c9584.f29060;
        this.f29072 = c9584.f29072;
        this.f29077 = c9584.f29077;
        this.f29056 = c9584.f29056;
        this.f29067 = c9584.f29067;
        this.f29081 = c9584.f29081;
        this.f29059 = c9584.f29059;
        this.f29050 = c9584.f29050;
        this.f29066 = c9584.f29066;
        this.f29051 = c9584.f29051;
        this.f29057 = c9584.f29057;
        this.f29079 = c9584.f29079;
        this.f29076 = c9584.f29076;
        this.f29054 = c9584.f29054;
        System.arraycopy(c9584.f29064, 0, fArr, 0, 128);
        System.arraycopy(c9584.f29052, 0, fArr2, 0, 128);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m24496() {
        return this.f29062;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m24484() {
        return this.f29069;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m24501() {
        return this.f29060;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m24500() {
        return this.f29078;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo24477(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        this.f29078 = f;
        m24466(this.f29058.getFontMetrics());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24466(Paint.FontMetrics fontMetrics) {
        float fontSpacing = this.f29058.getFontSpacing() * this.f29078;
        this.f29069 = fontSpacing;
        Math.ceil(fontSpacing);
        float f = fontMetrics.ascent;
        this.f29060 = ((this.f29069 - (fontMetrics.descent - f)) / 2.0f) + (-f);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m24495() {
        return this.f29061;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24491() {
        return this.f29070;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m24493() {
        return this.f29072;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m24486() {
        return this.f29056;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m24492() {
        return this.f29063;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24489(int i) {
        this.f29063 = i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m24482() {
        return this.f29081;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24479(boolean z) {
        this.f29081 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m24498() {
        return this.f29050;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24490(boolean z) {
        this.f29050 = z;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m24485() {
        return this.f29066;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24478(int i) {
        this.f29066 = i;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m24499() {
        return this.f29079;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24494(boolean z) {
        this.f29079 = z;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m24470() {
        return this.f29076;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24497(boolean z) {
        this.f29076 = z;
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
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24481() {
        float[] fArr;
        float[] fArr2;
        C1539 c1539 = this.f29058;
        Paint.FontMetrics fontMetrics = c1539.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f29061 = f;
        this.f29070 = (int) Math.ceil(f);
        this.f29054 = (int) Math.ceil(this.f29061 / 25.0f);
        this.f29072 = c1539.measureText("我");
        this.f29077 = c1539.measureText("�");
        this.f29062 = -fontMetrics.top;
        m24466(fontMetrics);
        float fMeasureText = c1539.measureText("n");
        float fMeasureText2 = c1539.measureText(" ");
        if (fMeasureText2 < fMeasureText) {
            fMeasureText2 = C20382.m46695(fMeasureText, fMeasureText2, 0.62f, fMeasureText2);
        }
        this.f29056 = (float) Math.ceil(fMeasureText2);
        this.f29067 = (float) Math.ceil(fMeasureText2 / 2.0f);
        int i = 0;
        while (true) {
            fArr = this.f29052;
            fArr2 = this.f29064;
            if (i >= 128) {
                break;
            }
            String str = f29048[i];
            String str2 = f29049[i];
            if (str.equals(str2)) {
                float fMeasureText3 = c1539.measureText(str);
                fArr[i] = fMeasureText3;
                fArr2[i] = fMeasureText3;
            } else {
                fArr2[i] = c1539.measureText(str);
                fArr[i] = c1539.measureText(str2) + (this.f29054 * 2);
            }
            i++;
        }
        float f2 = this.f29056;
        fArr2[0] = f2 / 50.0f;
        fArr2[32] = f2;
        fArr2[10] = f2;
        fArr2[13] = f2;
        fArr[32] = f2;
        fArr[10] = f2;
        fArr[13] = f2;
        this.f29059 = fArr2[105] == fArr2[119] && fArr2[46] == fArr2[109];
        int iMeasureText = (int) (c1539.measureText("Z") + 1.0f);
        int i2 = (int) (this.f29061 + 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        c1539.setColor(-16777216);
        canvas.drawText("Z", 0.0f, this.f29062, c1539);
        int[] iArr = new int[i2];
        bitmapCreateBitmap.getPixels(iArr, 0, 1, iMeasureText / 2, 0, 1, i2);
        bitmapCreateBitmap.recycle();
        this.f29051 = 0.0f;
        this.f29057 = this.f29061;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != -1) {
                this.f29051 = i3;
                break;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (iArr[i4] != -1) {
                this.f29057 = i4;
                break;
            }
        }
        this.f29080.m43428();
        this.f29073.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m24487(CharSequence charSequence, int i, int i2, float f) {
        return m24469(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24475(CharSequence charSequence, int i, int i2, float f, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid maximum text width");
        }
        return m24469(charSequence, i, i2, f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c A[PHI: r7
      0x016c: PHI (r7v29 java.lang.String) = (r7v25 java.lang.String), (r7v28 java.lang.String), (r7v37 java.lang.String) binds: [B:96:0x016a, B:90:0x0157, B:85:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0116. Please report as an issue. */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m24469(CharSequence charSequence, int i, int i2, float f, float f2) {
        C1539 c1539;
        C18756 c18756;
        boolean z;
        boolean z2;
        char c;
        char c2;
        C20873 c20873;
        int i3;
        boolean z3;
        float fM24468;
        float fFloatValue;
        int iM50336;
        String str;
        Float fM43427;
        float fFloatValue2;
        int i4;
        int i5;
        String string;
        Float fM43428;
        if (i < 0) {
            return 0.0f;
        }
        boolean z4 = this.f29079;
        float[] fArr = this.f29064;
        float[] fArr2 = z4 ? this.f29052 : fArr;
        boolean z5 = this.f29076;
        C20873 c20874 = (f2 == Float.POSITIVE_INFINITY && (charSequence instanceof C20873)) ? (C20873) charSequence : null;
        int i6 = i;
        int i7 = i6;
        float fFloatValue3 = 0.0f;
        boolean z6 = false;
        while (true) {
            c1539 = this.f29058;
            c18756 = this.f29080;
            if (i6 >= i2 || fFloatValue3 >= f2) {
                z = z6;
                i6 = i7;
                z2 = z;
            } else {
                if (z6) {
                    int iM50337 = C22412.m50336(i6, i2, charSequence);
                    c2 = 0;
                    boolean z7 = z6;
                    if (iM50337 - i6 == 1) {
                        char cCharAt = charSequence.charAt(i6);
                        byte bM30591 = C12425.m30591(cCharAt);
                        i5 = iM50337;
                        if (bM30591 == 15) {
                            if (C13835.m33198(cCharAt)) {
                                string = charSequence.subSequence(i7, i6).toString();
                                fM43428 = c18756.m43427(string);
                                if (fM43428 == null) {
                                    fM43428 = Float.valueOf(c1539.measureText(string));
                                    c18756.m43429(string, fM43428);
                                }
                                fFloatValue3 += fM43428.floatValue();
                                if (fFloatValue3 >= f2) {
                                    z2 = false;
                                } else {
                                    i7 = i6;
                                    z6 = false;
                                    c = 1;
                                }
                            }
                        } else if (bM30591 != 8 || z5) {
                            string = charSequence.subSequence(i7, i6).toString();
                            fM43428 = c18756.m43427(string);
                            if (fM43428 == null) {
                                fM43428 = Float.valueOf(c1539.measureText(string));
                                c18756.m43429(string, fM43428);
                            }
                            fFloatValue3 += fM43428.floatValue();
                            if (fFloatValue3 >= f2) {
                                z2 = false;
                            } else {
                                i7 = i6;
                                z6 = false;
                                c = 1;
                            }
                        }
                    } else {
                        i5 = iM50337;
                    }
                    z6 = z7;
                    i6 = i5;
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (c20874 != null) {
                    c20874.m47697(i6);
                    char[] cArr = c20874.f67548;
                    i3 = i7;
                    int iMin = Math.min(i2, c20874.f67546);
                    int i8 = i6 - c20874.f67545;
                    while (true) {
                        if (i6 < iMin) {
                            c20873 = c20874;
                            char c3 = cArr[i8];
                            z3 = z6;
                            if (c3 <= 127 && c3 != '\t') {
                                int i9 = C6075.f18642;
                                if ((('0' <= c3 && c3 <= '9') || c3 == '#' || c3 == '*') && (i4 = i6 + 1) < i2) {
                                    if (i4 == iMin || cArr[i8 + 1] > 127) {
                                    }
                                }
                                fFloatValue3 += fArr2[c3];
                                i8++;
                                i6++;
                                c20874 = c20873;
                                z6 = z3;
                                cArr = cArr;
                            }
                        } else {
                            c20873 = c20874;
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
                        c20874 = c20873;
                    }
                } else {
                    c20873 = c20874;
                    i3 = i7;
                    z3 = z6;
                }
                char cCharAt2 = charSequence.charAt(i6);
                byte bM30592 = C12425.m30591(cCharAt2);
                C19161 c19161 = f29047;
                switch (bM30592) {
                    case 0:
                        fM24468 = this.f29072;
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 1:
                        fM24468 = this.f29056;
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 2:
                        float f3 = f + fFloatValue3;
                        float f4 = this.f29056;
                        float f5 = this.f29066 * f4;
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
                            Float fM43429 = c18756.m43427(str2);
                            if (fM43429 == null) {
                                fM43429 = Float.valueOf(c1539.measureText(str2));
                                c18756.m43429(str2, fM43429);
                            }
                            fFloatValue = fM43429.floatValue() + fFloatValue3;
                            i6 += 3;
                        } else if (i10 >= 2 && charSequence.charAt(i6 + 1) == 8419) {
                            char[] cArr3 = new char[2];
                            cArr3[c2] = cCharAt2;
                            cArr3[c] = 8419;
                            String str3 = new String(cArr3);
                            Float fM434210 = c18756.m43427(str3);
                            if (fM434210 == null) {
                                fM434210 = Float.valueOf(c1539.measureText(str3));
                                c18756.m43429(str3, fM434210);
                            }
                            fFloatValue = fM434210.floatValue() + fFloatValue3;
                            i6 += 2;
                        } else {
                            fM24468 = fArr2[cCharAt2];
                            fFloatValue3 += fM24468;
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        }
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 4:
                        fM24468 = fArr2[cCharAt2];
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 5:
                        fM24468 = this.f29077;
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 6:
                        fM24468 = fArr[c2];
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 7:
                        fM24468 = m24468(cCharAt2);
                        fFloatValue3 += fM24468;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 8:
                        if (!z5) {
                            iM50336 = C22412.m50336(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM50336;
                        } else {
                            str = (String) c19161.mo13249(cCharAt2);
                            fM43427 = c18756.m43427(str);
                            if (fM43427 == null) {
                                fM43427 = Float.valueOf(c1539.measureText(str));
                                c18756.m43429(str, fM43427);
                            }
                            fFloatValue2 = fM43427.floatValue() + (this.f29054 * 2);
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
                            str = (String) c19161.mo13249(cCharAt2);
                            fM43427 = c18756.m43427(str);
                            if (fM43427 == null) {
                                fM43427 = Float.valueOf(c1539.measureText(str));
                                c18756.m43429(str, fM43427);
                            }
                            fFloatValue2 = fM43427.floatValue() + (this.f29054 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 10:
                        if (!z5) {
                            fFloatValue2 = this.f29056;
                        } else {
                            str = (String) c19161.mo13249(cCharAt2);
                            fM43427 = c18756.m43427(str);
                            if (fM43427 == null) {
                                fM43427 = Float.valueOf(c1539.measureText(str));
                                c18756.m43429(str, fM43427);
                            }
                            fFloatValue2 = fM43427.floatValue() + (this.f29054 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    default:
                        if (C13835.m33198(cCharAt2)) {
                            if (i6 > 0 && C13835.m33198(charSequence.charAt(i6 - 1))) {
                                if (C13835.m33195(cCharAt2)) {
                                    fM24468 = m24468(cCharAt2);
                                } else {
                                    fM24468 = this.f29067;
                                }
                                fFloatValue3 += fM24468;
                            }
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        } else {
                            iM50336 = C22412.m50336(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM50336;
                        }
                        break;
                }
                c20874 = c20873;
            }
        }
        if (z2) {
            String string2 = charSequence.subSequence(i6, i2).toString();
            Float fM434211 = c18756.m43427(string2);
            if (fM434211 == null) {
                fM434211 = Float.valueOf(c1539.measureText(string2));
                c18756.m43429(string2, fM434211);
            }
            fFloatValue3 += fM434211.floatValue();
        }
        return Math.min(fFloatValue3, f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6761 m24476(CharSequence charSequence, int i, int i2, float f, C18159 c18159) {
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        return new C6761(this, charSequence, i, i2, f, c18159);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m24468(char c) {
        C12474 c12474 = this.f29073;
        float fM30634 = c12474.m30634(c);
        if (fM30634 != -1.0f) {
            return fM30634;
        }
        float fMeasureText = this.f29058.measureText(String.valueOf(c));
        c12474.mo8401(fMeasureText, c);
        return fMeasureText;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24471(char c) {
        return (this.f29079 ? this.f29052 : this.f29064)[c];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m24480() {
        return this.f29079 ? this.f29052 : this.f29064;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24474(CharSequence charSequence, int i, int i2, float f) {
        boolean z = this.f29079;
        float[] fArr = this.f29064;
        float[] fArr2 = z ? this.f29052 : fArr;
        boolean z2 = this.f29076;
        int i3 = i2 - i;
        C18756 c18756 = this.f29080;
        if (i3 == 1) {
            char cCharAt = charSequence.charAt(i);
            byte bM30591 = C12425.m30591(cCharAt);
            C1539 c1539 = this.f29058;
            C19161 c19161 = f29047;
            switch (bM30591) {
                case 0:
                    return this.f29072;
                case 1:
                    return this.f29056;
                case 2:
                    return m24469(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
                case 3:
                case 4:
                    return fArr2[cCharAt];
                case 5:
                    return this.f29077;
                case 6:
                    return fArr[0];
                case 7:
                    return m24468(cCharAt);
                case 8:
                    if (z2) {
                        String str = (String) c19161.mo13249(cCharAt);
                        Float fM43427 = c18756.m43427(str);
                        if (fM43427 == null) {
                            fM43427 = Float.valueOf(c1539.measureText(str));
                            c18756.m43429(str, fM43427);
                        }
                        return fM43427.floatValue() + (this.f29054 * 2);
                    }
                    break;
                case 9:
                    if (!z2) {
                        return fArr[0];
                    }
                    String str2 = (String) c19161.mo13249(cCharAt);
                    Float fM43428 = c18756.m43427(str2);
                    if (fM43428 == null) {
                        fM43428 = Float.valueOf(c1539.measureText(str2));
                        c18756.m43429(str2, fM43428);
                    }
                    return fM43428.floatValue() + (this.f29054 * 2);
                case 10:
                    if (!z2) {
                        return this.f29056;
                    }
                    String str3 = (String) c19161.mo13249(cCharAt);
                    Float fM43429 = c18756.m43427(str3);
                    if (fM43429 == null) {
                        fM43429 = Float.valueOf(c1539.measureText(str3));
                        c18756.m43429(str3, fM43429);
                    }
                    return fM43429.floatValue() + (this.f29054 * 2);
            }
            if (C13835.m33198(cCharAt)) {
                if (i > 0 && C13835.m33198(charSequence.charAt(i - 1))) {
                    if (C13835.m33195(cCharAt)) {
                        return m24468(cCharAt);
                    }
                    return this.f29067;
                }
            } else if (cCharAt != 8205) {
                return m24468(cCharAt);
            }
            return 0.0f;
        }
        String string = charSequence.subSequence(i, i2).toString();
        Float fM434210 = c18756.m43427(string);
        if (fM434210 == null) {
            fM434210 = Float.valueOf(m24469(string, 0, string.length(), 0.0f, Float.POSITIVE_INFINITY));
            c18756.m43429(string, fM434210);
        }
        return fM434210.floatValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24473(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z, C13740 c13740) {
        InterfaceC23694 interfaceC23694 = this.f29055;
        this.f29055 = c13740;
        try {
            return m24472(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
        } finally {
            this.f29055 = interfaceC23694;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24464(final Canvas canvas, final CharSequence charSequence, final int i, final int i2, final float f, final float f2, final Paint paint) {
        if (this.f29055 == null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            return;
        }
        boolean z = charSequence instanceof String;
        Rect rect = this.f29074;
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
        m24462(canvas, f, f2, paint, new Runnable() { // from class: l.ᩳ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawText(charSequence, i, i2, f, f2, paint);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24465(final Canvas canvas, final char[] cArr, final int i, final float f, final float f2, final Paint paint) {
        if (this.f29055 == null) {
            canvas.drawText(cArr, 0, i, f, f2, paint);
        } else {
            paint.getTextBounds(cArr, 0, i, this.f29074);
            m24462(canvas, f, f2, paint, new Runnable() { // from class: l.ܽ۫ۡ
                @Override // java.lang.Runnable
                public final void run() {
                    canvas.drawText(cArr, 0, i, f, f2, paint);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24462(Canvas canvas, float f, float f2, Paint paint, Runnable runnable) {
        Rect rect = this.f29074;
        if (rect.isEmpty()) {
            runnable.run();
        } else if (this.f29055.mo27305(canvas, paint, f + rect.left, f2 + rect.top, f + rect.right, f2 + rect.bottom, runnable)) {
            this.f29055 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24463(final Canvas canvas, final Paint paint, final float f, final float f2, final float f3, final float f4) {
        InterfaceC23694 interfaceC23694 = this.f29055;
        if (interfaceC23694 == null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else if (interfaceC23694.mo27305(canvas, paint, f, f2, f3, f4, new Runnable() { // from class: l.ܿ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        })) {
            this.f29055 = null;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24472(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
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
        C2528 c2528;
        int i8;
        char c;
        C2528 c2529;
        int i9;
        boolean z4;
        float f7;
        char cCharAt;
        boolean z5;
        int i10;
        C2528 c25210;
        char c2;
        float fMeasureText3;
        int i11;
        boolean z6;
        float f8;
        int i12;
        int iM50336;
        float f9;
        C2528 c25211;
        float f10;
        C2528 c25212;
        float f11;
        int i13;
        C2528 c25213;
        boolean z7;
        int i14;
        boolean zM33198;
        canvas = canvas;
        CharSequence charSequence3 = charSequence;
        paint = paint;
        boolean z8 = this.f29075;
        boolean z9 = this.f29079;
        String[] strArr = z9 ? f29049 : f29048;
        float[] fArr = this.f29064;
        float[] fArr2 = z9 ? this.f29052 : fArr;
        boolean z10 = this.f29076;
        boolean z11 = (i5 & 1) != 0;
        boolean z12 = (i5 & 2) != 0;
        boolean z13 = (i5 & 4) != 0;
        boolean z14 = (i5 & 8) != 0;
        boolean z15 = (z || !(z13 || z14)) ? z : true;
        if (z11) {
            paint.setFakeBoldText(true);
        }
        final InterfaceC23694 interfaceC23694 = this.f29055;
        if (z12) {
            int iSave = canvas.save();
            float f12 = this.f29061 / 2.0f;
            canvas.translate(0.0f, (f2 - this.f29062) + f12);
            float f13 = this.f29062 - f12;
            canvas.skew(-0.2f, 0.0f);
            if (interfaceC23694 != null) {
                final float f14 = (f2 - this.f29062) + f12;
                this.f29055 = new InterfaceC23694() { // from class: l.ۧ۫ۡ
                    @Override // l.InterfaceC23694
                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final boolean mo27305(final Canvas canvas2, Paint paint2, float f15, float f16, float f17, float f18, final Runnable runnable) {
                        final float f19 = f14;
                        InterfaceC23694 interfaceC23695 = interfaceC23694;
                        int iSave2 = canvas2.save();
                        try {
                            canvas2.skew(0.2f, 0.0f);
                            canvas2.translate(0.0f, -f19);
                            return interfaceC23695.mo27305(canvas2, paint2, f15 - (f18 * 0.2f), f16 + f19, f17 - (f16 * 0.2f), f18 + f19, new Runnable() { // from class: l.ܳ۫ۡ
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
        C2528 c25214 = this.f29065;
        int i15 = i;
        int iM50337 = i15;
        float f15 = f;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            boolean z18 = false;
            while (true) {
                if (iM50337 < i2) {
                    if (z8) {
                        int iM50338 = C22412.m50336(iM50337, i2, charSequence3);
                        c2528 = c25214;
                        i6 = i6;
                        if (iM50338 - iM50337 == 1) {
                            char cCharAt2 = charSequence3.charAt(iM50337);
                            byte bM30591 = C12425.m30591(cCharAt2);
                            interfaceC23694 = interfaceC23694;
                            if (bM30591 == 15) {
                                zM33198 = C13835.m33198(cCharAt2);
                                if (!zM33198) {
                                    interfaceC23694 = interfaceC23694;
                                }
                                if (zM33198) {
                                    if (cCharAt2 >= 768 || cCharAt2 > 1023) {
                                        zM33198 = false;
                                    } else {
                                        zM33198 = true;
                                    }
                                }
                                float fMeasureText4 = paint.measureText(charSequence3, i15, iM50337);
                                if (!z16 || f15 + fMeasureText4 < i3) {
                                    z2 = z16;
                                } else {
                                    z2 = true;
                                }
                                if (zM33198) {
                                    iM50337++;
                                }
                                i7 = iM50337;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c2528 = c2528;
                                    m24464(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c2528 = c2528;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText4;
                                z7 = this.f29075;
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
                            } else if (bM30591 != 8 || z10) {
                                zM33198 = false;
                                if (zM33198) {
                                    if (cCharAt2 >= 768) {
                                        zM33198 = false;
                                    } else {
                                        zM33198 = false;
                                    }
                                }
                                float fMeasureText5 = paint.measureText(charSequence3, i15, iM50337);
                                if (z16) {
                                    z2 = z16;
                                } else {
                                    z2 = z16;
                                }
                                if (zM33198) {
                                    iM50337++;
                                }
                                i7 = iM50337;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c2528 = c2528;
                                    m24464(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c2528 = c2528;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText5;
                                z7 = this.f29075;
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
                                interfaceC23694 = interfaceC23694;
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
                                    m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            this.f29055 = interfaceC23694;
                            f6 = this.f29068;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f29061 * 0.85f) - this.f29062;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f16 = underlinePosition + f4;
                                m24463(canvas, paint, (int) f, f16, (int) (f15 + 1.0f), f16 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f29061 * 0.551f) - this.f29062;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f17 = f4 + strikeThruPosition;
                                m24463(canvas, paint, (int) f, f17, (int) (f15 + 1.0f), f17 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        interfaceC23694 = interfaceC23694;
                        i15 = i15;
                        iM50337 = iM50338;
                        c25214 = c2528;
                        z10 = z10;
                        i6 = i6;
                        interfaceC23694 = interfaceC23694;
                        fArr = fArr;
                        canvas = canvas;
                    } else {
                        c2528 = c25214;
                        i6 = i6;
                        interfaceC23694 = interfaceC23694;
                        z10 = z10;
                        fArr = fArr;
                        i8 = i15;
                        c = 0;
                        f5 = 0.0f;
                        i7 = iM50337;
                    }
                    char cCharAt3 = charSequence3.charAt(i7);
                    if (!z17) {
                        cCharAt3 = cCharAt3;
                        z18 = z18;
                        f15 = f15;
                        z17 = z17;
                        i15 = i8;
                    } else {
                        if (!C12425.m30592(cCharAt3)) {
                            float fMeasureText6 = paint.measureText(charSequence3, i8, i7);
                            z2 = (z16 || f15 + fMeasureText6 < ((float) i3)) ? z16 : true;
                            if (z2) {
                                m24464(canvas, charSequence, i8, i7, f15, f4, paint);
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
                                    m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                                    m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            this.f29055 = interfaceC23694;
                            f6 = this.f29068;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f29061 * 0.85f) - this.f29062;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f18 = underlinePosition + f4;
                                m24463(canvas, paint, (int) f, f18, (int) (f15 + 1.0f), f18 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f29061 * 0.551f) - this.f29062;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f19 = f4 + strikeThruPosition;
                                m24463(canvas, paint, (int) f, f19, (int) (f15 + 1.0f), f19 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        i15 = i8;
                        iM50337 = i7 + 1;
                        c25214 = c2528;
                        z10 = z10;
                        i6 = i6;
                        interfaceC23694 = interfaceC23694;
                        fArr = fArr;
                        canvas = canvas;
                    }
                    byte bM30592 = C12425.m30591(cCharAt3);
                    C1539 c1539 = this.f29058;
                    C19161 c19161 = f29047;
                    C18756 c18756 = this.f29080;
                    char[] cArr = this.f29071;
                    switch (bM30592) {
                        case 0:
                            char c3 = cCharAt3;
                            c25213 = c2528;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            boolean z19 = (z16 || f15 + this.f29072 < ((float) i3)) ? z16 : true;
                            if (z19) {
                                cArr[0] = c3;
                                m24465(canvas, cArr, 1, f15, f4, paint);
                            }
                            float f20 = f15 + this.f29072;
                            int i16 = i7 + 1;
                            if (z19 && f20 > i4) {
                                z16 = z19;
                                boolean z20 = z17;
                                f15 = f20;
                                i15 = i15;
                                z17 = z20;
                            } else {
                                f7 = f20;
                                iM50337 = i16;
                                z16 = z19;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas2 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas2;
                            }
                            break;
                        case 1:
                            CharSequence charSequence4 = charSequence3;
                            c2529 = c2528;
                            charSequence2 = charSequence4;
                            boolean z21 = (z16 || f15 + this.f29056 < ((float) i3)) ? z16 : true;
                            if (z21 && this.f29081) {
                                if (this.f29050 && !z18 && (i7 >= charSequence.length() - 1 || (cCharAt = charSequence2.charAt(i7 + 1)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                                    z18 = true;
                                }
                                if (!this.f29050 || z18) {
                                    float fCeil = (float) Math.ceil((this.f29056 / 2.0f) + f15);
                                    float fCeil2 = (float) Math.ceil((this.f29061 / 2.0f) + (f4 - this.f29062));
                                    float f21 = this.f29061 * 0.042f;
                                    int color = paint.getColor();
                                    paint.setColor((this.f29063 & 16777215) | (C21943.m49424(100, 50) << 24));
                                    canvas = canvas;
                                    canvas.drawCircle(fCeil, fCeil2, f21, paint);
                                    paint.setColor(color);
                                } else {
                                    canvas = canvas;
                                }
                            } else {
                                canvas = canvas;
                            }
                            float f22 = f15 + this.f29056;
                            i9 = i7 + 1;
                            if (z21 && f22 > i4) {
                                z2 = z21;
                                i7 = i15;
                                z3 = z17;
                                f15 = f22;
                            } else {
                                z4 = z21;
                                f7 = f22;
                                iM50337 = i9;
                                z16 = z4;
                                c25214 = c2529;
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
                            C2528 c25215 = c2528;
                            charSequence2 = charSequence5;
                            float f23 = (f3 + f15) - f;
                            float f24 = this.f29056;
                            float f25 = this.f29066 * f24;
                            float f26 = ((((int) (f23 / f25)) + 1) * f25) - f23;
                            if (f26 < f24) {
                                f26 += f25;
                            }
                            float f27 = f26;
                            z4 = (z16 || f15 + f27 < ((float) i3)) ? z16 : true;
                            if (z4 && this.f29081) {
                                float f28 = f24 * 0.15f;
                                float f29 = f28 + f15;
                                float f30 = (f15 + f27) - f28;
                                float f31 = f4 - this.f29062;
                                float f32 = this.f29061;
                                float f33 = (f32 / 2.0f) + f31;
                                int iMax = Math.max((int) (f32 * 0.02f), 1);
                                int iCeil = (int) Math.ceil(f33 - iMax);
                                int color2 = paint.getColor();
                                paint.setColor((this.f29063 & 16777215) | (C21943.m49424(100, 50) << 24));
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
                                c2529 = c25215;
                                canvas = canvas;
                                iM50337 = i9;
                                z16 = z4;
                                c25214 = c2529;
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
                            c25210 = c2528;
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
                                                int i18 = C2528.f8017;
                                                if ((('a' <= cCharAt4 && cCharAt4 <= 'z') || (('A' <= cCharAt4 && cCharAt4 <= 'Z') || ('0' <= cCharAt4 && cCharAt4 <= '9'))) && c25210.m8040(c4, cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    fMeasureText3 += fArr2[cCharAt4];
                                                    i11++;
                                                    c4 = cCharAt4;
                                                } else if (C13835.m33197(cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    i12 = i11 + 1;
                                                }
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    m24465(canvas, cArr, i12, f15, f4, paint);
                                    i11 = i12;
                                    fMeasureText3 = fMeasureText3;
                                }
                                f8 = f15 + fMeasureText3;
                                iM50337 = i11 + i7;
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
                                    c25214 = c25210;
                                    z10 = z10;
                                    i6 = i6;
                                    interfaceC23694 = interfaceC23694;
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
                            } else if (this.f29059 && (c4 == '#' || c4 == '*')) {
                                iM50336 = i7 + 1;
                                z17 = true;
                                c25214 = c25210;
                                charSequence3 = charSequence2;
                                iM50337 = iM50336;
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
                                m24465(canvas, cArr, i12, f15, f4, paint);
                                i11 = i12;
                                fMeasureText3 = fMeasureText3;
                            }
                            f8 = f15 + fMeasureText3;
                            iM50337 = i11 + i7;
                            if (!z6) {
                            }
                            z18 = false;
                            z16 = z6;
                            c25214 = c25210;
                            z10 = z10;
                            i6 = i6;
                            interfaceC23694 = interfaceC23694;
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
                            C2528 c25216 = c2528;
                            charSequence2 = charSequence3;
                            if (this.f29059 && C12425.m30592(c5)) {
                                iM50336 = i7 + 1;
                                c25210 = c25216;
                                paint = paint;
                                z17 = true;
                                c25214 = c25210;
                                charSequence3 = charSequence2;
                                iM50337 = iM50336;
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
                                            int i19 = C2528.f8017;
                                            if (('a' > c5 || c5 > 'z') && (('A' > c5 || c5 > 'Z') && ('0' > c5 || c5 > '9'))) {
                                                c25212 = c25216;
                                                f11 = f9;
                                                i13 = 1;
                                            } else {
                                                int iMin2 = Math.min(cArr.length, i2 - i7);
                                                int i20 = 1;
                                                f11 = f9;
                                                char c6 = c5;
                                                while (true) {
                                                    if (i20 >= iMin2) {
                                                        c25212 = c25216;
                                                    } else {
                                                        char cCharAt5 = charSequence2.charAt(i7 + i20);
                                                        if (('a' > cCharAt5 || cCharAt5 > 'z') && (('A' > cCharAt5 || cCharAt5 > 'Z') && ('0' > cCharAt5 || cCharAt5 > '9'))) {
                                                            c25212 = c25216;
                                                        } else {
                                                            c25212 = c25216;
                                                            if (c25212.m8040(c6, cCharAt5)) {
                                                                cArr[i20] = cCharAt5;
                                                                f11 += fArr2[cCharAt5];
                                                                i20++;
                                                                c6 = cCharAt5;
                                                                c25216 = c25212;
                                                            }
                                                        }
                                                        if (C13835.m33197(cCharAt5)) {
                                                            cArr[i20] = cCharAt5;
                                                            i13 = i20 + 1;
                                                        }
                                                    }
                                                    i13 = i20;
                                                }
                                            }
                                            float f35 = f11;
                                            c25211 = c25212;
                                            m24465(canvas, cArr, i13, f15, f4, paint);
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
                                            c25213 = c25211;
                                            iM50337 = i10;
                                            z16 = z5;
                                            canvas = canvas;
                                            c25214 = c25213;
                                            z17 = z17;
                                            f15 = f7;
                                            Canvas canvas5 = canvas;
                                            charSequence3 = charSequence2;
                                            canvas = canvas5;
                                        }
                                    } else {
                                        int i21 = this.f29054;
                                        float f36 = i21;
                                        float f37 = f15 + f36;
                                        m24464(canvas, str, 0, str.length(), f37, f4, paint);
                                        float f38 = f4 - this.f29062;
                                        int i22 = i21 * 3;
                                        float f39 = i22;
                                        int iCeil2 = (int) Math.ceil((this.f29051 + f38) - f39);
                                        int iCeil3 = (int) Math.ceil(f38 + this.f29057 + f39);
                                        float f40 = f15 + f34;
                                        float f41 = iCeil2 + i21;
                                        float f42 = f15;
                                        f9 = f34;
                                        m24463(canvas, paint, f42, iCeil2, f40, f41);
                                        float f43 = iCeil2 + i22;
                                        m24463(canvas, paint, f42, f41, f37, f43);
                                        float f44 = f40 - f36;
                                        m24463(canvas, paint, f44, f41, f40, f43);
                                        float f45 = iCeil3 - i21;
                                        float f46 = f15;
                                        m24463(canvas, paint, f46, f45, f40, iCeil3);
                                        float f47 = iCeil3 - i22;
                                        m24463(canvas, paint, f46, f45, f37, f47);
                                        m24463(canvas, paint, f44, f45, f40, f47);
                                    }
                                } else {
                                    f9 = f34;
                                }
                                c25211 = c25216;
                                f10 = f9;
                                f7 = f15 + f10;
                                i10 = i7 + 1;
                                if (!z24) {
                                }
                                z5 = z24;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas6 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas6;
                            }
                            break;
                        case 5:
                            c2528 = c2528;
                            charSequence2 = charSequence3;
                            z6 = (z16 || this.f29077 + f15 < ((float) i3)) ? z16 : true;
                            if (z6) {
                                cArr[c] = 65533;
                                m24465(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + this.f29077;
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
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas7 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas7;
                            }
                            break;
                        case 6:
                            c2528 = c2528;
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
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas8 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas8;
                            }
                            break;
                        case 7:
                            char c7 = cCharAt3;
                            c2528 = c2528;
                            charSequence2 = charSequence3;
                            float fM24468 = m24468(c7);
                            boolean z25 = (z16 || f15 + fM24468 < ((float) i3)) ? z16 : true;
                            if (z25) {
                                cArr[c] = c7;
                                m24465(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + fM24468;
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
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas9 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas9;
                            }
                            break;
                        case 8:
                            char c8 = cCharAt3;
                            c2528 = c2528;
                            if (!z10) {
                                iM50336 = C22412.m50336(i7, i2, charSequence);
                                z8 = true;
                                c25214 = c2528;
                                paint = paint;
                                charSequence3 = charSequence;
                                z17 = z17;
                                iM50337 = iM50336;
                                i15 = i7;
                            } else {
                                String str2 = (String) c19161.mo13249(c8);
                                Float fM43427 = c18756.m43427(str2);
                                if (fM43427 == null) {
                                    fM43427 = Float.valueOf(paint.measureText(str2));
                                    c18756.m43429(str2, fM43427);
                                }
                                float fFloatValue = fM43427.floatValue() + (this.f29054 * 2);
                                boolean z26 = (z16 || f15 + fFloatValue < ((float) i3)) ? z16 : true;
                                if (z26) {
                                    int i23 = this.f29054;
                                    float f48 = i23;
                                    float f49 = f15 + f48;
                                    m24464(canvas, str2, 0, str2.length(), f49, f4, paint);
                                    float f50 = f4 - this.f29062;
                                    int i24 = i23 * 3;
                                    float f51 = i24;
                                    int iCeil4 = (int) Math.ceil((this.f29051 + f50) - f51);
                                    int iCeil5 = (int) Math.ceil(f50 + this.f29057 + f51);
                                    float f52 = f15 + fFloatValue;
                                    float f53 = iCeil4 + i23;
                                    float f54 = f15;
                                    m24463(canvas, paint, f54, iCeil4, f52, f53);
                                    float f55 = iCeil4 + i24;
                                    m24463(canvas, paint, f54, f53, f49, f55);
                                    float f56 = f52 - f48;
                                    m24463(canvas, paint, f56, f53, f52, f55);
                                    float f57 = iCeil5 - i23;
                                    float f58 = f15;
                                    m24463(canvas, paint, f58, f57, f52, iCeil5);
                                    float f59 = iCeil5 - i24;
                                    m24463(canvas, paint, f58, f57, f49, f59);
                                    m24463(canvas, paint, f56, f57, f52, f59);
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
                                    c25211 = c2528;
                                    paint = paint;
                                    c25213 = c25211;
                                    iM50337 = i10;
                                    z16 = z5;
                                    canvas = canvas;
                                    c25214 = c25213;
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
                            c2528 = c2528;
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
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas11 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas11;
                            } else {
                                String str3 = (String) c19161.mo13249(c9);
                                String str4 = (String) c19161.mo13249(c9);
                                Float fM43428 = c18756.m43427(str4);
                                if (fM43428 == null) {
                                    fM43428 = Float.valueOf(c1539.measureText(str4));
                                    c18756.m43429(str4, fM43428);
                                }
                                float fFloatValue2 = fM43428.floatValue();
                                int i25 = this.f29054;
                                float f60 = fFloatValue2 + (i25 * 2);
                                z5 = (z16 || f15 + f60 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f61 = i25;
                                    float f62 = f15 + f61;
                                    m24464(canvas, str3, 0, str3.length(), f62, f4, paint);
                                    float f63 = f4 - this.f29062;
                                    int i26 = i25 * 3;
                                    float f64 = i26;
                                    int iCeil6 = (int) Math.ceil((this.f29051 + f63) - f64);
                                    int iCeil7 = (int) Math.ceil(f63 + this.f29057 + f64);
                                    float f65 = f15 + f60;
                                    float f66 = iCeil6 + i25;
                                    float f67 = f15;
                                    m24463(canvas, paint, f67, iCeil6, f65, f66);
                                    float f68 = iCeil6 + i26;
                                    m24463(canvas, paint, f67, f66, f62, f68);
                                    float f69 = f65 - f61;
                                    m24463(canvas, paint, f69, f66, f65, f68);
                                    float f70 = iCeil7 - i25;
                                    float f71 = f15;
                                    m24463(canvas, paint, f71, f70, f65, iCeil7);
                                    float f72 = iCeil7 - i26;
                                    m24463(canvas, paint, f71, f70, f62, f72);
                                    m24463(canvas, paint, f69, f70, f65, f72);
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
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
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
                                String str5 = (String) c19161.mo13249(c10);
                                String str6 = (String) c19161.mo13249(c10);
                                Float fM43429 = c18756.m43427(str6);
                                if (fM43429 == null) {
                                    fM43429 = Float.valueOf(c1539.measureText(str6));
                                    c18756.m43429(str6, fM43429);
                                }
                                float fFloatValue3 = fM43429.floatValue();
                                int i27 = this.f29054;
                                float f73 = fFloatValue3 + (i27 * 2);
                                z5 = (z16 || f15 + f73 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f74 = i27;
                                    float f75 = f15 + f74;
                                    m24464(canvas, str5, 0, str5.length(), f75, f4, paint);
                                    float f76 = f4 - this.f29062;
                                    int i28 = i27 * 3;
                                    float f77 = i28;
                                    int iCeil8 = (int) Math.ceil((this.f29051 + f76) - f77);
                                    int iCeil9 = (int) Math.ceil(f76 + this.f29057 + f77);
                                    float f78 = f15 + f73;
                                    float f79 = iCeil8 + i27;
                                    float f80 = f15;
                                    m24463(canvas, paint, f80, iCeil8, f78, f79);
                                    float f81 = iCeil8 + i28;
                                    m24463(canvas, paint, f80, f79, f75, f81);
                                    float f82 = f78 - f74;
                                    m24463(canvas, paint, f82, f79, f78, f81);
                                    float f83 = iCeil9 - i27;
                                    float f84 = f15;
                                    m24463(canvas, paint, f84, f83, f78, iCeil9);
                                    float f85 = iCeil9 - i28;
                                    m24463(canvas, paint, f84, f83, f75, f85);
                                    m24463(canvas, paint, f82, f83, f78, f85);
                                }
                                f7 = f15 + f73;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                }
                                charSequence2 = charSequence;
                                c25211 = c2528;
                                paint = paint;
                                c25213 = c25211;
                                iM50337 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c25214 = c25213;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas13 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas13;
                            } else {
                                C2528 c25217 = c2528;
                                if (!z16 && f15 + this.f29056 >= i3) {
                                    z16 = true;
                                }
                                f7 = f15 + this.f29056;
                                int i29 = i7 + 1;
                                if (!z16 || f7 <= i4) {
                                    c2529 = c25217;
                                    charSequence2 = charSequence3;
                                    iM50337 = i29;
                                    canvas = canvas;
                                    c25214 = c2529;
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
                            C2528 c25218 = c2528;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            if (!C13835.m33198(c11)) {
                                z8 = true;
                                c25214 = c25218;
                                f15 = f15;
                                z18 = z18;
                                iM50337 = C22412.m50336(i7, i2, charSequence2);
                                i15 = i7;
                                Canvas canvas15 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas15;
                            } else {
                                float fM24469 = (i7 <= 0 || !C13835.m33198(charSequence2.charAt(i7 - 1))) ? 0.0f : C13835.m33195(c11) ? m24468(c11) : this.f29067;
                                boolean z27 = (z16 || f15 + fM24469 < ((float) i3)) ? z16 : true;
                                if (z27) {
                                    cArr[c] = c11;
                                    m24465(canvas, cArr, 1, f15, f4, paint);
                                }
                                float f86 = f15 + fM24469;
                                iM50337 = i7 + 1;
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
                                    c25214 = c25218;
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
                            m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                    this.f29055 = interfaceC23694;
                    f6 = this.f29068;
                    if (z13) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            underlinePosition = paint.getUnderlinePosition();
                            textSize2 = paint.getUnderlineThickness();
                        } else {
                            underlinePosition = (this.f29061 * 0.85f) - this.f29062;
                            textSize2 = paint.getTextSize() * 0.019f * f6;
                        }
                        float f110 = underlinePosition + f4;
                        m24463(canvas, paint, (int) f, f110, (int) (f15 + 1.0f), f110 + textSize2);
                    }
                    if (z14) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            strikeThruPosition = paint.getStrikeThruPosition();
                            textSize = paint.getStrikeThruThickness();
                        } else {
                            strikeThruPosition = (this.f29061 * 0.551f) - this.f29062;
                            textSize = paint.getTextSize() * 0.021f * f6;
                        }
                        float f111 = f4 + strikeThruPosition;
                        m24463(canvas, paint, (int) f, f111, (int) (f15 + 1.0f), f111 + textSize);
                    }
                    if (z15) {
                        return f15 - f;
                    }
                    return f5;
                }
                i6 = i6;
                interfaceC23694 = interfaceC23694;
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
                        m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                        m24464(canvas, charSequence, i7, i2, f15, f4, paint);
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
                this.f29055 = interfaceC23694;
                f6 = this.f29068;
                if (z13) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        underlinePosition = paint.getUnderlinePosition();
                        textSize2 = paint.getUnderlineThickness();
                    } else {
                        underlinePosition = (this.f29061 * 0.85f) - this.f29062;
                        textSize2 = paint.getTextSize() * 0.019f * f6;
                    }
                    float f112 = underlinePosition + f4;
                    m24463(canvas, paint, (int) f, f112, (int) (f15 + 1.0f), f112 + textSize2);
                }
                if (z14) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        strikeThruPosition = paint.getStrikeThruPosition();
                        textSize = paint.getStrikeThruThickness();
                    } else {
                        strikeThruPosition = (this.f29061 * 0.551f) - this.f29062;
                        textSize = paint.getTextSize() * 0.021f * f6;
                    }
                    float f113 = f4 + strikeThruPosition;
                    m24463(canvas, paint, (int) f, f113, (int) (f15 + 1.0f), f113 + textSize);
                }
                if (z15) {
                    return f15 - f;
                }
                return f5;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24483() {
        C2528 c2528 = this.f29065;
        C1539 c1539 = this.f29058;
        if (c2528 == null || !c2528.f8022.equals(c1539.getTypeface())) {
            this.f29065 = C2528.m8037(c1539.getTypeface());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24461(int i, int i2) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float f = 1.0f - fAlpha;
        return Color.rgb((int) ((Color.red(i2) * fAlpha) + (Color.red(i) * f)), (int) ((Color.green(i2) * fAlpha) + (Color.green(i) * f)), (int) ((Color.blue(i2) * fAlpha) + (Color.blue(i) * f)));
    }
}
