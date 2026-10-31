package l;

import android.text.Editable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66R4 */
/* JADX INFO: loaded from: classes3.dex */
public class C0273 extends C10567 implements InterfaceC7785 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f1592;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f1593;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f1594;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f1595;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C1788 f1596;

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ void mo1593(InterfaceC7765 interfaceC7765) {
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public void mo1602() {
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ boolean mo1607() {
        return false;
    }

    public C0273() {
        this("");
    }

    public C0273(CharSequence charSequence) {
        this(C23721.m52298(charSequence), charSequence);
    }

    public C0273(C23721 c23721, CharSequence charSequence) {
        super(c23721, charSequence);
        this.f1596 = new C1788(new InterfaceC7164() { // from class: l.ۘ۟ᩳ
            @Override // l.InterfaceC7164
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo11472(int i, int i2, CharSequence charSequence2, int i3, int i4) {
                super/*l.ۤ᩸ᩳ*/.replace(i, i2, charSequence2, i3, i4);
            }
        });
        this.f1593 = c23721;
        this.f1595 = c23721.m52329();
    }

    public C0273(C23721 c23721) {
        this(c23721, null);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final C23721 mo1601() {
        return this.f1593;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long mo1606() {
        return this.f1595;
    }

    @Override // l.InterfaceC7785
    public final boolean isChanged() {
        if (m26552()) {
            return this.f1592;
        }
        try {
            return this.f1595 != this.f1593.m52329();
        } catch (C2121 e) {
            if (!m26552()) {
                throw e;
            }
            return this.f1592;
        }
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public void mo1608() {
        mo13046(true);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1600(boolean z) {
        long jM52329;
        if (m26552()) {
            return;
        }
        if (z) {
            jM52329 = -1;
        } else {
            try {
                jM52329 = this.f1593.m52329();
            } catch (C2121 e) {
                if (!m26552()) {
                    throw e;
                }
                return;
            }
        }
        this.f1595 = jM52329;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo1603(long j) {
        if (m26552()) {
            return;
        }
        this.f1595 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C0273 m1590(C0273 c0273) {
        C23721 c23721M52298 = C23721.m52298("");
        try {
            C14548 c14548M52372 = c0273.f1593.m52372();
            try {
                c23721M52298.m52341(c14548M52372);
                C0273 c0274 = new C0273(c23721M52298, null);
                c0274.mo1603(c0273.f1595);
                c14548M52372.close();
                return c0274;
            } catch (Throwable th) {
                try {
                    c14548M52372.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e) {
            c23721M52298.m52331();
            throw e;
        }
    }

    @Override // l.InterfaceC7785
    public final void setReadOnly(boolean z) {
        this.f1596.m5951(z);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1605() {
        return this.f1596.m5953() || m26564();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m1604() {
        return this.f1596.m5955();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1595(final int i, final long j, final RunnableC14343 runnableC14343) {
        Supplier supplier = new Supplier() { // from class: l.ᩴ۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C0273.m1584(this.f57733, i, j, runnableC14343);
            }
        };
        return ((Boolean) this.f1596.m5948(Boolean.FALSE, supplier)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Boolean m1584(C0273 c0273, int i, long j, RunnableC14343 runnableC14343) {
        if (c0273.mo26548() != i || c0273.f1595 != j) {
            return Boolean.FALSE;
        }
        runnableC14343.run();
        c0273.f1596.m5951(true);
        c0273.mo13046(false);
        return Boolean.TRUE;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1592(int i) {
        this.f1594 = i;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final int mo1591() {
        return this.f1594;
    }

    @Override // l.C10567, android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f1594 == 0) {
            C1788 c1788 = this.f1596;
            c1788.getClass();
            c1788.m5948(null, new C13513(c1788, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C10567, android.text.Editable
    public final C10567 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f1594 == 0) {
            C1788 c1788 = this.f1596;
            c1788.getClass();
            c1788.m5948(null, new C13513(c1788, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16665 mo1599() {
        C15795 c15795 = new C15795(0, this);
        return (EnumC16665) this.f1596.m5948(EnumC16665.UNAVAILABLE, c15795);
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16665 mo1597() {
        Supplier supplier = new Supplier() { // from class: l.ۖ۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo1597();
            }
        };
        return (EnumC16665) this.f1596.m5948(EnumC16665.UNAVAILABLE, supplier);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1596(final Runnable runnable) {
        if (this.f1594 != 0) {
            return false;
        }
        return ((Boolean) this.f1596.m5948(Boolean.FALSE, new Supplier() { // from class: l.᩵۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f60752.m26560(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1594(C10130 c10130) {
        c10130.writeInt(-483177132);
        C14548 c14548M52372 = this.f1593.m52372();
        try {
            c14548M52372.m34741(c10130);
            c14548M52372.close();
        } catch (Throwable th) {
            try {
                c14548M52372.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0273 m1588(C12951 c12951, int i) {
        if (c12951.m31500() == -500019884) {
            char[] cArrM1587 = m1587(c12951, i);
            if (c12951.m31488() != i) {
                throw new IllegalArgumentException("Trailing memory text state bytes");
            }
            return new C0273(CharBuffer.wrap(cArrM1587));
        }
        if (i < c12951.m31488() + 4 || i - c12951.m31488() > c12951.available() || c12951.readInt() != -483177132) {
            throw new IllegalArgumentException("Invalid memory session state");
        }
        C23721 c23721M52298 = C23721.m52298("");
        try {
            C14548 c14548M52297 = C23721.m52297(c12951);
            try {
                if (c12951.m31488() != i) {
                    throw new IllegalArgumentException("Trailing memory session state bytes");
                }
                c23721M52298.m52341(c14548M52297);
                C0273 c0273 = new C0273(c23721M52298, null);
                c14548M52297.close();
                return c0273;
            } catch (Throwable th) {
                try {
                    c14548M52297.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c23721M52298.m52331();
            throw new UncheckedIOException(e);
        } catch (Error e2) {
            e = e2;
            c23721M52298.m52331();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            c23721M52298.m52331();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m1587(C12951 c12951, int i) {
        if (i < c12951.m31488() || i - c12951.m31488() < 8 || i - c12951.m31488() > c12951.available()) {
            throw new IllegalArgumentException("Truncated memory text state");
        }
        if (c12951.readInt() != -500019884) {
            throw new IllegalArgumentException("Invalid memory text magic");
        }
        int i2 = c12951.readInt();
        if (i2 < 0 || ((long) i2) * 2 > i - c12951.m31488()) {
            throw new IllegalArgumentException("Invalid memory text length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = c12951.m31507();
        }
        return cArr;
    }

    @Override // l.C10567, java.lang.AutoCloseable
    public void close() {
        if (m26564()) {
            C4925.m14315(new RunnableC7412(3, this));
        } else {
            this.f1596.m5950(new RunnableC1644(1, this));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void mo1598() {
        this.f1592 = isChanged();
        super.close();
        C23721 c23721 = this.f1593;
        if (c23721.m52368()) {
            return;
        }
        c23721.m52331();
    }
}
