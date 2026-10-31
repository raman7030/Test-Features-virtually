package l;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩴۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18473 implements InterfaceC7961, InterfaceC2379, InterfaceC7197 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m42950() {
        return MethodHandle.class;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m42951(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    @Override // l.InterfaceC7197
    /* JADX INFO: renamed from: ֫ */
    public String mo19279(EnumC21309 enumC21309, String str, String str2) {
        return EnumC11431.m28248(enumC21309, str, str2);
    }

    @Override // l.InterfaceC2379
    /* JADX INFO: renamed from: ֫ */
    public List mo7690(String str, boolean z, boolean z2) {
        return C22134.m49731(str, z, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42953(ArrayList arrayList, int i) {
        arrayList.remove(arrayList.size() - i);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
