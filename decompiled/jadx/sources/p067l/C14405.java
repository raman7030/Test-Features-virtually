package p067l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.۫᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes4.dex */
public final class C14405 implements InterfaceC13735 {

    /* JADX INFO: renamed from: ᩶ */
    public final C15075 f41202;

    /* JADX INFO: renamed from: ᩸ */
    public final C10738 f41203;

    /* JADX INFO: renamed from: ᩹ */
    public final C15075 f41204;

    public C14405(C10738 c10738) {
        this.f41203 = c10738;
        this.f41202 = new C15075("JmDNS(" + c10738.getName() + ").Timer", true);
        this.f41204 = new C15075("JmDNS(" + c10738.getName() + ").State.Timer", false);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩻ */
    public final void mo24737() {
        this.f41202.purge();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩴ */
    public final void mo24730() {
        this.f41204.purge();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ܽ */
    public final void mo24726() {
        this.f41202.cancel();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24691() {
        this.f41204.cancel();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24728() {
        C11389 c11389 = new C11389(this.f41203);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c11389.m7986().m24732() < 5000) {
            c11389.m7986().m24692(c11389.m7986().m24736() + 1);
        } else {
            c11389.m7986().m24692(1);
        }
        c11389.m7986().m24713(jCurrentTimeMillis);
        boolean zM24722 = c11389.m7986().m24722();
        C15075 c15075 = this.f41204;
        if (zM24722 && c11389.m7986().m24736() < 10) {
            c15075.schedule(c11389, C10738.m24687().nextInt(251), 250L);
        } else {
            if (c11389.m7986().m24720() || c11389.m7986().m24711()) {
                return;
            }
            c15075.schedule(c11389, 1000L, 1000L);
        }
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۘ */
    public final void mo24708() {
        C24799 c24799 = new C24799(this.f41203);
        if (c24799.m7986().m24720() || c24799.m7986().m24711()) {
            return;
        }
        this.f41204.schedule(c24799, 1000L, 1000L);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ܳ */
    public final void mo24723() {
        C10718 c10718 = new C10718(this.f41203);
        if (c10718.m7986().m24720() || c10718.m7986().m24711()) {
            return;
        }
        long j = C14760.f42087;
        this.f41204.schedule(c10718, j, j);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۜ */
    public final void mo24710() {
        this.f41204.schedule(new C8706(this.f41203), 0L, 1000L);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۖ */
    public final void mo24706() {
        C12730 c12730 = new C12730(this.f41203);
        if (c12730.m7986().m24720() || c12730.m7986().m24711()) {
            return;
        }
        this.f41202.schedule(c12730, 10000L, 10000L);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24701(C21467 c21467) {
        C18764 c18764 = new C18764(this.f41203, c21467);
        if (c18764.m7986().m24720() || c18764.m7986().m24711()) {
            return;
        }
        this.f41202.schedule(c18764, 225L, 225L);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24694(String str) {
        C16081 c16081 = new C16081(this.f41203, str);
        if (c16081.m7986().m24720() || c16081.m7986().m24711()) {
            return;
        }
        this.f41202.schedule(c16081, 225L, 225L);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24697(C13065 c13065, InetAddress inetAddress, int i) {
        new C18093(this.f41203, c13065, inetAddress, i).m41151(this.f41202);
    }
}
