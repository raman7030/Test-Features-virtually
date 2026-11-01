package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97QO */
/* JADX INFO: loaded from: classes.dex */
public final class C23248 implements InterfaceC22743 {

    /* JADX INFO: renamed from: ֫ */
    public final C22578 f73075;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 f73076;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 f73077;

    public C23248(List list, C22578 c22578, List list2) {
        this.f73077 = AbstractC16192.copyOf((Collection) list);
        this.f73075 = c22578;
        this.f73076 = AbstractC16192.copyOf((Collection) list2);
    }

    @Override // p067l.InterfaceC22743
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16706 mo50894() {
        return this.f73075;
    }

    @Override // p067l.InterfaceC22743
    /* JADX INFO: renamed from: ֫ */
    public final C22578 mo50894() {
        return this.f73075;
    }

    @Override // p067l.InterfaceC22743
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo50895() {
        return this.f73077;
    }

    @Override // p067l.InterfaceC22743
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 mo50896() {
        return this.f73076;
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f73075, "tok");
        c10888M40057.m25084(this.f73077, "toksBefore");
        c10888M40057.m25084(this.f73076, "toksAfter");
        return c10888M40057.toString();
    }
}
