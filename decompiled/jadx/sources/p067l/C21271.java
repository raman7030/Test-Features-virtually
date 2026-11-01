package p067l;

/* JADX INFO: renamed from: l.᩶ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21271 implements InterfaceC23282 {

    /* JADX INFO: renamed from: ᩸ */
    public long f66911;

    @Override // p067l.InterfaceC23458
    public final int size() {
        return 8;
    }

    @Override // p067l.InterfaceC23282
    /* JADX INFO: renamed from: ۧ */
    public final byte mo11079() {
        return (byte) 6;
    }

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) {
        this.f66911 = C3775.m7367(i, bArr);
        return 8;
    }

    @Override // p067l.InterfaceC23458
    /* JADX INFO: renamed from: ֫ */
    public final int mo11078(int i, byte[] bArr) {
        C3775.m7368(this.f66911, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C17520.m39893(new StringBuilder("SmbQueryFileInternalInfo[indexNumber="), this.f66911, "]"));
    }
}
