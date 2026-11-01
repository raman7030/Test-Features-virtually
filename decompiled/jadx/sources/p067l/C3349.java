package p067l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62B */
/* JADX INFO: loaded from: classes3.dex */
public final class C3349 extends AbstractC20206 implements InterfaceC19897 {

    /* JADX INFO: renamed from: ۗ */
    public final Set f6542;

    /* JADX INFO: renamed from: ۤ */
    public final List f6544;

    /* JADX INFO: renamed from: ۫ */
    public final C14078 f6545;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC20568 f6546;

    /* JADX INFO: renamed from: ᩶ */
    public final C9029 f6547;

    /* JADX INFO: renamed from: ᩸ */
    public int f6548;

    /* JADX INFO: renamed from: ᩹ */
    public int f6549 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f6543 = 0;

    public C3349(C14078 c14078, List list, int i, C9029 c9029, Set set, InterfaceC20568 interfaceC20568) {
        this.f6545 = c14078;
        this.f6544 = list;
        this.f6548 = i;
        this.f6547 = c9029;
        this.f6542 = set;
        this.f6546 = interfaceC20568;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        return this.f6545.f39888.f79220.f25636;
    }

    @Override // p067l.InterfaceC7568
    public final String getName() {
        return this.f6545.f39887.f25636;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final C4000 mo5852() {
        return this.f6545.f39886.f42036;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        return this.f6545.f39886.f42034.f79220.f25636;
    }

    @Override // p067l.InterfaceC19897
    public final List getParameters() {
        return this.f6544;
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ܽ */
    public final int mo5854() {
        return this.f6548;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5851(C3422 c3422) {
        this.f6546 = c3422;
    }

    @Override // p067l.InterfaceC19897
    public final Set getAnnotations() {
        return this.f6547;
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩵ */
    public final Set mo5856() {
        return this.f6542;
    }

    @Override // p067l.InterfaceC19897
    /* JADX INFO: renamed from: ᩷ۧ */
    public final InterfaceC20568 mo5857() {
        return this.f6546;
    }
}
