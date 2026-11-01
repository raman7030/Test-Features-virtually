package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9804 extends AbstractC2783 {

    /* JADX INFO: renamed from: ۬ */
    public final IOException f27138;

    public C9804(String str, IOException iOException) {
        super(str, 0L, new Object());
        this.f27138 = iOException;
    }

    @Override // p067l.AbstractC2783
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo4369() throws IOException {
        throw this.f27138;
    }
}
