package p067l;

/* JADX INFO: renamed from: l.۫ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBEZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14260 extends AbstractC8225 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C14260 f40606;

    /* JADX INFO: renamed from: ۗ */
    public static final C14260 f40607;

    /* JADX INFO: renamed from: ۙ */
    public static final C14260 f40608;

    /* JADX INFO: renamed from: ۛ */
    public static final C14260 f40609;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final C14260 f40610;

    /* JADX INFO: renamed from: ۟ */
    public static final C14260 f40611;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final ConcurrentMapC12768 f40612 = new ConcurrentMapC12768(1000, 0.75f);

    /* JADX INFO: renamed from: ۤ */
    public static final C14260 f40613;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C14260 f40614;

    /* JADX INFO: renamed from: ۨ */
    public static final C14260 f40615;

    /* JADX INFO: renamed from: ۫ */
    public static final C14260 f40616;

    /* JADX INFO: renamed from: ۬ */
    public static final C14260 f40617;

    /* JADX INFO: renamed from: ܰ */
    public static final C14260 f40618;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C14260 f40619;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final C14260 f40620;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final C14260 f40621;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C14260 f40622;

    /* JADX INFO: renamed from: ᩶ */
    public static final C14260 f40623;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C14260 f40624;

    /* JADX INFO: renamed from: ᩺ */
    public static final C14260 f40625;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final C14260 f40626;

    /* JADX INFO: renamed from: ᩸ */
    public C14930 f40627;

    /* JADX INFO: renamed from: ᩹ */
    public final C9566 f40628;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "type";
    }

    static {
        C14260 c14260 = new C14260(C9566.f26324);
        f40621 = c14260;
        C14260 c14261 = new C14260(C9566.f26317);
        f40623 = c14261;
        C14260 c14262 = new C14260(C9566.f26310);
        f40607 = c14262;
        C14260 c14263 = new C14260(C9566.f26316);
        f40616 = c14263;
        C14260 c14264 = new C14260(C9566.f26309);
        f40609 = c14264;
        C14260 c14265 = new C14260(C9566.f26312);
        f40625 = c14265;
        C14260 c14266 = new C14260(C9566.f26306);
        f40614 = c14266;
        C14260 c14267 = new C14260(C9566.f26302);
        f40611 = c14267;
        C14260 c14268 = new C14260(C9566.f26320);
        f40619 = c14268;
        C14260 c14269 = new C14260(C9566.f26336);
        f40624 = c14269;
        C14260 c142610 = new C14260(C9566.f26307);
        f40608 = c142610;
        C14260 c142611 = new C14260(C9566.f26321);
        f40617 = c142611;
        C14260 c142612 = new C14260(C9566.f26326);
        f40613 = c142612;
        C14260 c142613 = new C14260(C9566.f26337);
        f40615 = c142613;
        C14260 c142614 = new C14260(C9566.f26313);
        f40618 = c142614;
        C14260 c142615 = new C14260(C9566.f26299);
        f40620 = c142615;
        C14260 c142616 = new C14260(C9566.f26304);
        f40606 = c142616;
        C14260 c142617 = new C14260(C9566.f26303);
        f40626 = c142617;
        C14260 c142618 = new C14260(C9566.f26300);
        f40622 = c142618;
        f40610 = new C14260(C9566.f26308);
        m32770(c14260);
        m32770(c14261);
        m32770(c14262);
        m32770(c14263);
        m32770(c14264);
        m32770(c14265);
        m32770(c14266);
        m32770(c14267);
        m32770(c14268);
        m32770(c14269);
        m32770(c142610);
        m32770(c142611);
        m32770(c142612);
        m32770(c142613);
        m32770(c142614);
        m32770(c142615);
        m32770(c142616);
        m32770(c142617);
        m32770(c142618);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32770(C14260 c14260) {
        if (f40612.putIfAbsent(c14260.f40628, c14260) == null) {
            return;
        }
        throw new IllegalStateException("Attempted re-init of " + c14260);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14260 m32769(C9566 c9566) {
        C14260 c14260 = new C14260(c9566);
        C14260 c14261 = (C14260) f40612.putIfAbsent(c9566, c14260);
        return c14261 != null ? c14261 : c14260;
    }

    public C14260(C9566 c9566) {
        if (c9566 == null) {
            throw new NullPointerException("type == null");
        }
        if (c9566 == C9566.f26329) {
            throw new UnsupportedOperationException("KNOWN_NULL is not representable");
        }
        this.f40628 = c9566;
        this.f40627 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14260) {
            return this.f40628 == ((C14260) obj).f40628;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40628.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        return this.f40628.m22277().compareTo(((C14260) abstractC15405).f40628.m22277());
    }

    public final String toString() {
        return "type{" + this.f40628.mo4819() + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26328;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f40628.mo4819();
    }

    /* JADX INFO: renamed from: ܺ */
    public final C9566 m32771() {
        return this.f40628;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C14930 m32772() {
        if (this.f40627 == null) {
            this.f40627 = new C14930(this.f40628.m22277());
        }
        return this.f40627;
    }
}
