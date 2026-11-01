package p067l;

/* JADX INFO: renamed from: l.ܶۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z76C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16831 {

    /* JADX INFO: renamed from: ֫ */
    public C13220 f49825;

    /* JADX INFO: renamed from: ۧ */
    public boolean f49826;

    /* JADX INFO: renamed from: ֫ */
    public final void m38173(C13220 c13220) {
        this.f49825 = c13220;
        this.f49826 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38171(char c) {
        C13220 c13220 = this.f49825;
        if (c13220 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f49826) {
            c13220.append('\n');
            this.f49826 = false;
            if (c == '\n') {
                return;
            }
        }
        if (c == '\r') {
            this.f49826 = true;
        } else {
            this.f49825.append(c);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38172(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        while (i < i2) {
            m38171(charSequence.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38170() {
        C13220 c13220 = this.f49825;
        if (c13220 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f49826) {
            c13220.append('\n');
            this.f49826 = false;
        }
    }
}
