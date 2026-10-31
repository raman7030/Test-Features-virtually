package l;

import android.os.Build;
import android.view.Menu;

/* JADX INFO: renamed from: l.᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q34F */
/* JADX INFO: loaded from: classes.dex */
public final class C22090 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49677(Menu menu) {
        if (menu instanceof InterfaceMenuC23000) {
            ((InterfaceMenuC23000) menu).setGroupDividerEnabled(true);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C21385.m48472(menu, true);
        }
    }
}
