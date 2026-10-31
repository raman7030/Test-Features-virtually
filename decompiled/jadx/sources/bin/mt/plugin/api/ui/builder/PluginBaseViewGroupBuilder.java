package bin.mt.plugin.api.ui.builder;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public interface PluginBaseViewGroupBuilder extends PluginBaseViewBuilder {
    PluginUIBuilder children(Consumer consumer);

    PluginUIBuilder childrenStyle(PluginUI.Style style);

    PluginUI.Style getChildrenStyle();
}
