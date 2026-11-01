package p067l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18218 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC15599 f54372;

    public C18218(AbstractC15599 abstractC15599) throws IOException {
        AbstractC15599 abstractC15599M30905 = C13589.m30905(abstractC15599.m35469(), false);
        this.f54372 = abstractC15599M30905;
        try {
            abstractC15599M30905.mo9717(false);
        } catch (IOException | Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f54372;
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}
