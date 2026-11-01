package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8MH */
/* JADX INFO: loaded from: classes2.dex */
public final class C7792 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f20430;

    /* JADX INFO: renamed from: ۧ */
    public boolean f20431;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f20432;

    /* JADX INFO: renamed from: ܿ */
    public final int f20433;

    /* JADX INFO: renamed from: ᩳ */
    public int f20434;

    public C7792(int i) {
        this.f20433 = i;
        byte[] bArr = new byte[131];
        this.f20432 = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18036() {
        this.f20431 = false;
        this.f20430 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18034() {
        return this.f20430;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18037(int i) {
        C23877.m52960(!this.f20431);
        boolean z = i == this.f20433;
        this.f20431 = z;
        if (z) {
            this.f20434 = 3;
            this.f20430 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18033(int i, int i2, byte[] bArr) {
        if (this.f20431) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f20432;
            int length = bArr2.length;
            int i4 = this.f20434;
            if (length < i4 + i3) {
                this.f20432 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f20432, this.f20434, i3);
            this.f20434 += i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18035(int i) {
        if (!this.f20431) {
            return false;
        }
        this.f20434 -= i;
        this.f20431 = false;
        this.f20430 = true;
        return true;
    }
}
