package l;

/* JADX INFO: renamed from: l.ۗۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3064 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f9613;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14766 f9614;

    public C3064(int i) {
        byte[] bArr = new byte[i];
        this.f9613 = bArr;
        int i2 = AbstractC14766.f45086;
        this.f9614 = new C16883(bArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5886 m9384() {
        if (this.f9614.mo27812() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new C12236(this.f9613);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14766 m9385() {
        return this.f9614;
    }
}
