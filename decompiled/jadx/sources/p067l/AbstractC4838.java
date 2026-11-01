package p067l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ۖܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4838 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7324 f11003a;

    /* JADX INFO: renamed from: b */
    public final int f11004b;

    /* JADX INFO: renamed from: a */
    public abstract void mo10264a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC4838 mo10265b(int i, int i2);

    public AbstractC4838(InterfaceC7324 interfaceC7324) {
        this.f11003a = interfaceC7324;
        this.f11004b = 0;
    }

    public AbstractC4838(AbstractC4838 abstractC4838, InterfaceC7324 interfaceC7324, int i) {
        super(abstractC4838);
        this.f11003a = interfaceC7324;
        this.f11004b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC4838 abstractC4838Mo10265b = this;
        while (abstractC4838Mo10265b.f11003a.mo3500o() != 0) {
            abstractC4838Mo10265b.setPendingCount(abstractC4838Mo10265b.f11003a.mo3500o() - 1);
            int i = 0;
            int iCount = 0;
            while (i < abstractC4838Mo10265b.f11003a.mo3500o() - 1) {
                AbstractC4838 abstractC4838Mo10265b2 = abstractC4838Mo10265b.mo10265b(i, abstractC4838Mo10265b.f11004b + iCount);
                iCount = (int) (abstractC4838Mo10265b2.f11003a.count() + ((long) iCount));
                abstractC4838Mo10265b2.fork();
                i++;
            }
            abstractC4838Mo10265b = abstractC4838Mo10265b.mo10265b(i, abstractC4838Mo10265b.f11004b + iCount);
        }
        abstractC4838Mo10265b.mo10264a();
        abstractC4838Mo10265b.propagateCompletion();
    }
}
