package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: l.᩵ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C19431 extends AbstractC13158 {
    public final AbstractC9198 h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC13158 abstractC13158 = this.d;
        if (abstractC13158 != null) {
            this.f = (InterfaceC5214) this.j.apply((InterfaceC5214) ((C19431) abstractC13158).f, (InterfaceC5214) ((C19431) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public C19431(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC9198, interfaceC15234);
        this.h = abstractC9198;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public C19431(C19431 c19431, InterfaceC15234 interfaceC15234) {
        super(c19431, interfaceC15234);
        this.h = c19431.h;
        this.i = c19431.i;
        this.j = c19431.j;
    }

    @Override // l.AbstractC13158
    public AbstractC13158 c(InterfaceC15234 interfaceC15234) {
        return new C19431(this, interfaceC15234);
    }

    @Override // l.AbstractC13158
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5214 a() {
        InterfaceC8948 interfaceC8948 = (InterfaceC8948) this.i.apply(this.h.R(this.b));
        this.h.f0(this.b, interfaceC8948);
        return interfaceC8948.build();
    }
}
