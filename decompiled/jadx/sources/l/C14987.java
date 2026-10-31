package l;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܶۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14987 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45694 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final HashMap f45695 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f45696 = new ReferenceQueue();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45699;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Throwable f45701;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f45703;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f45700 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f45702 = new FutureC3575();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f45697 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f45698 = FutureC3575.m10905(null);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C7932 m35517() {
        if (this.f45699) {
            return null;
        }
        this.f45703++;
        return new C7932(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14987 m35511(InterfaceC20758 interfaceC20758) {
        C14987 c14987;
        InterfaceC20758 interfaceC20758Normalize = interfaceC20758.toAbsolutePath().normalize();
        synchronized (f45695) {
            while (true) {
                C0876 c0876 = (C0876) f45696.poll();
                if (c0876 == null) {
                    break;
                }
                C13843.remove(f45695, c0876.f3441, c0876);
            }
            HashMap map = f45695;
            C0876 c0877 = (C0876) map.get(interfaceC20758Normalize);
            c14987 = c0877 == null ? null : (C14987) c0877.get();
            if (c14987 == null) {
                c14987 = new C14987();
                if (C17229.exists(interfaceC20758Normalize, EnumC14406.NOFOLLOW_LINKS)) {
                    c14987.m35515();
                }
                map.put(interfaceC20758Normalize, new C0876(interfaceC20758Normalize, c14987));
            }
        }
        return c14987;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m35515() {
        boolean z;
        FutureC3575 futureC3575;
        synchronized (this) {
            z = true;
            this.f45699 = true;
            if (this.f45703 != 0) {
                z = false;
            }
        }
        if (z) {
            m35514();
        }
        synchronized (this) {
            futureC3575 = this.f45698;
        }
        return this.f45702.m10927((InterfaceC21423) new C20296(futureC3575)).m10921((InterfaceC21423) new C0170());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m35516(final InterfaceC7785 interfaceC7785, ThreadPoolExecutor threadPoolExecutor) {
        final FutureC3575 futureC3575;
        synchronized (this) {
            futureC3575 = (FutureC3575) this.f45697.remove(interfaceC7785);
            if (futureC3575 == null) {
                futureC3575 = new FutureC3575();
                this.f45698 = FutureC3575.m10898(this.f45698, futureC3575);
            }
        }
        try {
            threadPoolExecutor.execute(new Runnable() { // from class: l.ۚۘᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC7785 interfaceC7786 = interfaceC7785;
                    FutureC3575 futureC3576 = futureC3575;
                    try {
                        interfaceC7786.mo1608();
                        futureC3576.m10912((Object) null);
                    } catch (Throwable th) {
                        futureC3576.m10914(th);
                    }
                }
            });
        } catch (RuntimeException e) {
            futureC3575.m10914((Throwable) e);
        }
        return futureC3575.m10921((InterfaceC21423) new C0170());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35512(C14987 c14987, Throwable th) {
        boolean z;
        synchronized (c14987) {
            if (c14987.f45699 && th != null) {
                Throwable th2 = c14987.f45701;
                if (th2 == null) {
                    c14987.f45701 = th;
                } else if (th2 != th) {
                    th2.addSuppressed(th);
                }
            }
            z = true;
            int i = c14987.f45703 - 1;
            c14987.f45703 = i;
            if (!c14987.f45699 || i != 0) {
                z = false;
            }
        }
        if (z) {
            c14987.m35514();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m35514() {
        Throwable th;
        synchronized (this) {
            th = this.f45701;
        }
        if (th == null) {
            this.f45702.m10912((Object) null);
        } else {
            this.f45702.m10914(th);
        }
    }
}
