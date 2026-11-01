package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19237 extends AbstractC17224 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C20579 f57495;

    /* JADX INFO: renamed from: ۫ */
    public C11191 f57496;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19237(C20579 c20579) {
        super(c20579);
        this.f57495 = c20579;
    }

    @Override // p067l.AbstractC17224
    /* JADX INFO: renamed from: ֫ */
    public final void mo13104(int i, Object obj) {
        C11191 c11191 = new C11191(this.f57495, i);
        this.f57496 = c11191;
        ((Consumer) obj).accept(c11191);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C11191 c11191 = new C11191(this.f57495, m38995());
        this.f57496 = c11191;
        return c11191;
    }

    @Override // p067l.AbstractC17224, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f57496.f31071 = -1;
    }
}
