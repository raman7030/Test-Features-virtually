package l;

import android.widget.ProgressBar;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ܶۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57P8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15072 extends C7312 implements PluginProgressBar {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final PluginProgressBar.Style f46049;

    public C15072(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginProgressBar.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f46049 = style;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final PluginProgressBar.Style getStyle() {
        return this.f46049;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getProgress() {
        return ((ProgressBar) this.f22448).getProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getSecondaryProgress() {
        return ((ProgressBar) this.f22448).getSecondaryProgress();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final int getMaxProgress() {
        return ((ProgressBar) this.f22448).getMax();
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final boolean isIndeterminate() {
        if (this.f46049 == PluginProgressBar.Style.HORIZONTAL) {
            return ((ProgressBar) this.f22448).isIndeterminate();
        }
        return true;
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setIndeterminate(boolean z) {
        if (C10975.m27285()) {
            if (this.f46049 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f22448).setIndeterminate(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setMaxProgress(int i) {
        if (C10975.m27285()) {
            if (this.f46049 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f22448).setMax(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setProgress(int i) {
        if (C10975.m27285()) {
            if (this.f46049 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f22448).setProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginProgressBar
    public final void setSecondaryProgress(int i) {
        if (C10975.m27285()) {
            if (this.f46049 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f22448).setSecondaryProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
