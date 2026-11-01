package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8QA */
/* JADX INFO: loaded from: classes.dex */
public final class C23560 {

    /* JADX INFO: renamed from: ֫ */
    public C17474 f75032;

    /* JADX INFO: renamed from: ܳ */
    public C17474 f75034;

    /* JADX INFO: renamed from: ܿ */
    public C17474 f75036;

    /* JADX INFO: renamed from: ᩳ */
    public final C23738 f75037;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC16192 f75033 = AbstractC16192.m36872of();

    /* JADX INFO: renamed from: ܽ */
    public AbstractC11500 f75035 = AbstractC11500.m26548of();

    public C23560(C23738 c23738) {
        this.f75037 = c23738;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17474 m52356() {
        return this.f75032;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17474 m52361() {
        return this.f75036;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17474 m52362() {
        return this.f75034;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17474 m52359() {
        if (this.f75033.isEmpty()) {
            return null;
        }
        return (C17474) C10810.m24926(this.f75033);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m52355(C17474 c17474) {
        return (AbstractC6974) this.f75035.get(c17474);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52358(InterfaceC3621 interfaceC3621) {
        this.f75032 = m52351(interfaceC3621, this.f75033, this.f75036, this.f75037);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52360(InterfaceC3621 interfaceC3621) {
        this.f75032 = m52351(interfaceC3621, this.f75033, this.f75036, this.f75037);
        m52352(interfaceC3621.mo6808());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52357(List list, C17474 c17474, InterfaceC3621 interfaceC3621) {
        this.f75033 = AbstractC16192.copyOf((Collection) list);
        if (!list.isEmpty()) {
            this.f75036 = (C17474) list.get(0);
            c17474.getClass();
            this.f75034 = c17474;
        }
        if (this.f75032 == null) {
            this.f75032 = m52351(interfaceC3621, this.f75033, this.f75036, this.f75037);
        }
        m52352(interfaceC3621.mo6808());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52352(AbstractC6974 abstractC6974) {
        C8817 c8817M26550 = AbstractC11500.m26550();
        if (this.f75033.isEmpty()) {
            m52353(c8817M26550, this.f75036, abstractC6974);
            if (!C12826.equals(this.f75034, this.f75036)) {
                m52353(c8817M26550, this.f75034, abstractC6974);
            }
            if (!C12826.equals(this.f75032, this.f75036) && !C12826.equals(this.f75032, this.f75034)) {
                m52353(c8817M26550, this.f75032, abstractC6974);
            }
        } else {
            for (int i = 0; i < this.f75033.size(); i++) {
                m52353(c8817M26550, (C17474) this.f75033.get(i), abstractC6974);
            }
            if (!this.f75033.contains(this.f75032)) {
                m52353(c8817M26550, this.f75032, abstractC6974);
            }
        }
        this.f75035 = c8817M26550.mo20378();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52353(C8817 c8817, C17474 c17474, AbstractC6974 abstractC6974) {
        if (c17474 == null) {
            return;
        }
        if (abstractC6974.mo15978(c17474.f52252) != -1) {
            c8817.mo20376(c17474, abstractC6974);
            return;
        }
        AbstractC6974 abstractC6975 = (AbstractC6974) this.f75035.get(c17474);
        if (abstractC6975 != null) {
            c8817.mo20376(c17474, abstractC6975);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17474 m52351(InterfaceC3621 interfaceC3621, AbstractC16192 abstractC16192, C17474 c17474, C23738 c23738) {
        AbstractC6974 abstractC6974Mo6808 = interfaceC3621.mo6808();
        int iMo6824 = interfaceC3621.mo6824();
        Object objMo15982 = abstractC6974Mo6808.m15990() ? null : abstractC6974Mo6808.mo15982(iMo6824);
        int iM52773 = (interfaceC3621.mo6840() || abstractC6974Mo6808.m15990()) ? -1 : abstractC6974Mo6808.mo15984(iMo6824, c23738, false).m52773(C5792.m12990(interfaceC3621.getCurrentPosition()) - c23738.f75530);
        for (int i = 0; i < abstractC16192.size(); i++) {
            C17474 c17475 = (C17474) abstractC16192.get(i);
            if (m52354(c17475, objMo15982, interfaceC3621.mo6840(), interfaceC3621.mo6838(), interfaceC3621.mo6809(), iM52773)) {
                return c17475;
            }
        }
        if (abstractC16192.isEmpty() && c17474 != null) {
            if (m52354(c17474, objMo15982, interfaceC3621.mo6840(), interfaceC3621.mo6838(), interfaceC3621.mo6809(), iM52773)) {
                return c17474;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m52354(C17474 c17474, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c17474.f52252;
        int i4 = c17474.f52248;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c17474.f52249 == i2) {
            return true;
        }
        return !z && i4 == -1 && c17474.f52250 == i3;
    }
}
