package l;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: l.ܺ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16231 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9177 f49968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f49971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11999 f49972;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Object f49967 = new Object();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Thread f49973 = Thread.currentThread();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49966 = true;

    public C16231(C11999 c11999, InterfaceC9177 interfaceC9177) {
        this.f49972 = c11999;
        this.f49968 = interfaceC9177;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38190() {
        if (this.f49973 != Thread.currentThread() || !this.f49966) {
            throw new IllegalStateException("Text transaction is not active on this thread");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38196() {
        m38190();
        return this.f49972.m29347();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38195(int i, int i2, CharBuffer charBuffer) {
        m38187(i, i2, charBuffer, 0, 0, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38194(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m38187(i, i2, charSequence, i3, i4, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38187(int i, int i2, CharSequence charSequence, int i3, int i4, boolean z) {
        m38190();
        if (this.f49969) {
            throw new IllegalStateException("Recursive text source edit");
        }
        this.f49969 = true;
        try {
            C11999.m29337(i, i2, this.f49972.m29347());
            int length = charSequence.length();
            int i5 = z ? length : i4;
            C11999.m29337(i3, i5, length);
            C11999.m29338(this.f49972.m29347(), i2 - i, i5 - i3);
            C10588 c10588M29342 = this.f49972.m29342(i3, i5, charSequence);
            try {
                if (this.f49968 == null || (i == i2 && c10588M29342.f31790 == 0)) {
                    this.f49972 = this.f49972.m29345(i, i2, c10588M29342, this.f49967);
                } else {
                    Object obj = new Object();
                    this.f49967 = obj;
                    C11999 c11999M29345 = this.f49972.m29345(i, i2, c10588M29342, obj);
                    this.f49967 = new Object();
                    this.f49968.mo23583(i, i2, this.f49972, c11999M29345, c10588M29342.f31790);
                    this.f49972 = c11999M29345;
                }
                c10588M29342.close();
                long j = (((((long) i2) - ((long) i)) + ((long) i5)) - ((long) i3)) * 2;
                long j2 = this.f49971;
                long j3 = C13132.FOREVER_NS;
                if (j <= C13132.FOREVER_NS - j2) {
                    j3 = j2 + j;
                }
                this.f49971 = j3;
                if (i != i2 || i3 != i5) {
                    this.f49970 = true;
                }
                this.f49969 = false;
            } catch (Throwable th) {
                try {
                    c10588M29342.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.f49969 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m38193() {
        m38190();
        return this.f49971;
    }
}
