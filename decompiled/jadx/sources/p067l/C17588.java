package p067l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ܺܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17588 implements InterfaceC18263, InterfaceC9934, InterfaceC5011, InterfaceC15125 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52578;

    /* JADX INFO: renamed from: ֫ */
    public static String m40051(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40052(String str, IOException iOException) {
        return str + iOException;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40053(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m40055(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    @Override // p067l.InterfaceC18263
    public Object apply(Object obj) {
        switch (this.f52578) {
            case 4:
                return new C21549((InterfaceC17980) obj);
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC15125
    /* JADX INFO: renamed from: ֫ */
    public boolean mo23420(byte[] bArr) {
        return bArr.length == 14 && "resources.arsc".equals(new String(bArr, C9929.f27508));
    }

    @Override // p067l.InterfaceC5011
    /* JADX INFO: renamed from: ֫ */
    public Constructor mo10647() {
        return C19124.class.asSubclass(InterfaceC3669.class).getConstructor(null);
    }
}
