package l;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.᩹ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7OU */
/* JADX INFO: loaded from: classes2.dex */
public final class C22129 extends AbstractC6607 implements PluginRadioButton {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f71822;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f71823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f71824;

    @Override // l.C7312
    /* JADX INFO: renamed from: ֫ */
    public final void mo19598(View view) {
        RadioButton radioButton = (RadioButton) view;
        this.f22448 = radioButton;
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ۜ᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C22129.m49723(this.f68989, z);
            }
        });
    }

    public C22129(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f71824 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49723(C22129 c22129, boolean z) {
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = c22129.f71822;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(c22129, z);
        }
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = c22129.f71823;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(c22129, z);
        }
    }

    @Override // l.AbstractC6607, bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setOnCheckedChangeListener(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f71822 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49725(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f71823 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49724(int i) {
        this.f71824 = i;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioButton
    public final int getPositionInRadioGroup() {
        return this.f71824;
    }
}
