package p067l;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.֡ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64DG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2868 extends AbstractC3539 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16949 f4959;

    public C2868(InterfaceC16949 interfaceC16949) {
        this.f4959 = interfaceC16949;
    }

    @Override // p067l.AbstractC3539
    /* JADX INFO: renamed from: ֫ */
    public final List mo4611(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) C20013.m45383(arrayList, 1);
            X509Certificate x509CertificateMo17477 = this.f4959.mo17477(x509Certificate);
            if (x509CertificateMo17477 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo17477)) {
                    arrayList.add(x509CertificateMo17477);
                }
                if (x509CertificateMo17477.getIssuerDN().equals(x509CertificateMo17477.getSubjectDN())) {
                    try {
                        x509CertificateMo17477.verify(x509CertificateMo17477.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f4959.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2868) && ((C2868) obj).f4959.equals(this.f4959);
    }
}
