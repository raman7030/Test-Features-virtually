package l;

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
public final class C7987 extends SSLSocketFactory {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] f24664;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SSLSocketFactory f24665;

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
                f24664 = (String[]) linkedList.toArray(new String[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f24665.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f24664;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f24665.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f24664;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f24665.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f24664;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f24665.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f24664;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f24665.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            String[] strArr = f24664;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
        return socketCreateSocket;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17915 m21306() {
        C0931 c0931 = new C0931();
        C17915 c17915 = new C17915();
        try {
            C7987 c7987 = new C7987();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{c0931}, new SecureRandom());
                c7987.f24665 = sSLContext.getSocketFactory();
                c17915.m41899(c7987, c0931);
                return c17915;
            } catch (GeneralSecurityException unused) {
                throw new AssertionError();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
