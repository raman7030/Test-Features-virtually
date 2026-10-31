package l;

import android.os.Build;
import android.util.Log;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.᩷ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes5.dex */
public class C20989 extends C18872 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4055 f67782;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6877 f67783;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4055 f67784;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4055 f67785;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4055 f67786;

    public C20989(C4055 c4055, C4055 c4056, C4055 c4057, C4055 c4058) throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f67783 = new C6877(method3, method2, method);
        this.f67786 = c4055;
        this.f67782 = c4056;
        this.f67785 = c4057;
        this.f67784 = c4058;
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final void mo43584(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C20032.m46182(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public void mo8318(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f67786.m12176(sSLSocket, Boolean.TRUE);
            this.f67782.m12176(sSLSocket, str);
        }
        C4055 c4055 = this.f67784;
        if (c4055 == null || !c4055.m12177(sSLSocket)) {
            return;
        }
        C12521 c12521 = new C12521();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC14386 enumC14386 = (EnumC14386) list.get(i);
            if (enumC14386 != EnumC14386.HTTP_1_0) {
                c12521.m30720writeByte(enumC14386.toString().length());
                String string = enumC14386.toString();
                c12521.m30707(0, string.length(), string);
            }
        }
        try {
            c4055.m12175((Object) sSLSocket, c12521.mo12306());
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ */
    public String mo8319(SSLSocket sSLSocket) {
        C4055 c4055 = this.f67785;
        if (c4055 == null || !c4055.m12177(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) c4055.m12175((Object) sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C20032.f64897);
            }
            return null;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final void mo43582(int i, String str, Throwable th) {
        int iMin;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int iIndexOf = str.indexOf(10, i2);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i2 + OpenAuthTask.SYS_ERR);
                str.substring(i2, iMin);
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ */
    public final Object mo43586() {
        return this.f67783.m18618();
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final void mo43583(Object obj, String str) {
        if (this.f67783.m18619(obj)) {
            return;
        }
        mo43582(5, str, (Throwable) null);
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo43585(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m47797(cls, cls.getMethod("getInstance", null).invoke(null, null), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw C20032.m46170("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C20032.m46170("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C20032.m46170("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47797(Class cls, Object obj, String str) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1232 mo43581(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C14637(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo43581(x509TrustManager);
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15342 mo43587(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C23810(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo43587(x509TrustManager);
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final SSLContext mo24641() {
        try {
            if (Build.VERSION.SDK_INT < 22) {
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
        } catch (NoClassDefFoundError unused2) {
        }
    }
}
