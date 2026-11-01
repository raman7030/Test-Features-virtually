package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24422 extends AbstractC15843 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C11151 f77328;

    /* JADX INFO: renamed from: ۫ */
    public C19197 f77329;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24422(C11151 c11151) {
        super(c11151);
        this.f77328 = c11151;
    }

    @Override // p067l.AbstractC15843
    /* JADX INFO: renamed from: ֫ */
    public final void mo7362(int i, Object obj) {
        C19197 c19197 = new C19197(this.f77328, i);
        this.f77329 = c19197;
        ((Consumer) obj).accept(c19197);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19197 c19197 = new C19197(this.f77328, m35958());
        this.f77329 = c19197;
        return c19197;
    }

    @Override // p067l.AbstractC15843, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f77329.f57376 = -1;
    }
}
