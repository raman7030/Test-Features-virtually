package l;

import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6626 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2846 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f9086;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f9087;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18177 f9088;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f9089;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5396 f9090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f9091;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f9092;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23034 f9093;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8218 f9094;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f9095;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f9096;

    public C2846(ViewOnClickListenerC5396 viewOnClickListenerC5396, String str, boolean z, boolean z2) {
        this.f9090 = viewOnClickListenerC5396;
        this.f9095 = viewOnClickListenerC5396.f16766;
        this.f9091 = str;
        this.f9087 = z;
        this.f9092 = z2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        boolean z = this.f9092;
        int i = R.string.MT_Protector;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (z) {
            try {
                m20267(viewOnClickListenerC5396, R.string.MT_Protector);
            } catch (RuntimeException unused) {
            }
        } else {
            if (!this.f9087) {
                i = R.string.MT_Protector;
            }
            m20267(viewOnClickListenerC5396, i);
            this.f23322.m31860((Runnable) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo8740() {
        return this.f9092;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܺ᩺ܿ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܺ᩺ܿ] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        AbstractC15440 abstractC15440 = this.f9095;
        if (C19780.m45467(abstractC15440.mo23554(), new C9196(this))) {
            boolean z = this.f9087;
            String str = this.f9091;
            if (!z) {
                C23034.m51172(str);
            }
            if (str != null) {
                ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
                C23034 c23034M51171 = null;
                try {
                    c23034M51171 = C23034.m51171(str, (C16250) new InterfaceC17066() { // from class: l.ܺ᩺ܿ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return this.f49998.m8739();
                        }
                    });
                    C13428 c13428M31005 = C12723.m31005(c23034M51171, abstractC15440, (C16250) new InterfaceC17066() { // from class: l.ܺ᩺ܿ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return this.f49998.m8739();
                        }
                    });
                    this.f9093 = c23034M51171;
                    C18177 c18177 = c13428M31005.f40126;
                    this.f9088 = c18177;
                    c18177.m42382(viewOnClickListenerC5396.getCacheDir());
                    this.f9094 = c13428M31005.f40128;
                    this.f9096 = c13428M31005.f40125;
                    this.f9086 = c13428M31005.f40127;
                    return;
                } catch (Exception e) {
                    if (this.f9092 && !(e instanceof C23821) && viewOnClickListenerC5396.m15397()) {
                        this.f9089 = true;
                    } else if (c23034M51171 != null && !viewOnClickListenerC5396.m15391(c23034M51171)) {
                        try {
                            c23034M51171.m51197();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    } else if (c23034M51171 == null) {
                        C23034.m51173(str, e);
                    }
                    if (this.f9089) {
                        return;
                    }
                }
            }
            if (m8739()) {
                return;
            }
            if (!abstractC15440.m36507() && (!abstractC15440.mo27911() || !abstractC15440.mo23119())) {
                throw new IOException("File can not be read");
            }
            try {
                m8737();
            } catch (C23821 unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m8737() throws Throwable {
        Throwable th;
        C5477 c5477M15575;
        if (m8739()) {
            return;
        }
        C8218 c8218M21766 = C8218.m21766(this.f9095);
        this.f9094 = c8218M21766;
        AbstractC15440 abstractC15440M21769 = c8218M21766.m21769();
        boolean z = false;
        boolean z2 = abstractC15440M21769.mo36530() && !abstractC15440M21769.m36507();
        this.f9096 = z2;
        try {
            if (z2) {
                c5477M15575 = C5477.m15577(abstractC15440M21769.mo36531());
                try {
                    if (!this.f9094.m21773().equals(c5477M15575.m15578())) {
                        throw new C5519();
                    }
                    this.f9086 = c5477M15575.m15578().m5940() > ((long) c5477M15575.length());
                } catch (Throwable th2) {
                    th = th2;
                    if (c5477M15575 != null) {
                        c5477M15575.close();
                    }
                    throw th;
                }
            } else {
                C23034 c23034M51185 = C23034.m51185();
                this.f9093 = c23034M51185;
                C15587 c15587M51201 = c23034M51185.m51201();
                BufferedInputStream bufferedInputStreamM36518 = abstractC15440M21769.m36518();
                try {
                    BufferedOutputStream bufferedOutputStreamM36525 = c15587M51201.m36525();
                    try {
                        byte[] bArr = new byte[262144];
                        long j = 0;
                        while (true) {
                            if (!m8739()) {
                                int i = bufferedInputStreamM36518.read(bArr, 0, j < 2147483647L ? (int) Math.min(262144, 2147483647L - j) : 1);
                                if (i < 0) {
                                    break;
                                }
                                if (i != 0) {
                                    long j2 = i;
                                    if (j2 > 2147483647L - j) {
                                        z = true;
                                        break;
                                    } else {
                                        bufferedOutputStreamM36525.write(bArr, 0, i);
                                        j += j2;
                                    }
                                }
                            } else {
                                throw new C23821();
                            }
                            try {
                                bufferedInputStreamM36518.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        bufferedOutputStreamM36525.close();
                        bufferedInputStreamM36518.close();
                        this.f9086 = z;
                        if (m8739()) {
                            return;
                        }
                        this.f9094.m21770();
                        c5477M15575 = C5477.m15575(c15587M51201);
                    } catch (Throwable th4) {
                        try {
                            bufferedOutputStreamM36525.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    bufferedInputStreamM36518.close();
                    throw th6;
                }
            }
            if (!m8739()) {
                this.f9088 = new C18177(c5477M15575, this.f9090.getCacheDir());
            } else {
                c5477M15575.close();
            }
        } catch (Throwable th7) {
            th = th7;
            c5477M15575 = null;
            if (c5477M15575 != null) {
                c5477M15575.close();
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C18177 c18177;
        boolean z = this.f9089;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (z) {
            viewOnClickListenerC5396.m15392();
            return;
        }
        if (m8739() || (c18177 = this.f9088) == null) {
            m8738();
            if (viewOnClickListenerC5396.m15401()) {
                return;
            }
            viewOnClickListenerC5396.finish();
            return;
        }
        this.f9090.m15387(c18177, this.f9093, this.f9094, this.f9096, this.f9086);
        this.f9088 = null;
        this.f9093 = null;
        if (viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed() || viewOnClickListenerC5396.m15393() || C23196.m51454()) {
            return;
        }
        C21374.m48463(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        m8738();
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f9090;
        if (viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed()) {
            return;
        }
        viewOnClickListenerC5396.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m8738() {
        C18177 c18177 = this.f9088;
        if (c18177 != null) {
            try {
                c18177.close();
            } catch (IOException unused) {
            }
            this.f9088 = null;
        }
        C23034 c23034 = this.f9093;
        if (c23034 == null || this.f9090.m15391(c23034)) {
            return;
        }
        try {
            this.f9093.m51197();
        } catch (IOException unused2) {
        }
        this.f9093 = null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m8739() {
        if (this.f9090.m15400()) {
            return true;
        }
        C13136 c13136 = this.f23322;
        return c13136 != null && c13136.m31868();
    }
}
