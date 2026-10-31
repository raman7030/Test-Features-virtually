package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩻ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51WE */
/* JADX INFO: loaded from: classes.dex */
public final class C23825 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13077 f77096;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f77098;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AtomicLong f77095 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f77097 = new AtomicInteger(0);

    public C23825(long j, InterfaceC13077 interfaceC13077) {
        this.f77098 = j == 0 ? 1L : j;
        this.f77096 = interfaceC13077;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52515(int i) {
        InterfaceC13077 interfaceC13077 = this.f77096;
        if (interfaceC13077 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f77095.addAndGet(i) * 100) / this.f77098);
        if (iAddAndGet != this.f77097.getAndSet(iAddAndGet)) {
            interfaceC13077.mo13117(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52516(long j) {
        InterfaceC13077 interfaceC13077 = this.f77096;
        if (interfaceC13077 == null) {
            return;
        }
        int iAddAndGet = (int) ((this.f77095.addAndGet(j) * 100) / this.f77098);
        if (iAddAndGet != this.f77097.getAndSet(iAddAndGet)) {
            interfaceC13077.mo13117(iAddAndGet, iAddAndGet);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0562 m52514(InterfaceC0562 interfaceC0562) {
        return this.f77096 == null ? interfaceC0562 : new C14652(this, interfaceC0562);
    }
}
