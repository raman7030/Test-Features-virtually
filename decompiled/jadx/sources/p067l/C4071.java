package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4071 extends AbstractC14874 {

    /* JADX INFO: renamed from: h */
    public final AbstractC14463 f8955h;

    /* JADX INFO: renamed from: i */
    public final IntFunction f8956i;

    /* JADX INFO: renamed from: j */
    public final boolean f8957j;

    /* JADX INFO: renamed from: k */
    public long f8958k;

    /* JADX INFO: renamed from: l */
    public long f8959l;

    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC7324 interfaceC7324M25597L;
        AbstractC14874 abstractC14874 = this.f42404d;
        if (abstractC14874 != null) {
            if (this.f8957j) {
                C4071 c4071 = (C4071) abstractC14874;
                long j = c4071.f8959l;
                this.f8959l = j;
                if (j == c4071.f8958k) {
                    this.f8959l = j + ((C4071) this.f42405e).f8959l;
                }
            }
            C4071 c4072 = (C4071) abstractC14874;
            long j2 = c4072.f8958k;
            C4071 c4073 = (C4071) this.f42405e;
            this.f8958k = j2 + c4073.f8958k;
            if (c4072.f8958k == 0) {
                interfaceC7324M25597L = (InterfaceC7324) c4073.f42406f;
            } else {
                interfaceC7324M25597L = c4073.f8958k == 0 ? (InterfaceC7324) c4072.f42406f : AbstractC11111.m25597L(this.f8955h.mo17912m0(), (InterfaceC7324) ((C4071) this.f42404d).f42406f, (InterfaceC7324) ((C4071) this.f42405e).f42406f);
            }
            InterfaceC7324 interfaceC7324Mo3497j = interfaceC7324M25597L;
            if (m33980b() && this.f8957j) {
                interfaceC7324Mo3497j = interfaceC7324Mo3497j.mo3497j(this.f8959l, interfaceC7324Mo3497j.count(), this.f8956i);
            }
            this.f42406f = interfaceC7324Mo3497j;
        }
        super.onCompletion(countedCompleter);
    }

    public C4071(AbstractC14463 abstractC14463, AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        super(abstractC11111, interfaceC16847);
        this.f8955h = abstractC14463;
        this.f8956i = intFunction;
        this.f8957j = EnumC9335.ORDERED.m21660s(((AbstractC14463) abstractC11111).f41316m);
    }

    public C4071(C4071 c4071, InterfaceC16847 interfaceC16847) {
        super(c4071, interfaceC16847);
        this.f8955h = c4071.f8955h;
        this.f8956i = c4071.f8956i;
        this.f8957j = c4071.f8957j;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C4071(this, interfaceC16847);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        long jMo25628R;
        boolean zM33980b = m33980b();
        if (zM33980b || !this.f8957j) {
            jMo25628R = -1;
        } else {
            EnumC9335 enumC9335 = EnumC9335.SIZED;
            AbstractC14463 abstractC14463 = this.f8955h;
            int i = abstractC14463.f41313j;
            int i2 = enumC9335.f25432e;
            if ((i & i2) == i2) {
                jMo25628R = abstractC14463.mo25628R(this.f42402b);
            } else {
                jMo25628R = -1;
            }
        }
        InterfaceC10873 interfaceC10873Mo17909c0 = this.f42401a.mo17909c0(jMo25628R, this.f8956i);
        InterfaceC21251 interfaceC21251Mo9492d = ((InterfaceC4486) this.f8955h).mo9492d(interfaceC10873Mo17909c0, this.f8957j && !zM33980b);
        this.f42401a.mo25629f0(this.f42402b, interfaceC21251Mo9492d);
        InterfaceC7324 interfaceC7324Build = interfaceC10873Mo17909c0.build();
        this.f8958k = interfaceC7324Build.count();
        this.f8959l = interfaceC21251Mo9492d.mo6574h();
        return interfaceC7324Build;
    }
}
