package l;

/* JADX INFO: renamed from: l.᩶ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19889 implements InterfaceC22005 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64275;

    @Override // l.InterfaceC22190
    public final int size() {
        return 8;
    }

    @Override // l.InterfaceC22005
    /* JADX INFO: renamed from: ۧ */
    public final byte mo9011() {
        return (byte) 6;
    }

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        this.f64275 = C1480.m5125(i, bArr);
        return 8;
    }

    @Override // l.InterfaceC22190
    /* JADX INFO: renamed from: ֫ */
    public final int mo9010(int i, byte[] bArr) {
        C1480.m5126(this.f64275, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C15942.m37718(new StringBuilder("SmbQueryFileInternalInfo[indexNumber="), this.f64275, "]"));
    }
}
