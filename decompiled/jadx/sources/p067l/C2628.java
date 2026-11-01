package p067l;

import android.text.Editable;
import java.io.IOException;
import java.nio.CharBuffer;
import java.p066io.UncheckedIOException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֡۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66R4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2628 extends C12412 implements InterfaceC9768 {

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f4370;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C24913 f4371;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f4372;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f4373;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C4068 f4374;

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo3991(InterfaceC9749 interfaceC9749) {
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ܺۧ */
    public void mo4000() {
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩸֫ */
    public /* synthetic */ boolean mo4005() {
        return false;
    }

    public C2628() {
        this("");
    }

    public C2628(CharSequence charSequence) {
        this(C24913.m54701(charSequence), charSequence);
    }

    public C2628(C24913 c24913, CharSequence charSequence) {
        super(c24913, charSequence);
        this.f4374 = new C4068(new InterfaceC9177() { // from class: l.ۘ۟ᩳ
            @Override // p067l.InterfaceC9177
            /* JADX INFO: renamed from: ֫ */
            public final void mo13408(int i, int i2, CharSequence charSequence2, int i3, int i4) {
                super/*l.ۤ᩸ᩳ*/.replace(i, i2, charSequence2, i3, i4);
            }
        });
        this.f4371 = c24913;
        this.f4373 = c24913.m54732();
    }

    public C2628(C24913 c24913) {
        this(c24913, null);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ܳۧ */
    public final C24913 mo3999() {
        return this.f4371;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩶ */
    public final long mo4004() {
        return this.f4373;
    }

    @Override // p067l.InterfaceC9768
    public final boolean isChanged() {
        if (m28585()) {
            return this.f4370;
        }
        try {
            return this.f4373 != this.f4371.m54732();
        } catch (C4385 e) {
            if (!m28585()) {
                throw e;
            }
            return this.f4370;
        }
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩹֫ */
    public void mo4006() {
        mo14910(true);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۧ */
    public final void mo3998(boolean z) {
        long jM54732;
        if (m28585()) {
            return;
        }
        if (z) {
            jM54732 = -1;
        } else {
            try {
                jM54732 = this.f4371.m54732();
            } catch (C4385 e) {
                if (!m28585()) {
                    throw e;
                }
                return;
            }
        }
        this.f4373 = jM54732;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4001(long j) {
        if (m28585()) {
            return;
        }
        this.f4373 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C2628 m3988(C2628 c2628) {
        C24913 c24913M54701 = C24913.m54701("");
        try {
            C16195 c16195M54775 = c2628.f4371.m54775();
            try {
                c24913M54701.m54744(c16195M54775);
                C2628 c2629 = new C2628(c24913M54701, null);
                c2629.mo4001(c2628.f4373);
                c16195M54775.close();
                return c2629;
            } catch (Throwable th) {
                try {
                    c16195M54775.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | Error | RuntimeException e) {
            c24913M54701.m54734();
            throw e;
        }
    }

    @Override // p067l.InterfaceC9768
    public final void setReadOnly(boolean z) {
        this.f4374.m8146(z);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo4003() {
        return this.f4374.m8148() || m28597();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final FutureC5767 m4002() {
        return this.f4374.m8150();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m3993(final int i, final long j, final RunnableC16000 runnableC16000) {
        Supplier supplier = new Supplier() { // from class: l.ᩴ۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C2628.m3982(this.f60955, i, j, runnableC16000);
            }
        };
        return ((Boolean) this.f4374.m8143(Boolean.FALSE, supplier)).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Boolean m3982(C2628 c2628, int i, long j, RunnableC16000 runnableC16000) {
        if (c2628.mo28581() != i || c2628.f4373 != j) {
            return Boolean.FALSE;
        }
        runnableC16000.run();
        c2628.f4374.m8146(true);
        c2628.mo14910(false);
        return Boolean.TRUE;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo3990(int i) {
        this.f4372 = i;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֡ۧ */
    public final int mo3989() {
        return this.f4372;
    }

    @Override // p067l.C12412, android.text.Editable
    public final Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f4372 == 0) {
            C4068 c4068 = this.f4374;
            c4068.getClass();
            c4068.m8143(null, new C15211(c4068, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // p067l.C12412, android.text.Editable
    public final C12412 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f4372 == 0) {
            C4068 c4068 = this.f4374;
            c4068.getClass();
            c4068.m8143(null, new C15211(c4068, i, i2, charSequence, i3, i4));
        }
        return this;
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۤ֫ */
    public final EnumC18207 mo3997() {
        C17380 c17380 = new C17380(0, this);
        return (EnumC18207) this.f4374.m8143(EnumC18207.UNAVAILABLE, c17380);
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۗ֫ */
    public final EnumC18207 mo3995() {
        Supplier supplier = new Supplier() { // from class: l.ۖ۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo3995();
            }
        };
        return (EnumC18207) this.f4374.m8143(EnumC18207.UNAVAILABLE, supplier);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3994(final Runnable runnable) {
        if (this.f4372 != 0) {
            return false;
        }
        return ((Boolean) this.f4374.m8143(Boolean.FALSE, new Supplier() { // from class: l.᩵۟ᩳ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f63982.m28593(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public void mo3992(C11996 c11996) {
        c11996.writeInt(-483177132);
        C16195 c16195M54775 = this.f4371.m54775();
        try {
            c16195M54775.m36890(c11996);
            c16195M54775.close();
        } catch (Throwable th) {
            try {
                c16195M54775.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C2628 m3986(C14677 c14677, int i) {
        if (c14677.m33587() == -500019884) {
            char[] cArrM3985 = m3985(c14677, i);
            if (c14677.m33575() != i) {
                throw new IllegalArgumentException("Trailing memory text state bytes");
            }
            return new C2628(CharBuffer.wrap(cArrM3985));
        }
        if (i < c14677.m33575() + 4 || i - c14677.m33575() > c14677.available() || c14677.readInt() != -483177132) {
            throw new IllegalArgumentException("Invalid memory session state");
        }
        C24913 c24913M54701 = C24913.m54701("");
        try {
            C16195 c16195M54700 = C24913.m54700(c14677);
            try {
                if (c14677.m33575() != i) {
                    throw new IllegalArgumentException("Trailing memory session state bytes");
                }
                c24913M54701.m54744(c16195M54700);
                C2628 c2628 = new C2628(c24913M54701, null);
                c16195M54700.close();
                return c2628;
            } catch (Throwable th) {
                try {
                    c16195M54700.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            c24913M54701.m54734();
            throw new UncheckedIOException(e);
        } catch (Error e2) {
            e = e2;
            c24913M54701.m54734();
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            c24913M54701.m54734();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static char[] m3985(C14677 c14677, int i) {
        if (i < c14677.m33575() || i - c14677.m33575() < 8 || i - c14677.m33575() > c14677.available()) {
            throw new IllegalArgumentException("Truncated memory text state");
        }
        if (c14677.readInt() != -500019884) {
            throw new IllegalArgumentException("Invalid memory text magic");
        }
        int i2 = c14677.readInt();
        if (i2 < 0 || ((long) i2) * 2 > i - c14677.m33575()) {
            throw new IllegalArgumentException("Invalid memory text length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = c14677.m33594();
        }
        return cArr;
    }

    @Override // p067l.C12412, java.lang.AutoCloseable
    public void close() {
        if (m28597()) {
            C7050.m16212(new RunnableC9413(3, this));
        } else {
            this.f4374.m8145(new RunnableC3931(1, this));
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public void mo3996() {
        this.f4370 = isChanged();
        super.close();
        C24913 c24913 = this.f4371;
        if (c24913.m54771()) {
            return;
        }
        c24913.m54734();
    }
}
