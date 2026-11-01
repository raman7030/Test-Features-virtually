package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L648 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10684 implements Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public static final int[] f29590 = new int[0];

    /* JADX INFO: renamed from: ᩹ */
    public int f29592 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int[] f29591 = f29590;

    public final int getSize() {
        return this.f29592;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24599() {
        return (this.f29592 + 7) / 8;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m24598(int i) {
        if (i > this.f29591.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f29591;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f29591 = iArr;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24603(int i) {
        return ((1 << (i & 31)) & this.f29591[i / 32]) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24602(boolean z) {
        m24598(this.f29592 + 1);
        if (z) {
            int[] iArr = this.f29591;
            int i = this.f29592;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f29592++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24600(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.f29592;
        m24598(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.f29591;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.f29592 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24601(C10684 c10684) {
        int i = c10684.f29592;
        m24598(this.f29592 + i);
        for (int i2 = 0; i2 < i; i2++) {
            m24602(c10684.m24603(i2));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24604(C10684 c10684) {
        if (this.f29592 != c10684.f29592) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f29591;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c10684.f29591[i];
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10684)) {
            return false;
        }
        C10684 c10684 = (C10684) obj;
        return this.f29592 == c10684.f29592 && Arrays.equals(this.f29591, c10684.f29591);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29591) + (this.f29592 * 31);
    }

    public final String toString() {
        int i = this.f29592;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f29592; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m24603(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f29591.clone();
        int i = this.f29592;
        C10684 c10684 = new C10684();
        c10684.f29591 = iArr;
        c10684.f29592 = i;
        return c10684;
    }
}
