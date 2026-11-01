package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5056 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public long f11846;

    /* JADX INFO: renamed from: ᩶ */
    public C13773 f11847;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f11848;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f11849 = new Object();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C13773 c13773;
        C22902 c22902;
        if (this.f11848) {
            throw new IllegalStateException("Cannot close during text transaction");
        }
        synchronized (this.f11849) {
            c13773 = this.f11847;
            this.f11847 = null;
        }
        if (c13773 != null && (c22902 = c13773.f38940) != null) {
            c22902.m51159();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m10786(Consumer consumer, C13911 c13911) {
        C17795 c17795;
        if (this.f11848) {
            throw new IllegalStateException("Nested text transaction");
        }
        synchronized (this.f11849) {
            m10783();
            if (this.f11846 == C14849.FOREVER_NS) {
                throw new IllegalStateException("Text version exhausted");
            }
            c17795 = new C17795(this.f11847, c13911);
        }
        this.f11848 = true;
        try {
            consumer.accept(c17795);
            if (c17795.f53140) {
                synchronized (this.f11849) {
                    this.f11847 = c17795.f53142;
                    this.f11846++;
                }
            }
            c17795.f53136 = false;
            c17795.f53142 = null;
            this.f11848 = false;
        } catch (Throwable th) {
            c17795.f53136 = false;
            c17795.f53142 = null;
            this.f11848 = false;
            throw th;
        }
    }

    public C5056(CharSequence charSequence) {
        this.f11847 = new C13773(null, 2048, 16, null).m31399(0, charSequence.length(), charSequence, new Object());
    }

    public C5056(C13773 c13773, long j) {
        C22902 c22902 = c13773.f38940;
        if (c22902 != null) {
            c22902.m51158();
        }
        this.f11847 = c13773;
        this.f11846 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m10783() {
        if (this.f11847 == null) {
            throw new C4385("Text document is closed");
        }
    }

    public final int length() {
        int iM31402;
        synchronized (this.f11849) {
            m10783();
            iM31402 = this.f11847.m31402();
        }
        return iM31402;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m10784(int i) {
        C13773 c13773;
        synchronized (this.f11849) {
            m10783();
            c13773 = this.f11847;
            if (i < 0 || i >= c13773.m31402()) {
                throw new IndexOutOfBoundsException("Invalid character index");
            }
            C22902 c22902 = c13773.f38940;
            if (c22902 != null) {
                c22902.m51158();
            }
        }
        return c13773;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m10788() {
        long j;
        synchronized (this.f11849) {
            m10783();
            j = this.f11846;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14443 m10785() {
        C14443 c14443;
        synchronized (this.f11849) {
            m10783();
            c14443 = new C14443(this.f11847, this.f11846);
        }
        return c14443;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10787(C14443 c14443) {
        boolean z;
        synchronized (this.f11849) {
            C13773 c13773 = this.f11847;
            z = c13773 != null && c13773 == c14443.m34522();
        }
        return z;
    }
}
