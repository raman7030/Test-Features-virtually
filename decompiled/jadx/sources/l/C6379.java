package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 355C */
/* JADX INFO: loaded from: classes3.dex */
public final class C6379 implements InterfaceC4968 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f19742;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ActionMode.Callback f19744;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f19741 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3432 f19743 = new C3432();

    public C6379(Context context, ActionMode.Callback callback) {
        this.f19742 = context;
        this.f19744 = callback;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17699(AbstractC3557 abstractC3557, Menu menu) {
        C12024 c12024M17698 = m17698(abstractC3557);
        C3432 c3432 = this.f19743;
        Menu menuC21114 = (Menu) c3432.getOrDefault(menu, null);
        if (menuC21114 == null) {
            menuC21114 = new MenuC21114(this.f19742, (InterfaceMenuC23000) menu);
            c3432.put(menu, menuC21114);
        }
        return this.f19744.onCreateActionMode(c12024M17698, menuC21114);
    }

    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14424(AbstractC3557 abstractC3557, Menu menu) {
        C12024 c12024M17698 = m17698(abstractC3557);
        C3432 c3432 = this.f19743;
        Menu menuC21114 = (Menu) c3432.getOrDefault(menu, null);
        if (menuC21114 == null) {
            menuC21114 = new MenuC21114(this.f19742, (InterfaceMenuC23000) menu);
            c3432.put(menu, menuC21114);
        }
        return this.f19744.onPrepareActionMode(c12024M17698, menuC21114);
    }

    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14425(AbstractC3557 abstractC3557, MenuItem menuItem) {
        return this.f19744.onActionItemClicked(m17698(abstractC3557), new MenuItemC2063(this.f19742, (InterfaceMenuItemC13827) menuItem));
    }

    @Override // l.InterfaceC4968
    /* JADX INFO: renamed from: ֫ */
    public final void mo14423(AbstractC3557 abstractC3557) {
        this.f19744.onDestroyActionMode(m17698(abstractC3557));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12024 m17698(AbstractC3557 abstractC3557) {
        ArrayList arrayList = this.f19741;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12024 c12024 = (C12024) arrayList.get(i);
            if (c12024 != null && c12024.f35978 == abstractC3557) {
                return c12024;
            }
        }
        C12024 c12025 = new C12024(this.f19742, abstractC3557);
        arrayList.add(c12025);
        return c12025;
    }
}
