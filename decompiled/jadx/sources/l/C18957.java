package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18957 extends AbstractC7667 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6319 f59789;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10643 f59790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BiConsumer f59791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f59792;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19663 f59793;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC7667 f59794;

    public C18957(C6319 c6319, AbstractC7667 abstractC7667, AbstractC10370 abstractC10370, InterfaceC19663 interfaceC19663, C10643 c10643, BiConsumer biConsumer) {
        super(abstractC7667.f23673);
        this.f59789 = c6319;
        this.f59794 = abstractC7667;
        this.f59792 = abstractC10370;
        this.f59793 = interfaceC19663;
        this.f59790 = c10643;
        this.f59791 = biConsumer;
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20475(Predicate predicate, EnumC1317 enumC1317) {
        C10643 c10643 = this.f59790;
        AbstractC10370 abstractC10370 = this.f59792;
        if (abstractC10370 != null) {
            return mo20477(abstractC10370, predicate, enumC1317);
        }
        try {
            final C2609 c2609M12422 = new C16133(this, c10643.f32020, predicate, enumC1317).m12422((AbstractC19810) this.f59794.f23673, C2609.m8239());
            return new Iterable() { // from class: l.᩷᩵֨
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM49777 = C22159.m49777(c2609M12422, new C8011(9));
                    final C18957 c18957 = this.f67981;
                    return C22159.m49778(itM49777, new Predicate() { // from class: l.ۡ᩵֨
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C19285.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C19285.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C18957 c18958 = c18957;
                            return c18958.f59793.mo10364(c18958.f59794, (AbstractC5698) obj);
                        }
                    });
                }
            };
        } catch (C20515 e) {
            this.f59791.accept(c10643, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        C10643 c10643 = this.f59790;
        AbstractC10370 abstractC10371 = this.f59792;
        if (abstractC10371 != null && abstractC10371 != abstractC10370) {
            return Collections.EMPTY_LIST;
        }
        try {
            final C2609 c2609M12422 = new C2729(this, c10643.f32020, abstractC10370, predicate, enumC1317).m12422((AbstractC19810) this.f59794.f23673, C2609.m8239());
            return new Iterable() { // from class: l.ۜ᩵֨
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    Iterator itM49777 = C22159.m49777(c2609M12422, new C8011(9));
                    final C18957 c18957 = this.f21457;
                    return C22159.m49778(itM49777, new Predicate() { // from class: l.ۢ᩵֨
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate2) {
                            return C19285.$default$and(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate2) {
                            return C19285.$default$or(this, predicate2);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            C18957 c18958 = c18957;
                            return c18958.f59793.mo10364(c18958.f59794, (AbstractC5698) obj);
                        }
                    });
                }
            };
        } catch (C20515 e) {
            this.f59791.accept(c10643, e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // l.AbstractC7667
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7667 mo20479(AbstractC5698 abstractC5698) {
        return this.f59794;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43761() {
        return this.f59790.f32020;
    }
}
