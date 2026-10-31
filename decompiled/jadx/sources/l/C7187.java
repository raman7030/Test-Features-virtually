package l;

import android.content.DialogInterface;
import java.util.Comparator;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* JADX INFO: renamed from: l.۟ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7187 implements InterfaceC7961, InterfaceC16743 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19251(String str, ComponentCallbacksC9205 componentCallbacksC9205, String str2) {
        return str + componentCallbacksC9205 + str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0206 m19253(C19258 c19258, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        c19258.m44442(i, onClickListener);
        c19258.m44434(i2, onClickListener2);
        return c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19254(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    @Override // l.InterfaceC16743
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo19255(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m19252(InterfaceC1583 interfaceC1583, Comparator comparator) {
        return comparator instanceof InterfaceC1583 ? interfaceC1583.mo5428((InterfaceC1583) comparator) : C8200.$default$thenComparing(interfaceC1583, comparator);
    }
}
