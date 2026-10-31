package l;

import android.content.DialogInterface;
import android.net.Uri;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4216 f67732;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47779(Main main, String str) {
        C4216 c4216M45449;
        if (C9672.m24603() && (c4216M45449 = C19739.m45449(str)) != null && C9672.m24601(c4216M45449) == null) {
            f67732 = c4216M45449;
            m47782((InterfaceC13223) main, c4216M45449.f13688);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47782(InterfaceC13223 interfaceC13223, String str) {
        C19258 c19258BuildDialog = interfaceC13223.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(C4925.m14306(R.string.MT_Protector, f67732.f13686));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12415(2, str, interfaceC13223));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47781(InterfaceC13223 interfaceC13223, Uri uri) {
        C9672.f29274.clear();
        C4216 c4216 = f67732;
        if (c4216 == null) {
            return;
        }
        String str = c4216.f13688;
        String strM34871 = C14609.m34871(uri);
        boolean zEquals = false;
        if (str.equals(strM34871) && uri.getPathSegments().size() == 2) {
            zEquals = uri.getPathSegments().get(1).equals(strM34871 + ":");
        }
        if (zEquals) {
            try {
                C4925.m14336().takePersistableUriPermission(uri, 3);
                C9672.f29275.put(f67732.f13687.getPath(), C14609.m34869(uri));
                return;
            } catch (Throwable th) {
                interfaceC13223.mo10222(th);
                return;
            }
        }
        String path = uri.getPath();
        C11003.requireNonNull(path);
        int i = path.endsWith(":") ? R.string.MT_Protector : R.string.MT_Protector;
        C19258 c19258BuildDialog = interfaceC13223.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(i);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10299(interfaceC13223, 1));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
