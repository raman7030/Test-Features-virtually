package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L648 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8750 implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f26664 = new int[0];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f26666 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f26665 = f26664;

    public final int getSize() {
        return this.f26666;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22629() {
        return (this.f26666 + 7) / 8;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m22628(int i) {
        if (i > this.f26665.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f26665;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f26665 = iArr;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22633(int i) {
        return ((1 << (i & 31)) & this.f26665[i / 32]) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22632(boolean z) {
        m22628(this.f26666 + 1);
        if (z) {
            int[] iArr = this.f26665;
            int i = this.f26666;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f26666++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22630(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.f26666;
        m22628(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.f26665;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.f26666 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22631(C8750 c8750) {
        int i = c8750.f26666;
        m22628(this.f26666 + i);
        for (int i2 = 0; i2 < i; i2++) {
            m22632(c8750.m22633(i2));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22634(C8750 c8750) {
        if (this.f26666 != c8750.f26666) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f26665;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ c8750.f26665[i];
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8750)) {
            return false;
        }
        C8750 c8750 = (C8750) obj;
        return this.f26666 == c8750.f26666 && Arrays.equals(this.f26665, c8750.f26665);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26665) + (this.f26666 * 31);
    }

    public final String toString() {
        int i = this.f26666;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f26666; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m22633(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f26665.clone();
        int i = this.f26666;
        C8750 c8750 = new C8750();
        c8750.f26665 = iArr;
        c8750.f26666 = i;
        return c8750;
    }
}
