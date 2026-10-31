package l;

/* JADX INFO: renamed from: l.ܶ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14910 extends AbstractC0275 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f45481;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f45482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f45483;

    public C14910(String str, long j, InterfaceC6171 interfaceC6171) {
        this.f45483 = str;
        this.f45482 = j;
        this.f45481 = interfaceC6171;
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ܳ */
    public final C13864 mo1613() {
        String str = this.f45483;
        if (str == null) {
            return null;
        }
        try {
            return C13864.m33217(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ᩳ */
    public final long mo1615() {
        return this.f45482;
    }

    @Override // l.AbstractC0275
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC6171 mo1616() {
        return this.f45481;
    }
}
