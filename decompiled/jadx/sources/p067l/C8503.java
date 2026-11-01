package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8503 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ byte[] f22811;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C4480 f22812;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C19903 f22813;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C18225 f22814;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C19644 f22815;

    /* JADX INFO: renamed from: ܳ */
    public C17631 f22816;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C8838 f22817;

    /* JADX INFO: renamed from: ᩴ */
    public C18302 f22818;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] f22819;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC20574 f22820;

    public C8503(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19903 c19903, C19644 c19644, C18225 c18225, C4480 c4480, byte[] bArr, byte[] bArr2, C8838 c8838) {
        this.f22820 = viewOnClickListenerC20574;
        this.f22813 = c19903;
        this.f22815 = c19644;
        this.f22814 = c18225;
        this.f22812 = c4480;
        this.f22819 = bArr;
        this.f22811 = bArr2;
        this.f22817 = c8838;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C19903 c19903 = this.f22813;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f22820;
        ViewOnClickListenerC20574.m46519(viewOnClickListenerC20574, c19903);
        this.f22818 = this.f22815.m44658();
        m22245(viewOnClickListenerC20574.f63590, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܳ֫ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C8503.m19778(this.f45973);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19778(C8503 c8503) {
        c8503.f26234.m33952((Runnable) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19777(C8503 c8503) {
        C14853 c14853 = c8503.f26234;
        if (c8503.f22813.mo3924()) {
            return true;
        }
        return c14853 != null && c14853.m33960();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [l.᩻֫ܳ] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C19644 c19644 = this.f22815;
        C18225 c18225 = this.f22814;
        try {
            boolean zM41453 = c18225.m41453();
            C4480 c4480 = this.f22812;
            if (!zM41453) {
                c4480.f10064 = C10515.m24250();
            } else {
                try {
                    C17631 c17631M41680 = this.f22818.m41680(new InterfaceC18588() { // from class: l.᩻֫ܳ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return C8503.m19777(this.f77881);
                        }
                    });
                    this.f22816 = c17631M41680;
                    c4480.f10064 = ViewOnClickListenerC20574.m46515(c19644, c17631M41680, this.f22819, this.f22811, new InterfaceC18588() { // from class: l.᩻֫ܳ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return C8503.m19777(this.f77881);
                        }
                    });
                    c4480.f10061 = c19644.m44646();
                    c18225.m41456();
                } catch (Throwable th) {
                    c18225.m41456();
                    throw th;
                }
            }
            ViewOnClickListenerC20574.m46517(this.f22818);
        } catch (Throwable th2) {
            ViewOnClickListenerC20574.m46517(this.f22818);
            throw th2;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f22814.m41454();
        C4480 c4480 = this.f22812;
        C10515 c10515 = c4480.f10064;
        if (!this.f22820.m46521(this.f22815) || c10515 == null) {
            return;
        }
        long j = c10515.f29089;
        if (c10515.f29088) {
            return;
        }
        if (j == 0) {
            C14853 c14853 = this.f26234;
            if (this.f22813.mo3924()) {
                return;
            }
            if (c14853 == null || !c14853.m33960()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            return;
        }
        if (c4480.f10060) {
            C22682.m50794(1, this.f22817.getContext().getString(R.string.MT_Protector, Long.valueOf(j))).m50804();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (exc instanceof C25008) {
            return;
        }
        ViewOnClickListenerC20574.m46518(this.f22820, this.f22817, this.f22815, exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C18225 c18225 = this.f22814;
        c18225.m41456();
        c18225.m41454();
        ViewOnClickListenerC20574.m46517(this.f22818);
        C17631 c17631 = this.f22816;
        if (c17631 != null) {
            try {
                c17631.close();
            } catch (IOException unused) {
            }
        }
        m22249();
        c18225.close();
        ViewOnClickListenerC20574.m46524(this.f22820, this.f22813);
    }
}
