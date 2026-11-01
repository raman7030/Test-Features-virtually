package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9874 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C6468 f27384 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C11216 f27385;

    /* JADX INFO: renamed from: ۧ */
    public final C14152 f27386;

    /* JADX INFO: renamed from: ܳ */
    public final C8374 f27387;

    /* JADX INFO: renamed from: ܽ */
    public final C18537 f27388;

    /* JADX INFO: renamed from: ܿ */
    public final C22004 f27389;

    /* JADX INFO: renamed from: ᩳ */
    public final C20271 f27390 = new C20271();

    public C9874(C5127 c5127) {
        c5127.m10908(f27384, this);
        this.f27385 = C11216.m25910(c5127);
        this.f27386 = C14152.m32631(c5127);
        C8200.m18988(c5127);
        this.f27388 = C18537.m42139(c5127);
        this.f27389 = C22004.m49577(c5127);
        this.f27387 = C8374.m19396(c5127);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23159() {
        AbstractC6462 abstractC6462M23157;
        C18537 c18537;
        while (true) {
            C20271 c20271 = this.f27390;
            if (!c20271.m45784()) {
                return;
            }
            C7192 c7192 = (C7192) c20271.remove();
            C20271 c20272 = new C20271();
            C4036 c4036 = c7192.f18791;
            C4036 c4037 = c7192.f18791;
            C24626 c24626 = c7192.f18795;
            AbstractC7783 abstractC7783 = c7192.f18790;
            boolean zM16617 = c4036.f8850.m16617(EnumC19998.f60758);
            boolean z = false;
            C22004 c22004 = this.f27389;
            if (zM16617) {
                C17175 c17175 = (C17175) c4036.f8850;
                boolean z2 = (abstractC7783.mo18003() & 17179869184L) != 0;
                if (z2 || c17175.f51144.m10289() <= abstractC7783.f20406.mo14797().m10289()) {
                    C4848 c4848 = c17175.f51144;
                    C4848 c4848Mo14797 = abstractC7783.f20406.mo14797();
                    while (true) {
                        boolean zM10293 = c4848.m10293();
                        c18537 = this.f27388;
                        if (!zM10293 || !c4848Mo14797.m10293()) {
                            break;
                        }
                        AbstractC14355 abstractC14355 = (AbstractC14355) c4848.f11034;
                        AbstractC6462 abstractC6462 = (c4848Mo14797.f11035.m10293() || !z2) ? (AbstractC6462) c4848Mo14797.f11034 : ((C7251) c4848Mo14797.f11034).f18916;
                        if (abstractC14355.m16617(EnumC19998.f60747)) {
                            C15834 c15834 = (C15834) abstractC14355;
                            if (c15834.f45861 == EnumC18517.IMPLICIT) {
                                for (Iterator it = c15834.f45863.iterator(); it.hasNext(); it = it) {
                                    ((C11281) it.next()).f31437 = null;
                                }
                            }
                            C8374 c8374 = this.f27387;
                            if (c8374.m19498(abstractC6462)) {
                                boolean zM14777 = c8374.m19478(abstractC6462).mo14787().m14777(EnumC11353.VOID);
                                c15834.f45864 = new C2497(this, zM14777, c20272, c15834).mo25569(c15834.f45864);
                                if (!zM14777) {
                                    C5638 c5638M42191 = c18537.m42191();
                                    c5638M42191.f18925 = c22004.f69139;
                                    C11813 c11813M42207 = c18537.m42207(c5638M42191);
                                    C4968 c4968 = (C4968) c15834.f45864;
                                    c4968.f11316 = c4968.f11316.m10286(c11813M42207);
                                    c20272.m45777(new RunnableC10691(1, c15834, c11813M42207));
                                }
                            }
                            z = true;
                        }
                        c4848 = c4848.f11035;
                        if (c4848Mo14797.f11035.m10293() || !z2) {
                            c4848Mo14797 = c4848Mo14797.f11035;
                        }
                    }
                    C4848 c4849 = c17175.f51144;
                    while (c4848Mo14797.m10293()) {
                        C4848 c48410 = c17175.f51144;
                        C5638 c5638M42192 = c18537.m42191();
                        c5638M42192.f18925 = c22004.f69139;
                        c17175.f51144 = c48410.m10286(c5638M42192);
                        c4848Mo14797 = c4848Mo14797.f11035;
                        z = true;
                    }
                    c20272.m45777(new RunnableC18012(3, c17175, c4849));
                }
            }
            if (z) {
                C4848 c4848M21401 = C9268.m21401(c4036.f8850);
                AbstractC6462 abstractC6463 = c24626.f77965;
                AbstractC6462 abstractC6464 = c24626.f77965;
                C4848 c4848Mo14798 = abstractC6463.mo14797();
                while (c4848Mo14798.m10289() < c4848M21401.m10289()) {
                    c4848Mo14798 = c4848Mo14798.m10286(c22004.f69139);
                }
                AbstractC6462 abstractC6465 = c7192.f18794;
                AbstractC7783 abstractC7784 = c7192.f18790;
                C11216 c11216 = this.f27385;
                C12826.requireNonNull(c11216);
                abstractC6462M23157 = c11216.m25936(abstractC6465, abstractC7784, new C24626(c11216, c24626.f77963, abstractC6464.mo14787(), c24626.f77961, c24626.f77962), c4037, c4848M21401, c4848Mo14798, abstractC6464.mo14802());
                C7480.stream(c20272).forEach(new C4510());
            } else {
                abstractC6462M23157 = m23157(c7192.f18792, c7192.f18794, c7192.f18793, c4037, c7192.f18795);
            }
            c7192.f18792.f18925 = abstractC6462M23157;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m23158(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C4036 c4036, C24626 c24626) {
        if ((abstractC7783.f20409 & 1099511627776L) != 0 && ((C10545) c4036.f8849).f29199.m22078()) {
            AbstractC7783 abstractC7784 = ((C3168) abstractC7783.f20406).f6096;
            this.f27385.getClass();
            this.f27390.m45777(new C7192(abstractC7257, abstractC6462, abstractC7783, abstractC7784, C11216.m25928(c4036), c24626));
            return this.f27389.f69139;
        }
        return m23157(abstractC7257, abstractC6462, abstractC7783, c4036, c24626);
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC6462 m23157(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C4036 c4036, C24626 c24626) {
        AbstractC6462 abstractC6463 = c24626.f77965;
        C14152 c14152 = this.f27386;
        C12826.requireNonNull(c14152);
        C5435 c5435 = new C5435(c14152, EnumC15511.SPECULATIVE, abstractC7783, ((C10545) c4036.f8849).f29204);
        abstractC6463.getClass();
        AbstractC6462 abstractC6462M25942 = this.f27385.m25942(abstractC7257, abstractC6462, abstractC7783, (AbstractC6462) c5435.m23807(null, abstractC6463), c4036, c24626);
        AbstractC6462 abstractC6464 = c24626.f77965;
        C12826.requireNonNull(c14152);
        C5435 c5436 = new C5435(c14152, EnumC15511.CHECK, abstractC7783, ((C10545) c4036.f8849).f29204);
        abstractC6464.getClass();
        return abstractC6462M25942;
    }
}
