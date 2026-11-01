package p067l;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܶۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16612 {

    /* JADX INFO: renamed from: ۜ */
    public static final /* synthetic */ int f48807 = 0;

    /* JADX INFO: renamed from: ۢ */
    public static final HashMap f48808 = new HashMap();

    /* JADX INFO: renamed from: ᩷ */
    public static final ReferenceQueue f48809 = new ReferenceQueue();

    /* JADX INFO: renamed from: ܳ */
    public boolean f48812;

    /* JADX INFO: renamed from: ܿ */
    public Throwable f48814;

    /* JADX INFO: renamed from: ᩻ */
    public int f48816;

    /* JADX INFO: renamed from: ܽ */
    public final Object f48813 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final FutureC5767 f48815 = new FutureC5767();

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f48810 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ */
    public FutureC5767 f48811 = FutureC5767.m12882(null);

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C9907 m37673() {
        if (this.f48812) {
            return null;
        }
        this.f48816++;
        return new C9907(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static C16612 m37667(InterfaceC22097 interfaceC22097) {
        C16612 c16612;
        InterfaceC22097 interfaceC22097Normalize = interfaceC22097.toAbsolutePath().normalize();
        synchronized (f48808) {
            while (true) {
                C3201 c3201 = (C3201) f48809.poll();
                if (c3201 == null) {
                    break;
                }
                C15525.remove(f48808, c3201.f6214, c3201);
            }
            HashMap map = f48808;
            C3201 c3202 = (C3201) map.get(interfaceC22097Normalize);
            c16612 = c3202 == null ? null : (C16612) c3202.get();
            if (c16612 == null) {
                c16612 = new C16612();
                if (C18743.exists(interfaceC22097Normalize, EnumC16060.NOFOLLOW_LINKS)) {
                    c16612.m37671();
                }
                map.put(interfaceC22097Normalize, new C3201(interfaceC22097Normalize, c16612));
            }
        }
        return c16612;
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m37671() {
        boolean z;
        FutureC5767 futureC5767;
        synchronized (this) {
            z = true;
            this.f48812 = true;
            if (this.f48816 != 0) {
                z = false;
            }
        }
        if (z) {
            m37670();
        }
        synchronized (this) {
            futureC5767 = this.f48811;
        }
        return this.f48815.m12904((InterfaceC22729) new C21658(futureC5767)).m12898((InterfaceC22729) new C2530());
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m37672(final InterfaceC9768 interfaceC9768, ThreadPoolExecutor threadPoolExecutor) {
        final FutureC5767 futureC5767;
        synchronized (this) {
            futureC5767 = (FutureC5767) this.f48810.remove(interfaceC9768);
            if (futureC5767 == null) {
                futureC5767 = new FutureC5767();
                this.f48811 = FutureC5767.m12875(this.f48811, futureC5767);
            }
        }
        try {
            threadPoolExecutor.execute(new Runnable() { // from class: l.ۚۘᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC9768 interfaceC9769 = interfaceC9768;
                    FutureC5767 futureC5768 = futureC5767;
                    try {
                        interfaceC9769.mo4006();
                        futureC5768.m12889((Object) null);
                    } catch (Throwable th) {
                        futureC5768.m12891(th);
                    }
                }
            });
        } catch (RuntimeException e) {
            futureC5767.m12891((Throwable) e);
        }
        return futureC5767.m12898((InterfaceC22729) new C2530());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37668(C16612 c16612, Throwable th) {
        boolean z;
        synchronized (c16612) {
            if (c16612.f48812 && th != null) {
                Throwable th2 = c16612.f48814;
                if (th2 == null) {
                    c16612.f48814 = th;
                } else if (th2 != th) {
                    th2.addSuppressed(th);
                }
            }
            z = true;
            int i = c16612.f48816 - 1;
            c16612.f48816 = i;
            if (!c16612.f48812 || i != 0) {
                z = false;
            }
        }
        if (z) {
            c16612.m37670();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m37670() {
        Throwable th;
        synchronized (this) {
            th = this.f48814;
        }
        if (th == null) {
            this.f48815.m12889((Object) null);
        } else {
            this.f48815.m12891(th);
        }
    }
}
