package bin.p000mt.plugin.api.p002ui.builder;

import bin.p000mt.plugin.api.p002ui.PluginProgressBar;

/* JADX INFO: loaded from: classes.dex */
public interface PluginProgressBarBuilder extends PluginBaseViewBuilder {
    PluginProgressBarBuilder indeterminate(boolean z);

    PluginProgressBarBuilder maxProgress(int i);

    PluginProgressBarBuilder progress(int i);

    PluginProgressBarBuilder secondaryProgress(int i);

    PluginProgressBarBuilder style(PluginProgressBar.Style style);
}
