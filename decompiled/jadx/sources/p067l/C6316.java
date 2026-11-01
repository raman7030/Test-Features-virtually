package p067l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۘ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6316 implements InterfaceC13560, InterfaceC9934 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16373 = 2;

    public /* synthetic */ C6316() {
    }

    public /* synthetic */ C6316(C2772 c2772, C17702 c17702) {
    }

    public /* synthetic */ C6316(C2772 c2772, boolean z) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14441(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m14442(AbstractC17043 abstractC17043, StringBuilder sb) {
        sb.append(abstractC17043.mo25505());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m14443(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f16373) {
            case 3:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    @Override // p067l.InterfaceC13560
    /* JADX INFO: renamed from: ֫ */
    public String mo14444(C5318 c5318) {
        String str = c5318.f12518;
        return str != null ? str : c5318.f12514.toString();
    }
}
