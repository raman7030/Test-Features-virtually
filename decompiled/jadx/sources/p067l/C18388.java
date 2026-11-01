package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA2I */
/* JADX INFO: loaded from: classes5.dex */
public final class C18388 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public String f54906;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f54907;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f54908;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f54909;

    /* JADX INFO: renamed from: ܺ֫ */
    public byte f54910;

    /* JADX INFO: renamed from: ᩴ֫ */
    public byte f54911;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C18388(InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341, 14);
        this.f54910 = (byte) 3;
        C15410 c15410 = (C15410) interfaceC3341;
        this.f54907 = (Math.min(c15410.m35123(), c15410.m35115()) - 72) & (-8);
        this.f54909 = bArr;
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f54909 = bArr;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final void m41862() {
        this.f54911 = (byte) 4;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m41864(int i) {
        this.f54908 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41863(String str) {
        this.f54906 = str;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C19730(interfaceC20106.mo29602(), this.f54910);
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        String str = this.f54906;
        return AbstractC5628.m12467((str != null ? str.length() * 2 : 0) + 96);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(33L, i, bArr);
        bArr[i + 2] = this.f54910;
        bArr[i + 3] = this.f54911;
        C3775.m7366(this.f54908, i + 4, bArr);
        System.arraycopy(this.f54909, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 26;
        C3775.m7366(this.f54907, i + 28, bArr);
        int length = i + 32;
        String str = this.f54906;
        if (str == null) {
            C3775.m7364(0L, i2, bArr);
            C3775.m7364(0L, i3, bArr);
        } else {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
            C3775.m7364(length - m12492(), i2, bArr);
            C3775.m7364(bytes.length, i3, bArr);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }
}
