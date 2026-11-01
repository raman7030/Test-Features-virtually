package p067l;

/* JADX INFO: renamed from: l.ۢ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11344 {

    /* JADX INFO: renamed from: ֫ */
    public final int f31579;

    /* JADX INFO: renamed from: ۧ */
    public final int f31580;

    /* JADX INFO: renamed from: ܽ */
    public final int f31581;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f31582;

    public C11344(int i, int i2, int i3, boolean z) {
        this.f31581 = i;
        this.f31580 = i2;
        this.f31579 = i3;
        this.f31582 = z;
    }

    public C11344() {
        this(0, 0, 0, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11344 m26282(int i) {
        return new C11344(this.f31581, this.f31580, i, this.f31582);
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25085("lastIndent", this.f31581);
        c10888M40057.m25085("indent", this.f31580);
        c10888M40057.m25085("column", this.f31579);
        c10888M40057.m25086("mustBreak", this.f31582);
        return c10888M40057.toString();
    }
}
