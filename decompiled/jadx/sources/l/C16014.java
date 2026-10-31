package l;

import java.io.IOException;
import java.lang.reflect.Constructor;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ܺܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16014 implements InterfaceC16724, InterfaceC7961, InterfaceC2780, InterfaceC13422 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49415;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37865(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37866(String str, IOException iOException) {
        return str + iOException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37867(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37869(ASN1Sequence aSN1Sequence, int i) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i)).getOctets());
    }

    @Override // l.InterfaceC16724
    public Object apply(Object obj) {
        switch (this.f49415) {
            case 4:
                return new C20182((InterfaceC16427) obj);
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC13422
    /* JADX INFO: renamed from: ֫ */
    public boolean mo21452(byte[] bArr) {
        return bArr.length == 14 && "resources.arsc".equals(new String(bArr, C7955.f24594));
    }

    @Override // l.InterfaceC2780
    /* JADX INFO: renamed from: ֫ */
    public Constructor mo8584() {
        return C17630.class.asSubclass(InterfaceC1368.class).getConstructor(null);
    }
}
