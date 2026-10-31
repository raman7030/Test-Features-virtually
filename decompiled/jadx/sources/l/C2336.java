package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2336 extends AbstractC22132 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f7495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7496;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3747 f7497;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7498;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336(C3747 c3747, C12918 c12918, int i) {
        super(c12918, i);
        this.f7497 = c3747;
        this.f7498 = -1;
    }

    @Override // l.AbstractC22132
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo7600(C18729 c18729) {
        C16611 c16611;
        int i;
        C3747 c3747 = this.f7497;
        C7980 c7980 = c3747.f11834;
        do {
            int i2 = this.f7496 + 1;
            this.f7496 = i2;
            if (i2 > c7980.f24651) {
                m4715();
                return null;
            }
            Iterator it = c3747.f11832;
            c16611 = new C16611(c7980.f24648, c18729, c7980, this.f7495, c3747.f11835, c3747.f11836, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c16611.f51037;
            this.f7495 = i;
            if (!c3747.f11833) {
                break;
            }
        } while (this.f7498 == i);
        this.f7498 = i;
        return c16611;
    }
}
