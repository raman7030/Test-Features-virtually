package p067l;

import com.alipay.sdk.p010m.p058y.C0252o;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22115 {

    /* JADX INFO: renamed from: ֫ */
    public volatile C24145 f69968;

    /* JADX INFO: renamed from: ۧ */
    public final C18761 f69969;

    /* JADX INFO: renamed from: ܳ */
    public final C18285 f69970;

    /* JADX INFO: renamed from: ܽ */
    public final C16078 f69971 = new C16078();

    /* JADX INFO: renamed from: ܿ */
    public final C8703 f69972;

    /* JADX INFO: renamed from: ᩳ */
    public final C14146 f69973;

    /* JADX INFO: renamed from: ᩻ */
    public final C24991 f69974;

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m49813(C16689 c16689) {
        m49827(true, false, false);
        this.f69971.f47316 = false;
        this.f69968 = C24145.m53390(c16689);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49828(int i, int i2, int i3, int i4) {
        return i >= 0 && i <= i3 && i4 <= i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized boolean m49829(C12056 c12056) {
        C6216 c6216;
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        C24320 c24320M53392 = this.f69968.m53392();
        if (c12056.m27613()) {
            C22135 c22135 = c12056.f33587;
            if (c22135.f70019 == interfaceC9768M32500 && c22135.f70017 == c24320M53392 && c24320M53392.m53666()) {
                int i = c12056.f33586;
                C16078 c16078 = this.f69971;
                if (i == c16078.f47317 && !c16078.f47309) {
                    C6216 c6217 = c16078.f47310;
                    if (c6217 == null || !c6217.m14090(interfaceC9768M32500, c24320M53392, interfaceC9768M32500.mo28581(), interfaceC9768M32500.length())) {
                        int iMo28581 = interfaceC9768M32500.mo28581();
                        int length = interfaceC9768M32500.length();
                        C14757 c14757 = c12056.f33588;
                        c6216 = new C6216(interfaceC9768M32500, c24320M53392, iMo28581, length, c14757, c14757);
                    } else {
                        C14757 c14758 = c6217.f15671;
                        C14757 c14759 = c12056.f33588;
                        if (c14758 == c14759) {
                            return true;
                        }
                        c6216 = c6217.m14088(c14759);
                    }
                    C16078 c16079 = this.f69971;
                    c16079.f47310 = c6216.m14087(c16079.f47311);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7 A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd A[Catch: all -> 0x00fc, TryCatch #0 {, blocks: (B:4:0x0002, B:9:0x000e, B:11:0x0018, B:14:0x0021, B:17:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x004f, B:26:0x0055, B:27:0x005a, B:29:0x0060, B:33:0x0068, B:35:0x006e, B:37:0x0074, B:39:0x007a, B:41:0x0083, B:43:0x0089, B:45:0x0092, B:44:0x008e, B:40:0x007f, B:46:0x0099, B:48:0x009f, B:50:0x00a5, B:52:0x00ab, B:54:0x00b1, B:56:0x00bd, B:57:0x00c7, B:59:0x00cd, B:61:0x00e1, B:63:0x00e7), top: B:69:0x0002 }] */
    /* JADX INFO: renamed from: ۘ */
    public synchronized boolean m49834(InterfaceC21800 interfaceC21800) {
        C9197 c9197;
        m49843();
        if (!this.f69971.f47316) {
            return false;
        }
        if (m49830(interfaceC21800, interfaceC21800.mo28581()) && this.f69968.m53391() != null) {
            m49837();
            RunnableC19432 runnableC19432M49805 = m49805(interfaceC21800, interfaceC21800.mo28581(), this.f69969.f56056);
            C18761 c18761 = this.f69969;
            c18761.f56050 = true;
            c18761.f56053 = runnableC19432M49805;
            this.f69973.post(runnableC19432M49805);
            return true;
        }
        if (m49859(interfaceC21800)) {
            return false;
        }
        if (this.f69972.f23582 != null) {
            m49861();
        }
        if (m49838(interfaceC21800)) {
            m49842(interfaceC21800, false);
        } else if (m49856((CharSequence) interfaceC21800)) {
            if (!m49849(interfaceC21800)) {
                return false;
            }
            if (this.f69972.f23585 && m49839(interfaceC21800)) {
                int i = m49832(interfaceC21800) ? this.f69972.f23594 : this.f69972.f23574;
                int i2 = m49832(interfaceC21800) ? this.f69972.f23584 : this.f69972.f23581;
                m49835();
                m49816(interfaceC21800, i, i2, false);
            } else if (!m49839(interfaceC21800) && !m49844()) {
                if (m49832(interfaceC21800)) {
                    C9197 c9198 = this.f69971.f47311;
                    if (c9198 != null) {
                        C8703 c8703 = this.f69972;
                        if (c9198.m21191(c8703.f23594, c8703.f23584)) {
                            if (!m49832(interfaceC21800)) {
                                C8703 c8704 = this.f69972;
                                c8704.f23594 = -1;
                                c8704.f23584 = -1;
                                c8704.f23593 = 0;
                                c8704.f23576 = 0;
                                c8704.f23591 = null;
                                c9197 = this.f69971.f47311;
                                if (c9197 != null) {
                                    m49862(interfaceC21800, this.f69971.f47311.m21192(), this.f69971.f47311.m21188());
                                }
                            }
                        }
                    }
                    C8703 c8705 = this.f69972;
                    m49816(interfaceC21800, c8705.f23594, c8705.f23584, false);
                } else if (!m49832(interfaceC21800)) {
                    C8703 c8706 = this.f69972;
                    c8706.f23594 = -1;
                    c8706.f23584 = -1;
                    c8706.f23593 = 0;
                    c8706.f23576 = 0;
                    c8706.f23591 = null;
                    c9197 = this.f69971.f47311;
                    if (c9197 != null && c9197.m21197()) {
                        m49862(interfaceC21800, this.f69971.f47311.m21192(), this.f69971.f47311.m21188());
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨ */
    public final synchronized void m49864() {
        m49813((C16689) null);
        this.f69971.f47316 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49865() {
        if (this.f69972.f23571 != null) {
            m49827(false, false, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49868(C11996 c11996) {
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        C23949 c23949 = m49830(interfaceC9768M32500, interfaceC9768M32500.mo28581()) ? this.f69969.f56056 : null;
        C24145 c24145 = this.f69968;
        C11209 c11209 = this.f69971.f47318;
        C16078 c16078 = this.f69971;
        C19452 c19452 = c16078.f47315;
        boolean z = c16078.f47316;
        C16078 c16079 = this.f69971;
        C20103.m45531(c11996, c24145, c11209, c19452, z, c16079.f47309, c16079.f47311, c23949);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m49871(int i, int i2) {
        C16078 c16078;
        C9197 c9197;
        c16078 = this.f69971;
        return c16078.f47309 || ((c9197 = c16078.f47311) != null && c9197.m21191(i, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m49874(C14677 c14677, int i) {
        m49827(true, false, false);
        this.f69971.f47316 = false;
        C17419 c17419M45526 = C20103.m45526(i, this.f69973.m32500().length(), c14677);
        this.f69968 = c17419M45526.m39661();
        m49811(c17419M45526.m39665(), c17419M45526.m39660(), c17419M45526.m39662(), c17419M45526.m39664(), false);
        this.f69971.f47316 = c17419M45526.m39666();
        C23949 c23949M39663 = c17419M45526.m39663();
        if (this.f69971.f47316 && c23949M39663 != null) {
            InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
            m49837();
            m49860();
            C18761 c18761 = this.f69969;
            c18761.f56056 = c23949M39663;
            c18761.f56060 = true;
            c18761.f56058 = interfaceC9768M32500.mo28581();
            c18761.f56054 = interfaceC9768M32500.length();
            c18761.f56057 = interfaceC9768M32500;
            c18761.f56048 = false;
            c18761.f56050 = false;
        } else if (this.f69971.f47316 && c17419M45526.m39664() != null) {
            m49817(this.f69973.m32500(), c17419M45526.m39664());
        }
        return this.f69971.f47316;
    }

    /* JADX INFO: renamed from: ۚ */
    public final synchronized void m49877() {
        m49827(true, false, false);
        this.f69971.f47313 = null;
        this.f69971.f47314 = null;
        this.f69971.f47319 = null;
        this.f69971.f47316 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized long m49881() {
        if (this.f69973.m32547() && !this.f69973.m32596()) {
            InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
            if (m49830(interfaceC9768M32500, interfaceC9768M32500.mo28581())) {
                return -1L;
            }
            if (this.f69968.m53391() != null && m49887() == null) {
                return -1L;
            }
            C16078 c16078 = this.f69971;
            C9197 c9197 = c16078.f47311;
            if (c9197 != null) {
                if (m49832(this.f69973.m32500()) && c9197.m21197()) {
                    return (((long) c9197.m21192()) << 32) | (((long) c9197.m21188()) & 4294967295L);
                }
                return -1L;
            }
            if (c16078.f47318 != null && !this.f69971.f47309) {
                return -1L;
            }
            C8703 c8703 = this.f69972;
            return (c8703.f23574 == -1 && c8703.f23583 == -1 && !m49832(this.f69973.m32500())) ? Long.MIN_VALUE : -1L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m49882(CharSequence charSequence) {
        if (m49854(charSequence)) {
            m49836((InterfaceC21800) charSequence);
            return;
        }
        if (this.f69973.m32500() == charSequence) {
            m49827(true, false, false);
            this.f69971.f47316 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m49883(InterfaceC21800 interfaceC21800, int i, int i2) {
        if (this.f69971.f47316 && this.f69972.f23579 == interfaceC21800 && m49851((CharSequence) interfaceC21800) && i < i2 && i2 <= interfaceC21800.length()) {
            m49807(interfaceC21800, interfaceC21800.mo28581(), C23949.m53049(-1, -1, i, i2), EnumC18090.MERGE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m49884(int i, int i2) {
        boolean z;
        InterfaceC21800 interfaceC21800M32500 = this.f69973.m32500();
        if (!m49847((CharSequence) interfaceC21800M32500)) {
            return false;
        }
        if (i >= 0 && i <= i2 && i2 <= interfaceC21800M32500.length()) {
            if (m49839(interfaceC21800M32500)) {
                C8703 c8703 = this.f69972;
                return !m49828(c8703.f23574, c8703.f23581, i, i2);
            }
            if (m49844()) {
                C8703 c8704 = this.f69972;
                return !m49828(c8704.f23583, c8704.f23588, i, i2);
            }
            C9197 c9197 = this.f69971.f47311;
            if (c9197 != null && c9197.m21191(i, i2)) {
                return false;
            }
            if (m49832(interfaceC21800M32500)) {
                C8703 c8705 = this.f69972;
                z = m49828(c8705.f23594, c8705.f23584, i, i2) ? false : true;
            }
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m49886(InterfaceC21800 interfaceC21800) {
        C9197 c9197;
        m49843();
        if (m49847((CharSequence) interfaceC21800)) {
            if (!m49832(interfaceC21800) && !m49839(interfaceC21800) && !m49844() && ((c9197 = this.f69971.f47311) == null || c9197.m21194().m25889() != interfaceC21800.length())) {
                m49819(interfaceC21800, false);
            }
            m49834(interfaceC21800);
            return false;
        }
        if (!m49851((CharSequence) interfaceC21800)) {
            return true;
        }
        C11209 c11209 = this.f69971.f47318;
        if (this.f69971.f47311 != null || c11209 == null || c11209.m25889() != interfaceC21800.length()) {
            m49836(interfaceC21800);
        } else if (!this.f69971.f47309 && m49838(interfaceC21800)) {
            m49842(interfaceC21800, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized void m49888(InterfaceC21800 interfaceC21800) {
        int iM21192;
        if (this.f69971.f47316 && this.f69972.f23579 == interfaceC21800 && this.f69971.f47318 != null && this.f69971.f47318.m25889() == interfaceC21800.length() && interfaceC21800.length() != 0) {
            int length = interfaceC21800.length();
            if (!m49851((CharSequence) interfaceC21800)) {
                C9197 c9197 = this.f69971.f47311;
                if (m49856((CharSequence) interfaceC21800) && c9197 != null && c9197.m21197()) {
                    iM21192 = c9197.m21192();
                    length = c9197.m21188();
                }
                return;
            }
            iM21192 = 0;
            m49837();
            m49807(interfaceC21800, interfaceC21800.mo28581(), C23949.m53049(-1, -1, iM21192, length), EnumC18090.MERGE);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final synchronized boolean m49889() {
        return this.f69971.f47309;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final synchronized void m49898() {
        m49827(false, true, true);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized void m49902(InterfaceC21800 interfaceC21800) {
        if (this.f69971.f47316 && this.f69973.isAttachedToWindow() && this.f69973.m32453() && !this.f69973.m32596()) {
            if (m49851((CharSequence) interfaceC21800)) {
                if (this.f69972.f23571 != interfaceC21800) {
                    m49842(interfaceC21800, true);
                }
            } else if (m49856((CharSequence) interfaceC21800) && m49832(interfaceC21800)) {
                C8703 c8703 = this.f69972;
                m49816(interfaceC21800, c8703.f23594, c8703.f23584, true);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49866(int i, int i2, int i3, CharSequence charSequence) {
        try {
            if (i2 == 0 && i3 == 0) {
                this.f69974.f79773 = false;
                return;
            }
            m49843();
            C16689 c16689M53391 = this.f69968.m53391();
            if (c16689M53391 != null && this.f69971.f47316 && (charSequence instanceof InterfaceC21800)) {
                InterfaceC21800 interfaceC21800 = (InterfaceC21800) charSequence;
                if (m49854((CharSequence) interfaceC21800)) {
                    boolean zM32596 = this.f69973.m32596();
                    C6216 c6216 = this.f69971.f47310;
                    if (c6216 != null) {
                        this.f69971.f47310 = zM32596 ? null : c6216.m14089(interfaceC21800, this.f69968.m53392(), interfaceC21800.mo28581(), interfaceC21800.length(), i, i2, i3, (i <= 0 || this.f69971.f47318 == null || i > this.f69971.f47318.m25889()) ? c16689M53391.m37819() : this.f69971.f47318.m25892(i - 1));
                    }
                    m49815(interfaceC21800, i, i2, i3, zM32596);
                    m49814(interfaceC21800, i, i2, i3, c16689M53391, zM32596);
                    return;
                }
            }
            this.f69974.f79773 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C22115(C14146 c14146, C21545 c21545) {
        C8703 c8703 = new C8703();
        c8703.f23574 = -1;
        c8703.f23581 = -1;
        c8703.f23594 = -1;
        c8703.f23584 = -1;
        c8703.f23583 = -1;
        c8703.f23588 = -1;
        this.f69972 = c8703;
        C18761 c18761 = new C18761();
        C23949 c23949 = C23949.f76078;
        c18761.f56051 = c23949;
        c18761.f56056 = c23949;
        this.f69969 = c18761;
        this.f69974 = new C24991();
        this.f69973 = c14146;
        this.f69970 = new C18285(new ExecutorC4009(c14146), new C12727(this, c14146));
        m49813((C16689) null);
    }

    /* JADX INFO: renamed from: ۡ */
    public final C11209 m49879() {
        return this.f69971.f47318;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49823(C22115 c22115, C12056 c12056) {
        if (c22115.m49829(c12056)) {
            c22115.f69973.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49867(C9393 c9393, int i, int i2) {
        int iM21188;
        int iM21192 = -1;
        c9393.m21874((C14757) null, -1, -1, 0);
        C12056 c12056M41655 = this.f69970.m41655();
        C6216 c6216 = this.f69971.f47310;
        if (c12056M41655 == null && c6216 == null) {
            return;
        }
        C24320 c24320M53392 = this.f69968.m53392();
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        if (this.f69971.f47316 && c24320M53392 != null && c24320M53392.m53666() && this.f69973.isAttachedToWindow() && this.f69973.m32547() && !this.f69973.m32596() && !this.f69971.f47309) {
            if (c12056M41655 != null && (c6216 == null || c6216.f15671 != c12056M41655.f33588)) {
                m49829(c12056M41655);
                c6216 = this.f69971.f47310;
            }
            if (c6216 == null || !c6216.m14090(interfaceC9768M32500, c24320M53392, interfaceC9768M32500.mo28581(), interfaceC9768M32500.length())) {
                return;
            }
            C14757 c14757 = c6216.f15674;
            if (c14757.f42081 <= i || c14757.f42082 >= i2) {
                return;
            }
            C9197 c9197 = this.f69971.f47311;
            if (c9197 == null || !c9197.m21197()) {
                iM21188 = -1;
            } else {
                iM21192 = c9197.m21192();
                iM21188 = c9197.m21188();
                if (iM21192 <= Math.max(i, c14757.f42082) && Math.min(i2, c14757.f42081) <= iM21188) {
                    return;
                }
            }
            c9393.m21874(c14757, iM21192, iM21188, c24320M53392.f77065.m51556());
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m49899() {
        this.f69973.m32479();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C11209 m49901() {
        if (!this.f69971.f47316) {
            return null;
        }
        C24320 c24320M53392 = this.f69968.m53392();
        C24796 c24796 = this.f69971.f47319;
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        if (c24796 != null && c24320M53392 != null && c24320M53392.m53666() && c24796.f79249 == interfaceC9768M32500 && c24796.f79247 == c24320M53392 && c24796.f79246 == interfaceC9768M32500.mo28581() && c24796.f79250 == interfaceC9768M32500.length()) {
            return c24796.f79248;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C8723 m49887() {
        if (!this.f69971.f47316) {
            return null;
        }
        C8723 c8723 = this.f69971.f47313;
        C24320 c24320M53392 = this.f69968.m53392();
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        if (c8723 == null || c24320M53392 == null || !c24320M53392.m53666() || !c8723.m20177(interfaceC9768M32500, c24320M53392)) {
            return null;
        }
        return c8723;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C8723 m49900() {
        if (!this.f69971.f47316) {
            return null;
        }
        C8723 c8723 = this.f69971.f47314;
        C24320 c24320M53392 = this.f69968.m53392();
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        if (c8723 == null || c24320M53392 == null || !c24320M53392.m53666() || !c8723.m20177(interfaceC9768M32500, c24320M53392)) {
            return null;
        }
        return c8723;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49896(InterfaceC21800 interfaceC21800) {
        boolean z;
        C8032 c8032;
        C9373 c9373;
        C9373 c9373M41659;
        C8032 c8032M41657;
        synchronized (this) {
            z = false;
            if (this.f69972.f23571 != interfaceC21800 || m49843()) {
                c8032 = null;
                c9373 = null;
            } else {
                C8703 c8703 = this.f69972;
                c8703.f23589 = true;
                c8032 = c8703.f23590;
                c9373 = c8703.f23577;
                if (c8032 == null && (c8032M41657 = this.f69970.m41657()) != null && this.f69970.m41653(c8032M41657)) {
                    c8032 = c8032M41657;
                }
                if (c9373 == null && (c9373M41659 = this.f69970.m41659()) != null && this.f69970.m41654(c9373M41659)) {
                    c9373 = c9373M41659;
                }
                if (c8032 != null || c9373 != null) {
                    m49833();
                } else {
                    C8703 c8704 = this.f69972;
                    if (c8704.f23572 || c8704.f23585) {
                        m49833();
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (c8032 != null) {
            m49809(c8032);
            return;
        }
        if (c9373 != null) {
            m49810(c9373);
        } else if (z) {
            this.f69973.m32469();
        } else {
            if (m49834(interfaceC21800)) {
                return;
            }
            this.f69973.m32469();
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m49863() {
        this.f69973.m32579();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49891(InterfaceC21800 interfaceC21800) {
        boolean z;
        RunnableC19432 runnableC19432M49805;
        synchronized (this) {
            boolean z2 = true;
            z = false;
            if (m49830(interfaceC21800, interfaceC21800.mo28581()) && this.f69968.m53391() != null) {
                m49837();
                runnableC19432M49805 = m49805(interfaceC21800, interfaceC21800.mo28581(), this.f69969.f56056);
                C18761 c18761 = this.f69969;
                boolean z3 = c18761.f56050;
                C8703 c8703 = this.f69972;
                if ((!c8703.f23572 || c8703.f23579 != interfaceC21800) && (!c8703.f23585 || !m49839(interfaceC21800))) {
                    z2 = false;
                }
                c18761.f56050 = z2 | z3;
                this.f69969.f56053 = runnableC19432M49805;
            } else {
                C8703 c8704 = this.f69972;
                if ((!c8704.f23572 || c8704.f23579 != interfaceC21800) && (!c8704.f23585 || !m49839(interfaceC21800))) {
                    z2 = false;
                }
                runnableC19432M49805 = null;
                z = z2;
            }
        }
        if (runnableC19432M49805 == null) {
            if (z) {
                m49834(interfaceC21800);
            }
            this.f69973.m32469();
        } else {
            C14146 c14146 = this.f69973;
            c14146.postInvalidate();
            c14146.post(runnableC19432M49805);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49870(InterfaceC21800 interfaceC21800, int i, int i2) {
        C9197 c9197;
        C9197 c9198;
        this.f69970.m41648(interfaceC21800, i, i2);
        synchronized (this) {
            if (this.f69971.f47316 && this.f69973.isAttachedToWindow() && !this.f69973.m32596() && this.f69972.f23579 == interfaceC21800) {
                if (m49851((CharSequence) interfaceC21800) && this.f69971.f47309) {
                    return;
                }
                if (i2 <= i || !m49856((CharSequence) interfaceC21800) || (c9198 = this.f69971.f47311) == null || !c9198.m21191(i, i2)) {
                    if (i2 > i && m49856((CharSequence) interfaceC21800) && ((c9197 = this.f69971.f47311) == null || !c9197.m21191(i, i2))) {
                        m49816(interfaceC21800, i, i2, this.f69973.m32453());
                    }
                    C18285 c18285 = this.f69970;
                    c18285.m41647(c18285.m41645(interfaceC21800));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49869(InterfaceC21800 interfaceC21800) {
        if (m49834(interfaceC21800)) {
            return;
        }
        this.f69973.m32469();
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m49851(CharSequence charSequence) {
        return m49854(charSequence) && charSequence.length() <= 1000000;
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m49847(CharSequence charSequence) {
        return m49854(charSequence) && charSequence.length() > 1000000;
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m49838(InterfaceC21800 interfaceC21800) {
        if (!m49851((CharSequence) interfaceC21800)) {
            return false;
        }
        C14146 c14146 = this.f69973;
        return c14146.isAttachedToWindow() && c14146.m32547() && !c14146.m32596();
    }

    /* JADX INFO: renamed from: ܺ */
    private boolean m49849(InterfaceC21800 interfaceC21800) {
        if (!m49856((CharSequence) interfaceC21800)) {
            return false;
        }
        C14146 c14146 = this.f69973;
        return c14146.isAttachedToWindow() && c14146.m32547() && !c14146.m32596();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49842(InterfaceC21800 interfaceC21800, boolean z) {
        if (m49857(interfaceC21800) || m49859(interfaceC21800)) {
            return;
        }
        if (this.f69972.f23582 != null) {
            m49861();
        }
        m49833();
        C8703 c8703 = this.f69972;
        c8703.f23572 = false;
        c8703.f23579 = interfaceC21800;
        if (z) {
            c8703.f23571 = interfaceC21800;
        }
        this.f69970.m41651(this.f69968.m53392(), interfaceC21800, this.f69971.f47318, this.f69971.f47317);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49816(InterfaceC21800 interfaceC21800, int i, int i2, boolean z) {
        if (z || m49849(interfaceC21800)) {
            m49862(interfaceC21800, i, i2);
            if (m49857(interfaceC21800)) {
                return;
            }
            if (m49839(interfaceC21800)) {
                C8703 c8703 = this.f69972;
                if (c8703.f23574 <= i && i2 <= c8703.f23581) {
                    return;
                }
            }
            if (m49844()) {
                C8703 c8704 = this.f69972;
                if (c8704.f23583 <= i && i2 <= c8704.f23588) {
                    return;
                }
            }
            m49858();
            m49833();
            if (z) {
                this.f69972.f23571 = interfaceC21800;
            }
            C8703 c8705 = this.f69972;
            c8705.f23579 = interfaceC21800;
            c8705.f23574 = i;
            c8705.f23581 = i2;
            c8705.f23580 = interfaceC21800.mo28581();
            this.f69972.f23575 = interfaceC21800.length();
            C8703 c8706 = this.f69972;
            c8706.f23592 = this.f69971.f47317;
            c8706.f23585 = false;
            this.f69970.m41656(this.f69968.m53392(), interfaceC21800, i, i2, this.f69971.f47317);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m49846(InterfaceC21800 interfaceC21800, int i, int i2) {
        boolean zM49839 = m49839(interfaceC21800);
        C8703 c8703 = this.f69972;
        if ((!zM49839 || !m49828(c8703.f23574, c8703.f23581, i, i2)) && c8703.f23574 != -1) {
            this.f69970.m41658();
            m49835();
        }
        if (c8703.f23583 != -1 && (!m49844() || !m49828(c8703.f23583, c8703.f23588, i, i2))) {
            m49858();
        }
        c8703.f23579 = interfaceC21800;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49819(InterfaceC21800 interfaceC21800, boolean z) {
        m49827(false, false, false);
        C9197 c9197M21187 = C9197.m21187(interfaceC21800.length(), this.f69968.m53391().m37819());
        m49811(c9197M21187.m21194(), (C19452) null, false, c9197M21187, z);
        m49862(interfaceC21800, 0, Math.min(interfaceC21800.length(), 10000));
        this.f69971.f47316 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49827(boolean z, boolean z2, boolean z3) {
        if (z || !z3) {
            this.f69971.f47310 = null;
        }
        this.f69970.m41646();
        C8703 c8703 = this.f69972;
        c8703.f23572 = false;
        c8703.f23579 = null;
        m49833();
        m49835();
        if (!z2) {
            m49861();
            m49858();
        }
        if (!z3) {
            C8703 c8704 = this.f69972;
            c8704.f23594 = -1;
            c8704.f23584 = -1;
            c8704.f23593 = 0;
            c8704.f23576 = 0;
            c8704.f23591 = null;
            m49860();
        }
        if (z) {
            this.f69971.f47316 = false;
            m49811((C11209) null, (C19452) null, false, (C9197) null, false);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    private void m49835() {
        C8703 c8703 = this.f69972;
        c8703.f23574 = -1;
        c8703.f23581 = -1;
        c8703.f23580 = 0;
        c8703.f23575 = 0;
        c8703.f23592 = 0;
        c8703.f23585 = false;
    }

    /* JADX INFO: renamed from: ᩶ */
    private void m49858() {
        C8703 c8703 = this.f69972;
        c8703.f23583 = -1;
        c8703.f23588 = -1;
        c8703.f23587 = 0;
        c8703.f23578 = 0;
        c8703.f23595 = null;
        c8703.getClass();
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m49861() {
        C8703 c8703 = this.f69972;
        c8703.f23573 = 0;
        c8703.f23586 = 0;
        c8703.f23582 = null;
        c8703.getClass();
    }

    /* JADX INFO: renamed from: ۗ */
    private void m49833() {
        C8703 c8703 = this.f69972;
        c8703.f23571 = null;
        c8703.f23590 = null;
        c8703.f23577 = null;
        c8703.f23589 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m49862(InterfaceC21800 interfaceC21800, int i, int i2) {
        C12826.checkFromToIndex(i, i2, interfaceC21800.length());
        C8703 c8703 = this.f69972;
        c8703.f23594 = i;
        c8703.f23584 = i2;
        c8703.f23593 = interfaceC21800.mo28581();
        c8703.f23576 = interfaceC21800.length();
        c8703.f23591 = interfaceC21800;
    }

    /* JADX INFO: renamed from: ۖ */
    private boolean m49832(InterfaceC21800 interfaceC21800) {
        C8703 c8703 = this.f69972;
        return c8703.f23591 == interfaceC21800 && c8703.f23594 != -1 && c8703.f23593 == interfaceC21800.mo28581() && c8703.f23576 == interfaceC21800.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49817(InterfaceC21800 interfaceC21800, C9197 c9197) {
        C18761 c18761 = this.f69969;
        c18761.f56052 = c9197;
        c18761.f56051 = C23949.m53049(-1, -1, c9197.m21192(), c9197.m21188());
        c18761.f56059 = interfaceC21800.mo28581();
        c18761.f56049 = interfaceC21800.length();
        c18761.f56055 = interfaceC21800;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49826(C22115 c22115, InterfaceC21800 interfaceC21800, C23949 c23949) {
        C18761 c18761 = c22115.f69969;
        c18761.f56052 = null;
        c18761.f56051 = c23949;
        c18761.f56059 = interfaceC21800.mo28581();
        c18761.f56049 = interfaceC21800.length();
        c18761.f56055 = interfaceC21800;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ */
    public void m49860() {
        C18761 c18761 = this.f69969;
        c18761.f56052 = null;
        c18761.f56051 = C23949.f76078;
        c18761.f56059 = 0;
        c18761.f56049 = 0;
        c18761.f56055 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ */
    public void m49848() {
        m49837();
        C23949 c23949 = C23949.f76078;
        C18761 c18761 = this.f69969;
        c18761.f56056 = c23949;
        c18761.f56060 = false;
        c18761.f56058 = 0;
        c18761.f56054 = 0;
        c18761.f56057 = null;
        c18761.f56048 = false;
        c18761.f56050 = false;
    }

    /* JADX INFO: renamed from: ۠ */
    private void m49837() {
        C18761 c18761 = this.f69969;
        RunnableC19432 runnableC19432 = c18761.f56053;
        c18761.f56053 = null;
        if (runnableC19432 != null) {
            this.f69973.removeCallbacks(runnableC19432);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m49830(InterfaceC21800 interfaceC21800, int i) {
        C18761 c18761 = this.f69969;
        return c18761.f56060 && c18761.f56057 == interfaceC21800 && c18761.f56058 == i && c18761.f56054 == interfaceC21800.length();
    }

    /* JADX INFO: renamed from: ֫ */
    private C23949 m49807(InterfaceC21800 interfaceC21800, int i, C23949 c23949, EnumC18090 enumC18090) {
        boolean zM49830 = m49830(interfaceC21800, i);
        C18761 c18761 = this.f69969;
        if (!zM49830) {
            c18761.f56048 = false;
            c18761.f56050 = false;
        }
        if (enumC18090 != EnumC18090.REPLACE && zM49830) {
            c23949 = c18761.f56056.m53052(c23949);
        }
        c18761.f56056 = c23949;
        c18761.f56060 = true;
        c18761.f56058 = i;
        c18761.f56054 = interfaceC21800.length();
        c18761.f56057 = interfaceC21800;
        return c23949;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49815(InterfaceC21800 interfaceC21800, int i, int i2, int i3, boolean z) {
        int i4;
        m49837();
        long length = (((long) interfaceC21800.length()) - ((long) i3)) + ((long) i2);
        int iMo28581 = interfaceC21800.mo28581();
        if (length >= 0 && length <= 2147483647L) {
            C18761 c18761 = this.f69969;
            if (c18761.f56060 && c18761.f56057 == interfaceC21800 && c18761.f56054 == (i4 = (int) length) && c18761.f56058 + 1 == iMo28581) {
                if (c18761.f56056.m53054() == null || z) {
                    m49848();
                    return;
                }
                C23949 c23949M53051 = c18761.f56056.m53051(i4, i, i2, i3);
                if (c23949M53051.m53054() == null) {
                    m49848();
                    return;
                }
                c18761.f56056 = c23949M53051;
                c18761.f56058 = iMo28581;
                c18761.f56054 = interfaceC21800.length();
                c18761.f56057 = interfaceC21800;
                return;
            }
        }
        m49848();
    }

    /* JADX INFO: renamed from: ᩴ */
    private boolean m49857(InterfaceC21800 interfaceC21800) {
        return this.f69969.f56050 && !this.f69973.m32453() && m49830(interfaceC21800, interfaceC21800.mo28581());
    }

    /* JADX INFO: renamed from: ۢ */
    private boolean m49839(InterfaceC21800 interfaceC21800) {
        C8703 c8703 = this.f69972;
        return c8703.f23579 == interfaceC21800 && c8703.f23574 != -1 && c8703.f23580 == interfaceC21800.mo28581() && c8703.f23575 == interfaceC21800.length();
    }

    /* JADX INFO: renamed from: ۬ */
    private boolean m49844() {
        InterfaceC9768 interfaceC9768M32500;
        C8703 c8703 = this.f69972;
        return c8703.f23583 != -1 && c8703.f23595 == (interfaceC9768M32500 = this.f69973.m32500()) && c8703.f23587 == interfaceC9768M32500.mo28581() && c8703.f23578 == interfaceC9768M32500.length();
    }

    /* JADX INFO: renamed from: ᩷ */
    private boolean m49859(InterfaceC21800 interfaceC21800) {
        C8703 c8703 = this.f69972;
        return c8703.f23582 == interfaceC21800 && c8703.f23573 == interfaceC21800.mo28581() && c8703.f23586 == interfaceC21800.length();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49814(InterfaceC21800 interfaceC21800, int i, int i2, int i3, C16689 c16689, boolean z) {
        C11209 c11209M25877;
        C11209 c11209M25878;
        boolean z2;
        int i4;
        int i5;
        int iM34681;
        int iM34680;
        C9197 c9197M21187;
        boolean z3;
        C23949 c23949M49806 = C23949.f76078;
        long j = i3;
        long j2 = i2;
        long length = (((long) interfaceC21800.length()) - j) + j2;
        if (length >= 0 && length <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0) {
            long j3 = ((long) i) + j2;
            if (j3 <= length) {
                int i6 = (int) length;
                if (interfaceC21800.length() <= 1000000) {
                    C11209 c11209 = this.f69971.f47318;
                    C16078 c16078 = this.f69971;
                    Integer num = c16078.f47312;
                    boolean z4 = c16078.f47311 == null && c11209 != null && c11209.m25889() == i6;
                    if (z || !z4) {
                        if (!z) {
                            c23949M49806 = m49806(interfaceC21800, i6, i, i2, i3, c16689);
                        }
                        m49827(false, false, false);
                        int length2 = interfaceC21800.length();
                        C23120 c23120M37819 = c16689.m37819();
                        if (length2 == 0) {
                            c11209M25877 = C11209.m25887();
                        } else {
                            c11209M25877 = C11209.m25877(length2, c23120M37819, false);
                        }
                        m49811(c11209M25877, (C19452) null, false, (C9197) null, !z);
                        this.f69971.f47316 = true;
                        if (!z) {
                            m49818(interfaceC21800, c23949M49806);
                        }
                        C24991 c24991 = this.f69974;
                        c24991.f79773 = false;
                        c24991.f79772 = i;
                        c24991.f79771 = i + i3;
                        return;
                    }
                    try {
                        C23120 c23120M378110 = (i <= 0 || i3 <= 0) ? c16689.m37819() : c11209.m25892(i - 1);
                        int i7 = i + i2;
                        if (i3 == 0) {
                            c11209M25878 = C11209.m25887();
                        } else {
                            c11209M25878 = C11209.m25877(i3, c23120M378110, false);
                        }
                        m49812(c11209.m25890(i, i7, c11209M25878), null, false, null, true, num, false);
                        this.f69971.f47316 = true;
                        C24991 c24992 = this.f69974;
                        c24992.f79773 = false;
                        c24992.f79772 = i;
                        c24992.f79771 = i + i3;
                        m49833();
                        if (m49857(interfaceC21800) || m49859(interfaceC21800)) {
                            return;
                        }
                        if (this.f69972.f23582 != null) {
                            m49861();
                        }
                        boolean z5 = this.f69973.m32453() && this.f69973.isAttachedToWindow() && !this.f69973.m32596();
                        if (!z5 && !m49838(interfaceC21800)) {
                            if (this.f69973.m32596()) {
                                m49827(false, false, false);
                                return;
                            }
                            return;
                        }
                        C8703 c8703 = this.f69972;
                        if (c8703.f23579 != interfaceC21800) {
                            m49842(interfaceC21800, false);
                            return;
                        }
                        c8703.f23572 = false;
                        if (z5) {
                            c8703.f23571 = interfaceC21800;
                        }
                        this.f69970.m41650(this.f69968.m53392(), interfaceC21800, i, i2, i3, this.f69971.f47318, this.f69971.f47317);
                        return;
                    } catch (RuntimeException unused) {
                        m49836(interfaceC21800);
                        C24991 c24993 = this.f69974;
                        c24993.f79773 = true;
                        c24993.f79772 = 0;
                        c24993.f79771 = interfaceC21800.length();
                        return;
                    }
                }
                if (i6 > 1000000 && m49847((CharSequence) interfaceC21800)) {
                    long length3 = (((long) interfaceC21800.length()) - j) + j2;
                    if (length3 >= 0 && length3 <= 2147483647L && i >= 0 && i2 >= 0 && i3 >= 0 && j3 <= length3) {
                        int i8 = (int) length3;
                        int iMo28581 = interfaceC21800.mo28581();
                        C8703 c8704 = this.f69972;
                        if (c8704.f23591 == interfaceC21800 && (i4 = c8704.f23594) != -1 && c8704.f23576 == i8 && c8704.f23593 + 1 == iMo28581) {
                            i5 = c8704.f23584;
                        } else if (c8704.f23579 == interfaceC21800 && (i4 = c8704.f23574) != -1 && c8704.f23575 == i8 && c8704.f23580 + 1 == iMo28581) {
                            i5 = c8704.f23581;
                        } else if (c8704.f23595 == interfaceC21800 && (i4 = c8704.f23583) != -1 && c8704.f23578 == i8 && c8704.f23587 + 1 == iMo28581) {
                            i5 = c8704.f23588;
                        }
                        int i9 = i5;
                        int i10 = i4;
                        C11209 c112010 = this.f69971.f47318;
                        if (c112010 != null) {
                            if (this.f69971.f47311 != null && c112010.m25889() == i8 && this.f69971.f47311.m21194() == c112010) {
                                if (m49849(interfaceC21800)) {
                                    C15231 c15231M21189 = this.f69971.f47311.m21189(i, i2, i3, i10, i9, c16689.m37819());
                                    c9197M21187 = c15231M21189.m34679();
                                    iM34681 = c15231M21189.m34681();
                                    iM34680 = c15231M21189.m34680();
                                } else {
                                    long jM21184 = C9197.m21184(i8, i, i2, i3, i10, i9);
                                    iM34681 = (int) (jM21184 >>> 32);
                                    iM34680 = (int) jM21184;
                                    c9197M21187 = C9197.m21187(interfaceC21800.length(), c16689.m37819());
                                }
                            }
                        } else {
                            long jM21185 = C9197.m21184(i8, i, i2, i3, i10, i9);
                            iM34681 = (int) (jM21185 >>> 32);
                            iM34680 = (int) jM21185;
                            c9197M21187 = C9197.m21187(interfaceC21800.length(), c16689.m37819());
                        }
                        int i11 = iM34680;
                        C9197 c9197 = c9197M21187;
                        int i12 = iM34681;
                        boolean zM32596 = this.f69973.m32596();
                        C18761 c18761 = this.f69969;
                        C23949 c23949 = (c18761.f56055 == interfaceC21800 && c18761.f56049 == i8 && c18761.f56059 + 1 == iMo28581) ? c18761.f56051 : null;
                        c18761.f56052 = null;
                        if (c23949 == null) {
                            m49860();
                        } else {
                            if (!zM32596) {
                                c23949M49806 = c23949.m53051(i8, i, i2, i3);
                            }
                            c18761.f56051 = c23949M49806;
                            c18761.f56059 = iMo28581;
                            c18761.f56049 = interfaceC21800.length();
                            c18761.f56055 = interfaceC21800;
                        }
                        this.f69970.m41649(this.f69968.m53392(), interfaceC21800, i, i2, i3);
                        this.f69972.f23579 = interfaceC21800;
                        m49835();
                        m49858();
                        if (c9197 != null) {
                            m49811(c9197.m21194(), (C19452) null, false, c9197, true);
                        }
                        m49862(interfaceC21800, i12, i11);
                        if (m49849(interfaceC21800)) {
                            z3 = false;
                            m49816(interfaceC21800, i12, i11, false);
                        } else {
                            z3 = false;
                        }
                        C24991 c24994 = this.f69974;
                        c24994.f79773 = z3;
                        c24994.f79772 = i;
                        c24994.f79771 = i + i3;
                        return;
                    }
                }
                if (z) {
                    z2 = false;
                    m49819(interfaceC21800, false);
                } else {
                    C23949 c23949M49807 = m49806(interfaceC21800, i6, i, i2, i3, c16689);
                    m49819(interfaceC21800, true);
                    m49818(interfaceC21800, c23949M49807);
                    z2 = false;
                }
                C24991 c24995 = this.f69974;
                c24995.f79773 = z2;
                c24995.f79772 = i;
                c24995.f79771 = i + i3;
                return;
            }
        }
        m49836(interfaceC21800);
        C24991 c24996 = this.f69974;
        c24996.f79773 = true;
        c24996.f79772 = 0;
        c24996.f79771 = interfaceC21800.length();
    }

    /* JADX INFO: renamed from: ֫ */
    private C23949 m49806(InterfaceC21800 interfaceC21800, int i, int i2, int i3, int i4, C16689 c16689) {
        C11209 c11209M25877;
        C23949 c23949M53049 = C23949.f76078;
        C16078 c16078 = this.f69971;
        C9197 c9197 = c16078.f47311;
        if (c9197 != null) {
            int iMo28581 = interfaceC21800.mo28581();
            C18761 c18761 = this.f69969;
            if (c18761.f56055 == interfaceC21800 && c18761.f56059 + 1 == iMo28581 && c18761.f56049 == i) {
                c23949M53049 = c18761.f56051;
            } else if (c9197.m21197()) {
                c23949M53049 = C23949.m53049(-1, -1, c9197.m21192(), c9197.m21188());
            }
        } else {
            C11209 c11209 = c16078.f47318;
            if (c11209 != null && c11209.m25889() == i) {
                C23120 c23120M37819 = c16689.m37819();
                if (i == 0) {
                    c11209M25877 = C11209.m25887();
                } else {
                    c11209M25877 = C11209.m25877(i, c23120M37819, false);
                }
                C15901 c15901M25896 = c11209.m25896(c11209M25877);
                if (c15901M25896 != null) {
                    c23949M53049 = C23949.m53049(-1, -1, c15901M25896.m36020(), c15901M25896.m36019());
                }
            } else {
                c23949M53049 = C23949.m53049(-1, -1, 0, i);
            }
        }
        return c23949M53049.m53051(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49818(InterfaceC21800 interfaceC21800, C23949 c23949) {
        RunnableC19432 runnableC19432M49841 = m49841(interfaceC21800, interfaceC21800.mo28581(), c23949, EnumC18090.MERGE);
        if (runnableC19432M49841 == null) {
            m49834(interfaceC21800);
            return;
        }
        boolean z = this.f69971.f47311 != null;
        C18761 c18761 = this.f69969;
        c18761.f56048 = z;
        c18761.f56050 = true;
        C14146 c14146 = this.f69973;
        c14146.postInvalidate();
        c14146.post(runnableC19432M49841);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49811(C11209 c11209, C19452 c19452, boolean z, C9197 c9197, boolean z2) {
        C24145 c24145 = this.f69968;
        C24320 c24320M53392 = c24145 == null ? null : c24145.m53392();
        m49812(c11209, c19452, z, c9197, z2, c24320M53392 != null ? Integer.valueOf(c24320M53392.m53668()) : null, false);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX INFO: renamed from: ֫ */
    private void m49812(C11209 c11209, C19452 c19452, boolean z, C9197 c9197, boolean z2, Integer num, boolean z3) {
        C8723 c8723M20169;
        C24796 c24796;
        C8723 c8723M20168;
        if (c9197 != null && c9197.m21194() != c11209) {
            throw new IllegalArgumentException("Window projection does not own visible store");
        }
        if (z && (c11209 == null || c19452 == null || c9197 != null || c19452.m44259() != c11209.m25889())) {
            throw new IllegalArgumentException("Invalid complete syntax display");
        }
        if (!z && c19452 != null) {
            throw new IllegalArgumentException("Incomplete syntax display cannot expose full contexts");
        }
        if (z2) {
            m49837();
        } else {
            m49848();
        }
        C24145 c24145 = this.f69968;
        C24320 c24320M53392 = c24145 == null ? null : c24145.m53392();
        InterfaceC9768 interfaceC9768M32500 = this.f69973.m32500();
        C6216 c6216 = this.f69971.f47310;
        if (c6216 != null) {
            this.f69971.f47310 = (z || c11209 == null || !c6216.m14090(interfaceC9768M32500, c24320M53392, interfaceC9768M32500.mo28581(), interfaceC9768M32500.length())) ? null : c6216.m14087(c9197);
        }
        if (c24320M53392 != null && c11209 != null) {
            if (z) {
                C12826.requireNonNull(c19452);
                c8723M20169 = C8723.m20168(interfaceC9768M32500, c24320M53392, c11209, c19452);
            } else if (c9197 == null || !c9197.m21193()) {
                c8723M20169 = null;
            } else {
                C19452 c19452M21196 = c9197.m21196();
                C12826.requireNonNull(c19452M21196);
                c8723M20169 = C8723.m20169(interfaceC9768M32500, c24320M53392, c11209, c19452M21196, c9197.m21192(), c9197.m21188());
            }
            if (num != null && num.intValue() == c24320M53392.m53668() && c11209.m25889() == interfaceC9768M32500.length()) {
                c24796 = new C24796(interfaceC9768M32500, c24320M53392, c11209);
                if (c8723M20169 == null && !c24320M53392.m53664()) {
                    c8723M20168 = C8723.m20168(interfaceC9768M32500, c24320M53392, c11209, C19452.m44241(interfaceC9768M32500.length(), c24320M53392.f77059));
                }
            } else {
                c8723M20168 = null;
                c24796 = null;
            }
            this.f69971.f47313 = null;
            this.f69971.f47314 = null;
            this.f69971.f47319 = null;
            C16078 c16078 = this.f69971;
            c16078.f47309 = z;
            c16078.f47315 = c19452;
            c16078.f47311 = c9197;
            if (c11209 == null) {
                num = null;
            }
            c16078.f47312 = num;
            c16078.f47317++;
            c16078.f47318 = c11209;
            this.f69971.f47319 = c24796;
            this.f69971.f47314 = c8723M20168;
            this.f69971.f47313 = c8723M20169;
            if (z3) {
                this.f69973.m32431();
            } else {
                this.f69973.m32579();
            }
        }
        c8723M20169 = null;
        c24796 = null;
        c8723M20168 = c8723M20169;
        this.f69971.f47313 = null;
        this.f69971.f47314 = null;
        this.f69971.f47319 = null;
        C16078 c16079 = this.f69971;
        c16079.f47309 = z;
        c16079.f47315 = c19452;
        c16079.f47311 = c9197;
        if (c11209 == null) {
            num = null;
        }
        c16079.f47312 = num;
        c16079.f47317++;
        c16079.f47318 = c11209;
        this.f69971.f47319 = c24796;
        this.f69971.f47314 = c8723M20168;
        this.f69971.f47313 = c8723M20169;
        if (z3) {
            this.f69973.m32431();
        } else {
            this.f69973.m32579();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49809(C8032 c8032) {
        C15901 c15901M18613;
        C23949 c23949M53049;
        C18285 c18285 = this.f69970;
        if (c18285.m41653(c8032)) {
            C11209 c11209M39015 = c8032.m18618().m39015();
            synchronized (this) {
                try {
                    InterfaceC21800 interfaceC21800 = this.f69972.f23579;
                    C24320 c24320M53392 = this.f69968.m53392();
                    if (c18285.m41653(c8032) && interfaceC21800 != null && c8032.m18618().m39014() == c24320M53392 && this.f69973.m32500() == interfaceC21800 && c8032.m18616() == interfaceC21800.mo28581() && c8032.m18617() == interfaceC21800.length() && c11209M39015.m25889() == c8032.m18617() && this.f69971.f47317 == c8032.m18614()) {
                        C8703 c8703 = this.f69972;
                        if (c8703.f23571 == interfaceC21800) {
                            if (!c8703.f23589) {
                                c8703.f23590 = c8032;
                                return;
                            }
                            m49833();
                        }
                        if (this.f69973.isAttachedToWindow() && this.f69973.m32547() && !this.f69973.m32596()) {
                            this.f69972.f23572 = false;
                            if (!c8032.m18615()) {
                                c15901M18613 = c11209M39015.m25889() == 0 ? null : new C15901(0, c11209M39015.m25889());
                            } else {
                                c15901M18613 = c8032.m18613();
                            }
                            m49812(c11209M39015, c8032.m18618().m39013(), true, null, true, Integer.valueOf(c24320M53392.m53668()), true);
                            m49860();
                            C8703 c8704 = this.f69972;
                            c8704.f23594 = -1;
                            c8704.f23584 = -1;
                            c8704.f23593 = 0;
                            c8704.f23576 = 0;
                            c8704.f23591 = null;
                            m49835();
                            m49861();
                            m49858();
                            if (c15901M18613 == null) {
                                c23949M53049 = C23949.f76078;
                            } else {
                                c23949M53049 = C23949.m53049(-1, -1, c15901M18613.m36020(), c15901M18613.m36019());
                            }
                            RunnableC19432 runnableC19432M49841 = m49841(interfaceC21800, c8032.m18616(), c23949M53049, EnumC18090.MERGE);
                            C14146 c14146 = this.f69973;
                            if (runnableC19432M49841 == null) {
                                return;
                            }
                            c14146.postInvalidate();
                            c14146.post(runnableC19432M49841);
                            return;
                        }
                        this.f69972.f23572 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49810(C9373 c9373) {
        C23949 c23949M53049;
        C18285 c18285 = this.f69970;
        if (c18285.m41654(c9373)) {
            C15940 c15940M21792 = c9373.m21792();
            C12826.requireNonNull(c15940M21792, C0252o.f1208c);
            C9197 c9197M21185 = C9197.m21185(c15940M21792.m36191(), c15940M21792.m36193(), c15940M21792.m36198(), c15940M21792.m36192(), c15940M21792.m36196().f77065);
            synchronized (this) {
                InterfaceC21800 interfaceC21800 = this.f69972.f23579;
                C24320 c24320M53392 = this.f69968.m53392();
                if (c18285.m41654(c9373) && interfaceC21800 != null && c15940M21792.m36196() == c24320M53392 && this.f69973.m32500() == interfaceC21800 && interfaceC21800.length() > 1000000 && c9373.m21791() == interfaceC21800.mo28581() && c9373.m21793() == interfaceC21800.length() && c15940M21792.m36197() == c9373.m21791() && c15940M21792.m36191() == c9373.m21793() && c15940M21792.m36193() == this.f69972.f23574) {
                    int iM36194 = c15940M21792.m36194();
                    C8703 c8703 = this.f69972;
                    if (iM36194 == c8703.f23581 && c8703.f23580 == c9373.m21791() && this.f69972.f23575 == c9373.m21793() && this.f69972.f23592 == c9373.m21790() && this.f69971.f47317 == c9373.m21790()) {
                        C8703 c8704 = this.f69972;
                        if (c8704.f23571 == interfaceC21800) {
                            if (!c8704.f23589) {
                                c8704.f23577 = c9373;
                                return;
                            }
                            m49833();
                        }
                        if (this.f69973.isAttachedToWindow() && this.f69973.m32547() && !this.f69973.m32596()) {
                            C9197 c9197 = this.f69969.f56052;
                            if (c9197 == null || c9197.m21194().m25889() != c9197M21185.m21194().m25889()) {
                                C18761 c18761 = this.f69969;
                                if (c18761.f56055 == interfaceC21800 && c18761.f56059 == interfaceC21800.mo28581() && c18761.f56049 == interfaceC21800.length()) {
                                    c23949M53049 = C23949.m53048(this.f69969.f56051, c15940M21792.m36193(), c15940M21792.m36194());
                                } else {
                                    c23949M53049 = C23949.m53049(-1, -1, c15940M21792.m36193(), c15940M21792.m36194());
                                }
                            } else {
                                c23949M53049 = c9197M21185.m21190(c9197);
                            }
                            C23949 c23949 = c23949M53049;
                            m49812(c9197M21185.m21194(), null, false, c9197M21185, true, Integer.valueOf(c24320M53392.m53668()), true);
                            if (!m49832(interfaceC21800)) {
                                m49862(interfaceC21800, c15940M21792.m36193(), c15940M21792.m36194());
                            }
                            m49835();
                            m49858();
                            RunnableC19432 runnableC19432M49841 = m49841(interfaceC21800, c9373.m21791(), c23949, EnumC18090.REPLACE);
                            C14146 c14146 = this.f69973;
                            if (runnableC19432M49841 == null) {
                                return;
                            }
                            c14146.postInvalidate();
                            c14146.post(runnableC19432M49841);
                            return;
                        }
                        this.f69972.f23585 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m49820(C22115 c22115, C6691 c6691) {
        if (c6691.m15254()) {
            c22115.m49808(c6691);
            return;
        }
        C18285 c18285 = c22115.f69970;
        if (c18285.m41652(c6691)) {
            synchronized (c22115) {
                InterfaceC21800 interfaceC21800 = c22115.f69972.f23579;
                if (c18285.m41652(c6691) && interfaceC21800 != null && c22115.f69973.m32500() == interfaceC21800 && c6691.m15253() == interfaceC21800.mo28581() && c6691.m15255() == interfaceC21800.length()) {
                    boolean z = true;
                    if (c6691.m15252() == EnumC5350.SCHEDULER_REJECTED) {
                        C8703 c8703 = c22115.f69972;
                        c8703.f23572 = true;
                        if (c8703.f23571 == interfaceC21800 && c8703.f23589) {
                            c22115.m49833();
                        }
                        if (z) {
                            c22115.m49834(interfaceC21800);
                        }
                    }
                    C8703 c8704 = c22115.f69972;
                    c8704.f23572 = false;
                    c8704.f23573 = c6691.m15253();
                    c22115.f69972.f23586 = c6691.m15255();
                    c22115.f69972.f23582 = interfaceC21800;
                    c22115.m49827(false, true, false);
                    z = false;
                    if (z) {
                        c22115.m49834(interfaceC21800);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49808(C6691 c6691) {
        C18285 c18285 = this.f69970;
        if (c18285.m41652(c6691)) {
            synchronized (this) {
                InterfaceC21800 interfaceC21800 = this.f69972.f23579;
                int iM15256 = c6691.m15256();
                int iM15257 = c6691.m15257();
                if (c18285.m41652(c6691) && interfaceC21800 != null && this.f69973.m32500() == interfaceC21800 && c6691.m15253() == interfaceC21800.mo28581() && c6691.m15255() == interfaceC21800.length()) {
                    C8703 c8703 = this.f69972;
                    if (iM15256 == c8703.f23574 && iM15257 == c8703.f23581 && c8703.f23580 == c6691.m15253() && this.f69972.f23575 == c6691.m15255()) {
                        boolean z = false;
                        if (c6691.m15252() == EnumC5350.SCHEDULER_REJECTED) {
                            C8703 c8704 = this.f69972;
                            c8704.f23585 = true;
                            if (c8704.f23571 == interfaceC21800 && c8704.f23589) {
                                m49833();
                                z = true;
                            }
                        } else {
                            m49835();
                            C8703 c8705 = this.f69972;
                            c8705.f23583 = iM15256;
                            c8705.f23588 = iM15257;
                            c8705.f23587 = c6691.m15253();
                            this.f69972.f23578 = c6691.m15255();
                            this.f69972.f23595 = interfaceC21800;
                            this.f69971.f47310 = null;
                            m49827(false, true, true);
                        }
                        if (z) {
                            m49834(interfaceC21800);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private RunnableC19432 m49841(InterfaceC21800 interfaceC21800, int i, C23949 c23949, EnumC18090 enumC18090) {
        if (this.f69973.m32500() != interfaceC21800 || interfaceC21800.mo28581() != i || this.f69968.m53391() == null) {
            return null;
        }
        C23949 c23949M49807 = m49807(interfaceC21800, i, c23949, enumC18090);
        m49837();
        RunnableC19432 runnableC19432M49805 = m49805(interfaceC21800, i, c23949M49807);
        this.f69969.f56053 = runnableC19432M49805;
        return runnableC19432M49805;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49894(InterfaceC21800 interfaceC21800) {
        synchronized (this) {
            if (m49830(interfaceC21800, interfaceC21800.mo28581()) && this.f69968.m53391() != null) {
                m49837();
                RunnableC19432 runnableC19432M49805 = m49805(interfaceC21800, interfaceC21800.mo28581(), this.f69969.f56056);
                this.f69969.f56053 = runnableC19432M49805;
                this.f69973.post(runnableC19432M49805);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private RunnableC19432 m49805(InterfaceC21800 interfaceC21800, int i, C23949 c23949) {
        C11209 c11209 = this.f69971.f47318;
        if (c11209 == null) {
            throw new IllegalStateException("Syntax display is not initialized");
        }
        C16689 c16689M53391 = this.f69968.m53391();
        C16078 c16078 = this.f69971;
        return new RunnableC19432(this, interfaceC21800, c16689M53391, i, c16078.f47311, c11209, c16078.f47317, c23949);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m49875() {
        return this.f69971.f47316;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49872(CharSequence charSequence) {
        C11209 c11209;
        return this.f69971.f47316 && (c11209 = this.f69971.f47318) != null && c11209.m25889() == charSequence.length();
    }

    /* JADX INFO: renamed from: ۜ */
    private void m49836(InterfaceC21800 interfaceC21800) {
        C11209 c11209M25877;
        m49843();
        if ((m49859(interfaceC21800) || m49844()) && this.f69971.f47318 != null && this.f69971.f47318.m25889() == interfaceC21800.length()) {
            return;
        }
        if (interfaceC21800.length() <= 1000000) {
            m49827(false, false, false);
            C16689 c16689M53391 = this.f69968.m53391();
            if (c16689M53391 == null) {
                return;
            }
            int length = interfaceC21800.length();
            C23120 c23120M37819 = c16689M53391.m37819();
            if (length == 0) {
                c11209M25877 = C11209.m25887();
            } else {
                c11209M25877 = C11209.m25877(length, c23120M37819, false);
            }
            m49811(c11209M25877, (C19452) null, false, (C9197) null, false);
            this.f69971.f47316 = true;
            if (m49838(interfaceC21800)) {
                m49842(interfaceC21800, false);
                return;
            }
            return;
        }
        m49819(interfaceC21800, false);
        if (m49849(interfaceC21800)) {
            C8703 c8703 = this.f69972;
            m49816(interfaceC21800, c8703.f23594, c8703.f23584, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49873(String str) {
        m49813(C9038.m20943(str));
        return this.f69968.m53391() != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m49885(String str) {
        m49813(C9038.m20940(str));
        return this.f69968.m53391() != null;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C16689 m49845(C22115 c22115) {
        return c22115.f69968.m53391();
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m49876() {
        return this.f69968.m53391() != null;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C16689 m49878() {
        return this.f69968.m53391();
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m49880() {
        C16689 c16689M53391 = this.f69968.m53391();
        return c16689M53391 == null ? "Text" : c16689M53391.m37815();
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m49890() {
        C16689 c16689M53391 = this.f69968.m53391();
        if (c16689M53391 != null) {
            return c16689M53391.m37821();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8644 m49893() {
        C16689 c16689M53391 = this.f69968.m53391();
        if (c16689M53391 == null) {
            return null;
        }
        return c16689M53391.m37822();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC18702 m49895() {
        C16689 c16689M53391 = this.f69968.m53391();
        if (c16689M53391 == null) {
            return null;
        }
        return c16689M53391.m37823();
    }

    /* JADX INFO: renamed from: ۫ */
    private boolean m49843() {
        C24320 c24320M53392 = this.f69968.m53392();
        if (c24320M53392 == null || c24320M53392.m53666()) {
            return false;
        }
        C16689 c16689M53391 = this.f69968.m53391();
        C11209 c11209 = this.f69971.f47318;
        C16078 c16078 = this.f69971;
        Integer num = c16078.f47312;
        boolean z = c16078.f47316 && c11209 != null;
        C24145 c24145M53390 = C24145.m53390(c16689M53391);
        m49827(false, false, false);
        this.f69968 = c24145M53390;
        if (c24145M53390.m53392() != null) {
            m49812(c11209, null, false, null, true, num, false);
            this.f69971.f47316 = z;
        } else {
            this.f69971.f47316 = false;
            m49811((C11209) null, (C19452) null, false, (C9197) null, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m49854(CharSequence charSequence) {
        return (charSequence == null || this.f69968.m53392() == null || this.f69968.m53391() == null || !(charSequence instanceof InterfaceC21800) || this.f69973.m32500() != charSequence) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m49856(CharSequence charSequence) {
        return m49847(charSequence) && this.f69968.m53392() != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49897(InterfaceC21800 interfaceC21800, int i, int i2) {
        if (m49854((CharSequence) interfaceC21800)) {
            this.f69970.m41648(interfaceC21800, i, i2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49892(InterfaceC21800 interfaceC21800, int i, int i2) {
        if (!m49847((CharSequence) interfaceC21800) || i < 0 || i2 < 0) {
            return;
        }
        C12826.checkFromToIndex(i, i2, interfaceC21800.length());
        synchronized (this) {
            m49843();
            m49862(interfaceC21800, i, i2);
            C9197 c9197 = this.f69971.f47311;
            if (c9197 != null && c9197.m21191(i, i2)) {
                m49852(interfaceC21800, i, i2);
                return;
            }
            if (m49849(interfaceC21800)) {
                m49816(interfaceC21800, i, i2, false);
            } else {
                m49846(interfaceC21800, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m49852(InterfaceC21800 interfaceC21800, int i, int i2) {
        C8703 c8703 = this.f69972;
        if (c8703.f23574 != -1 && (!m49839(interfaceC21800) || !m49828(c8703.f23574, c8703.f23581, i, i2))) {
            this.f69970.m41658();
            c8703.f23579 = interfaceC21800;
            m49835();
        }
        if (c8703.f23583 != -1) {
            if (m49844() && m49828(c8703.f23583, c8703.f23588, i, i2)) {
                return;
            }
            m49858();
        }
    }
}
