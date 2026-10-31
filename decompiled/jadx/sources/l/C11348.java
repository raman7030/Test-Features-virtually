package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۨ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11348 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14159 f33971;

    public C11348(C14159 c14159) {
        this.f33971 = c14159;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f33971.m33792();
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        while (i3 < i2) {
            int iM33790 = this.f33971.m33790(j + ((long) i3), bArr, i + i3, i2 - i3);
            if (iM33790 <= 0) {
                throw new EOFException("Unexpected end of metadata");
            }
            i3 += iM33790;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33971.close();
    }
}
