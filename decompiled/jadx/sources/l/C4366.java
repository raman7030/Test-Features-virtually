package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1X */
/* JADX INFO: loaded from: classes3.dex */
public final class C4366 implements InterfaceC22005 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f14036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14037 = false;

    @Override // l.InterfaceC22005
    /* JADX INFO: renamed from: ۧ */
    public final byte mo9011() {
        return (byte) 10;
    }

    public C4366(String str) {
        this.f14036 = str;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f14037 = bArr[i] != 0;
        int iM5123 = C1480.m5123(i + 16, bArr);
        int i3 = i + 20;
        byte[] bArr2 = new byte[iM5123];
        System.arraycopy(bArr, i3, bArr2, 0, iM5123);
        int i4 = i3 + iM5123;
        this.f14036 = new String(bArr2, StandardCharsets.UTF_16LE);
        return i4 - i;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        bArr[i] = this.f14037 ? (byte) 1 : (byte) 0;
        byte[] bytes = this.f14036.getBytes(StandardCharsets.UTF_16LE);
        C1480.m5124(bytes.length, i + 16, bArr);
        int i2 = i + 20;
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }

    @Override // l.InterfaceC22190
    public final int size() {
        return (this.f14036.length() * 2) + 20;
    }
}
