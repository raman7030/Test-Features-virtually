package l;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: l.ۢܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9700 extends C18872 {
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Provider m24639() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final void mo8318(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C18872.m43579(list).toArray(new String[0]));
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ */
    public final String mo8319(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SSLContext mo24641() {
        try {
            return SSLContext.getInstance("TLSv1.3", m24639());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m24639());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9700 m24640() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C9700();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24642(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
