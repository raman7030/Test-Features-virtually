package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4259 extends AbstractC11043 implements InterfaceC0418 {
    public final /* synthetic */ C4964 g;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    @Override // l.AbstractC11043
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        C22291.a(((long[]) C11003.requireNonNull(jArr)).length, i, i3);
        return new C20861(jArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4259(C4964 c4964, int i, int i2, int i3, int i4) {
        super(c4964, i, i2, i3, i4);
        this.g = c4964;
    }

    @Override // l.AbstractC11043
    public final InterfaceC1124 c(int i, int i2, int i3, int i4) {
        return new C4259(this.g, i, i2, i3, i4);
    }
}
