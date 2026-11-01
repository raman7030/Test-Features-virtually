package p067l;

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
public class C20304 {

    /* JADX INFO: renamed from: ֫ */
    public static final C20304 f62721;

    /* JADX INFO: renamed from: ۧ */
    public static final Logger f62722;

    /* JADX INFO: renamed from: ֫ */
    public void mo10361(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10362(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26656(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo45851(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo10363(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C20304 m45846() {
        return f62721;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo45850(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo45848(int i, String str, Throwable th) {
        f62722.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: ۧ */
    public Object mo45852() {
        if (f62722.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo45849(Object obj, String str) {
        if (obj == null) {
            str = C17588.m40053(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo45848(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m45845(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC16041 enumC16041 = (EnumC16041) list.get(i);
            if (enumC16041 != EnumC16041.HTTP_1_0) {
                arrayList.add(enumC16041.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC3539 mo45847(X509TrustManager x509TrustManager) {
        return new C2868(mo45853(x509TrustManager));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    static {
        C20304 c10916;
        int i;
        boolean z;
        C6222 c6222;
        C6222 c6223;
        C20304 c4881 = null;
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
                        c10916 = new C18962(null, null, null, null);
                    } else {
                        c10916 = null;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } else {
                c10916 = null;
            }
            if (c10916 == null) {
                if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                    try {
                        try {
                            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        } catch (ClassNotFoundException unused3) {
                            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
                        }
                        C6222 c6224 = new C6222(null, "setUseSessionTickets", Boolean.TYPE);
                        C6222 c6225 = new C6222(null, "setHostname", String.class);
                        if (Security.getProvider("GMSCore_OpenSSL") == null) {
                            try {
                                Class.forName("android.net.Network");
                            } catch (ClassNotFoundException unused4) {
                                z = false;
                            }
                        }
                        z = true;
                        if (z) {
                            c6222 = new C6222(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                            c6223 = new C6222(null, "setAlpnProtocols", byte[].class);
                        } else {
                            c6222 = null;
                            c6223 = null;
                        }
                        c4881 = new C22316(c6224, c6225, c6222, c6223);
                    } catch (ClassNotFoundException unused5) {
                    }
                }
                if (c4881 == null) {
                    throw new NullPointerException("No platform found on Android");
                }
            }
        } else {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (c10916 = C11587.m26654()) == null) {
                try {
                    c10916 = new C10916(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused6) {
                    c10916 = null;
                }
                if (c10916 == null) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        c4881 = new C4881(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                    }
                    c10916 = c4881 != null ? c4881 : new C20304();
                }
            }
        }
        f62721 = c10916;
        f62722 = Logger.getLogger(C18724.class.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public SSLContext mo26655() {
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

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC16949 mo45853(X509TrustManager x509TrustManager) {
        return new C7563(x509TrustManager.getAcceptedIssuers());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
