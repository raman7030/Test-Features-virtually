package p067l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5664 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f13782 = true;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12613() {
        return f13782;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12611(AbstractActivityC5549 abstractActivityC5549) {
        if (f13782) {
            f13782 = false;
            m12612(abstractActivityC5549, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12612(AbstractActivityC5549 abstractActivityC5549, boolean z) {
        int i = 0;
        if (ApplicationC21448.f67649.getBoolean("igiap", false)) {
            return;
        }
        Iterator<PackageInfo> it = abstractActivityC5549.getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            if ((it.next().applicationInfo.flags & 129) == 0) {
                i++;
            }
        }
        if (i <= 1 && C0886.m5543(abstractActivityC5549.getApplicationContext(), "com.android.permission.GET_INSTALLED_APPS") != 0) {
            if (!z) {
                C1786.m46159(abstractActivityC5549, new String[]{"com.android.permission.GET_INSTALLED_APPS"}, 23680);
                return;
            }
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22354(1, abstractActivityC5549));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7005());
            c20671BuildDialog.m46732();
        }
    }
}
