package l;

import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ܿۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 47RN */
/* JADX INFO: loaded from: classes5.dex */
public class C17190 extends C10135 implements PluginButton {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final PluginButton.Style f52709;

    @Override // bin.mt.plugin.api.ui.PluginButton
    public final PluginButton.Style getStyle() {
        return this.f52709;
    }

    public C17190(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginButton.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f52709 = style;
    }
}
