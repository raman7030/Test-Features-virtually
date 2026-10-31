package l;

/* JADX INFO: renamed from: l.᩷ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8897 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20993 extends AbstractC9704 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f67788;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67789;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f67790;

    public C20993(long j, int i, byte[] bArr) {
        this.f67788 = bArr;
        this.f29385 = j;
        this.f67789 = 0;
        this.f67790 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m47804() {
        return this.f67790 > 0;
    }

    @Override // l.AbstractC9704
    /* JADX INFO: renamed from: ۧ */
    public final int mo23239(byte[] bArr) {
        int length = bArr.length;
        int i = this.f67790;
        if (length > i) {
            length = i;
        }
        System.arraycopy(this.f67788, this.f67789, bArr, 0, length);
        this.f67789 += length;
        this.f67790 -= length;
        return length;
    }

    @Override // l.AbstractC9704
    /* JADX INFO: renamed from: ֫ */
    public final int mo23238() {
        return this.f67790;
    }
}
