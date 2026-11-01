package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.᩻ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24997 implements InterfaceC16949 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f79811;

    /* JADX INFO: renamed from: ۧ */
    public final X509TrustManager f79812;

    public C24997(X509TrustManager x509TrustManager, Method method) {
        this.f79811 = method;
        this.f79812 = x509TrustManager;
    }

    @Override // p067l.InterfaceC16949
    /* JADX INFO: renamed from: ֫ */
    public final X509Certificate mo17477(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f79811.invoke(this.f79812, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e) {
            throw C21407.m48486("unable to get issues and signature", (Exception) e);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24997)) {
            return false;
        }
        C24997 c24997 = (C24997) obj;
        return this.f79812.equals(c24997.f79812) && this.f79811.equals(c24997.f79811);
    }

    public final int hashCode() {
        return (this.f79811.hashCode() * 31) + this.f79812.hashCode();
    }
}
