package p067l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: renamed from: l.᩹ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AKO */
/* JADX INFO: loaded from: classes.dex */
public final class C23313 {

    /* JADX INFO: renamed from: ֫ */
    public InetAddress f73360;

    /* JADX INFO: renamed from: ۧ */
    public int f73361;

    /* JADX INFO: renamed from: ܽ */
    public ServerSocket f73362 = null;

    public C23313() {
        m51916();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m51916() {
        ServerSocket serverSocket = this.f73362;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
        this.f73362 = null;
        this.f73360 = null;
        this.f73361 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m51919() {
        m51916();
        try {
            ServerSocket serverSocket = new ServerSocket(0, 5);
            this.f73362 = serverSocket;
            serverSocket.setSoTimeout(30000);
            return this.f73362.getLocalPort();
        } catch (IOException unused) {
            m51916();
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51918(InetAddress inetAddress, int i) {
        m51916();
        this.f73360 = inetAddress;
        this.f73361 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Socket m51920() {
        ServerSocket serverSocket = this.f73362;
        Socket socketAccept = null;
        if (serverSocket == null) {
            if (this.f73360 == null || this.f73361 == 0) {
                m51916();
                return null;
            }
            try {
                Socket socket = new Socket(this.f73360, this.f73361);
                try {
                    socket.setSoTimeout(30000);
                    return socket;
                } catch (Exception unused) {
                    m51916();
                    return null;
                }
            } catch (IOException unused2) {
                m51916();
                return null;
            }
        }
        try {
            socketAccept = serverSocket.accept();
        } catch (Exception unused3) {
        }
        m51916();
        return socketAccept;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51917() {
        m51916();
    }
}
