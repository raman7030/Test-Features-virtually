package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18701 extends AbstractC23039 {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f55856;

    public C18701(C7972 c7972) {
        int iM18461 = c7972.m18461();
        this.f55856 = new ArrayList(iM18461);
        for (int i = 0; i < iM18461; i++) {
            this.f55856.add(new C16018(c7972.m18461(), c7972.m18461()));
        }
    }

    @Override // p067l.InterfaceC20516
    /* JADX INFO: renamed from: ᩷ */
    public final int mo38572() {
        return this.f55856.size();
    }

    @Override // p067l.InterfaceC20516
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21187 mo38571(int i) {
        return (InterfaceC21187) this.f55856.get(i);
    }
}
