package l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B78Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10516 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Runnable f31536;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C20177 f31531 = new C20177();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C13337 f31530 = new C13337();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RunnableC3460 f31535 = new Runnable() { // from class: l.ۗ᩶ۜ
        @Override // java.lang.Runnable
        public final void run() {
            C10516.m26419(this.f10963);
        }
    };

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31537 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f31533 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f31532 = f31531;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13337 f31534 = f31530;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۗ᩶ۜ] */
    public C10516(Runnable runnable) {
        this.f31536 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26421(int i) {
        if (i < 1 || i > 999) {
            throw new IllegalArgumentException("Minutes must be between 1 and 999");
        }
        this.f31532.getClass();
        this.f31533 = (((long) i) * 60000) + SystemClock.elapsedRealtime();
        long jM26423 = m26423();
        this.f31534.getClass();
        Handler handlerM14324 = C4925.m14324();
        RunnableC3460 runnableC3460 = this.f31535;
        handlerM14324.removeCallbacks(runnableC3460);
        C4925.m14324().postDelayed(runnableC3460, Math.max(jM26423, 0L));
        Iterator it = new ArrayList(this.f31537).iterator();
        while (it.hasNext()) {
            ((InterfaceC12632) it.next()).mo8063();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m26423() {
        long j = this.f31533;
        if (j == -1) {
            return 0L;
        }
        this.f31532.getClass();
        return Math.max(j - SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26425() {
        long jM26423 = m26423();
        if (jM26423 <= 0) {
            return 0;
        }
        return (int) ((jM26423 + 59999) / 60000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26422(InterfaceC12632 interfaceC12632) {
        ArrayList arrayList = this.f31537;
        if (arrayList.contains(interfaceC12632)) {
            return;
        }
        arrayList.add(interfaceC12632);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26424(InterfaceC12632 interfaceC12632) {
        this.f31537.remove(interfaceC12632);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26419(C10516 c10516) {
        RunnableC3460 runnableC3460 = c10516.f31535;
        C13337 c13337 = c10516.f31534;
        if (c10516.f31533 != -1) {
            long jM26423 = c10516.m26423();
            if (jM26423 <= 0) {
                c13337.getClass();
                C4925.m14324().removeCallbacks(runnableC3460);
                boolean z = c10516.f31533 != -1;
                c10516.f31533 = -1L;
                if (z) {
                    Iterator it = new ArrayList(c10516.f31537).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC12632) it.next()).mo8063();
                    }
                }
                c10516.f31536.run();
                return;
            }
            c13337.getClass();
            C4925.m14324().removeCallbacks(runnableC3460);
            C4925.m14324().postDelayed(runnableC3460, Math.max(jM26423, 0L));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26420() {
        this.f31534.getClass();
        C4925.m14324().removeCallbacks(this.f31535);
        boolean z = this.f31533 != -1;
        this.f31533 = -1L;
        if (z) {
            Iterator it = new ArrayList(this.f31537).iterator();
            while (it.hasNext()) {
                ((InterfaceC12632) it.next()).mo8063();
            }
        }
    }
}
