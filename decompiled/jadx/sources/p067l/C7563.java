package p067l;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: l.ۚܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 14EX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7563 implements InterfaceC16949 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f19837 = new LinkedHashMap();

    public C7563(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set linkedHashSet = (Set) this.f19837.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet(1);
                this.f19837.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // p067l.InterfaceC16949
    /* JADX INFO: renamed from: ֫ */
    public final X509Certificate mo17477(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f19837.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7563) && ((C7563) obj).f19837.equals(this.f19837);
    }

    public final int hashCode() {
        return this.f19837.hashCode();
    }
}
