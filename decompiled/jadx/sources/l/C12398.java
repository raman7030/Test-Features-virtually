package l;

import java.util.List;

/* JADX INFO: renamed from: l.۫۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12398 extends AbstractC7479 implements InterfaceC8835 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f37335 = EnumC0841.f3177;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37336;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f37337;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315;
    }

    public C12398(int i, List list) {
        super(f37335);
        this.f37336 = i;
        this.f37337 = list == null ? AbstractC14545.of() : list;
    }

    @Override // l.InterfaceC8835
    /* JADX INFO: renamed from: ᩷ */
    public final int mo19046() {
        return this.f37336;
    }

    @Override // l.InterfaceC8835
    /* JADX INFO: renamed from: ۬ */
    public final List mo19045() {
        return this.f37337;
    }

    @Override // l.AbstractC7479, l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public final int mo3974() {
        return (((this.f37337.size() * this.f37336) + 1) / 2) + 4;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f37335.f3316;
    }
}
