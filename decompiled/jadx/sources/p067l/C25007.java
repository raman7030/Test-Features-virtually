package p067l;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩻ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C25007 extends AbstractC11185 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C10307 f79831;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC16716 f79832;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC14792 f79833;

    /* JADX INFO: renamed from: ۤ */
    public final int f79834;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC6601 f79836;

    /* JADX INFO: renamed from: ܰ */
    public C13010 f79837;

    /* JADX INFO: renamed from: ܳ֫ */
    public InterfaceC2830 f79838;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f79839;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f79840;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC12878 f79842;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f79841 = true;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f79835 = -9223372036854775807L;

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13010 mo11862() {
        return this.f79837;
    }

    @Override // p067l.AbstractC11185, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo11867(C13010 c13010) {
        this.f79837 = c13010;
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo11868() {
    }

    public C25007(C13010 c13010, InterfaceC16716 interfaceC16716, C7638 c7638, InterfaceC6601 interfaceC6601, InterfaceC12878 interfaceC12878, int i, C10307 c10307) {
        this.f79837 = c13010;
        this.f79832 = interfaceC16716;
        this.f79833 = c7638;
        this.f79836 = interfaceC6601;
        this.f79842 = interfaceC12878;
        this.f79834 = i;
        this.f79831 = c10307;
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11865(InterfaceC2830 interfaceC2830) {
        this.f79838 = interfaceC2830;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C15512 c15512M25809 = m25809();
        InterfaceC6601 interfaceC6601 = this.f79836;
        interfaceC6601.mo9698(looperMyLooper, c15512M25809);
        interfaceC6601.mo9701();
        m54920();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        InterfaceC22753 interfaceC22753Mo8449 = this.f79832.mo8449();
        InterfaceC2830 interfaceC2830 = this.f79838;
        if (interfaceC2830 != null) {
            interfaceC22753Mo8449.mo8132(interfaceC2830);
        }
        C13660 c13660 = mo11862().f36611;
        c13660.getClass();
        Uri uri = c13660.f38436;
        m25809();
        return new C19643(uri, interfaceC22753Mo8449, new C17218((InterfaceC21775) ((C7638) this.f79833).f19991), this.f79836, m25802(c17474), this.f79842, m25806(c17474), this, interfaceC23016, this.f79834, this.f79831, C5792.m12990(c13660.f38431), null);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        ((C19643) interfaceC11441).m44557();
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
        this.f79836.mo9697();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54921(long j, InterfaceC11402 interfaceC11402, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f79835;
        }
        boolean zMo8955 = interfaceC11402.mo8955();
        if (!this.f79841 && this.f79835 == j && this.f79840 == zMo8955 && this.f79839 == z) {
            return;
        }
        this.f79835 = j;
        this.f79840 = zMo8955;
        this.f79839 = z;
        this.f79841 = false;
        m54920();
    }

    /* JADX INFO: renamed from: ۢ */
    private void m54920() {
        long j = this.f79835;
        boolean z = this.f79840;
        boolean z2 = this.f79839;
        C13010 c13010Mo11862 = mo11862();
        C10255 c10255 = new C10255(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c13010Mo11862, z2 ? c13010Mo11862.f36609 : null);
        m25803(this.f79841 ? new C18972(c10255) : c10255);
    }
}
