package l;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: renamed from: l.᩶۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20177 implements InterfaceC7961, InterfaceC6090, InterfaceC8808, InterfaceC21423, InterfaceC13191 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46409(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46410(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // l.InterfaceC21423
    public Object apply(Object obj) {
        int i = ActivityC17169.f52595;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC8808
    /* JADX INFO: renamed from: ֫ */
    public String mo22769(String str) {
        try {
            InterfaceC4551[] interfaceC4551ArrM23709 = ((RunnableC9242) C17456.m40825().mo27539()).m23709(str);
            return interfaceC4551ArrM23709.length > 0 ? interfaceC4551ArrM23709[0].mo1015() : str;
        } catch (IOException unused) {
            return str;
        }
    }

    @Override // l.InterfaceC13191
    /* JADX INFO: renamed from: ֫ */
    public Object mo23247(int i, int i2, byte[] bArr) {
        byte[] bArrM42811 = C18382.m42811(i, i2, bArr);
        return C12780.m31089(0, bArrM42811.length, bArrM42811);
    }
}
