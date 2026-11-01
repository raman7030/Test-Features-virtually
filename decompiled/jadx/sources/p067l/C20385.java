package p067l;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20385 extends AbstractC9655 {

    /* JADX INFO: renamed from: ۜ */
    public final C8374 f63018;

    /* JADX INFO: renamed from: ܳ */
    public final C12483 f63019;

    /* JADX INFO: renamed from: ܽ */
    public final BiConsumer f63020;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC12224 f63021;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC21056 f63022;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC9655 f63023;

    public C20385(C8374 c8374, AbstractC9655 abstractC9655, AbstractC12224 abstractC12224, InterfaceC21056 interfaceC21056, C12483 c12483, BiConsumer biConsumer) {
        super(abstractC9655.f26587);
        this.f63018 = c8374;
        this.f63023 = abstractC9655;
        this.f63021 = abstractC12224;
        this.f63022 = interfaceC21056;
        this.f63019 = c12483;
        this.f63020 = biConsumer;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22455(Predicate predicate, EnumC3620 enumC3620) {
        C12483 c12483 = this.f63019;
        AbstractC12224 abstractC12224 = this.f63021;
        if (abstractC12224 != null) {
            return mo22457(abstractC12224, predicate, enumC3620);
        }
        try {
            final C4848 c4848M14312 = new C17701(this, c12483.f34991, predicate, enumC3620).m14312((AbstractC21195) this.f63023.f26587, C4848.m10283());
            return new Iterable() { // from class: l.᩷᩵֨
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM52115 = C23428.m52115(c4848M14312, new C9982(9));
                    final C20385 c20385 = this.f70664;
                    return C23428.m52116(itM52115, new Predicate() { // from class: l.ۡ᩵֨
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C20697.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m25384or(Predicate predicate2) {
                            return C20697.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C20385 c20386 = c20385;
                            return c20386.f63022.mo12403(c20386.f63023, (AbstractC7783) obj);
                        }
                    });
                }
            };
        } catch (C21865 e) {
            this.f63020.accept(c12483, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22457(AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        C12483 c12483 = this.f63019;
        AbstractC12224 abstractC12225 = this.f63021;
        if (abstractC12225 != null && abstractC12225 != abstractC12224) {
            return Collections.EMPTY_LIST;
        }
        try {
            final C4848 c4848M14312 = new C4962(this, c12483.f34991, abstractC12224, predicate, enumC3620).m14312((AbstractC21195) this.f63023.f26587, C4848.m10283());
            return new Iterable() { // from class: l.ۜ᩵֨
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM52115 = C23428.m52115(c4848M14312, new C9982(9));
                    final C20385 c20385 = this.f24338;
                    return C23428.m52116(itM52115, new Predicate() { // from class: l.ۢ᩵֨
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C20697.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m26810or(Predicate predicate2) {
                            return C20697.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C20385 c20386 = c20385;
                            return c20386.f63022.mo12403(c20386.f63023, (AbstractC7783) obj);
                        }
                    });
                }
            };
        } catch (C21865 e) {
            this.f63020.accept(c12483, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9655 mo22459(AbstractC7783 abstractC7783) {
        return this.f63023;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46028() {
        return this.f63019.f34991;
    }
}
