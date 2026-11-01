package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16360 {

    /* JADX INFO: renamed from: ֫ */
    public C16360 f48073;

    /* JADX INFO: renamed from: ۧ */
    public C16360 f48074;

    /* JADX INFO: renamed from: ܽ */
    public C12338 f48075;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC7783 f48076;

    /* JADX INFO: renamed from: ᩳ */
    public C16360 f48077;

    public C16360(AbstractC7783 abstractC7783, C16360 c16360, C16360 c16361, C12338 c12338) {
        this.f48076 = abstractC7783;
        this.f48077 = c16360;
        this.f48073 = c16361;
        this.f48075 = c12338;
        if (c16361 != null) {
            c16361.f48074 = this;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16360 m37175() {
        return this.f48077;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16360 m37176(Predicate predicate) {
        AbstractC7783 abstractC7783 = this.f48077.f48076;
        if (abstractC7783 == null || predicate == null || predicate.test(abstractC7783)) {
            return this.f48077;
        }
        return this.f48077.m37176(predicate);
    }
}
