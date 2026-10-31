package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩸ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21642 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4708 f69470;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IOException f69471;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f69472 = false;

    public RunnableC21642(AbstractC4708 abstractC4708) {
        this.f69470 = abstractC4708;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4708 abstractC4708 = this.f69470;
        try {
            try {
                abstractC4708.f14950.bind(new InetSocketAddress(abstractC4708.f14949));
                this.f69472 = true;
                do {
                    try {
                        Socket socketAccept = abstractC4708.f14950.accept();
                        socketAccept.setSoTimeout(OpenAuthTask.Duplex);
                        abstractC4708.f14948.m52408(new RunnableC16702(abstractC4708, socketAccept.getInputStream(), socketAccept));
                    } catch (IOException e) {
                        AbstractC4708.f14944.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!abstractC4708.f14950.isClosed());
            } catch (IOException e2) {
                this.f69471 = e2;
            }
        } catch (Throwable th) {
            C19926.m45879("NanoHTTPD listener thread failed: port=" + abstractC4708.f14949 + ", listeningPort=" + abstractC4708.m13795(), th);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw new RuntimeException(th);
        }
    }
}
