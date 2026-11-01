package p067l;

import android.content.Context;
import android.view.MenuItem;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.menu.PluginMenu;
import bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu;

/* JADX INFO: renamed from: l.ۢۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A7I8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11410 implements PluginPopupMenu {

    /* JADX INFO: renamed from: ֫ */
    public final C24820 f31831;

    /* JADX INFO: renamed from: ۧ */
    public final C1898 f31832;

    public C11410(PluginContext pluginContext, Context context, PluginView pluginView) {
        C1898 c1898 = new C1898(context, ((C9318) pluginView).m21563(), 0);
        this.f31832 = c1898;
        this.f31831 = new C24820(pluginContext, c1898.m50638(), new C10321());
        c1898.m50640();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final PluginMenu getMenu() {
        return this.f31831;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final void setGravity(int i) {
        this.f31832.m50634(i);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final int getGravity() {
        return this.f31832.m50637();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final void show() {
        this.f31832.m50639();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final void dismiss() {
        this.f31832.m50633();
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final void setOnMenuItemClickListener(PluginMenu.OnMenuItemClickListener onMenuItemClickListener) {
        C1898 c1898 = this.f31832;
        if (onMenuItemClickListener == null) {
            c1898.m50636((InterfaceC1583) null);
        } else {
            c1898.m50636(new C20100(this, onMenuItemClickListener));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m26384(C11410 c11410, PluginMenu.OnMenuItemClickListener onMenuItemClickListener, MenuItem menuItem) {
        C8727 c8727M54515 = c11410.f31831.m54515(menuItem.getItemId());
        if (c8727M54515 != null) {
            return onMenuItemClickListener.onMenuItemClick(c8727M54515);
        }
        return false;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginPopupMenu
    public final void setOnDismissListener(final PluginPopupMenu.OnDismissListener onDismissListener) {
        C1898 c1898 = this.f31832;
        if (onDismissListener == null) {
            c1898.m50635((InterfaceC1233) null);
        } else {
            c1898.m50635(new InterfaceC1233() { // from class: l.᩷ۢ᩷
                @Override // p067l.InterfaceC1233
                /* JADX INFO: renamed from: ֫ */
                public final void mo8467(C1898 c1899) {
                    C11410 c11410 = this.f70024;
                    c11410.getClass();
                    onDismissListener.onDismiss(c11410);
                }
            });
        }
    }
}
