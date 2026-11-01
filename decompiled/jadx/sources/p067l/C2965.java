package p067l;

/* JADX INFO: renamed from: l.֡᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9YW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2965 implements InterfaceC10047 {
    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) throws C19258 {
        if (i2 < 24) {
            throw new C19258("Invalid resume key");
        }
        System.arraycopy(bArr, i, new byte[24], 0, 24);
        C3775.m7365(i + 24, bArr);
        return (i + 28) - i;
    }
}
