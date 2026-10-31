package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩺֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes.dex */
public final class C22683 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12100 f73218;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f73219;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f73220;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f73221;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f73222;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5750 f73223;

    public C22683(C12100 c12100) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f73221 = arrayDeque;
        this.f73223 = new C5750();
        this.f73222 = c12100 == null ? 0 : c12100.f36167;
        if (c12100 != null) {
            arrayDeque.push(c12100);
            this.f73218 = m50671();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m50678() {
        return this.f73220;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50677(int i) {
        try {
            m50670(i, true, null);
        } catch (C23821 e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50674(int i, InterfaceC17066 interfaceC17066) throws C23821 {
        m50670(i, true, interfaceC17066);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50679(int i) {
        if (i >= 0) {
            int i2 = this.f73220;
            if (((long) i2) + ((long) i) <= this.f73222) {
                try {
                    m50670(i2 + i, false, null);
                    return;
                } catch (C23821 e) {
                    throw new AssertionError(e);
                }
            }
        }
        throw new IndexOutOfBoundsException("Invalid dirty stream skip length");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50673(int i) {
        this.f73223.m16184(i, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 m50672() {
        return this.f73223.m16182();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m50676() {
        return this.f73223.m16186();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50675(long j) {
        this.f73223.m16185(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50670(int i, boolean z, InterfaceC17066 interfaceC17066) throws C23821 {
        if (i < this.f73220 || i > this.f73222) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "Invalid dirty stream target "));
        }
        int i2 = 0;
        while (this.f73220 < i) {
            int i3 = i2 + 1;
            if ((i2 & 255) == 0 && interfaceC17066 != null && interfaceC17066.mo1526()) {
                throw new C23821();
            }
            C12100 c12100 = this.f73218;
            if (c12100 == null) {
                throw new IllegalStateException("Dirty stream ended early");
            }
            int iMin = Math.min(i - this.f73220, c12100.f36167 - this.f73219);
            if (z) {
                boolean zM29514 = this.f73218.m29514();
                C5750 c5750 = this.f73223;
                if (zM29514) {
                    c5750.m16183(this.f73219, iMin, this.f73218.f36166);
                } else {
                    c5750.m16184(iMin, this.f73218.f36171);
                }
            }
            this.f73220 += iMin;
            int i4 = this.f73219 + iMin;
            this.f73219 = i4;
            if (i4 == this.f73218.f36167) {
                this.f73218 = m50671();
                this.f73219 = 0;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C12100 m50671() {
        while (true) {
            ArrayDeque arrayDeque = this.f73221;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            C12100 c12100 = (C12100) arrayDeque.pop();
            if (c12100.m29515()) {
                return c12100;
            }
            arrayDeque.push(c12100.f36165);
            arrayDeque.push(c12100.f36169);
        }
    }
}
