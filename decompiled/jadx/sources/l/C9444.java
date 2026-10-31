package l;

/* JADX INFO: renamed from: l.ۢ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9444 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28632;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f28633;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f28634;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f28635;

    public C9444(int i, int i2, int i3, boolean z) {
        this.f28634 = i;
        this.f28633 = i2;
        this.f28632 = i3;
        this.f28635 = z;
    }

    public C9444() {
        this(0, 0, 0, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9444 m24272(int i) {
        return new C9444(this.f28634, this.f28633, i, this.f28635);
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23111("lastIndent", this.f28634);
        c8964M37871.m23111("indent", this.f28633);
        c8964M37871.m23111("column", this.f28632);
        c8964M37871.m23112("mustBreak", this.f28635);
        return c8964M37871.toString();
    }
}
