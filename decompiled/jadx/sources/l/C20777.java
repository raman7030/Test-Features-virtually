package l;

import com.alipay.sdk.m.y.o;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20777 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C22913 f67284;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17248 f67285;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16747 f67286;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14425 f67287 = new C14425();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6665 f67288;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12392 f67289;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23803 f67290;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m47485(C15068 c15068) {
        m47499(true, false, false);
        this.f67287.f44222 = false;
        this.f67284 = C22913.m50999(c15068);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47500(int i, int i2, int i3, int i4) {
        return i >= 0 && i <= i3 && i4 <= i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized boolean m47501(C10193 c10193) {
        C4048 c4048;
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        C23097 c23097M51001 = this.f67284.m51001();
        if (c10193.m25591()) {
            C20798 c20798 = c10193.f30625;
            if (c20798.f67336 == interfaceC7785M30436 && c20798.f67334 == c23097M51001 && c23097M51001.m51272()) {
                int i = c10193.f30624;
                C14425 c14425 = this.f67287;
                if (i == c14425.f44223 && !c14425.f44215) {
                    C4048 c4049 = c14425.f44216;
                    if (c4049 == null || !c4049.m12169(interfaceC7785M30436, c23097M51001, interfaceC7785M30436.mo26548(), interfaceC7785M30436.length())) {
                        int iMo26548 = interfaceC7785M30436.mo26548();
                        int length = interfaceC7785M30436.length();
                        C13035 c13035 = c10193.f30626;
                        c4048 = new C4048(interfaceC7785M30436, c23097M51001, iMo26548, length, c13035, c13035);
                    } else {
                        C13035 c13036 = c4049.f12857;
                        C13035 c13037 = c10193.f30626;
                        if (c13036 == c13037) {
                            return true;
                        }
                        c4048 = c4049.m12167(c13037);
                    }
                    C14425 c14426 = this.f67287;
                    c14426.f44216 = c4048.m12166(c14426.f44217);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public synchronized boolean m47506(InterfaceC20445 interfaceC20445) {
        C7185 c7185;
        m47515();
        if (!this.f67287.f44222) {
            return false;
        }
        if (m47502(interfaceC20445, interfaceC20445.mo26548()) && this.f67284.m51000() != null) {
            m47509();
            RunnableC17954 runnableC17954M47477 = m47477(interfaceC20445, interfaceC20445.mo26548(), this.f67285.f52874);
            C17248 c17248 = this.f67285;
            c17248.f52868 = true;
            c17248.f52871 = runnableC17954M47477;
            this.f67289.post(runnableC17954M47477);
            return true;
        }
        if (m47531(interfaceC20445)) {
            return false;
        }
        if (this.f67288.f20707 != null) {
            m47533();
        }
        if (m47510(interfaceC20445)) {
            m47514(interfaceC20445, false);
        } else if (m47528((CharSequence) interfaceC20445)) {
            if (!m47521(interfaceC20445)) {
                return false;
            }
            if (this.f67288.f20710 && m47511(interfaceC20445)) {
                int i = m47504(interfaceC20445) ? this.f67288.f20719 : this.f67288.f20699;
                int i2 = m47504(interfaceC20445) ? this.f67288.f20709 : this.f67288.f20706;
                m47507();
                m47488(interfaceC20445, i, i2, false);
            } else if (!m47511(interfaceC20445) && !m47516()) {
                if (m47504(interfaceC20445)) {
                    C7185 c7186 = this.f67287.f44217;
                    if (c7186 != null) {
                        C6665 c6665 = this.f67288;
                        if (c7186.m19244(c6665.f20719, c6665.f20709)) {
                            if (!m47504(interfaceC20445)) {
                                C6665 c6666 = this.f67288;
                                c6666.f20719 = -1;
                                c6666.f20709 = -1;
                                c6666.f20718 = 0;
                                c6666.f20701 = 0;
                                c6666.f20716 = null;
                                c7185 = this.f67287.f44217;
                                if (c7185 != null) {
                                    m47534(interfaceC20445, this.f67287.f44217.m19245(), this.f67287.f44217.m19241());
                                }
                            }
                        }
                    }
                    C6665 c6667 = this.f67288;
                    m47488(interfaceC20445, c6667.f20719, c6667.f20709, false);
                } else if (!m47504(interfaceC20445)) {
                    C6665 c6668 = this.f67288;
                    c6668.f20719 = -1;
                    c6668.f20709 = -1;
                    c6668.f20718 = 0;
                    c6668.f20701 = 0;
                    c6668.f20716 = null;
                    c7185 = this.f67287.f44217;
                    if (c7185 != null && c7185.m19250()) {
                        m47534(interfaceC20445, this.f67287.f44217.m19245(), this.f67287.f44217.m19241());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized void m47536() {
        m47485((C15068) null);
        this.f67287.f44222 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47537() {
        if (this.f67288.f20696 != null) {
            m47499(false, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47540(C10130 c10130) {
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        C22707 c22707 = m47502(interfaceC7785M30436, interfaceC7785M30436.mo26548()) ? this.f67285.f52874 : null;
        C22913 c22913 = this.f67284;
        C9302 c9302 = this.f67287.f44224;
        C14425 c14425 = this.f67287;
        C17975 c17975 = c14425.f44221;
        boolean z = c14425.f44222;
        C14425 c14426 = this.f67287;
        C18660.m43265(c10130, c22913, c9302, c17975, z, c14426.f44215, c14426.f44217, c22707);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47543(int i, int i2) {
        C14425 c14425;
        C7185 c7185;
        c14425 = this.f67287;
        return c14425.f44215 || ((c7185 = c14425.f44217) != null && c7185.m19244(i, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47546(C12951 c12951, int i) {
        m47499(true, false, false);
        this.f67287.f44222 = false;
        C15836 c15836M43260 = C18660.m43260(i, this.f67289.m30436().length(), c12951);
        this.f67284 = c15836M43260.m37489();
        m47483(c15836M43260.m37493(), c15836M43260.m37488(), c15836M43260.m37490(), c15836M43260.m37492(), false);
        this.f67287.f44222 = c15836M43260.m37494();
        C22707 c22707M37491 = c15836M43260.m37491();
        if (this.f67287.f44222 && c22707M37491 != null) {
            InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
            m47509();
            m47532();
            C17248 c17248 = this.f67285;
            c17248.f52874 = c22707M37491;
            c17248.f52878 = true;
            c17248.f52876 = interfaceC7785M30436.mo26548();
            c17248.f52872 = interfaceC7785M30436.length();
            c17248.f52875 = interfaceC7785M30436;
            c17248.f52866 = false;
            c17248.f52868 = false;
        } else if (this.f67287.f44222 && c15836M43260.m37492() != null) {
            m47489(this.f67289.m30436(), c15836M43260.m37492());
        }
        return this.f67287.f44222;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47549() {
        m47499(true, false, false);
        this.f67287.f44219 = null;
        this.f67287.f44220 = null;
        this.f67287.f44225 = null;
        this.f67287.f44222 = false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m47553() {
        if (this.f67289.m30483() && !this.f67289.m30532()) {
            InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
            if (m47502(interfaceC7785M30436, interfaceC7785M30436.mo26548())) {
                return -1L;
            }
            if (this.f67284.m51000() != null && m47559() == null) {
                return -1L;
            }
            C14425 c14425 = this.f67287;
            C7185 c7185 = c14425.f44217;
            if (c7185 != null) {
                if (m47504(this.f67289.m30436()) && c7185.m19250()) {
                    return (((long) c7185.m19245()) << 32) | (((long) c7185.m19241()) & 4294967295L);
                }
                return -1L;
            }
            if (c14425.f44224 != null && !this.f67287.f44215) {
                return -1L;
            }
            C6665 c6665 = this.f67288;
            return (c6665.f20699 == -1 && c6665.f20708 == -1 && !m47504(this.f67289.m30436())) ? Long.MIN_VALUE : -1L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47554(CharSequence charSequence) {
        if (m47526(charSequence)) {
            m47508((InterfaceC20445) charSequence);
            return;
        }
        if (this.f67289.m30436() == charSequence) {
            m47499(true, false, false);
            this.f67287.f44222 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47555(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (this.f67287.f44222 && this.f67288.f20704 == interfaceC20445 && m47523((CharSequence) interfaceC20445) && i < i2 && i2 <= interfaceC20445.length()) {
            m47479(interfaceC20445, interfaceC20445.mo26548(), C22707.m50723(-1, -1, i, i2), EnumC16542.MERGE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47556(int i, int i2) {
        boolean z;
        InterfaceC20445 interfaceC20445M30436 = this.f67289.m30436();
        if (!m47519((CharSequence) interfaceC20445M30436)) {
            return false;
        }
        if (i >= 0 && i <= i2 && i2 <= interfaceC20445M30436.length()) {
            if (m47511(interfaceC20445M30436)) {
                C6665 c6665 = this.f67288;
                return !m47500(c6665.f20699, c6665.f20706, i, i2);
            }
            if (m47516()) {
                C6665 c6666 = this.f67288;
                return !m47500(c6666.f20708, c6666.f20713, i, i2);
            }
            C7185 c7185 = this.f67287.f44217;
            if (c7185 != null && c7185.m19244(i, i2)) {
                return false;
            }
            if (m47504(interfaceC20445M30436)) {
                C6665 c6667 = this.f67288;
                z = m47500(c6667.f20719, c6667.f20709, i, i2) ? false : true;
            }
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47558(InterfaceC20445 interfaceC20445) {
        C7185 c7185;
        m47515();
        if (m47519((CharSequence) interfaceC20445)) {
            if (!m47504(interfaceC20445) && !m47511(interfaceC20445) && !m47516() && ((c7185 = this.f67287.f44217) == null || c7185.m19247().m23880() != interfaceC20445.length())) {
                m47491(interfaceC20445, false);
            }
            m47506(interfaceC20445);
            return false;
        }
        if (!m47523((CharSequence) interfaceC20445)) {
            return true;
        }
        C9302 c9302 = this.f67287.f44224;
        if (this.f67287.f44217 != null || c9302 == null || c9302.m23880() != interfaceC20445.length()) {
            m47508(interfaceC20445);
        } else if (!this.f67287.f44215 && m47510(interfaceC20445)) {
            m47514(interfaceC20445, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47560(InterfaceC20445 interfaceC20445) {
        int iM19245;
        if (this.f67287.f44222 && this.f67288.f20704 == interfaceC20445 && this.f67287.f44224 != null && this.f67287.f44224.m23880() == interfaceC20445.length() && interfaceC20445.length() != 0) {
            int length = interfaceC20445.length();
            if (!m47523((CharSequence) interfaceC20445)) {
                C7185 c7185 = this.f67287.f44217;
                if (m47528((CharSequence) interfaceC20445) && c7185 != null && c7185.m19250()) {
                    iM19245 = c7185.m19245();
                    length = c7185.m19241();
                }
                return;
            }
            iM19245 = 0;
            m47509();
            m47479(interfaceC20445, interfaceC20445.mo26548(), C22707.m50723(-1, -1, iM19245, length), EnumC16542.MERGE);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47561() {
        return this.f67287.f44215;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47570() {
        m47499(false, true, true);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized void m47574(InterfaceC20445 interfaceC20445) {
        if (this.f67287.f44222 && this.f67289.isAttachedToWindow() && this.f67289.m30389() && !this.f67289.m30532()) {
            if (m47523((CharSequence) interfaceC20445)) {
                if (this.f67288.f20696 != interfaceC20445) {
                    m47514(interfaceC20445, true);
                }
            } else if (m47528((CharSequence) interfaceC20445) && m47504(interfaceC20445)) {
                C6665 c6665 = this.f67288;
                m47488(interfaceC20445, c6665.f20719, c6665.f20709, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47538(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (i2 == 0 && i3 == 0) {
                this.f67290.f77021 = false;
                return;
            }
            m47515();
            C15068 c15068M51000 = this.f67284.m51000();
            if (c15068M51000 != null && this.f67287.f44222 && (charSequence instanceof InterfaceC20445)) {
                InterfaceC20445 interfaceC20445 = (InterfaceC20445) charSequence;
                if (m47526((CharSequence) interfaceC20445)) {
                    boolean zM30532 = this.f67289.m30532();
                    C4048 c4048 = this.f67287.f44216;
                    if (c4048 != null) {
                        this.f67287.f44216 = zM30532 ? null : c4048.m12168(interfaceC20445, this.f67284.m51001(), interfaceC20445.mo26548(), interfaceC20445.length(), i, i2, i3, (i <= 0 || this.f67287.f44224 == null || i > this.f67287.f44224.m23880()) ? c15068M51000.m35661() : this.f67287.f44224.m23883(i - 1));
                    }
                    m47487(interfaceC20445, i, i2, i3, zM30532);
                    m47486(interfaceC20445, i, i2, i3, c15068M51000, zM30532);
                    return;
                }
            }
            this.f67290.f77021 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C20777(C12392 c12392, C20177 c20177) {
        C6665 c6665 = new C6665();
        c6665.f20699 = -1;
        c6665.f20706 = -1;
        c6665.f20719 = -1;
        c6665.f20709 = -1;
        c6665.f20708 = -1;
        c6665.f20713 = -1;
        this.f67288 = c6665;
        C17248 c17248 = new C17248();
        C22707 c22707 = C22707.f73353;
        c17248.f52869 = c22707;
        c17248.f52874 = c22707;
        this.f67285 = c17248;
        this.f67290 = new C23803();
        this.f67289 = c12392;
        this.f67286 = new C16747(new ExecutorC1726(c12392), new C10899(this, c12392));
        m47485((C15068) null);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C9302 m47551() {
        return this.f67287.f44224;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47495(C20777 c20777, C10193 c10193) {
        if (c20777.m47501(c10193)) {
            c20777.f67289.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47539(C7391 c7391, int i, int i2) {
        int iM19241;
        int iM19245 = -1;
        c7391.m19901((C13035) null, -1, -1, 0);
        C10193 c10193M39419 = this.f67286.m39419();
        C4048 c4048 = this.f67287.f44216;
        if (c10193M39419 == null && c4048 == null) {
            return;
        }
        C23097 c23097M51001 = this.f67284.m51001();
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        if (this.f67287.f44222 && c23097M51001 != null && c23097M51001.m51272() && this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532() && !this.f67287.f44215) {
            if (c10193M39419 != null && (c4048 == null || c4048.f12857 != c10193M39419.f30626)) {
                m47501(c10193M39419);
                c4048 = this.f67287.f44216;
            }
            if (c4048 == null || !c4048.m12169(interfaceC7785M30436, c23097M51001, interfaceC7785M30436.mo26548(), interfaceC7785M30436.length())) {
                return;
            }
            C13035 c13035 = c4048.f12860;
            if (c13035.f39035 <= i || c13035.f39036 >= i2) {
                return;
            }
            C7185 c7185 = this.f67287.f44217;
            if (c7185 == null || !c7185.m19250()) {
                iM19241 = -1;
            } else {
                iM19245 = c7185.m19245();
                iM19241 = c7185.m19241();
                if (iM19245 <= Math.max(i, c13035.f39036) && Math.min(i2, c13035.f39035) <= iM19241) {
                    return;
                }
            }
            c7391.m19901(c13035, iM19245, iM19241, c23097M51001.f74319.m49205());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m47571() {
        this.f67289.m30415();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9302 m47573() {
        if (!this.f67287.f44222) {
            return null;
        }
        C23097 c23097M51001 = this.f67284.m51001();
        C23598 c23598 = this.f67287.f44225;
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        if (c23598 != null && c23097M51001 != null && c23097M51001.m51272() && c23598.f76505 == interfaceC7785M30436 && c23598.f76503 == c23097M51001 && c23598.f76502 == interfaceC7785M30436.mo26548() && c23598.f76506 == interfaceC7785M30436.length()) {
            return c23598.f76504;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6686 m47559() {
        if (!this.f67287.f44222) {
            return null;
        }
        C6686 c6686 = this.f67287.f44219;
        C23097 c23097M51001 = this.f67284.m51001();
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        if (c6686 == null || c23097M51001 == null || !c23097M51001.m51272() || !c6686.m18229(interfaceC7785M30436, c23097M51001)) {
            return null;
        }
        return c6686;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6686 m47572() {
        if (!this.f67287.f44222) {
            return null;
        }
        C6686 c6686 = this.f67287.f44220;
        C23097 c23097M51001 = this.f67284.m51001();
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        if (c6686 == null || c23097M51001 == null || !c23097M51001.m51272() || !c6686.m18229(interfaceC7785M30436, c23097M51001)) {
            return null;
        }
        return c6686;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47568(InterfaceC20445 interfaceC20445) {
        boolean z;
        C5959 c5959;
        C7370 c7370;
        C7370 c7370M39423;
        C5959 c5959M39421;
        synchronized (this) {
            z = false;
            if (this.f67288.f20696 != interfaceC20445 || m47515()) {
                c5959 = null;
                c7370 = null;
            } else {
                C6665 c6665 = this.f67288;
                c6665.f20714 = true;
                c5959 = c6665.f20715;
                c7370 = c6665.f20702;
                if (c5959 == null && (c5959M39421 = this.f67286.m39421()) != null && this.f67286.m39417(c5959M39421)) {
                    c5959 = c5959M39421;
                }
                if (c7370 == null && (c7370M39423 = this.f67286.m39423()) != null && this.f67286.m39418(c7370M39423)) {
                    c7370 = c7370M39423;
                }
                if (c5959 != null || c7370 != null) {
                    m47505();
                } else {
                    C6665 c6666 = this.f67288;
                    if (c6666.f20697 || c6666.f20710) {
                        m47505();
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (c5959 != null) {
            m47481(c5959);
            return;
        }
        if (c7370 != null) {
            m47482(c7370);
        } else if (z) {
            this.f67289.m30405();
        } else {
            if (m47506(interfaceC20445)) {
                return;
            }
            this.f67289.m30405();
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m47535() {
        this.f67289.m30515();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47563(InterfaceC20445 interfaceC20445) {
        boolean z;
        RunnableC17954 runnableC17954M47477;
        synchronized (this) {
            boolean z2 = true;
            z = false;
            if (m47502(interfaceC20445, interfaceC20445.mo26548()) && this.f67284.m51000() != null) {
                m47509();
                runnableC17954M47477 = m47477(interfaceC20445, interfaceC20445.mo26548(), this.f67285.f52874);
                C17248 c17248 = this.f67285;
                boolean z3 = c17248.f52868;
                C6665 c6665 = this.f67288;
                if ((!c6665.f20697 || c6665.f20704 != interfaceC20445) && (!c6665.f20710 || !m47511(interfaceC20445))) {
                    z2 = false;
                }
                c17248.f52868 = z2 | z3;
                this.f67285.f52871 = runnableC17954M47477;
            } else {
                C6665 c6666 = this.f67288;
                if ((!c6666.f20697 || c6666.f20704 != interfaceC20445) && (!c6666.f20710 || !m47511(interfaceC20445))) {
                    z2 = false;
                }
                runnableC17954M47477 = null;
                z = z2;
            }
        }
        if (runnableC17954M47477 == null) {
            if (z) {
                m47506(interfaceC20445);
            }
            this.f67289.m30405();
        } else {
            C12392 c12392 = this.f67289;
            c12392.postInvalidate();
            c12392.post(runnableC17954M47477);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47542(InterfaceC20445 interfaceC20445, int i, int i2) {
        C7185 c7185;
        C7185 c7186;
        this.f67286.m39412(interfaceC20445, i, i2);
        synchronized (this) {
            if (this.f67287.f44222 && this.f67289.isAttachedToWindow() && !this.f67289.m30532() && this.f67288.f20704 == interfaceC20445) {
                if (m47523((CharSequence) interfaceC20445) && this.f67287.f44215) {
                    return;
                }
                if (i2 <= i || !m47528((CharSequence) interfaceC20445) || (c7186 = this.f67287.f44217) == null || !c7186.m19244(i, i2)) {
                    if (i2 > i && m47528((CharSequence) interfaceC20445) && ((c7185 = this.f67287.f44217) == null || !c7185.m19244(i, i2))) {
                        m47488(interfaceC20445, i, i2, this.f67289.m30389());
                    }
                    C16747 c16747 = this.f67286;
                    c16747.m39411(c16747.m39409(interfaceC20445));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47541(InterfaceC20445 interfaceC20445) {
        if (m47506(interfaceC20445)) {
            return;
        }
        this.f67289.m30405();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m47523(CharSequence charSequence) {
        return m47526(charSequence) && charSequence.length() <= 1000000;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m47519(CharSequence charSequence) {
        return m47526(charSequence) && charSequence.length() > 1000000;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m47510(InterfaceC20445 interfaceC20445) {
        if (!m47523((CharSequence) interfaceC20445)) {
            return false;
        }
        C12392 c12392 = this.f67289;
        return c12392.isAttachedToWindow() && c12392.m30483() && !c12392.m30532();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private boolean m47521(InterfaceC20445 interfaceC20445) {
        if (!m47528((CharSequence) interfaceC20445)) {
            return false;
        }
        C12392 c12392 = this.f67289;
        return c12392.isAttachedToWindow() && c12392.m30483() && !c12392.m30532();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47514(InterfaceC20445 interfaceC20445, boolean z) {
        if (m47529(interfaceC20445) || m47531(interfaceC20445)) {
            return;
        }
        if (this.f67288.f20707 != null) {
            m47533();
        }
        m47505();
        C6665 c6665 = this.f67288;
        c6665.f20697 = false;
        c6665.f20704 = interfaceC20445;
        if (z) {
            c6665.f20696 = interfaceC20445;
        }
        this.f67286.m39415(this.f67284.m51001(), interfaceC20445, this.f67287.f44224, this.f67287.f44223);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47488(InterfaceC20445 interfaceC20445, int i, int i2, boolean z) {
        if (z || m47521(interfaceC20445)) {
            m47534(interfaceC20445, i, i2);
            if (m47529(interfaceC20445)) {
                return;
            }
            if (m47511(interfaceC20445)) {
                C6665 c6665 = this.f67288;
                if (c6665.f20699 <= i && i2 <= c6665.f20706) {
                    return;
                }
            }
            if (m47516()) {
                C6665 c6666 = this.f67288;
                if (c6666.f20708 <= i && i2 <= c6666.f20713) {
                    return;
                }
            }
            m47530();
            m47505();
            if (z) {
                this.f67288.f20696 = interfaceC20445;
            }
            C6665 c6667 = this.f67288;
            c6667.f20704 = interfaceC20445;
            c6667.f20699 = i;
            c6667.f20706 = i2;
            c6667.f20705 = interfaceC20445.mo26548();
            this.f67288.f20700 = interfaceC20445.length();
            C6665 c6668 = this.f67288;
            c6668.f20717 = this.f67287.f44223;
            c6668.f20710 = false;
            this.f67286.m39420(this.f67284.m51001(), interfaceC20445, i, i2, this.f67287.f44223);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47518(InterfaceC20445 interfaceC20445, int i, int i2) {
        boolean zM47511 = m47511(interfaceC20445);
        C6665 c6665 = this.f67288;
        if ((!zM47511 || !m47500(c6665.f20699, c6665.f20706, i, i2)) && c6665.f20699 != -1) {
            this.f67286.m39422();
            m47507();
        }
        if (c6665.f20708 != -1 && (!m47516() || !m47500(c6665.f20708, c6665.f20713, i, i2))) {
            m47530();
        }
        c6665.f20704 = interfaceC20445;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47491(InterfaceC20445 interfaceC20445, boolean z) {
        m47499(false, false, false);
        C7185 c7185M19240 = C7185.m19240(interfaceC20445.length(), this.f67284.m51000().m35661());
        m47483(c7185M19240.m19247(), (C17975) null, false, c7185M19240, z);
        m47534(interfaceC20445, 0, Math.min(interfaceC20445.length(), 10000));
        this.f67287.f44222 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47499(boolean z, boolean z2, boolean z3) {
        if (z || !z3) {
            this.f67287.f44216 = null;
        }
        this.f67286.m39410();
        C6665 c6665 = this.f67288;
        c6665.f20697 = false;
        c6665.f20704 = null;
        m47505();
        m47507();
        if (!z2) {
            m47533();
            m47530();
        }
        if (!z3) {
            C6665 c6666 = this.f67288;
            c6666.f20719 = -1;
            c6666.f20709 = -1;
            c6666.f20718 = 0;
            c6666.f20701 = 0;
            c6666.f20716 = null;
            m47532();
        }
        if (z) {
            this.f67287.f44222 = false;
            m47483((C9302) null, (C17975) null, false, (C7185) null, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47507() {
        C6665 c6665 = this.f67288;
        c6665.f20699 = -1;
        c6665.f20706 = -1;
        c6665.f20705 = 0;
        c6665.f20700 = 0;
        c6665.f20717 = 0;
        c6665.f20710 = false;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m47530() {
        C6665 c6665 = this.f67288;
        c6665.f20708 = -1;
        c6665.f20713 = -1;
        c6665.f20712 = 0;
        c6665.f20703 = 0;
        c6665.f20720 = null;
        c6665.getClass();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m47533() {
        C6665 c6665 = this.f67288;
        c6665.f20698 = 0;
        c6665.f20711 = 0;
        c6665.f20707 = null;
        c6665.getClass();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m47505() {
        C6665 c6665 = this.f67288;
        c6665.f20696 = null;
        c6665.f20715 = null;
        c6665.f20702 = null;
        c6665.f20714 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m47534(InterfaceC20445 interfaceC20445, int i, int i2) {
        C11003.checkFromToIndex(i, i2, interfaceC20445.length());
        C6665 c6665 = this.f67288;
        c6665.f20719 = i;
        c6665.f20709 = i2;
        c6665.f20718 = interfaceC20445.mo26548();
        c6665.f20701 = interfaceC20445.length();
        c6665.f20716 = interfaceC20445;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m47504(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20716 == interfaceC20445 && c6665.f20719 != -1 && c6665.f20718 == interfaceC20445.mo26548() && c6665.f20701 == interfaceC20445.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47489(InterfaceC20445 interfaceC20445, C7185 c7185) {
        C17248 c17248 = this.f67285;
        c17248.f52870 = c7185;
        c17248.f52869 = C22707.m50723(-1, -1, c7185.m19245(), c7185.m19241());
        c17248.f52877 = interfaceC20445.mo26548();
        c17248.f52867 = interfaceC20445.length();
        c17248.f52873 = interfaceC20445;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47498(C20777 c20777, InterfaceC20445 interfaceC20445, C22707 c22707) {
        C17248 c17248 = c20777.f67285;
        c17248.f52870 = null;
        c17248.f52869 = c22707;
        c17248.f52877 = interfaceC20445.mo26548();
        c17248.f52867 = interfaceC20445.length();
        c17248.f52873 = interfaceC20445;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m47532() {
        C17248 c17248 = this.f67285;
        c17248.f52870 = null;
        c17248.f52869 = C22707.f73353;
        c17248.f52877 = 0;
        c17248.f52867 = 0;
        c17248.f52873 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m47520() {
        m47509();
        C22707 c22707 = C22707.f73353;
        C17248 c17248 = this.f67285;
        c17248.f52874 = c22707;
        c17248.f52878 = false;
        c17248.f52876 = 0;
        c17248.f52872 = 0;
        c17248.f52875 = null;
        c17248.f52866 = false;
        c17248.f52868 = false;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m47509() {
        C17248 c17248 = this.f67285;
        RunnableC17954 runnableC17954 = c17248.f52871;
        c17248.f52871 = null;
        if (runnableC17954 != null) {
            this.f67289.removeCallbacks(runnableC17954);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m47502(InterfaceC20445 interfaceC20445, int i) {
        C17248 c17248 = this.f67285;
        return c17248.f52878 && c17248.f52875 == interfaceC20445 && c17248.f52876 == i && c17248.f52872 == interfaceC20445.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22707 m47479(InterfaceC20445 interfaceC20445, int i, C22707 c22707, EnumC16542 enumC16542) {
        boolean zM47502 = m47502(interfaceC20445, i);
        C17248 c17248 = this.f67285;
        if (!zM47502) {
            c17248.f52866 = false;
            c17248.f52868 = false;
        }
        if (enumC16542 != EnumC16542.REPLACE && zM47502) {
            c22707 = c17248.f52874.m50726(c22707);
        }
        c17248.f52874 = c22707;
        c17248.f52878 = true;
        c17248.f52876 = i;
        c17248.f52872 = interfaceC20445.length();
        c17248.f52875 = interfaceC20445;
        return c22707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47487(InterfaceC20445 interfaceC20445, int i, int i2, int i3, boolean z) {
        int i4;
        m47509();
        long length = (((long) interfaceC20445.length()) - ((long) i3)) + ((long) i2);
        int iMo26548 = interfaceC20445.mo26548();
        if (length >= 0 && length <= 2147483647L) {
            C17248 c17248 = this.f67285;
            if (c17248.f52878 && c17248.f52875 == interfaceC20445 && c17248.f52872 == (i4 = (int) length) && c17248.f52876 + 1 == iMo26548) {
                if (c17248.f52874.m50728() == null || z) {
                    m47520();
                    return;
                }
                C22707 c22707M50725 = c17248.f52874.m50725(i4, i, i2, i3);
                if (c22707M50725.m50728() == null) {
                    m47520();
                    return;
                }
                c17248.f52874 = c22707M50725;
                c17248.f52876 = iMo26548;
                c17248.f52872 = interfaceC20445.length();
                c17248.f52875 = interfaceC20445;
                return;
            }
        }
        m47520();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m47529(InterfaceC20445 interfaceC20445) {
        return this.f67285.f52868 && !this.f67289.m30389() && m47502(interfaceC20445, interfaceC20445.mo26548());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m47511(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20704 == interfaceC20445 && c6665.f20699 != -1 && c6665.f20705 == interfaceC20445.mo26548() && c6665.f20700 == interfaceC20445.length();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private boolean m47516() {
        InterfaceC7785 interfaceC7785M30436;
        C6665 c6665 = this.f67288;
        return c6665.f20708 != -1 && c6665.f20720 == (interfaceC7785M30436 = this.f67289.m30436()) && c6665.f20712 == interfaceC7785M30436.mo26548() && c6665.f20703 == interfaceC7785M30436.length();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m47531(InterfaceC20445 interfaceC20445) {
        C6665 c6665 = this.f67288;
        return c6665.f20707 == interfaceC20445 && c6665.f20698 == interfaceC20445.mo26548() && c6665.f20711 == interfaceC20445.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47486(InterfaceC20445 interfaceC20445, int i, int i2, int i3, C15068 c15068, boolean z) {
        C9302 c9302M23868;
        C9302 c9302M23869;
        boolean z2;
        int i4;
        int i5;
        int iM32578;
        int iM32577;
        C7185 c7185M19240;
        boolean z3;
        C22707 c22707M47478 = C22707.f73353;
        long j = i3;
        long j2 = i2;
        long length = (((long) interfaceC20445.length()) - j) + j2;
        if (length >= 0 && length <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0) {
            long j3 = ((long) i) + j2;
            if (j3 <= length) {
                int i6 = (int) length;
                if (interfaceC20445.length() <= 1000000) {
                    C9302 c9302 = this.f67287.f44224;
                    C14425 c14425 = this.f67287;
                    Integer num = c14425.f44218;
                    boolean z4 = c14425.f44217 == null && c9302 != null && c9302.m23880() == i6;
                    if (z || !z4) {
                        if (!z) {
                            c22707M47478 = m47478(interfaceC20445, i6, i, i2, i3, c15068);
                        }
                        m47499(false, false, false);
                        int length2 = interfaceC20445.length();
                        C21834 c21834M35661 = c15068.m35661();
                        if (length2 == 0) {
                            c9302M23868 = C9302.m23878();
                        } else {
                            c9302M23868 = C9302.m23868(length2, c21834M35661, false);
                        }
                        m47483(c9302M23868, (C17975) null, false, (C7185) null, !z);
                        this.f67287.f44222 = true;
                        if (!z) {
                            m47490(interfaceC20445, c22707M47478);
                        }
                        C23803 c23803 = this.f67290;
                        c23803.f77021 = false;
                        c23803.f77020 = i;
                        c23803.f77019 = i + i3;
                        return;
                    }
                    try {
                        C21834 c21834M35662 = (i <= 0 || i3 <= 0) ? c15068.m35661() : c9302.m23883(i - 1);
                        int i7 = i + i2;
                        if (i3 == 0) {
                            c9302M23869 = C9302.m23878();
                        } else {
                            c9302M23869 = C9302.m23868(i3, c21834M35662, false);
                        }
                        m47484(c9302.m23881(i, i7, c9302M23869), null, false, null, true, num, false);
                        this.f67287.f44222 = true;
                        C23803 c23804 = this.f67290;
                        c23804.f77021 = false;
                        c23804.f77020 = i;
                        c23804.f77019 = i + i3;
                        m47505();
                        if (m47529(interfaceC20445) || m47531(interfaceC20445)) {
                            return;
                        }
                        if (this.f67288.f20707 != null) {
                            m47533();
                        }
                        boolean z5 = this.f67289.m30389() && this.f67289.isAttachedToWindow() && !this.f67289.m30532();
                        if (!z5 && !m47510(interfaceC20445)) {
                            if (this.f67289.m30532()) {
                                m47499(false, false, false);
                                return;
                            }
                            return;
                        }
                        C6665 c6665 = this.f67288;
                        if (c6665.f20704 != interfaceC20445) {
                            m47514(interfaceC20445, false);
                            return;
                        }
                        c6665.f20697 = false;
                        if (z5) {
                            c6665.f20696 = interfaceC20445;
                        }
                        this.f67286.m39414(this.f67284.m51001(), interfaceC20445, i, i2, i3, this.f67287.f44224, this.f67287.f44223);
                        return;
                    } catch (RuntimeException unused) {
                        m47508(interfaceC20445);
                        C23803 c23805 = this.f67290;
                        c23805.f77021 = true;
                        c23805.f77020 = 0;
                        c23805.f77019 = interfaceC20445.length();
                        return;
                    }
                }
                if (i6 > 1000000 && m47519((CharSequence) interfaceC20445)) {
                    long length3 = (((long) interfaceC20445.length()) - j) + j2;
                    if (length3 >= 0 && length3 <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0 && j3 <= length3) {
                        int i8 = (int) length3;
                        int iMo26548 = interfaceC20445.mo26548();
                        C6665 c6666 = this.f67288;
                        if (c6666.f20716 == interfaceC20445 && (i4 = c6666.f20719) != -1 && c6666.f20701 == i8 && c6666.f20718 + 1 == iMo26548) {
                            i5 = c6666.f20709;
                        } else if (c6666.f20704 == interfaceC20445 && (i4 = c6666.f20699) != -1 && c6666.f20700 == i8 && c6666.f20705 + 1 == iMo26548) {
                            i5 = c6666.f20706;
                        } else if (c6666.f20720 == interfaceC20445 && (i4 = c6666.f20708) != -1 && c6666.f20703 == i8 && c6666.f20712 + 1 == iMo26548) {
                            i5 = c6666.f20713;
                        }
                        int i9 = i5;
                        int i10 = i4;
                        C9302 c9303 = this.f67287.f44224;
                        if (c9303 != null) {
                            if (this.f67287.f44217 != null && c9303.m23880() == i8 && this.f67287.f44217.m19247() == c9303) {
                                if (m47521(interfaceC20445)) {
                                    C13534 c13534M19242 = this.f67287.f44217.m19242(i, i2, i3, i10, i9, c15068.m35661());
                                    c7185M19240 = c13534M19242.m32576();
                                    iM32578 = c13534M19242.m32578();
                                    iM32577 = c13534M19242.m32577();
                                } else {
                                    long jM19237 = C7185.m19237(i8, i, i2, i3, i10, i9);
                                    iM32578 = (int) (jM19237 >>> 32);
                                    iM32577 = (int) jM19237;
                                    c7185M19240 = C7185.m19240(interfaceC20445.length(), c15068.m35661());
                                }
                            }
                        } else {
                            long jM19238 = C7185.m19237(i8, i, i2, i3, i10, i9);
                            iM32578 = (int) (jM19238 >>> 32);
                            iM32577 = (int) jM19238;
                            c7185M19240 = C7185.m19240(interfaceC20445.length(), c15068.m35661());
                        }
                        int i11 = iM32577;
                        C7185 c7185 = c7185M19240;
                        int i12 = iM32578;
                        boolean zM30532 = this.f67289.m30532();
                        C17248 c17248 = this.f67285;
                        C22707 c22707 = (c17248.f52873 == interfaceC20445 && c17248.f52867 == i8 && c17248.f52877 + 1 == iMo26548) ? c17248.f52869 : null;
                        c17248.f52870 = null;
                        if (c22707 == null) {
                            m47532();
                        } else {
                            if (!zM30532) {
                                c22707M47478 = c22707.m50725(i8, i, i2, i3);
                            }
                            c17248.f52869 = c22707M47478;
                            c17248.f52877 = iMo26548;
                            c17248.f52867 = interfaceC20445.length();
                            c17248.f52873 = interfaceC20445;
                        }
                        this.f67286.m39413(this.f67284.m51001(), interfaceC20445, i, i2, i3);
                        this.f67288.f20704 = interfaceC20445;
                        m47507();
                        m47530();
                        if (c7185 != null) {
                            m47483(c7185.m19247(), (C17975) null, false, c7185, true);
                        }
                        m47534(interfaceC20445, i12, i11);
                        if (m47521(interfaceC20445)) {
                            z3 = false;
                            m47488(interfaceC20445, i12, i11, false);
                        } else {
                            z3 = false;
                        }
                        C23803 c23806 = this.f67290;
                        c23806.f77021 = z3;
                        c23806.f77020 = i;
                        c23806.f77019 = i + i3;
                        return;
                    }
                }
                if (z) {
                    z2 = false;
                    m47491(interfaceC20445, false);
                } else {
                    C22707 c22707M47479 = m47478(interfaceC20445, i6, i, i2, i3, c15068);
                    m47491(interfaceC20445, true);
                    m47490(interfaceC20445, c22707M47479);
                    z2 = false;
                }
                C23803 c23807 = this.f67290;
                c23807.f77021 = z2;
                c23807.f77020 = i;
                c23807.f77019 = i + i3;
                return;
            }
        }
        m47508(interfaceC20445);
        C23803 c23808 = this.f67290;
        c23808.f77021 = true;
        c23808.f77020 = 0;
        c23808.f77019 = interfaceC20445.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22707 m47478(InterfaceC20445 interfaceC20445, int i, int i2, int i3, int i4, C15068 c15068) {
        C9302 c9302M23868;
        C22707 c22707M50723 = C22707.f73353;
        C14425 c14425 = this.f67287;
        C7185 c7185 = c14425.f44217;
        if (c7185 != null) {
            int iMo26548 = interfaceC20445.mo26548();
            C17248 c17248 = this.f67285;
            if (c17248.f52873 == interfaceC20445 && c17248.f52877 + 1 == iMo26548 && c17248.f52867 == i) {
                c22707M50723 = c17248.f52869;
            } else if (c7185.m19250()) {
                c22707M50723 = C22707.m50723(-1, -1, c7185.m19245(), c7185.m19241());
            }
        } else {
            C9302 c9302 = c14425.f44224;
            if (c9302 != null && c9302.m23880() == i) {
                C21834 c21834M35661 = c15068.m35661();
                if (i == 0) {
                    c9302M23868 = C9302.m23878();
                } else {
                    c9302M23868 = C9302.m23868(i, c21834M35661, false);
                }
                C14239 c14239M23887 = c9302.m23887(c9302M23868);
                if (c14239M23887 != null) {
                    c22707M50723 = C22707.m50723(-1, -1, c14239M23887.m33888(), c14239M23887.m33887());
                }
            } else {
                c22707M50723 = C22707.m50723(-1, -1, 0, i);
            }
        }
        return c22707M50723.m50725(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47490(InterfaceC20445 interfaceC20445, C22707 c22707) {
        RunnableC17954 runnableC17954M47513 = m47513(interfaceC20445, interfaceC20445.mo26548(), c22707, EnumC16542.MERGE);
        if (runnableC17954M47513 == null) {
            m47506(interfaceC20445);
            return;
        }
        boolean z = this.f67287.f44217 != null;
        C17248 c17248 = this.f67285;
        c17248.f52866 = z;
        c17248.f52868 = true;
        C12392 c12392 = this.f67289;
        c12392.postInvalidate();
        c12392.post(runnableC17954M47513);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47483(C9302 c9302, C17975 c17975, boolean z, C7185 c7185, boolean z2) {
        C22913 c22913 = this.f67284;
        C23097 c23097M51001 = c22913 == null ? null : c22913.m51001();
        m47484(c9302, c17975, z, c7185, z2, c23097M51001 != null ? Integer.valueOf(c23097M51001.m51274()) : null, false);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47484(C9302 c9302, C17975 c17975, boolean z, C7185 c7185, boolean z2, Integer num, boolean z3) {
        C6686 c6686M18221;
        C23598 c23598;
        C6686 c6686M18220;
        if (c7185 != null && c7185.m19247() != c9302) {
            throw new IllegalArgumentException("Window projection does not own visible store");
        }
        if (z && (c9302 == null || c17975 == null || c7185 != null || c17975.m42010() != c9302.m23880())) {
            throw new IllegalArgumentException("Invalid complete syntax display");
        }
        if (!z && c17975 != null) {
            throw new IllegalArgumentException("Incomplete syntax display cannot expose full contexts");
        }
        if (z2) {
            m47509();
        } else {
            m47520();
        }
        C22913 c22913 = this.f67284;
        C23097 c23097M51001 = c22913 == null ? null : c22913.m51001();
        InterfaceC7785 interfaceC7785M30436 = this.f67289.m30436();
        C4048 c4048 = this.f67287.f44216;
        if (c4048 != null) {
            this.f67287.f44216 = (z || c9302 == null || !c4048.m12169(interfaceC7785M30436, c23097M51001, interfaceC7785M30436.mo26548(), interfaceC7785M30436.length())) ? null : c4048.m12166(c7185);
        }
        if (c23097M51001 != null && c9302 != null) {
            if (z) {
                C11003.requireNonNull(c17975);
                c6686M18221 = C6686.m18220(interfaceC7785M30436, c23097M51001, c9302, c17975);
            } else if (c7185 == null || !c7185.m19246()) {
                c6686M18221 = null;
            } else {
                C17975 c17975M19249 = c7185.m19249();
                C11003.requireNonNull(c17975M19249);
                c6686M18221 = C6686.m18221(interfaceC7785M30436, c23097M51001, c9302, c17975M19249, c7185.m19245(), c7185.m19241());
            }
            if (num != null && num.intValue() == c23097M51001.m51274() && c9302.m23880() == interfaceC7785M30436.length()) {
                c23598 = new C23598(interfaceC7785M30436, c23097M51001, c9302);
                if (c6686M18221 == null && !c23097M51001.m51270()) {
                    c6686M18220 = C6686.m18220(interfaceC7785M30436, c23097M51001, c9302, C17975.m41992(interfaceC7785M30436.length(), c23097M51001.f74313));
                }
            } else {
                c6686M18220 = null;
                c23598 = null;
            }
            this.f67287.f44219 = null;
            this.f67287.f44220 = null;
            this.f67287.f44225 = null;
            C14425 c14425 = this.f67287;
            c14425.f44215 = z;
            c14425.f44221 = c17975;
            c14425.f44217 = c7185;
            if (c9302 == null) {
                num = null;
            }
            c14425.f44218 = num;
            c14425.f44223++;
            c14425.f44224 = c9302;
            this.f67287.f44225 = c23598;
            this.f67287.f44220 = c6686M18220;
            this.f67287.f44219 = c6686M18221;
            if (z3) {
                this.f67289.m30367();
            } else {
                this.f67289.m30515();
            }
        }
        c6686M18221 = null;
        c23598 = null;
        c6686M18220 = c6686M18221;
        this.f67287.f44219 = null;
        this.f67287.f44220 = null;
        this.f67287.f44225 = null;
        C14425 c14426 = this.f67287;
        c14426.f44215 = z;
        c14426.f44221 = c17975;
        c14426.f44217 = c7185;
        if (c9302 == null) {
            num = null;
        }
        c14426.f44218 = num;
        c14426.f44223++;
        c14426.f44224 = c9302;
        this.f67287.f44225 = c23598;
        this.f67287.f44220 = c6686M18220;
        this.f67287.f44219 = c6686M18221;
        if (z3) {
            this.f67289.m30367();
        } else {
            this.f67289.m30515();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47481(C5959 c5959) {
        C14239 c14239M16687;
        C22707 c22707M50723;
        C16747 c16747 = this.f67286;
        if (c16747.m39417(c5959)) {
            C9302 c9302M36849 = c5959.m16692().m36849();
            synchronized (this) {
                try {
                    InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                    C23097 c23097M51001 = this.f67284.m51001();
                    if (c16747.m39417(c5959) && interfaceC20445 != null && c5959.m16692().m36848() == c23097M51001 && this.f67289.m30436() == interfaceC20445 && c5959.m16690() == interfaceC20445.mo26548() && c5959.m16691() == interfaceC20445.length() && c9302M36849.m23880() == c5959.m16691() && this.f67287.f44223 == c5959.m16688()) {
                        C6665 c6665 = this.f67288;
                        if (c6665.f20696 == interfaceC20445) {
                            if (!c6665.f20714) {
                                c6665.f20715 = c5959;
                                return;
                            }
                            m47505();
                        }
                        if (this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532()) {
                            this.f67288.f20697 = false;
                            if (!c5959.m16689()) {
                                c14239M16687 = c9302M36849.m23880() == 0 ? null : new C14239(0, c9302M36849.m23880());
                            } else {
                                c14239M16687 = c5959.m16687();
                            }
                            m47484(c9302M36849, c5959.m16692().m36847(), true, null, true, Integer.valueOf(c23097M51001.m51274()), true);
                            m47532();
                            C6665 c6666 = this.f67288;
                            c6666.f20719 = -1;
                            c6666.f20709 = -1;
                            c6666.f20718 = 0;
                            c6666.f20701 = 0;
                            c6666.f20716 = null;
                            m47507();
                            m47533();
                            m47530();
                            if (c14239M16687 == null) {
                                c22707M50723 = C22707.f73353;
                            } else {
                                c22707M50723 = C22707.m50723(-1, -1, c14239M16687.m33888(), c14239M16687.m33887());
                            }
                            RunnableC17954 runnableC17954M47513 = m47513(interfaceC20445, c5959.m16690(), c22707M50723, EnumC16542.MERGE);
                            C12392 c12392 = this.f67289;
                            if (runnableC17954M47513 == null) {
                                return;
                            }
                            c12392.postInvalidate();
                            c12392.post(runnableC17954M47513);
                            return;
                        }
                        this.f67288.f20697 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m47482(C7370 c7370) {
        C22707 c22707M50723;
        C16747 c16747 = this.f67286;
        if (c16747.m39418(c7370)) {
            C14280 c14280M19819 = c7370.m19819();
            C11003.requireNonNull(c14280M19819, o.c);
            C7185 c7185M19238 = C7185.m19238(c14280M19819.m34058(), c14280M19819.m34060(), c14280M19819.m34065(), c14280M19819.m34059(), c14280M19819.m34063().f74319);
            synchronized (this) {
                InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                C23097 c23097M51001 = this.f67284.m51001();
                if (c16747.m39418(c7370) && interfaceC20445 != null && c14280M19819.m34063() == c23097M51001 && this.f67289.m30436() == interfaceC20445 && interfaceC20445.length() > 1000000 && c7370.m19818() == interfaceC20445.mo26548() && c7370.m19820() == interfaceC20445.length() && c14280M19819.m34064() == c7370.m19818() && c14280M19819.m34058() == c7370.m19820() && c14280M19819.m34060() == this.f67288.f20699) {
                    int iM34061 = c14280M19819.m34061();
                    C6665 c6665 = this.f67288;
                    if (iM34061 == c6665.f20706 && c6665.f20705 == c7370.m19818() && this.f67288.f20700 == c7370.m19820() && this.f67288.f20717 == c7370.m19817() && this.f67287.f44223 == c7370.m19817()) {
                        C6665 c6666 = this.f67288;
                        if (c6666.f20696 == interfaceC20445) {
                            if (!c6666.f20714) {
                                c6666.f20702 = c7370;
                                return;
                            }
                            m47505();
                        }
                        if (this.f67289.isAttachedToWindow() && this.f67289.m30483() && !this.f67289.m30532()) {
                            C7185 c7185 = this.f67285.f52870;
                            if (c7185 == null || c7185.m19247().m23880() != c7185M19238.m19247().m23880()) {
                                C17248 c17248 = this.f67285;
                                if (c17248.f52873 == interfaceC20445 && c17248.f52877 == interfaceC20445.mo26548() && c17248.f52867 == interfaceC20445.length()) {
                                    c22707M50723 = C22707.m50722(this.f67285.f52869, c14280M19819.m34060(), c14280M19819.m34061());
                                } else {
                                    c22707M50723 = C22707.m50723(-1, -1, c14280M19819.m34060(), c14280M19819.m34061());
                                }
                            } else {
                                c22707M50723 = c7185M19238.m19243(c7185);
                            }
                            C22707 c22707 = c22707M50723;
                            m47484(c7185M19238.m19247(), null, false, c7185M19238, true, Integer.valueOf(c23097M51001.m51274()), true);
                            if (!m47504(interfaceC20445)) {
                                m47534(interfaceC20445, c14280M19819.m34060(), c14280M19819.m34061());
                            }
                            m47507();
                            m47530();
                            RunnableC17954 runnableC17954M47513 = m47513(interfaceC20445, c7370.m19818(), c22707, EnumC16542.REPLACE);
                            C12392 c12392 = this.f67289;
                            if (runnableC17954M47513 == null) {
                                return;
                            }
                            c12392.postInvalidate();
                            c12392.post(runnableC17954M47513);
                            return;
                        }
                        this.f67288.f20710 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47492(C20777 c20777, C4548 c4548) {
        if (c4548.m13366()) {
            c20777.m47480(c4548);
            return;
        }
        C16747 c16747 = c20777.f67286;
        if (c16747.m39416(c4548)) {
            synchronized (c20777) {
                InterfaceC20445 interfaceC20445 = c20777.f67288.f20704;
                if (c16747.m39416(c4548) && interfaceC20445 != null && c20777.f67289.m30436() == interfaceC20445 && c4548.m13365() == interfaceC20445.mo26548() && c4548.m13367() == interfaceC20445.length()) {
                    boolean z = true;
                    if (c4548.m13364() == EnumC3137.SCHEDULER_REJECTED) {
                        C6665 c6665 = c20777.f67288;
                        c6665.f20697 = true;
                        if (c6665.f20696 == interfaceC20445 && c6665.f20714) {
                            c20777.m47505();
                        }
                        if (z) {
                            c20777.m47506(interfaceC20445);
                        }
                    }
                    C6665 c6666 = c20777.f67288;
                    c6666.f20697 = false;
                    c6666.f20698 = c4548.m13365();
                    c20777.f67288.f20711 = c4548.m13367();
                    c20777.f67288.f20707 = interfaceC20445;
                    c20777.m47499(false, true, false);
                    z = false;
                    if (z) {
                        c20777.m47506(interfaceC20445);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47480(C4548 c4548) {
        C16747 c16747 = this.f67286;
        if (c16747.m39416(c4548)) {
            synchronized (this) {
                InterfaceC20445 interfaceC20445 = this.f67288.f20704;
                int iM13368 = c4548.m13368();
                int iM13369 = c4548.m13369();
                if (c16747.m39416(c4548) && interfaceC20445 != null && this.f67289.m30436() == interfaceC20445 && c4548.m13365() == interfaceC20445.mo26548() && c4548.m13367() == interfaceC20445.length()) {
                    C6665 c6665 = this.f67288;
                    if (iM13368 == c6665.f20699 && iM13369 == c6665.f20706 && c6665.f20705 == c4548.m13365() && this.f67288.f20700 == c4548.m13367()) {
                        boolean z = false;
                        if (c4548.m13364() == EnumC3137.SCHEDULER_REJECTED) {
                            C6665 c6666 = this.f67288;
                            c6666.f20710 = true;
                            if (c6666.f20696 == interfaceC20445 && c6666.f20714) {
                                m47505();
                                z = true;
                            }
                        } else {
                            m47507();
                            C6665 c6667 = this.f67288;
                            c6667.f20708 = iM13368;
                            c6667.f20713 = iM13369;
                            c6667.f20712 = c4548.m13365();
                            this.f67288.f20703 = c4548.m13367();
                            this.f67288.f20720 = interfaceC20445;
                            this.f67287.f44216 = null;
                            m47499(false, true, true);
                        }
                        if (z) {
                            m47506(interfaceC20445);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private RunnableC17954 m47513(InterfaceC20445 interfaceC20445, int i, C22707 c22707, EnumC16542 enumC16542) {
        if (this.f67289.m30436() != interfaceC20445 || interfaceC20445.mo26548() != i || this.f67284.m51000() == null) {
            return null;
        }
        C22707 c22707M47479 = m47479(interfaceC20445, i, c22707, enumC16542);
        m47509();
        RunnableC17954 runnableC17954M47477 = m47477(interfaceC20445, i, c22707M47479);
        this.f67285.f52871 = runnableC17954M47477;
        return runnableC17954M47477;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47566(InterfaceC20445 interfaceC20445) {
        synchronized (this) {
            if (m47502(interfaceC20445, interfaceC20445.mo26548()) && this.f67284.m51000() != null) {
                m47509();
                RunnableC17954 runnableC17954M47477 = m47477(interfaceC20445, interfaceC20445.mo26548(), this.f67285.f52874);
                this.f67285.f52871 = runnableC17954M47477;
                this.f67289.post(runnableC17954M47477);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private RunnableC17954 m47477(InterfaceC20445 interfaceC20445, int i, C22707 c22707) {
        C9302 c9302 = this.f67287.f44224;
        if (c9302 == null) {
            throw new IllegalStateException("Syntax display is not initialized");
        }
        C15068 c15068M51000 = this.f67284.m51000();
        C14425 c14425 = this.f67287;
        return new RunnableC17954(this, interfaceC20445, c15068M51000, i, c14425.f44217, c9302, c14425.f44223, c22707);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m47547() {
        return this.f67287.f44222;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47544(CharSequence charSequence) {
        C9302 c9302;
        return this.f67287.f44222 && (c9302 = this.f67287.f44224) != null && c9302.m23880() == charSequence.length();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m47508(InterfaceC20445 interfaceC20445) {
        C9302 c9302M23868;
        m47515();
        if ((m47531(interfaceC20445) || m47516()) && this.f67287.f44224 != null && this.f67287.f44224.m23880() == interfaceC20445.length()) {
            return;
        }
        if (interfaceC20445.length() <= 1000000) {
            m47499(false, false, false);
            C15068 c15068M51000 = this.f67284.m51000();
            if (c15068M51000 == null) {
                return;
            }
            int length = interfaceC20445.length();
            C21834 c21834M35661 = c15068M51000.m35661();
            if (length == 0) {
                c9302M23868 = C9302.m23878();
            } else {
                c9302M23868 = C9302.m23868(length, c21834M35661, false);
            }
            m47483(c9302M23868, (C17975) null, false, (C7185) null, false);
            this.f67287.f44222 = true;
            if (m47510(interfaceC20445)) {
                m47514(interfaceC20445, false);
                return;
            }
            return;
        }
        m47491(interfaceC20445, false);
        if (m47521(interfaceC20445)) {
            C6665 c6665 = this.f67288;
            m47488(interfaceC20445, c6665.f20719, c6665.f20709, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47545(String str) {
        m47485(C7017.m18986(str));
        return this.f67284.m51000() != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47557(String str) {
        m47485(C7017.m18983(str));
        return this.f67284.m51000() != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15068 m47517(C20777 c20777) {
        return c20777.f67284.m51000();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m47548() {
        return this.f67284.m51000() != null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15068 m47550() {
        return this.f67284.m51000();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m47552() {
        C15068 c15068M51000 = this.f67284.m51000();
        return c15068M51000 == null ? "Text" : c15068M51000.m35657();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m47562() {
        C15068 c15068M51000 = this.f67284.m51000();
        if (c15068M51000 != null) {
            return c15068M51000.m35663();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m47565() {
        C15068 c15068M51000 = this.f67284.m51000();
        if (c15068M51000 == null) {
            return null;
        }
        return c15068M51000.m35664();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m47567() {
        C15068 c15068M51000 = this.f67284.m51000();
        if (c15068M51000 == null) {
            return null;
        }
        return c15068M51000.m35665();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m47515() {
        C23097 c23097M51001 = this.f67284.m51001();
        if (c23097M51001 == null || c23097M51001.m51272()) {
            return false;
        }
        C15068 c15068M51000 = this.f67284.m51000();
        C9302 c9302 = this.f67287.f44224;
        C14425 c14425 = this.f67287;
        Integer num = c14425.f44218;
        boolean z = c14425.f44222 && c9302 != null;
        C22913 c22913M50999 = C22913.m50999(c15068M51000);
        m47499(false, false, false);
        this.f67284 = c22913M50999;
        if (c22913M50999.m51001() != null) {
            m47484(c9302, null, false, null, true, num, false);
            this.f67287.f44222 = z;
        } else {
            this.f67287.f44222 = false;
            m47483((C9302) null, (C17975) null, false, (C7185) null, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m47526(CharSequence charSequence) {
        return (charSequence == null || this.f67284.m51001() == null || this.f67284.m51000() == null || !(charSequence instanceof InterfaceC20445) || this.f67289.m30436() != charSequence) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m47528(CharSequence charSequence) {
        return m47519(charSequence) && this.f67284.m51001() != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47569(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (m47526((CharSequence) interfaceC20445)) {
            this.f67286.m39412(interfaceC20445, i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47564(InterfaceC20445 interfaceC20445, int i, int i2) {
        if (!m47519((CharSequence) interfaceC20445) || i < 0 || i2 < 0) {
            return;
        }
        C11003.checkFromToIndex(i, i2, interfaceC20445.length());
        synchronized (this) {
            m47515();
            m47534(interfaceC20445, i, i2);
            C7185 c7185 = this.f67287.f44217;
            if (c7185 != null && c7185.m19244(i, i2)) {
                m47524(interfaceC20445, i, i2);
                return;
            }
            if (m47521(interfaceC20445)) {
                m47488(interfaceC20445, i, i2, false);
            } else {
                m47518(interfaceC20445, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m47524(InterfaceC20445 interfaceC20445, int i, int i2) {
        C6665 c6665 = this.f67288;
        if (c6665.f20699 != -1 && (!m47511(interfaceC20445) || !m47500(c6665.f20699, c6665.f20706, i, i2))) {
            this.f67286.m39422();
            c6665.f20704 = interfaceC20445;
            m47507();
        }
        if (c6665.f20708 != -1) {
            if (m47516() && m47500(c6665.f20708, c6665.f20713, i, i2)) {
                return;
            }
            m47530();
        }
    }
}
