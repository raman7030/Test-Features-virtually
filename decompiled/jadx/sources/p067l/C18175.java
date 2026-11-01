package p067l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public class C18175 extends C21529 implements InterfaceC20859, InterfaceC5930 {

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashSet f54255;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C14152 f54256;

    /* JADX INFO: renamed from: ܽ */
    public C2733 f54257;

    /* JADX INFO: renamed from: ܿ */
    public LinkedHashSet f54258;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC6462 f54259;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3619(C15834 c15834) {
        C2733 c2733 = this.f54257;
        boolean zContains = c2733.f4594.contains(this.f54259);
        LinkedHashSet linkedHashSet = this.f54258;
        if (zContains) {
            linkedHashSet.add(this.f54259);
        }
        C14152 c14152 = this.f54256;
        if (c14152.f40358.m19498(this.f54259)) {
            AbstractC6462 abstractC6462M19478 = c14152.f40358.m19478(this.f54259);
            C4848 c4848M4268 = c2733.m4268(abstractC6462M19478.mo14797());
            if (c15834.f45861 == EnumC18517.IMPLICIT && c4848M4268.m10293()) {
                linkedHashSet.addAll(c4848M4268);
                C4848 c4848M4262 = c2733.m4262(abstractC6462M19478.mo14787());
                LinkedHashSet linkedHashSet2 = this.f54255;
                linkedHashSet2.addAll(c4848M4262);
                linkedHashSet2.addAll(c2733.m4268(abstractC6462M19478.mo14794()));
            }
            AbstractC6462 abstractC6462Mo14787 = abstractC6462M19478.mo14787();
            if (c15834.m35951() == EnumC15394.EXPRESSION) {
                AbstractC6462 abstractC6462 = this.f54259;
                try {
                    this.f54259 = abstractC6462Mo14787;
                    mo12739(c15834.f45864);
                    return;
                } finally {
                    this.f54259 = abstractC6462;
                }
            }
            new C4094(this, abstractC6462Mo14787).mo12739(c15834.f45864);
        }
    }

    @Override // p067l.InterfaceC20859
    /* JADX INFO: renamed from: ֫ */
    public boolean mo30640() {
        return !this.f54258.isEmpty();
    }

    @Override // p067l.InterfaceC20859
    /* JADX INFO: renamed from: ܽ */
    public final Set mo30642() {
        return this.f54258;
    }

    @Override // p067l.InterfaceC20859
    /* JADX INFO: renamed from: ۧ */
    public final Set mo30641() {
        return this.f54255;
    }

    public C18175(C14152 c14152, C24626 c24626, C3423 c3423) {
        this.f54256 = c14152;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f54258 = linkedHashSet;
        this.f54255 = new LinkedHashSet();
        this.f54259 = c24626.f77965;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        this.f54257 = interfaceC6125.mo6098();
        mo12739(c3423.f6819);
        if (linkedHashSet.isEmpty()) {
            return;
        }
        interfaceC6125.mo6098().m4255(C4848.m10279((Iterable) linkedHashSet), this);
    }

    @Override // p067l.InterfaceC5930
    /* JADX INFO: renamed from: ֫ */
    public final void mo6905(C2733 c2733) {
        this.f54258.clear();
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3804(C11142 c11142) {
        mo12739(c11142.f30891);
        C2733 c2733 = this.f54257;
        boolean zContains = c2733.f4594.contains(this.f54259);
        LinkedHashSet linkedHashSet = this.f54258;
        if (zContains) {
            linkedHashSet.add(this.f54259);
            return;
        }
        C14152 c14152 = this.f54256;
        if (c14152.f40358.m19498(this.f54259)) {
            AbstractC6462 abstractC6462M19478 = c14152.f40358.m19478(this.f54259);
            C4848 c4848M4268 = c2733.m4268(abstractC6462M19478.mo14797());
            if (!c4848M4268.m10293() || c11142.mo25671() == EnumC8459.UNOVERLOADED) {
                return;
            }
            linkedHashSet.addAll(c4848M4268);
            C4848 c4848M4262 = c2733.m4262(abstractC6462M19478.mo14787());
            LinkedHashSet linkedHashSet2 = this.f54255;
            linkedHashSet2.addAll(c4848M4262);
            linkedHashSet2.addAll(c2733.m4268(abstractC6462M19478.mo14794()));
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        new C12812(this).m35992(c15164.f43269);
    }
}
