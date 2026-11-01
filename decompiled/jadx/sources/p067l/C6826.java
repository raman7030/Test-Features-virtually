package p067l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۙܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IR */
/* JADX INFO: loaded from: classes2.dex */
public final class C6826 {

    /* JADX INFO: renamed from: ֨ */
    public static final String[] f17711 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* JADX INFO: renamed from: ۚ */
    public static final char[] f17712 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֡ */
    public final int f17713;

    /* JADX INFO: renamed from: ۖ */
    public boolean f17715;

    /* JADX INFO: renamed from: ۡ */
    public boolean f17718;

    /* JADX INFO: renamed from: ܺ */
    public boolean f17722;

    /* JADX INFO: renamed from: ܿ */
    public boolean f17724;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f17725;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f17728;

    /* JADX INFO: renamed from: ᩻ */
    public final C8838 f17729;

    /* JADX INFO: renamed from: ۘ */
    public final RectF f17716 = new RectF();

    /* JADX INFO: renamed from: ᩴ */
    public final RectF f17726 = new RectF();

    /* JADX INFO: renamed from: ᩵ */
    public final RectF f17727 = new RectF();

    /* JADX INFO: renamed from: ۜ */
    public final C16427 f17717 = new C16427(3);

    /* JADX INFO: renamed from: ܳ */
    public byte[] f17721 = C7747.f20313;

    /* JADX INFO: renamed from: ܽ */
    public boolean[] f17723 = C21159.f66473;

    /* JADX INFO: renamed from: ۧ */
    public final char[] f17720 = new char[2];

    /* JADX INFO: renamed from: ֫ */
    public final char[] f17714 = new char[1];

    /* JADX INFO: renamed from: ۢ */
    public final char[] f17719 = new char[13];

