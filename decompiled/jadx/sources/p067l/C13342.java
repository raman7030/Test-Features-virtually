package p067l;

import android.view.ViewGroup;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13342 extends C9318 implements PluginViewGroup {

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f37467;

    /* JADX INFO: renamed from: ᩻ */
    public ConcurrentMapC12768 f37468;

    public C13342(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f37467 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15123(PluginView pluginView) {
        this.f37467.add(pluginView);
        ((ViewGroup) this.f25339).addView(((C9318) pluginView).f25339);
    }

    @Override // p067l.C9318
    /* JADX INFO: renamed from: ֫ */
    public final PluginView mo21564(String str) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f37468;
        if (concurrentMapC12768 != null) {
            return (PluginView) C19473.computeIfAbsent(concurrentMapC12768, str, new C7977(0, this));
        }
        return m30470(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public PluginView m30470(String str) {
        if (str.equals(getId())) {
            return this;
        }
        ArrayList arrayList = this.f37467;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PluginView pluginViewFindViewById = ((PluginView) arrayList.get(i)).findViewById(str);
            if (pluginViewFindViewById != null) {
                return pluginViewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30471() {
        this.f37468 = new ConcurrentMapC12768();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginViewGroup
    public final int getChildCount() {
        return this.f37467.size();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginViewGroup
    public final PluginView getChildAt(int i) {
        return (PluginView) this.f37467.get(i);
    }
}
