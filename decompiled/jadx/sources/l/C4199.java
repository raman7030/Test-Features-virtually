package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4199 extends AbstractC14781 implements PluginButtonBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PluginButton.Style f13662;

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final C7312 mo5876(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C17190(pluginUI, pluginViewGroup, this.f13662);
    }

    public C4199(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f13662 = PluginButton.Style.DEFAULT;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public final View mo5875(Context context) {
        int i = C2788.f8688[this.f13662.ordinal()];
        if (i == 1) {
            return new C20077(context);
        }
        if (i == 2) {
            return new C20077(new C12729(context, R.style.MT_Protector));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        C20077 c20077 = new C20077(new C12729(context, R.style.MT_Protector));
        C14096.m33705(c20077);
        return c20077;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginButtonBuilder
    public final PluginButtonBuilder style(PluginButton.Style style) {
        this.f13662 = style;
        return this;
    }
}
