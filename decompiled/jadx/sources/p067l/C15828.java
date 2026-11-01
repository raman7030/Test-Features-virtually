package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15828 extends AbstractC21195 implements InterfaceC11083 {

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC15689 f45850;

    /* JADX INFO: renamed from: ۛ */
    public C23147 f45851;

    /* JADX INFO: renamed from: ۟ */
    public boolean f45852;

    /* JADX INFO: renamed from: ۧ֫ */
    public C4848 f45853;

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC19740 f45854;

    /* JADX INFO: renamed from: ܰ */
    public AbstractC12224 f45855;

    /* JADX INFO: renamed from: ܽ֫ */
    public C4848 f45856;

    /* JADX INFO: renamed from: ܿ֫ */
    public C4848 f45857;

    /* JADX INFO: renamed from: ᩳ֫ */
    public InterfaceC19740 f45858;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC12224 f45859;

    public C15828(long j, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        super(EnumC3600.f7354, j, abstractC12224, abstractC6462, abstractC7783);
        this.f45856 = C4848.m10283();
        this.f45852 = false;
        this.f45850 = null;
        this.f45855 = AbstractC21195.m47864(abstractC12224, abstractC7783);
        this.f45859 = AbstractC21195.m47863(abstractC12224, abstractC7783);
        this.f45858 = null;
        this.f45854 = null;
        this.f45851 = C23147.m51602();
        this.f45853 = C4848.m10283();
    }

    public C15828(long j, AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        this(j, abstractC12224, new C21333(null, AbstractC6462.f16700, null), abstractC7783);
        this.f20406.f16705 = this;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۬ */
    public final long mo18003() {
        mo18020();
        return this.f20409;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֨֫ */
    public final AbstractC15689 mo17983() {
        mo18020();
        return this.f45850;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫֫ */
    public final C4848 mo17987() {
        mo18020();
        return super.mo17987();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۧ֫ */
    public final C4848 mo18000() {
        mo18020();
        return super.mo18000();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 mo18010(C8374 c8374) {
        if (this.f20411 == null) {
            this.f20411 = new C21333(c8374.m19459(this.f20406.mo7201()), C4848.m10283(), this, this.f20406.f16704);
        }
        return this.f20411;
    }

    @Override // p067l.AbstractC7783
    public final String toString() {
        if (this.f20408.isEmpty()) {
            return C23623.m52446("anonymous.class", this.f45859);
        }
        return this.f45855.toString();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC12224 mo17995() {
        return this.f45855;
    }

    @Override // p067l.InterfaceC11083, p067l.InterfaceC22483
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224 mo3352() {
        return this.f45855;
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܺ */
    public final C4848 mo3353() {
        C4848 c4848Mo3353 = super.mo3353();
        if (!this.f45856.isEmpty()) {
            Iterator it = this.f45856.m10294().iterator();
            while (it.hasNext()) {
                c4848Mo3353 = c4848Mo3353.m10290((C22536) it.next());
            }
        }
        return c4848Mo3353;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC12224 mo18002() {
        return this.f45859;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo17999(AbstractC7783 abstractC7783, C8374 c8374) {
        if (this == abstractC7783) {
            return true;
        }
        if ((abstractC7783.mo18003() & 512) != 0) {
            AbstractC6462 abstractC6462M19502 = this.f20406;
            while (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                for (C4848 c4848M19450 = c8374.m19450(abstractC6462M19502); c4848M19450.m10293(); c4848M19450 = c4848M19450.f11035) {
                    if (((AbstractC6462) c4848M19450.f11034).f16705.mo17999(abstractC7783, c8374)) {
                        return true;
                    }
                }
                abstractC6462M19502 = c8374.m19502(abstractC6462M19502);
            }
            return false;
        }
        AbstractC6462 abstractC6462M19503 = this.f20406;
        while (abstractC6462M19503.m14777(EnumC11353.CLASS)) {
            if (abstractC6462M19503.f16705 == abstractC7783) {
                return true;
            }
            abstractC6462M19503 = c8374.m19502(abstractC6462M19503);
        }
        return false;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ᩶ */
    public final void mo18020() {
        InterfaceC8453 interfaceC8453 = this.f20410;
        try {
            super.mo18020();
        } catch (C21865 e) {
            e.f68782.m8677(this, interfaceC8453);
            this.f20409 |= 9;
            this.f20406 = new C13956(this, AbstractC6462.f16700);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final C4848 m35938() {
        m18022();
        AbstractC6462 abstractC6462 = this.f20406;
        if (abstractC6462 instanceof C21333) {
            C21333 c21333 = (C21333) abstractC6462;
            if (c21333.f67261 == null) {
                c21333.f67261 = C4848.m10283();
            }
            C4848 c4848 = c21333.f67260;
            if (c4848 != null) {
                C20271 c20271 = new C20271();
                Iterator it = c4848.iterator();
                while (it.hasNext()) {
                    c20271.m45777(((AbstractC6462) it.next()).mo14235());
                }
                return c20271.m45783();
            }
            return c21333.f67261;
        }
        return C4848.m10283();
    }

    @Override // p067l.InterfaceC11083
    /* JADX INFO: renamed from: ۛ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo25528() {
        m18022();
        AbstractC6462 abstractC6462 = this.f20406;
        if (abstractC6462 instanceof C21333) {
            C21333 c21333 = (C21333) abstractC6462;
            if (c21333.f67259 == null) {
                c21333.f67259 = AbstractC6462.f16700;
            }
            if (c21333.mo14789()) {
                return AbstractC6462.f16700;
            }
            return c21333.f67259.mo14235();
        }
        return AbstractC6462.f16700;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final EnumC24473 mo3347() {
        m18022();
        mo18020();
        long j = this.f20409;
        if ((8192 & j) != 0) {
            return EnumC24473.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC24473.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC24473.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC24473.RECORD;
        }
        return EnumC24473.CLASS;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܳ */
    public final Set mo12941() {
        m18022();
        mo18020();
        return C21036.m47447(this.f20409 & (-8796093022209L));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22536 m35935(C13818 c13818) {
        for (C22536 c22536 : this.f45856) {
            if (c22536.f20408 == c13818.f20408) {
                return c22536;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22536 m35934(C11281 c11281) {
        C22536 c22536 = null;
        for (C22536 c22537 : this.f45856) {
            if (c22537.f20408 == c11281.f31433 && c11281.f18924 == c22537.f71075) {
                c22536 = c22537;
            }
        }
        return c22536;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX INFO: renamed from: ֫ */
    public final void m35936(C22536 c22536, C11281 c11281, C4848 c4848) {
        boolean z;
        if (c22536 != null) {
            C4848 c4848M10281 = C4848.m10281(c22536, this.f45856);
            this.f45856 = c4848M10281;
            this.f45856 = c4848M10281.m10286(new C22536(c11281.f31438, c22536.f71073, c22536.f71071));
            return;
        }
        C4848 c4849 = this.f45856;
        C13818 c13818 = c11281.f31438;
        if (c13818.f20406.m14777(EnumC11353.ARRAY)) {
            C7251 c7251 = (C7251) c13818.f20406;
            c7251.getClass();
            if (c7251 instanceof C2556) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f45856 = c4849.m10286(new C22536(c13818, c4848, z));
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public final C4848 m35941() {
        return this.f45856;
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final C4848 m35943() {
        return this.f45856;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m35947(C4848 c4848) {
        this.f45856 = c4848;
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final EnumC25164 m35944() {
        m18022();
        if (this.f20407.f20405 == EnumC3600.f7351) {
            return EnumC25164.TOP_LEVEL;
        }
        if (this.f20408.isEmpty()) {
            return EnumC25164.ANONYMOUS;
        }
        if (this.f20407.f20405 == EnumC3600.f7343) {
            return EnumC25164.LOCAL;
        }
        return EnumC25164.MEMBER;
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12431(this, obj);
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo25476(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35945(C8374 c8374) {
        if (c8374.f22440.m35240(this) != null) {
            mo18020();
            if ((this.f20409 & 16384) == 0 || c8374.m19502(this.f20406).f16705 != c8374.f22480.f69209) {
                return;
            }
            mo18020();
            if ((this.f20409 & 1040) != 0 || c8374.m19426(this) == null) {
                return;
            }
            this.f20409 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
    }

    /* JADX INFO: renamed from: ᩺֫ */
    public final void m35949() {
        this.f20405 = EnumC3600.f7354;
        this.f20411 = null;
        this.f45850 = null;
        this.f20409 = 0L;
        AbstractC6462 abstractC6462 = this.f20406;
        if (abstractC6462 instanceof C21333) {
            C21333 c21333 = (C21333) abstractC6462;
            c21333.mo7202(AbstractC6462.f16700);
            c21333.f67262 = -1;
            c21333.f67257 = null;
            c21333.f67258 = null;
            c21333.f67259 = null;
            c21333.f67261 = null;
            c21333.f67260 = null;
        }
        m35939();
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final void m35939() {
        this.f20404 = null;
        this.f45851 = C23147.m51602();
    }

    @Override // p067l.AbstractC21195
    /* JADX INFO: renamed from: ᩹֫ */
    public final C23147 mo35948() {
        return this.f45851;
    }

    @Override // p067l.AbstractC21195
    /* JADX INFO: renamed from: ᩶֫ */
    public final boolean mo35946() {
        return (this.f20409 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35937(C23147 c23147) {
        C1446.m31704(!this.f45851.m51605());
        this.f45851 = c23147;
    }

    /* JADX INFO: renamed from: ۨ֫ */
    public final boolean m35942() {
        return (this.f20409 & 2305843009213693952L) != 0;
    }
}
