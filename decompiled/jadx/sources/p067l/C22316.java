package p067l;

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
public class C22316 extends C20304 {

    /* JADX INFO: renamed from: ܳ */
    public final C6222 f70467;

    /* JADX INFO: renamed from: ܽ */
    public final C8904 f70468;

    /* JADX INFO: renamed from: ܿ */
    public final C6222 f70469;

    /* JADX INFO: renamed from: ᩳ */
    public final C6222 f70470;

    /* JADX INFO: renamed from: ᩻ */
    public final C6222 f70471;

    public C22316(C6222 c6222, C6222 c6223, C6222 c6224, C6222 c6225) throws NoSuchMethodException {
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
        this.f70468 = new C8904(method3, method2, method);
        this.f70471 = c6222;
        this.f70467 = c6223;
        this.f70470 = c6224;
        this.f70469 = c6225;
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo45850(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C21407.m48498(e)) {
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

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public void mo10362(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f70471.m14097(sSLSocket, Boolean.TRUE);
            this.f70467.m14097(sSLSocket, str);
        }
        C6222 c6222 = this.f70469;
        if (c6222 == null || !c6222.m14098(sSLSocket)) {
            return;
        }
        C14268 c14268 = new C14268();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC16041 enumC16041 = (EnumC16041) list.get(i);
            if (enumC16041 != EnumC16041.HTTP_1_0) {
                c14268.m56480writeByte(enumC16041.toString().length());
                String string = enumC16041.toString();
                c14268.m32781(0, string.length(), string);
            }
        }
        try {
            c6222.m14096((Object) sSLSocket, c14268.mo14211());
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

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public String mo10363(SSLSocket sSLSocket) {
        C6222 c6222 = this.f70470;
        if (c6222 == null || !c6222.m14098(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) c6222.m14096((Object) sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, C21407.f67539);
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

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo45848(int i, String str, Throwable th) {
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

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public final Object mo45852() {
        return this.f70468.m20567();
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo45849(Object obj, String str) {
        if (this.f70468.m20568(obj)) {
            return;
        }
        mo45848(5, str, (Throwable) null);
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo45851(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m50127(cls, cls.getMethod("getInstance", null).invoke(null, null), str);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw C21407.m48486("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw C21407.m48486("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw C21407.m48486("unable to determine cleartext support", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50127(Class cls, Object obj, String str) {
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

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3539 mo45847(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C16279(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo45847(x509TrustManager);
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16949 mo45853(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C24997(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo45853(x509TrustManager);
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final SSLContext mo26655() {
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
