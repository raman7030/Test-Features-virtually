package p067l;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܺ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17729 {

    /* JADX INFO: renamed from: ֫ */
    public final float[] f52949;

    /* JADX INFO: renamed from: ۜ */
    public final Typeface f52950;

    /* JADX INFO: renamed from: ۧ */
    public final int f52951;

    /* JADX INFO: renamed from: ܳ */
    public final C3831 f52952;

    /* JADX INFO: renamed from: ܽ */
    public final int f52953;

    /* JADX INFO: renamed from: ܿ */
    public final float f52954;

    /* JADX INFO: renamed from: ᩳ */
    public final int f52955;

    /* JADX INFO: renamed from: ᩻ */
    public final float f52956;

    public C17729(float f, Typeface typeface) {
        C3831 c3831 = new C3831();
        this.f52952 = c3831;
        this.f52949 = new float[127];
        this.f52956 = f;
        this.f52950 = typeface;
        c3831.setTypeface(typeface);
        c3831.setAntiAlias(true);
        c3831.setTextSize(f);
        int iCeil = (int) Math.ceil(c3831.getFontSpacing());
        this.f52953 = iCeil;
        int iCeil2 = (int) Math.ceil(c3831.ascent());
        this.f52951 = iCeil2;
        this.f52955 = iCeil + iCeil2;
        this.f52954 = c3831.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < this.f52949.length; i++) {
            sb.setCharAt(0, (char) i);
            this.f52949[i] = this.f52952.measureText(sb, 0, 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40288(C19131 c19131, Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int codePoint;
        C17729 c17729 = this;
        C19131 c19132 = c19131;
        boolean zM43502 = c19131.m43502();
        int i9 = i + c19132.f57111;
        int i10 = c19132.f57085;
        int iM43503 = c19131.m43503();
        int iM43506 = c19131.m43506();
        boolean zM43501 = c19131.m43501();
        C4379 c4379M43507 = c19131.m43507();
        C18460 c18460 = c19132.f57113;
        int[] iArr = c18460.f55183;
        int[] iArr2 = c18460.f55183;
        int iM43508 = c19131.m43508();
        if (zM43502) {
            canvas.drawColor(iArr[256], PorterDuff.Mode.SRC);
        }
        float f = c17729.f52955;
        int i11 = i;
        while (i11 < i9) {
            float f2 = f + c17729.f52953;
            int i12 = (i11 == iM43506 && zM43501) ? iM43503 : -1;
            if (i11 < i2 || i11 > i3) {
                i6 = -1;
                i7 = -1;
            } else {
                int i13 = i11 == i2 ? i4 : -1;
                i6 = i11 == i3 ? i5 : c19132.f57085;
                i7 = i13;
            }
            C20473 c20473M9114 = c4379M43507.m9114(c4379M43507.m9121(i11));
            char[] cArr = c20473M9114.f63225;
            long j = 0;
            int i14 = -1;
            int i15 = 0;
            float f3 = 0.0f;
            boolean z = false;
            int i16 = i11;
            int iM46172 = c20473M9114.m46172();
            boolean z2 = false;
            boolean z3 = false;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C4379 c4379 = c4379M43507;
                char c = cArr[i17];
                boolean zIsHighSurrogate = Character.isHighSurrogate(c);
                int i19 = zIsHighSurrogate ? 2 : 1;
                int codePoint2 = zIsHighSurrogate ? Character.toCodePoint(c, cArr[i17 + 1]) : c;
                int iM20874 = C9013.m20874(codePoint2);
                int i20 = i10;
                boolean z4 = i12 == i18 || (iM20874 == 2 && i12 == i18 + 1);
                boolean z5 = i18 >= i7 && i18 <= i6;
                long jM46177 = c20473M9114.m46177(i18);
                C20473 c20473 = c20473M9114;
                float[] fArr = c17729.f52949;
                int i21 = i6;
                float fMeasureText = codePoint2 < fArr.length ? fArr[codePoint2] : c17729.f52952.measureText(cArr, i17, i19);
                boolean z6 = ((double) Math.abs((fMeasureText / c17729.f52954) - ((float) iM20874))) > 0.01d;
                if (jM46177 == j && z4 == z2 && z5 == z3 && !z6 && !z) {
                    iM46172 = iM46172;
                    i7 = i7;
                    iArr2 = iArr2;
                    iArr = iArr;
                    i19 = i19;
                    cArr = cArr;
                    i18 = i18;
                    i8 = i14;
                    z6 = z;
                    iM43506 = iM43506;
                    i9 = i9;
                    i12 = i12;
                    iM20874 = iM20874;
                    i17 = i17;
                } else {
                    if (i18 != 0) {
                        m40287(canvas, cArr, iArr, f2, i14, i18 - i14, i15, i17 - i15, f3, z2 ? iArr2[258] : 0, z3 ? iArr2[259] : 0, iM43508, j, zM43502);
                    }
                    f3 = 0.0f;
                    i8 = i18;
                    z2 = z4;
                    i15 = i17;
                    z3 = z5;
                    j = jM46177;
                }
                f3 += fMeasureText;
                i18 += iM20874;
                i17 += i19;
                int i22 = iM46172;
                while (i17 < i22) {
                    char c2 = cArr[i17];
                    if (Character.isHighSurrogate(c2)) {
                        codePoint = c2;
                        codePoint = Character.toCodePoint(c2, cArr[i17 + 1]);
                    }
                    codePoint = c2;
                    if (C9013.m20874(codePoint) > 0) {
                        break;
                    } else {
                        i17 += Character.isHighSurrogate(cArr[i17]) ? 2 : 1;
                    }
                }
                c17729 = this;
                i14 = i8;
                iM46172 = i22;
                c4379M43507 = c4379;
                iM43506 = iM43506;
                i10 = i20;
                i9 = i9;
                c20473M9114 = c20473;
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
            C4379 c43710 = c4379M43507;
            int i23 = iM43506;
            int i24 = i10;
            int i25 = i9;
            m40287(canvas, cArr, iArr4, f2, i14, i24 - i14, i15, i17 - i15, f3, z2 ? iArr3[258] : 0, z3 ? iArr3[259] : 0, iM43508, j, zM43502);
            i11 = i16 + 1;
            c17729 = this;
            c19132 = c19131;
            f = f2;
            c4379M43507 = c43710;
            iM43506 = i23;
            i10 = i24;
            i9 = i25;
            iArr2 = iArr3;
            iArr = iArr4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40287(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, long j, boolean z) {
        int i8;
        float f3;
        float f4;
        boolean z2;
        C3831 c3831;
        C3831 c3832;
        int i9;
        int iMin;
        int iMin2;
        int iMin3;
        float f5;
        int iM55095 = C25106.m55095(j);
        int i10 = (int) (j & 2047);
        int iM55093 = C25106.m55093(j);
        boolean z3 = (i10 & 9) != 0;
        boolean z4 = (i10 & 4) != 0;
        boolean z5 = (i10 & 2) != 0;
        boolean z6 = (i10 & 64) != 0;
        boolean z7 = (i10 & 256) != 0;
        if ((iM55095 & (-16777216)) != -16777216) {
            if (z3 && iM55095 >= 0 && iM55095 < 8) {
                iM55095 += 8;
            }
            iM55095 = iArr[iM55095];
        }
        if ((iM55093 & (-16777216)) != -16777216) {
            iM55093 = iArr[iM55093];
        }
        if (z ^ ((i10 & 16) != 0)) {
            i8 = iM55093;
        } else {
            i8 = iM55095;
            iM55095 = iM55093;
        }
        float f6 = this.f52954;
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
        int i13 = this.f52951;
        int i14 = this.f52955;
        C3831 c3833 = this.f52952;
        if (iM55095 != i12) {
            c3833.setColor(iM55095);
            c3831 = c3833;
            canvas.drawRect(f3, (f - i14) + i13, f4, f, c3831);
        } else {
            c3831 = c3833;
        }
        if (i6 != 0) {
            C3831 c3834 = c3831;
            c3834.setColor(i6);
            canvas.drawRect(f3, f - (i14 - i13), f4 + 1.0f, f, c3834);
        }
        if (i5 != 0) {
            C3831 c3835 = c3831;
            c3835.setColor(i5);
            float f12 = i14 - i13;
            if (i7 == 1) {
                f12 = (float) (((double) f12) / 4.0d);
            } else {
                if (i7 == 2) {
                    i14 = i14;
                    f5 = (float) (((double) f4) - (((double) ((f4 - f3) * 3.0f)) / 4.0d));
                    f12 = f12;
                }
                c3832 = c3835;
                canvas.drawRect(f3, f - f12, f5, f, c3835);
            }
            f5 = f4;
            c3832 = c3835;
            canvas.drawRect(f3, f - f12, f5, f, c3835);
        } else {
            c3832 = c3831;
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
                if (C13097.f36813) {
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
            c3832.setFakeBoldText(z3);
            c3832.setUnderlineText(z4);
            c3832.setTextSkewX(z8 ? -0.35f : 0.0f);
            c3832.setStrikeThruText(z9);
            c3832.setColor(i9);
            canvas.drawText(cArr, i3, i4, f3, f - i14, c3832);
        }
        if (z2) {
            canvas.restore();
        }
    }
}
