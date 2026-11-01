package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۨ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13153 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ᩸ */
    public final C15826 f36969;

    public C13153(C15826 c15826) {
        this.f36969 = c15826;
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f36969.m35924();
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        while (i3 < i2) {
            int iM35922 = this.f36969.m35922(j + ((long) i3), bArr, i + i3, i2 - i3);
            if (iM35922 <= 0) {
                throw new EOFException("Unexpected end of metadata");
            }
            i3 += iM35922;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36969.close();
    }
}
