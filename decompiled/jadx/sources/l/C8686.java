package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8686 extends AbstractC22132 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26466;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26467;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f26468;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f26469;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15740 f26470;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8686(C15740 c15740, C12918 c12918, int i, InterfaceC13848 interfaceC13848, InterfaceC13848 interfaceC13849) {
        super(c12918, i);
        this.f26470 = c15740;
        this.f26469 = interfaceC13848;
        this.f26468 = interfaceC13849;
        this.f26471 = -1;
    }

    @Override // l.AbstractC22132
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        C16611 c16611;
        int i;
        do {
            int i2 = this.f26467 + 1;
            this.f26467 = i2;
            C15740 c15740 = this.f26470;
            C7980 c7980 = c15740.f48567;
            if (i2 > c7980.f24641) {
                c7980.f24647 = c18729.m43364();
                m4715();
                return null;
            }
            Iterator it = c15740.f48566;
            c16611 = new C16611(c7980.f24648, c18729, c7980, this.f26466, this.f26469, this.f26468, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c16611.f51037;
            this.f26466 = i;
            if (!c15740.f48564) {
                break;
            }
        } while (this.f26471 == i);
        this.f26471 = i;
        return c16611;
    }
}
