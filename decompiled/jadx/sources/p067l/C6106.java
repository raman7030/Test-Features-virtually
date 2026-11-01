package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6106 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public C4036 f15356;

    /* JADX INFO: renamed from: ۧ */
    public C2733 f15357;

    /* JADX INFO: renamed from: ܽ */
    public C24626 f15358;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C20188 f15359;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        AbstractC6462 abstractC6462M19478;
        boolean z;
        C14152 c14152 = this.f15359.f62478;
        C24626 c24626 = this.f15358;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        AbstractC6462 abstractC6462 = c24626.f77965;
        if (this.f15357.f4594.contains(abstractC6462)) {
            return;
        }
        try {
            abstractC6462M19478 = c14152.f40358.m19478(abstractC6462);
        } catch (C8194 e) {
            interfaceC6125.mo3480(null, e.m18981());
            abstractC6462M19478 = null;
        }
        if (abstractC6462M19478.mo14797().m10289() != c15834.f45863.m10289()) {
            interfaceC6125.mo3480(c15834, c14152.f40371.m18543(C13665.f38473));
        }
        AbstractC6462 abstractC6462Mo14787 = abstractC6462M19478.mo14787();
        boolean zM14777 = abstractC6462Mo14787.m14777(EnumC11353.VOID);
        int i = 1;
        if (c15834.m35951() == EnumC15394.EXPRESSION) {
            if (!zM14777 || C9268.m21413((AbstractC14355) c15834.f45864)) {
                return;
            }
            this.f15358.f77961.mo3480(c15834, c14152.f40371.m18543(new C13370("compiler", "incompatible.ret.type.in.lambda", C13665.m31062(abstractC6462Mo14787))));
            return;
        }
        C4765 c4765 = new C4765();
        c4765.f10797 = true;
        c4765.f10796 = true;
        c15834.f45864.mo3382(c4765);
        boolean z2 = c4765.f10797;
        if (zM14777) {
            if (z2) {
                return;
            }
            this.f15358.f77961.mo3480(c15834, c14152.f40371.m18543(C13665.f38467));
            return;
        }
        if (c4765.f10796) {
            C4848 c4848 = c15834.f45863;
            C7664 c7664 = c14152.f40362;
            c7664.getClass();
            HashMap map = c7664.f20100;
            c7664.f20100 = new HashMap();
            try {
                c15834.f45863 = (C4848) C7480.stream(c15834.f45863).map(new C24248(i, this)).collect(C4848.m10284());
                boolean z3 = c14152.m32633(c15834, this.f15356, c14152.f40365.f31177).f45862;
                c7664.f20100 = map;
                c15834.f45863 = c4848;
                if (z3) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                c7664.f20100 = map;
                c15834.f45863 = c4848;
                throw th;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            C23623 c23623 = c14152.f40356;
            AbstractC7257 abstractC7257 = c15834.f45864;
            abstractC7257.getClass();
            c23623.m9352(abstractC7257, C8300.f22154);
        }
        if (z) {
            return;
        }
        this.f15358.f77961.mo3480(c15834, c14152.f40371.m18543(new C13370("compiler", "incompatible.ret.type.in.lambda", C13665.m31062(abstractC6462Mo14787))));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        mo12739(c10332.f28612);
        mo12739(c10332.f28613);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        m35992(c15164.f43269);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        AbstractC6462 abstractC6462M19478;
        C14152 c14152 = this.f15359.f62478;
        C1446.m31699(c11142.mo25671());
        C24626 c24626 = this.f15358;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        AbstractC6462 abstractC6462 = c24626.f77965;
        if (this.f15357.f4594.contains(abstractC6462)) {
            return;
        }
        try {
            abstractC6462M19478 = c14152.f40358.m19478(abstractC6462);
        } catch (C8194 e) {
            interfaceC6125.mo3480(null, e.m18981());
            abstractC6462M19478 = null;
        }
        C4036 c4036 = this.f15356;
        C4036 c4036M8087 = c4036.m8087(c11142, c4036.f8849);
        AbstractC14355 abstractC14355 = c11142.f30891;
        C24626 c24626M25964 = c14152.f40365.m25964(c11142);
        C7664 c7664 = c14152.f40362;
        c7664.getClass();
        AbstractC14355 abstractC14356 = (AbstractC14355) c14152.m32632(abstractC14355, c4036M8087, c24626M25964, c14152.f40354, null, EnumC9477.SPECULATIVE, new C22417(c7664));
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6463 : abstractC6462M19478.mo14797()) {
            c20271.m45777(AbstractC6462.f16700);
        }
        C11142 c11143 = (C11142) new C21339(c14152.f40357).mo10751((AbstractC7257) c11142, (Object) null);
        c11143.f30891 = abstractC14356;
        C23663 c23663 = c14152.f40368;
        AbstractC6462 abstractC6464 = abstractC14356.f18925;
        AbstractC12224 abstractC12224 = c11142.f30890;
        C4848 c4848M45783 = c20271.m45783();
        C4848 c4848M10283 = C4848.m10283();
        C23663 c23664 = c14152.f40368;
        AbstractC7783 abstractC7783 = (AbstractC7783) c23663.m52665(c4036M8087, c11143, abstractC6464, abstractC12224, c4848M45783, c4848M10283, abstractC6462M19478, c23664.f75322, this.f15357, c23664.f75327).f76952;
        int i = C24229.f76791[abstractC7783.f20405.ordinal()];
        if (i == 1 || i == 2) {
            interfaceC6125.mo3480(c11142, c14152.f40371.m18543(C13665.f38497));
        } else if (i == 3 || i == 4) {
            EnumC14710 enumC14710 = EnumC14710.FRAGMENT;
            AbstractC6462 abstractC6465 = abstractC14356.f18925;
            interfaceC6125.mo3480(c11142, ((AbstractC7570) abstractC7783).mo6320(enumC14710, c11142, abstractC6465.f16705, abstractC6465, c11142.f30890, c20271.m45783(), C4848.m10283()));
        }
    }

    public C6106(C20188 c20188) {
        this.f15359 = c20188;
    }
}
