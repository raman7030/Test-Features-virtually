package l;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܺ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16162 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f49783;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Typeface f49784;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49785;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1539 f49786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49787;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f49788;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49789;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f49790;

    public C16162(float f, Typeface typeface) {
        C1539 c1539 = new C1539();
        this.f49786 = c1539;
        this.f49783 = new float[127];
        this.f49790 = f;
        this.f49784 = typeface;
        c1539.setTypeface(typeface);
        c1539.setAntiAlias(true);
        c1539.setTextSize(f);
        int iCeil = (int) Math.ceil(c1539.getFontSpacing());
        this.f49787 = iCeil;
        int iCeil2 = (int) Math.ceil(c1539.ascent());
        this.f49785 = iCeil2;
        this.f49789 = iCeil + iCeil2;
        this.f49788 = c1539.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < this.f49783.length; i++) {
            sb.setCharAt(0, (char) i);
            this.f49783[i] = this.f49786.measureText(sb, 0, 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38096(C17637 c17637, Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int codePoint;
        C16162 c16162 = this;
        C17637 c17638 = c17637;
        boolean zM41256 = c17637.m41256();
        int i9 = i + c17638.f53918;
        int i10 = c17638.f53892;
        int iM41257 = c17637.m41257();
        int iM41260 = c17637.m41260();
        boolean zM41255 = c17637.m41255();
        C2115 c2115M41261 = c17637.m41261();
        C16931 c16931 = c17638.f53920;
        int[] iArr = c16931.f52002;
        int[] iArr2 = c16931.f52002;
        int iM41262 = c17637.m41262();
        if (zM41256) {
            canvas.drawColor(iArr[256], PorterDuff.Mode.SRC);
        }
        float f = c16162.f49789;
        int i11 = i;
        while (i11 < i9) {
            float f2 = f + c16162.f49787;
            int i12 = (i11 == iM41260 && zM41255) ? iM41257 : -1;
            if (i11 < i2 || i11 > i3) {
                i6 = -1;
                i7 = -1;
            } else {
                int i13 = i11 == i2 ? i4 : -1;
                i6 = i11 == i3 ? i5 : c17638.f53892;
                i7 = i13;
            }
            C19049 c19049M7003 = c2115M41261.m7003(c2115M41261.m7010(i11));
            char[] cArr = c19049M7003.f59996;
            long j = 0;
            int i14 = -1;
            int i15 = 0;
            float f3 = 0.0f;
            boolean z = false;
            int i16 = i11;
            int iM43903 = c19049M7003.m43903();
            boolean z2 = false;
            boolean z3 = false;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C2115 c2115 = c2115M41261;
                char c = cArr[i17];
                boolean zIsHighSurrogate = Character.isHighSurrogate(c);
                int i19 = zIsHighSurrogate ? 2 : 1;
                int codePoint2 = zIsHighSurrogate ? Character.toCodePoint(c, cArr[i17 + 1]) : c;
                int iM18920 = C6991.m18920(codePoint2);
                int i20 = i10;
                boolean z4 = i12 == i18 || (iM18920 == 2 && i12 == i18 + 1);
                boolean z5 = i18 >= i7 && i18 <= i6;
                long jM43908 = c19049M7003.m43908(i18);
                C19049 c19049 = c19049M7003;
                float[] fArr = c16162.f49783;
                int i21 = i6;
                float fMeasureText = codePoint2 < fArr.length ? fArr[codePoint2] : c16162.f49786.measureText(cArr, i17, i19);
                boolean z6 = ((double) Math.abs((fMeasureText / c16162.f49788) - ((float) iM18920))) > 0.01d;
                if (jM43908 == j && z4 == z2 && z5 == z3 && !z6 && !z) {
                    iM43903 = iM43903;
                    i7 = i7;
                    iArr2 = iArr2;
                    iArr = iArr;
                    i19 = i19;
                    cArr = cArr;
                    i18 = i18;
                    i8 = i14;
                    z6 = z;
                    iM41260 = iM41260;
                    i9 = i9;
                    i12 = i12;
                    iM18920 = iM18920;
                    i17 = i17;
                } else {
                    if (i18 != 0) {
                        m38095(canvas, cArr, iArr, f2, i14, i18 - i14, i15, i17 - i15, f3, z2 ? iArr2[258] : 0, z3 ? iArr2[259] : 0, iM41262, j, zM41256);
                    }
                    f3 = 0.0f;
                    i8 = i18;
                    z2 = z4;
                    i15 = i17;
                    z3 = z5;
                    j = jM43908;
                }
                f3 += fMeasureText;
                i18 += iM18920;
                i17 += i19;
                int i22 = iM43903;
                while (i17 < i22) {
                    char c2 = cArr[i17];
                    if (Character.isHighSurrogate(c2)) {
                        codePoint = c2;
                        codePoint = Character.toCodePoint(c2, cArr[i17 + 1]);
                    }
                    codePoint = c2;
                    if (C6991.m18920(codePoint) > 0) {
                        break;
                    } else {
                        i17 += Character.isHighSurrogate(cArr[i17]) ? 2 : 1;
                    }
                }
                c16162 = this;
                i14 = i8;
                iM43903 = i22;
                c2115M41261 = c2115;
                iM41260 = iM41260;
                i10 = i20;
                i9 = i9;
                c19049M7003 = c19049;
                i6 = i21;
                z = z6;
                i7 = i7;
                i12 = i12;
                iArr2 = iArr2;
                iArr = iArr;
                cArr = cArr;
            }
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            C2115 c2116 = c2115M41261;
            int i23 = iM41260;
            int i24 = i10;
            int i25 = i9;
            m38095(canvas, cArr, iArr4, f2, i14, i24 - i14, i15, i17 - i15, f3, z2 ? iArr3[258] : 0, z3 ? iArr3[259] : 0, iM41262, j, zM41256);
            i11 = i16 + 1;
            c16162 = this;
            c17638 = c17637;
            f = f2;
            c2115M41261 = c2116;
            iM41260 = i23;
            i10 = i24;
            i9 = i25;
            iArr2 = iArr3;
            iArr = iArr4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38095(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, long j, boolean z) {
        int i8;
        float f3;
        float f4;
        boolean z2;
        C1539 c1539;
        C1539 c15310;
        int i9;
        int iMin;
        int iMin2;
        int iMin3;
        float f5;
        int iM52689 = C23924.m52689(j);
        int i10 = (int) (j & 2047);
        int iM52687 = C23924.m52687(j);
        boolean z3 = (i10 & 9) != 0;
        boolean z4 = (i10 & 4) != 0;
        boolean z5 = (i10 & 2) != 0;
        boolean z6 = (i10 & 64) != 0;
        boolean z7 = (i10 & 256) != 0;
        if ((iM52689 & (-16777216)) != -16777216) {
            if (z3 && iM52689 >= 0 && iM52689 < 8) {
                iM52689 += 8;
            }
            iM52689 = iArr[iM52689];
        }
        if ((iM52687 & (-16777216)) != -16777216) {
            iM52687 = iArr[iM52687];
        }
        if (z ^ ((i10 & 16) != 0)) {
            i8 = iM52687;
        } else {
            i8 = iM52689;
            iM52689 = iM52687;
        }
        float f6 = this.f49788;
        float f7 = i * f6;
        float f8 = i2;
        float f9 = (f8 * f6) + f7;
        float f10 = f2 / f6;
        int i11 = i8;
        boolean z8 = z5;
        boolean z9 = z6;
        if (Math.abs(f10 - f8) > 0.01d) {
            canvas.save();
            canvas.scale(f8 / f10, 1.0f);
            float f11 = f10 / f8;
            f3 = f7 * f11;
            f4 = f9 * f11;
            z2 = true;
        } else {
            f3 = f7;
            f4 = f9;
            z2 = false;
        }
        int i12 = iArr[257];
        int i13 = this.f49785;
        int i14 = this.f49789;
        C1539 c15311 = this.f49786;
        if (iM52689 != i12) {
            c15311.setColor(iM52689);
            c1539 = c15311;
            canvas.drawRect(f3, (f - i14) + i13, f4, f, c1539);
        } else {
            c1539 = c15311;
        }
        if (i6 != 0) {
            C1539 c15312 = c1539;
            c15312.setColor(i6);
            canvas.drawRect(f3, f - (i14 - i13), f4 + 1.0f, f, c15312);
        }
        if (i5 != 0) {
            C1539 c15313 = c1539;
            c15313.setColor(i5);
            float f12 = i14 - i13;
            if (i7 == 1) {
                f12 = (float) (((double) f12) / 4.0d);
            } else {
                if (i7 == 2) {
                    i14 = i14;
                    f5 = (float) (((double) f4) - (((double) ((f4 - f3) * 3.0f)) / 4.0d));
                    f12 = f12;
                }
                c15310 = c15313;
                canvas.drawRect(f3, f - f12, f5, f, c15313);
            }
            f5 = f4;
            c15310 = c15313;
            canvas.drawRect(f3, f - f12, f5, f, c15313);
        } else {
            c15310 = c1539;
            i14 = i14;
        }
        if ((i10 & 32) == 0) {
            if (i5 != 0) {
                i9 = iArr[256];
            } else if (i6 != 0) {
                i9 = iArr[257];
            } else if (z7) {
                int i15 = (i11 >> 16) & 255;
                int i16 = (i11 >> 8) & 255;
                int i17 = i11 & 255;
                if (C11288.f33814) {
                    iMin = (i15 * 2) / 3;
                    iMin2 = (i16 * 2) / 3;
                    iMin3 = (i17 * 2) / 3;
                } else {
                    iMin = Math.min(255, (i15 * 4) / 3);
                    iMin2 = Math.min(255, (i16 * 4) / 3);
                    iMin3 = Math.min(255, (i17 * 4) / 3);
                }
                i9 = ((iMin << 16) - 16777216) + (iMin2 << 8) + iMin3;
            } else {
                i9 = i11;
            }
            c15310.setFakeBoldText(z3);
            c15310.setUnderlineText(z4);
            c15310.setTextSkewX(z8 ? -0.35f : 0.0f);
            c15310.setStrikeThruText(z9);
            c15310.setColor(i9);
            canvas.drawText(cArr, i3, i4, f3, f - i14, c15310);
        }
        if (z2) {
            canvas.restore();
        }
    }
}
