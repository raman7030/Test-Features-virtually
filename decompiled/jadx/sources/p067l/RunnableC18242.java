package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܽܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18242 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC6843 f54471;

    /* JADX INFO: renamed from: ᩸ */
    public final Socket f54472;

    /* JADX INFO: renamed from: ᩹ */
    public final InputStream f54473;

    public RunnableC18242(AbstractC6843 abstractC6843, InputStream inputStream, Socket socket) {
        this.f54471 = abstractC6843;
        this.f54473 = inputStream;
        this.f54472 = socket;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41503() {
        AbstractC6843.m15666(this.f54473);
        AbstractC6843.m15666(this.f54472);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream;
        Throwable th;
        Exception e;
        InputStream inputStream = this.f54473;
        AbstractC6843 abstractC6843 = this.f54471;
        Socket socket = this.f54472;
        try {
            outputStream = socket.getOutputStream();
            try {
                try {
                    InterfaceC21596 unused = abstractC6843.f17781;
                    C17571 c17571 = new C17571(abstractC6843, new C11538(), this.f54473, outputStream, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        c17571.m39986();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        AbstractC6843.f17774.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC6843.m15666(outputStream);
                AbstractC6843.m15666(inputStream);
                AbstractC6843.m15666(socket);
                abstractC6843.f17778.m54816(this);
                throw th;
            }
        } catch (Exception e3) {
            outputStream = null;
            e = e3;
        } catch (Throwable th3) {
            outputStream = null;
            th = th3;
            AbstractC6843.m15666(outputStream);
            AbstractC6843.m15666(inputStream);
            AbstractC6843.m15666(socket);
            abstractC6843.f17778.m54816(this);
            throw th;
        }
        AbstractC6843.m15666(outputStream);
        AbstractC6843.m15666(inputStream);
        AbstractC6843.m15666(socket);
        abstractC6843.f17778.m54816(this);
    }
}
