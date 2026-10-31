package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܳᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C14679 extends C4760 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Socket f44851;

    public C14679(Socket socket) {
        this.f44851 = socket;
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

    @Override // l.C4760
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13924() {
        Socket socket = this.f44851;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                C23852.f77173.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            C23852.f77173.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
