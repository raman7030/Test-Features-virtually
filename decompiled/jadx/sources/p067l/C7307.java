package p067l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginFrameLayout;
import bin.p000mt.plugin.api.p002ui.PluginView;

/* JADX INFO: renamed from: l.ۚۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L7NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7307 extends C13342 implements PluginFrameLayout {
    @Override // p067l.C13342
    /* JADX INFO: renamed from: ֫ */
    public final void mo15123(PluginView pluginView) {
        C9318 c9318 = (C9318) pluginView;
        this.f37467.add(pluginView);
        ViewGroup.LayoutParams layoutParams = c9318.f25339.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            c9318.f25339.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height, layoutParams2.gravity));
        }
        ((FrameLayout) this.f25339).addView(c9318.f25339);
    }
}
