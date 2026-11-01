package p067l;

/* JADX INFO: renamed from: l.ܶۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16788 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final CharSequence f49469;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f49470;

    /* JADX INFO: renamed from: ᩹ */
    public final C9729 f49471;

    public C16788(CharSequence charSequence, C9729 c9729) {
        this.f49469 = charSequence;
        this.f49471 = c9729;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16788 m38032(CharSequence charSequence) {
        if (charSequence instanceof InterfaceC21800) {
            C9729 c9729Mo28595 = ((InterfaceC21800) charSequence).mo28595();
            return new C16788(c9729Mo28595, c9729Mo28595);
        }
        return new C16788(charSequence, null);
    }

    public final CharSequence range(int i, int i2) {
        int length = length();
        if (i >= 0 && i2 >= i && i2 <= length) {
            return new C10084(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Invalid diff text range");
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m38034(C16788 c16788) {
        if (c16788.f49470) {
            throw new IllegalStateException("Diff reader is closed");
        }
    }

    public final int length() {
        if (!this.f49470) {
            return this.f49469.length();
        }
        throw new IllegalStateException("Diff reader is closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38033(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException("Invalid diff text range");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f49470) {
            return;
        }
        this.f49470 = true;
        C9729 c9729 = this.f49471;
        if (c9729 != null) {
            c9729.close();
        }
    }
}
