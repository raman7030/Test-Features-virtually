package p067l;

import android.os.Build;
import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginLinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۠ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MX */
/* JADX INFO: loaded from: classes4.dex */
public class C9989 extends C13342 implements PluginLinearLayout {

    /* JADX INFO: renamed from: ۜ */
    public int f27669;

    public C9989(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f27669 = 8388659;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginLinearLayout
    public final boolean isHorizontal() {
        return ((LinearLayout) this.f25339).getOrientation() == 0;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginLinearLayout
    public final boolean isVertical() {
        return ((LinearLayout) this.f25339).getOrientation() == 1;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginLinearLayout
    public final int getGravity() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.f27669;
        }
        return ((LinearLayout) this.f25339).getGravity();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginLinearLayout
    public final void setGravity(int i) {
        if (C12799.m29347()) {
            ((LinearLayout) this.f25339).setGravity(i);
            if (Build.VERSION.SDK_INT < 24) {
                this.f27669 = i;
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
