package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۟ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9578 extends AbstractC5555 {

    /* JADX INFO: renamed from: ۗ */
    public final C8948 f26371;

    public C9578(C13978 c13978, C15612 c15612, C18139 c18139) {
        super(c13978, c15612, c18139);
        this.f26371 = new C8948(c15612, c13978, c18139.m41324());
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8653 m22315(long j, int i, byte[] bArr) {
        return this.f26371.m20676(j, i, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m22313(C8653 c8653) throws IOException {
        try {
            return ((Long) c8653.get(this.f13421.m10463(), TimeUnit.MILLISECONDS)).longValue();
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

    /* JADX INFO: renamed from: ܽ */
    public final int m22316() {
        return this.f13421.m10467();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m22317() {
        return this.f13421.m10464();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m22312(long j, byte[] bArr, int i, int i2) {
        C19816 c19816M10458 = this.f13421.m10458(this.f13423, j, i2);
        if (((C24864) c19816M10458.mo5341()).m54605() == EnumC9460.STATUS_END_OF_FILE.getValue()) {
            return -1;
        }
        int iMin = Math.min(i2, c19816M10458.m45061());
        c19816M10458.m45059(0, bArr, i, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InputStream m22318(long j) {
        C15612 c15612 = this.f13421;
        return new C18335(this, c15612.m10467(), c15612.m10468(), j, -1L, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m22314(long j, int i, long j2) {
        C15612 c15612 = this.f13421;
        return new C18335(this, c15612.m10467(), c15612.m10468(), j, j2, i);
    }

    public final String toString() {
        return "File{fileId=" + this.f13423 + ", fileName='" + this.f13422.m41324() + "'}";
    }
}
