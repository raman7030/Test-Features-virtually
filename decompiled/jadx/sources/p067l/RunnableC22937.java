package p067l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩸ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22937 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC6843 f72173;

    /* JADX INFO: renamed from: ᩸ */
    public IOException f72174;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f72175 = false;

    public RunnableC22937(AbstractC6843 abstractC6843) {
        this.f72173 = abstractC6843;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6843 abstractC6843 = this.f72173;
        try {
            try {
                abstractC6843.f17780.bind(new InetSocketAddress(abstractC6843.f17779));
                this.f72175 = true;
                do {
                    try {
                        Socket socketAccept = abstractC6843.f17780.accept();
                        socketAccept.setSoTimeout(OpenAuthTask.Duplex);
                        abstractC6843.f17778.m54817(new RunnableC18242(abstractC6843, socketAccept.getInputStream(), socketAccept));
                    } catch (IOException e) {
                        AbstractC6843.f17774.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!abstractC6843.f17780.isClosed());
            } catch (IOException e2) {
                this.f72174 = e2;
            }
        } catch (Throwable th) {
            C21306.m48192("NanoHTTPD listener thread failed: port=" + abstractC6843.f17779 + ", listeningPort=" + abstractC6843.m15671(), th);
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
