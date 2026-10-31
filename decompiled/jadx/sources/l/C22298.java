package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8QA */
/* JADX INFO: loaded from: classes.dex */
public final class C22298 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15894 f72305;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15894 f72307;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15894 f72309;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22485 f72310;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f72306 = AbstractC14545.of();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9608 f72308 = AbstractC9608.of();

    public C22298(C22485 c22485) {
        this.f72310 = c22485;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 m50026() {
        return this.f72305;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15894 m50031() {
        return this.f72309;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15894 m50032() {
        return this.f72307;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15894 m50029() {
        if (this.f72306.isEmpty()) {
            return null;
        }
        return (C15894) C8882.m22955(this.f72306);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m50025(C15894 c15894) {
        return (AbstractC4846) this.f72308.get(c15894);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50028(InterfaceC1318 interfaceC1318) {
        this.f72305 = m50021(interfaceC1318, this.f72306, this.f72309, this.f72310);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50030(InterfaceC1318 interfaceC1318) {
        this.f72305 = m50021(interfaceC1318, this.f72306, this.f72309, this.f72310);
        m50022(interfaceC1318.mo4576());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50027(List list, C15894 c15894, InterfaceC1318 interfaceC1318) {
        this.f72306 = AbstractC14545.copyOf((Collection) list);
        if (!list.isEmpty()) {
            this.f72309 = (C15894) list.get(0);
            c15894.getClass();
            this.f72307 = c15894;
        }
        if (this.f72305 == null) {
            this.f72305 = m50021(interfaceC1318, this.f72306, this.f72309, this.f72310);
        }
        m50022(interfaceC1318.mo4576());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50022(AbstractC4846 abstractC4846) {
        C6785 c6785M24537 = AbstractC9608.m24537();
        if (this.f72306.isEmpty()) {
            m50023(c6785M24537, this.f72309, abstractC4846);
            if (!C11003.equals(this.f72307, this.f72309)) {
                m50023(c6785M24537, this.f72307, abstractC4846);
            }
            if (!C11003.equals(this.f72305, this.f72309) && !C11003.equals(this.f72305, this.f72307)) {
                m50023(c6785M24537, this.f72305, abstractC4846);
            }
        } else {
            for (int i = 0; i < this.f72306.size(); i++) {
                m50023(c6785M24537, (C15894) this.f72306.get(i), abstractC4846);
            }
            if (!this.f72306.contains(this.f72305)) {
                m50023(c6785M24537, this.f72305, abstractC4846);
            }
        }
        this.f72308 = c6785M24537.mo18430();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50023(C6785 c6785, C15894 c15894, AbstractC4846 abstractC4846) {
        if (c15894 == null) {
            return;
        }
        if (abstractC4846.mo14098(c15894.f49112) != -1) {
            c6785.mo18428(c15894, abstractC4846);
            return;
        }
        AbstractC4846 abstractC4847 = (AbstractC4846) this.f72308.get(c15894);
        if (abstractC4847 != null) {
            c6785.mo18428(c15894, abstractC4847);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15894 m50021(InterfaceC1318 interfaceC1318, AbstractC14545 abstractC14545, C15894 c15894, C22485 c22485) {
        AbstractC4846 abstractC4846Mo4576 = interfaceC1318.mo4576();
        int iMo4592 = interfaceC1318.mo4592();
        Object objMo14102 = abstractC4846Mo4576.m14110() ? null : abstractC4846Mo4576.mo14102(iMo4592);
        int iM50432 = (interfaceC1318.mo4608() || abstractC4846Mo4576.m14110()) ? -1 : abstractC4846Mo4576.mo14104(iMo4592, c22485, false).m50432(C3603.m11014(interfaceC1318.getCurrentPosition()) - c22485.f72804);
        for (int i = 0; i < abstractC14545.size(); i++) {
            C15894 c15895 = (C15894) abstractC14545.get(i);
            if (m50024(c15895, objMo14102, interfaceC1318.mo4608(), interfaceC1318.mo4606(), interfaceC1318.mo4577(), iM50432)) {
                return c15895;
            }
        }
        if (abstractC14545.isEmpty() && c15894 != null) {
            if (m50024(c15894, objMo14102, interfaceC1318.mo4608(), interfaceC1318.mo4606(), interfaceC1318.mo4577(), iM50432)) {
                return c15894;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50024(C15894 c15894, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c15894.f49112;
        int i4 = c15894.f49108;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c15894.f49109 == i2) {
            return true;
        }
        return !z && i4 == -1 && c15894.f49110 == i3;
    }
}
