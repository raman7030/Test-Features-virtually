package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24704 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public int f78195;

    /* JADX INFO: renamed from: ۙ */
    public int f78196;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ AbstractC17366 f78197;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15529 f78198;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C8611 f78199;

    /* JADX INFO: renamed from: ۬ */
    public int f78200;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24704(C8611 c8611, C14645 c14645, int i, AbstractC17366 abstractC17366, InterfaceC15529 interfaceC15529) {
        super(c14645, i);
        this.f78199 = c8611;
        this.f78197 = abstractC17366;
        this.f78198 = interfaceC15529;
        this.f78195 = -1;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        C11964 c11964;
        int i;
        do {
            int i2 = this.f78196 + 1;
            this.f78196 = i2;
            C8611 c8611 = this.f78199;
            C9952 c9952 = c8611.f23147;
            if (i2 > c9952.f27555) {
                c9952.f27556 = c20168.m45631();
                m6947();
                return null;
            }
            Iterator it = c8611.f23146;
            c11964 = new C11964(c9952.f27561, c20168, c9952, this.f78200, this.f78197, this.f78198, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c11964.f33361;
            this.f78200 = i;
            if (!c8611.f23145) {
                break;
            }
        } while (this.f78195 == i);
        this.f78195 = i;
        return c11964;
    }
}
