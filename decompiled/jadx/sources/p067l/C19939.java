package p067l;

/* JADX INFO: renamed from: l.ᩴۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19939 {

    /* JADX INFO: renamed from: ֫ */
    public int f60532;

    /* JADX INFO: renamed from: ۧ */
    public int f60533;

    /* JADX INFO: renamed from: ܳ */
    public String f60534;

    /* JADX INFO: renamed from: ܽ */
    public String f60535;

    /* JADX INFO: renamed from: ܿ */
    public String f60536;

    /* JADX INFO: renamed from: ᩳ */
    public String f60537;

    /* JADX INFO: renamed from: ֫ */
    public final void m45259(String str, boolean z) {
        if (this.f60532 == -1) {
            throw new IllegalStateException();
        }
        String str2 = this.f60534;
        if (z) {
            this.f60534 = C21459.m48621(this.f60533, str2, C7470.m17248(str));
        } else {
            this.f60534 = str;
        }
        this.f60533 = -1;
        this.f60532 = -1;
    }
}
