package l;

import android.content.Context;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16192 extends AbstractC9844 implements PluginBaseViewGroupBuilder {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9138 f49864;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public PluginUI.Style f49865;

    public AbstractC16192(PluginUIBuilder pluginUIBuilder, PluginUI.Style style) {
        super(pluginUIBuilder);
        this.f49864 = new C9138(this);
        C11003.requireNonNull(style);
        this.f49865 = style;
    }

    public PluginUI.Style getChildrenStyle() {
        return this.f49865;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseViewGroupBuilder
    public PluginUIBuilder childrenStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f49865);
            }
        }
        C11003.requireNonNull(style, "Style cannot be null");
        this.f49865 = style;
        return this;
    }

    public PluginUIBuilder children(Consumer consumer) {
        consumer.mo12762accept(this.f49864);
        return this;
    }

    @Override // l.AbstractC9844
    /* JADX INFO: renamed from: ֫ */
    public C11546 mo24915(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C11546 c11546 = (C11546) super.mo24915(pluginUI, pluginViewGroup, context);
        C9138 c9138 = this.f49864;
        Iterator it = c9138.f27666.iterator();
        while (it.hasNext()) {
            c11546.mo13241(((AbstractC9844) it.next()).mo24915(pluginUI, c11546, context));
        }
        ArrayList arrayList = c9138.f27667;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c11546.unifyWidth((String[]) it2.next());
            }
        }
        return c11546;
    }
}
