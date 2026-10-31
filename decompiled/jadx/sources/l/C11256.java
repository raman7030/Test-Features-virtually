package l;

import java.util.Iterator;
import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۧ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AI4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11256 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f33732;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3612 f33733;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f33734;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16560 f33735;

    public C11256(C16560 c16560, List list) {
        boolean z;
        this.f33735 = c16560;
        this.f33734 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC17889) it.next()).isDirectory()) {
                z = true;
                this.f33732 = z;
            }
        }
        z = false;
        this.f33732 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27858(final RunnableC21134 runnableC21134) {
        List list = this.f33734;
        int size = list.size();
        C16560 c16560 = this.f33735;
        if (size == 1) {
            AbstractC17191 abstractC17191 = (AbstractC17191) ((InterfaceC17889) list.get(0));
            C3612 c3612 = new C3612(c16560.m39056(), abstractC17191.mo24428().m38843(), this.f33732, false, new Runnable() { // from class: l.ۨۜ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C11256.m27853(this.f34472, runnableC21134);
                }
            });
            c3612.m11084();
            this.f33733 = c3612;
            return;
        }
        C3612 c3613 = new C3612(c16560.m39056(), SecP521R1Field.P16, this.f33732, false, new Runnable() { // from class: l.᩺ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                this.f73708.m27856(runnableC21134);
            }
        });
        c3613.m11084();
        this.f33733 = c3613;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27853(C11256 c11256, RunnableC21134 runnableC21134) {
        if (c11256.f33733.m11085()) {
            c11256.m27856(runnableC21134);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m27856(RunnableC21134 runnableC21134) {
        new C2083(this, (AbstractC3163) this.f33735.m39044().mo6020(), this.f33733.m11082(), this.f33733.m11083(), runnableC21134).m20274();
    }
}
