package l;

import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩹ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AIU */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22366 extends AbstractC3817 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72471 = 0;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f72472;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f72473;

    public AbstractC22366() {
        new AtomicBoolean();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC0206 mo10130(AbstractActivityC3346 abstractActivityC3346) {
        final C22022 c22022 = new C22022(abstractActivityC3346);
        c22022.m49543((Runnable) new RunnableC19472(5, this));
        c22022.m49544(new ViewOnClickListenerC2205(2, c22022));
        m11532().m1668(c22022.m51050(), new InterfaceC1008() { // from class: l.ܶܶۢ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                AbstractC22366.m50126(this.f46958, c22022);
            }
        });
        c22022.m49548();
        return c22022.m51050();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50126(AbstractC22366 abstractC22366, C22022 c22022) {
        if (abstractC22366.m11561()) {
            c22022.m49554(abstractC22366.m11557());
        }
        if (abstractC22366.m11547()) {
            c22022.m49556(abstractC22366.m11534());
        }
        if (abstractC22366.f72472) {
            c22022.m49545();
            c22022.m49553(abstractC22366.m11539());
        } else {
            c22022.m49557();
            c22022.m49553(abstractC22366.f72473);
            c22022.m49550(abstractC22366.m11539());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50130(long j, long j2) {
        m50129(C19277.m44456(j, j2));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m50129(int i) {
        if (this.f72473 != i) {
            this.f72473 = i;
            m11559();
        }
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final void m50128() {
        if (this.f72472) {
            return;
        }
        this.f72472 = true;
        m11559();
    }

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final void m50127() {
        if (this.f72472) {
            this.f72472 = false;
            m11559();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13077 mo11540() {
        m11536(R.string.MT_Protector);
        m50129(0);
        mo11538(0);
        return new C21661(this);
    }
}
