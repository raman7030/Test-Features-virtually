package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3497 extends C1380 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f11079;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f11080 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f11081;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = c5138.f16077;
        AbstractC4308 abstractC4309 = (AbstractC4308) abstractC4308.mo2962(this, (EnumC9848) obj);
        if (abstractC4309 == abstractC4308) {
            return c5138;
        }
        if (abstractC4309.m12913(EnumC9454.BOT)) {
            return this.f11081.f19609.f66522;
        }
        return new C22547(abstractC4309, c5138.f13890, c5138.f13889);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308Mo12939;
        EnumC9848 enumC9848 = (EnumC9848) obj;
        C20661 c20661 = this.f11081.f19609;
        if (!this.f11079.contains(c8541)) {
            return c8541;
        }
        HashSet hashSet = this.f11080;
        if (!hashSet.add(c8541)) {
            return enumC9848 == EnumC9848.f29808 ? c20661.f66526 : c20661.f66522;
        }
        try {
            int iOrdinal = enumC9848.ordinal();
            if (iOrdinal == 0) {
                abstractC4308Mo12939 = c8541.mo12939();
            } else {
                if (iOrdinal != 1) {
                    C12171.m29636();
                    throw null;
                }
                abstractC4308Mo12939 = c8541.f26106;
                if (abstractC4308Mo12939 == null) {
                    abstractC4308Mo12939 = c20661.f66522;
                }
            }
            abstractC4308Mo12939.getClass();
            AbstractC4308 abstractC4308 = (AbstractC4308) abstractC4308Mo12939.mo2962(this, enumC9848);
            hashSet.remove(c8541);
            return abstractC4308;
        } catch (Throwable th) {
            hashSet.remove(c8541);
            throw th;
        }
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        final EnumC9848 enumC9848 = (EnumC9848) obj;
        boolean zMo5146 = c19955.mo5146();
        C6319 c6319 = this.f11081;
        if (zMo5146) {
            C2609 c2609M17565 = c6319.m17565(c19955);
            C2609 c2609M8243 = c2609M17565.m8243(new Function() { // from class: l.ܶ᩸֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    AbstractC4308 abstractC4308 = (AbstractC4308) obj2;
                    abstractC4308.getClass();
                    return (AbstractC4308) abstractC4308.mo2962(this.f47375, enumC9848);
                }
            });
            if (c2609M17565 != c2609M8243) {
                return c6319.m17534(c2609M8243);
            }
        } else {
            AbstractC4308 abstractC4308Mo4958 = c19955.mo4958();
            AbstractC4308 abstractC4308 = (AbstractC4308) abstractC4308Mo4958.mo2962(this, enumC9848);
            C2609<AbstractC4308> c2609Mo12938 = c19955.mo12938();
            C2609 c2609Mo12939 = c19955.f13890.f17560.mo12938();
            C18837 c18837 = new C18837();
            boolean z = false;
            for (AbstractC4308 abstractC4309 : c2609Mo12938) {
                AbstractC4308 abstractC43010 = abstractC4309.m12928(this.f11079) ? (AbstractC4308) abstractC4309.mo2962(new C4908(this, c19955, ((AbstractC4308) c2609Mo12939.f8240).mo12939()), enumC9848) : abstractC4309;
                if (!abstractC43010.m12913(EnumC9454.BOT)) {
                    c18837.m43511(abstractC43010);
                    z |= abstractC4309 != abstractC43010;
                    c2609Mo12939 = c2609Mo12939.f8241;
                } else {
                    return c6319.f19609.f66522;
                }
            }
            if (abstractC4308 != abstractC4308Mo4958 || z) {
                return new C21842(abstractC4308, c18837.m43517(), c19955.f13890, c19955.f13889);
            }
        }
        return c19955;
    }

    public C3497(C6319 c6319, C2609 c2609) {
        this.f11081 = c6319;
        this.f11079 = c2609;
    }
}
