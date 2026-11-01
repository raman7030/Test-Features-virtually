package p067l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩻ */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C1158 implements InterfaceC1088 {

    /* JADX INFO: renamed from: ۧ */
    public final Context f22615;

    /* JADX INFO: renamed from: ᩳ */
    public final ActionMode.Callback f22617;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f22614 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final C1012 f22616 = new C1012();

    public C1158(Context context, ActionMode.Callback callback) {
        this.f22615 = context;
        this.f22617 = callback;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19646(AbstractC1018 abstractC1018, Menu menu) {
        C1438 c1438M19645 = m19645(abstractC1018);
        C1012 c1012 = this.f22616;
        Menu menuC1889 = (Menu) c1012.getOrDefault(menu, null);
        if (menuC1889 == null) {
            menuC1889 = new MenuC1889(this.f22615, (InterfaceMenuC1983) menu);
            c1012.put(menu, menuC1889);
        }
        return this.f22617.onCreateActionMode(c1438M19645, menuC1889);
    }

    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16328(AbstractC1018 abstractC1018, Menu menu) {
        C1438 c1438M19645 = m19645(abstractC1018);
        C1012 c1012 = this.f22616;
        Menu menuC1889 = (Menu) c1012.getOrDefault(menu, null);
        if (menuC1889 == null) {
            menuC1889 = new MenuC1889(this.f22615, (InterfaceMenuC1983) menu);
            c1012.put(menu, menuC1889);
        }
        return this.f22617.onPrepareActionMode(c1438M19645, menuC1889);
    }

    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16329(AbstractC1018 abstractC1018, MenuItem menuItem) {
        return this.f22617.onActionItemClicked(m19645(abstractC1018), new MenuItemC0944(this.f22615, (InterfaceMenuItemC1528) menuItem));
    }

    @Override // p067l.InterfaceC1088
    /* JADX INFO: renamed from: ֫ */
    public final void mo16327(AbstractC1018 abstractC1018) {
        this.f22617.onDestroyActionMode(m19645(abstractC1018));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1438 m19645(AbstractC1018 abstractC1018) {
        ArrayList arrayList = this.f22614;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1438 c1438 = (C1438) arrayList.get(i);
            if (c1438 != null && c1438.f38989 == abstractC1018) {
                return c1438;
            }
        }
        C1438 c1439 = new C1438(this.f22615, abstractC1018);
        arrayList.add(c1439);
        return c1439;
    }
}
