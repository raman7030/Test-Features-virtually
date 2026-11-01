package p067l;

import java.util.Queue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes3.dex */
public class C7530 extends AbstractC3506 {

    /* JADX INFO: renamed from: ۧ */
    public C20271 f19767 = new C20271();

    /* JADX INFO: renamed from: ܽ */
    public final Predicate f19768;

    public C7530(C23623 c23623, Predicate predicate) {
        this.f19768 = predicate;
        this.f7101 = c23623.f75193;
        c23623.f75193 = this;
    }

    @Override // p067l.AbstractC3506
    /* JADX INFO: renamed from: ֫ */
    public final void mo4532(C18258 c18258) {
        Predicate predicate;
        if (c18258.m41582(EnumC21417.NON_DEFERRABLE) || ((predicate = this.f19768) != null && !predicate.test(c18258))) {
            this.f7101.mo4532(c18258);
        } else {
            this.f19767.m45777(c18258);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Queue m17427() {
        return this.f19767;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17428(Predicate predicate) {
        while (true) {
            C18258 c18258 = (C18258) this.f19767.m45782();
            if (c18258 != null) {
                if (predicate.test(c18258)) {
                    this.f7101.mo4532(c18258);
                }
            } else {
                this.f19767 = null;
                return;
            }
        }
    }
}
