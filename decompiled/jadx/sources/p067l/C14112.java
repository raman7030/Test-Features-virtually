package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.۫ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14112 extends C6892 {

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C12101 f40037;

    public C14112(C12101 c12101) {
        this.f40037 = c12101;
    }

    @Override // p067l.C6892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15804() {
        EnumC15197 enumC15197 = EnumC15197.CANCEL;
        C12101 c12101 = this.f40037;
        c12101.m27962(enumC15197);
        c12101.f33831.m52265();
    }

    @Override // p067l.C6892
    /* JADX INFO: renamed from: ֫ */
    public final IOException mo15801(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C0180b.f794n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m32038() {
        if (m15803()) {
            throw mo15801((IOException) null);
        }
    }
}
