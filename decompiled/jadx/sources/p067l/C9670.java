package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9670 extends AbstractC15843 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C19197 f26640;

    public C9670(C11151 c11151) {
        super(c11151);
        this.f26640 = new C19197(c11151);
    }

    @Override // p067l.AbstractC15843
    /* JADX INFO: renamed from: ֫ */
    public final void mo7362(int i, Object obj) {
        C19197 c19197 = this.f26640;
        c19197.f57376 = i;
        ((Consumer) obj).accept(c19197);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM35958 = m35958();
        C19197 c19197 = this.f26640;
        c19197.f57376 = iM35958;
        return c19197;
    }
}
