package p067l;

import android.text.TextUtils;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۜ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8794 {

    /* JADX INFO: renamed from: ֫ */
    public float[] f23862;

    /* JADX INFO: renamed from: ۖ */
    public float f23863;

    /* JADX INFO: renamed from: ۜ */
    public float f23864;

    /* JADX INFO: renamed from: ۡ */
    public final CharSequence f23865;

    /* JADX INFO: renamed from: ۢ */
    public final int f23866;

    /* JADX INFO: renamed from: ۧ */
    public final int f23867;

    /* JADX INFO: renamed from: ܳ */
    public int f23868;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C11477 f23869;

    /* JADX INFO: renamed from: ܽ */
    public final float f23870;

    /* JADX INFO: renamed from: ܿ */
    public int f23871;

    /* JADX INFO: renamed from: ᩳ */
    public int f23872;

    /* JADX INFO: renamed from: ᩷ */
    public final IntUnaryOperator f23873;

    /* JADX INFO: renamed from: ᩻ */
    public int f23874;

    public C8794(C11477 c11477, CharSequence charSequence, int i, int i2, float f, IntUnaryOperator intUnaryOperator) {
        this.f23869 = c11477;
        this.f23865 = charSequence;
        this.f23872 = i;
        this.f23871 = i;
        this.f23866 = i;
        this.f23867 = i2;
        this.f23870 = f;
        this.f23873 = intUnaryOperator;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m20357() {
        return this.f23863;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m20356(int i) {
        char cCharAt = this.f23865.charAt(i);
        byte bM32656 = C14177.m32656(cCharAt);
        if (bM32656 != 15 || C15517.m35316(cCharAt)) {
            return bM32656 == 8 && !this.f23869.f32023;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m20358(float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f23866;
        if (i < i6 || i > (i2 = this.f23867)) {
            throw new IndexOutOfBoundsException();
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23862;
        int i7 = 1;
        if (fArr != null && i <= this.f23871 && i >= (i5 = this.f23874) && i <= this.f23868) {
            return Math.min(f, i == i5 ? this.f23864 : fArr[(i - i5) - 1] + this.f23864);
        }
        float[] fArr2 = null;
        if (i < this.f23871) {
            this.f23872 = i6;
            this.f23871 = i6;
            this.f23863 = 0.0f;
            this.f23862 = null;
        }
        while (true) {
            int i8 = this.f23871;
            if (i8 >= i) {
                break;
            }
            float f2 = this.f23863;
            if (f2 >= f) {
                break;
            }
            C11477 c11477 = this.f23869;
            C3831 c3831 = c11477.f32005;
            if (i8 < i2) {
                if (i8 >= this.f23872) {
                    IntUnaryOperator intUnaryOperator = this.f23873;
                    int iMin = intUnaryOperator == null ? i2 : Math.min(i2, intUnaryOperator.applyAsInt(i8));
                    this.f23872 = iMin;
                    if (iMin <= this.f23871) {
                        throw new IllegalArgumentException("Invalid text segment end");
                    }
                }
                int i9 = this.f23871;
                int i10 = this.f23872;
                CharSequence charSequence = this.f23865;
                int iM52676 = C23669.m52676(i9, i10, charSequence);
                float[] fArr3 = this.f23862;
                if (fArr3 != null && (i3 = this.f23871) >= (i4 = this.f23874) && i3 < this.f23868) {
                    this.f23863 = this.f23864 + fArr3[(iM52676 - i4) - i7];
                } else if (m20356(this.f23871)) {
                    this.f23874 = this.f23871;
                    this.f23868 = iM52676;
                    while (true) {
                        int i11 = this.f23868;
                        int i12 = this.f23872;
                        if (i11 >= i12) {
                            break;
                        }
                        int iM52677 = C23669.m52676(i11, i12, charSequence);
                        int i13 = this.f23868;
                        if (iM52677 - i13 == i7 && !m20356(i13)) {
                            break;
                        }
                        this.f23868 = iM52677;
                    }
                    int i14 = this.f23868;
                    int i15 = this.f23874;
                    int i16 = i14 - i15;
                    char[] cArr = new char[i16];
                    TextUtils.getChars(charSequence, i15, i14, cArr, 0);
                    float[] fArr4 = new float[i16];
                    this.f23862 = fArr4;
                    c3831.getTextWidths(cArr, 0, i16, fArr4);
                    double d = 0.0d;
                    int i17 = 0;
                    while (i17 < i16) {
                        float[] fArr5 = this.f23862;
                        int i18 = i17;
                        d += (double) fArr5[i17];
                        fArr5[i18] = (float) Math.ceil(d);
                        i17 = i18 + 1;
                    }
                    this.f23862[i16 - 1] = c3831.measureText(cArr, 0, i16);
                    int i19 = this.f23874;
                    while (true) {
                        int i20 = this.f23868;
                        if (i19 >= i20) {
                            break;
                        }
                        int iM52678 = C23669.m52676(i19, i20, charSequence);
                        int i21 = this.f23874;
                        float f3 = i19 == i21 ? 0.0f : this.f23862[(i19 - i21) - 1];
                        while (true) {
                            i19++;
                            if (i19 < iM52678) {
                                this.f23862[(i19 - this.f23874) - 1] = f3;
                            }
                        }
                        i19 = iM52678;
                    }
                    float f4 = this.f23863;
                    this.f23864 = f4;
                    this.f23863 = f4 + this.f23862[(iM52676 - this.f23874) - 1];
                    fArr2 = null;
                } else {
                    this.f23862 = fArr2;
                    float f5 = this.f23863;
                    this.f23863 = c11477.m26486(charSequence, this.f23871, iM52676, this.f23870 + f5) + f5;
                }
                this.f23871 = iM52676;
            }
            if (this.f23871 > i) {
                return Math.min(f, f2);
            }
            i7 = 1;
        }
        return Math.min(f, this.f23863);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20359(float f) {
        int i;
        int i2;
        float f2;
        if (f <= 0.0f) {
            return this.f23866;
        }
        do {
            i = this.f23871;
            i2 = this.f23867;
            if (i >= i2) {
                return i2;
            }
            f2 = this.f23863;
        } while (((m20358(Float.POSITIVE_INFINITY, C23669.m52676(i, i2, this.f23865)) - f2) / 2.0f) + f2 <= f);
        return i;
    }
}
