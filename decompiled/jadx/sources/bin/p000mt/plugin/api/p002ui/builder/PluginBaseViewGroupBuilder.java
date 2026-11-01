package bin.p000mt.plugin.api.p002ui.builder;

import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public interface PluginBaseViewGroupBuilder extends PluginBaseViewBuilder {
    PluginUIBuilder children(Consumer consumer);

    PluginUIBuilder childrenStyle(PluginUI.Style style);

    PluginUI.Style getChildrenStyle();
}
