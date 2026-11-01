package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4439 {

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f9956 = {0, 0, 1};

    /* JADX INFO: renamed from: ֫ */
    public byte[] f9957;

    /* JADX INFO: renamed from: ۧ */
    public boolean f9958;

    /* JADX INFO: renamed from: ܽ */
    public int f9959;

    /* JADX INFO: renamed from: ᩳ */
    public int f9960;

    /* JADX INFO: renamed from: ֫ */
    public final void m9273() {
        this.f9958 = false;
        this.f9959 = 0;
        this.f9960 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9275(int i, int i2) {
        if (this.f9958) {
            int i3 = this.f9959 - i2;
            this.f9959 = i3;
            if (this.f9960 == 0 && i == 181) {
                this.f9960 = i3;
            } else {
                this.f9958 = false;
                return true;
            }
        } else if (i == 179) {
            this.f9958 = true;
        }
        m9274(0, 3, f9956);
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9274(int i, int i2, byte[] bArr) {
        if (this.f9958) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f9957;
            int length = bArr2.length;
            int i4 = this.f9959 + i3;
            if (length < i4) {
                this.f9957 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f9957, this.f9959, i3);
            this.f9959 += i3;
        }
    }
}
