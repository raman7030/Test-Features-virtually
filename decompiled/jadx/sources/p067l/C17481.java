package p067l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17481 extends AbstractC18898 {

    /* JADX INFO: renamed from: j */
    public final AbstractC14463 f52280j;

    /* JADX INFO: renamed from: k */
    public final IntFunction f52281k;

    /* JADX INFO: renamed from: l */
    public final boolean f52282l;

    /* JADX INFO: renamed from: m */
    public long f52283m;

    /* JADX INFO: renamed from: n */
    public boolean f52284n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f52285o;

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: f */
    public final void mo39846f() {
        this.f56421i = true;
        if (this.f52282l && this.f52285o) {
            mo33981d(AbstractC11111.m25599P(this.f52280j.mo17912m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // p067l.AbstractC14874, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C17481 c17481;
        C17481 c17482;
        Object objM25597L;
        AbstractC14874 abstractC14874 = this.f42404d;
        if (abstractC14874 != null) {
            this.f52284n = ((C17481) abstractC14874).f52284n | ((C17481) this.f42405e).f52284n;
            if (this.f52282l && this.f56421i) {
                this.f52283m = 0L;
                objM25597L = AbstractC11111.m25599P(this.f52280j.mo17912m0());
            } else if (this.f52282l) {
                C17481 c17483 = (C17481) this.f42404d;
                if (c17483.f52284n) {
                    this.f52283m = c17483.f52283m;
                    objM25597L = (InterfaceC7324) c17483.m43001i();
                } else {
                    c17481 = (C17481) this.f42404d;
                    long j = c17481.f52283m;
                    c17482 = (C17481) this.f42405e;
                    this.f52283m = j + c17482.f52283m;
                    if (c17481.f52283m == 0) {
                        objM25597L = (InterfaceC7324) c17482.m43001i();
                    } else if (c17482.f52283m == 0) {
                        objM25597L = (InterfaceC7324) c17481.m43001i();
                    } else {
                        objM25597L = AbstractC11111.m25597L(this.f52280j.mo17912m0(), (InterfaceC7324) ((C17481) this.f42404d).m43001i(), (InterfaceC7324) ((C17481) this.f42405e).m43001i());
                    }
                }
            } else {
                c17481 = (C17481) this.f42404d;
                long j2 = c17481.f52283m;
                c17482 = (C17481) this.f42405e;
                this.f52283m = j2 + c17482.f52283m;
                if (c17481.f52283m == 0) {
                    objM25597L = (InterfaceC7324) c17482.m43001i();
                } else if (c17482.f52283m == 0) {
                    objM25597L = (InterfaceC7324) c17481.m43001i();
                } else {
                    objM25597L = AbstractC11111.m25597L(this.f52280j.mo17912m0(), (InterfaceC7324) ((C17481) this.f42404d).m43001i(), (InterfaceC7324) ((C17481) this.f42405e).m43001i());
                }
            }
            mo33981d(objM25597L);
        }
        this.f52285o = true;
        super.onCompletion(countedCompleter);
    }

    public C17481(AbstractC14463 abstractC14463, AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        super(abstractC11111, interfaceC16847);
        this.f52280j = abstractC14463;
        this.f52281k = intFunction;
        this.f52282l = EnumC9335.ORDERED.m21660s(((AbstractC14463) abstractC11111).f41316m);
    }

    public C17481(C17481 c17481, InterfaceC16847 interfaceC16847) {
        super(c17481, interfaceC16847);
        this.f52280j = c17481.f52280j;
        this.f52281k = c17481.f52281k;
        this.f52282l = c17481.f52282l;
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: c */
    public final AbstractC14874 mo8156c(InterfaceC16847 interfaceC16847) {
        return new C17481(this, interfaceC16847);
    }

    @Override // p067l.AbstractC18898
    /* JADX INFO: renamed from: h */
    public final Object mo8627h() {
        return AbstractC11111.m25599P(this.f52280j.mo17912m0());
    }

    @Override // p067l.AbstractC14874
    /* JADX INFO: renamed from: a */
    public final Object mo8155a() {
        InterfaceC10873 interfaceC10873Mo17909c0 = this.f42401a.mo17909c0(-1L, this.f52281k);
        InterfaceC2925 interfaceC2925Mo4008q0 = this.f52280j.mo4008q0(((AbstractC14463) this.f42401a).f41316m, interfaceC10873Mo17909c0);
        AbstractC11111 abstractC11111 = this.f42401a;
        boolean zMo25626N = abstractC11111.mo25626N(this.f42402b, abstractC11111.mo25630g0(interfaceC2925Mo4008q0));
        this.f52284n = zMo25626N;
        if (zMo25626N) {
            m43000g();
        }
        InterfaceC7324 interfaceC7324Build = interfaceC10873Mo17909c0.build();
        this.f52283m = interfaceC7324Build.count();
        return interfaceC7324Build;
    }
}
