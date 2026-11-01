package p067l;

import android.os.Build;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MF */
/* JADX INFO: loaded from: classes3.dex */
public final class C14647 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m33512(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m33514(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m33513(InterfaceC22753 interfaceC22753, String str, byte[] bArr, Map map) throws C8770 {
        Map map2;
        List list;
        C20266 c20266 = new C20266(interfaceC22753);
        C6659 c6659 = new C6659();
        c6659.m15170(str);
        c6659.m15166(map);
        c6659.m15168(2);
        c6659.m15167(bArr);
        c6659.m15162(1);
        C5318 c5318M15161 = c6659.m15161();
        int i = 0;
        int i2 = 0;
        C5318 c5318M15162 = c5318M15161;
        while (true) {
            try {
                C21412 c21412 = new C21412(c20266, c5318M15162);
                try {
                    try {
                        byte[] bArrM45068 = C19824.m45068(c21412);
                        C5792.m13000(c21412);
                        return bArrM45068;
                    } catch (C24959 e) {
                        int i3 = e.f79694;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.f79693) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        C6659 c6659M11510 = c5318M15162.m11510();
                        c6659M11510.m15170(str2);
                        c5318M15162 = c6659M11510.m15161();
                        C5792.m13000(c21412);
                    }
                } catch (Throwable th) {
                    C5792.m13000(c21412);
                    throw th;
                }
            } catch (Exception e2) {
                throw new C8770(c5318M15161, c20266.m45776(), c20266.mo8131(), c20266.m45774(), e2);
            }
        }
    }
}
