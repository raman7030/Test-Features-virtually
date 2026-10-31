package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A20 */
/* JADX INFO: loaded from: classes.dex */
public final class C22792 implements InterfaceC13619 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f73584 = C11321.m27961(C22792.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73585 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7270 f73586;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f73587;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11504 f73588;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3618 f73589;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1501 f73590;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f73591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12209 f73592;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f73593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f73594;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f73595;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        boolean zIsOpen = isOpen();
        this.f73585 = false;
        C7270 c7270 = this.f73586;
        if (c7270 != null) {
            c7270.getClass();
            this.f73586 = null;
        }
        C1501 c1501 = this.f73590;
        if (c1501 != null) {
            c1501.getClass();
            this.f73590 = null;
        }
        try {
            if (zIsOpen) {
                this.f73592.m29688();
            } else {
                C12209 c12209 = this.f73592;
                if (c12209 != null) {
                    c12209.m29688();
                }
            }
            this.f73592 = null;
            C3618 c3618 = this.f73589;
            if (c3618 != null) {
                c3618.m11101();
            }
        } catch (Throwable th) {
            C3618 c3619 = this.f73589;
            if (c3619 != null) {
                c3619.m11101();
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13619
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13619 mo32737() {
        if (InterfaceC13619.class.isAssignableFrom(C22792.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12209 m50868() {
        if (!this.f73585) {
            throw new C3037("Pipe handle already closed");
        }
        if (!isOpen()) {
            C3618 c3618M50871 = m50871();
            try {
                if (c3618M50871.m11100()) {
                    C12209 c12209M31363 = this.f73588.m31363(this.f73595, 0, this.f73593, 7, 128, 0);
                    this.f73592 = c12209M31363;
                    c12209M31363.m29686();
                    c3618M50871.close();
                    return c12209M31363;
                }
                if (this.f73595.startsWith("\\pipe\\")) {
                    c3618M50871.m11087(new C16128(this.f73595, c3618M50871.m11094()), new C2724(c3618M50871.m11094()), new EnumC0214[0]);
                }
                if (c3618M50871.m11089(16) || this.f73595.startsWith("\\pipe\\")) {
                    this.f73592 = this.f73588.m31362(this.f73591, this.f73593, 7, 128, 0);
                } else {
                    this.f73592 = this.f73588.m31363("\\pipe" + this.f73595, this.f73591, this.f73593, 7, 128, 0);
                }
                C12209 c12209 = this.f73592;
                c12209.m29686();
                c3618M50871.close();
                return c12209;
            } catch (Throwable th) {
                try {
                    c3618M50871.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f73584.mo7101("Pipe already open");
        C12209 c122010 = this.f73592;
        c122010.m29686();
        return c122010;
    }

    public C22792(C11504 c11504) {
        this.f73588 = c11504;
        this.f73587 = (c11504.m28327() & 512) == 512;
        this.f73594 = false;
        this.f73591 = (c11504.m28327() & (-65281)) | 32;
        this.f73593 = (c11504.m28327() & 7) | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f73595 = c11504.f38759.m41529();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11504 m50873() {
        return this.f73588;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3618 m50871() {
        if (this.f73589 == null) {
            this.f73589 = this.f73588.m31375();
        }
        C3618 c3618 = this.f73589;
        c3618.m11088();
        return c3618;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m50869() {
        return this.f73595;
    }

    public final boolean isOpen() {
        C12209 c12209;
        return this.f73585 && (c12209 = this.f73592) != null && c12209.m29689();
    }

    @Override // l.InterfaceC13619
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo32736() {
        if (!this.f73585) {
            return true;
        }
        C12209 c12209 = this.f73592;
        return (c12209 == null || c12209.m29689()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7270 m50872() throws C3037 {
        if (!this.f73585) {
            throw new C3037("Already closed");
        }
        C7270 c7270 = this.f73586;
        if (c7270 != null) {
            return c7270;
        }
        C3618 c3618M50871 = m50871();
        try {
            this.f73586 = new C7270(this, c3618M50871);
            c3618M50871.close();
            return this.f73586;
        } catch (Throwable th) {
            try {
                c3618M50871.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1501 m50870() throws C3037 {
        if (!this.f73585) {
            throw new C3037("Already closed");
        }
        C1501 c1501 = this.f73590;
        if (c1501 != null) {
            return c1501;
        }
        C3618 c3618M50871 = m50871();
        try {
            this.f73590 = new C1501(this, c3618M50871);
            c3618M50871.close();
            return this.f73590;
        } catch (Throwable th) {
            try {
                c3618M50871.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13619
    /* JADX INFO: renamed from: ֫ */
    public final int mo32734(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C12209 c12209M50868 = m50868();
        try {
            C3618 c3618M29693 = c12209M50868.m29693();
            try {
                if (c3618M29693.m11100()) {
                    C2745 c2745 = new C2745(c3618M29693.m11094(), c12209M50868.m29690(), bArr2);
                    c2745.m8490();
                    c2745.m8488(new C19847(bArr, i, i2));
                    c2745.m8491(i3);
                    int iM12558 = ((C4156) c3618M29693.m11087(c2745, null, EnumC0214.NO_RETRY)).m12558();
                    c3618M29693.close();
                    c12209M50868.m29688();
                    return iM12558;
                }
                if (this.f73587) {
                    C9780 c9780 = new C9780(c3618M29693.m11094(), c12209M50868.m29692(), bArr, i, i2);
                    C9074 c9074 = new C9074(c3618M29693.m11094(), bArr2);
                    if ((this.f73588.m28327() & 1536) == 1536) {
                        c9780.m42527();
                    }
                    c3618M29693.m11087(c9780, c9074, EnumC0214.NO_RETRY);
                    int iM23430 = c9074.m23430();
                    c3618M29693.close();
                    c12209M50868.m29688();
                    return iM23430;
                }
                if (this.f73594) {
                    c3618M29693.m11087(new C16128(this.f73595, c3618M29693.m11094()), new C2724(c3618M29693.m11094()), new EnumC0214[0]);
                    C23890 c23890 = new C23890(c3618M29693.m11094(), bArr2);
                    c3618M29693.m11087(new C14717(c3618M29693.m11094(), this.f73595, bArr, i, i2), c23890, new EnumC0214[0]);
                    int iM52637 = c23890.m52637();
                    c3618M29693.close();
                    c12209M50868.m29688();
                    return iM52637;
                }
                C1501 c1501M50870 = m50870();
                C7270 c7270M50872 = m50872();
                c1501M50870.m16418(i, bArr, i2, 0);
                c7270M50872.getClass();
                int iM25353 = c7270M50872.m25353(0, bArr2.length, bArr2);
                c3618M29693.close();
                c12209M50868.m29688();
                return iM25353;
            } catch (Throwable th) {
                try {
                    c3618M29693.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c12209M50868.m29688();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // l.InterfaceC13619
    /* JADX INFO: renamed from: ܽ */
    public final int mo32738(int i, int i2, byte[] bArr) {
        return m50872().m25353(i, i2, bArr);
    }

    @Override // l.InterfaceC13619
    /* JADX INFO: renamed from: ֫ */
    public final void mo32735(int i, int i2, byte[] bArr) throws IOException {
        m50870().m16418(i, bArr, i2, 1);
    }
}
