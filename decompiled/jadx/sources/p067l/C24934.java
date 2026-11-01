package p067l;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.᩻ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4EH */
/* JADX INFO: loaded from: classes.dex */
public final class C24934 {

    /* JADX INFO: renamed from: ܽ */
    public static final C24934 f79624 = new C18899().m43002();

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3539 f79625;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashSet f79626;

    public C24934(LinkedHashSet linkedHashSet, AbstractC3539 abstractC3539) {
        this.f79626 = linkedHashSet;
        this.f79625 = abstractC3539;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24934)) {
            return false;
        }
        C24934 c24934 = (C24934) obj;
        return C21407.m48499(this.f79625, c24934.f79625) && this.f79626.equals(c24934.f79626);
    }

    public final int hashCode() {
        AbstractC3539 abstractC3539 = this.f79625;
        return this.f79626.hashCode() + ((abstractC3539 != null ? abstractC3539.hashCode() : 0) * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54800(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f79626.iterator();
        if (!it.hasNext()) {
            if (list2.isEmpty()) {
                return;
            }
            AbstractC3539 abstractC3539 = this.f79625;
            if (abstractC3539 != null) {
                list = abstractC3539.mo4611(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.size() > 0) {
                    ((C16216) list2.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m54798(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C16216 c16216 = (C16216) list2.get(i3);
                sb.append("\n    ");
                sb.append(c16216);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        ((C16216) it.next()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24934 m54799(AbstractC3539 abstractC3539) {
        return C21407.m48499(this.f79625, abstractC3539) ? this : new C24934(this.f79626, abstractC3539);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54798(X509Certificate x509Certificate) {
        if (!C14110.m32033(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/".concat(C13598.m30946(x509Certificate.getPublicKey().getEncoded()).mo4708().mo4697());
    }
}
