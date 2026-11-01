package p067l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.᩷ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22353 extends AbstractC13635 implements LongConsumer, InterfaceC2766 {

    /* JADX INFO: renamed from: e */
    public final LongPredicate f70552e;

    /* JADX INFO: renamed from: f */
    public long f70553f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.AbstractC13635, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20873.m47164a(this, consumer);
    }

    @Override // p067l.InterfaceC3437
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C20873.$default$forEachRemaining(this, longConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C20873.m47165b(this, consumer);
    }

    public AbstractC22353(InterfaceC2766 interfaceC2766, LongPredicate longPredicate) {
        super(interfaceC2766);
        this.f70552e = longPredicate;
    }

    public AbstractC22353(InterfaceC2766 interfaceC2766, AbstractC22353 abstractC22353) {
        super(interfaceC2766, abstractC22353);
        this.f70552e = abstractC22353.f70552e;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f38388d = (this.f38388d + 1) & 63;
        this.f70553f = j;
    }

    @Override // p067l.InterfaceC3437
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
