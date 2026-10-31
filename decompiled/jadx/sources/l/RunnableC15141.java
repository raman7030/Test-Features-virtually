package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.ܶۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15141 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21493 f46273;

    public /* synthetic */ RunnableC15141(C21493 c21493) {
        this.f46273 = c21493;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21493 c21493 = this.f46273;
        C7381 c7381 = c21493.f69138;
        C20413 c20413 = c7381.f22696;
        c21493.f69140 = new RunnableC15141(c21493);
        while (c21493.f69140 != null) {
            try {
                Socket socketAccept = c21493.f69136.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                C8501 c8501 = (C8501) c7381.m19869("direct-tcpip");
                if (c8501 != null) {
                    C19708 c19708 = c8501.f63917;
                    c19708.f63666 = inputStream;
                    c19708.f63667 = outputStream;
                    c8501.f25994 = c21493.f69135;
                    c8501.f25997 = c21493.f69139;
                    c8501.f25995 = socketAccept.getInetAddress().getHostAddress();
                    c8501.f25996 = socketAccept.getPort();
                    c8501.mo22199(0);
                } else {
                    try {
                        socketAccept.close();
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        c20413.m46777().getClass();
                        throw th;
                    }
                    c20413.m46777().getClass();
                }
            } catch (Exception unused2) {
            }
        }
        c21493.f69140 = null;
        try {
            ServerSocket serverSocket = c21493.f69136;
            if (serverSocket != null) {
                serverSocket.close();
            }
            c21493.f69136 = null;
        } catch (Exception unused3) {
        }
    }
}
