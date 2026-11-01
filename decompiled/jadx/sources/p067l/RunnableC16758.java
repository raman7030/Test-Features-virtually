package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.ܶۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16758 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22795 f49392;

    public /* synthetic */ RunnableC16758(C22795 c22795) {
        this.f49392 = c22795;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22795 c22795 = this.f49392;
        C9383 c9383 = c22795.f71835;
        C21769 c21769 = c9383.f25608;
        c22795.f71837 = new RunnableC16758(c22795);
        while (c22795.f71837 != null) {
            try {
                Socket socketAccept = c22795.f71833.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                C10448 c10448 = (C10448) c9383.m21842("direct-tcpip");
                if (c10448 != null) {
                    C21099 c21099 = c10448.f66554;
                    c21099.f66297 = inputStream;
                    c21099.f66298 = outputStream;
                    c10448.f28909 = c22795.f71832;
                    c10448.f28912 = c22795.f71836;
                    c10448.f28910 = socketAccept.getInetAddress().getHostAddress();
                    c10448.f28911 = socketAccept.getPort();
                    c10448.mo24167(0);
                } else {
                    try {
                        socketAccept.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        c21769.m49100().getClass();
                        throw th;
                    }
                    c21769.m49100().getClass();
                }
            } catch (Exception unused2) {
            }
        }
        c22795.f71837 = null;
        try {
            ServerSocket serverSocket = c22795.f71833;
            if (serverSocket != null) {
                serverSocket.close();
            }
            c22795.f71833 = null;
        } catch (Exception unused3) {
        }
    }
}
