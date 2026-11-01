package p067l;

/* JADX INFO: renamed from: l.ۘܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6166 extends AbstractC8257 {

    /* JADX INFO: renamed from: ܳ */
    public final int f15481;

    /* JADX INFO: renamed from: ܽ */
    public final int f15482;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8848 f15483;

    /* JADX INFO: renamed from: ᩳ */
    public final int f15484;

    /* JADX INFO: renamed from: ᩻ */
    public final int f15485;

    public C6166(InterfaceC8848 interfaceC8848, int i, int i2, int i3, int i4) {
        super(i2 - i, i4 - i3);
        this.f15483 = interfaceC8848;
        this.f15481 = i;
        this.f15485 = i3;
        this.f15482 = i2;
        this.f15484 = i4;
    }

    @Override // p067l.AbstractC8257
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC14962 mo13962() {
        return new C4825(this.f15483, this.f15481, this.f15482, this.f15485, this.f15484);
    }
}
