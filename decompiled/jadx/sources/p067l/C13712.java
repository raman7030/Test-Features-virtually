package p067l;

import android.view.MenuItem;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13712 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f38693;

    public /* synthetic */ C13712(int i) {
        this.f38693 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f38693) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                MenuItem menuItem2 = (MenuItem) obj2;
                if (menuItem.getItemId() == 16908353) {
                    if (menuItem2.getItemId() == 16908353) {
                        return 0;
                    }
                    return -1;
                }
                if (menuItem2.getItemId() == 16908353) {
                    return 1;
                }
                InterfaceMenuItemC1528 interfaceMenuItemC1528 = (InterfaceMenuItemC1528) menuItem;
                if (!interfaceMenuItemC1528.mo18383()) {
                    InterfaceMenuItemC1528 interfaceMenuItemC1529 = (InterfaceMenuItemC1528) menuItem2;
                    if (interfaceMenuItemC1529.mo18383()) {
                        return 1;
                    }
                    if (interfaceMenuItemC1528.mo18387()) {
                        return 1 ^ (interfaceMenuItemC1529.mo18387() ? 1 : 0);
                    }
                    if (!interfaceMenuItemC1529.mo18387()) {
                        return menuItem.getOrder() - menuItem2.getOrder();
                    }
                } else if (((InterfaceMenuItemC1528) menuItem2).mo18383()) {
                    return 0;
                }
                return -1;
            default:
                return ((C3050) obj).f5475.compareTo(((C3050) obj2).f5475);
        }
    }
}
