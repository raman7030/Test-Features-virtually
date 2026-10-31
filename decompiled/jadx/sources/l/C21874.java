package l;

/* JADX INFO: renamed from: l.᩸᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes.dex */
public class C21874 extends AbstractC15501 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC3529 f70049 = ConcurrentMapC14754.f45044;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 f70050;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f70051;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f70052;

    public C21874(Object obj, int i, InterfaceC23927 interfaceC23927) {
        this.f70052 = obj;
        this.f70051 = i;
        this.f70050 = interfaceC23927;
    }

    @Override // l.AbstractC15501, l.InterfaceC23927
    public final Object getKey() {
        return this.f70052;
    }

    @Override // l.AbstractC15501, l.InterfaceC23927
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC3529 mo17644() {
        return this.f70049;
    }

    @Override // l.AbstractC15501, l.InterfaceC23927
    /* JADX INFO: renamed from: ֫ */
    public final void mo17636(InterfaceC3529 interfaceC3529) {
        this.f70049 = interfaceC3529;
    }

    @Override // l.AbstractC15501, l.InterfaceC23927
    public final int getHash() {
        return this.f70051;
    }

    @Override // l.AbstractC15501, l.InterfaceC23927
    public final InterfaceC23927 getNext() {
        return this.f70050;
    }
}
