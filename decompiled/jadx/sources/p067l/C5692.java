package p067l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5692 extends C3680 {

    /* JADX INFO: renamed from: ᩶ */
    public C4848 f13884;

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f13885 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f13886;

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        AbstractC6462 abstractC6462 = c7251.f18916;
        AbstractC6462 abstractC6463 = (AbstractC6462) abstractC6462.mo5291(this, (EnumC11728) obj);
        if (abstractC6463 == abstractC6462) {
            return c7251;
        }
        if (abstractC6463.m14777(EnumC11353.BOT)) {
            return this.f13886.f22480.f69204;
        }
        return new C23797(abstractC6463, c7251.f16705, c7251.f16704);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC6462 abstractC6462Mo14803;
        EnumC11728 enumC11728 = (EnumC11728) obj;
        C22004 c22004 = this.f13886.f22480;
        if (!this.f13884.contains(c10485)) {
            return c10485;
        }
        HashSet hashSet = this.f13885;
        if (!hashSet.add(c10485)) {
            return enumC11728 == EnumC11728.f32761 ? c22004.f69208 : c22004.f69204;
        }
        try {
            int iOrdinal = enumC11728.ordinal();
            if (iOrdinal == 0) {
                abstractC6462Mo14803 = c10485.mo14803();
            } else {
                if (iOrdinal != 1) {
                    C1446.m31698();
                    throw null;
                }
                abstractC6462Mo14803 = c10485.f29021;
                if (abstractC6462Mo14803 == null) {
                    abstractC6462Mo14803 = c22004.f69204;
                }
            }
            abstractC6462Mo14803.getClass();
            AbstractC6462 abstractC6462 = (AbstractC6462) abstractC6462Mo14803.mo5291(this, enumC11728);
            hashSet.remove(c10485);
            return abstractC6462;
        } catch (Throwable th) {
            hashSet.remove(c10485);
            throw th;
        }
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        final EnumC11728 enumC11728 = (EnumC11728) obj;
        boolean zMo7388 = c21333.mo7388();
        C8374 c8374 = this.f13886;
        if (zMo7388) {
            C4848 c4848M19505 = c8374.m19505(c21333);
            C4848 c4848M10287 = c4848M19505.m10287(new Function() { // from class: l.ܶ᩸֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    AbstractC6462 abstractC6462 = (AbstractC6462) obj2;
                    abstractC6462.getClass();
                    return (AbstractC6462) abstractC6462.mo5291(this.f50506, enumC11728);
                }
            });
            if (c4848M19505 != c4848M10287) {
                return c8374.m19474(c4848M10287);
            }
        } else {
            AbstractC6462 abstractC6462Mo7201 = c21333.mo7201();
            AbstractC6462 abstractC6462 = (AbstractC6462) abstractC6462Mo7201.mo5291(this, enumC11728);
            C4848<AbstractC6462> c4848Mo14802 = c21333.mo14802();
            C4848 c4848Mo14803 = c21333.f16705.f20406.mo14802();
            C20271 c20271 = new C20271();
            boolean z = false;
            for (AbstractC6462 abstractC6463 : c4848Mo14802) {
                AbstractC6462 abstractC6464 = abstractC6463.m14792(this.f13884) ? (AbstractC6462) abstractC6463.mo5291(new C7033(this, c21333, ((AbstractC6462) c4848Mo14803.f11034).mo14803()), enumC11728) : abstractC6463;
                if (!abstractC6464.m14777(EnumC11353.BOT)) {
                    c20271.m45777(abstractC6464);
                    z |= abstractC6463 != abstractC6464;
                    c4848Mo14803 = c4848Mo14803.f11035;
                } else {
                    return c8374.f22480.f69204;
                }
            }
            if (abstractC6462 != abstractC6462Mo7201 || z) {
                return new C23127(abstractC6462, c20271.m45783(), c21333.f16705, c21333.f16704);
            }
        }
        return c21333;
    }

    public C5692(C8374 c8374, C4848 c4848) {
        this.f13886 = c8374;
        this.f13884 = c4848;
    }
}
