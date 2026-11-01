package p067l;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.ۛ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7783 extends AbstractC15218 implements InterfaceC22798, InterfaceC13745 {

    /* JADX INFO: renamed from: ۗ */
    public C13148 f20404;

    /* JADX INFO: renamed from: ۙ */
    public EnumC3600 f20405;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC6462 f20406;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC7783 f20407;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC12224 f20408;

    /* JADX INFO: renamed from: ᩶ */
    public long f20409;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC8453 f20410 = InterfaceC8453.f22683;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC6462 f20411 = null;

    /* JADX INFO: renamed from: ֨֫ */
    public AbstractC15689 mo17983() {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo5861(C8374 c8374) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo12938(AbstractC7783 abstractC7783, AbstractC21195 abstractC21195, C8374 c8374, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public boolean mo17485() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC7783 mo9143() {
        return this;
    }

    public AbstractC7783(EnumC3600 enumC3600, long j, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        this.f20405 = enumC3600;
        this.f20409 = j;
        this.f20406 = abstractC6462;
        this.f20407 = abstractC7783;
        this.f20408 = abstractC12224;
    }

    /* JADX INFO: renamed from: ۬ */
    public long mo18003() {
        return this.f20409;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public C4848 mo17987() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return C4848.m10283();
        }
        return c13148.m30084();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public C4848 mo18000() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return C4848.m10283();
        }
        return c13148.m30092();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17939 m17984(AbstractC7783 abstractC7783) {
        for (C17939 c17939 : mo17987()) {
            if (c17939.f29256.f16705 == abstractC7783) {
                return c17939;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m18007() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return false;
        }
        return c13148.m30095();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17985(C4848 c4848) {
        if (c4848.m10293()) {
            m17982().m30079(c4848);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17998(C4848 c4848) {
        if (c4848.m10293()) {
            m17982().m30085(c4848);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18011(C4848 c4848) {
        if (c4848.m10293()) {
            m17982().m30089(c4848);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m18016(C4848 c4848) {
        if (c4848.m10293()) {
            m17982().m30093(c4848);
        }
    }

    /* JADX INFO: renamed from: ۛ */
    public final C4848 m17992() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return C4848.m10283();
        }
        return c13148.m30078();
    }

    /* JADX INFO: renamed from: ᩺ */
    public final C4848 m18024() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return C4848.m10283();
        }
        return c13148.m30088();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m18025(C4848 c4848) {
        m17982().m30094(c4848);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m18013(C4848 c4848) {
        m17982().m30090(c4848);
    }

    /* JADX INFO: renamed from: ۨ */
    public final C4848 m18001() {
        C13148 c13148 = this.f20404;
        if (c13148 == null) {
            return C4848.m10283();
        }
        return c13148.m30084();
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m18014() {
        C13148 c13148 = this.f20404;
        return (c13148 == null || c13148.m30091()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m18026() {
        C13148 c13148 = this.f20404;
        return (c13148 == null || c13148.m30087()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public final void m18023() {
        m17982().m30082();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18012(AbstractC7783 abstractC7783) {
        if (this.f20404 == null && abstractC7783.f20404 == null) {
            return;
        }
        m17982().m30080(abstractC7783.f20404);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m18005(C4848 c4848) {
        if (this.f20404 != null || c4848.m10293()) {
            m17982().m30086(c4848);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m17993(C4848 c4848) {
        if (this.f20404 != null || c4848.m10293()) {
            if (this.f20404 == null) {
                this.f20404 = new C13148(this);
            }
            this.f20404.m30083(c4848);
        }
    }

    /* JADX INFO: renamed from: ᩹֫ */
    private C13148 m17982() {
        if (this.f20404 == null) {
            this.f20404 = new C13148(this);
        }
        return this.f20404;
    }

    /* JADX INFO: renamed from: ܰ */
    public final C13148 m18004() {
        return this.f20404;
    }

    /* JADX INFO: renamed from: ۘ */
    public int mo3348() {
        throw new AssertionError("Invalid pool entry");
    }

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7783 mo9256(AbstractC7783 abstractC7783) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo27056(this, locale);
    }

    public String toString() {
        return this.f20408.toString();
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final AbstractC7783 m17991() {
        EnumC3600 enumC3600;
        AbstractC12224 abstractC12224 = this.f20407.f20408;
        if (abstractC12224 == null) {
            return null;
        }
        if (!abstractC12224.isEmpty() || (this.f20407.mo18003() & 1048576) != 0 || (enumC3600 = this.f20407.f20405) == EnumC3600.f7351 || enumC3600 == EnumC3600.f7354) {
            return this.f20407;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 m17997(AbstractC6462 abstractC6462, C8374 c8374) {
        AbstractC6462 abstractC6462M19430;
        AbstractC12224 abstractC12224 = this.f20407.f20408;
        if (abstractC12224 == null || abstractC12224.isEmpty()) {
            return m17991();
        }
        if (this.f20407.f20406.m14777(EnumC11353.CLASS) && (abstractC6462M19430 = c8374.m19430(this.f20407, abstractC6462)) != null) {
            return abstractC6462M19430.f16705;
        }
        return this.f20407;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo18010(C8374 c8374) {
        if (this.f20411 == null) {
            this.f20411 = c8374.m19459(this.f20406);
        }
        return this.f20411;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 m18015(C8374 c8374) {
        AbstractC6462 abstractC6462Mo18010 = mo18010(c8374);
        AbstractC12224 abstractC12224 = this.f20408;
        if (abstractC12224 != abstractC12224.f34165.f40540.f21737 || !this.f20407.m18006()) {
            return abstractC6462Mo18010;
        }
        return new C12497(abstractC6462Mo18010.mo14797().m10290(c8374.m19459(this.f20407.f20406.mo7201())), abstractC6462Mo18010.mo14787(), abstractC6462Mo18010.mo14794(), abstractC6462Mo18010.f16705);
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean mo3351() {
        return (this.f20409 & 131072) != 0;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m18021() {
        int i = C19182.f57345[mo3347().ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public boolean mo17483() {
        if ((mo18003() & 8) != 0) {
            return true;
        }
        if ((this.f20407.mo18003() & 512) == 0 || this.f20405 == EnumC3600.f7343) {
            return false;
        }
        AbstractC12224 abstractC12224 = this.f20408;
        return abstractC12224 != abstractC12224.f34165.f40540.f21744;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean m17989() {
        return (mo18003() & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final boolean m18018() {
        return (this.f20409 & 7) == 1;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean m18009() {
        return (mo18003() & 16384) != 0;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean m18019() {
        return (this.f20409 & SkeinEngine.UbiTweak.T1_FIRST) != 0;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean m17996() {
        if (this.f20407.f20405.m6623(C17010.f50315)) {
            return true;
        }
        AbstractC7783 abstractC7783 = this.f20407;
        return abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.m17996();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m17994() {
        AbstractC12224 abstractC12224 = this.f20408;
        return abstractC12224 == abstractC12224.f34165.f40540.f21737;
    }

    /* JADX INFO: renamed from: ۟ */
    public AbstractC12224 mo17995() {
        return this.f20408;
    }

    /* JADX INFO: renamed from: ۫ */
    public AbstractC12224 mo18002() {
        return mo17995();
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final boolean m17988() {
        return this.f20405 == EnumC3600.f7354 && this.f20406.mo7201().m14777(EnumC11353.CLASS);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean m18006() {
        return this.f20406.mo7201().m14777(EnumC11353.CLASS) && (mo18003() & 4194816) == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public final C15828 m17990() {
        AbstractC7783 abstractC7783 = this;
        while (abstractC7783 != null && (!abstractC7783.f20405.m6623(C17010.f50319) || !abstractC7783.f20406.m14777(EnumC11353.CLASS))) {
            abstractC7783 = abstractC7783.f20407;
        }
        return (C15828) abstractC7783;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public C15828 mo3350() {
        AbstractC7783 abstractC7783 = null;
        for (AbstractC7783 abstractC7784 = this; abstractC7784.f20405 != EnumC3600.f7351; abstractC7784 = abstractC7784.f20407) {
            abstractC7783 = abstractC7784;
        }
        return (C15828) abstractC7783;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final C9794 m18008() {
        AbstractC7783 abstractC7783 = this;
        while (abstractC7783.f20405 != EnumC3600.f7351) {
            abstractC7783 = abstractC7783.f20407;
        }
        return (C9794) abstractC7783;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo17999(AbstractC7783 abstractC7783, C8374 c8374) {
        throw new AssertionError("isSubClass " + this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17986(AbstractC21195 abstractC21195, C8374 c8374) {
        AbstractC7783 abstractC7783 = this.f20407;
        if (abstractC7783 != abstractC21195) {
            if (abstractC21195.mo17999(abstractC7783, c8374) && mo12937((AbstractC7783) abstractC21195, c8374)) {
                AbstractC7783 abstractC7783M17981 = m17981((C15828) abstractC21195, c8374);
                C1446.m31703("the result of hiddenInInternal() can't be null", abstractC7783M17981 != null);
                if (abstractC7783M17981 != this) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC7783 m17981(C15828 c15828, C8374 c8374) {
        if (c15828 != this.f20407) {
            for (AbstractC7783 abstractC7783 : c15828.mo17983().m22456(this.f20408)) {
                EnumC3600 enumC3600 = abstractC7783.f20405;
                EnumC3600 enumC3601 = this.f20405;
                if (enumC3600 == enumC3601 && (enumC3601 != EnumC3600.f7343 || ((abstractC7783.mo18003() & 8) != 0 && c8374.m19472(abstractC7783.f20406, this.f20406, true)))) {
                    return abstractC7783;
                }
            }
            AbstractC7783 abstractC7784 = null;
            for (AbstractC6462 abstractC6462 : c8374.m19450(c15828.f20406).m10290(c8374.m19502(c15828.f20406))) {
                if (abstractC6462 != null && abstractC6462.m14777(EnumC11353.CLASS)) {
                    AbstractC7783 abstractC7783M17981 = m17981((C15828) abstractC6462.f16705, c8374);
                    if (abstractC7783M17981 != this) {
                        if (abstractC7783M17981 != null) {
                            abstractC7784 = abstractC7783M17981;
                        }
                    }
                }
            }
            return abstractC7784;
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo12937(AbstractC7783 abstractC7783, C8374 c8374) {
        int i = (int) (this.f20409 & 7);
        if (i != 0) {
            if (i != 2) {
                return i != 4 || (abstractC7783.mo18003() & 512) == 0;
            }
            return this.f20407 == abstractC7783;
        }
        C9794 c9794M18008 = m18008();
        AbstractC7783 abstractC7784 = abstractC7783;
        while (abstractC7784 != null && abstractC7784 != this.f20407) {
            while (abstractC7784.f20406.m14777(EnumC11353.TYPEVAR)) {
                abstractC7784 = abstractC7784.f20406.mo14803().f16705;
            }
            if (abstractC7784.f20406.mo14812()) {
                return true;
            }
            if ((abstractC7784.mo18003() & 16777216) == 0 && abstractC7784.m18008() != c9794M18008) {
                return false;
            }
            abstractC7784 = c8374.m19502(abstractC7784.f20406).f16705;
        }
        return (abstractC7783.mo18003() & 512) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo12936(AbstractC6462 abstractC6462, C8374 c8374) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩶ */
    public void mo18020() {
        InterfaceC8453 interfaceC8453 = this.f20410;
        InterfaceC8453 interfaceC8454 = InterfaceC8453.f22683;
        if (interfaceC8453 != interfaceC8454) {
            this.f20410 = interfaceC8454;
            interfaceC8453.mo9171(this);
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m18022() {
        try {
            mo18020();
        } catch (C21865 e) {
            e.f68782.m8678(e);
        }
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۜ */
    public AbstractC7783 mo9255() {
        return this.f20407;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC24473 mo3347() {
        return EnumC24473.OTHER;
    }

    /* JADX INFO: renamed from: ܳ */
    public Set mo12941() {
        m18022();
        return C21036.m47447(mo18003());
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܽ֫, reason: merged with bridge method [inline-methods] */
    public AbstractC12224 mo3355() {
        return this.f20408;
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۤ, reason: merged with bridge method [inline-methods] */
    public C4848 mo9259() {
        m18022();
        return mo17987();
    }

    /* JADX INFO: renamed from: ܺ */
    public List mo3353() {
        return C4848.m10283();
    }

    @Override // p067l.InterfaceC15755, p067l.InterfaceC9071
    /* JADX INFO: renamed from: ᩳ֫, reason: merged with bridge method [inline-methods] */
    public final C4848 mo9257() {
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6462 : this.f20406.mo14802()) {
            C1446.m31704(abstractC6462.f16705.mo3347() == EnumC24473.TYPE_PARAMETER);
            c20271.m45777((C6442) abstractC6462.f16705);
        }
        return c20271.m45783();
    }
}
