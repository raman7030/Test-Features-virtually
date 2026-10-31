package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.۟ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7599 extends AbstractC6730 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC12725 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7599(AbstractC12725 abstractC12725, InterfaceC0585 interfaceC0585, int i) {
        super(interfaceC0585);
        this.b = i;
        this.c = abstractC12725;
    }

    @Override // l.AbstractC6730, l.InterfaceC0585
    public void c(long j) {
        switch (this.b) {
            case 4:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // l.InterfaceC5483, l.InterfaceC0585
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept(((DoubleFunction) ((C9053) this.c).t).apply(d));
                return;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((C21753) this.c).t).applyAsDouble(d));
                return;
            case 2:
                ((C13990) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C9738) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                if (((DoublePredicate) ((C21753) this.c).t).test(d)) {
                    this.a.accept(d);
                    return;
                }
                return;
            default:
                ((DoubleConsumer) ((C21753) this.c).t).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
