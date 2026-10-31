package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2827 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9052;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11999 f9053;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f9054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f9055 = new Object();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C11999 c11999;
        C21605 c21605;
        if (this.f9054) {
            throw new IllegalStateException("Cannot close during text transaction");
        }
        synchronized (this.f9055) {
            c11999 = this.f9053;
            this.f9053 = null;
        }
        if (c11999 != null && (c21605 = c11999.f35930) != null) {
            c21605.m48812();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8725(Consumer consumer, C12145 c12145) {
        C16231 c16231;
        if (this.f9054) {
            throw new IllegalStateException("Nested text transaction");
        }
        synchronized (this.f9055) {
            m8722();
            if (this.f9052 == C13132.FOREVER_NS) {
                throw new IllegalStateException("Text version exhausted");
            }
            c16231 = new C16231(this.f9053, c12145);
        }
        this.f9054 = true;
        try {
            consumer.accept(c16231);
            if (c16231.f49970) {
                synchronized (this.f9055) {
                    this.f9053 = c16231.f49972;
                    this.f9052++;
                }
            }
            c16231.f49966 = false;
            c16231.f49972 = null;
            this.f9054 = false;
        } catch (Throwable th) {
            c16231.f49966 = false;
            c16231.f49972 = null;
            this.f9054 = false;
            throw th;
        }
    }

    public C2827(CharSequence charSequence) {
        this.f9053 = new C11999(null, 2048, 16, null).m29344(0, charSequence.length(), charSequence, new Object());
    }

    public C2827(C11999 c11999, long j) {
        C21605 c21605 = c11999.f35930;
        if (c21605 != null) {
            c21605.m48811();
        }
        this.f9053 = c11999;
        this.f9052 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m8722() {
        if (this.f9053 == null) {
            throw new C2121("Text document is closed");
        }
    }

    public final int length() {
        int iM29347;
        synchronized (this.f9055) {
            m8722();
            iM29347 = this.f9053.m29347();
        }
        return iM29347;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m8723(int i) {
        C11999 c11999;
        synchronized (this.f9055) {
            m8722();
            c11999 = this.f9053;
            if (i < 0 || i >= c11999.m29347()) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            C21605 c21605 = c11999.f35930;
            if (c21605 != null) {
                c21605.m48811();
            }
        }
        return c11999;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m8727() {
        long j;
        synchronized (this.f9055) {
            m8722();
            j = this.f9052;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12704 m8724() {
        C12704 c12704;
        synchronized (this.f9055) {
            m8722();
            c12704 = new C12704(this.f9053, this.f9052);
        }
        return c12704;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8726(C12704 c12704) {
        boolean z;
        synchronized (this.f9055) {
            C11999 c11999 = this.f9053;
            z = c11999 != null && c11999 == c12704.m32420();
        }
        return z;
    }
}
