package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V79X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16477 {
    /* JADX INFO: renamed from: ֫ */
    public static void m37401(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) throws IOException {
        C14645 c14645M33467 = C14645.m33467(abstractC17043.m38664());
        int iM33494 = c14645M33467.m33494();
        ArrayList<C19160> arrayList = new ArrayList(iM33494);
        for (int i = 0; i < iM33494; i++) {
            int iM33469 = c14645M33467.m33469(i);
            arrayList.add(new C19160(null, iM33469, c14645M33467.m33483(i), m37400(c14645M33467.m33497(iM33469))));
        }
        abstractC17044.mo37342();
        DataOutputStream dataOutputStream = new DataOutputStream(abstractC17044.m38683());
        try {
            dataOutputStream.writeInt(1296323657);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(arrayList.size());
            for (C19160 c19160 : arrayList) {
                String str = c19160.f57226;
                int i2 = c19160.f57228;
                dataOutputStream.writeUTF(str);
                int i3 = c19160.f57225;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    throw new IOException("Invalid class def offset");
                }
                if (i2 != 0) {
                    dataOutputStream.writeInt(i3 | Integer.MIN_VALUE);
                    dataOutputStream.writeInt(i2);
                } else {
                    dataOutputStream.writeInt(i3);
                }
            }
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37400(String str) {
        return (str == null || str.length() < 2 || str.charAt(0) != 'L' || C9417.m21911(1, str) != ';') ? str : C17073.m38720(1, 1, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37402(String str) {
        return (str.startsWith("L") && str.endsWith(C0249l.f1196b)) ? str : C6988.m16053("L", str, C0249l.f1196b);
    }
}
