package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17038 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52213;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16765 f52214;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19156 f52215;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18177 f52216;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f52217;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f52218;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f52219;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18450 f52220;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16059 f52221;

    public C17038(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18450 c18450, C18177 c18177, byte[] bArr, int i, C6807 c6807) {
        this.f52215 = viewOnClickListenerC19156;
        this.f52220 = c18450;
        this.f52216 = c18177;
        this.f52217 = bArr;
        this.f52213 = i;
        this.f52219 = c6807;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C18450 c18450 = this.f52220;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f52215;
        ViewOnClickListenerC19156.m44225(viewOnClickListenerC19156, c18450);
        this.f52214 = this.f52216.m42397();
        m20269(viewOnClickListenerC19156.f60359, R.string.MT_Protector, 200, new Runnable() { // from class: l.ܽ֫ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C17038.m39999(this.f50289);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39999(C17038 c17038) {
        c17038.f23322.m31860((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m39998() {
        C13136 c13136 = this.f23322;
        if (this.f52220.mo1526()) {
            return true;
        }
        return c13136 != null && c13136.m31868();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        try {
            this.f52221 = this.f52214.m39444(new InterfaceC17066() { // from class: l.ᩳ֫ܳ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f54293.m39998();
                }
            });
            ViewOnClickListenerC19156.m44223(this.f52214);
            C16059 c16059 = this.f52221;
            InterfaceC17066 interfaceC17066 = new InterfaceC17066() { // from class: l.ᩳ֫ܳ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f54293.m39998();
                }
            };
            byte[] bArr = this.f52217;
            int iM37964 = c16059.m37964(bArr, this.f52213, interfaceC17066);
            this.f52218 = iM37964;
            if (iM37964 != -1 || m39998()) {
                return;
            }
            this.f52218 = this.f52221.m37964(bArr, 0, new InterfaceC17066() { // from class: l.ᩳ֫ܳ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f54293.m39998();
                }
            });
        } catch (Throwable th) {
            ViewOnClickListenerC19156.m44223(this.f52214);
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws IOException {
        C18177 c18177 = this.f52216;
        C16059 c16059 = this.f52221;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f52215;
        if (ViewOnClickListenerC19156.m44229(viewOnClickListenerC19156, c18177, c16059) && !m39998()) {
            int i = this.f52218;
            if (i == -1) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            int length = this.f52217.length;
            int length2 = this.f52221.length();
            long j = ((long) i) + ((long) length);
            if (i >= 0 && length > 0 && j <= length2) {
                int i2 = ((int) j) - 1;
                viewOnClickListenerC19156.f60365 = new C20567(this.f52216, this.f52221.m37965(), this.f52218, i2);
                this.f52219.m18476(this.f52218, i2);
                return;
            }
            throw new IOException("Search result exceeds snapshot length");
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof C23821) {
            return;
        }
        ViewOnClickListenerC19156.m44224(this.f52215, this.f52219, this.f52216, exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ViewOnClickListenerC19156.m44223(this.f52214);
        C16059 c16059 = this.f52221;
        if (c16059 != null) {
            try {
                c16059.close();
            } catch (IOException unused) {
            }
        }
        m20273();
        ViewOnClickListenerC19156.m44230(this.f52215, this.f52220);
    }
}
