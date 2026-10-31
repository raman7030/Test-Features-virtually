package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.᩻ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23810 implements InterfaceC15342 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f77060;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final X509TrustManager f77061;

    public C23810(X509TrustManager x509TrustManager, Method method) {
        this.f77060 = method;
        this.f77061 = x509TrustManager;
    }

    @Override // l.InterfaceC15342
    /* JADX INFO: renamed from: ֫ */
    public final X509Certificate mo15566(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f77060.invoke(this.f77061, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw C20032.m46170("unable to get issues and signature", (Exception) e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23810)) {
            return false;
        }
        C23810 c23810 = (C23810) obj;
        return this.f77061.equals(c23810.f77061) && this.f77060.equals(c23810.f77060);
    }

    public final int hashCode() {
        return (this.f77060.hashCode() * 31) + this.f77061.hashCode();
    }
}
