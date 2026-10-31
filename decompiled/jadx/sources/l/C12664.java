package l;

import java.net.InetAddress;

/* JADX INFO: renamed from: l.۫᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes4.dex */
public final class C12664 implements InterfaceC11959 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13369 f38175;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8806 f38176;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13369 f38177;

    public C12664(C8806 c8806) {
        this.f38176 = c8806;
        this.f38175 = new C13369("JmDNS(" + c8806.getName() + ").Timer", true);
        this.f38177 = new C13369("JmDNS(" + c8806.getName() + ").State.Timer", false);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩻ */
    public final void mo22767() {
        this.f38175.purge();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩴ */
    public final void mo22760() {
        this.f38177.purge();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ܽ */
    public final void mo22756() {
        this.f38175.cancel();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫ */
    public final void mo22721() {
        this.f38177.cancel();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩳ */
    public final void mo22758() {
        C9491 c9491 = new C9491(this.f38176);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c9491.m5776().m22762() < 5000) {
            c9491.m5776().m22722(c9491.m5776().m22766() + 1);
        } else {
            c9491.m5776().m22722(1);
        }
        c9491.m5776().m22743(jCurrentTimeMillis);
        boolean zM22752 = c9491.m5776().m22752();
        C13369 c13369 = this.f38177;
        if (zM22752 && c9491.m5776().m22766() < 10) {
            c13369.schedule(c9491, C8806.m22717().nextInt(251), 250L);
        } else {
            if (c9491.m5776().m22750() || c9491.m5776().m22741()) {
                return;
            }
            c13369.schedule(c9491, 1000L, 1000L);
        }
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۘ */
    public final void mo22738() {
        C23601 c23601 = new C23601(this.f38176);
        if (c23601.m5776().m22750() || c23601.m5776().m22741()) {
            return;
        }
        this.f38177.schedule(c23601, 1000L, 1000L);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ܳ */
    public final void mo22753() {
        C8785 c8785 = new C8785(this.f38176);
        if (c8785.m5776().m22750() || c8785.m5776().m22741()) {
            return;
        }
        long j = C13038.f39041;
        this.f38177.schedule(c8785, j, j);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۜ */
    public final void mo22740() {
        this.f38177.schedule(new C6668(this.f38176), 0L, 1000L);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۖ */
    public final void mo22736() {
        C10902 c10902 = new C10902(this.f38176);
        if (c10902.m5776().m22750() || c10902.m5776().m22741()) {
            return;
        }
        this.f38175.schedule(c10902, 10000L, 10000L);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫ */
    public final void mo22731(C20095 c20095) {
        C17251 c17251 = new C17251(this.f38176, c20095);
        if (c17251.m5776().m22750() || c17251.m5776().m22741()) {
            return;
        }
        this.f38175.schedule(c17251, 225L, 225L);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫ */
    public final void mo22724(String str) {
        C14428 c14428 = new C14428(this.f38176, str);
        if (c14428.m5776().m22750() || c14428.m5776().m22741()) {
            return;
        }
        this.f38175.schedule(c14428, 225L, 225L);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫ */
    public final void mo22727(C11254 c11254, InetAddress inetAddress, int i) {
        new C16545(this.f38176, c11254, inetAddress, i).m38925(this.f38175);
    }
}
