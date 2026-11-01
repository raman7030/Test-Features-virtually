package p067l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: l.۬ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4CZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14875 {

    /* JADX INFO: renamed from: ֫ */
    public final C22253 f42407;

    /* JADX INFO: renamed from: ۧ */
    public final List f42408;

    /* JADX INFO: renamed from: ܽ */
    public final List f42409;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC3301 f42410;

    public C14875(EnumC3301 enumC3301, C22253 c22253, List list, List list2) {
        this.f42410 = enumC3301;
        this.f42407 = c22253;
        this.f42409 = list;
        this.f42408 = list2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14875 m33982(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        List listM48492;
        List listM48493;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C22253 c22253M50079 = C22253.m50079(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC3301 enumC3301M5749 = EnumC3301.m5749(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        if (peerCertificates != null) {
            listM48492 = C21407.m48492(peerCertificates);
        } else {
            listM48492 = Collections.EMPTY_LIST;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM48493 = C21407.m48492(localCertificates);
        } else {
            listM48493 = Collections.EMPTY_LIST;
        }
        return new C14875(enumC3301M5749, c22253M50079, listM48492, listM48493);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14875 m33983(EnumC3301 enumC3301, C22253 c22253, List list, List list2) {
        if (enumC3301 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        return new C14875(enumC3301, c22253, C21407.m48491(list), C21407.m48491(list2));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC3301 m33987() {
        return this.f42410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22253 m33984() {
        return this.f42407;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m33986() {
        return this.f42409;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m33985() {
        return this.f42408;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14875)) {
            return false;
        }
        C14875 c14875 = (C14875) obj;
        return this.f42410.equals(c14875.f42410) && this.f42407.equals(c14875.f42407) && this.f42409.equals(c14875.f42409) && this.f42408.equals(c14875.f42408);
    }

    public final int hashCode() {
        return this.f42408.hashCode() + ((this.f42409.hashCode() + ((this.f42407.hashCode() + ((this.f42410.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
