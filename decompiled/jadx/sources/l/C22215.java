package l;

/* JADX INFO: renamed from: l.᩹ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SF */
/* JADX INFO: loaded from: classes2.dex */
public final class C22215 extends AbstractC7479 implements InterfaceC14642 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f72096 = EnumC3664.Format3rmi;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f72097;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72098;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72099;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20773(this) + ", " + mo21537();
    }

    public C22215(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27703(i);
        this.f72097 = i;
        C11166.m27709(i2);
        this.f72098 = i2;
        this.f72099 = i3;
    }

    @Override // l.InterfaceC16595
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9712() {
        return this.f72097;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f72098;
    }

    @Override // l.InterfaceC11389
    /* JADX INFO: renamed from: ۘ */
    public final int mo21537() {
        return this.f72099;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f72096;
    }
}
