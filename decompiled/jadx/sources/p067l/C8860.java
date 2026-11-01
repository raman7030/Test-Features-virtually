package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8860 extends AbstractC6178 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C17576 f24037;

    public C8860(C7519 c7519) {
        super(c7519);
        this.f24037 = new C17576(c7519);
    }

    @Override // p067l.AbstractC6178
    /* JADX INFO: renamed from: ֫ */
    public final void mo14007(int i, Object obj) {
        C17576 c17576 = this.f24037;
        c17576.f52532 = i;
        ((Consumer) obj).accept(c17576);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM14006 = m14006();
        C17576 c17576 = this.f24037;
        c17576.f52532 = iM14006;
        return c17576;
    }
}
