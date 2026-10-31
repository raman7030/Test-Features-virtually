package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4292 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f13844;

    public C4292(AbstractC15440 abstractC15440) {
        this.f13844 = abstractC15440.m36513("r");
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f13844.length();
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) throws EOFException {
        C23411 c23411 = this.f13844;
        c23411.seek(j);
        c23411.m51858(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13844.close();
    }
}
