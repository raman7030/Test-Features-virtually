package p067l;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.۟ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9591 extends AbstractC8765 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26397b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC14463 f26398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9591(AbstractC14463 abstractC14463, InterfaceC2925 interfaceC2925, int i) {
        super(interfaceC2925);
        this.f26397b = i;
        this.f26398c = abstractC14463;
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public void mo4231c(long j) {
        switch (this.f26397b) {
            case 4:
                this.f23785a.mo4231c(-1L);
                break;
            default:
                super.mo4231c(j);
                break;
        }
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        switch (this.f26397b) {
            case 0:
                this.f23785a.accept(((DoubleFunction) ((C10973) this.f26398c).f30392t).apply(d));
                return;
            case 1:
                this.f23785a.accept(((DoubleUnaryOperator) ((C23043) this.f26398c).f72427t).applyAsDouble(d));
                return;
            case 2:
                ((C15665) this.f26398c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C11624) this.f26398c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                if (((DoublePredicate) ((C23043) this.f26398c).f72427t).test(d)) {
                    this.f23785a.accept(d);
                    return;
                }
                return;
            default:
                ((DoubleConsumer) ((C23043) this.f26398c).f72427t).accept(d);
                this.f23785a.accept(d);
                return;
        }
    }
}
