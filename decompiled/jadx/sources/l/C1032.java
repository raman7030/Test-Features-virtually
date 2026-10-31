package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1032 extends AbstractC18769 implements InterfaceC18444 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Set f3770;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f3772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12321 f3773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC19150 f3774;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7008 f3775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3776;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f3777 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3771 = 0;

    public C1032(C12321 c12321, List list, int i, C7008 c7008, Set set, InterfaceC19150 interfaceC19150) {
        this.f3773 = c12321;
        this.f3772 = list;
        this.f3776 = i;
        this.f3775 = c7008;
        this.f3770 = set;
        this.f3774 = interfaceC19150;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo3566() {
        return this.f3773.f36874.f76475.f22724;
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        return this.f3773.f36873.f22724;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ۘ */
    public final C1717 mo3565() {
        return this.f3773.f36872.f38990;
    }

    @Override // l.InterfaceC5471
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo3568() {
        return this.f3773.f36872.f38988.f76475.f22724;
    }

    @Override // l.InterfaceC18444
    public final List getParameters() {
        return this.f3772;
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo3567() {
        return this.f3776;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3564(C1109 c1109) {
        this.f3774 = c1109;
    }

    @Override // l.InterfaceC18444
    public final Set getAnnotations() {
        return this.f3775;
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set mo3569() {
        return this.f3770;
    }

    @Override // l.InterfaceC18444
    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19150 mo3570() {
        return this.f3774;
    }
}
