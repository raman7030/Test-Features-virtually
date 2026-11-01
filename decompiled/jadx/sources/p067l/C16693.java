package p067l;

import android.widget.ProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ܶۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 57P8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16693 extends C9318 implements PluginProgressBar {

    /* JADX INFO: renamed from: ܳ */
    public final PluginProgressBar.Style f49167;

    public C16693(PluginUI pluginUI, PluginViewGroup pluginViewGroup, PluginProgressBar.Style style) {
        super(pluginUI, pluginViewGroup);
        this.f49167 = style;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final PluginProgressBar.Style getStyle() {
        return this.f49167;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final int getProgress() {
        return ((ProgressBar) this.f25339).getProgress();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final int getSecondaryProgress() {
        return ((ProgressBar) this.f25339).getSecondaryProgress();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final int getMaxProgress() {
        return ((ProgressBar) this.f25339).getMax();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final boolean isIndeterminate() {
        if (this.f49167 == PluginProgressBar.Style.HORIZONTAL) {
            return ((ProgressBar) this.f25339).isIndeterminate();
        }
        return true;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final void setIndeterminate(boolean z) {
        if (C12799.m29347()) {
            if (this.f49167 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f25339).setIndeterminate(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final void setMaxProgress(int i) {
        if (C12799.m29347()) {
            if (this.f49167 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f25339).setMax(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final void setProgress(int i) {
        if (C12799.m29347()) {
            if (this.f49167 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f25339).setProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginProgressBar
    public final void setSecondaryProgress(int i) {
        if (C12799.m29347()) {
            if (this.f49167 == PluginProgressBar.Style.HORIZONTAL) {
                ((ProgressBar) this.f25339).setSecondaryProgress(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
