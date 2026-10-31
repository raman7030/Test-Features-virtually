package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ۖܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2598 extends CountedCompleter {
    public final InterfaceC5214 a;
    public final int b;

    public abstract void a();

    public abstract AbstractC2598 b(int i, int i2);

    public AbstractC2598(InterfaceC5214 interfaceC5214) {
        this.a = interfaceC5214;
        this.b = 0;
    }

    public AbstractC2598(AbstractC2598 abstractC2598, InterfaceC5214 interfaceC5214, int i) {
        super(abstractC2598);
        this.a = interfaceC5214;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC2598 abstractC2598B = this;
        while (abstractC2598B.a.o() != 0) {
            abstractC2598B.setPendingCount(abstractC2598B.a.o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC2598B.a.o() - 1) {
                AbstractC2598 abstractC2598B2 = abstractC2598B.b(i, abstractC2598B.b + iCount);
                iCount = (int) (abstractC2598B2.a.count() + ((long) iCount));
                abstractC2598B2.fork();
                i++;
            }
            abstractC2598B = abstractC2598B.b(i, abstractC2598B.b + iCount);
        }
        abstractC2598B.a();
        abstractC2598B.propagateCompletion();
    }
}
