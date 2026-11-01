package p067l;

import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֨֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3108 extends AbstractC6580 {

    /* JADX INFO: renamed from: ֫֫ */
    public EnumC2437 f5649;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC6462 f5650;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC7132 f5651;

    /* JADX INFO: renamed from: ۨ */
    public EnumMap f5652;

    /* JADX INFO: renamed from: ܰ */
    public ArrayDeque f5653;

    /* JADX INFO: renamed from: ܽ֫ */
    public C3680 f5654;

    /* JADX INFO: renamed from: ᩺ */
    public int f5655;

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo14564(this, obj);
    }

    public C3108(C10485 c10485, InterfaceC7132 interfaceC7132, C8374 c8374) {
        EnumC2437 enumC2437;
        super(EnumC11353.UNDETVAR, c10485);
        this.f5653 = new ArrayDeque();
        this.f5650 = null;
        this.f5651 = null;
        this.f5654 = new C17189();
        if (c10485.mo24195()) {
            enumC2437 = EnumC2437.CAPTURED;
        } else {
            enumC2437 = EnumC2437.NORMAL;
        }
        this.f5649 = enumC2437;
        this.f5651 = interfaceC7132;
        EnumMap enumMap = new EnumMap(EnumC20544.class);
        this.f5652 = enumMap;
        C4848 c4848M19424 = c8374.m19424(c10485);
        this.f5655 = c4848M19424.m10289();
        enumMap.put(EnumC20544.f63504, C4848.m10283());
        enumMap.put(EnumC20544.f63505, C4848.m10283());
        enumMap.put(EnumC20544.f63507, C4848.m10283());
        Iterator it = c4848M19424.m10294().iterator();
        while (it.hasNext()) {
            m5290(EnumC20544.f63504, (AbstractC6462) it.next(), c8374, true);
        }
        if (!c10485.mo24195() || c10485.f29021.m14777(EnumC11353.BOT)) {
            return;
        }
        m5290(EnumC20544.f63505, c10485.f29021, c8374, true);
    }

    @Override // p067l.AbstractC6580, p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        AbstractC6462 abstractC6462 = this.f5650;
        if (abstractC6462 == null) {
            sb.append(this.f16992);
            sb.append('?');
        } else {
            sb.append(abstractC6462);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ֫ */
    public final void m5299() {
        if (this.f5649 == EnumC2437.CAPTURED) {
            throw new IllegalStateException();
        }
        this.f5649 = EnumC2437.THROWS;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5293(C3108 c3108, C8374 c8374) {
        c3108.f5651 = null;
        EnumMap enumMap = c3108.f5652;
        enumMap.clear();
        for (EnumC20544 enumC20544 : EnumC20544.values()) {
            enumMap.put(enumC20544, C4848.m10283());
            Iterator it = m5292(enumC20544).iterator();
            while (it.hasNext()) {
                c3108.m5290(enumC20544, (AbstractC6462) it.next(), c8374, true);
            }
        }
        c3108.f5650 = this.f5650;
        c3108.f5651 = this.f5651;
        c3108.f5653 = new ArrayDeque();
        Iterator it2 = this.f5653.iterator();
        while (it2.hasNext()) {
            c3108.f5653.add(((AbstractC22694) it2.next()).mo9673(c3108));
        }
        c3108.f5649 = this.f5649;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        throw new AssertionError("Cannot add metadata to an UndetVar type");
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC6462 mo5302() {
        AbstractC6462 abstractC6462 = this.f5650;
        return abstractC6462 == null ? this : abstractC6462.mo5302();
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final AbstractC6462 m5300() {
        return this.f5650;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m5301(AbstractC6462 abstractC6462) {
        this.f5650 = abstractC6462;
        InterfaceC7132 interfaceC7132 = this.f5651;
        if (interfaceC7132 != null) {
            interfaceC7132.mo16409(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m5292(EnumC20544... enumC20544Arr) {
        C20271 c20271 = new C20271();
        for (EnumC20544 enumC20544 : enumC20544Arr) {
            c20271.m45778((C4848) this.f5652.get(enumC20544));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5295(EnumC20544 enumC20544, C4848 c4848) {
        this.f5652.put(enumC20544, c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5296(EnumC20544 enumC20544, AbstractC6462 abstractC6462, C8374 c8374) {
        if (c8374.f22458) {
            int iOrdinal = enumC20544.ordinal();
            if (iOrdinal == 0) {
                abstractC6462 = C8374.m19413(abstractC6462);
            } else if (iOrdinal == 2) {
                AbstractC6462 abstractC6462M19414 = C8374.m19414(abstractC6462);
                if (!abstractC6462M19414.m14777(EnumC11353.BOT)) {
                    abstractC6462 = abstractC6462M19414;
                }
            }
        }
        m5290(enumC20544, abstractC6462, c8374, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5290(EnumC20544 enumC20544, AbstractC6462 abstractC6462, C8374 c8374, boolean z) {
        if (this.f5649 == EnumC2437.CAPTURED && !z) {
            if (abstractC6462.m14777(EnumC11353.UNDETVAR)) {
                C3108 c3108 = (C3108) abstractC6462;
                if (c3108.m5298()) {
                    return;
                }
                c3108.m5290(enumC20544.mo9305(), this, c8374, false);
                return;
            }
            return;
        }
        abstractC6462.getClass();
        C3680 c3680 = this.f5654;
        c3680.getClass();
        AbstractC6462 abstractC6462Mo5302 = ((AbstractC6462) abstractC6462.mo5291(c3680, (Object) null)).mo5302();
        EnumMap enumMap = this.f5652;
        C4848 c4848 = (C4848) enumMap.get(enumC20544);
        if (abstractC6462 == this.f16992) {
            return;
        }
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            if (c8374.m19490((AbstractC6462) it.next(), abstractC6462Mo5302)) {
                return;
            }
        }
        enumMap.put(enumC20544, c4848.m10290(abstractC6462Mo5302));
        InterfaceC7132 interfaceC7132 = this.f5651;
        if (interfaceC7132 != null) {
            interfaceC7132.mo16410(this, enumC20544, abstractC6462Mo5302, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5294(C8374 c8374, C4848 c4848, C4848 c4849) {
        EnumMap enumMap = this.f5652;
        C20271<C24293> c20271 = new C20271();
        InterfaceC7132 interfaceC7132 = this.f5651;
        try {
            this.f5651 = new C22894(this, c20271);
            for (Map.Entry entry : enumMap.entrySet()) {
                EnumC20544 enumC20544 = (EnumC20544) entry.getKey();
                C4848<AbstractC6462> c48410 = (C4848) entry.getValue();
                C20271 c20272 = new C20271();
                C20271 c20273 = new C20271();
                for (AbstractC6462 abstractC6462 : c48410) {
                    if (!abstractC6462.m14792(c4848)) {
                        c20272.m45777(abstractC6462);
                    } else {
                        c20273.m45777(abstractC6462);
                    }
                }
                enumMap.put(enumC20544, c20272.m45783());
                Iterator it = c20273.iterator();
                while (it.hasNext()) {
                    m5290(enumC20544, c8374.m19428((AbstractC6462) it.next(), c4848, c4849), c8374, true);
                }
            }
        } finally {
            this.f5651 = interfaceC7132;
            for (C24293 c24293 : c20271) {
                EnumC20544 enumC20545 = (EnumC20544) c24293.f76952;
                AbstractC6462 abstractC6463 = (AbstractC6462) c24293.f76953;
                InterfaceC7132 interfaceC7133 = this.f5651;
                if (interfaceC7133 != null) {
                    interfaceC7133.mo16410(this, enumC20545, abstractC6463, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public final boolean m5298() {
        return this.f5649 == EnumC2437.CAPTURED;
    }

    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean m5297() {
        return this.f5649 == EnumC2437.THROWS;
    }
}
