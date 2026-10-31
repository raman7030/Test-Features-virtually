package l;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;

/* JADX INFO: renamed from: l.۬᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7PH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13370 extends AbstractC7021 implements PluginLinearLayoutBuilder {
    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C8018(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        return new LinearLayout(context);
    }
}
