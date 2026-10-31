package l;

/* JADX INFO: renamed from: l.֡᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9YW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0627 implements InterfaceC8079 {
    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2557(int i, int i2, byte[] bArr) throws C17771 {
        if (i2 < 24) {
            throw new C17771("Invalid resume key");
        }
        System.arraycopy(bArr, i, new byte[24], 0, 24);
        C1480.m5123(i + 24, bArr);
        return (i + 28) - i;
    }
}
