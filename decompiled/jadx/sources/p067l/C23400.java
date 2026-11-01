package p067l;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;
import bin.p000mt.plugin.api.p002ui.PluginRadioButton;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.᩹ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7OU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23400 extends AbstractC8648 implements PluginRadioButton {

    /* JADX INFO: renamed from: ۜ */
    public PluginCompoundButton.OnCheckedChangeListener f74544;

    /* JADX INFO: renamed from: ᩷ */
    public PluginCompoundButton.OnCheckedChangeListener f74545;

    /* JADX INFO: renamed from: ᩻ */
    public int f74546;

    @Override // p067l.C9318
    /* JADX INFO: renamed from: ֫ */
    public final void mo21566(View view) {
        RadioButton radioButton = (RadioButton) view;
        this.f25339 = radioButton;
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ۜ᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C23400.m52061(this.f71687, z);
            }
        });
    }

    public C23400(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f74546 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m52061(C23400 c23400, boolean z) {
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = c23400.f74544;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(c23400, z);
        }
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = c23400.f74545;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(c23400, z);
        }
    }

    @Override // p067l.AbstractC8648, bin.p000mt.plugin.api.p002ui.PluginCompoundButton
    public final void setOnCheckedChangeListener(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f74544 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52063(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f74545 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52062(int i) {
        this.f74546 = i;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioButton
    public final int getPositionInRadioGroup() {
        return this.f74546;
    }
}
