package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class C10689 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f32165;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16765 f32166;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19156 f32167;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18177 f32168;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f32169;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32170;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f32171;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18450 f32172;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16059 f32173;

    public C10689(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18450 c18450, C18177 c18177, byte[] bArr, long j, C6807 c6807) {
        this.f32167 = viewOnClickListenerC19156;
        this.f32172 = c18450;
        this.f32168 = c18177;
        this.f32169 = bArr;
        this.f32165 = j;
        this.f32171 = c6807;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C18450 c18450 = this.f32172;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f32167;
        ViewOnClickListenerC19156.m44225(viewOnClickListenerC19156, c18450);
        this.f32166 = this.f32168.m42397();
        m20269(viewOnClickListenerC19156.f60359, R.string.MT_Protector, 200, new Runnable() { // from class: l.۟۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C10689.m26813(this.f22517);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26813(C10689 c10689) {
        c10689.f23322.m31860((Runnable) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26814(C10689 c10689) {
        C13136 c13136 = c10689.f23322;
        if (c10689.f32172.mo1526()) {
            return true;
        }
        return c13136 != null && c13136.m31868();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        try {
            this.f32173 = this.f32166.m39444(new InterfaceC17066() { // from class: l.֫֫ܳ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return C10689.m26814(this.f5375);
                }
            });
            ViewOnClickListenerC19156.m44223(this.f32166);
            C16059 c16059 = this.f32173;
            InterfaceC17066 interfaceC17066 = new InterfaceC17066() { // from class: l.֫֫ܳ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return C10689.m26814(this.f5375);
                }
            };
            byte[] bArr = this.f32169;
            if (bArr == null || bArr.length == 0) {
                throw new IllegalArgumentException("Search pattern must not be empty");
            }
            long jM44219 = (((long) ViewOnClickListenerC19156.m44219(this.f32165, true)) - ((long) bArr.length)) + 1;
            int iM44219 = jM44219 < 0 ? -1 : ViewOnClickListenerC19156.m44219(jM44219, false);
            InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
            int iM37967 = c16059.m37967(bArr, iM44219, interfaceC17066M38504);
            if (iM37967 == -1 && !interfaceC17066M38504.mo1526()) {
                iM37967 = c16059.m37967(bArr, c16059.length(), interfaceC17066M38504);
            }
            this.f32170 = iM37967;
        } catch (Throwable th) {
            ViewOnClickListenerC19156.m44223(this.f32166);
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() throws IOException {
        C18177 c18177 = this.f32168;
        C16059 c16059 = this.f32173;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f32167;
        if (ViewOnClickListenerC19156.m44229(viewOnClickListenerC19156, c18177, c16059)) {
            C13136 c13136 = this.f23322;
            if (this.f32172.mo1526()) {
                return;
            }
            if (c13136 == null || !c13136.m31868()) {
                int i = this.f32170;
                if (i == -1) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                int length = this.f32169.length;
                int length2 = this.f32173.length();
                long j = ((long) i) + ((long) length);
                if (i >= 0 && length > 0 && j <= length2) {
                    int i2 = ((int) j) - 1;
                    viewOnClickListenerC19156.f60365 = new C20567(this.f32168, this.f32173.m37965(), this.f32170, i2);
                    this.f32171.m18476(this.f32170, i2);
                    return;
                }
                throw new IOException("Search result exceeds snapshot length");
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof C23821) {
            return;
        }
        ViewOnClickListenerC19156.m44224(this.f32167, this.f32171, this.f32168, exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ViewOnClickListenerC19156.m44223(this.f32166);
        C16059 c16059 = this.f32173;
        if (c16059 != null) {
            try {
                c16059.close();
            } catch (IOException unused) {
            }
        }
        m20273();
        ViewOnClickListenerC19156.m44230(this.f32167, this.f32172);
    }
}
