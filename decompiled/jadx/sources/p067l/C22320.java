package p067l;

/* JADX INFO: renamed from: l.᩷ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8897 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22320 extends AbstractC11591 {

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f70473;

    /* JADX INFO: renamed from: ۙ */
    public int f70474;

    /* JADX INFO: renamed from: ۬ */
    public int f70475;

    public C22320(long j, int i, byte[] bArr) {
        this.f70473 = bArr;
        this.f32334 = j;
        this.f70474 = 0;
        this.f70475 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m50134() {
        return this.f70475 > 0;
    }

    @Override // p067l.AbstractC11591
    /* JADX INFO: renamed from: ۧ */
    public final int mo25183(byte[] bArr) {
        int length = bArr.length;
        int i = this.f70475;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.f70473, this.f70474, bArr, 0, length);
        this.f70474 += length;
        this.f70475 -= length;
        return length;
    }

    @Override // p067l.AbstractC11591
    /* JADX INFO: renamed from: ֫ */
    public final int mo25182() {
        return this.f70475;
    }
}
