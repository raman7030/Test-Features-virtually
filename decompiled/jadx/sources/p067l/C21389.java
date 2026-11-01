package p067l;

import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;

/* JADX INFO: renamed from: l.᩶ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21389 implements PluginCompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6636 f67468;

    public C21389(C6636 c6636) {
        this.f67468 = c6636;
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z) {
        if (z) {
            C6636 c6636 = this.f67468;
            if (c6636.f17116 != null) {
                c6636.f17116.setChecked(false);
            }
            c6636.m15122((C23400) pluginCompoundButton);
        }
    }
}
