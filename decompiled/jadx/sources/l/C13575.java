package l;

import bin.mt.plus.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes4.dex */
public final class C13575 implements InterfaceC8365 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f40493;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f40494;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f40495;

    @Override // l.InterfaceC8365
    public final String getId() {
        return ":dictionary:translator";
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫ */
    public final int mo6551(int i, String str) {
        return -1;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫ */
    public final void mo6553() {
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫ */
    public final void mo6554(int i) {
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6555() {
        return false;
    }

    public C13575() {
        m32632(C1789.m5956());
        this.f40495 = Arrays.asList(new C5543("f", C4925.m14327(R.string.MT_Protector)), new C5543("r", C4925.m14327(R.string.MT_Protector)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32632(List list) {
        List list2 = this.f40493;
        if (list2 != null && list2.equals(list)) {
            return false;
        }
        this.f40493 = list;
        this.f40494 = list.isEmpty() ? Collections.singletonList(new C5543("", "----")) : (List) C5378.stream(list).map(new C21673(1)).collect(C22976.toList());
        return true;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ᩳ */
    public final List mo6558() {
        return this.f40494;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ܽ */
    public final List mo6556() {
        return this.f40495;
    }

    @Override // l.InterfaceC8365
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13303 mo6552(C1309 c1309, C1309 c13010) {
        return new C22748(this.f40493.isEmpty() ? null : (C19866) this.f40493.get(c1309.f4710), c13010.f4710 == 0);
    }

    public final String toString() {
        return C4925.m14327(R.string.MT_Protector);
    }
}
