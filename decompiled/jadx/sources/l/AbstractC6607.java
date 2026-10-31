package l;

import android.widget.CompoundButton;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۜۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T7RP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6607 extends C17190 implements PluginCompoundButton {
    public AbstractC6607(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup, PluginButton.Style.DEFAULT);
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public void setOnCheckedChangeListener(final PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            ((CompoundButton) this.f22448).setOnCheckedChangeListener(null);
        } else {
            ((CompoundButton) this.f22448).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻ۜ᩷
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AbstractC6607 abstractC6607 = this.f75592;
                    abstractC6607.getClass();
                    onCheckedChangeListener.onCheckedChanged(abstractC6607, z);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final boolean isChecked() {
        return ((CompoundButton) this.f22448).isChecked();
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setChecked(boolean z) {
        if (C10975.m27285()) {
            ((CompoundButton) this.f22448).setChecked(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
