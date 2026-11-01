package p067l;

import android.content.DialogInterface;
import java.util.Comparator;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* JADX INFO: renamed from: l.۟ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9199 implements InterfaceC9934, InterfaceC18281 {
    /* JADX INFO: renamed from: ֫ */
    public static String m21198(String str, ComponentCallbacksC11117 componentCallbacksC11117, String str2) {
        return str + componentCallbacksC11117 + str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static DialogInterfaceC2564 m21200(C20671 c20671, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        c20671.m46736(i, onClickListener);
        c20671.m46728(i2, onClickListener2);
        return c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21201(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SPHINCSPlusKeyFactorySpi());
    }

    @Override // p067l.InterfaceC18281
    /* JADX INFO: renamed from: ֫ */
    public boolean mo21202(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Comparator m21199(InterfaceC3873 interfaceC3873, Comparator comparator) {
        return comparator instanceof InterfaceC3873 ? interfaceC3873.mo7657((InterfaceC3873) comparator) : C10162.$default$thenComparing(interfaceC3873, comparator);
    }
}
