package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9QF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15376 extends AbstractC21749 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f47093 = new ArrayList();

    @Override // l.InterfaceC19094
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo36414() {
        return this.f47093.size();
    }

    @Override // l.InterfaceC19094
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19800 mo36413(int i) {
        return (InterfaceC19800) this.f47093.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36411(int i, int i2) {
        this.f47093.add(new C21728(i, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36412(InterfaceC4485 interfaceC4485) {
        interfaceC4485.mo13229((short) 518);
        interfaceC4485.mo13229((short) 12);
        ArrayList arrayList = this.f47093;
        interfaceC4485.writeInt((arrayList.size() * 8) + 12);
        interfaceC4485.writeInt(arrayList.size());
        for (C21728 c21728 : m49070()) {
            interfaceC4485.writeInt(c21728.mo45543());
            interfaceC4485.writeInt(c21728.mo45542());
        }
    }
}
