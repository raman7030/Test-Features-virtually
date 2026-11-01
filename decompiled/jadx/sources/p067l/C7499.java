package p067l;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۚܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7499 extends AbstractC8094 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f19642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC14463 f19643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7499(AbstractC14463 abstractC14463, InterfaceC2925 interfaceC2925, int i) {
        super(interfaceC2925);
        this.f19642b = i;
        this.f19643c = abstractC14463;
    }

    @Override // p067l.AbstractC8094, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        switch (this.f19642b) {
            case 4:
                this.f21348a.mo4231c(-1L);
                break;
            default:
                super.mo4231c(j);
                break;
        }
    }

    @Override // p067l.InterfaceC16336, p067l.InterfaceC2925
    public final void accept(long j) {
        switch (this.f19642b) {
            case 0:
                this.f21348a.accept(((LongFunction) ((C10973) this.f19643c).f30392t).apply(j));
                return;
            case 1:
                this.f21348a.accept(((LongUnaryOperator) ((C23023) this.f19643c).f72404t).applyAsLong(j));
                return;
            case 2:
                ((C15665) this.f19643c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C24363) this.f19643c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                if (((LongPredicate) ((C23023) this.f19643c).f72404t).test(j)) {
                    this.f21348a.accept(j);
                    return;
                }
                return;
            default:
                ((LongConsumer) ((C23023) this.f19643c).f72404t).accept(j);
                this.f21348a.accept(j);
                return;
        }
    }
}
