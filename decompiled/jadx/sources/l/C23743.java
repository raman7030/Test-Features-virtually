package l;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.᩻ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4EH */
/* JADX INFO: loaded from: classes.dex */
public final class C23743 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C23743 f76872 = new C17393().m40746();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC1232 f76873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f76874;

    public C23743(LinkedHashSet linkedHashSet, AbstractC1232 abstractC1232) {
        this.f76874 = linkedHashSet;
        this.f76873 = abstractC1232;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23743)) {
            return false;
        }
        C23743 c23743 = (C23743) obj;
        return C20032.m46183(this.f76873, c23743.f76873) && this.f76874.equals(c23743.f76874);
    }

    public final int hashCode() {
        AbstractC1232 abstractC1232 = this.f76873;
        return this.f76874.hashCode() + ((abstractC1232 != null ? abstractC1232.hashCode() : 0) * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52391(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f76874.iterator();
        if (!it.hasNext()) {
            if (list2.isEmpty()) {
                return;
            }
            AbstractC1232 abstractC1232 = this.f76873;
            if (abstractC1232 != null) {
                list = abstractC1232.mo2244(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.size() > 0) {
                    ((C14570) list2.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m52389(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C14570 c14570 = (C14570) list2.get(i3);
                sb.append("\n    ");
                sb.append(c14570);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        ((C14570) it.next()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23743 m52390(AbstractC1232 abstractC1232) {
        return C20032.m46183(this.f76873, abstractC1232) ? this : new C23743(this.f76874, abstractC1232);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52389(X509Certificate x509Certificate) {
        if (!C12354.m29972(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/".concat(C11816.m28897(x509Certificate.getPublicKey().getEncoded()).mo2337().mo2326());
    }
}
