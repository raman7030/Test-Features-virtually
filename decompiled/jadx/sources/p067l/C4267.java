package p067l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.֫ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4267 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    public final AbstractC11111 f9465a;

    /* JADX INFO: renamed from: b */
    public InterfaceC16847 f9466b;

    /* JADX INFO: renamed from: c */
    public final long f9467c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentMapC12768 f9468d;

    /* JADX INFO: renamed from: e */
    public final AbstractC21662 f9469e;

    /* JADX INFO: renamed from: f */
    public final C4267 f9470f;

    /* JADX INFO: renamed from: g */
    public InterfaceC7324 f9471g;

    public C4267(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, AbstractC21662 abstractC21662) {
        super(null);
        this.f9465a = abstractC11111;
        this.f9466b = interfaceC16847;
        this.f9467c = AbstractC14874.m33979e(interfaceC16847.estimateSize());
        this.f9468d = new ConcurrentMapC12768(Math.max(16, AbstractC14874.f42400g << 1));
        this.f9469e = abstractC21662;
        this.f9470f = null;
    }

    public C4267(C4267 c4267, InterfaceC16847 interfaceC16847, C4267 c4268) {
        super(c4267);
        this.f9465a = c4267.f9465a;
        this.f9466b = interfaceC16847;
        this.f9467c = c4267.f9467c;
        this.f9468d = c4267.f9468d;
        this.f9469e = c4267.f9469e;
        this.f9470f = c4268;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC16847 interfaceC16847TrySplit;
        InterfaceC16847 interfaceC16847 = this.f9466b;
        long j = this.f9467c;
        boolean z = false;
        C4267 c4267 = this;
        while (interfaceC16847.estimateSize() > j && (interfaceC16847TrySplit = interfaceC16847.trySplit()) != null) {
            C4267 c4268 = new C4267(c4267, interfaceC16847TrySplit, c4267.f9470f);
            C4267 c4269 = new C4267(c4267, interfaceC16847, c4268);
            c4267.addToPendingCount(1);
            c4269.addToPendingCount(1);
            c4267.f9468d.put(c4268, c4269);
            if (c4267.f9470f != null) {
                c4268.addToPendingCount(1);
                if (c4267.f9468d.replace(c4267.f9470f, c4267, c4268)) {
                    c4267.addToPendingCount(-1);
                } else {
                    c4268.addToPendingCount(-1);
                }
            }
            if (z) {
                interfaceC16847 = interfaceC16847TrySplit;
                c4267 = c4268;
                c4268 = c4269;
            } else {
                c4267 = c4269;
            }
            z = !z;
            c4268.fork();
        }
        if (c4267.getPendingCount() > 0) {
            C12789 c12789 = new C12789(19);
            AbstractC11111 abstractC11111 = c4267.f9465a;
            InterfaceC10873 interfaceC10873Mo17909c0 = abstractC11111.mo17909c0(abstractC11111.mo25628R(interfaceC16847), c12789);
            c4267.f9465a.mo25629f0(interfaceC16847, interfaceC10873Mo17909c0);
            c4267.f9471g = interfaceC10873Mo17909c0.build();
            c4267.f9466b = null;
        }
        c4267.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC7324 interfaceC7324 = this.f9471g;
        if (interfaceC7324 != null) {
            interfaceC7324.forEach(this.f9469e);
            this.f9471g = null;
        } else {
            InterfaceC16847 interfaceC16847 = this.f9466b;
            if (interfaceC16847 != null) {
                this.f9465a.mo25629f0(interfaceC16847, this.f9469e);
                this.f9466b = null;
            }
        }
        C4267 c4267 = (C4267) this.f9468d.remove(this);
        if (c4267 != null) {
            c4267.tryComplete();
        }
    }
}
