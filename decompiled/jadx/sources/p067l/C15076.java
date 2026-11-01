package p067l;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginLinearLayoutBuilder;

/* JADX INFO: renamed from: l.۬᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7PH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15076 extends AbstractC9042 implements PluginLinearLayoutBuilder {
    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C9989(pluginUI, pluginViewGroup);
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        return new LinearLayout(context);
    }
}
