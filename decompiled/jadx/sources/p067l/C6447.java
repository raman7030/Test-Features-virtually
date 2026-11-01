package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6447 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ᩸ */
    public final C24618 f16660;

    public C6447(AbstractC17043 abstractC17043) {
        this.f16660 = abstractC17043.m38671("r");
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f16660.length();
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws EOFException {
        C24618 c24618 = this.f16660;
        c24618.seek(j);
        c24618.m54256(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16660.close();
    }
}
