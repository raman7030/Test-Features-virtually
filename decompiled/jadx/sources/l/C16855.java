package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA2I */
/* JADX INFO: loaded from: classes5.dex */
public final class C16855 extends AbstractC13306 implements InterfaceC4840 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f51726;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f51727;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f51728;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f51729;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public byte f51730;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public byte f51731;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C16855(InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023, 14);
        this.f51730 = (byte) 3;
        C13722 c13722 = (C13722) interfaceC1023;
        this.f51727 = (Math.min(c13722.m33009(), c13722.m33001()) - 72) & (-8);
        this.f51729 = bArr;
    }

    @Override // l.InterfaceC4840
    /* JADX INFO: renamed from: ֫ */
    public final void mo8489(byte[] bArr) {
        this.f51729 = bArr;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void m39626() {
        this.f51731 = (byte) 4;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m39628(int i) {
        this.f51728 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39627(String str) {
        this.f51726 = str;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C18267(interfaceC18663.mo27540(), this.f51730);
    }

    @Override // l.InterfaceC7578
    public final int size() {
        String str = this.f51726;
        return AbstractC3429.m10428((str != null ? str.length() * 2 : 0) + 96);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(33L, i, bArr);
        bArr[i + 2] = this.f51730;
        bArr[i + 3] = this.f51731;
        C1480.m5124(this.f51728, i + 4, bArr);
        System.arraycopy(this.f51729, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 26;
        C1480.m5124(this.f51727, i + 28, bArr);
        int length = i + 32;
        String str = this.f51726;
        if (str == null) {
            C1480.m5122(0L, i2, bArr);
            C1480.m5122(0L, i3, bArr);
        } else {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
            C1480.m5122(length - m10453(), i2, bArr);
            C1480.m5122(bytes.length, i3, bArr);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }
}
