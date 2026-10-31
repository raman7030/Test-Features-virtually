package l;

/* JADX INFO: renamed from: l.ۛۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5896 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3074 f18106;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18107;

    public C5896(C3074 c3074, int i) {
        this.f18106 = c3074;
        this.f18107 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m16529() {
        return this.f18107;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16533(int i) {
        this.f18107 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte m16532() {
        byte bM9398 = this.f18106.m9398(this.f18107);
        this.f18107++;
        return bM9398;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m16531() {
        int iM9401 = this.f18106.m9401(this.f18107);
        this.f18107++;
        return iM9401;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short m16534() {
        short sM9402 = this.f18106.m9402(this.f18107);
        this.f18107 += 2;
        return sM9402;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m16537() {
        int iM9399 = this.f18106.m9399(this.f18107);
        this.f18107 += 2;
        return iM9399;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m16535() {
        int iM9400 = this.f18106.m9400(this.f18107);
        this.f18107 += 4;
        return iM9400;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m16527(int i) {
        int[] iArrM9397 = this.f18106.m9397(this.f18107, i);
        this.f18107 = (i * 4) + this.f18107;
        return iArrM9397;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m16530(int i) {
        int i2 = this.f18107;
        StringBuilder sb = new StringBuilder(16);
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            char cM9402 = (char) this.f18106.m9402(i2);
            i2 += 2;
            if (cM9402 == 0) {
                break;
            }
            sb.append(cM9402);
            i3 = i4;
        }
        String string = sb.toString();
        this.f18107 = (i * 2) + this.f18107;
        return string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16526(byte[] bArr) {
        this.f18106.m9394(this.f18107, bArr);
        this.f18107 += bArr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16525() {
        return this.f18106.m9393(this.f18107);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16528() {
        this.f18107 += 4;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16536(int i) {
        this.f18107 += i;
    }
}
