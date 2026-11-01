package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plugin.api.p002ui.PluginButton;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6360 extends AbstractC16417 implements PluginButtonBuilder {

    /* JADX INFO: renamed from: ۗ */
    public PluginButton.Style f16475;

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final C9318 mo8086(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C18706(pluginUI, pluginViewGroup, this.f16475);
    }

    public C6360(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f16475 = PluginButton.Style.DEFAULT;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public final View mo8085(Context context) {
        int i = C5019.f11482[this.f16475.ordinal()];
        if (i == 1) {
            return new C1838(context);
        }
        if (i == 2) {
            return new C1838(new C1473(context, R.style.MT_Protector));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        C1838 c1838 = new C1838(new C1473(context, R.style.MT_Protector));
        C15766.m35831(c1838);
        return c1838;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginButtonBuilder
    public final PluginButtonBuilder style(PluginButton.Style style) {
        this.f16475 = style;
        return this;
    }
}
