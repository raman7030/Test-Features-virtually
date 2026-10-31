package l;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16677 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f51187;

    public C16677(AbstractC13921 abstractC13921) throws IOException {
        AbstractC13921 abstractC13921M28856 = C11806.m28856(abstractC13921.m33350(), false);
        this.f51187 = abstractC13921M28856;
        try {
            abstractC13921M28856.mo7646(false);
        } catch (IOException | Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        Object obj = this.f51187;
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}
