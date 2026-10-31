package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۬֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12794 extends AbstractC4328 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38414;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11749 f38415;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f38416;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38417;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12794(C11384 c11384, C11749 c11749) {
        super(c11384);
        this.f38416 = c11384;
        this.f38414 = -1L;
        this.f38417 = true;
        this.f38415 = c11749;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r10.f38417 == false) goto L32;
     */
    @Override // l.AbstractC4328, l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        if (this.f13928) {
            throw new IllegalStateException("closed");
        }
        if (this.f38417) {
            long j2 = this.f38414;
            if (j2 == 0 || j2 == -1) {
                C11384 c11384 = this.f38416;
                InterfaceC6171 interfaceC6171 = c11384.f34055;
                if (j2 != -1) {
                    interfaceC6171.mo12300();
                }
                try {
                    this.f38414 = interfaceC6171.mo12309();
                    String strTrim = interfaceC6171.mo12300().trim();
                    if (this.f38414 < 0 || !(strTrim.isEmpty() || strTrim.startsWith(l.b))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f38414 + strTrim + "\"");
                    }
                    if (this.f38414 == 0) {
                        this.f38417 = false;
                        InterfaceC19511 interfaceC19511M40473 = c11384.f34050.m40473();
                        C10338 c10338M28147 = c11384.m28147();
                        int i = C0799.f2925;
                        if (interfaceC19511M40473 != InterfaceC19511.f63052 && !C3988.m12034(this.f38415, c10338M28147).isEmpty()) {
                            interfaceC19511M40473.getClass();
                        }
                        m12985(true, null);
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo4334 = super.mo4334(c12521, Math.min(8192L, this.f38414));
            if (jMo4334 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m12985(false, protocolException);
                throw protocolException;
            }
            this.f38414 -= jMo4334;
            return jMo4334;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM46184;
        if (this.f13928) {
            return;
        }
        if (this.f38417) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM46184 = C20032.m46184(this, 100);
            } catch (IOException unused) {
                zM46184 = false;
            }
            if (!zM46184) {
                m12985(false, null);
            }
        }
        this.f13928 = true;
    }
}
