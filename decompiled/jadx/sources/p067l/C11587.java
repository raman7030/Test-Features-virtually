package p067l;

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
public final class C11587 extends C20304 {
    /* JADX INFO: renamed from: ܿ */
    public static Provider m26653() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo10362(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C20304.m45845(list).toArray(new String[0]));
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public final String mo10363(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final SSLContext mo26655() {
        try {
            return SSLContext.getInstance("TLSv1.3", m26653());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m26653());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C11587 m26654() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C11587();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo26656(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
