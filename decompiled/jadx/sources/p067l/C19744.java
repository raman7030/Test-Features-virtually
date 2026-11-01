package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB3L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19744 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f60045;

    public /* synthetic */ C19744(int i) {
        this.f60045 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f60045) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m44880or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f60045) {
            case 0:
                return ((InterfaceC19370) obj).isDirectory();
            case 1:
                return (C9268.m21439((AbstractC7257) ((InterfaceC14919) obj)) & 16777216) == 0;
            case 2:
                return ((AbstractC6462) obj).f16705.f20405 == EnumC3600.f7353;
            default:
                C3108 c3108 = (C3108) obj;
                EnumC20544 enumC20544 = EnumC20544.f63504;
                C4848 c4848M5292 = c3108.m5292(enumC20544);
                C20271 c20271 = new C20271();
                int i = 0;
                for (AbstractC6462 abstractC6462 : c3108.m5292(enumC20544)) {
                    int i2 = i + 1;
                    if (i == c3108.f5655) {
                        C4848 c4848M10288 = c4848M5292.m10288(c20271.m45783());
                        C4848 c4848M5293 = c3108.m5292(EnumC20544.f63507, EnumC20544.f63505);
                        c4848M10288.getClass();
                        return c4848M5293.m10292(c4848M10288).m10293();
                    }
                    c20271.m45777(abstractC6462);
                    i = i2;
                }
                C4848 c4848M10289 = c4848M5292.m10288(c20271.m45783());
                C4848 c4848M5294 = c3108.m5292(EnumC20544.f63507, EnumC20544.f63505);
                c4848M10289.getClass();
                return c4848M5294.m10292(c4848M10289).m10293();
        }
    }
}
