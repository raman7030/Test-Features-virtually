package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۬֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14527 extends AbstractC6481 {

    /* JADX INFO: renamed from: ۗ */
    public long f41456;

    /* JADX INFO: renamed from: ۤ */
    public final C13535 f41457;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C13187 f41458;

    /* JADX INFO: renamed from: ۬ */
    public boolean f41459;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14527(C13187 c13187, C13535 c13535) {
        super(c13187);
        this.f41458 = c13187;
        this.f41456 = -1L;
        this.f41459 = true;
        this.f41457 = c13535;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r10.f41459 == false) goto L32;
     */
    @Override // p067l.AbstractC6481, p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        if (this.f16742) {
            throw new IllegalStateException("closed");
        }
        if (this.f41459) {
            long j2 = this.f41456;
            if (j2 == 0 || j2 == -1) {
                C13187 c13187 = this.f41458;
                InterfaceC8233 interfaceC8233 = c13187.f37053;
                if (j2 != -1) {
                    interfaceC8233.mo14205();
                }
                try {
                    this.f41456 = interfaceC8233.mo14214();
                    String strTrim = interfaceC8233.mo14205().trim();
                    if (this.f41456 < 0 || !(strTrim.isEmpty() || strTrim.startsWith(C0249l.f1196b))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f41456 + strTrim + "\"");
                    }
                    if (this.f41456 == 0) {
                        this.f41459 = false;
                        InterfaceC20912 interfaceC20912M42720 = c13187.f37048.m42720();
                        C12194 c12194M30191 = c13187.m30191();
                        int i = C3127.f5696;
                        if (interfaceC20912M42720 != InterfaceC20912.f65672 && !C6159.m13954(this.f41457, c12194M30191).isEmpty()) {
                            interfaceC20912M42720.getClass();
                        }
                        m14849(true, null);
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo6580 = super.mo6580(c14268, Math.min(8192L, this.f41456));
            if (jMo6580 == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m14849(false, protocolException);
                throw protocolException;
            }
            this.f41456 -= jMo6580;
            return jMo6580;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM48500;
        if (this.f16742) {
            return;
        }
        if (this.f41459) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM48500 = C21407.m48500(this, 100);
            } catch (IOException unused) {
                zM48500 = false;
            }
            if (!zM48500) {
                m14849(false, null);
            }
        }
        this.f16742 = true;
    }
}
