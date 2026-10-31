package l;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ᩴܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 45RK */
/* JADX INFO: loaded from: classes4.dex */
public class C18872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18872 f59492;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f59493;

    /* JADX INFO: renamed from: ֫ */
    public void mo8317(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo8318(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24642(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo43585(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo8319(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18872 m43580() {
        return f59492;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43584(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43582(int i, String str, Throwable th) {
        f59493.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object mo43586() {
        if (f59493.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo43583(Object obj, String str) {
        if (obj == null) {
            str = C16014.m37867(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo43582(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43579(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC14386 enumC14386 = (EnumC14386) list.get(i);
            if (enumC14386 != EnumC14386.HTTP_1_0) {
                arrayList.add(enumC14386.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1232 mo43581(X509TrustManager x509TrustManager) {
        return new C0526(mo43587(x509TrustManager));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    static {
        C18872 c8994;
        int i;
        boolean z;
        C4055 c4055;
        C4055 c4056;
        C18872 c2644 = null;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                try {
                    try {
                        i = Build.VERSION.SDK_INT;
                    } catch (NoClassDefFoundError unused) {
                        i = 0;
                    }
                    if (i >= 29) {
                        Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        c8994 = new C17460(null, null, null, null);
                    } else {
                        c8994 = null;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } else {
                c8994 = null;
            }
            if (c8994 == null) {
                if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                    try {
                        try {
                            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        } catch (ClassNotFoundException unused3) {
                            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                        }
                        C4055 c4057 = new C4055(null, "setUseSessionTickets", Boolean.TYPE);
                        C4055 c4058 = new C4055(null, "setHostname", String.class);
                        if (Security.getProvider("GMSCore_OpenSSL") == null) {
                            try {
                                Class.forName("android.net.Network");
                            } catch (ClassNotFoundException unused4) {
                                z = false;
                            }
                        }
                        z = true;
                        if (z) {
                            c4055 = new C4055(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                            c4056 = new C4055(null, "setAlpnProtocols", byte[].class);
                        } else {
                            c4055 = null;
                            c4056 = null;
                        }
                        c2644 = new C20989(c4057, c4058, c4055, c4056);
                    } catch (ClassNotFoundException unused5) {
                    }
                }
                if (c2644 == null) {
                    throw new NullPointerException("No platform found on Android");
                }
            }
        } else {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c8994 = C9700.m24640()) == null) {
                try {
                    c8994 = new C8994(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused6) {
                    c8994 = null;
                }
                if (c8994 == null) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c2644 = new C2644(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                    }
                    c8994 = c2644 != null ? c2644 : new C18872();
                }
            }
        }
        f59492 = c8994;
        f59493 = Logger.getLogger(C17209.class.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public SSLContext mo24641() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC15342 mo43587(X509TrustManager x509TrustManager) {
        return new C5466(x509TrustManager.getAcceptedIssuers());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
