package l;

import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.۫᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12648 implements InterfaceC10532 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38097;

    public C12648(int i) {
        this.f38097 = i;
    }

    @Override // l.InterfaceC10532
    /* JADX INFO: renamed from: ֫ */
    public final int mo10634(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4];
            if ((b == 64 && (bArr[i4 + 1] & 192) == 0) || (b == 127 && (bArr[i4 + 1] & 192) == 192)) {
                C18321.m42698(i4, ((((C18321.m42694(i4, bArr) + (-(((this.f38097 + i4) - i) >>> 2))) << 9) >> 9) & Mod.M30) | 1073741824, bArr);
            }
            i4 += 4;
        }
        int i5 = i4 - i;
        this.f38097 += i5;
        return i5;
    }
}
