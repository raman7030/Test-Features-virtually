package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩵ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19277 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17066 f60653;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC2343 f60655;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f60656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f60654 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f60657 = new AtomicInteger(-1);

    public C19277(long j) {
        this.f60656 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44459(InterfaceC2343 interfaceC2343) {
        this.f60655 = interfaceC2343;
        if (interfaceC2343 instanceof InterfaceC17066) {
            this.f60653 = (InterfaceC17066) interfaceC2343;
        } else {
            this.f60653 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44461(InterfaceC2343 interfaceC2343) {
        this.f60655 = new C6576(interfaceC2343);
        if (interfaceC2343 instanceof InterfaceC17066) {
            this.f60653 = (InterfaceC17066) interfaceC2343;
        } else {
            this.f60653 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44460(int i) {
        long j = this.f60656;
        if (j == 0) {
            return false;
        }
        int iAddAndGet = (int) ((this.f60654.addAndGet(i) * 100) / j);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f60657.getAndSet(iAddAndGet)) {
            return false;
        }
        InterfaceC2343 interfaceC2343 = this.f60655;
        if (interfaceC2343 == null) {
            return true;
        }
        interfaceC2343.mo6264(iAddAndGet);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44458(long j) {
        InterfaceC2343 interfaceC2343;
        long j2 = this.f60656;
        if (j2 == 0) {
            return;
        }
        int iAddAndGet = (int) ((this.f60654.addAndGet(j) * 100) / j2);
        if (iAddAndGet > 100) {
            iAddAndGet = 100;
        }
        if (iAddAndGet == this.f60657.getAndSet(iAddAndGet) || (interfaceC2343 = this.f60655) == null) {
            return;
        }
        interfaceC2343.mo6264(iAddAndGet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44457() {
        return this.f60657.get();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44462() {
        InterfaceC17066 interfaceC17066 = this.f60653;
        return interfaceC17066 != null && interfaceC17066.mo1526();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44456(long j, long j2) {
        if (j2 == 0) {
            return 0;
        }
        return (int) ((j * 100) / j2);
    }
}
