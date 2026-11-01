package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10623 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public int f29391;

    /* JADX INFO: renamed from: ۙ */
    public int f29392;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ InterfaceC15529 f29393;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15529 f29394;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C17327 f29395;

    /* JADX INFO: renamed from: ۬ */
    public int f29396;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10623(C17327 c17327, C14645 c14645, int i, InterfaceC15529 interfaceC15529, InterfaceC15529 interfaceC155210) {
        super(c14645, i);
        this.f29395 = c17327;
        this.f29394 = interfaceC15529;
        this.f29393 = interfaceC155210;
        this.f29396 = -1;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        C18155 c18155;
        int i;
        do {
            int i2 = this.f29392 + 1;
            this.f29392 = i2;
            C17327 c17327 = this.f29395;
            C9952 c9952 = c17327.f51707;
            if (i2 > c9952.f27554) {
                c9952.f27560 = c20168.m45631();
                m6947();
                return null;
            }
            Iterator it = c17327.f51706;
            c18155 = new C18155(c9952.f27561, c20168, c9952, this.f29391, this.f29394, this.f29393, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c18155.f54214;
            this.f29391 = i;
            if (!c17327.f51704) {
                break;
            }
        } while (this.f29396 == i);
        this.f29396 = i;
        return c18155;
    }
}