    public C6826(C8838 c8838) {
        this.f17729 = c8838;
        C12450 c12450 = c8838.f23987;
        this.f17713 = (Math.max(Math.max(c12450.f34822.getIntrinsicHeight(), c12450.f34821.getIntrinsicHeight()), c12450.f34809.getIntrinsicHeight()) * 3) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x05f8  */
    /* JADX INFO: renamed from: ֫ */
    public final void m15626(Canvas canvas, boolean z, boolean z2, float f, boolean z3) {
        char[] cArr;
        int i;
        int i2;
        int i3;
        C3831 c3831;
        int i4;
        int i5;
        C12862 c12862;
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
        this.f17722 = false;
        this.f17724 = false;
        C8838 c8838 = this.f17729;
        C12862 c12863 = c8838.f23986;
        C12450 c12450 = c8838.f23987;
        int width = c8838.getWidth();
        int height = c8838.getHeight();
        int i16 = c12450.f34816;
        float f5 = c12450.f34832;
        float f6 = c12450.f34827;
        int iM15641 = m15641();
        float f7 = c12450.f34819;
        float fM29481 = (c12863.m29481() + 1) * f7;
        int iM29475 = c12863.m29475();
        C3831 c3832 = c12450.f34815;
        int i17 = c12450.f34831;
        long jM20443 = c8838.m20443();
        long j = iM15641;
        int iM15620 = m15620(jM20443 + j);
        int iMax = Math.max(iM15620, m15620(jM20443 + ((long) height)));
        float fM15621 = m15621();
        long j2 = j - jM20443;
        long j3 = iM15620;
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
        long j10 = iM29475;
        long j11 = j9 * j10;
        int i20 = (int) j11;
        if (j11 != i20) {
            throw new ArithmeticException();
        }
        if (this.f17721.length < i20) {
            this.f17721 = new byte[i20];
            this.f17723 = new boolean[i20];
        }
        long j12 = j3 * j10;
        int i21 = (int) j12;
        if (j12 != i21) {
            throw new ArithmeticException();
        }
        int iM29450 = c12863.m29450(i21, i20, this.f17721, this.f17723);
        canvas.drawColor(c12450.f34829);
        c3832.setColor(c12450.f34805);
        int i22 = height;
        float f8 = i22;
        int i23 = iM15641;
        C3831 c3833 = c3832;
        canvas.drawRect(0.0f, 0.0f, fM29481, f8, c3833);
        c3833.setColor(c12450.f34812);
        float f9 = f7 / 2.0f;
        int i24 = iM15620;
        int i25 = i19;
        while (true) {
            cArr = f17712;
            if (i24 > iMax) {
                break;
            }
            long j13 = ((long) i24) * j10;
            int iM29481 = c12863.m29481();
            int i26 = iM29481 - 1;
            while (true) {
                cArr2 = this.f17719;
                if (i26 >= 0) {
                    cArr2[i26] = cArr[(int) (j13 & 15)];
                    j13 >>>= 4;
                    i26--;
                    iMax = iMax;
                    c3833 = c3833;
                }
            }
            C3831 c3834 = c3833;
            cArr2[iM29481] = ' ';
            cArr2[iM29481 + 1] = ' ';
            cArr2[iM29481 + 2] = ' ';
            cArr2[iM29481 + 3] = ' ';
            cArr2[iM29481 + 4] = '.';
            canvas.drawText(this.f17719, 0, iM29481 + 5, f9, i25, c3834);
            i25 += i16;
            i24++;
            iMax = iMax;
            c3833 = c3834;
            i22 = i22;
        }
        C3831 c3835 = c3833;
        int i27 = i22;
        int i28 = iMax;
        int iM29480 = c12863.m29480();
        int iM29466 = c12863.m29466();
        if (c12863.m29468()) {
            i = iM29475;
            i2 = -1;
        } else {
            i = iM29475;
            i2 = iM29480 / i;
        }
        this.f17725 = false;
        int i29 = (int) j5;
        int i30 = i;
        int i31 = iM29466;
        if (j5 != i29) {
            throw new ArithmeticException();
        }
        int i32 = i29;
        boolean z8 = true;
        while (i3 <= i28) {
            if (i3 == i2) {
                this.f17725 = z8;
                c3835.setColor(c12450.f34826);
                i10 = i18;
                f4 = f8;
                i12 = i2;
                i8 = iM29450;
                i11 = i30;
                i13 = i3;
                i9 = i31;
                i14 = iM29480;
                i15 = i32;
                canvas.drawRect(fM29481, i32, i18, i32 + i16, c3835);
            } else {
                i8 = iM29450;
                f4 = f8;
                i9 = i31;
                i10 = i18;
                i11 = i30;
                i12 = i2;
                i13 = i3;
                i14 = iM29480;
                i15 = i32;
                if (i13 % 2 != 0) {
                    c3835.setColor(c12450.f34830);
                    canvas.drawRect(fM29481, i15, i10, i15 + i16, c3835);
                } else {
                    c3835.setColor(c12450.f34829);
                    canvas.drawRect(fM29481, i15, i10, i15 + i16, c3835);
                }
            }
            i32 = i15 + i16;
            i3 = i13 + 1;
            z8 = true;
            i18 = i10;
            i30 = i11;
            i2 = i12;
            iM29450 = i8;
            iM29480 = i14;
            f8 = f4;
            i31 = i9;
        }
        i3 = iM15620;
        int i33 = iM29450;
        float f10 = f8;
        int i34 = i31;
        int i35 = i18;
        int i36 = i30;
        int i37 = i2;
        int i38 = iM29480;
        if (c12863.m29468()) {
            c3831 = c3835;
            int i39 = i38 / i36;
            int i40 = i34;
            int i41 = i40 / i36;
            if ((iM15620 > i39 || i39 > i28) && ((iM15620 > i41 || i41 > i28) && (i39 >= iM15620 || i41 <= i28))) {
                i4 = i35;
                i5 = i28;
                c12862 = c12863;
                f2 = 4.0f;
                drawable = null;
                drawable2 = null;
            } else {
                c3831.setColor(c12450.f34834);
                Drawable drawable4 = null;
                Drawable drawable5 = null;
                int i42 = iM15620;
                while (i42 <= i28) {
                    long j14 = ((((long) i42) * j4) + j) - jM20443;
                    int i43 = (int) j14;
                    int i44 = i28;
                    C12862 c12864 = c12863;
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
                            this.f17722 = z2;
                            z5 = true;
                            this.f17724 = true;
                            z4 = z2;
                            i7 = i47;
                        } else {
                            z4 = false;
                            i7 = i45;
                            z5 = true;
                        }
                        if (i40 <= i46) {
                            this.f17722 = z2;
                            this.f17724 = z5;
                            i46 = i40;
                            z6 = z2;
                        } else {
                            z6 = false;
                        }
                        float f11 = (i7 % i36) * f7;
                        float f12 = (f11 * 3.0f) + fM29481 + f7;
                        float f13 = (i46 % i36) * f7;
                        float f14 = (f7 * 3.0f) + (f13 * 3.0f) + fM29481;
                        float f15 = fM15621 + f13 + f7;
                        float f16 = i43;
                        float f17 = i43 + i16;
                        i6 = i40;
                        canvas.drawRect(f12, f16, f14, f17, c3831);
                        canvas.drawRect(fM15621 + f11, f16, f15, f17, c3831);
                        if (z4) {
                            Drawable drawable6 = c12450.f34822;
                            float intrinsicWidth = (f12 - ((drawable6.getIntrinsicWidth() * 3) / 4)) - (f6 * 1.5f);
                            float intrinsicWidth2 = drawable6.getIntrinsicWidth() + intrinsicWidth;
                            f3 = f17;
                            float intrinsicHeight = drawable6.getIntrinsicHeight() + f3;
                            drawable6.setBounds((int) intrinsicWidth, (int) f3, (int) intrinsicWidth2, (int) intrinsicHeight);
                            this.f17726.set(intrinsicWidth, f3, intrinsicWidth2, intrinsicHeight);
                            drawable5 = drawable6;
                        } else {
                            f3 = f17;
                        }
                        if (z6) {
                            Drawable drawable7 = c12450.f34821;
                            float intrinsicWidth3 = (f6 * 1.5f) + (f14 - (drawable7.getIntrinsicWidth() / 4.0f));
                            float intrinsicWidth4 = drawable7.getIntrinsicWidth() + intrinsicWidth3;
                            float intrinsicHeight2 = drawable7.getIntrinsicHeight() + f3;
                            drawable7.setBounds((int) intrinsicWidth3, (int) f3, (int) intrinsicWidth4, (int) intrinsicHeight2);
                            this.f17727.set(intrinsicWidth3, f3, intrinsicWidth4, intrinsicHeight2);
                            drawable4 = drawable7;
                        }
                    }
                    i42++;
                    c12863 = c12864;
                    i35 = i35;
                    i28 = i44;
                    i38 = i47;
                    i40 = i6;
                }
                i4 = i35;
                i5 = i28;
                c12862 = c12863;
                drawable = drawable4;
                drawable2 = drawable5;
                f2 = 4.0f;
            }
        } else if (iM15620 > i37 || i37 > i28) {
            c3831 = c3835;
            i4 = i35;
            i5 = i28;
            c12862 = c12863;
            f2 = 4.0f;
            drawable = null;
            drawable2 = null;
        } else {
            this.f17724 = true;
            int i48 = i38 % i36;
            long j15 = ((((long) i37) * j4) + j) - jM20443;
            int i49 = (int) j15;
            if (j15 != i49) {
                throw new ArithmeticException();
            }
            float f18 = i48 * f7;
            float f19 = (f18 * 3.0f) + fM29481;
            float f20 = c12863.m29474() ? f19 + f7 : f19 + f7 + f7;
            if (z) {
                c3835.setColor(c12450.f34811);
                canvas.drawRect(f20, i49, f20 + 3.0f, i49 + i16, c3835);
            }
            this.f17722 = z2;
            if (z2) {
                Drawable drawable8 = c12450.f34809;
                float intrinsicWidth5 = drawable8.getIntrinsicWidth() / 2;
                float f21 = (f20 - intrinsicWidth5) + 3.0f;
                float f22 = i49 + i16;
                float f23 = f20 + intrinsicWidth5;
                float intrinsicHeight3 = drawable8.getIntrinsicHeight() + f22;
                this.f17716.set(f21, f22, f23, intrinsicHeight3);
                drawable8.setBounds((int) f21, (int) f22, (int) f23, (int) intrinsicHeight3);
                drawable3 = drawable8;
            } else {
                drawable3 = null;
            }
            f2 = 4.0f;
            float f24 = fM15621 + f18;
            c3835.setColor(c12450.f34834);
            float f25 = i49 + i16;
            c3831 = c3835;
            canvas.drawRect(f24, i49, f24 + f7, f25, c3835);
            i4 = i35;
            i5 = i28;
            c12862 = c12863;
            drawable2 = drawable3;
            drawable = null;
        }
        int i50 = iM15620;
        int i51 = i19;
        int i52 = i5;
        while (i50 <= i52) {
            int i53 = (i50 - iM15620) * i36;
            int i54 = i33;
            int iMin = Math.min(i53 + i36, i54);
            float f26 = fM29481 + f7;
            float f27 = fM15621;
            int i55 = i53;
            while (i55 < iMin) {
                c3831.setColor(this.f17723[i55] ? c12450.f34807 : c12450.f34811);
                byte b = this.f17721[i55];
                int i56 = b & 255;
                char c = cArr[i56 >>> 4];
                int i57 = iMin;
                char[] cArr3 = this.f17720;
                cArr3[0] = c;
                cArr3[1] = cArr[b & 15];
                this.f17714[0] = (char) i56;
                float f28 = i51;
                int i58 = i50;
                C3831 c3836 = c3831;
                canvas.drawText(cArr3, 0, 2, f26, f28, c3836);
                canvas.drawText(this.f17714, 0, 1, f27, f28, c3836);
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
        c3831.setColor(c12450.f34806);
        float f29 = f7 * 3.0f * f2;
        long jM23418 = C10050.m23418(j7, j4, j2, j4);
        int i59 = (int) jM23418;
        if (jM23418 != i59) {
            throw new ArithmeticException();
        }
        long jM29475 = ((long) c12862.m29475()) * j7;
        int iM29477 = c12862.m29477();
        float f30 = fM29481;
        int i60 = 0;
        while (i60 < i36) {
            long j16 = jM29475 + 4;
            int i61 = i23;
            int i62 = i59;
            int i63 = i60;
            canvas.drawLine(f30, i61, f30, i60 == 0 ? f10 : jM29475 <= ((long) iM29477) ? i59 : i59 - i16, c3831);
            if (i63 == 0) {
                f30 += f9;
            }
            f30 += f29;
            i60 = i63 + 4;
            i23 = i61;
            i59 = i62;
            jM29475 = j16;
        }
        int i64 = i23;
        float f31 = f30 + f7;
        c3831.setColor(c12450.f34805);
        float f32 = f31 - (f7 * 0.5f);
        float f33 = i64;
        C3831 c3837 = c3831;
        canvas.drawRect(f32, f33, f31, f10, c3837);
        c3831.setColor(c12450.f34806);
        canvas.drawLine(f32, f33, f32, f10, c3837);
        canvas.drawLine(f31, f33, f31, f10, c3837);
        int i65 = i4;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (f > 0.0f) {
            int height2 = c8838.getHeight() - i64;
            long jM15637 = m15637();
            long j17 = height2;
            long j18 = jM15637 + j17;
            if (jM15637 > 0) {
                float fM20443 = ((c8838.m20443() * 10000) / jM15637) / 10000.0f;
                if (j18 / j17 > 3) {
                    int i66 = c12450.f34817;
                    c3831.setColor((((int) (((i66 >>> 24) & 255) * f)) << 24) | (i66 & 16777215));
                    float f34 = c12450.f34814;
                    float f35 = i65;
                    float f36 = f35 - (f5 * f);
                    canvas.drawRect(f36, f33, f35, f10, c3831);
                    int i67 = z3 ? c12450.f34835 : c12450.f34823;
                    c3831.setColor((((int) (((i67 >>> 24) & 255) * f)) << 24) | (i67 & 16777215));
                    float f37 = f35 - (f5 * 1.5f);
                    float f38 = i64 + ((int) (((((double) i27) - ((double) i64)) - ((double) f34)) * ((double) fM20443)));
                    float f39 = f38 + f34;
                    this.f17717.m37322(f37, f38, f35, f39);
                    canvas.drawRect(f36, f38, f35, f39, c3831);
                    z7 = true;
                } else {
                    int i68 = c12450.f34824;
                    c3831.setColor((((int) (((i68 >>> 24) & 255) * f)) << 24) | (i68 & 16777215));
                    float f40 = (j17 * j17) / j18;
                    float f41 = i65;
                    float f42 = i64 + ((int) (((i27 - i64) - f40) * fM20443));
                    canvas.drawRect(f41 - c12450.f34833, f42, f41, f42 + f40, c3831);
                    z7 = false;
                }
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        this.f17728 = z7;
        c3831.setColor(c12450.f34805);
        float f43 = i65;
        C3831 c3838 = c3831;
        canvas.drawRect(0.0f, 0.0f, f43, f33, c3838);
        c3831.setColor(c12450.f34820);
        canvas.drawRect(0.0f, i64 - 1, f43, i64 + 1, c3838);
        float f44 = c12450.f34813 / 2.0f;
        int i69 = c12450.f34818;
        int i70 = i64 - i69;
        int i71 = i69 / 4;
        float f45 = fM15621;
        for (int i72 = 0; i72 < i36; i72++) {
            float f46 = (((i72 * 3) + 2) * f7) + fM29481;
            float f47 = f46 - f44;
            float f48 = i70;
            canvas.drawRect(f47, f48, f46 + f44, f33, c3831);
            String[] strArr = f17711;
            float f49 = (i70 - i16) + i17 + i71;
            canvas.drawText(strArr[i72], f47 - f9, f49, c3831);
            float f50 = f45 + f9;
            canvas.drawRect(f50 - f44, f48, f50 + f44, f33, c3831);
            canvas.drawText(strArr[i72], f45, f49, c3831);
            f45 += f7;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15625(int i, C13357 c13357, boolean z) {
        C8838 c8838 = this.f17729;
        int iM29475 = c8838.f23986.m29475();
        C12450 c12450 = c8838.f23987;
        int i2 = c12450.f34816;
        float f = c12450.f34819;
        int iM29481 = (int) ((c8838.f23986.m29481() + 1) * f);
        long j = i2;
        long jM15641 = (((long) (i / iM29475)) * j) + ((long) m15641());
        long j2 = j + jM15641;
        int i3 = (i % iM29475) * 3;
        int i4 = i3 + 1;
        if (z) {
            i4 = i3 + 3;
        }
        int i5 = (int) ((i4 * f) + iM29481);
        c13357.f37499 = i5;
        c13357.f37501 = jM15641;
        c13357.f37500 = i5;
        c13357.f37498 = j2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m15640() {
        return this.f17725;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m15632() {
        return this.f17724;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final RectF m15639() {
        return this.f17716;
    }

    /* JADX INFO: renamed from: ܿ */
    public final RectF m15638() {
        return this.f17726;
    }

    /* JADX INFO: renamed from: ܳ */
    public final RectF m15635() {
        return this.f17727;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16427 m15634() {
        return this.f17717;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m15633(int i) {
        return ((long) i) * ((long) this.f17729.f23987.f34816);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m15624(int i) {
        C8838 c8838 = this.f17729;
        C12450 c12450 = c8838.f23987;
        return Math.max(((((((long) i) + 1) * ((long) c12450.f34816)) + ((long) m15641())) + ((long) this.f17713)) - ((long) c8838.getHeight()), 0L);
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m15637() {
        return m15624(this.f17729.f23986.m29473());
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m15641() {
        C12450 c12450 = this.f17729.f23987;
        return c12450.f34816 + c12450.f34818 + 1;
    }

    /* JADX INFO: renamed from: ᩴ */
    private float m15621() {
        C8838 c8838 = this.f17729;
        C12862 c12862 = c8838.f23986;
        return (C24420.m53892(c12862.m29475(), 3, c12862.m29481() + 1, 1) + 0.5f + 1.0f) * c8838.f23987.f34819;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m15629() {
        return this.f17722;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m15631() {
        return this.f17728;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m15620(long j) {
        C8838 c8838 = this.f17729;
        C12862 c12862 = c8838.f23986;
        C12450 c12450 = c8838.f23987;
        if (c12862.m29477() == 0) {
            this.f17718 = true;
            return 0;
        }
        long jM15641 = (j - ((long) m15641())) / ((long) c12450.f34816);
        int i = (int) jM15641;
        if (jM15641 != i) {
            throw new ArithmeticException();
        }
        if (i < 0) {
            this.f17718 = true;
            return 0;
        }
        int iM29473 = c12862.m29477() % c12862.m29475() == 0 ? c12862.m29473() : c12862.m29473() - 1;
        if (i <= iM29473) {
            return i;
        }
        this.f17718 = true;
        return iM29473;
    }

    /* JADX INFO: renamed from: ۜ */
    public final float m15630() {
        return m15641() + this.f17713;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m15622() {
        return this.f17729.getHeight() - this.f17713;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m15636() {
        return this.f17718;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15623(float f, long j, boolean z) {
        int i = 0;
        this.f17718 = false;
        int iM15620 = m15620(j);
        C8838 c8838 = this.f17729;
        C12862 c12862 = c8838.f23986;
        float f2 = c8838.f23987.f34819;
        float fM29481 = (f2 / 2.0f) + ((c12862.m29481() + 1) * f2);
        if (f <= fM29481) {
            this.f17718 = true;
            this.f17715 = true;
        } else {
            int iM29475 = c12862.m29475();
            int i2 = 0;
            while (true) {
                if (i2 >= iM29475) {
                    if (z || f <= fM29481 + f2) {
                        this.f17718 = true;
                        this.f17715 = false;
                    } else {
                        this.f17715 = true;
                        float fM15621 = m15621();
                        if (f <= fM15621) {
                            this.f17718 = true;
                            break;
                        }
                        while (i < iM29475) {
                            fM15621 += f2;
                            if (f <= fM15621) {
                                break;
                            }
                            i++;
                        }
                        this.f17718 = true;
                    }
                    i = iM29475 - 1;
                    break;
                }
                float f3 = fM29481 + f2;
                if (f <= f3) {
                    this.f17715 = true;
                } else {
                    fM29481 = f3 + (f2 * 2.0f);
                    if (f <= fM29481) {
                        this.f17715 = false;
                    } else {
                        i2++;
                    }
                }
                i = i2;
                break;
            }
        }
        return c8838.f23986.m29449(iM15620, i);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m15628() {
        return this.f17715;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15627(C13357 c13357) {
        C8838 c8838 = this.f17729;
        int iM29480 = c8838.f23986.m29480();
        C12862 c12862 = c8838.f23986;
        int iM29466 = c12862.m29466();
        int iM29475 = c12862.m29475();
        C12450 c12450 = c8838.f23987;
        int i = c12450.f34816;
        float f = c12450.f34819;
        int iM29481 = (int) ((c12862.m29481() + 1) * f);
        int i2 = iM29480 / iM29475;
        if (iM29480 == iM29466) {
            long j = i;
            long jM15641 = (((long) i2) * j) + ((long) m15641());
            long j2 = j + jM15641;
            int i3 = (iM29480 % iM29475) * 3;
            int i4 = i3 + 1;
            if (!c12862.m29474()) {
                i4 = i3 + 2;
            }
            int i5 = (int) ((i4 * f) + iM29481);
            c13357.f37499 = i5;
            c13357.f37501 = jM15641;
            c13357.f37500 = i5;
            c13357.f37498 = j2;
            return true;
        }
        if (iM29466 - iM29480 >= iM29475 || i2 != iM29466 / iM29475) {
            return false;
        }
        long j3 = i;
        long jM15642 = (((long) i2) * j3) + ((long) m15641());
        c13357.f37499 = ((int) ((((iM29480 % iM29475) * 3) + 1) * f)) + iM29481;
        c13357.f37501 = jM15642;
        c13357.f37500 = iM29481 + ((int) ((((iM29466 % iM29475) * 3) + 3) * f));
        c13357.f37498 = j3 + jM15642;
        return true;
    }
}
