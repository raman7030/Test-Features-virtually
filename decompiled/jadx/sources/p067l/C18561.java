package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C18561 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ int f55395;

    /* JADX INFO: renamed from: ۘ */
    public C18302 f55396;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ViewOnClickListenerC20574 f55397;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C19644 f55398;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ byte[] f55399;

    /* JADX INFO: renamed from: ܳ */
    public int f55400;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C8838 f55401;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C19903 f55402;

    /* JADX INFO: renamed from: ᩻ */
    public C17631 f55403;

    public C18561(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19903 c19903, C19644 c19644, byte[] bArr, int i, C8838 c8838) {
        this.f55397 = viewOnClickListenerC20574;
        this.f55402 = c19903;
        this.f55398 = c19644;
        this.f55399 = bArr;
        this.f55395 = i;
        this.f55401 = c8838;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C19903 c19903 = this.f55402;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f55397;
        ViewOnClickListenerC20574.m46519(viewOnClickListenerC20574, c19903);
        this.f55396 = this.f55398.m44658();
        m22245(viewOnClickListenerC20574.f63590, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܽ֫ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C18561.m42244(this.f53461);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42244(C18561 c18561) {
        c18561.f26234.m33952((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m42243() {
        C14853 c14853 = this.f26234;
        if (this.f55402.mo3924()) {
            return true;
        }
        return c14853 != null && c14853.m33960();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        try {
            this.f55403 = this.f55396.m41680(new InterfaceC18588() { // from class: l.ᩳ֫ܳ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f57485.m42243();
                }
            });
            ViewOnClickListenerC20574.m46517(this.f55396);
            C17631 c17631 = this.f55403;
            InterfaceC18588 interfaceC18588 = new InterfaceC18588() { // from class: l.ᩳ֫ܳ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f57485.m42243();
                }
            };
            byte[] bArr = this.f55399;
            int iM40152 = c17631.m40152(bArr, this.f55395, interfaceC18588);
            this.f55400 = iM40152;
            if (iM40152 != -1 || m42243()) {
                return;
            }
            this.f55400 = this.f55403.m40152(bArr, 0, new InterfaceC18588() { // from class: l.ᩳ֫ܳ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f57485.m42243();
                }
            });
        } catch (Throwable th) {
            ViewOnClickListenerC20574.m46517(this.f55396);
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() throws IOException {
        C19644 c19644 = this.f55398;
        C17631 c17631 = this.f55403;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f55397;
        if (ViewOnClickListenerC20574.m46523(viewOnClickListenerC20574, c19644, c17631) && !m42243()) {
            int i = this.f55400;
            if (i == -1) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            int length = this.f55399.length;
            int length2 = this.f55403.length();
            long j = ((long) i) + ((long) length);
            if (i >= 0 && length > 0 && j <= length2) {
                int i2 = ((int) j) - 1;
                viewOnClickListenerC20574.f63596 = new C21915(this.f55398, this.f55403.m40153(), this.f55400, i2);
                this.f55401.m20425(this.f55400, i2);
                return;
            }
            throw new IOException("Search result exceeds snapshot length");
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof C25008) {
            return;
        }
        ViewOnClickListenerC20574.m46518(this.f55397, this.f55401, this.f55398, exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ViewOnClickListenerC20574.m46517(this.f55396);
        C17631 c17631 = this.f55403;
        if (c17631 != null) {
            try {
                c17631.close();
            } catch (IOException unused) {
            }
        }
        m22249();
        ViewOnClickListenerC20574.m46524(this.f55397, this.f55402);
    }
}
