package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6462 extends AbstractC15218 implements InterfaceC7730, InterfaceC22798 {

    /* JADX INFO: renamed from: ᩸ */
    public final C22082 f16704;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC21195 f16705;

    /* JADX INFO: renamed from: ۙ */
    public static final C13286 f16700 = new C10604();

    /* JADX INFO: renamed from: ۗ */
    public static final C13286 f16699 = new C17308();

    /* JADX INFO: renamed from: ۫ */
    public static final C13286 f16701 = new C4569();

    /* JADX INFO: renamed from: ᩶ */
    public static boolean f16703 = false;

    /* JADX INFO: renamed from: ۬ */
    public static final C3680 f16702 = new C5910();

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public boolean mo14771() {
        return this instanceof C3779;
    }

    /* JADX INFO: renamed from: ֨֫ */
    public boolean mo14772() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC6462 mo3770(C22082 c22082);

    /* JADX INFO: renamed from: ֫֫ */
    public abstract EnumC11353 mo5577();

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean mo14778() {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public Object mo14779() {
        return null;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean mo14781() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14782() {
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean mo14784() {
        return false;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean mo14786() {
        return false;
    }

    /* JADX INFO: renamed from: ۟ */
    public AbstractC6462 mo14787() {
        return null;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public boolean mo14788() {
        return false;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean mo14790() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public AbstractC6462 mo14791() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public AbstractC6462 mo14235() {
        return this;
    }

    /* JADX INFO: renamed from: ۫ */
    public AbstractC6462 mo7201() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean mo7388() {
        return this instanceof C7921;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean mo14799() {
        return false;
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean mo14800() {
        return this instanceof C3227;
    }

    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo14801(AbstractC6462 abstractC6462) {
        return this;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public AbstractC6462 mo14803() {
        return null;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean mo14804() {
        return this instanceof C3108;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean mo14805() {
        return false;
    }

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC6462 mo5302() {
        return this;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean mo14806() {
        return false;
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean mo14808() {
        return false;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean mo14810() {
        return this instanceof C18531;
    }

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC6462 mo14811() {
        return this;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean mo14812() {
        return false;
    }

    public AbstractC6462(AbstractC21195 abstractC21195, C22082 c22082) {
        C1446.m31699(c22082);
        this.f16705 = abstractC21195;
        this.f16704 = c22082;
    }

    /* JADX INFO: renamed from: ۛ */
    public final C22082 m14785() {
        return this.f16704;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8670 m14774(EnumC24763 enumC24763) {
        C22082 c22082 = this.f16704;
        if (c22082 != null) {
            return c22082.m49702(enumC24763);
        }
        return null;
    }

    @Override // p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public int mo3348() {
        throw new AssertionError("Invalid pool entry");
    }

    @Override // p067l.InterfaceC22798
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5861(C8374 c8374) {
        return new C12398(this, c8374);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14777(EnumC11353 enumC11353) {
        return enumC11353 == mo5577();
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4507(obj, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo5576(Object obj) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final AbstractC6462 m14796() {
        return this.f16704 == C22082.f69463 ? this : mo5302();
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final AbstractC6462 m14780() {
        return mo14810() ? (AbstractC6462) mo5291(f16702, (Object) null) : this;
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final AbstractC6462 m14783() {
        return (AbstractC6462) mo5291(f16702, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo14773(C4848 c4848) {
        return mo3770(this.f16704.m49703(new C16045(c4848)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14775(StringBuilder sb, boolean z) {
        C16045 c16045 = (C16045) m14774(EnumC24763.ANNOTATIONS);
        if (c16045 == null || c16045.m36516().isEmpty()) {
            return;
        }
        if (z) {
            sb.append(" ");
        }
        sb.append(m14795());
        sb.append(" ");
    }

    /* JADX INFO: renamed from: ۬ */
    public final C4848 m14795() {
        C16045 c16045 = (C16045) m14774(EnumC24763.ANNOTATIONS);
        return c16045 == null ? C4848.m10283() : c16045.m36516();
    }

    public String toString() {
        AbstractC12224 abstractC12224;
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        AbstractC21195 abstractC21195 = this.f16705;
        if (abstractC21195 == null || (abstractC12224 = abstractC21195.f20408) == null) {
            sb.append("<none>");
        } else {
            sb.append(abstractC12224.toString());
        }
        if (f16703 && m14777(EnumC11353.TYPEVAR)) {
            sb.append(hashCode());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m14770(C4848 c4848) {
        if (c4848.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC6462) c4848.f11034).toString());
        while (true) {
            c4848 = c4848.f11035;
            if (c4848.m10293()) {
                sb.append(",");
                sb.append(((AbstractC6462) c4848.f11034).toString());
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public String mo5578() {
        Object objMo14779 = mo14779();
        C1446.m31699(objMo14779);
        return objMo14779.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14793(AbstractC6462 abstractC6462) {
        return m14796().equals(abstractC6462.m14796());
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public C4848 mo14802() {
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ܰ */
    public C4848 mo14797() {
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public C4848 mo14794() {
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ܶ */
    public C4848 mo14798() {
        return C4848.m10283();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m14769(C4848 c4848) {
        while (c4848.m10293()) {
            if (((AbstractC6462) c4848.f11034).mo14812()) {
                return true;
            }
            c4848 = c4848.f11035;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean mo14789() {
        return (this.f16705.mo18003() & 512) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo14776(AbstractC6462 abstractC6462) {
        return abstractC6462.m14793(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14768(AbstractC6462 abstractC6462, C4848 c4848) {
        while (c4848.f11035 != null) {
            if (((AbstractC6462) c4848.f11034).mo14776(abstractC6462)) {
                return true;
            }
            c4848 = c4848.f11035;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14792(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            if (mo14776((AbstractC6462) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14767(C4848 c4848, C4848 c4849) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            if (((AbstractC6462) it.next()).m14792(c4849)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m14766(C4848 c4848, C19341 c19341) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            AbstractC6462 abstractC6462 = (AbstractC6462) it.next();
            if (c19341.test(abstractC6462)) {
                c20271.m45777(abstractC6462);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ᩹ */
    public C12497 mo14809() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC21195 mo14807() {
        return this.f16705;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC3035 mo5575() {
        return EnumC3035.OTHER;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean mo11307() {
        return mo14784();
    }
}
