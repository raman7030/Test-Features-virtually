package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۠֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7824 extends AbstractC0436 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final IOException f24222;

    public C7824(String str, IOException iOException) {
        super(str, 0L, new Object());
        this.f24222 = iOException;
    }

    @Override // l.AbstractC0436
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo1993() throws IOException {
        throw this.f24222;
    }
}
