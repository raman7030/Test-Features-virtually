package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17185 extends AbstractC21749 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f52675;

    public C17185(C5896 c5896) {
        int iM16535 = c5896.m16535();
        this.f52675 = new ArrayList(iM16535);
        for (int i = 0; i < iM16535; i++) {
            this.f52675.add(new C14362(c5896.m16535(), c5896.m16535()));
        }
    }

    @Override // l.InterfaceC19094
    /* JADX INFO: renamed from: ᩷ */
    public final int mo36414() {
        return this.f52675.size();
    }

    @Override // l.InterfaceC19094
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19800 mo36413(int i) {
        return (InterfaceC19800) this.f52675.get(i);
    }
}
