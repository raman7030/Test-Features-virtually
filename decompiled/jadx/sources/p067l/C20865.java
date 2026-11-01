package p067l;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩵۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20865 implements InterfaceC9934, InterfaceC24631 {
    /* JADX INFO: renamed from: ֫ */
    public static String m47154(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13902 m47156(C6091 c6091, long j, String str, Object[] objArr) {
        c6091.mo11117(j, str, objArr);
        return new C13902();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47157(StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC24631
    /* JADX INFO: renamed from: ֫ */
    public String mo12962(C5318 c5318) throws IOException {
        String str = c5318.f12518;
        if (str != null) {
            return str;
        }
        throw new IOException("HLS thumbnail cache key is missing");
    }
}
