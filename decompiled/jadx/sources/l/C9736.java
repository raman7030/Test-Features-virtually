package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۢܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9736 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f29490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29491;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f29492;

    public C9736(byte[] bArr, int i, int i2) {
        this.f29490 = bArr;
        this.f29492 = i;
        this.f29491 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24726(int i, byte[] bArr) throws EOFException {
        int i2 = this.f29492;
        if (i2 + i > this.f29491) {
            throw new EOFException();
        }
        System.arraycopy(bArr, 0, this.f29490, i2, i);
        this.f29492 += i;
    }
}
