package p067l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.LinkedList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.۠ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B8U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9959 extends SSLSocketFactory {

    /* JADX INFO: renamed from: ۧ */
    public static String[] f27577;

    /* JADX INFO: renamed from: ֫ */
    public SSLSocketFactory f27578;

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return null;
    }

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains("SSL")) {
                        linkedList.add(str);
                    }
                }
                f27577 = (String[]) linkedList.toArray(new String[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f27578.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f27577;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f27578.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f27577;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f27578.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f27577;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f27578.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f27577;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f27578.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f27577;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19395 m23272() {
        C3253 c3253 = new C3253();
        C19395 c19395 = new C19395();
        try {
            C9959 c9959 = new C9959();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{c3253}, new SecureRandom());
                c9959.f27578 = sSLContext.getSocketFactory();
                c19395.m44148(c9959, c3253);
                return c19395;
            } catch (GeneralSecurityException unused) {
                throw new AssertionError();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
