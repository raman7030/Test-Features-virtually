package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: l.᩵ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20836 extends AbstractC14874 {

    /* JADX INFO: renamed from: h */
    public final AbstractC11111 f65466h;

    /* JADX INFO: renamed from: i */
    public final LongFunction f65467i;

    /* JADX INFO: renamed from: j */
    public final BinaryOperator f65468j;

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC14874 abstractC14874 = this.f42404d;
        if (abstractC14874 != null) {
            this.f42406f = (InterfaceC7324) this.f65468j.apply((InterfaceC7324) ((C20836) abstractC14874).f42406f, (InterfaceC7324) ((C20836) this.f42405e).f42406f);
        }
        super.onCompletion(countedCompleter);
    }

    public C20836(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC11111, interfaceC16847);
        this.f65466h = abstractC11111;
        this.f65467i = longFunction;
        this.f65468j = binaryOperator;
    }

    public C20836(C20836 c20836, InterfaceC16847 interfaceC16847) {
        super(c20836, interfaceC16847);
        this.f65466h = c20836.f65466h;
        this.f65467i = c20836.f65467i;
        this.f65468j = c20836.f65468j;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C20836(this, interfaceC16847);
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC7324 mo8155a() {
        InterfaceC10873 interfaceC10873 = (InterfaceC10873) this.f65467i.apply(this.f65466h.mo25628R(this.f42402b));
        this.f65466h.mo25629f0(this.f42402b, interfaceC10873);
        return interfaceC10873.build();
    }
}
