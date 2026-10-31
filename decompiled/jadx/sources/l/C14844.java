package l;

import com.alipay.sdk.m.y.l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V79X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14844 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35245(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) throws IOException {
        C12918 c12918M31381 = C12918.m31381(abstractC15440.m36506());
        int iM31408 = c12918M31381.m31408();
        ArrayList<C17667> arrayList = new ArrayList(iM31408);
        for (int i = 0; i < iM31408; i++) {
            int iM31383 = c12918M31381.m31383(i);
            arrayList.add(new C17667(null, iM31383, c12918M31381.m31397(i), m35244(c12918M31381.m31411(iM31383))));
        }
        abstractC15441.mo35195();
        DataOutputStream dataOutputStream = new DataOutputStream(abstractC15441.m36525());
        try {
            dataOutputStream.writeInt(1296323657);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(arrayList.size());
            for (C17667 c17667 : arrayList) {
                String str = c17667.f54033;
                int i2 = c17667.f54035;
                dataOutputStream.writeUTF(str);
                int i3 = c17667.f54032;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35244(String str) {
        return (str == null || str.length() < 2 || str.charAt(0) != 'L' || C7416.m19937(1, str) != ';') ? str : C15472.m36561(1, 1, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35246(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str : C4860.m14172("L", str, l.b);
    }
}
