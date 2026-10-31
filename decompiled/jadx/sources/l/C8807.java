package l;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.ui.menu.PluginMenuItem;
import bin.mt.plugin.api.ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۡۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8807 extends C23623 implements PluginSubMenu {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6690 f26831;

    public C8807(PluginContext pluginContext, String str, String str2, SubMenuC19703 subMenuC19703, InterfaceC12600 interfaceC12600) {
        super(pluginContext, subMenuC19703, interfaceC12600);
        this.f26831 = new C6690(pluginContext, str, str2, (InterfaceMenuItemC13827) subMenuC19703.getItem(), this);
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginSubMenu setIcon(Drawable drawable) {
        ((InterfaceSubMenuC7478) this.f76554).setIcon(drawable);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final PluginMenuItem getItem() {
        return this.f26831;
    }

    @Override // bin.mt.plugin.api.ui.menu.PluginSubMenu
    public final C6690 getItem() {
        return this.f26831;
    }
}
