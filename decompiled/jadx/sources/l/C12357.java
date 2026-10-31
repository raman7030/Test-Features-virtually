package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.۫ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12357 extends C4760 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10241 f37021;

    public C12357(C10241 c10241) {
        this.f37021 = c10241;
    }

    @Override // l.C4760
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13924() {
        EnumC13499 enumC13499 = EnumC13499.CANCEL;
        C10241 c10241 = this.f37021;
        c10241.m25940(enumC13499);
        c10241.f30870.m49937();
    }

    @Override // l.C4760
    /* JADX INFO: renamed from: ֫ */
    public final IOException mo13921(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(b.n0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m29977() {
        if (m13923()) {
            throw mo13921((IOException) null);
        }
    }
}
