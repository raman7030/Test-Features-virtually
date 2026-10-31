package l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4690 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f14882 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f14883 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f14884;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14886;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f14889;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f14893;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14895;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f14896;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14899;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6807 f14900;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RectF f14887 = new RectF();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RectF f14897 = new RectF();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final RectF f14898 = new RectF();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14792 f14888 = new C14792(3);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f14892 = C5659.f17466;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean[] f14894 = C19771.f63835;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] f14891 = new char[2];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] f14885 = new char[1];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final char[] f14890 = new char[13];

    public C4690(C6807 c6807) {
        this.f14900 = c6807;
        C10607 c10607 = c6807.f21110;
        this.f14884 = (Math.max(Math.max(c10607.f31851.getIntrinsicHeight(), c10607.f31850.getIntrinsicHeight()), c10607.f31838.getIntrinsicHeight()) * 3) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x05f8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13751(Canvas canvas, boolean z, boolean z2, float f, boolean z3) {
        char[] cArr;
        int i;
        int i2;
        int i3;
        C1539 c1539;
        int i4;
        int i5;
        C11041 c11041;
        Drawable drawable;
        Drawable drawable2;
        float f2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        float f3;
        boolean z7;
        Drawable drawable3;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char[] cArr2;
        this.f14893 = false;
        this.f14895 = false;
        C6807 c6807 = this.f14900;
        C11041 c11042 = c6807.f21109;
        C10607 c10607 = c6807.f21110;
        int width = c6807.getWidth();
        int height = c6807.getHeight();
        int i16 = c10607.f31845;
        float f5 = c10607.f31861;
        float f6 = c10607.f31856;
        int iM13766 = m13766();
        float f7 = c10607.f31848;
        float fM27419 = (c11042.m27419() + 1) * f7;
        int iM27413 = c11042.m27413();
        C1539 c15310 = c10607.f31844;
        int i17 = c10607.f31860;
        long jM18494 = c6807.m18494();
        long j = iM13766;
        int iM13745 = m13745(jM18494 + j);
        int iMax = Math.max(iM13745, m13745(jM18494 + ((long) height)));
        float fM13746 = m13746();
        long j2 = j - jM18494;
        long j3 = iM13745;
        long j4 = i16;
        long j5 = (j3 * j4) + j2;
        int i18 = width;
        long j6 = ((long) i17) + j5;
        int i19 = (int) j6;
        if (j6 != i19) {
            throw new ArithmeticException();
        }
        long j7 = iMax;
        long j8 = (j7 - j3) + 1;
        long j9 = (int) j8;
        if (j8 != j9) {
            throw new ArithmeticException();
        }
        long j10 = iM27413;
        long j11 = j9 * j10;
        int i20 = (int) j11;
        if (j11 != i20) {
            throw new ArithmeticException();
        }
        if (this.f14892.length < i20) {
            this.f14892 = new byte[i20];
            this.f14894 = new boolean[i20];
        }
        long j12 = j3 * j10;
        int i21 = (int) j12;
        if (j12 != i21) {
            throw new ArithmeticException();
        }
        int iM27388 = c11042.m27388(i21, i20, this.f14892, this.f14894);
        canvas.drawColor(c10607.f31858);
        c15310.setColor(c10607.f31834);
        int i22 = height;
        float f8 = i22;
        int i23 = iM13766;
        C1539 c15311 = c15310;
        canvas.drawRect(0.0f, 0.0f, fM27419, f8, c15311);
        c15311.setColor(c10607.f31841);
        float f9 = f7 / 2.0f;
        int i24 = iM13745;
        int i25 = i19;
        while (true) {
            cArr = f14883;
            if (i24 > iMax) {
                break;
            }
            long j13 = ((long) i24) * j10;
            int iM27419 = c11042.m27419();
            int i26 = iM27419 - 1;
            while (true) {
                cArr2 = this.f14890;
                if (i26 >= 0) {
                    cArr2[i26] = cArr[(int) (j13 & 15)];
                    j13 >>>= 4;
                    i26--;
                    iMax = iMax;
                    c15311 = c15311;
                }
            }
            C1539 c15312 = c15311;
            cArr2[iM27419] = ' ';
            cArr2[iM27419 + 1] = ' ';
            cArr2[iM27419 + 2] = ' ';
            cArr2[iM27419 + 3] = ' ';
            cArr2[iM27419 + 4] = '.';
            canvas.drawText(this.f14890, 0, iM27419 + 5, f9, i25, c15312);
            i25 += i16;
            i24++;
            iMax = iMax;
            c15311 = c15312;
            i22 = i22;
        }
        C1539 c15313 = c15311;
        int i27 = i22;
        int i28 = iMax;
        int iM27418 = c11042.m27418();
        int iM27404 = c11042.m27404();
        if (c11042.m27406()) {
            i = iM27413;
            i2 = -1;
        } else {
            i = iM27413;
            i2 = iM27418 / i;
        }
        this.f14896 = false;
        int i29 = (int) j5;
        int i30 = i;
        int i31 = iM27404;
        if (j5 != i29) {
            throw new ArithmeticException();
        }
        int i32 = i29;
        boolean z8 = true;
        while (i3 <= i28) {
            if (i3 == i2) {
                this.f14896 = z8;
                c15313.setColor(c10607.f31855);
                i10 = i18;
                f4 = f8;
                i12 = i2;
                i8 = iM27388;
                i11 = i30;
                i13 = i3;
                i9 = i31;
                i14 = iM27418;
                i15 = i32;
                canvas.drawRect(fM27419, i32, i18, i32 + i16, c15313);
            } else {
                i8 = iM27388;
                f4 = f8;
                i9 = i31;
                i10 = i18;
                i11 = i30;
                i12 = i2;
                i13 = i3;
                i14 = iM27418;
                i15 = i32;
                if (i13 % 2 != 0) {
                    c15313.setColor(c10607.f31859);
                    canvas.drawRect(fM27419, i15, i10, i15 + i16, c15313);
                } else {
                    c15313.setColor(c10607.f31858);
                    canvas.drawRect(fM27419, i15, i10, i15 + i16, c15313);
                }
            }
            i32 = i15 + i16;
            i3 = i13 + 1;
            z8 = true;
            i18 = i10;
            i30 = i11;
            i2 = i12;
            iM27388 = i8;
            iM27418 = i14;
            f8 = f4;
            i31 = i9;
        }
        i3 = iM13745;
        int i33 = iM27388;
        float f10 = f8;
        int i34 = i31;
        int i35 = i18;
        int i36 = i30;
        int i37 = i2;
        int i38 = iM27418;
        if (c11042.m27406()) {
            c1539 = c15313;
            int i39 = i38 / i36;
            int i40 = i34;
            int i41 = i40 / i36;
            if ((iM13745 > i39 || i39 > i28) && ((iM13745 > i41 || i41 > i28) && (i39 >= iM13745 || i41 <= i28))) {
                i4 = i35;
                i5 = i28;
                c11041 = c11042;
                f2 = 4.0f;
                drawable = null;
                drawable2 = null;
            } else {
                c1539.setColor(c10607.f31863);
                Drawable drawable4 = null;
                Drawable drawable5 = null;
                int i42 = iM13745;
                while (i42 <= i28) {
                    long j14 = ((((long) i42) * j4) + j) - jM18494;
                    int i43 = (int) j14;
                    int i44 = i28;
                    C11041 c11043 = c11042;
                    if (j14 != i43) {
                        throw new ArithmeticException();
                    }
                    int i45 = i42 * i36;
                    int i46 = (i45 + i36) - 1;
                    int i47 = i38;
                    if ((i45 > i47 || i47 > i46) && ((i45 > i40 || i40 > i46) && (i47 >= i45 || i40 <= i46))) {
                        i6 = i40;
                        i35 = i35;
                        i47 = i47;
                    } else {
                        if (i47 >= i45) {
                            this.f14893 = z2;
                            z5 = true;
                            this.f14895 = true;
                            z4 = z2;
                            i7 = i47;
                        } else {
                            z4 = false;
                            i7 = i45;
                            z5 = true;
                        }
                        if (i40 <= i46) {
                            this.f14893 = z2;
                            this.f14895 = z5;
                            i46 = i40;
                            z6 = z2;
                        } else {
                            z6 = false;
                        }
                        float f11 = (i7 % i36) * f7;
                        float f12 = (f11 * 3.0f) + fM27419 + f7;
                        float f13 = (i46 % i36) * f7;
                        float f14 = (f7 * 3.0f) + (f13 * 3.0f) + fM27419;
                        float f15 = fM13746 + f13 + f7;
                        float f16 = i43;
                        float f17 = i43 + i16;
                        i6 = i40;
                        canvas.drawRect(f12, f16, f14, f17, c1539);
                        canvas.drawRect(fM13746 + f11, f16, f15, f17, c1539);
                        if (z4) {
                            Drawable drawable6 = c10607.f31851;
                            float intrinsicWidth = (f12 - ((drawable6.getIntrinsicWidth() * 3) / 4)) - (f6 * 1.5f);
                            float intrinsicWidth2 = drawable6.getIntrinsicWidth() + intrinsicWidth;
                            f3 = f17;
                            float intrinsicHeight = drawable6.getIntrinsicHeight() + f3;
                            drawable6.setBounds((int) intrinsicWidth, (int) f3, (int) intrinsicWidth2, (int) intrinsicHeight);
                            this.f14897.set(intrinsicWidth, f3, intrinsicWidth2, intrinsicHeight);
                            drawable5 = drawable6;
                        } else {
                            f3 = f17;
                        }
                        if (z6) {
                            Drawable drawable7 = c10607.f31850;
                            float intrinsicWidth3 = (f6 * 1.5f) + (f14 - (drawable7.getIntrinsicWidth() / 4.0f));
                            float intrinsicWidth4 = drawable7.getIntrinsicWidth() + intrinsicWidth3;
                            float intrinsicHeight2 = drawable7.getIntrinsicHeight() + f3;
                            drawable7.setBounds((int) intrinsicWidth3, (int) f3, (int) intrinsicWidth4, (int) intrinsicHeight2);
                            this.f14898.set(intrinsicWidth3, f3, intrinsicWidth4, intrinsicHeight2);
                            drawable4 = drawable7;
                        }
                    }
                    i42++;
                    c11042 = c11043;
                    i35 = i35;
                    i28 = i44;
                    i38 = i47;
                    i40 = i6;
                }
                i4 = i35;
                i5 = i28;
                c11041 = c11042;
                drawable = drawable4;
                drawable2 = drawable5;
                f2 = 4.0f;
            }
        } else if (iM13745 > i37 || i37 > i28) {
            c1539 = c15313;
            i4 = i35;
            i5 = i28;
            c11041 = c11042;
            f2 = 4.0f;
            drawable = null;
            drawable2 = null;
        } else {
            this.f14895 = true;
            int i48 = i38 % i36;
            long j15 = ((((long) i37) * j4) + j) - jM18494;
            int i49 = (int) j15;
            if (j15 != i49) {
                throw new ArithmeticException();
            }
            float f18 = i48 * f7;
            float f19 = (f18 * 3.0f) + fM27419;
            float f20 = c11042.m27412() ? f19 + f7 : f19 + f7 + f7;
            if (z) {
                c15313.setColor(c10607.f31840);
                canvas.drawRect(f20, i49, f20 + 3.0f, i49 + i16, c15313);
            }
            this.f14893 = z2;
            if (z2) {
                Drawable drawable8 = c10607.f31838;
                float intrinsicWidth5 = drawable8.getIntrinsicWidth() / 2;
                float f21 = (f20 - intrinsicWidth5) + 3.0f;
                float f22 = i49 + i16;
                float f23 = f20 + intrinsicWidth5;
                float intrinsicHeight3 = drawable8.getIntrinsicHeight() + f22;
                this.f14887.set(f21, f22, f23, intrinsicHeight3);
                drawable8.setBounds((int) f21, (int) f22, (int) f23, (int) intrinsicHeight3);
                drawable3 = drawable8;
            } else {
                drawable3 = null;
            }
            f2 = 4.0f;
            float f24 = fM13746 + f18;
            c15313.setColor(c10607.f31863);
            float f25 = i49 + i16;
            c1539 = c15313;
            canvas.drawRect(f24, i49, f24 + f7, f25, c15313);
            i4 = i35;
            i5 = i28;
            c11041 = c11042;
            drawable2 = drawable3;
            drawable = null;
        }
        int i50 = iM13745;
        int i51 = i19;
        int i52 = i5;
        while (i50 <= i52) {
            int i53 = (i50 - iM13745) * i36;
            int i54 = i33;
            int iMin = Math.min(i53 + i36, i54);
            float f26 = fM27419 + f7;
            float f27 = fM13746;
            int i55 = i53;
            while (i55 < iMin) {
                c1539.setColor(this.f14894[i55] ? c10607.f31836 : c10607.f31840);
                byte b = this.f14892[i55];
                int i56 = b & 255;
                char c = cArr[i56 >>> 4];
                int i57 = iMin;
                char[] cArr3 = this.f14891;
                cArr3[0] = c;
                cArr3[1] = cArr[b & 15];
                this.f14885[0] = (char) i56;
                float f28 = i51;
                int i58 = i50;
                C1539 c15314 = c1539;
                canvas.drawText(cArr3, 0, 2, f26, f28, c15314);
                canvas.drawText(this.f14885, 0, 1, f27, f28, c15314);
                f26 = (f7 * 3.0f) + f26;
                f27 += f7;
                i55++;
                i54 = i54;
                iMin = i57;
                i52 = i52;
                i50 = i58;
            }
            i51 += i16;
            i50++;
            i33 = i54;
        }
        c1539.setColor(c10607.f31835);
        float f29 = f7 * 3.0f * f2;
        long jM21450 = C8083.m21450(j7, j4, j2, j4);
        int i59 = (int) jM21450;
        if (jM21450 != i59) {
            throw new ArithmeticException();
        }
        long jM27413 = ((long) c11041.m27413()) * j7;
        int iM27415 = c11041.m27415();
        float f30 = fM27419;
        int i60 = 0;
        while (i60 < i36) {
            long j16 = jM27413 + 4;
            int i61 = i23;
            int i62 = i59;
            int i63 = i60;
            canvas.drawLine(f30, i61, f30, i60 == 0 ? f10 : jM27413 <= ((long) iM27415) ? i59 : i59 - i16, c1539);
            if (i63 == 0) {
                f30 += f9;
            }
            f30 += f29;
            i60 = i63 + 4;
            i23 = i61;
            i59 = i62;
            jM27413 = j16;
        }
        int i64 = i23;
        float f31 = f30 + f7;
        c1539.setColor(c10607.f31834);
        float f32 = f31 - (f7 * 0.5f);
        float f33 = i64;
        C1539 c15315 = c1539;
        canvas.drawRect(f32, f33, f31, f10, c15315);
        c1539.setColor(c10607.f31835);
        canvas.drawLine(f32, f33, f32, f10, c15315);
        canvas.drawLine(f31, f33, f31, f10, c15315);
        int i65 = i4;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (f > 0.0f) {
            int height2 = c6807.getHeight() - i64;
            long jM13762 = m13762();
            long j17 = height2;
            long j18 = jM13762 + j17;
            if (jM13762 > 0) {
                float fM18494 = ((c6807.m18494() * 10000) / jM13762) / 10000.0f;
                if (j18 / j17 > 3) {
                    int i66 = c10607.f31846;
                    c1539.setColor((((int) (((i66 >>> 24) & 255) * f)) << 24) | (i66 & 16777215));
                    float f34 = c10607.f31843;
                    float f35 = i65;
                    float f36 = f35 - (f5 * f);
                    canvas.drawRect(f36, f33, f35, f10, c1539);
                    int i67 = z3 ? c10607.f31864 : c10607.f31852;
                    c1539.setColor((((int) (((i67 >>> 24) & 255) * f)) << 24) | (i67 & 16777215));
                    float f37 = f35 - (f5 * 1.5f);
                    float f38 = i64 + ((int) (((((double) i27) - ((double) i64)) - ((double) f34)) * ((double) fM18494)));
                    float f39 = f38 + f34;
                    this.f14888.m35175(f37, f38, f35, f39);
                    canvas.drawRect(f36, f38, f35, f39, c1539);
                    z7 = true;
                } else {
                    int i68 = c10607.f31853;
                    c1539.setColor((((int) (((i68 >>> 24) & 255) * f)) << 24) | (i68 & 16777215));
                    float f40 = (j17 * j17) / j18;
                    float f41 = i65;
                    float f42 = i64 + ((int) (((i27 - i64) - f40) * fM18494));
                    canvas.drawRect(f41 - c10607.f31862, f42, f41, f42 + f40, c1539);
                    z7 = false;
                }
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        this.f14899 = z7;
        c1539.setColor(c10607.f31834);
        float f43 = i65;
        C1539 c15316 = c1539;
        canvas.drawRect(0.0f, 0.0f, f43, f33, c15316);
        c1539.setColor(c10607.f31849);
        canvas.drawRect(0.0f, i64 - 1, f43, i64 + 1, c15316);
        float f44 = c10607.f31842 / 2.0f;
        int i69 = c10607.f31847;
        int i70 = i64 - i69;
        int i71 = i69 / 4;
        float f45 = fM13746;
        for (int i72 = 0; i72 < i36; i72++) {
            float f46 = (((i72 * 3) + 2) * f7) + fM27419;
            float f47 = f46 - f44;
            float f48 = i70;
            canvas.drawRect(f47, f48, f46 + f44, f33, c1539);
            String[] strArr = f14882;
            float f49 = (i70 - i16) + i17 + i71;
            canvas.drawText(strArr[i72], f47 - f9, f49, c1539);
            float f50 = f45 + f9;
            canvas.drawRect(f50 - f44, f48, f50 + f44, f33, c1539);
            canvas.drawText(strArr[i72], f45, f49, c1539);
            f45 += f7;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13750(int i, C11562 c11562, boolean z) {
        C6807 c6807 = this.f14900;
        int iM27413 = c6807.f21109.m27413();
        C10607 c10607 = c6807.f21110;
        int i2 = c10607.f31845;
        float f = c10607.f31848;
        int iM27419 = (int) ((c6807.f21109.m27419() + 1) * f);
        long j = i2;
        long jM13766 = (((long) (i / iM27413)) * j) + ((long) m13766());
        long j2 = j + jM13766;
        int i3 = (i % iM27413) * 3;
        int i4 = i3 + 1;
        if (z) {
            i4 = i3 + 3;
        }
        int i5 = (int) ((i4 * f) + iM27419);
        c11562.f34503 = i5;
        c11562.f34505 = jM13766;
        c11562.f34504 = i5;
        c11562.f34502 = j2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13765() {
        return this.f14896;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13757() {
        return this.f14895;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RectF m13764() {
        return this.f14887;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF m13763() {
        return this.f14897;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RectF m13760() {
        return this.f14898;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14792 m13759() {
        return this.f14888;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m13758(int i) {
        return ((long) i) * ((long) this.f14900.f21110.f31845);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m13749(int i) {
        C6807 c6807 = this.f14900;
        C10607 c10607 = c6807.f21110;
        return Math.max(((((((long) i) + 1) * ((long) c10607.f31845)) + ((long) m13766())) + ((long) this.f14884)) - ((long) c6807.getHeight()), 0L);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m13762() {
        return m13749(this.f14900.f21109.m27411());
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m13766() {
        C10607 c10607 = this.f14900.f21110;
        return c10607.f31845 + c10607.f31847 + 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private float m13746() {
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        return (C23202.m51496(c11041.m27413(), 3, c11041.m27419() + 1, 1) + 0.5f + 1.0f) * c6807.f21110.f31848;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m13754() {
        return this.f14893;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m13756() {
        return this.f14899;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m13745(long j) {
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        C10607 c10607 = c6807.f21110;
        if (c11041.m27415() == 0) {
            this.f14889 = true;
            return 0;
        }
        long jM13766 = (j - ((long) m13766())) / ((long) c10607.f31845);
        int i = (int) jM13766;
        if (jM13766 != i) {
            throw new ArithmeticException();
        }
        if (i < 0) {
            this.f14889 = true;
            return 0;
        }
        int iM27411 = c11041.m27415() % c11041.m27413() == 0 ? c11041.m27411() : c11041.m27411() - 1;
        if (i <= iM27411) {
            return i;
        }
        this.f14889 = true;
        return iM27411;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m13755() {
        return m13766() + this.f14884;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m13747() {
        return this.f14900.getHeight() - this.f14884;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m13761() {
        return this.f14889;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13748(float f, long j, boolean z) {
        int i = 0;
        this.f14889 = false;
        int iM13745 = m13745(j);
        C6807 c6807 = this.f14900;
        C11041 c11041 = c6807.f21109;
        float f2 = c6807.f21110.f31848;
        float fM27419 = (f2 / 2.0f) + ((c11041.m27419() + 1) * f2);
        if (f <= fM27419) {
            this.f14889 = true;
            this.f14886 = true;
        } else {
            int iM27413 = c11041.m27413();
            int i2 = 0;
            while (true) {
                if (i2 >= iM27413) {
                    if (z || f <= fM27419 + f2) {
                        this.f14889 = true;
                        this.f14886 = false;
                    } else {
                        this.f14886 = true;
                        float fM13746 = m13746();
                        if (f <= fM13746) {
                            this.f14889 = true;
                            break;
                        }
                        while (i < iM27413) {
                            fM13746 += f2;
                            if (f <= fM13746) {
                                break;
                            }
                            i++;
                        }
                        this.f14889 = true;
                    }
                    i = iM27413 - 1;
                    break;
                }
                float f3 = fM27419 + f2;
                if (f <= f3) {
                    this.f14886 = true;
                } else {
                    fM27419 = f3 + (f2 * 2.0f);
                    if (f <= fM27419) {
                        this.f14886 = false;
                    } else {
                        i2++;
                    }
                }
                i = i2;
                break;
            }
        }
        return c6807.f21109.m27387(iM13745, i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m13753() {
        return this.f14886;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13752(C11562 c11562) {
        C6807 c6807 = this.f14900;
        int iM27418 = c6807.f21109.m27418();
        C11041 c11041 = c6807.f21109;
        int iM27404 = c11041.m27404();
        int iM27413 = c11041.m27413();
        C10607 c10607 = c6807.f21110;
        int i = c10607.f31845;
        float f = c10607.f31848;
        int iM27419 = (int) ((c11041.m27419() + 1) * f);
        int i2 = iM27418 / iM27413;
        if (iM27418 == iM27404) {
            long j = i;
            long jM13766 = (((long) i2) * j) + ((long) m13766());
            long j2 = j + jM13766;
            int i3 = (iM27418 % iM27413) * 3;
            int i4 = i3 + 1;
            if (!c11041.m27412()) {
                i4 = i3 + 2;
            }
            int i5 = (int) ((i4 * f) + iM27419);
            c11562.f34503 = i5;
            c11562.f34505 = jM13766;
            c11562.f34504 = i5;
            c11562.f34502 = j2;
            return true;
        }
        if (iM27404 - iM27418 >= iM27413 || i2 != iM27404 / iM27413) {
            return false;
        }
        long j3 = i;
        long jM13767 = (((long) i2) * j3) + ((long) m13766());
        c11562.f34503 = ((int) ((((iM27418 % iM27413) * 3) + 1) * f)) + iM27419;
        c11562.f34505 = jM13767;
        c11562.f34504 = iM27419 + ((int) ((((iM27404 % iM27413) * 3) + 3) * f));
        c11562.f34502 = j3 + jM13767;
        return true;
    }
}
