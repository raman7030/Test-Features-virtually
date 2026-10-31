package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۟᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes4.dex */
public class C7705 extends AbstractC21851 {
    @Override // l.AbstractC21851
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo20622() {
        Bundle bundleRequireArguments = requireArguments();
        if (bundleRequireArguments.containsKey("preferencesName")) {
            m49239().m41269(bundleRequireArguments.getString("preferencesName"));
        }
        m49236(bundleRequireArguments.getInt("layoutID"));
        m20620((AbstractC3506) m49240());
        ActivityC0737 activity = getActivity();
        if (activity instanceof AbstractActivityC1606) {
            ((AbstractActivityC1606) activity).mo5465(this, m49240());
        }
        if (bundleRequireArguments.containsKey("scrollTo")) {
            String string = bundleRequireArguments.getString("scrollTo");
            C11003.requireNonNull(string);
            m49238(string);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20620(AbstractC3506 abstractC3506) {
        int iM10699 = abstractC3506.m10699();
        for (int i = 0; i < iM10699; i++) {
            C2095 c2095M10701 = abstractC3506.m10701(i);
            if (c2095M10701 instanceof C19546) {
                C19546 c19546 = (C19546) c2095M10701;
                if (!AbstractActivityC1606.f5660.contains(c2095M10701.m6911())) {
                    c19546.mo6894(c19546.m44959());
                }
                c19546.m6899(this);
            } else if (c2095M10701 instanceof C1410) {
                c2095M10701.m6899(this);
            } else if (c2095M10701 instanceof C6845) {
                c2095M10701.m6899(this);
            } else if (c2095M10701 instanceof C18080) {
                c2095M10701.m6899(this);
            } else if (c2095M10701 instanceof AbstractC3506) {
                m20620((AbstractC3506) c2095M10701);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20621(C2095 c2095, Object obj) {
        ActivityC0737 activity = getActivity();
        if (!((activity instanceof AbstractActivityC1606) && ((AbstractActivityC1606) activity).mo5466(this, c2095, obj)) && (c2095 instanceof C19546)) {
            C19546 c19546 = (C19546) c2095;
            if (AbstractActivityC1606.f5660.contains(c2095.m6911())) {
                return;
            }
            c2095.mo6894(c19546.m44958()[c19546.m44956((String) obj)]);
        }
    }
}
