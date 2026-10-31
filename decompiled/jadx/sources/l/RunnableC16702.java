package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܽܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16702 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4708 f51286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Socket f51287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InputStream f51288;

    public RunnableC16702(AbstractC4708 abstractC4708, InputStream inputStream, Socket socket) {
        this.f51286 = abstractC4708;
        this.f51288 = inputStream;
        this.f51287 = socket;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39267() {
        AbstractC4708.m13790(this.f51288);
        AbstractC4708.m13790(this.f51287);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream;
        Throwable th;
        Exception e;
        InputStream inputStream = this.f51288;
        AbstractC4708 abstractC4708 = this.f51286;
        Socket socket = this.f51287;
        try {
            outputStream = socket.getOutputStream();
            try {
                try {
                    InterfaceC20231 unused = abstractC4708.f14951;
                    C15996 c15996 = new C15996(abstractC4708, new C9648(), this.f51288, outputStream, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        c15996.m37800();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        AbstractC4708.f14944.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC4708.m13790(outputStream);
                AbstractC4708.m13790(inputStream);
                AbstractC4708.m13790(socket);
                abstractC4708.f14948.m52407(this);
                throw th;
            }
        } catch (Exception e3) {
            outputStream = null;
            e = e3;
        } catch (Throwable th3) {
            outputStream = null;
            th = th3;
            AbstractC4708.m13790(outputStream);
            AbstractC4708.m13790(inputStream);
            AbstractC4708.m13790(socket);
            abstractC4708.f14948.m52407(this);
            throw th;
        }
        AbstractC4708.m13790(outputStream);
        AbstractC4708.m13790(inputStream);
        AbstractC4708.m13790(socket);
        abstractC4708.f14948.m52407(this);
    }
}
