package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17414 extends AbstractC11043 implements InterfaceC18764 {
    public final /* synthetic */ C19532 g;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    @Override // l.AbstractC11043
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 b(Object obj, int i, int i2) {
        return C22291.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17414(C19532 c19532, int i, int i2, int i3, int i4) {
        super(c19532, i, i2, i3, i4);
        this.g = c19532;
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 c(int i, int i2, int i3, int i4) {
        return new C17414(this.g, i, i2, i3, i4);
    }
}
