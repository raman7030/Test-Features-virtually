package l;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.֡᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5EV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0657 extends AbstractC5363 implements InterfaceC8566 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 f2525;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final SortedSet f2527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 f2528;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7382 f2529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12652 f2530;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1717 f2531;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final SortedSet f2532;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23589 f2533;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7008 f2534;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2535;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C23589 f2537;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2526 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2536 = 0;

    public C0657(C23589 c23589, int i, C23589 c235810, C1717 c1717, C7382 c7382, C7008 c7008, AbstractC23698 abstractC23698, AbstractC23698 abstractC23699, Iterable iterable, C12652 c12652) {
        iterable = iterable == null ? AbstractC14545.of() : iterable;
        abstractC23698 = abstractC23698 == null ? AbstractC23698.of() : abstractC23698;
        abstractC23699 = abstractC23699 == null ? AbstractC23698.of() : abstractC23699;
        this.f2533 = c23589;
        this.f2535 = i;
        this.f2537 = c235810;
        this.f2531 = c1717;
        this.f2529 = c7382;
        this.f2534 = c7008;
        this.f2527 = abstractC23698;
        this.f2532 = abstractC23699;
        this.f2525 = AbstractC23698.m52242(C8882.m22954(iterable, C17177.f52643));
        this.f2528 = AbstractC23698.m52242(C8882.m22954(iterable, C17177.f52644));
        this.f2530 = c12652;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return this.f2533.f76475.f22724;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo2700() {
        return this.f2535;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final String mo2695() {
        C23589 c23589 = this.f2537;
        if (c23589 == null) {
            return null;
        }
        return c23589.f76475.f22724;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo2694() {
        C7382 c7382 = this.f2529;
        if (c7382 == null) {
            return null;
        }
        return c7382.f22724;
    }

    @Override // l.InterfaceC8566
    public final Set getAnnotations() {
        return this.f2534;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final Iterable mo2697() {
        return this.f2527;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۨ֫ */
    public final SortedSet mo2697() {
        return this.f2527;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public final Iterable mo2698() {
        return this.f2532;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public final Iterable mo2696() {
        return this.f2525;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۧܽ */
    public final AbstractC23698 mo2696() {
        return this.f2525;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public final Iterable mo2701() {
        return this.f2528;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2693(C23589 c23589) {
        this.f2537 = c23589;
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final List mo2699() {
        return C7470.m20014(this.f2531, C17430.m40771());
    }

    @Override // l.InterfaceC8566
    public final Iterable getFields() {
        return new C19003(this);
    }

    @Override // l.InterfaceC8566
    public final Iterable getMethods() {
        return new C19709(this);
    }

    @Override // l.InterfaceC8566
    public final Collection getMethods() {
        return new C19709(this);
    }
}
