package l;

import android.os.Build;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginLinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۠ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MX */
/* JADX INFO: loaded from: classes4.dex */
public class C8018 extends C11546 implements PluginLinearLayout {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f24755;

    public C8018(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f24755 = 8388659;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final boolean isHorizontal() {
        return ((LinearLayout) this.f22448).getOrientation() == 0;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final boolean isVertical() {
        return ((LinearLayout) this.f22448).getOrientation() == 1;
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final int getGravity() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.f24755;
        }
        return ((LinearLayout) this.f22448).getGravity();
    }

    @Override // bin.mt.plugin.api.ui.PluginLinearLayout
    public final void setGravity(int i) {
        if (C10975.m27285()) {
            ((LinearLayout) this.f22448).setGravity(i);
            if (Build.VERSION.SDK_INT < 24) {
                this.f24755 = i;
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
