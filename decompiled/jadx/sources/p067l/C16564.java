package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16564 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f48645;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 f48646;

    /* JADX INFO: renamed from: ܽ */
    public final long f48647;

    /* JADX INFO: renamed from: ᩳ */
    public final String f48648;

    public C16564(long j, AbstractC17043 abstractC17043, String str, boolean z) {
        this.f48646 = abstractC17043;
        this.f48645 = z;
        this.f48647 = j;
        this.f48648 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m37544() throws IOException {
        if (!this.f48645) {
            throw new IOException("The source file does not exist");
        }
        return this.f48646.mo29987();
    }
}
