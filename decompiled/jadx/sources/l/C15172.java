package l;

/* JADX INFO: renamed from: l.ܶۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15172 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f46351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f46352;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7744 f46353;

    public C15172(CharSequence charSequence, C7744 c7744) {
        this.f46351 = charSequence;
        this.f46353 = c7744;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15172 m35874(CharSequence charSequence) {
        if (charSequence instanceof InterfaceC20445) {
            C7744 c7744Mo26562 = ((InterfaceC20445) charSequence).mo26562();
            return new C15172(c7744Mo26562, c7744Mo26562);
        }
        return new C15172(charSequence, null);
    }

    public final CharSequence range(int i, int i2) {
        int length = length();
        if (i >= 0 && i2 >= i && i2 <= length) {
            return new C8118(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Invalid diff text range");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35876(C15172 c15172) {
        if (c15172.f46352) {
            throw new IllegalStateException("Diff reader is closed");
        }
    }

    public final int length() {
        if (!this.f46352) {
            return this.f46351.length();
        }
        throw new IllegalStateException("Diff reader is closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35875(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException("Invalid diff text range");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f46352) {
            return;
        }
        this.f46352 = true;
        C7744 c7744 = this.f46353;
        if (c7744 != null) {
            c7744.close();
        }
    }
}
