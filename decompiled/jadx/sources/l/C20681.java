package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20681 extends AbstractC22132 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f66636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66637;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f66638;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9392 f66639;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f66640;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20681(C9392 c9392, C12918 c12918, int i, InterfaceC13848 interfaceC13848) {
        super(c12918, i);
        this.f66639 = c9392;
        this.f66638 = interfaceC13848;
        this.f66636 = -1;
    }

    @Override // l.AbstractC22132
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        C10097 c10097;
        int i;
        do {
            int i2 = this.f66637 + 1;
            this.f66637 = i2;
            C9392 c9392 = this.f66639;
            C7980 c7980 = c9392.f28523;
            if (i2 > c7980.f24645) {
                c7980.f24640 = c18729.m43364();
                m4715();
                return null;
            }
            Iterator it = c9392.f28521;
            c10097 = new C10097(c7980.f24648, c18729, c7980, this.f66640, this.f66638, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c10097.f30402;
            this.f66640 = i;
            if (!c9392.f28520) {
                break;
            }
        } while (this.f66636 == i);
        this.f66636 = i;
        return c10097;
    }
}
