package l;

import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B7T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5902 f9652;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f9653;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16560 f9654;

    public C3080(C16560 c16560, List list) {
        boolean z;
        this.f9654 = c16560;
        this.f9653 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                this.f9651 = z;
            }
        }
        z = false;
        this.f9651 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9413(final RunnableC21134 runnableC21134) {
        C16560 c16560 = this.f9654;
        final AbstractC3163 abstractC3163 = (AbstractC3163) c16560.m39044().mo6020();
        List list = this.f9653;
        if (list.size() == 1) {
            AbstractC17191 abstractC17191 = (AbstractC17191) list.get(0);
            C16477 c16477Mo24428 = abstractC17191.mo24428();
            C5902 c5902 = new C5902(c16560.m39056(), abstractC3163, c16477Mo24428.m38837(), c16477Mo24428.m38833(), this.f9651, new Runnable() { // from class: l.ܶۜ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C3080.m9409(this.f46051, abstractC3163, runnableC21134);
                }
            });
            c5902.m16554(abstractC17191.getName());
            this.f9652 = c5902;
            return;
        }
        C5902 c5903 = new C5902(c16560.m39056(), abstractC3163, null, null, this.f9651, new Runnable() { // from class: l.᩸ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C3080.m9411(this.f68991, abstractC3163, runnableC21134);
            }
        });
        c5903.m16554(C4925.m14306(R.string.MT_Protector, Integer.valueOf(list.size())));
        this.f9652 = c5903;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9409(C3080 c3080, AbstractC3163 abstractC3163, RunnableC21134 runnableC21134) {
        if (c3080.f9652.m16560()) {
            new C4491(c3080, abstractC3163, c3080.f9652.m16558(), c3080.f9652.m16556(), runnableC21134).m20274();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9411(C3080 c3080, AbstractC3163 abstractC3163, RunnableC21134 runnableC21134) {
        new C4491(c3080, abstractC3163, c3080.f9652.m16558(), c3080.f9652.m16556(), runnableC21134).m20274();
    }
}
