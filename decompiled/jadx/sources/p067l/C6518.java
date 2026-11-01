package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6518 implements InterfaceC23282 {

    /* JADX INFO: renamed from: ᩸ */
    public String f16851;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f16852 = false;

    @Override // p067l.InterfaceC23282
    /* JADX INFO: renamed from: ۧ */
    public final byte mo11079() {
        return (byte) 10;
    }

    public C6518(String str) {
        this.f16851 = str;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f16852 = bArr[i] != 0;
        int iM7365 = C3775.m7365(i + 16, bArr);
        int i3 = i + 20;
        byte[] bArr2 = new byte[iM7365];
        System.arraycopy(bArr, i3, bArr2, 0, iM7365);
        int i4 = i3 + iM7365;
        this.f16851 = new String(bArr2, StandardCharsets.UTF_16LE);
        return i4 - i;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        bArr[i] = this.f16852 ? (byte) 1 : (byte) 0;
        byte[] bytes = this.f16851.getBytes(StandardCharsets.UTF_16LE);
        C3775.m7366(bytes.length, i + 16, bArr);
        int i2 = i + 20;
        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
        return (i2 + bytes.length) - i;
    }

    @Override // p067l.InterfaceC23458
    public final int size() {
        return (this.f16851.length() * 2) + 20;
    }
}
