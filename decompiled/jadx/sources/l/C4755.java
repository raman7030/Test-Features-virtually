package l;

/* JADX INFO: renamed from: l.ۙܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4755 extends AbstractC19929 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2289 f15084;

    public C4755(AbstractC6166 abstractC6166) {
        super(0);
        this.f15084 = abstractC6166;
    }

    public C4755(InterfaceC2289 interfaceC2289, int i, int i2) {
        super(i, i2);
        this.f15084 = interfaceC2289;
    }

    @Override // l.AbstractC19929
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo13906() {
        return this.f15084.size();
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo13904(int i) {
        return this.f15084.getLong(i);
    }

    @Override // l.AbstractC7933
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0877 mo13905(int i, int i2) {
        return new C4755(this.f15084, i, i2);
    }
}
