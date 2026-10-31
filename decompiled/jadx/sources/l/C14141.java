package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14141 extends AbstractC23314 implements InterfaceC10615 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42685;

    public C14141(byte[] bArr) throws C9413 {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                int i = (b & 1) | 2;
                this.f42685 = i;
                this.f42685 = i << ((b >>> 1) + 11);
                return;
            }
        }
        throw new C9413("Unsupported LZMA2 properties");
    }

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final int mo10841() {
        return C1651.m5549(this.f42685);
    }

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo10842(InputStream inputStream, C4265 c4265) {
        return new C1651(inputStream, this.f42685, c4265);
    }
}
