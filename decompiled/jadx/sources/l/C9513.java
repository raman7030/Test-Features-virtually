package l;

import android.content.Context;
import android.view.MenuItem;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.menu.PluginMenu;
import bin.mt.plugin.api.ui.menu.PluginPopupMenu;

/* JADX INFO: renamed from: l.ۢۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A7I8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9513 implements PluginPopupMenu {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23623 f28884;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21282 f28885;

    public C9513(PluginContext pluginContext, Context context, PluginView pluginView) {
        C21282 c21282 = new C21282(context, ((C7312) pluginView).m19595(), 0);
        this.f28885 = c21282;
        this.f28884 = new C23623(pluginContext, c21282.m48304(), new C8367());
        c21282.m48306();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final PluginMenu getMenu() {
        return this.f28884;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setGravity(int i) {
        this.f28885.m48300(i);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final int getGravity() {
        return this.f28885.m48303();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void show() {
        this.f28885.m48305();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void dismiss() {
        this.f28885.m48299();
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnMenuItemClickListener(PluginMenu.OnMenuItemClickListener onMenuItemClickListener) {
        C21282 c21282 = this.f28885;
        if (onMenuItemClickListener == null) {
            c21282.m48302((InterfaceC14930) null);
        } else {
            c21282.m48302(new C18657(this, onMenuItemClickListener));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m24374(C9513 c9513, PluginMenu.OnMenuItemClickListener onMenuItemClickListener, MenuItem menuItem) {
        C6690 c6690M52112 = c9513.f28884.m52112(menuItem.getItemId());
        if (c6690M52112 != null) {
            return onMenuItemClickListener.onMenuItemClick(c6690M52112);
        }
        return false;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginPopupMenu
    public final void setOnDismissListener(final PluginPopupMenu.OnDismissListener onDismissListener) {
        C21282 c21282 = this.f28885;
        if (onDismissListener == null) {
            c21282.m48301((InterfaceC7875) null);
        } else {
            c21282.m48301(new InterfaceC7875() { // from class: l.᩷ۢ᩷
                @Override // l.InterfaceC7875
                /* JADX INFO: renamed from: ֫ */
                public final void mo6265(C21282 c21283) {
                    C9513 c9513 = this.f67341;
                    c9513.getClass();
                    onDismissListener.onDismiss(c9513);
                }
            });
        }
    }
}
