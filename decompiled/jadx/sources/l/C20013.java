package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;

/* JADX INFO: renamed from: l.᩶ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20013 implements PluginCompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4490 f64826;

    public C20013(C4490 c4490) {
        this.f64826 = c4490;
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z) {
        if (z) {
            C4490 c4490 = this.f64826;
            if (c4490.f14289 != null) {
                c4490.f14289.setChecked(false);
            }
            c4490.m13240((C22129) pluginCompoundButton);
        }
    }
}
