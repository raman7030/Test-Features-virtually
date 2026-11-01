package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩻ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes.dex */
public final class C25012 {

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14797 f79847;

    /* JADX INFO: renamed from: ᩳ */
    public final long f79849;

    /* JADX INFO: renamed from: ֫ */
    public AtomicLong f79846 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܽ */
    public AtomicInteger f79848 = new AtomicInteger(0);

    public C25012(long j, InterfaceC14797 interfaceC14797) {
        this.f79849 = j == 0 ? 1L : j;
        this.f79847 = interfaceC14797;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54924(int i) {
        InterfaceC14797 interfaceC14797 = this.f79847;
        if (interfaceC14797 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f79846.addAndGet(i) * 100) / this.f79849);
        if (iAddAndGet != this.f79848.getAndSet(iAddAndGet)) {
            interfaceC14797.mo14981(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54925(long j) {
        InterfaceC14797 interfaceC14797 = this.f79847;
        if (interfaceC14797 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f79846.addAndGet(j) * 100) / this.f79849);
        if (iAddAndGet != this.f79848.getAndSet(iAddAndGet)) {
            interfaceC14797.mo14981(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2903 m54923(InterfaceC2903 interfaceC2903) {
        return this.f79847 == null ? interfaceC2903 : new C16294(this, interfaceC2903);
    }
}
