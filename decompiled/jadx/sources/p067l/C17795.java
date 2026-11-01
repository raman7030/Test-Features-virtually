package p067l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܺ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17795 {

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11091 f53138;

    /* JADX INFO: renamed from: ܳ */
    public boolean f53139;

    /* JADX INFO: renamed from: ܽ */
    public boolean f53140;

    /* JADX INFO: renamed from: ܿ */
    public long f53141;

    /* JADX INFO: renamed from: ᩳ */
    public C13773 f53142;

    /* JADX INFO: renamed from: ۜ */
    public Object f53137 = new Object();

    /* JADX INFO: renamed from: ᩻ */
    public final Thread f53143 = Thread.currentThread();

    /* JADX INFO: renamed from: ֫ */
    public boolean f53136 = true;

    public C17795(C13773 c13773, InterfaceC11091 interfaceC11091) {
        this.f53142 = c13773;
        this.f53138 = interfaceC11091;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m40402() {
        if (this.f53143 != Thread.currentThread() || !this.f53136) {
            throw new IllegalStateException("Text transaction is not active on this thread");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40408() {
        m40402();
        return this.f53142.m31402();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40407(int i, int i2, CharBuffer charBuffer) {
        m40399(i, i2, charBuffer, 0, 0, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40406(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m40399(i, i2, charSequence, i3, i4, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40399(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        m40402();
        if (this.f53139) {
            throw new IllegalStateException("Recursive text source edit");
        }
        this.f53139 = true;
        try {
            C13773.m31392(i, i2, this.f53142.m31402());
            int length = charSequence.length();
            int i5 = z ? length : i4;
            C13773.m31392(i3, i5, length);
            C13773.m31393(this.f53142.m31402(), i2 - i, i5 - i3);
            C12432 c12432M31397 = this.f53142.m31397(i3, i5, charSequence);
            try {
                if (this.f53138 == null || (i == i2 && c12432M31397.f34760 == 0)) {
                    this.f53142 = this.f53142.m31400(i, i2, c12432M31397, this.f53137);
                } else {
                    Object obj = new Object();
                    this.f53137 = obj;
                    C13773 c13773M31400 = this.f53142.m31400(i, i2, c12432M31397, obj);
                    this.f53137 = new Object();
                    this.f53138.mo25534(i, i2, this.f53142, c13773M31400, c12432M31397.f34760);
                    this.f53142 = c13773M31400;
                }
                c12432M31397.close();
                long j = (((((long) i2) - ((long) i)) + ((long) i5)) - ((long) i3)) * 2;
                long j2 = this.f53141;
                long j3 = C14849.FOREVER_NS;
                if (j <= C14849.FOREVER_NS - j2) {
                    j3 = j2 + j;
                }
                this.f53141 = j3;
                if (i != i2 || i3 != i5) {
                    this.f53140 = true;
                }
                this.f53139 = false;
            } catch (Throwable th) {
                try {
                    c12432M31397.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f53139 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m40405() {
        m40402();
        return this.f53141;
    }
}
