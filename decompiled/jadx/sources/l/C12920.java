package l;

import android.os.Build;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MF */
/* JADX INFO: loaded from: classes3.dex */
public final class C12920 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31426(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31428(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m31427(InterfaceC21449 interfaceC21449, String str, byte[] bArr, Map map) throws C6736 {
        Map map2;
        List list;
        C18832 c18832 = new C18832(interfaceC21449);
        C4515 c4515 = new C4515();
        c4515.m13287(str);
        c4515.m13283(map);
        c4515.m13285(2);
        c4515.m13284(bArr);
        c4515.m13279(1);
        C3104 c3104M13278 = c4515.m13278();
        int i = 0;
        int i2 = 0;
        C3104 c3104M13279 = c3104M13278;
        while (true) {
            try {
                C20038 c20038 = new C20038(c18832, c3104M13279);
                try {
                    try {
                        byte[] bArrM42796 = C18366.m42796(c20038);
                        C3603.m11024(c20038);
                        return bArrM42796;
                    } catch (C23770 e) {
                        int i3 = e.f76941;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.f76940) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        C4515 c4515M9467 = c3104M13279.m9467();
                        c4515M9467.m13287(str2);
                        c3104M13279 = c4515M9467.m13278();
                        C3603.m11024(c20038);
                    }
                } catch (Throwable th) {
                    C3603.m11024(c20038);
                    throw th;
                }
            } catch (Exception e2) {
                throw new C6736(c3104M13278, c18832.m43510(), c18832.mo5936(), c18832.m43508(), e2);
            }
        }
    }
}
