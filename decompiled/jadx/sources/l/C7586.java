package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۟ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7586 extends AbstractC3353 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C6923 f23460;

    public C7586(C12216 c12216, C13935 c13935, C16594 c16594) {
        super(c12216, c13935, c16594);
        this.f23460 = new C6923(c13935, c12216, c16594.m39097());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6613 m20338(long j, int i, byte[] bArr) {
        return this.f23460.m18727(j, i, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m20336(C6613 c6613) throws IOException {
        try {
            return ((Long) c6613.get(this.f10613.m8417(), TimeUnit.MILLISECONDS)).longValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("SMB write interrupted", e);
        } catch (CancellationException e2) {
            throw new IOException("SMB write canceled", e2);
        } catch (ExecutionException e3) {
            throw new IOException("SMB write failed", e3);
        } catch (TimeoutException e4) {
            throw new IOException("SMB write timed out", e4);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20339() {
        return this.f10613.m8421();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m20340() {
        return this.f10613.m8418();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20335(long j, byte[] bArr, int i, int i2) {
        C18358 c18358M8412 = this.f10613.m8412(this.f10615, j, i2);
        if (((C23670) c18358M8412.mo3028()).m52202() == EnumC7462.STATUS_END_OF_FILE.getValue()) {
            return -1;
        }
        int iMin = Math.min(i2, c18358M8412.m42789());
        c18358M8412.m42787(0, bArr, i, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InputStream m20341(long j) {
        C13935 c13935 = this.f10613;
        return new C16800(this, c13935.m8421(), c13935.m8422(), j, -1L, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m20337(long j, int i, long j2) {
        C13935 c13935 = this.f10613;
        return new C16800(this, c13935.m8421(), c13935.m8422(), j, j2, i);
    }

    public final String toString() {
        return "File{fileId=" + this.f10615 + ", fileName='" + this.f10614.m39097() + "'}";
    }
}
