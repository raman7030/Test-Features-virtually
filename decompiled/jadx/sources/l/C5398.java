package l;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۚܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5398 extends AbstractC6024 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC12725 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5398(AbstractC12725 abstractC12725, InterfaceC0585 interfaceC0585, int i) {
        super(interfaceC0585);
        this.b = i;
        this.c = abstractC12725;
    }

    @Override // l.AbstractC6024, l.InterfaceC0585
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

    @Override // l.InterfaceC14696, l.InterfaceC0585
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((LongFunction) ((C9053) this.c).t).apply(j));
                return;
            case 1:
                this.a.accept(((LongUnaryOperator) ((C21732) this.c).t).applyAsLong(j));
                return;
            case 2:
                ((C13990) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C23142) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                if (((LongPredicate) ((C21732) this.c).t).test(j)) {
                    this.a.accept(j);
                    return;
                }
                return;
            default:
                ((LongConsumer) ((C21732) this.c).t).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
