package l;

/* JADX INFO: renamed from: l.᩶ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69OZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19957 implements InterfaceC6405 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f64624;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 f64625;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15680[] f64626;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC5700 f64627;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f64628;

    public C19957(EnumC5700 enumC5700, boolean z, int[] iArr, C15680[] c15680Arr, Object obj) {
        this.f64627 = enumC5700;
        this.f64628 = z;
        this.f64624 = iArr;
        this.f64626 = c15680Arr;
        C13997.m33482(obj, "defaultInstance");
        this.f64625 = (InterfaceC8522) obj;
    }

    @Override // l.InterfaceC6405
    /* JADX INFO: renamed from: ܽ */
    public final EnumC5700 mo17731() {
        return this.f64627;
    }

    @Override // l.InterfaceC6405
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo17729() {
        return this.f64628;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] m46039() {
        return this.f64624;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15680[] m46038() {
        return this.f64626;
    }

    @Override // l.InterfaceC6405
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8522 mo17730() {
        return this.f64625;
    }
}
