package l;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩻ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23820 extends AbstractC9277 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C8353 f77080;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f77081;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC13072 f77082;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f77083;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 f77085;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11197 f77086;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0486 f77087;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f77088;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f77089;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f77091;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f77090 = true;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f77084 = -9223372036854775807L;

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C11197 mo9817() {
        return this.f77086;
    }

    @Override // l.AbstractC9277, l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo9822(C11197 c11197) {
        this.f77086 = c11197;
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public final void mo9823() {
    }

    public C23820(C11197 c11197, InterfaceC15097 interfaceC15097, C5544 c5544, InterfaceC4454 interfaceC4454, InterfaceC11058 interfaceC11058, int i, C8353 c8353) {
        this.f77086 = c11197;
        this.f77081 = interfaceC15097;
        this.f77082 = c5544;
        this.f77085 = interfaceC4454;
        this.f77091 = interfaceC11058;
        this.f77083 = i;
        this.f77080 = c8353;
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ֫ */
    public final void mo9820(InterfaceC0486 interfaceC0486) {
        this.f77087 = interfaceC0486;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C13830 c13830M23800 = m23800();
        InterfaceC4454 interfaceC4454 = this.f77085;
        interfaceC4454.mo7627(looperMyLooper, c13830M23800);
        interfaceC4454.mo7630();
        m52511();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9546 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        InterfaceC21449 interfaceC21449Mo6247 = this.f77081.mo6247();
        InterfaceC0486 interfaceC0486 = this.f77087;
        if (interfaceC0486 != null) {
            interfaceC21449Mo6247.mo5937(interfaceC0486);
        }
        C11881 c11881 = mo9817().f33612;
        c11881.getClass();
        Uri uri = c11881.f35426;
        m23800();
        return new C18176(uri, interfaceC21449Mo6247, new C15625((InterfaceC20419) ((C5544) this.f77082).f17150), this.f77085, m23793(c15894), this.f77091, m23797(c15894), this, interfaceC21725, this.f77083, this.f77080, C3603.m11014(c11881.f35421), null);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ((C18176) interfaceC9546).m42296();
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9824() {
        this.f77085.mo7626();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52512(long j, InterfaceC9505 interfaceC9505, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.f77084;
        }
        boolean zMo6829 = interfaceC9505.mo6829();
        if (!this.f77090 && this.f77084 == j && this.f77089 == zMo6829 && this.f77088 == z) {
            return;
        }
        this.f77084 = j;
        this.f77089 = zMo6829;
        this.f77088 = z;
        this.f77090 = false;
        m52511();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m52511() {
        long j = this.f77084;
        boolean z = this.f77089;
        boolean z2 = this.f77088;
        C11197 c11197Mo9817 = mo9817();
        C8298 c8298 = new C8298(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c11197Mo9817, z2 ? c11197Mo9817.f33610 : null);
        m23794(this.f77090 ? new C17470(c8298) : c8298);
    }
}
