package p067l;

import android.content.DialogInterface;
import android.net.Uri;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22290 {

    /* JADX INFO: renamed from: ֫ */
    public static C6376 f70417;

    /* JADX INFO: renamed from: ֫ */
    public static void m50109(Main main, String str) {
        C6376 c6376M47753;
        if (C11561.m26617() && (c6376M47753 = C21129.m47753(str)) != null && C11561.m26615(c6376M47753) == null) {
            f70417 = c6376M47753;
            m50112((InterfaceC14936) main, c6376M47753.f16501);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50112(InterfaceC14936 interfaceC14936, String str) {
        C20671 c20671BuildDialog = interfaceC14936.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(C7050.m16203(R.string.MT_Protector, f70417.f16499));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC14168(2, str, interfaceC14936));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50111(InterfaceC14936 interfaceC14936, Uri uri) {
        C11561.f32223.clear();
        C6376 c6376 = f70417;
        if (c6376 == null) {
            return;
        }
        String str = c6376.f16501;
        String strM37022 = C16253.m37022(uri);
        boolean zEquals = false;
        if (str.equals(strM37022) && uri.getPathSegments().size() == 2) {
            zEquals = uri.getPathSegments().get(1).equals(strM37022 + ":");
        }
        if (zEquals) {
            try {
                C7050.m16233().takePersistableUriPermission(uri, 3);
                C11561.f32224.put(f70417.f16500.getPath(), C16253.m37020(uri));
                return;
            } catch (Throwable th) {
                interfaceC14936.mo12258(th);
                return;
            }
        }
        String path = uri.getPath();
        C12826.requireNonNull(path);
        int i = path.endsWith(":") ? R.string.MT_Protector : R.string.MT_Protector;
        C20671 c20671BuildDialog = interfaceC14936.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(i);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12157(interfaceC14936, 1));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
