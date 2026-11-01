package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16235 extends AbstractC6178 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C7519 f47786;

    /* JADX INFO: renamed from: ۫ */
    public C17576 f47787;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16235(C7519 c7519) {
        super(c7519);
        this.f47786 = c7519;
    }

    @Override // p067l.AbstractC6178
    /* JADX INFO: renamed from: ֫ */
    public final void mo14007(int i, Object obj) {
        C17576 c17576 = new C17576(this.f47786, i);
        this.f47787 = c17576;
        ((Consumer) obj).accept(c17576);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17576 c17576 = new C17576(this.f47786, m14006());
        this.f47787 = c17576;
        return c17576;
    }

    @Override // p067l.AbstractC6178, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f47787.f52532 = -1;
    }
}
