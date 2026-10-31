package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ۘ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4153 implements InterfaceC11776, InterfaceC7961 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13559 = 2;

    public /* synthetic */ C4153() {
    }

    public /* synthetic */ C4153(C0425 c0425, C16134 c16134) {
    }

    public /* synthetic */ C4153(C0425 c0425, boolean z) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12551(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12552(AbstractC15440 abstractC15440, StringBuilder sb) {
        sb.append(abstractC15440.mo23554());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m12553(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f13559) {
            case 3:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    @Override // l.InterfaceC11776
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo12554(C3104 c3104) {
        String str = c3104.f9715;
        return str != null ? str : c3104.f9711.toString();
    }
}
