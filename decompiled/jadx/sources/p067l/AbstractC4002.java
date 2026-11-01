package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֫ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4002 {

    /* JADX INFO: renamed from: ۜ */
    public static final C6468 f8726 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C15065 f8727;

    /* JADX INFO: renamed from: ۧ */
    public final C18537 f8728;

    /* JADX INFO: renamed from: ܳ */
    public final C22004 f8729;

    /* JADX INFO: renamed from: ܽ */
    public final C8200 f8730;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f8731;

    /* JADX INFO: renamed from: ᩳ */
    public final C23663 f8732;

    /* JADX INFO: renamed from: ᩻ */
    public final C8374 f8733;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9701 mo7980(C11003 c11003);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9701 mo7981(C11674 c11674);

    public AbstractC4002(C5127 c5127) {
        c5127.m10908(f8726, this);
        this.f8727 = C15065.m34431(c5127);
        this.f8729 = C22004.m49577(c5127);
        this.f8733 = C8374.m19396(c5127);
        this.f8730 = C8200.m18988(c5127);
        this.f8728 = C18537.m42139(c5127);
        this.f8732 = C23663.m52629(c5127);
        this.f8731 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m7978(AbstractC7257 abstractC7257) {
        return m7979(abstractC7257, C4848.m10283());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m7979(AbstractC7257 abstractC7257, C4848 c4848) {
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        if (abstractC7257M21437.m16617(EnumC19998.f60769) && abstractC7257M21437.f18925.mo14779() == null) {
            C11003 c11003 = (C11003) abstractC7257M21437;
            C3088 c3088 = c11003.f5602;
            if (c3088.f20405 == EnumC3600.f7343 && c3088.f5586 == 256) {
                C4848 c4848M10292 = m7979(c11003.f30470, c4848).m10292(c4848);
                C4848 c4848M7979 = m7979(c11003.f30469, c4848);
                c4848M10292.getClass();
                return c4848M7979.m10292(c4848M10292);
            }
        }
        return c4848.m10286(abstractC7257M21437);
    }
}
