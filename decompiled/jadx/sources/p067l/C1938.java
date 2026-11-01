package p067l;

import android.os.Build;
import android.view.Menu;

/* JADX INFO: renamed from: l.᩹ۛ */
/* JADX INFO: compiled from: Q34F */
/* JADX INFO: loaded from: classes.dex */
public final class C1938 {
    /* JADX INFO: renamed from: ֫ */
    public static void m52015(Menu menu) {
        if (menu instanceof InterfaceMenuC1983) {
            ((InterfaceMenuC1983) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C1903.m50808(menu, true);
        }
    }
}
