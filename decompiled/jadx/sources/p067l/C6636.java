package p067l;

import bin.p000mt.plugin.api.p002ui.PluginCompoundButton;
import bin.p000mt.plugin.api.p002ui.PluginRadioButton;
import bin.p000mt.plugin.api.p002ui.PluginRadioGroup;
import bin.p000mt.plugin.api.p002ui.PluginUI;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plugin.api.p002ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۙۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K7RF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6636 extends C9989 implements PluginRadioGroup {

    /* JADX INFO: renamed from: ۡ */
    public PluginRadioGroup.OnCheckedChangeListener f17114;

    /* JADX INFO: renamed from: ۢ */
    public PluginCompoundButton.OnCheckedChangeListener f17115;

    /* JADX INFO: renamed from: ᩷ */
    public C23400 f17116;

    public C6636(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f17115 = new C21389(this);
    }

    @Override // p067l.C13342
    /* JADX INFO: renamed from: ֫ */
    public final void mo15123(PluginView pluginView) {
        if (pluginView instanceof C23400) {
            C23400 c23400 = (C23400) pluginView;
            if (c23400.isChecked()) {
                C23400 c23401 = this.f17116;
                if (c23401 != null) {
                    c23401.setChecked(false);
                }
                m15122(c23400);
            }
            c23400.m52063(this.f17115);
        }
        super.mo15123(pluginView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m15122(C23400 c23400) {
        this.f17116 = c23400;
        PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f17114;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, c23400, c23400 == null ? -1 : c23400.getPositionInRadioGroup());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final String getCheckedRadioButtonId() {
        C23400 c23400 = this.f17116;
        if (c23400 != null) {
            return c23400.getId();
        }
        return null;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final int getCheckedRadioButtonPosition() {
        C23400 c23400 = this.f17116;
        if (c23400 != null) {
            return c23400.getPositionInRadioGroup();
        }
        return -1;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final PluginRadioButton getCheckedRadioButton() {
        return this.f17116;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final void clearCheck() {
        check((String) null);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final void setOnCheckedChangeListener(PluginRadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17114 = onCheckedChangeListener;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final void check(int i) {
        if (C12799.m29347()) {
            C23400 c23400 = this.f17116;
            if (c23400 == null || i != c23400.getPositionInRadioGroup()) {
                C23400 c23401 = this.f17116;
                if (c23401 != null) {
                    c23401.setChecked(false);
                }
                if (i >= 0) {
                    for (PluginView pluginView : this.f37467) {
                        if (pluginView instanceof C23400) {
                            C23400 c23402 = (C23400) pluginView;
                            if (c23402.getPositionInRadioGroup() == i) {
                                c23402.setChecked(true);
                                m15122(c23402);
                                return;
                            }
                        }
                    }
                }
                m15122((C23400) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginRadioGroup
    public final void check(String str) {
        C23400 c23400;
        if (!C12799.m29347()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (str == null || (c23400 = this.f17116) == null || !str.equals(c23400.getId())) {
            C23400 c23401 = this.f17116;
            if (c23401 != null) {
                c23401.setChecked(false);
            }
            PluginView pluginViewFindViewById = findViewById(str);
            if (pluginViewFindViewById instanceof C23400) {
                C23400 c23402 = (C23400) pluginViewFindViewById;
                c23402.setChecked(true);
                m15122(c23402);
                return;
            }
            m15122((C23400) null);
        }
    }
}
