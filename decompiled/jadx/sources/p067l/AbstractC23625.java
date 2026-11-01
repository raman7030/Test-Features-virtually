package p067l;

import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩹ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AIU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23625 extends AbstractC5996 {

    /* JADX INFO: renamed from: ۖ֫ */
    public static final /* synthetic */ int f75197 = 0;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f75198;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f75199;

    public AbstractC23625() {
        new AtomicBoolean();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 mo12166(AbstractActivityC5549 abstractActivityC5549) {
        final C23298 c23298 = new C23298(abstractActivityC5549);
        c23298.m51879((Runnable) new RunnableC20875(5, this));
        c23298.m51880(new ViewOnClickListenerC4464(2, c23298));
        m13468().m4066(c23298.m53441(), new InterfaceC3326() { // from class: l.ܶܶۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                AbstractC23625.m52466(this.f50084, c23298);
            }
        });
        c23298.m51884();
        return c23298.m53441();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52466(AbstractC23625 abstractC23625, C23298 c23298) {
        if (abstractC23625.m13497()) {
            c23298.m51890(abstractC23625.m13493());
        }
        if (abstractC23625.m13483()) {
            c23298.m51892(abstractC23625.m13470());
        }
        if (abstractC23625.f75198) {
            c23298.m51881();
            c23298.m51889(abstractC23625.m13475());
        } else {
            c23298.m51893();
            c23298.m51889(abstractC23625.f75199);
            c23298.m51886(abstractC23625.m13475());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m52470(long j, long j2) {
        m52469(C20689.m46750(j, j2));
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m52469(int i) {
        if (this.f75199 != i) {
            this.f75199 = i;
            m13495();
        }
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final void m52468() {
        if (this.f75198) {
            return;
        }
        this.f75198 = true;
        m13495();
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public final void m52467() {
        if (this.f75198) {
            this.f75198 = false;
            m13495();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14797 mo13476() {
        m13472(R.string.MT_Protector);
        m52469(0);
        mo13474(0);
        return new C22955(this);
    }
}
