package l;

import java.util.Queue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes3.dex */
public class C5431 extends AbstractC1197 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18837 f16926 = new C18837();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Predicate f16927;

    public C5431(C22364 c22364, Predicate predicate) {
        this.f16927 = predicate;
        this.f4332 = c22364.f72467;
        c22364.f72467 = this;
    }

    @Override // l.AbstractC1197
    /* JADX INFO: renamed from: ֫ */
    public final void mo2165(C16719 c16719) {
        Predicate predicate;
        if (c16719.m39346(EnumC20043.NON_DEFERRABLE) || ((predicate = this.f16927) != null && !predicate.test(c16719))) {
            this.f4332.mo2165(c16719);
        } else {
            this.f16926.m43511(c16719);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Queue m15516() {
        return this.f16926;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15517(Predicate predicate) {
        while (true) {
            C16719 c16719 = (C16719) this.f16926.m43516();
            if (c16719 != null) {
                if (predicate.test(c16719)) {
                    this.f4332.mo2165(c16719);
                }
            } else {
                this.f16926 = null;
                return;
            }
        }
    }
}
