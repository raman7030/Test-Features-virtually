package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4588 extends AbstractC23402 {

    /* JADX INFO: renamed from: ۗ */
    public int f10286;

    /* JADX INFO: renamed from: ۙ */
    public int f10287;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C5929 f10288;

    /* JADX INFO: renamed from: ۬ */
    public int f10289;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4588(C5929 c5929, C14645 c14645, int i) {
        super(c14645, i);
        this.f10288 = c5929;
        this.f10289 = -1;
    }

    @Override // p067l.AbstractC23402
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9671(C20168 c20168) {
        C18155 c18155;
        int i;
        C5929 c5929 = this.f10288;
        C9952 c9952 = c5929.f14640;
        do {
            int i2 = this.f10287 + 1;
            this.f10287 = i2;
            if (i2 > c9952.f27564) {
                m6947();
                return null;
            }
            Iterator it = c5929.f14638;
            c18155 = new C18155(c9952.f27561, c20168, c9952, this.f10286, c5929.f14641, c5929.f14642, it != null ? ((Integer) it.next()).intValue() : 7);
            i = c18155.f54214;
            this.f10286 = i;
            if (!c5929.f14639) {
                break;
            }
        } while (this.f10289 == i);
        this.f10289 = i;
        return c18155;
    }
}
