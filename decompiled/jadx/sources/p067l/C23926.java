package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩺֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes.dex */
public final class C23926 {

    /* JADX INFO: renamed from: ֫ */
    public C13868 f75943;

    /* JADX INFO: renamed from: ۧ */
    public int f75944;

    /* JADX INFO: renamed from: ܳ */
    public int f75945;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f75946;

    /* JADX INFO: renamed from: ܿ */
    public final int f75947;

    /* JADX INFO: renamed from: ᩳ */
    public final C7833 f75948;

    public C23926(C13868 c13868) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f75946 = arrayDeque;
        this.f75948 = new C7833();
        this.f75947 = c13868 == null ? 0 : c13868.f39178;
        if (c13868 != null) {
            arrayDeque.push(c13868);
            this.f75943 = m52997();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m53004() {
        return this.f75945;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53003(int i) {
        try {
            m52996(i, true, null);
        } catch (C25008 e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53000(int i, InterfaceC18588 interfaceC18588) throws C25008 {
        m52996(i, true, interfaceC18588);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53005(int i) {
        if (i >= 0) {
            int i2 = this.f75945;
            if (((long) i2) + ((long) i) <= this.f75947) {
                try {
                    m52996(i2 + i, false, null);
                    return;
                } catch (C25008 e) {
                    throw new AssertionError(e);
                }
            }
        }
        throw new IndexOutOfBoundsException("Invalid dirty stream skip length");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52999(int i) {
        this.f75948.m18103(i, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13868 m52998() {
        return this.f75948.m18101();
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m53002() {
        return this.f75948.m18105();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53001(long j) {
        this.f75948.m18104(j);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52996(int i, boolean z, InterfaceC18588 interfaceC18588) throws C25008 {
        if (i < this.f75945 || i > this.f75947) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Invalid dirty stream target "));
        }
        int i2 = 0;
        while (this.f75945 < i) {
            int i3 = i2 + 1;
            if ((i2 & 255) == 0 && interfaceC18588 != null && interfaceC18588.mo3924()) {
                throw new C25008();
            }
            C13868 c13868 = this.f75943;
            if (c13868 == null) {
                throw new IllegalStateException("Dirty stream ended early");
            }
            int iMin = Math.min(i - this.f75945, c13868.f39178 - this.f75944);
            if (z) {
                boolean zM31577 = this.f75943.m31577();
                C7833 c7833 = this.f75948;
                if (zM31577) {
                    c7833.m18102(this.f75944, iMin, this.f75943.f39177);
                } else {
                    c7833.m18103(iMin, this.f75943.f39182);
                }
            }
            this.f75945 += iMin;
            int i4 = this.f75944 + iMin;
            this.f75944 = i4;
            if (i4 == this.f75943.f39178) {
                this.f75943 = m52997();
                this.f75944 = 0;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C13868 m52997() {
        while (true) {
            ArrayDeque arrayDeque = this.f75946;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            C13868 c13868 = (C13868) arrayDeque.pop();
            if (c13868.m31578()) {
                return c13868;
            }
            arrayDeque.push(c13868.f39176);
            arrayDeque.push(c13868.f39180);
        }
    }
}
