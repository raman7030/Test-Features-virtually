package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܳᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16319 extends C6892 {

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ Socket f47966;

    public C16319(Socket socket) {
        this.f47966 = socket;
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

    @Override // p067l.C6892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo15804() {
        Socket socket = this.f47966;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                C25037.f79923.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            C25037.f79923.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
