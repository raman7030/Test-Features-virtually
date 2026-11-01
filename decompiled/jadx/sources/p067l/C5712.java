package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5712 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC5323 f13973;

    /* JADX INFO: renamed from: ۧ */
    public final C4036 f13974;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7783 f13975;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C15099 f13976;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        this.f13976.m34509(c19720.f59995, this.f13974, this.f13975, this.f13973, false);
        mo12739(c19720.f59996);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        this.f13976.m34509(c15973.f46260, this.f13974, this.f13975, this.f13973, true);
        m35992(c15973.f46262);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        C4848 c4848 = c19859.f60357;
        InterfaceC5323 interfaceC5323 = this.f13973;
        C15099 c15099 = this.f13976;
        c15099.m34509(c4848, this.f13974, this.f13975, interfaceC5323, false);
        Iterator it = c19859.f60361.iterator();
        while (it.hasNext()) {
            c15099.m34509((C4848) it.next(), this.f13974, this.f13975, this.f13973, false);
        }
        mo12739(c19859.f60358);
        m35992(c19859.f60359);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        mo12739(c10471.f28961);
        mo12739(c10471.f28966);
        m35992(c10471.f28962);
        mo12739(c10471.f28967);
        m35992(c10471.f28963);
        m35992(c10471.f28957);
        mo12739(c10471.f28964);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        InterfaceC5323 interfaceC5323 = this.f13973;
        this.f13973 = c11281;
        try {
            AbstractC7783 abstractC7783 = this.f13975;
            if (abstractC7783 != null && abstractC7783.f20405 == EnumC3600.f7339) {
                mo12739(c11281.f31435);
                mo12739(c11281.f31437);
            }
            mo12739(c11281.f31436);
        } finally {
            this.f13973 = interfaceC5323;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        mo12739(c20530.f63432);
        m35992(c20530.f63431);
        if (c20530.f63428 == null) {
            mo12739(c20530.f63429);
        }
        m35992(c20530.f63430);
    }

    public C5712(C15099 c15099, C4036 c4036, AbstractC7783 abstractC7783, InterfaceC5323 interfaceC5323) {
        this.f13976 = c15099;
        this.f13974 = c4036;
        this.f13975 = abstractC7783;
        this.f13973 = interfaceC5323;
    }
}
