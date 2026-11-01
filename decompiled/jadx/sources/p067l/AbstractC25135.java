package p067l;

import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;
import bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder;
import bin.p000mt.plugin.api.p002ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.᩻᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 07NZ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC25135 extends AbstractC16417 implements PluginBaseCompoundButtonBuilder {

    /* JADX INFO: renamed from: ۗ */
    public Boolean f80422;

    /* JADX INFO: renamed from: ۬ */
    public PluginCompoundButton.OnCheckedChangeListener f80423;

    @Override // p067l.AbstractC22454
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void mo12670(AbstractC8648 abstractC8648) {
        super.mo12670((C12001) abstractC8648);
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f80423;
        if (onCheckedChangeListener != null) {
            abstractC8648.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        Boolean bool = this.f80422;
        if (bool != null) {
            abstractC8648.setChecked(bool.booleanValue());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder onCheckedChange(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f80423 = onCheckedChangeListener;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(boolean z) {
        this.f80422 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject) {
        checked(jSONObject, false);
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder checked(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            this.f80422 = Boolean.valueOf(z);
            return this;
        }
        this.f80422 = Boolean.valueOf(jSONObject.getBoolean(requireId(), z));
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder check() {
        this.f80422 = Boolean.TRUE;
        return this;
    }

    @Override // bin.p000mt.plugin.api.p002ui.builder.PluginBaseCompoundButtonBuilder
    public final PluginUIBuilder uncheck() {
        this.f80422 = Boolean.FALSE;
        return this;
    }
}
