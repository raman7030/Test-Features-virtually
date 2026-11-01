package p067l;

/* JADX INFO: renamed from: l.ۗۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5280 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f12416;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16402 f12417;

    public C5280(int i) {
        byte[] bArr = new byte[i];
        this.f12416 = bArr;
        int i2 = AbstractC16402.f48200;
        this.f12417 = new C18414(bArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7962 m11426() {
        if (this.f12417.mo29874() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new C13997(this.f12416);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16402 m11427() {
        return this.f12417;
    }
}
