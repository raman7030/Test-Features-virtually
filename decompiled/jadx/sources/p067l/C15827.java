package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M8XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15827 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C22673 f45848 = new C22673();

    /* JADX INFO: renamed from: ۧ */
    public final C9654 f45849 = new C9654();

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f45848;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        if (interfaceC20543.mo46443()) {
            return null;
        }
        return C16359.m37169(interfaceC20543.getIndex());
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9297(C17859 c17859) {
        this.f45849.m22451(c17859);
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9298(C21332 c21332) {
        this.f45849.m22452(c21332);
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ᩷ */
    public final List mo9303() {
        C17978 c17978 = new C17978();
        for (C5909 c5909 : this.f45849.m22449()) {
            c17978.m40923(c5909.m13284(), c5909);
        }
        Object[] objArr = {c17978};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C12826.requireNonNull(obj);
        arrayList.add(obj);
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ۜ */
    public final void mo9300() {
        C22673 c22673;
        C9654 c9654 = this.f45849;
        Iterator it = c9654.m22449().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c22673 = this.f45848;
            if (!zHasNext) {
                break;
            } else {
                c22673.m3757((C5909) it.next());
            }
        }
        if (c9654.m22453().m43694()) {
            c22673.m3761();
        } else {
            c22673.m3755(c9654.m22454());
        }
    }

    @Override // p067l.AbstractC10484, p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final void mo9296(InterfaceC13285 interfaceC13285) {
        C19201 c19201M22453 = this.f45849.m22453();
        if (c19201M22453.m43694()) {
            return;
        }
        interfaceC13285.mo30351(c19201M22453, this.f45848);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19201 m35933() {
        return this.f45849.m22453();
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m35932(int i) {
        return this.f45849.m22450(i);
    }
}
