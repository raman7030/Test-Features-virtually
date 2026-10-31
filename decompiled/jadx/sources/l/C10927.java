package l;

/* JADX INFO: renamed from: l.ۧۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W5OF */
/* JADX INFO: loaded from: classes4.dex */
public class C10927 extends AbstractC7479 implements InterfaceC1073, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f32836 = EnumC3664.Format21c;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32837;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f32838;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + getReference();
    }

    public C10927(EnumC0841 enumC0841, int i, InterfaceC8293 interfaceC8293) {
        super(enumC0841);
        C11166.m27701(i);
        this.f32837 = i;
        this.f32838 = interfaceC8293;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f32837;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f32838;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f32838 = c19357.m44609(this.f32838);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f32836;
    }
}
