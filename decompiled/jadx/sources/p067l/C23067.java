package p067l;

import java.util.Collections;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public final class C23067 extends AbstractC9655 {

    /* JADX INFO: renamed from: ܽ */
    public final C4848 f72476;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21195 f72477;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC9655 f72478;

    public C23067(AbstractC7783 abstractC7783, AbstractC21195 abstractC21195, AbstractC9655 abstractC9655) {
        super(abstractC7783);
        this.f72477 = abstractC21195;
        this.f72476 = C4848.m10276of((Object) abstractC21195);
        this.f72478 = abstractC9655;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22455(Predicate predicate, EnumC3620 enumC3620) {
        return (predicate == null || predicate.test(this.f72477)) ? this.f72476 : Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22457(AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        AbstractC21195 abstractC21195 = this.f72477;
        return (abstractC21195.f20408 == abstractC12224 && (predicate == null || predicate.test(abstractC21195))) ? this.f72476 : Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9655 mo22459(AbstractC7783 abstractC7783) {
        if (this.f72477 == abstractC7783) {
            return this.f72478;
        }
        return null;
    }
}
