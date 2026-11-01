package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20931 extends AbstractC6178 implements InterfaceC15122, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7519 f65725;

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // p067l.AbstractC6178, java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC21829 c7076;
        if (consumer instanceof InterfaceC21829) {
            c7076 = (InterfaceC21829) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c7076 = new C7076(consumer);
        }
        forEachRemaining((Object) c7076);
    }

    @Override // p067l.AbstractC6178
    /* JADX INFO: renamed from: ֫ */
    public final void mo14007(int i, Object obj) {
        ((InterfaceC21829) obj).mo16295(this.f65725.f19741[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20931(C7519 c7519) {
        super(c7519);
        this.f65725 = c7519;
    }

    @Override // p067l.InterfaceC15122
    public final byte nextByte() {
        return this.f65725.f19741[m14006()];
    }
}
