package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19531 extends AbstractC4008 implements InterfaceC13419, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f63105;

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(nextByte());
    }

    @Override // l.AbstractC4008, java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        InterfaceC20476 c4953;
        if (consumer instanceof InterfaceC20476) {
            c4953 = (InterfaceC20476) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c4953 = new C4953(consumer);
        }
        forEachRemaining((Object) c4953);
    }

    @Override // l.AbstractC4008
    /* JADX INFO: renamed from: ֫ */
    public final void mo12087(int i, Object obj) {
        ((InterfaceC20476) obj).mo14392(this.f63105.f16903[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19531(C5419 c5419) {
        super(c5419);
        this.f63105 = c5419;
    }

    @Override // l.InterfaceC13419
    public final byte nextByte() {
        return this.f63105.f16903[m12086()];
    }
}
