package p067l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.᩵۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38G7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20750 {

    /* JADX INFO: renamed from: ֡ */
    public int f64028;

    /* JADX INFO: renamed from: ֨ */
    public int f64029;

    /* JADX INFO: renamed from: ֫ */
    public int f64030;

    /* JADX INFO: renamed from: ֫֫ */
    public int f64031;

    /* JADX INFO: renamed from: ۖ */
    public CharSequence f64032;

    /* JADX INFO: renamed from: ۗ */
    public final float f64033;

    /* JADX INFO: renamed from: ۘ */
    public Layout.Alignment f64034;

    /* JADX INFO: renamed from: ۙ */
    public int f64035;

    /* JADX INFO: renamed from: ۚ */
    public StaticLayout f64036;

    /* JADX INFO: renamed from: ۛ */
    public StaticLayout f64037;

    /* JADX INFO: renamed from: ۜ */
    public int f64038;

    /* JADX INFO: renamed from: ۟ */
    public int f64039;

    /* JADX INFO: renamed from: ۠ */
    public int f64040;

    /* JADX INFO: renamed from: ۡ */
    public int f64041;

    /* JADX INFO: renamed from: ۢ */
    public float f64042;

    /* JADX INFO: renamed from: ۤ */
    public final float f64043;

    /* JADX INFO: renamed from: ۧ */
    public final Paint f64044;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Paint f64045;

    /* JADX INFO: renamed from: ۨ */
    public int f64046;

    /* JADX INFO: renamed from: ۫ */
    public final float f64047;

    /* JADX INFO: renamed from: ۬ */
    public final float f64048;

    /* JADX INFO: renamed from: ܰ */
    public final TextPaint f64049;

    /* JADX INFO: renamed from: ܳ */
    public float f64050;

    /* JADX INFO: renamed from: ܶ */
    public final float f64051;

    /* JADX INFO: renamed from: ܺ */
    public float f64052;

    /* JADX INFO: renamed from: ܽ */
    public Rect f64053;

    /* JADX INFO: renamed from: ܿ */
    public Bitmap f64054;

    /* JADX INFO: renamed from: ᩳ */
    public float f64055;

    /* JADX INFO: renamed from: ᩴ */
    public float f64056;

    /* JADX INFO: renamed from: ᩵ */
    public float f64057;

    /* JADX INFO: renamed from: ᩶ */
    public int f64058;

    /* JADX INFO: renamed from: ᩷ */
    public int f64059;

    /* JADX INFO: renamed from: ᩸ */
    public int f64060;

    /* JADX INFO: renamed from: ᩹ */
    public int f64061;

    /* JADX INFO: renamed from: ᩺ */
    public int f64062;

    /* JADX INFO: renamed from: ᩻ */
    public float f64063;

    public C20750(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f64047 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f64043 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f64051 = fRound;
        this.f64048 = fRound;
        this.f64033 = fRound;
        TextPaint textPaint = new TextPaint();
        this.f64049 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f64045 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f64044 = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x0256  */
    /* JADX WARN: Code duplicated, block: B:111:0x0283 A[LOOP:1: B:110:0x0281->B:111:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x030f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0312  */
    /* JADX WARN: Code duplicated, block: B:141:0x0317  */
    /* JADX WARN: Code duplicated, block: B:143:0x032c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0337  */
    /* JADX WARN: Code duplicated, block: B:145:0x0344 A[PHI: r6
      0x0344: PHI (r6v33 int) = (r6v29 int), (r6v41 int) binds: [B:144:0x0337, B:136:0x030c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x034b  */
    /* JADX WARN: Code duplicated, block: B:149:0x034e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0352  */
    /* JADX WARN: Code duplicated, block: B:152:0x0354  */
    /* JADX WARN: Code duplicated, block: B:154:0x0398  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0216 A[LOOP:0: B:96:0x0214->B:97:0x0216, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0206, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m46859(C21196 c21196, C24023 c24023, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        TextPaint textPaint;
        CharSequence charSequence;
        boolean z2;
        Layout.Alignment alignment;
        int i6;
        boolean z3;
        Bitmap bitmap;
        float f4;
        int iRound;
        float f5;
        int iRound2;
        int i7;
        float f6;
        int i8;
        float f7;
        boolean z4;
        CharSequence charSequence2;
        SpannableStringBuilder spannableStringBuilder;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f8;
        int i14;
        SpannableStringBuilder spannableStringBuilder2;
        Layout.Alignment alignment2;
        int height;
        int lineCount;
        int iMax;
        int i15;
        int i16;
        int i17;
        float f9;
        int iMax2;
        int iMin;
        int i18;
        float f10;
        int iRound3;
        int lineBottom;
        float f11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Bitmap bitmap2 = c21196.f66624;
        float f12 = c21196.f66631;
        float f13 = c21196.f66630;
        int i27 = c21196.f66628;
        float f14 = c21196.f66640;
        int i28 = c21196.f66636;
        int i29 = c21196.f66635;
        float f15 = c21196.f66634;
        Layout.Alignment alignment3 = c21196.f66633;
        CharSequence charSequence3 = c21196.f66629;
        boolean z5 = bitmap2 == null;
        if (!z5) {
            z = z5;
            i5 = -16777216;
        } else {
            if (TextUtils.isEmpty(charSequence3)) {
                return;
            }
            z = z5;
            i5 = c21196.f66623 ? c21196.f66638 : c24023.f76303;
        }
        CharSequence charSequence4 = this.f64032;
        TextPaint textPaint2 = this.f64049;
        if ((charSequence4 == charSequence3 || (charSequence4 != null && charSequence4.equals(charSequence3))) && C12826.equals(this.f64034, alignment3) && this.f64054 == bitmap2 && this.f64063 == f15 && this.f64059 == i29) {
            if (Integer.valueOf(this.f64038).equals(Integer.valueOf(i28)) && this.f64042 == f14 && Integer.valueOf(this.f64041).equals(Integer.valueOf(i27)) && this.f64052 == f13 && this.f64050 == f12 && this.f64040 == c24023.f76306 && this.f64030 == c24023.f76301 && this.f64031 == i5 && this.f64029 == c24023.f76304 && this.f64028 == c24023.f76302 && C12826.equals(textPaint2.getTypeface(), c24023.f76305) && this.f64057 == f) {
                textPaint = textPaint2;
                if (this.f64056 == f2) {
                    z2 = z;
                    if (this.f64055 == f3) {
                        charSequence = charSequence3;
                        if (this.f64061 == i) {
                            alignment = alignment3;
                            if (this.f64035 == i2) {
                                f15 = f15;
                                if (this.f64058 == i3) {
                                    i29 = i29;
                                    if (this.f64060 == i4) {
                                        m46858(canvas, z2);
                                        return;
                                    }
                                } else {
                                    i29 = i29;
                                }
                            }
                        } else {
                            alignment = alignment3;
                        }
                        i29 = i29;
                        i6 = i28;
                        f15 = f15;
                    } else {
                        f15 = f15;
                        i29 = i29;
                        alignment = alignment3;
                        charSequence = charSequence3;
                    }
                    i6 = i28;
                }
                this.f64032 = charSequence;
                this.f64034 = alignment;
                this.f64054 = bitmap2;
                this.f64063 = f15;
                this.f64059 = i29;
                this.f64038 = i6;
                this.f64042 = f14;
                this.f64041 = i27;
                this.f64052 = f13;
                this.f64050 = f12;
                this.f64040 = c24023.f76306;
                this.f64030 = c24023.f76301;
                this.f64031 = i5;
                this.f64029 = c24023.f76304;
                this.f64028 = c24023.f76302;
                textPaint.setTypeface(c24023.f76305);
                this.f64057 = f;
                this.f64056 = f2;
                this.f64055 = f3;
                this.f64061 = i;
                this.f64035 = i2;
                this.f64058 = i3;
                this.f64060 = i4;
                if (z2) {
                    this.f64032.getClass();
                    charSequence2 = this.f64032;
                    if (charSequence2 instanceof SpannableStringBuilder) {
                        spannableStringBuilder = (SpannableStringBuilder) charSequence2;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(this.f64032);
                    }
                    i9 = this.f64058 - this.f64061;
                    i10 = this.f64060 - this.f64035;
                    textPaint.setTextSize(this.f64057);
                    i11 = (int) ((this.f64057 * 0.125f) + 0.5f);
                    i12 = i11 * 2;
                    i13 = i9 - i12;
                    f8 = this.f64052;
                    if (f8 != -3.4028235E38f) {
                        i13 = (int) (i13 * f8);
                    }
                    if (i13 <= 0) {
                        C21334.m48351("Skipped drawing subtitle cue (insufficient space)");
                        z4 = z2;
                    } else {
                        if (this.f64056 > 0.0f) {
                            i14 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f64056), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (this.f64029 == 1) {
                            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpan);
                            }
                        }
                        if (Color.alpha(this.f64030) > 0) {
                            i25 = this.f64029;
                            if (i25 != 0 || i25 == 2) {
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f64030), 0, spannableStringBuilder.length(), 16711680);
                            } else {
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f64030), 0, spannableStringBuilder2.length(), 16711680);
                            }
                        }
                        alignment2 = this.f64034;
                        if (alignment2 == null) {
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                        }
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i13, alignment2, this.f64043, this.f64047, true);
                        this.f64037 = staticLayout;
                        height = staticLayout.getHeight();
                        lineCount = this.f64037.getLineCount();
                        iMax = 0;
                        i15 = 0;
                        while (i15 < lineCount) {
                            iMax = Math.max((int) Math.ceil(this.f64037.getLineWidth(i15)), iMax);
                            i15++;
                            lineCount = lineCount;
                            i11 = i11;
                            z2 = z2;
                        }
                        z3 = z2;
                        i16 = i11;
                        if (this.f64052 != -3.4028235E38f || iMax >= i13) {
                            i13 = iMax;
                        }
                        i17 = i13 + i12;
                        f9 = this.f64042;
                        if (f9 != -3.4028235E38f) {
                            int iRound4 = Math.round(i9 * f9);
                            int i30 = this.f64061;
                            i23 = iRound4 + i30;
                            i24 = this.f64041;
                            if (i24 != 1) {
                                i23 = ((i23 * 2) - i17) / 2;
                            } else if (i24 == 2) {
                                i23 -= i17;
                            }
                            iMax2 = Math.max(i23, i30);
                            iMin = Math.min(i17 + iMax2, this.f64058);
                        } else {
                            iMax2 = this.f64061 + ((i9 - i17) / 2);
                            iMin = iMax2 + i17;
                        }
                        i18 = iMin - iMax2;
                        if (i18 <= 0) {
                            C21334.m48351("Skipped drawing subtitle cue (invalid horizontal positioning)");
                        } else {
                            f10 = this.f64063;
                            if (f10 != -3.4028235E38f) {
                                if (this.f64059 == 0) {
                                    iRound3 = Math.round(i10 * f10) + this.f64035;
                                    i22 = this.f64038;
                                    if (i22 == 2) {
                                        iRound3 -= height;
                                    } else if (i22 == 1) {
                                        iRound3 = ((iRound3 * 2) - height) / 2;
                                    }
                                } else {
                                    lineBottom = this.f64037.getLineBottom(0) - this.f64037.getLineTop(0);
                                    f11 = this.f64063;
                                    if (f11 >= 0.0f) {
                                        iRound3 = Math.round(f11 * lineBottom) + this.f64035;
                                    } else {
                                        iRound3 = Math.round((f11 + 1.0f) * lineBottom) + this.f64060;
                                        iRound3 -= height;
                                    }
                                }
                                i19 = iRound3 + height;
                                i20 = this.f64060;
                                if (i19 > i20) {
                                    iRound3 = i20 - height;
                                } else {
                                    i21 = this.f64035;
                                    if (iRound3 < i21) {
                                        iRound3 = i21;
                                    }
                                }
                            } else {
                                iRound3 = (this.f64060 - height) - ((int) (i10 * this.f64055));
                            }
                            TextPaint textPaint3 = textPaint;
                            Layout.Alignment alignment4 = alignment2;
                            this.f64037 = new StaticLayout(spannableStringBuilder, textPaint3, i18, alignment4, this.f64043, this.f64047, true);
                            this.f64036 = new StaticLayout(spannableStringBuilder2, textPaint3, i18, alignment4, this.f64043, this.f64047, true);
                            this.f64046 = iMax2;
                            this.f64039 = iRound3;
                            this.f64062 = i16;
                        }
                    }
                    m46858(canvas, z4);
                }
                z3 = z2;
                this.f64054.getClass();
                bitmap = this.f64054;
                int i31 = this.f64058;
                int i32 = this.f64061;
                int i33 = this.f64060;
                int i34 = this.f64035;
                float f16 = i31 - i32;
                float f17 = (this.f64042 * f16) + i32;
                f4 = i33 - i34;
                float f18 = (this.f64063 * f4) + i34;
                iRound = Math.round(f16 * this.f64052);
                f5 = this.f64050;
                if (f5 != -3.4028235E38f) {
                    iRound2 = Math.round(f4 * f5);
                } else {
                    iRound2 = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound);
                }
                i7 = this.f64041;
                if (i7 == 2) {
                    f6 = iRound;
                } else {
                    if (i7 == 1) {
                        f6 = iRound / 2;
                    }
                    int iRound5 = Math.round(f17);
                    i8 = this.f64038;
                    if (i8 == 2) {
                        f7 = iRound2;
                    } else {
                        if (i8 == 1) {
                            f7 = iRound2 / 2;
                        }
                        int iRound6 = Math.round(f18);
                        this.f64053 = new Rect(iRound5, iRound6, iRound + iRound5, iRound2 + iRound6);
                    }
                    f18 -= f7;
                    int iRound7 = Math.round(f18);
                    this.f64053 = new Rect(iRound5, iRound7, iRound + iRound5, iRound2 + iRound7);
                }
                f17 -= f6;
                int iRound8 = Math.round(f17);
                i8 = this.f64038;
                if (i8 == 2) {
                    f7 = iRound2;
                } else {
                    if (i8 == 1) {
                        f7 = iRound2 / 2;
                    }
                    int iRound9 = Math.round(f18);
                    this.f64053 = new Rect(iRound8, iRound9, iRound + iRound8, iRound2 + iRound9);
                }
                f18 -= f7;
                int iRound10 = Math.round(f18);
                this.f64053 = new Rect(iRound8, iRound10, iRound + iRound8, iRound2 + iRound10);
                z4 = z3;
                m46858(canvas, z4);
            }
            textPaint = textPaint2;
            charSequence = charSequence3;
        } else {
            canvas = canvas;
            charSequence = charSequence3;
            textPaint = textPaint2;
        }
        i6 = i28;
        alignment = alignment3;
        z2 = z;
        this.f64032 = charSequence;
        this.f64034 = alignment;
        this.f64054 = bitmap2;
        this.f64063 = f15;
        this.f64059 = i29;
        this.f64038 = i6;
        this.f64042 = f14;
        this.f64041 = i27;
        this.f64052 = f13;
        this.f64050 = f12;
        this.f64040 = c24023.f76306;
        this.f64030 = c24023.f76301;
        this.f64031 = i5;
        this.f64029 = c24023.f76304;
        this.f64028 = c24023.f76302;
        textPaint.setTypeface(c24023.f76305);
        this.f64057 = f;
        this.f64056 = f2;
        this.f64055 = f3;
        this.f64061 = i;
        this.f64035 = i2;
        this.f64058 = i3;
        this.f64060 = i4;
        if (z2) {
            this.f64032.getClass();
            charSequence2 = this.f64032;
            if (charSequence2 instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence2;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(this.f64032);
            }
            i9 = this.f64058 - this.f64061;
            i10 = this.f64060 - this.f64035;
            textPaint.setTextSize(this.f64057);
            i11 = (int) ((this.f64057 * 0.125f) + 0.5f);
            i12 = i11 * 2;
            i13 = i9 - i12;
            f8 = this.f64052;
            if (f8 != -3.4028235E38f) {
                i13 = (int) (i13 * f8);
            }
            if (i13 <= 0) {
                C21334.m48351("Skipped drawing subtitle cue (insufficient space)");
                z4 = z2;
            } else {
                if (this.f64056 > 0.0f) {
                    i14 = 0;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f64056), 0, spannableStringBuilder.length(), 16711680);
                } else {
                    i14 = 0;
                }
                spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if (this.f64029 == 1) {
                    while (i26 < r14) {
                        spannableStringBuilder2.removeSpan(foregroundColorSpan);
                    }
                }
                if (Color.alpha(this.f64030) > 0) {
                    i25 = this.f64029;
                    if (i25 != 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f64030), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f64030), 0, spannableStringBuilder.length(), 16711680);
                    }
                }
                alignment2 = this.f64034;
                if (alignment2 == null) {
                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder, textPaint, i13, alignment2, this.f64043, this.f64047, true);
                this.f64037 = staticLayout2;
                height = staticLayout2.getHeight();
                lineCount = this.f64037.getLineCount();
                iMax = 0;
                i15 = 0;
                while (i15 < lineCount) {
                    iMax = Math.max((int) Math.ceil(this.f64037.getLineWidth(i15)), iMax);
                    i15++;
                    lineCount = lineCount;
                    i11 = i11;
                    z2 = z2;
                }
                z3 = z2;
                i16 = i11;
                if (this.f64052 != -3.4028235E38f) {
                    i13 = iMax;
                } else {
                    i13 = iMax;
                }
                i17 = i13 + i12;
                f9 = this.f64042;
                if (f9 != -3.4028235E38f) {
                    int iRound11 = Math.round(i9 * f9);
                    int i35 = this.f64061;
                    i23 = iRound11 + i35;
                    i24 = this.f64041;
                    if (i24 != 1) {
                        i23 = ((i23 * 2) - i17) / 2;
                    } else if (i24 == 2) {
                        i23 -= i17;
                    }
                    iMax2 = Math.max(i23, i35);
                    iMin = Math.min(i17 + iMax2, this.f64058);
                } else {
                    iMax2 = this.f64061 + ((i9 - i17) / 2);
                    iMin = iMax2 + i17;
                }
                i18 = iMin - iMax2;
                if (i18 <= 0) {
                    C21334.m48351("Skipped drawing subtitle cue (invalid horizontal positioning)");
                } else {
                    f10 = this.f64063;
                    if (f10 != -3.4028235E38f) {
                        if (this.f64059 == 0) {
                            iRound3 = Math.round(i10 * f10) + this.f64035;
                            i22 = this.f64038;
                            if (i22 == 2) {
                                iRound3 -= height;
                            } else if (i22 == 1) {
                                iRound3 = ((iRound3 * 2) - height) / 2;
                            }
                        } else {
                            lineBottom = this.f64037.getLineBottom(0) - this.f64037.getLineTop(0);
                            f11 = this.f64063;
                            if (f11 >= 0.0f) {
                                iRound3 = Math.round(f11 * lineBottom) + this.f64035;
                            } else {
                                iRound3 = Math.round((f11 + 1.0f) * lineBottom) + this.f64060;
                                iRound3 -= height;
                            }
                        }
                        i19 = iRound3 + height;
                        i20 = this.f64060;
                        if (i19 > i20) {
                            iRound3 = i20 - height;
                        } else {
                            i21 = this.f64035;
                            if (iRound3 < i21) {
                                iRound3 = i21;
                            }
                        }
                    } else {
                        iRound3 = (this.f64060 - height) - ((int) (i10 * this.f64055));
                    }
                    TextPaint textPaint4 = textPaint;
                    Layout.Alignment alignment5 = alignment2;
                    this.f64037 = new StaticLayout(spannableStringBuilder, textPaint4, i18, alignment5, this.f64043, this.f64047, true);
                    this.f64036 = new StaticLayout(spannableStringBuilder2, textPaint4, i18, alignment5, this.f64043, this.f64047, true);
                    this.f64046 = iMax2;
                    this.f64039 = iRound3;
                    this.f64062 = i16;
                }
            }
            m46858(canvas, z4);
        }
        z3 = z2;
        this.f64054.getClass();
        bitmap = this.f64054;
        int i36 = this.f64058;
        int i37 = this.f64061;
        int i38 = this.f64060;
        int i39 = this.f64035;
        float f19 = i36 - i37;
        float f110 = (this.f64042 * f19) + i37;
        f4 = i38 - i39;
        float f111 = (this.f64063 * f4) + i39;
        iRound = Math.round(f19 * this.f64052);
        f5 = this.f64050;
        if (f5 != -3.4028235E38f) {
            iRound2 = Math.round(f4 * f5);
        } else {
            iRound2 = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound);
        }
        i7 = this.f64041;
        if (i7 == 2) {
            f6 = iRound;
        } else {
            if (i7 == 1) {
                f6 = iRound / 2;
            }
            int iRound12 = Math.round(f110);
            i8 = this.f64038;
            if (i8 == 2) {
                f7 = iRound2;
            } else {
                if (i8 == 1) {
                    f7 = iRound2 / 2;
                }
                int iRound13 = Math.round(f111);
                this.f64053 = new Rect(iRound12, iRound13, iRound + iRound12, iRound2 + iRound13);
            }
            f111 -= f7;
            int iRound14 = Math.round(f111);
            this.f64053 = new Rect(iRound12, iRound14, iRound + iRound12, iRound2 + iRound14);
        }
        f110 -= f6;
        int iRound15 = Math.round(f110);
        i8 = this.f64038;
        if (i8 == 2) {
            f7 = iRound2;
        } else {
            if (i8 == 1) {
                f7 = iRound2 / 2;
            }
            int iRound16 = Math.round(f111);
            this.f64053 = new Rect(iRound15, iRound16, iRound + iRound15, iRound2 + iRound16);
        }
        f111 -= f7;
        int iRound17 = Math.round(f111);
        this.f64053 = new Rect(iRound15, iRound17, iRound + iRound15, iRound2 + iRound17);
        z4 = z3;
        m46858(canvas, z4);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46858(Canvas canvas, boolean z) {
        if (!z) {
            this.f64053.getClass();
            this.f64054.getClass();
            canvas.drawBitmap(this.f64054, (Rect) null, this.f64053, this.f64044);
            return;
        }
        StaticLayout staticLayout = this.f64037;
        StaticLayout staticLayout2 = this.f64036;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f64046, this.f64039);
        if (Color.alpha(this.f64031) > 0) {
            int i = this.f64031;
            Paint paint = this.f64045;
            paint.setColor(i);
            canvas.drawRect(-this.f64062, 0.0f, staticLayout.getWidth() + this.f64062, staticLayout.getHeight(), paint);
        }
        int i2 = this.f64029;
        TextPaint textPaint = this.f64049;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f64051);
            textPaint.setColor(this.f64028);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f64048;
            if (i2 == 2) {
                float f2 = this.f64033;
                textPaint.setShadowLayer(f, f2, f2, this.f64028);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f64028;
                int i4 = z2 ? this.f64028 : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f64040);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f64040);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
