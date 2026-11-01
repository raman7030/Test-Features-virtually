package p067l;

/* JADX INFO: renamed from: l.᩵֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20540 {

    /* JADX INFO: renamed from: ֫ */
    public C17856 f63465;

    /* JADX INFO: renamed from: ۧ */
    public C17856 f63466;

    public C20540(InterfaceC3341 interfaceC3341, C17856 c17856, C17856 c17857) {
        this.f63465 = new C17856(interfaceC3341, c17856);
        this.f63466 = new C17856(interfaceC3341, c17857);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46363(byte[] bArr) {
        int iM40548 = this.f63465.m40548(4, bArr) + 4;
        int iM40549 = iM40548 + this.f63466.m40548(iM40548, bArr);
        int i = iM40549 - 4;
        bArr[0] = (byte) 129;
        if (i > 65535) {
            bArr[1] = 1;
        }
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        return iM40549;
    }
}
