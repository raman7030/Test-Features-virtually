package p067l;

import bin.p000mt.plus.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6626 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5074 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public boolean f11883;

    /* JADX INFO: renamed from: ۘ */
    public final boolean f11884;

    /* JADX INFO: renamed from: ۜ */
    public C19644 f11885;

    /* JADX INFO: renamed from: ۡ */
    public boolean f11886;

    /* JADX INFO: renamed from: ۢ */
    public final ViewOnClickListenerC7497 f11887;

    /* JADX INFO: renamed from: ܳ */
    public final String f11888;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f11889;

    /* JADX INFO: renamed from: ᩴ */
    public C24260 f11890;

    /* JADX INFO: renamed from: ᩵ */
    public C10179 f11891;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC17043 f11892;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f11893;

    public C5074(ViewOnClickListenerC7497 viewOnClickListenerC7497, String str, boolean z, boolean z2) {
        this.f11887 = viewOnClickListenerC7497;
        this.f11892 = viewOnClickListenerC7497.f19602;
        this.f11888 = str;
        this.f11884 = z;
        this.f11889 = z2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        boolean z = this.f11889;
        int i = R.string.MT_Protector;
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f11887;
        if (z) {
            try {
                m22243(viewOnClickListenerC7497, R.string.MT_Protector);
            } catch (RuntimeException unused) {
            }
        } else {
            if (!this.f11884) {
                i = R.string.MT_Protector;
            }
            m22243(viewOnClickListenerC7497, i);
            this.f26234.m33952((Runnable) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo10807() {
        return this.f11889;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܺ᩺ܿ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܺ᩺ܿ] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        AbstractC17043 abstractC17043 = this.f11892;
        if (C21168.m47778(abstractC17043.mo25505(), new C11109(this))) {
            boolean z = this.f11884;
            String str = this.f11888;
            if (!z) {
                C24260.m53565(str);
            }
            if (str != null) {
                ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f11887;
                C24260 c24260M53564 = null;
                try {
                    c24260M53564 = C24260.m53564(str, (C17813) new InterfaceC18588() { // from class: l.ܺ᩺ܿ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return this.f53167.m10806();
                        }
                    });
                    C15131 c15131M33085 = C14461.m33085(c24260M53564, abstractC17043, (C17813) new InterfaceC18588() { // from class: l.ܺ᩺ܿ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return this.f53167.m10806();
                        }
                    });
                    this.f11890 = c24260M53564;
                    C19644 c19644 = c15131M33085.f43195;
                    this.f11885 = c19644;
                    c19644.m44643(viewOnClickListenerC7497.getCacheDir());
                    this.f11891 = c15131M33085.f43197;
                    this.f11893 = c15131M33085.f43194;
                    this.f11883 = c15131M33085.f43196;
                    return;
                } catch (Exception e) {
                    if (this.f11889 && !(e instanceof C25008) && viewOnClickListenerC7497.m17308()) {
                        this.f11886 = true;
                    } else if (c24260M53564 != null && !viewOnClickListenerC7497.m17302(c24260M53564)) {
                        try {
                            c24260M53564.m53590();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else if (c24260M53564 == null) {
                        C24260.m53566(str, e);
                    }
                    if (this.f11886) {
                        return;
                    }
                }
            }
            if (m10806()) {
                return;
            }
            if (!abstractC17043.m38665() && (!abstractC17043.mo29972() || !abstractC17043.mo25093())) {
                throw new IOException("File can not be read");
            }
            try {
                m10804();
            } catch (C25008 unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX INFO: renamed from: ۢ */
    private void m10804() throws Throwable {
        Throwable th;
        C7574 c7574M17486;
        if (m10806()) {
            return;
        }
        C10179 c10179M23735 = C10179.m23735(this.f11892);
        this.f11891 = c10179M23735;
        AbstractC17043 abstractC17043M23738 = c10179M23735.m23738();
        boolean z = false;
        boolean z2 = abstractC17043M23738.mo38688() && !abstractC17043M23738.m38665();
        this.f11893 = z2;
        try {
            if (z2) {
                c7574M17486 = C7574.m17488(abstractC17043M23738.mo38689());
                try {
                    if (!this.f11891.m23742().equals(c7574M17486.m17489())) {
                        throw new C7614();
                    }
                    this.f11883 = c7574M17486.m17489().m8135() > ((long) c7574M17486.length());
                } catch (Throwable th2) {
                    th = th2;
                    if (c7574M17486 != null) {
                        c7574M17486.close();
                    }
                    throw th;
                }
            } else {
                C24260 c24260M53578 = C24260.m53578();
                this.f11890 = c24260M53578;
                C17182 c17182M53594 = c24260M53578.m53594();
                BufferedInputStream bufferedInputStreamM38676 = abstractC17043M23738.m38676();
                try {
                    BufferedOutputStream bufferedOutputStreamM38683 = c17182M53594.m38683();
                    try {
                        byte[] bArr = new byte[262144];
                        long j = 0;
                        while (true) {
                            if (!m10806()) {
                                int i = bufferedInputStreamM38676.read(bArr, 0, j < 2147483647L ? (int) Math.min(262144, 2147483647L - j) : 1);
                                if (i < 0) {
                                    break;
                                }
                                if (i != 0) {
                                    long j2 = i;
                                    if (j2 > 2147483647L - j) {
                                        z = true;
                                        break;
                                    } else {
                                        bufferedOutputStreamM38683.write(bArr, 0, i);
                                        j += j2;
                                    }
                                }
                            } else {
                                throw new C25008();
                            }
                            try {
                                bufferedInputStreamM38676.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        bufferedOutputStreamM38683.close();
                        bufferedInputStreamM38676.close();
                        this.f11883 = z;
                        if (m10806()) {
                            return;
                        }
                        this.f11891.m23739();
                        c7574M17486 = C7574.m17486(c17182M53594);
                    } catch (Throwable th4) {
                        try {
                            bufferedOutputStreamM38683.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    bufferedInputStreamM38676.close();
                    throw th6;
                }
            }
            if (!m10806()) {
                this.f11885 = new C19644(c7574M17486, this.f11887.getCacheDir());
            } else {
                c7574M17486.close();
            }
        } catch (Throwable th7) {
            th = th7;
            c7574M17486 = null;
            if (c7574M17486 != null) {
                c7574M17486.close();
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C19644 c19644;
        boolean z = this.f11886;
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f11887;
        if (z) {
            viewOnClickListenerC7497.m17303();
            return;
        }
        if (m10806() || (c19644 = this.f11885) == null) {
            m10805();
            if (viewOnClickListenerC7497.m17312()) {
                return;
            }
            viewOnClickListenerC7497.finish();
            return;
        }
        this.f11887.m17298(c19644, this.f11890, this.f11891, this.f11893, this.f11883);
        this.f11885 = null;
        this.f11890 = null;
        if (viewOnClickListenerC7497.isFinishing() || viewOnClickListenerC7497.isDestroyed() || viewOnClickListenerC7497.m17304() || C24414.m53850()) {
            return;
        }
        C22682.m50799(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        m10805();
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f11887;
        if (viewOnClickListenerC7497.isFinishing() || viewOnClickListenerC7497.isDestroyed()) {
            return;
        }
        viewOnClickListenerC7497.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m10805() {
        C19644 c19644 = this.f11885;
        if (c19644 != null) {
            try {
                c19644.close();
            } catch (IOException unused) {
            }
            this.f11885 = null;
        }
        C24260 c24260 = this.f11890;
        if (c24260 == null || this.f11887.m17302(c24260)) {
            return;
        }
        try {
            this.f11890.m53590();
        } catch (IOException unused2) {
        }
        this.f11890 = null;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m10806() {
        if (this.f11887.m17311()) {
            return true;
        }
        C14853 c14853 = this.f26234;
        return c14853 != null && c14853.m33960();
    }
}
