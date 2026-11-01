package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9QF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16982 extends AbstractC23039 {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f50220 = new ArrayList();

    @Override // p067l.InterfaceC20516
    /* JADX INFO: renamed from: ᩷ */
    public final int mo38572() {
        return this.f50220.size();
    }

    @Override // p067l.InterfaceC20516
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21187 mo38571(int i) {
        return (InterfaceC21187) this.f50220.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38569(int i, int i2) {
        this.f50220.add(new C23019(i, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38570(InterfaceC6631 interfaceC6631) {
        interfaceC6631.mo15111((short) 518);
        interfaceC6631.mo15111((short) 12);
        ArrayList arrayList = this.f50220;
        interfaceC6631.writeInt((arrayList.size() * 8) + 12);
        interfaceC6631.writeInt(arrayList.size());
        for (C23019 c23019 : m51419()) {
            interfaceC6631.writeInt(c23019.mo47854());
            interfaceC6631.writeInt(c23019.mo47853());
        }
    }
}
