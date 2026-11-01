package p067l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۬᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15033 implements InterfaceC9934, InterfaceC22729, InterfaceC19764 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f42955;

    public /* synthetic */ C15033(int i) {
        this.f42955 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m34407(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m34408(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m34409(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        return null;
    }

    @Override // p067l.InterfaceC19764
    public /* synthetic */ void cancel() {
    }

    @Override // p067l.InterfaceC19764
    /* JADX INFO: renamed from: ۧ */
    public AbstractC18422 mo6852(int i) {
        return new C16458(i);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f42955) {
            case 4:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m34406(InterfaceC16421 interfaceC16421) {
        return ((C9046) interfaceC16421).m20950(-1L, "exo_len");
    }
}
