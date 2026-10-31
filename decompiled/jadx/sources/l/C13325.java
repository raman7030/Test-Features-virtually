package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.۬᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13325 implements InterfaceC7961, InterfaceC21423, InterfaceC18303 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39889;

    public /* synthetic */ C13325(int i) {
        this.f39889 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m32307(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m32308(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m32309(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        return null;
    }

    @Override // l.InterfaceC18303
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC18303
    /* JADX INFO: renamed from: ۧ */
    public AbstractC16891 mo4620(int i) {
        return new C14824(i);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        switch (this.f39889) {
            case 4:
                interfaceC1131.getClass();
                break;
            default:
                interfaceC1131.getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m32306(InterfaceC14786 interfaceC14786) {
        return ((C7026) interfaceC14786).m18993(-1L, "exo_len");
    }
}
