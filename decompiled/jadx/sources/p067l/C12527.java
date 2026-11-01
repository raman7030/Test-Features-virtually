package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12527 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ long f35136;

    /* JADX INFO: renamed from: ۘ */
    public C18302 f35137;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ViewOnClickListenerC20574 f35138;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C19644 f35139;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ byte[] f35140;

    /* JADX INFO: renamed from: ܳ */
    public int f35141;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C8838 f35142;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C19903 f35143;

    /* JADX INFO: renamed from: ᩻ */
    public C17631 f35144;

    public C12527(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19903 c19903, C19644 c19644, byte[] bArr, long j, C8838 c8838) {
        this.f35138 = viewOnClickListenerC20574;
        this.f35143 = c19903;
        this.f35139 = c19644;
        this.f35140 = bArr;
        this.f35136 = j;
        this.f35142 = c8838;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C19903 c19903 = this.f35143;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f35138;
        ViewOnClickListenerC20574.m46519(viewOnClickListenerC20574, c19903);
        this.f35137 = this.f35139.m44658();
        m22245(viewOnClickListenerC20574.f63590, R.string.MT_Protector, 200, new Runnable() { // from class: l.۟۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C12527.m28853(this.f25408);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28853(C12527 c12527) {
        c12527.f26234.m33952((Runnable) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m28854(C12527 c12527) {
        C14853 c14853 = c12527.f26234;
        if (c12527.f35143.mo3924()) {
            return true;
        }
        return c14853 != null && c14853.m33960();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        try {
            this.f35144 = this.f35137.m41680(new InterfaceC18588() { // from class: l.֫֫ܳ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return C12527.m28854(this.f8156);
                }
            });
            ViewOnClickListenerC20574.m46517(this.f35137);
            C17631 c17631 = this.f35144;
            InterfaceC18588 interfaceC18588 = new InterfaceC18588() { // from class: l.֫֫ܳ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return C12527.m28854(this.f8156);
                }
            };
            byte[] bArr = this.f35140;
            if (bArr == null || bArr.length == 0) {
                throw new IllegalArgumentException("Search pattern must not be empty");
            }
            long jM46513 = (((long) ViewOnClickListenerC20574.m46513(this.f35136, true)) - ((long) bArr.length)) + 1;
            int iM46513 = jM46513 < 0 ? -1 : ViewOnClickListenerC20574.m46513(jM46513, false);
            InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
            int iM40155 = c17631.m40155(bArr, iM46513, interfaceC18588M40721);
            if (iM40155 == -1 && !interfaceC18588M40721.mo3924()) {
                iM40155 = c17631.m40155(bArr, c17631.length(), interfaceC18588M40721);
            }
            this.f35141 = iM40155;
        } catch (Throwable th) {
            ViewOnClickListenerC20574.m46517(this.f35137);
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() throws IOException {
        C19644 c19644 = this.f35139;
        C17631 c17631 = this.f35144;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f35138;
        if (ViewOnClickListenerC20574.m46523(viewOnClickListenerC20574, c19644, c17631)) {
            C14853 c14853 = this.f26234;
            if (this.f35143.mo3924()) {
                return;
            }
            if (c14853 == null || !c14853.m33960()) {
                int i = this.f35141;
                if (i == -1) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                int length = this.f35140.length;
                int length2 = this.f35144.length();
                long j = ((long) i) + ((long) length);
                if (i >= 0 && length > 0 && j <= length2) {
                    int i2 = ((int) j) - 1;
                    viewOnClickListenerC20574.f63596 = new C21915(this.f35139, this.f35144.m40153(), this.f35141, i2);
                    this.f35142.m20425(this.f35141, i2);
                    return;
                }
                throw new IOException("Search result exceeds snapshot length");
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof C25008) {
            return;
        }
        ViewOnClickListenerC20574.m46518(this.f35138, this.f35142, this.f35139, exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ViewOnClickListenerC20574.m46517(this.f35137);
        C17631 c17631 = this.f35144;
        if (c17631 != null) {
            try {
                c17631.close();
            } catch (IOException unused) {
            }
        }
        m22249();
        ViewOnClickListenerC20574.m46524(this.f35138, this.f35143);
    }
}
