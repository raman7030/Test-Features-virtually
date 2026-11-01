package p067l;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: renamed from: l.᩶۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21545 implements InterfaceC9934, InterfaceC8156, InterfaceC10740, InterfaceC22729, InterfaceC14905 {
    /* JADX INFO: renamed from: ֫ */
    public static String m48728(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48729(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // p067l.InterfaceC22729
    public Object apply(Object obj) {
        int i = ActivityC18686.f55776;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC10740
    /* JADX INFO: renamed from: ֫ */
    public String mo24739(String str) {
        try {
            InterfaceC6694[] interfaceC6694ArrM25709 = ((RunnableC11152) C18959.m43083().mo29601()).m25709(str);
            return interfaceC6694ArrM25709.length > 0 ? interfaceC6694ArrM25709[0].mo3411() : str;
        } catch (IOException unused) {
            return str;
        }
    }

    @Override // p067l.InterfaceC14905
    /* JADX INFO: renamed from: ֫ */
    public Object mo25191(int i, int i2, byte[] bArr) {
        byte[] bArrM45083 = C19839.m45083(i, i2, bArr);
        return C14514.m33173(0, bArrM45083.length, bArrM45083);
    }
}
