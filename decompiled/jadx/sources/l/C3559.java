package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3559 implements InterfaceC10615, InterfaceC12731 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f11299;

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10841() {
        return 1;
    }

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo10843() {
        return true;
    }

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo10844() {
        return false;
    }

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo10845() {
        return false;
    }

    public C3559(byte[] bArr) throws C9413 {
        if (bArr.length != 1) {
            throw new C9413("Unsupported Delta filter properties");
        }
        this.f11299 = (bArr[0] & 255) + 1;
    }

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream mo10842(InputStream inputStream, C4265 c4265) {
        return new C13436(inputStream, this.f11299);
    }
}
