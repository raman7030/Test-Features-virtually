package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;

/* JADX INFO: renamed from: l.᩶ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C21333 extends AbstractC6462 implements InterfaceC21142, InterfaceC10057 {

    /* JADX INFO: renamed from: ֫֫ */
    public C4848 f67257;

    /* JADX INFO: renamed from: ۛ */
    public C4848 f67258;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC6462 f67259;

    /* JADX INFO: renamed from: ۤ */
    public C4848 f67260;

    /* JADX INFO: renamed from: ۨ */
    public C4848 f67261;

    /* JADX INFO: renamed from: ܰ */
    public int f67262;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC6462 f67263;

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo14772() {
        return true;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 7;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܺ֫ */
    public boolean mo14800() {
        return true;
    }

    @Override // p067l.InterfaceC21142
    /* JADX INFO: renamed from: ۠ */
    public AbstractC21195 mo47761() {
        return this.f16705;
    }

    public C21333(AbstractC21195 abstractC21195, AbstractC6462 abstractC6462, C4848 c4848) {
        this(abstractC6462, c4848, abstractC21195, C22082.f69463);
    }

    public C21333(AbstractC6462 abstractC6462, C4848 c4848, AbstractC21195 abstractC21195, C22082 c22082) {
        super(abstractC21195, c22082);
        this.f67262 = -1;
        this.f67263 = abstractC6462;
        this.f67257 = c4848;
        this.f67258 = null;
        this.f67259 = null;
        this.f67261 = null;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public C21333 mo3770(C22082 c22082) {
        return new C22674(this, this.f67263, this.f67257, this.f16705, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public EnumC11353 mo5577() {
        return EnumC11353.CLASS;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4512(this, obj);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo5576(Object obj) {
        return new C23344(mo7201(), this.f67257, this.f16705, this.f16704, obj);
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!mo7201().m14777(EnumC11353.CLASS) || this.f16705.f20407.f20405 != EnumC3600.f7354) {
            m14775(sb, false);
            sb.append(m48343((AbstractC7783) this.f16705, true));
        } else {
            sb.append(mo7201().toString());
            sb.append(".");
            m14775(sb, false);
            sb.append(m48343((AbstractC7783) this.f16705, false));
        }
        if (mo14802().m10293()) {
            sb.append('<');
            sb.append(mo14802().m10285(","));
            sb.append(">");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m48343(AbstractC7783 abstractC7783, boolean z) {
        String strM52446;
        if (abstractC7783.f20408.isEmpty() && (abstractC7783.mo18003() & 16777216) != 0) {
            StringBuilder sb = new StringBuilder(this.f67259.toString());
            for (C4848 c4848 = this.f67261; c4848.m10293(); c4848 = c4848.f11035) {
                sb.append(C0233a.f1084p);
                sb.append(((AbstractC6462) c4848.f11034).toString());
            }
            return sb.toString();
        }
        if (!abstractC7783.f20408.isEmpty()) {
            return z ? abstractC7783.mo17995().toString() : abstractC7783.f20408.toString();
        }
        C21333 c21333 = (C21333) this.f16705.f20406;
        if (c21333 == null) {
            strM52446 = C23623.m52446("anonymous.class", null);
        } else {
            C4848 c4849 = c21333.f67261;
            strM52446 = (c4849 == null || !c4849.m10293()) ? C23623.m52446("anonymous.class", c21333.f67259) : C23623.m52446("anonymous.class", c21333.f67261.f11034);
        }
        if (!AbstractC6462.f16703) {
            return strM52446;
        }
        StringBuilder sbM17248 = C7470.m17248(strM52446);
        sbM17248.append(String.valueOf(abstractC7783.hashCode()));
        return sbM17248.toString();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܽ֫ */
    public C4848 mo14802() {
        if (this.f67257 == null) {
            mo14782();
            if (this.f67257 == null) {
                this.f67257 = C4848.m10283();
            }
        }
        return this.f67257;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۫ */
    public AbstractC6462 mo7201() {
        return this.f67263;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo7202(AbstractC6462 abstractC6462) {
        this.f67263 = abstractC6462;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܶ */
    public C4848 mo14798() {
        if (this.f67258 == null) {
            this.f67258 = mo14802().m10292(mo7201().mo14798());
        }
        return this.f67258;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo14812() {
        if (mo7201().mo14812() || AbstractC6462.m14769(mo14802())) {
            return true;
        }
        AbstractC6462 abstractC6462 = this.f16705.f20406;
        return this != abstractC6462 && abstractC6462.mo14812();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean mo14781() {
        return mo14798().f11035 != null;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo14784() {
        AbstractC6462 abstractC6462 = this.f16705.f20406;
        return this != abstractC6462 && abstractC6462.mo14798().m10293() && mo14798().isEmpty();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14776(AbstractC6462 abstractC6462) {
        if (abstractC6462.m14793(this)) {
            return true;
        }
        if (mo14781() && (mo7201().mo14776(abstractC6462) || AbstractC6462.m14768(abstractC6462, mo14802()))) {
            return true;
        }
        if (mo7388()) {
            return this.f67259.mo14776(abstractC6462) || AbstractC6462.m14768(abstractC6462, this.f67261);
        }
        return false;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo14782() {
        this.f16705.mo18020();
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public EnumC3035 mo5575() {
        this.f16705.m18022();
        return this.f16705.f20405 == EnumC3600.f7354 ? EnumC3035.DECLARED : EnumC3035.ERROR;
    }
}
