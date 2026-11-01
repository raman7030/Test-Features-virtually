package p067l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B78Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C12363 {

    /* JADX INFO: renamed from: ܿ */
    public final Runnable f34498;

    /* JADX INFO: renamed from: ᩻ */
    public static final C21545 f34493 = new C21545();

    /* JADX INFO: renamed from: ۜ */
    public static final C15044 f34492 = new C15044();

    /* JADX INFO: renamed from: ܽ */
    public final RunnableC5657 f34497 = new Runnable() { // from class: l.ۗ᩶ۜ
        @Override // java.lang.Runnable
        public final void run() {
            C12363.m28452(this.f13764);
        }
    };

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f34499 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public long f34495 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final C21545 f34494 = f34493;

    /* JADX INFO: renamed from: ܳ */
    public final C15044 f34496 = f34492;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۗ᩶ۜ] */
    public C12363(Runnable runnable) {
        this.f34498 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28454(int i) {
        if (i < 1 || i > 999) {
            throw new IllegalArgumentException("Minutes must be between 1 and 999");
        }
        this.f34494.getClass();
        this.f34495 = (((long) i) * 60000) + SystemClock.elapsedRealtime();
        long jM28456 = m28456();
        this.f34496.getClass();
        Handler handlerM16221 = C7050.m16221();
        RunnableC5657 runnableC5657 = this.f34497;
        handlerM16221.removeCallbacks(runnableC5657);
        C7050.m16221().postDelayed(runnableC5657, Math.max(jM28456, 0L));
        Iterator it = new ArrayList(this.f34499).iterator();
        while (it.hasNext()) {
            ((InterfaceC14374) it.next()).mo10094();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m28456() {
        long j = this.f34495;
        if (j == -1) {
            return 0L;
        }
        this.f34494.getClass();
        return Math.max(j - SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28458() {
        long jM28456 = m28456();
        if (jM28456 <= 0) {
            return 0;
        }
        return (int) ((jM28456 + 59999) / 60000);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28455(InterfaceC14374 interfaceC14374) {
        ArrayList arrayList = this.f34499;
        if (arrayList.contains(interfaceC14374)) {
            return;
        }
        arrayList.add(interfaceC14374);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28457(InterfaceC14374 interfaceC14374) {
        this.f34499.remove(interfaceC14374);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28452(C12363 c12363) {
        RunnableC5657 runnableC5657 = c12363.f34497;
        C15044 c15044 = c12363.f34496;
        if (c12363.f34495 != -1) {
            long jM28456 = c12363.m28456();
            if (jM28456 <= 0) {
                c15044.getClass();
                C7050.m16221().removeCallbacks(runnableC5657);
                boolean z = c12363.f34495 != -1;
                c12363.f34495 = -1L;
                if (z) {
                    Iterator it = new ArrayList(c12363.f34499).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC14374) it.next()).mo10094();
                    }
                }
                c12363.f34498.run();
                return;
            }
            c15044.getClass();
            C7050.m16221().removeCallbacks(runnableC5657);
            C7050.m16221().postDelayed(runnableC5657, Math.max(jM28456, 0L));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28453() {
        this.f34496.getClass();
        C7050.m16221().removeCallbacks(this.f34497);
        boolean z = this.f34495 != -1;
        this.f34495 = -1L;
        if (z) {
            Iterator it = new ArrayList(this.f34499).iterator();
            while (it.hasNext()) {
                ((InterfaceC14374) it.next()).mo10094();
            }
        }
    }
}
