package p067l;

import android.graphics.drawable.Drawable;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.p002ui.menu.PluginMenuItem;
import bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu;

/* JADX INFO: renamed from: l.ۡۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 37IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10739 extends C24820 implements PluginSubMenu {

    /* JADX INFO: renamed from: ܿ */
    public C8727 f29756;

    public C10739(PluginContext pluginContext, String str, String str2, SubMenuC1819 subMenuC1819, InterfaceC14344 interfaceC14344) {
        super(pluginContext, subMenuC1819, interfaceC14344);
        this.f29756 = new C8727(pluginContext, str, str2, (InterfaceMenuItemC1528) subMenuC1819.getItem(), this);
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu
    public final PluginSubMenu setIcon(Drawable drawable) {
        ((InterfaceSubMenuC1213) this.f79298).setIcon(drawable);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu
    public final PluginMenuItem getItem() {
        return this.f29756;
    }

    @Override // bin.p000mt.plugin.api.p002ui.menu.PluginSubMenu
    public final C8727 getItem() {
        return this.f29756;
    }
}
