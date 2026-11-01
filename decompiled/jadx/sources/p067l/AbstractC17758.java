package p067l;

import android.content.Context;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;
import bin.p000mt.plugin.api.util.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17758 extends AbstractC11725 implements PluginBaseViewGroupBuilder {

    /* JADX INFO: renamed from: ۘ */
    public final C11054 f53030;

    /* JADX INFO: renamed from: ᩴ */
    public PluginUI.Style f53031;

    public AbstractC17758(PluginUIBuilder pluginUIBuilder, PluginUI.Style style) {
        super(pluginUIBuilder);
        this.f53030 = new C11054(this);
        C12826.requireNonNull(style);
        this.f53031 = style;
    }

    public PluginUI.Style getChildrenStyle() {
        return this.f53031;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseViewGroupBuilder
    public PluginUIBuilder childrenStyle(PluginUI.Style style) {
        if (style instanceof PluginUI.StyleWrapper) {
            PluginUI.StyleWrapper styleWrapper = (PluginUI.StyleWrapper) style;
            if (styleWrapper.getBaseStyle() == null) {
                styleWrapper.attachStyle(this.f53031);
            }
        }
        C12826.requireNonNull(style, "Style cannot be null");
        this.f53031 = style;
        return this;
    }

    public PluginUIBuilder children(Consumer consumer) {
        consumer.mo56319accept(this.f53030);
        return this;
    }

    @Override // p067l.AbstractC11725
    /* JADX INFO: renamed from: ֫ */
    public C13342 mo26930(PluginUI pluginUI, PluginViewGroup pluginViewGroup, Context context) {
        C13342 c13342 = (C13342) super.mo26930(pluginUI, pluginViewGroup, context);
        C11054 c11054 = this.f53030;
        Iterator it = c11054.f30606.iterator();
        while (it.hasNext()) {
            c13342.mo15123(((AbstractC11725) it.next()).mo26930(pluginUI, c13342, context));
        }
        ArrayList arrayList = c11054.f30607;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c13342.unifyWidth((String[]) it2.next());
            }
        }
        return c13342;
    }
}
