package p067l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩸ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22934 implements InterfaceC9934, InterfaceC24274 {
    /* JADX INFO: renamed from: ֫ */
    public static int m51252(int i, int i2, int i3, int i4) {
        return (i3 - (i * i2)) * i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51253(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51254(EnumC16818 enumC16818, StringBuilder sb, String str) {
        sb.append(enumC16818.m38127());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51255(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    @Override // p067l.InterfaceC24274
    /* JADX INFO: renamed from: ֫ */
    public int mo4456(String str, boolean z) {
        return z ? 2 : 1;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
