package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16682 extends RunnableC19366 {

    /* JADX INFO: renamed from: ۛ */
    public C4848 f49101;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C21378 f49102;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16682(C21378 c21378, AbstractC7783 abstractC7783, C4848 c4848) {
        super(c21378, abstractC7783, C4848.m10283());
        this.f49102 = c21378;
        this.f49101 = c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m37755(C4848 c4848) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C22719 c22719 = (C22719) it.next();
            C17939 c17939M36391 = m36391(c22719.f71664);
            c20271.m45777(new C8552(c17939M36391.f29256, c17939M36391.f53589, c22719.f71665));
        }
        return c20271.m45783();
    }

    @Override // p067l.RunnableC19366, java.lang.Runnable
    public final void run() {
        C21378 c21378 = this.f49102;
        InterfaceC19740 interfaceC19740 = c21378.f67397;
        try {
            c21378.f67397 = this.f57814;
            C4848 c4848M37755 = m37755(this.f49101);
            AbstractC7783 abstractC7783 = this.f57816;
            abstractC7783.m17993(c4848M37755.m10292(abstractC7783.mo18000()));
        } finally {
            c21378.f67397 = interfaceC19740;
        }
    }
}
