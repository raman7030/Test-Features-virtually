package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9W8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4506 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ۙ */
    public int f10107;

    /* JADX INFO: renamed from: ᩶ */
    public C5847[] f10108;

    /* JADX INFO: renamed from: ᩸ */
    public int f10109;

    /* JADX INFO: renamed from: ᩹ */
    public int f10110;

    /* JADX INFO: renamed from: ܿ */
    public final int m9535() {
        return this.f10110;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m9534() {
        return this.f10109;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m9536() {
        return this.f10107;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C5847[] m9533() {
        return this.f10108;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f10110 = C3775.m7363(i, bArr) / 2;
        this.f10109 = C3775.m7363(i + 2, bArr);
        this.f10107 = C3775.m7363(i + 4, bArr);
        int iMo4913 = i + 8;
        this.f10108 = new C5847[this.f10109];
        for (int i3 = 0; i3 < this.f10109; i3++) {
            C5847[] c5847Arr = this.f10108;
            C5847 c5847 = new C5847();
            c5847.f14349 = null;
            c5847.f14350 = null;
            c5847.f14345 = null;
            c5847.f14352 = new String[0];
            c5847Arr[i3] = c5847;
            iMo4913 += c5847.mo4913(iMo4913, i2, bArr);
        }
        return iMo4913 - i;
    }

    public final String toString() {
        return "pathConsumed=" + this.f10110 + ",numReferrals=" + this.f10109 + ",flags=" + this.f10107 + ",referrals=" + Arrays.toString(this.f10108);
    }
}
