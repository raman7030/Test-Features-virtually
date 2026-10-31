package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginRadioGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۙۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4490 extends C8018 implements PluginRadioGroup {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PluginRadioGroup.OnCheckedChangeListener f14287;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f14288;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22129 f14289;

    public C4490(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f14288 = new C20013(this);
    }

    @Override // l.C11546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13241(PluginView pluginView) {
        if (pluginView instanceof C22129) {
            C22129 c22129 = (C22129) pluginView;
            if (c22129.isChecked()) {
                C22129 c221210 = this.f14289;
                if (c221210 != null) {
                    c221210.setChecked(false);
                }
                m13240(c22129);
            }
            c22129.m49725(this.f14288);
        }
        super.mo13241(pluginView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13240(C22129 c22129) {
        this.f14289 = c22129;
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f14287;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, c22129, c22129 == null ? -1 : c22129.getPositionInRadioGroup());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final String getCheckedRadioButtonId() {
        C22129 c22129 = this.f14289;
        if (c22129 != null) {
            return c22129.getId();
        }
        return null;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final int getCheckedRadioButtonPosition() {
        C22129 c22129 = this.f14289;
        if (c22129 != null) {
            return c22129.getPositionInRadioGroup();
        }
        return -1;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final PluginRadioButton getCheckedRadioButton() {
        return this.f14289;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void clearCheck() {
        check((String) null);
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void setOnCheckedChangeListener(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14287 = onCheckedChangeListener;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(int i) {
        if (C10975.m27285()) {
            C22129 c22129 = this.f14289;
            if (c22129 == null || i != c22129.getPositionInRadioGroup()) {
                C22129 c221210 = this.f14289;
                if (c221210 != null) {
                    c221210.setChecked(false);
                }
                if (i >= 0) {
                    for (PluginView pluginView : this.f34470) {
                        if (pluginView instanceof C22129) {
                            C22129 c221211 = (C22129) pluginView;
                            if (c221211.getPositionInRadioGroup() == i) {
                                c221211.setChecked(true);
                                m13240(c221211);
                                return;
                            }
                        }
                    }
                }
                m13240((C22129) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioGroup
    public final void check(String str) {
        C22129 c22129;
        if (!C10975.m27285()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (str == null || (c22129 = this.f14289) == null || !str.equals(c22129.getId())) {
            C22129 c221210 = this.f14289;
            if (c221210 != null) {
                c221210.setChecked(false);
            }
            PluginView pluginViewFindViewById = findViewById(str);
            if (pluginViewFindViewById instanceof C22129) {
                C22129 c221211 = (C22129) pluginViewFindViewById;
                c221211.setChecked(true);
                m13240(c221211);
                return;
            }
            m13240((C22129) null);
        }
    }
}
