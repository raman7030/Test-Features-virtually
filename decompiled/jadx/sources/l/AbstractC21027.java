package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.᩷ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21027 extends AbstractC11854 implements LongConsumer, InterfaceC0418 {
    public final LongPredicate e;
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C19470.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    public AbstractC21027(InterfaceC0418 interfaceC0418, LongPredicate longPredicate) {
        super(interfaceC0418);
        this.e = longPredicate;
    }

    public AbstractC21027(InterfaceC0418 interfaceC0418, AbstractC21027 abstractC21027) {
        super(interfaceC0418, abstractC21027);
        this.e = abstractC21027.e;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.f = j;
    }

    @Override // l.InterfaceC1124
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
