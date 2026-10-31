package l;

import android.text.TextUtils;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ۜ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6761 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f20987;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f20988;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f20989;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f20990;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f20991;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f20992;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20993;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9584 f20994;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f20995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20996;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f20997;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IntUnaryOperator f20998;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20999;

    public C6761(C9584 c9584, CharSequence charSequence, int i, int i2, float f, IntUnaryOperator intUnaryOperator) {
        this.f20994 = c9584;
        this.f20990 = charSequence;
        this.f20997 = i;
        this.f20996 = i;
        this.f20991 = i;
        this.f20992 = i2;
        this.f20995 = f;
        this.f20998 = intUnaryOperator;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m18409() {
        return this.f20988;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m18408(int i) {
        char cCharAt = this.f20990.charAt(i);
        byte bM30591 = C12425.m30591(cCharAt);
        if (bM30591 != 15 || C13835.m33198(cCharAt)) {
            return bM30591 == 8 && !this.f20994.f29076;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m18410(float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f20991;
        if (i < i6 || i > (i2 = this.f20992)) {
            throw new IndexOutOfBoundsException();
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f20987;
        int i7 = 1;
        if (fArr != null && i <= this.f20996 && i >= (i5 = this.f20999) && i <= this.f20993) {
            return Math.min(f, i == i5 ? this.f20989 : fArr[(i - i5) - 1] + this.f20989);
        }
        float[] fArr2 = null;
        if (i < this.f20996) {
            this.f20997 = i6;
            this.f20996 = i6;
            this.f20988 = 0.0f;
            this.f20987 = null;
        }
        while (true) {
            int i8 = this.f20996;
            if (i8 >= i) {
                break;
            }
            float f2 = this.f20988;
            if (f2 >= f) {
                break;
            }
            C9584 c9584 = this.f20994;
            C1539 c1539 = c9584.f29058;
            if (i8 < i2) {
                if (i8 >= this.f20997) {
                    IntUnaryOperator intUnaryOperator = this.f20998;
                    int iMin = intUnaryOperator == null ? i2 : Math.min(i2, intUnaryOperator.applyAsInt(i8));
                    this.f20997 = iMin;
                    if (iMin <= this.f20996) {
                        throw new IllegalArgumentException("Invalid text segment end");
                    }
                }
                int i9 = this.f20996;
                int i10 = this.f20997;
                CharSequence charSequence = this.f20990;
                int iM50336 = C22412.m50336(i9, i10, charSequence);
                float[] fArr3 = this.f20987;
                if (fArr3 != null && (i3 = this.f20996) >= (i4 = this.f20999) && i3 < this.f20993) {
                    this.f20988 = this.f20989 + fArr3[(iM50336 - i4) - i7];
                } else if (m18408(this.f20996)) {
                    this.f20999 = this.f20996;
                    this.f20993 = iM50336;
                    while (true) {
                        int i11 = this.f20993;
                        int i12 = this.f20997;
                        if (i11 >= i12) {
                            break;
                        }
                        int iM50337 = C22412.m50336(i11, i12, charSequence);
                        int i13 = this.f20993;
                        if (iM50337 - i13 == i7 && !m18408(i13)) {
                            break;
                        }
                        this.f20993 = iM50337;
                    }
                    int i14 = this.f20993;
                    int i15 = this.f20999;
                    int i16 = i14 - i15;
                    char[] cArr = new char[i16];
                    TextUtils.getChars(charSequence, i15, i14, cArr, 0);
                    float[] fArr4 = new float[i16];
                    this.f20987 = fArr4;
                    c1539.getTextWidths(cArr, 0, i16, fArr4);
                    double d = 0.0d;
                    int i17 = 0;
                    while (i17 < i16) {
                        float[] fArr5 = this.f20987;
                        int i18 = i17;
                        d += (double) fArr5[i17];
                        fArr5[i18] = (float) Math.ceil(d);
                        i17 = i18 + 1;
                    }
                    this.f20987[i16 - 1] = c1539.measureText(cArr, 0, i16);
                    int i19 = this.f20999;
                    while (true) {
                        int i20 = this.f20993;
                        if (i19 >= i20) {
                            break;
                        }
                        int iM50338 = C22412.m50336(i19, i20, charSequence);
                        int i21 = this.f20999;
                        float f3 = i19 == i21 ? 0.0f : this.f20987[(i19 - i21) - 1];
                        while (true) {
                            i19++;
                            if (i19 < iM50338) {
                                this.f20987[(i19 - this.f20999) - 1] = f3;
                            }
                        }
                        i19 = iM50338;
                    }
                    float f4 = this.f20988;
                    this.f20989 = f4;
                    this.f20988 = f4 + this.f20987[(iM50336 - this.f20999) - 1];
                    fArr2 = null;
                } else {
                    this.f20987 = fArr2;
                    float f5 = this.f20988;
                    this.f20988 = c9584.m24474(charSequence, this.f20996, iM50336, this.f20995 + f5) + f5;
                }
                this.f20996 = iM50336;
            }
            if (this.f20996 > i) {
                return Math.min(f, f2);
            }
            i7 = 1;
        }
        return Math.min(f, this.f20988);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18411(float f) {
        int i;
        int i2;
        float f2;
        if (f <= 0.0f) {
            return this.f20991;
        }
        do {
            i = this.f20996;
            i2 = this.f20992;
            if (i >= i2) {
                return i2;
            }
            f2 = this.f20988;
        } while (((m18410(Float.POSITIVE_INFINITY, C22412.m50336(i, i2, this.f20990)) - f2) / 2.0f) + f2 <= f);
        return i;
    }
}
