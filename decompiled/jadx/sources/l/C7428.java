package l;

import android.net.Uri;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۟ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7428 implements InterfaceC23757, InterfaceC7160 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18832 f22820;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18176 f22821;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Uri f22822;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f22824;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12367 f22825;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14310 f22827;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f22828;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f22829;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22830;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f22831;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23615 f22832 = new C23615();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22823 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f22833 = C10957.m27273();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3104 f22826 = m19959(0);

    public C7428(C18176 c18176, Uri uri, InterfaceC21449 interfaceC21449, C15625 c15625, InterfaceC21830 interfaceC21830, C14310 c14310) {
        this.f22821 = c18176;
        this.f22822 = uri;
        this.f22820 = new C18832(interfaceC21449);
        this.f22825 = c15625;
        this.f22829 = interfaceC21830;
        this.f22827 = c14310;
    }

    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ۧ */
    public final void mo6511() {
        this.f22830 = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012e */
    @Override // l.InterfaceC23757
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6509() {
        int iM36821 = 0;
        while (iM36821 == 0 && !this.f22830) {
            long j = this.f22832.f76532;
            C3104 c3104M19959 = m19959(j);
            this.f22826 = c3104M19959;
            long jMo1620 = this.f22820.mo1620(c3104M19959);
            if (!this.f22830) {
                if (jMo1620 != -1) {
                    jMo1620 += j;
                    C18176.m42279(this.f22821);
                }
                long j2 = jMo1620;
                this.f22821.f56501 = C10189.m25587(this.f22820.mo5936());
                InterfaceC21449 c1784 = this.f22820;
                if (this.f22821.f56501 != null && this.f22821.f56501.f30618 != -1) {
                    c1784 = new C1784(this.f22820, this.f22821.f56501.f30618, this);
                    InterfaceC19383 interfaceC19383M42297 = this.f22821.m42297();
                    this.f22831 = interfaceC19383M42297;
                    interfaceC19383M42297.mo8456(C18176.f56486);
                }
                InterfaceC21449 interfaceC21449 = c1784;
                long jM36825 = j;
                ((C15625) this.f22825).m36824(interfaceC21449, this.f22822, this.f22820.mo5936(), j, j2, this.f22829);
                if (this.f22821.f56501 != null) {
                    ((C15625) this.f22825).m36822();
                }
                if (this.f22823) {
                    ((C15625) this.f22825).m36823(jM36825, this.f22824);
                    this.f22823 = false;
                }
                while (true) {
                    long j3 = jM36825;
                    while (true) {
                        if (iM36821 != 0 || this.f22830) {
                            break;
                        }
                        try {
                            this.f22827.m34147();
                            iM36821 = ((C15625) this.f22825).m36821(this.f22832);
                            jM36825 = ((C15625) this.f22825).m36825();
                            if (jM36825 > this.f22821.f56521 + j3) {
                                this.f22827.m34150();
                                this.f22821.f56528.post(this.f22821.f56492);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iM36821 == 1) {
                    iM36821 = 0;
                } else if (((C15625) this.f22825).m36825() != -1) {
                    this.f22832.f76532 = ((C15625) this.f22825).m36825();
                }
                C8751.m22643(this.f22820);
            } else {
                if (iM36821 != 1 && ((C15625) this.f22825).m36825() != -1) {
                    this.f22832.f76532 = ((C15625) this.f22825).m36825();
                }
                C8751.m22643(this.f22820);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19965(C17714 c17714) {
        long jMax;
        if (!this.f22828) {
            jMax = this.f22824;
        } else {
            jMax = Math.max(this.f22821.m42270(true), this.f22824);
        }
        int iM41457 = c17714.m41457();
        InterfaceC19383 interfaceC19383 = this.f22831;
        interfaceC19383.getClass();
        interfaceC19383.mo8453(iM41457, c17714);
        interfaceC19383.mo8455(jMax, 1, iM41457, 0, null);
        this.f22828 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3104 m19959(long j) {
        C4515 c4515 = new C4515();
        c4515.m13281(this.f22822);
        c4515.m13286(j);
        int i = C18176.f56487;
        c4515.m13282((String) null);
        c4515.m13279(6);
        c4515.m13283(C18176.f56488);
        return c4515.m13278();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19961(C7428 c7428, long j, long j2) {
        c7428.f22832.f76532 = j;
        c7428.f22824 = j2;
        c7428.f22823 = true;
        c7428.f22828 = false;
    }
}
