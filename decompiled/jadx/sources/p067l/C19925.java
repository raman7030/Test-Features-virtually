package p067l;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.ᩴۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19925 implements InterfaceC9934, InterfaceC4629, InterfaceC9208 {
    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ Class m45226() {
        return MethodHandle.class;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m45227(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    @Override // p067l.InterfaceC9208
    /* JADX INFO: renamed from: ֫ */
    public String mo21226(EnumC22620 enumC22620, String str, String str2) {
        return EnumC13232.m30292(enumC22620, str, str2);
    }

    @Override // p067l.InterfaceC4629
    /* JADX INFO: renamed from: ֫ */
    public List mo9751(String str, boolean z, boolean z2) {
        return C23404.m52069(str, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45229(ArrayList arrayList, int i) {
        arrayList.remove(arrayList.size() - i);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
