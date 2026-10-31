package l;

import android.view.MenuItem;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11935 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35684;

    public /* synthetic */ C11935(int i) {
        this.f35684 = i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f35684) {
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
                InterfaceMenuItemC13827 interfaceMenuItemC13827 = (InterfaceMenuItemC13827) menuItem;
                if (!interfaceMenuItemC13827.mo16457()) {
                    InterfaceMenuItemC13827 interfaceMenuItemC13828 = (InterfaceMenuItemC13827) menuItem2;
                    if (interfaceMenuItemC13828.mo16457()) {
                        return 1;
                    }
                    if (interfaceMenuItemC13827.mo16461()) {
                        return 1 ^ (interfaceMenuItemC13828.mo16461() ? 1 : 0);
                    }
                    if (!interfaceMenuItemC13828.mo16461()) {
                        return menuItem.getOrder() - menuItem2.getOrder();
                    }
                } else if (((InterfaceMenuItemC13827) menuItem2).mo16457()) {
                    return 0;
                }
                return -1;
            default:
                return ((C0717) obj).f2703.compareTo(((C0717) obj2).f2703);
        }
    }
}
