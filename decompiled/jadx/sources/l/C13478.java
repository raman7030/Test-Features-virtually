package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13478 implements InterfaceC7129 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f40258;

    public C13478(C22651 c22651) {
        this.f40258 = c22651.f73159;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32516(char c) {
        return this.f40258.get(c);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22651 m32515() {
        return new C22651((BitSet) this.f40258.clone());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22651 m32514() {
        return new C22651(new BitSet());
    }
}
