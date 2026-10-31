package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8MH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5707 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17584;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f17585;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f17586;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f17587;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17588;

    public C5707(int i) {
        this.f17587 = i;
        byte[] bArr = new byte[131];
        this.f17586 = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16117() {
        this.f17585 = false;
        this.f17584 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16115() {
        return this.f17584;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16118(int i) {
        C22632.m50634(!this.f17585);
        boolean z = i == this.f17587;
        this.f17585 = z;
        if (z) {
            this.f17588 = 3;
            this.f17584 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16114(int i, int i2, byte[] bArr) {
        if (this.f17585) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f17586;
            int length = bArr2.length;
            int i4 = this.f17588;
            if (length < i4 + i3) {
                this.f17586 = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f17586, this.f17588, i3);
            this.f17588 += i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16116(int i) {
        if (!this.f17585) {
            return false;
        }
        this.f17588 -= i;
        this.f17585 = false;
        this.f17584 = true;
        return true;
    }
}
