package l;

import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.᩻᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23954 extends AbstractC14781 implements PluginBaseCompoundButtonBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Boolean f77670;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f77671;

    @Override // l.AbstractC21133
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void mo10675(AbstractC6607 abstractC6607) {
        super.mo10675((C10135) abstractC6607);
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f77671;
        if (onCheckedChangeListener != null) {
            abstractC6607.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        Boolean bool = this.f77670;
        if (bool != null) {
            abstractC6607.setChecked(bool.booleanValue());
        }
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f77671 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(boolean z) {
        this.f77670 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject) {
        checked(jSONObject, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            this.f77670 = Boolean.valueOf(z);
            return this;
        }
        this.f77670 = Boolean.valueOf(jSONObject.getBoolean(requireId(), z));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder check() {
        this.f77670 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder uncheck() {
        this.f77670 = Boolean.FALSE;
        return this;
    }
}
