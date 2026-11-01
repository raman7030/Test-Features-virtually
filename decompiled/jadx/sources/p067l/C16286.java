package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16286 extends C21529 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f47868 = true;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 f47869;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C25004 f47870;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 f47871;

    public C16286(C25004 c25004, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        this.f47870 = c25004;
        this.f47871 = abstractC6462;
        this.f47869 = abstractC6463;
    }

    @Override // p067l.AbstractC16833
    /* JADX INFO: renamed from: ᩳ */
    public final void mo37081() {
        this.f47868 = false;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        mo12739(m37079(c10332.f28612));
        mo12739(m37079(c10332.f28613));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        EnumC11353 enumC11353 = EnumC11353.VOID;
        AbstractC6462 abstractC6462 = this.f47869;
        if (abstractC6462.m14777(enumC11353)) {
            this.f47868 = this.f47868;
            return;
        }
        AbstractC6462 abstractC6463 = this.f47871;
        boolean z = false;
        if (abstractC6463.m14777(enumC11353)) {
            this.f47868 = false;
            return;
        }
        if (abstractC6463.mo14805() != abstractC6462.mo14805()) {
            boolean z2 = c11142.f30887 == EnumC21201.STANDALONE && c11142.f30889.f20406.mo14787().mo14805();
            boolean z3 = this.f47868;
            if (z2 == abstractC6463.mo14805() && z2 != abstractC6462.mo14805()) {
                z = true;
            }
            this.f47868 = z3 & z;
            return;
        }
        this.f47868 &= this.f47870.m54913(abstractC6463, abstractC6462);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        mo12739(m37079(c16505.f48507));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        C4848<AbstractC14355> c4848M45783;
        EnumC11353 enumC11353 = EnumC11353.VOID;
        AbstractC6462 abstractC6462 = this.f47869;
        if (abstractC6462.m14777(enumC11353)) {
            this.f47868 = this.f47868;
            return;
        }
        AbstractC6462 abstractC6463 = this.f47871;
        if (abstractC6463.m14777(enumC11353)) {
            this.f47868 = false;
            return;
        }
        if (c15834.m35951() == EnumC15394.EXPRESSION) {
            c4848M45783 = C4848.m10276of((Object) m37079((AbstractC14355) c15834.f45864));
        } else {
            C20271 c20271 = new C20271();
            new C18969(this, c20271).mo12739(c15834.f45864);
            c4848M45783 = c20271.m45783();
        }
        boolean zIsEmpty = c4848M45783.isEmpty();
        C25004 c25004 = this.f47870;
        if (!zIsEmpty && c25004.m54917(abstractC6463, abstractC6462)) {
            Iterator it = c4848M45783.iterator();
            while (it.hasNext()) {
                this.f47868 = c25004.m54914(abstractC6463, abstractC6462, (AbstractC14355) it.next()) & this.f47868;
            }
            return;
        }
        if (!c4848M45783.isEmpty() && abstractC6463.mo14805() != abstractC6462.mo14805()) {
            for (AbstractC14355 abstractC14355 : c4848M45783) {
                boolean z = true;
                boolean z2 = abstractC14355.mo14738() && abstractC14355.f18925.mo14805();
                boolean z3 = this.f47868;
                if (z2 != abstractC6463.mo14805() || z2 == abstractC6462.mo14805()) {
                    z = false;
                }
                this.f47868 = z3 & z;
            }
            return;
        }
        this.f47868 &= c25004.m54913(abstractC6463, abstractC6462);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public AbstractC14355 m37079(AbstractC14355 abstractC14355) {
        if (abstractC14355.f18925.m14777(EnumC11353.DEFERRED)) {
            C3423 c3423 = (C3423) abstractC14355.f18925;
            C25004 c25004 = this.f47870;
            AbstractC7257 abstractC7257Mo6081 = c3423.mo6081(c25004.f49524);
            if (abstractC7257Mo6081 != c25004.f79819.f24150.f75332.f40369) {
                return (AbstractC14355) abstractC7257Mo6081;
            }
        }
        return abstractC14355;
    }
}
