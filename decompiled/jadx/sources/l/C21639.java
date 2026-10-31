package l;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩸ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21639 implements InterfaceC7961, InterfaceC23049 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48904(int i, int i2, int i3, int i4) {
        return (i3 - (i * i2)) * i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48905(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48906(EnumC15204 enumC15204, StringBuilder sb, String str) {
        sb.append(enumC15204.m35967());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48907(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + aSN1ObjectIdentifier;
    }

    @Override // l.InterfaceC23049
    /* JADX INFO: renamed from: ֫ */
    public int mo2075(String str, boolean z) {
        return z ? 2 : 1;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
