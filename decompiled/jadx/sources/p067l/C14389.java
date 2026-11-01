package p067l;

import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.۫᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14389 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ֫ */
    public int f41125;

    public C14389(int i) {
        this.f41125 = i;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4];
            if ((b == 64 && (bArr[i4 + 1] & 192) == 0) || (b == 127 && (bArr[i4 + 1] & 192) == 192)) {
                C19781.m44960(i4, ((((C19781.m44956(i4, bArr) + (-(((this.f41125 + i4) - i) >>> 2))) << 9) >> 9) & Mod.M30) | 1073741824, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f41125 += i5;
        return i5;
    }
}
