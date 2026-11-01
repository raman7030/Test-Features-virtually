package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۟᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes4.dex */
public class C9692 extends AbstractC23136 {
    @Override // p067l.AbstractC23136
    /* JADX INFO: renamed from: ܿ */
    public final void mo22602() {
        Bundle bundleRequireArguments = requireArguments();
        if (bundleRequireArguments.containsKey("preferencesName")) {
            m51590().m43515(bundleRequireArguments.getString("preferencesName"));
        }
        m51587(bundleRequireArguments.getInt("layoutID"));
        m22600((AbstractC5701) m51591());
        ActivityC3069 activity = getActivity();
        if (activity instanceof AbstractActivityC3895) {
            ((AbstractActivityC3895) activity).mo7695(this, m51591());
        }
        if (bundleRequireArguments.containsKey("scrollTo")) {
            String string = bundleRequireArguments.getString("scrollTo");
            C12826.requireNonNull(string);
            m51589(string);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22600(AbstractC5701 abstractC5701) {
        int iM12694 = abstractC5701.m12694();
        for (int i = 0; i < iM12694; i++) {
            C4360 c4360M12696 = abstractC5701.m12696(i);
            if (c4360M12696 instanceof C20945) {
                C20945 c20945 = (C20945) c4360M12696;
                if (!AbstractActivityC3895.f8440.contains(c4360M12696.m9037())) {
                    c20945.mo9020(c20945.m47259());
                }
                c20945.m9025(this);
            } else if (c4360M12696 instanceof C3709) {
                c4360M12696.m9025(this);
            } else if (c4360M12696 instanceof C8874) {
                c4360M12696.m9025(this);
            } else if (c4360M12696 instanceof C19552) {
                c4360M12696.m9025(this);
            } else if (c4360M12696 instanceof AbstractC5701) {
                m22600((AbstractC5701) c4360M12696);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22601(C4360 c4360, Object obj) {
        ActivityC3069 activity = getActivity();
        if (!((activity instanceof AbstractActivityC3895) && ((AbstractActivityC3895) activity).mo7696(this, c4360, obj)) && (c4360 instanceof C20945)) {
            C20945 c20945 = (C20945) c4360;
            if (AbstractActivityC3895.f8440.contains(c4360.m9037())) {
                return;
            }
            c4360.mo9020(c20945.m47258()[c20945.m47256((String) obj)]);
        }
    }
}
