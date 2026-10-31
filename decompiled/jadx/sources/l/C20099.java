package l;

/* JADX INFO: renamed from: l.᩶ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20099 extends AbstractC7479 implements InterfaceC23815 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f65095 = EnumC3664.Format3rms;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f65096;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f65097;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f65098;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20773(this) + ", " + mo34743();
    }

    public C20099(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27703(i);
        this.f65097 = i;
        C11166.m27709(i2);
        this.f65098 = i2;
        this.f65096 = i3;
    }

    @Override // l.InterfaceC16595
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9712() {
        return this.f65097;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f65098;
    }

    @Override // l.InterfaceC20830
    /* JADX INFO: renamed from: ᩹ */
    public final int mo34743() {
        return this.f65096;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f65095;
    }
}
