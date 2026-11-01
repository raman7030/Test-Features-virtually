package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plugin.api.p002ui.PluginButton;
import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۜۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T7RP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8648 extends C18706 implements PluginCompoundButton {
    public AbstractC8648(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup, PluginButton.Style.DEFAULT);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginCompoundButton
    public void setOnCheckedChangeListener(final PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            ((CompoundButton) this.f25339).setOnCheckedChangeListener(null);
        } else {
            ((CompoundButton) this.f25339).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻ۜ᩷
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AbstractC8648 abstractC8648 = this.f78338;
                    abstractC8648.getClass();
                    onCheckedChangeListener.onCheckedChanged(abstractC8648, z);
                }
            });
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginCompoundButton
    public final boolean isChecked() {
        return ((CompoundButton) this.f25339).isChecked();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginCompoundButton
    public final void setChecked(boolean z) {
        if (C12799.m29347()) {
            ((CompoundButton) this.f25339).setChecked(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
