package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15177 implements InterfaceC9143 {

    /* JADX INFO: renamed from: ֫ */
    public final BitSet f43328;

    public C15177(C23895 c23895) {
        this.f43328 = c23895.f75885;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34618(char c) {
        return this.f43328.get(c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23895 m34617() {
        return new C23895((BitSet) this.f43328.clone());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23895 m34616() {
        return new C23895(new BitSet());
    }
}
