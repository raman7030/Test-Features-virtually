package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18407 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f57147 = {0, 0, 1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f57148;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f57149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57150;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57151;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f57152;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42832() {
        this.f57149 = false;
        this.f57150 = 0;
        this.f57152 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42834(int i, int i2) {
        int i3 = this.f57152;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i == 179 || i == 181) {
                            this.f57150 -= i2;
                            this.f57149 = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        C19956.m46037("Unexpected start code value");
                        m42832();
                    } else {
                        this.f57151 = this.f57150;
                        this.f57152 = 4;
                    }
                } else if (i > 31) {
                    C19956.m46037("Unexpected start code value");
                    m42832();
                } else {
                    this.f57152 = 3;
                }
            } else if (i != 181) {
                C19956.m46037("Unexpected start code value");
                m42832();
            } else {
                this.f57152 = 2;
            }
        } else if (i == 176) {
            this.f57152 = 1;
            this.f57149 = true;
        }
        m42833(0, 3, f57147);
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42833(int i, int i2, byte[] bArr) {
        if (this.f57149) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f57148;
            int length = bArr2.length;
            int i4 = this.f57150 + i3;
            if (length < i4) {
                this.f57148 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f57148, this.f57150, i3);
            this.f57150 += i3;
        }
    }
}
