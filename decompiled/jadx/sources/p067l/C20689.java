package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩵ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20689 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18588 f63883;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC4595 f63885;

    /* JADX INFO: renamed from: ܿ */
    public final long f63886;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicLong f63884 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f63887 = new AtomicInteger(-1);

    public C20689(long j) {
        this.f63886 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46753(InterfaceC4595 interfaceC4595) {
        this.f63885 = interfaceC4595;
        if (interfaceC4595 instanceof InterfaceC18588) {
            this.f63883 = (InterfaceC18588) interfaceC4595;
        } else {
            this.f63883 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46755(InterfaceC4595 interfaceC4595) {
        this.f63885 = new C8618(interfaceC4595);
        if (interfaceC4595 instanceof InterfaceC18588) {
            this.f63883 = (InterfaceC18588) interfaceC4595;
        } else {
            this.f63883 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46754(int i) {
        long j = this.f63886;
        if (j == 0) {
            return false;
        }
        int iAddAndGet = (int) ((this.f63884.addAndGet(i) * 100) / j);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f63887.getAndSet(iAddAndGet)) {
            return false;
        }
        InterfaceC4595 interfaceC4595 = this.f63885;
        if (interfaceC4595 == null) {
            return true;
        }
        interfaceC4595.mo8466(iAddAndGet);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46752(long j) {
        InterfaceC4595 interfaceC4595;
        long j2 = this.f63886;
        if (j2 == 0) {
            return;
        }
        int iAddAndGet = (int) ((this.f63884.addAndGet(j) * 100) / j2);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f63887.getAndSet(iAddAndGet) || (interfaceC4595 = this.f63885) == null) {
            return;
        }
        interfaceC4595.mo8466(iAddAndGet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46751() {
        return this.f63887.get();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46756() {
        InterfaceC18588 interfaceC18588 = this.f63883;
        return interfaceC18588 != null && interfaceC18588.mo3924();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46750(long j, long j2) {
        if (j2 == 0) {
            return 0;
        }
        return (int) ((j * 100) / j2);
    }
}
