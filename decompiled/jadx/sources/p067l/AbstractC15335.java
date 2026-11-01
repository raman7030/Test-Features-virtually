package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 61SM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15335 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f43772;

    /* JADX INFO: renamed from: ۧ */
    public final int f43776;

    /* JADX INFO: renamed from: ܳ */
    public final int f43777;

    /* JADX INFO: renamed from: ܿ */
    public final int f43779;

    /* JADX INFO: renamed from: ᩳ */
    public final int f43780;

    /* JADX INFO: renamed from: ᩻ */
    public final int f43782;

    /* JADX INFO: renamed from: ۢ */
    public int f43775 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public int f43781 = -1;

    /* JADX INFO: renamed from: ܽ */
    public boolean f43778 = false;

    /* JADX INFO: renamed from: ۡ */
    public int f43774 = 0;

    /* JADX INFO: renamed from: ۜ */
    public int f43773 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18398(C6422 c6422);

    /* JADX INFO: renamed from: ۧ */
    public abstract C4331 mo18399();

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo18400(int i);

    /* JADX INFO: renamed from: ֫ */
    public static void m34894(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 <= i2) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC15335 m34893(int i, int i2, int i3, int i4, int i5, int i6, C6422 c6422) {
        if (i5 == 4) {
            return new C7960(i, i2, i3, i4, i6, c6422);
        }
        if (i5 == 20) {
            return new C11984(i, i2, i3, i4, i6, c6422);
        }
        throw new IllegalArgumentException();
    }

    public AbstractC15335(int i, int i2, int i3, int i4, C6422 c6422) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        int iMin = i5 + i6 + Math.min((i / 2) + 262144, 536870912);
        this.f43776 = iMin;
        this.f43772 = c6422.mo7199(iMin);
        this.f43779 = i5;
        this.f43780 = i6;
        this.f43777 = 273;
        this.f43782 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34900(int i, int i2, byte[] bArr) {
        int i3 = this.f43775;
        int i4 = this.f43776;
        int i5 = this.f43780;
        int i6 = i4 - i5;
        byte[] bArr2 = this.f43772;
        if (i3 >= i6) {
            int i7 = ((i3 + 1) - this.f43779) & (-16);
            System.arraycopy(bArr2, i7, bArr2, 0, this.f43774 - i7);
            this.f43775 -= i7;
            this.f43781 -= i7;
            this.f43774 -= i7;
        }
        int i8 = this.f43774;
        int i9 = i4 - i8;
        if (i2 > i9) {
            i2 = i9;
        }
        System.arraycopy(bArr, i, bArr2, i8, i2);
        int i10 = this.f43774 + i2;
        this.f43774 = i10;
        if (i10 >= i5) {
            this.f43781 = i10 - i5;
        }
        m34895();
        return i2;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m34895() {
        int i;
        int i2 = this.f43773;
        if (i2 <= 0 || (i = this.f43775) >= this.f43781) {
            return;
        }
        this.f43775 = i - i2;
        this.f43773 = 0;
        mo18400(i2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m34908() {
        return this.f43775 != -1;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34904() {
        this.f43781 = this.f43774 - 1;
        m34895();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m34907() {
        this.f43781 = this.f43774 - 1;
        this.f43778 = true;
        m34895();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34903(int i) {
        return this.f43775 - i < this.f43781;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34901(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f43772, (this.f43775 + 1) - i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34896() {
        return this.f43774 - this.f43775;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34905() {
        return this.f43775;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34897(int i) {
        return this.f43772[this.f43775 - i] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34898(int i, int i2) {
        return this.f43772[(this.f43775 + i) - i2] & 255;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m34902(int i, int i2) {
        return C9301.m21512(this.f43772, this.f43775, i + 1, 0, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34899(int i, int i2, int i3) {
        return C9301.m21512(this.f43772, this.f43775 + i, i2 + 1, 0, i3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34906(int i) {
        int i2 = this.f43775 + 1;
        this.f43775 = i2;
        int i3 = this.f43774 - i2;
        if (i3 >= i || (i3 >= 4 && this.f43778)) {
            return i3;
        }
        this.f43773++;
        return 0;
    }
}
