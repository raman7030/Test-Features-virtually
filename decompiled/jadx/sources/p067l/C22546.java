package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22546 extends AbstractC2783 {

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC17043 f71120;

    public C22546(long j, AbstractC17043 abstractC17043, String str) {
        super(str, j, Long.valueOf(j));
        this.f71120 = abstractC17043;
    }

    @Override // p067l.AbstractC2783
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo4369() throws IOException {
        AbstractC17043 abstractC17043 = this.f71120;
        try {
            return abstractC17043.mo29987();
        } catch (IOException e) {
            String strM38677 = abstractC17043.m38677();
            if (strM38677 != null) {
                return new ByteArrayInputStream(C11817.m27086(strM38677));
            }
            throw e;
        }
    }
}
