package l;

/* JADX INFO: renamed from: l.᩵֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19120 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16296 f60233;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16296 f60234;

    public C19120(InterfaceC1023 interfaceC1023, C16296 c16296, C16296 c16297) {
        this.f60233 = new C16296(interfaceC1023, c16296);
        this.f60234 = new C16296(interfaceC1023, c16297);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44069(byte[] bArr) {
        int iM38333 = this.f60233.m38333(4, bArr) + 4;
        int iM38334 = iM38333 + this.f60234.m38333(iM38333, bArr);
        int i = iM38334 - 4;
        bArr[0] = (byte) 129;
        if (i > 65535) {
            bArr[1] = 1;
        }
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return iM38334;
    }
}
