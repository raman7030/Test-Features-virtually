package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩸ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F42B */
/* JADX INFO: loaded from: classes5.dex */
public final class C21290 implements InterfaceC4935 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13809 f68651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3267 f68652;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f68653;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20661 f68654;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21290 m48319(C2903 c2903) {
        C21290 c21290 = (C21290) c2903.m8837(C21290.class);
        return c21290 == null ? new C21290(c2903) : c21290;
    }

    public C21290(C2903 c2903) {
        new HashSet();
        this.f68653 = new HashMap();
        c2903.m8839(C21290.class, this);
        C4541.m13316(c2903);
        this.f68654 = C20661.m47250(c2903);
        this.f68652 = C3267.m10022(c2903);
        C6136.m17057(c2903);
        C6319.m17456(c2903);
        this.f68651 = C13809.m33121(c2903);
        C22406.m50289(c2903);
        C22364.m50099(c2903);
        EnumC10637.f32009.m26686(EnumC16280.m38301(c2903));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7814 m48321(C14163 c14163) {
        if (c14163.mo952() == EnumC23258.MODULE) {
            return null;
        }
        return ((AbstractC5698) m48318(AbstractC5698.class, c14163)).m16089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17635 m48322(InterfaceC9169 interfaceC9169) {
        AbstractC5698 abstractC5698 = (AbstractC5698) m48318(AbstractC5698.class, interfaceC9169);
        if (this.f68652.m10062() == this.f68654.f66465) {
            return null;
        }
        return abstractC5698.f17559 == EnumC1296.f4568 ? (InterfaceC17635) interfaceC9169 : abstractC5698.m16089().f24147;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC20458 m48326(InterfaceC11970 interfaceC11970) {
        AbstractC5698 abstractC5698 = (AbstractC5698) m48318(AbstractC5698.class, interfaceC11970);
        if ((abstractC5698.mo16084() & 68719476736L) != 0) {
            return EnumC20458.MANDATED;
        }
        if ((abstractC5698.mo16084() & X931RNG.BLOCK64_RESEED_MAX) != 0) {
            return EnumC20458.MANDATED;
        }
        return EnumC20458.EXPLICIT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20458 m48323(InterfaceC12675 interfaceC12675) {
        if (((C16384) m48318(C16384.class, interfaceC12675)).m38583()) {
            return EnumC20458.MANDATED;
        }
        return EnumC20458.EXPLICIT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m48320(InterfaceC11970 interfaceC11970) {
        AbstractC5698 abstractC5698 = (AbstractC5698) m48318(AbstractC5698.class, interfaceC11970);
        C2609 c2609Mo7180 = abstractC5698.mo7180();
        while (abstractC5698.mo952() == EnumC23258.CLASS) {
            AbstractC4308 abstractC4308Mo23577 = ((C14163) abstractC5698).mo23577();
            if (!abstractC4308Mo23577.m12913(EnumC9454.CLASS) || abstractC4308Mo23577.mo12948()) {
                break;
            }
            abstractC5698 = abstractC4308Mo23577.f13890;
            C20661 c20661 = this.f68654;
            if (abstractC5698 == c20661.f66526.f13890) {
                break;
            }
            C2609 c2609M8246 = c2609Mo7180;
            for (C16384 c16384 : abstractC5698.mo7180()) {
                if (c16384.f26338.f13890.m16065(c20661.f66494.f13890) != null) {
                    AbstractC4308 abstractC4308 = c16384.f26338;
                    Iterator it = c2609Mo7180.iterator();
                    do {
                        if (!it.hasNext()) {
                            c2609M8246 = c2609M8246.m8246(c16384);
                            break;
                        }
                    } while (((C16384) it.next()).f26338.f13890 != abstractC4308.f13890);
                }
            }
            c2609Mo7180 = c2609M8246;
        }
        return c2609Mo7180;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48325(InterfaceC11970 interfaceC11970) {
        AbstractC19810 abstractC19810M16071;
        AbstractC5144 abstractC5144M19438;
        C1323 c1323;
        AbstractC5698 abstractC5698 = (AbstractC5698) m48318(AbstractC5698.class, interfaceC11970);
        int i = C14938.f45534[abstractC5698.f17559.ordinal()];
        if (i == 1) {
            abstractC19810M16071 = (C7814) abstractC5698;
        } else if (i == 2) {
            abstractC19810M16071 = (C0052) abstractC5698;
        } else {
            abstractC19810M16071 = abstractC5698.m16071();
        }
        C23069 c23069 = null;
        C1755 c1755M33123 = abstractC19810M16071 != null ? this.f68651.m33123(abstractC19810M16071) : null;
        if (c1755M33123 != null && (abstractC5144M19438 = C7260.m19438(abstractC5698, c1755M33123.f6074)) != null && (c1323 = c1755M33123.f6075) != null) {
            c23069 = new C23069(abstractC5144M19438, c1323);
        }
        if (c23069 == null) {
            return null;
        }
        AbstractC5144 abstractC5144 = (AbstractC5144) c23069.f74207;
        C8630 c8630 = ((C1323) c23069.f74208).f4744;
        if (c8630 == null) {
            return null;
        }
        return c8630.m22391(abstractC5144);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m48318(Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(obj.toString());
        }
        return cls.cast(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48324() {
        this.f68653.clear();
    }
}
