package l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩵۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19462 implements InterfaceC7961, InterfaceC23425 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44858(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12136 m44860(C3917 c3917, long j, String str, Object[] objArr) {
        c3917.mo9065(j, str, objArr);
        return new C12136();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44861(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC23425
    /* JADX INFO: renamed from: ֫ */
    public String mo10986(C3104 c3104) throws IOException {
        String str = c3104.f9715;
        if (str != null) {
            return str;
        }
        throw new IOException("HLS thumbnail cache key is missing");
    }
}
