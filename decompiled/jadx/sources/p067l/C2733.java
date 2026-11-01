package p067l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2733 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f4589;

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashMap f4590;

    /* JADX INFO: renamed from: ܳ */
    public C4848 f4591;

    /* JADX INFO: renamed from: ܽ */
    public C8769 f4592;

    /* JADX INFO: renamed from: ܿ */
    public C8374 f4593;

    /* JADX INFO: renamed from: ᩳ */
    public C4848 f4594;

    public C2733() {
        throw null;
    }

    public C2733(C8769 c8769, C4848 c4848, C4848 c4849) {
        this.f4590 = new LinkedHashMap();
        this.f4589 = new HashMap();
        this.f4594 = c4848;
        this.f4591 = c4849;
        this.f4592 = c8769;
        this.f4593 = c8769.f23797;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m4267() {
        return m4244(new C17542(1));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m4257() {
        return m4244(new C2790(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m4247() {
        return m4244(new C19744(3));
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m4244(Predicate predicate) {
        C20271 c20271 = new C20271();
        Iterator it = this.f4591.iterator();
        while (it.hasNext()) {
            C3108 c3108 = (C3108) ((AbstractC6462) it.next());
            if (predicate.test(c3108)) {
                c20271.m45777(c3108.f16992);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m4264(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            if (((AbstractC6462) it.next()).m14792(this.f4594)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m4262(AbstractC6462 abstractC6462) {
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6463 : this.f4594) {
            if (abstractC6462.mo14776(abstractC6463)) {
                c20271.m45777(abstractC6463);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m4268(C4848 c4848) {
        C20271<AbstractC6462> c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45778(m4262((AbstractC6462) it.next()));
        }
        C20271 c20272 = new C20271();
        for (AbstractC6462 abstractC6462 : c20271) {
            if (!c20272.contains(abstractC6462)) {
                c20272.m45777(abstractC6462);
            }
        }
        return c20272.m45783();
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m4259(AbstractC6462 abstractC6462) {
        return this.f4593.m19428(abstractC6462, this.f4594, this.f4591);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m4258(C4848 c4848) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45777(m4259((AbstractC6462) it.next()));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m4250(AbstractC6462 abstractC6462) {
        C4848 c4848 = this.f4594;
        C20271 c20271 = new C20271();
        Iterator it = this.f4591.iterator();
        while (it.hasNext()) {
            C3108 c3108 = (C3108) ((AbstractC6462) it.next());
            c20271.m45777(c3108.m5300() != null ? c3108.m5300() : c3108.f16992);
        }
        return this.f4593.m19428(abstractC6462, c4848, c20271.m45783());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m4248(C4848 c4848) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45777(m4250((AbstractC6462) it.next()));
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4255(C4848 c4848, InterfaceC5930 interfaceC5930) {
        this.f4590.put(interfaceC5930, m4268(c4848));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4263() {
        m4266(this.f4594.m10288(m4267()));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m4266(C4848 c4848) {
        LinkedHashMap linkedHashMap = this.f4590;
        C14646 c14646 = null;
        for (Map.Entry entry : new LinkedHashMap(linkedHashMap).entrySet()) {
            if (!AbstractC6462.m14767((C4848) entry.getValue(), this.f4594.m10288(c4848))) {
                try {
                    ((InterfaceC5930) entry.getKey()).mo6905(this);
                    linkedHashMap.remove(entry.getKey());
                } catch (C14646 e) {
                    if (c14646 == null) {
                        c14646 = e;
                    }
                }
            }
        }
        if (c14646 != null) {
            throw c14646;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4848 m4265() {
        C20271 c20271 = new C20271();
        Iterator it = this.f4591.iterator();
        while (it.hasNext()) {
            C3108 c3108 = (C3108) ((AbstractC6462) it.next());
            C8374 c8374 = this.f4592.f23797;
            C3108 c3109 = new C3108((C10485) c3108.f16992, c3108.f5651, c8374);
            c3108.m5293(c3109, c8374);
            c20271.m45777(c3109);
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m4261(C4848 c4848) {
        C1446.m31704(c4848 != null);
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        while (c4848.m10293() && this.f4591.m10293()) {
            C4848 c4849 = this.f4591;
            C3108 c3108 = (C3108) c4849.f11034;
            C3108 c3109 = (C3108) c4848.f11034;
            if (c3108.f16992 == c3109.f16992) {
                c3109.m5293(c3108, this.f4593);
                this.f4591 = this.f4591.f11035;
                c4848 = c4848.f11035;
                c20271.m45777(c3108);
                c20272.m45777(c3108.f16992);
            } else {
                this.f4591 = c4849.f11035;
            }
        }
        this.f4591 = c20271.m45783();
        this.f4594 = c20272.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4252(C2733 c2733, boolean z) {
        C4848 c4848 = c2733.f4594;
        C4848 c4848M10288 = this.f4594.m10288(c4848);
        c4848.getClass();
        c2733.f4594 = c4848M10288.m10292(c4848);
        C4848 c4848M4265 = z ? m4265() : this.f4591;
        C4848 c4849 = c2733.f4591;
        C4848 c4848M10289 = c4848M4265.m10288(c4849);
        c4849.getClass();
        c2733.f4591 = c4848M10289.m10292(c4849);
        Iterator it = this.f4594.iterator();
        while (it.hasNext()) {
            c2733.f4590.put(new InterfaceC5930() { // from class: l.ۡۨ֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2734) {
                    this.f29873.m4263();
                }
            }, C4848.m10276of(it.next()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2733 m4246(C4848 c4848, boolean z, final C3686 c3686) {
        if (c4848.m10289() != this.f4594.m10289()) {
            for (AbstractC6462 abstractC6462 : this.f4594) {
                if (!abstractC6462.m14777(EnumC11353.TYPEVAR) || !((C10485) abstractC6462).mo24195()) {
                }
            }
            final C20840 c20840 = new C20840(this);
            C7480.stream(c4848).forEach(new Consumer() { // from class: l.ᩴۨ֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((AbstractC6462) obj).mo5291(c20840, (Object) null);
                }
            });
            if (c20840.f65488.size() != this.f4594.m10289()) {
                C4848 c4848M10279 = C4848.m10279((Iterable) c20840.f65488);
                C4848 c4848M10288 = this.f4594.m10288(c4848M10279);
                C20271 c20271 = new C20271();
                Iterator it = c4848M10279.iterator();
                while (it.hasNext()) {
                    C3108 c3108 = (C3108) m4259((AbstractC6462) it.next());
                    C1446.m31704(c3108.f5653.isEmpty());
                    C10485 c10485 = (C10485) c3108.f16992;
                    InterfaceC7132 interfaceC7132 = c3108.f5651;
                    C8374 c8374 = this.f4593;
                    C3108 c3109 = new C3108(c10485, interfaceC7132, c8374);
                    c3108.m5293(c3109, c8374);
                    EnumC20544[] enumC20544ArrValues = EnumC20544.values();
                    int length = enumC20544ArrValues.length;
                    char c = 0;
                    int i = 0;
                    while (i < length) {
                        EnumC20544 enumC20544 = enumC20544ArrValues[i];
                        EnumC20544[] enumC20544Arr = new EnumC20544[1];
                        enumC20544Arr[c] = enumC20544;
                        c3109.m5295(enumC20544, (C4848) C7480.stream(c3108.m5292(enumC20544Arr)).filter(new C5580(3, c4848M10288)).collect(C4848.m10284()));
                        i++;
                        c = 0;
                    }
                    c20271.m45777(c3109);
                }
                C2733 c2733 = new C2733(this.f4592, c4848M10279, c20271.m45783());
                for (final AbstractC6462 abstractC6463 : c2733.f4594) {
                    c2733.m4255(C4848.m10276of((Object) abstractC6463), new InterfaceC5930() { // from class: l.᩷ۨ֨
                        @Override // p067l.InterfaceC5930
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6905(C2733 c2734) {
                            AbstractC6462 abstractC6464 = abstractC6463;
                            AbstractC6462 abstractC6462M4250 = c2734.m4250(abstractC6464);
                            Iterator it2 = ((Set) c20840.f65486.get(abstractC6464)).iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                C2733 c2735 = this.f70175;
                                if (zHasNext) {
                                    ((C3108) c2735.m4259((AbstractC6462) it2.next())).m5301(abstractC6462M4250);
                                } else {
                                    c2735.f4592.m20297(c2735, c3686);
                                    c2735.m4263();
                                    return;
                                }
                            }
                        }
                    });
                }
                if (z) {
                    final C4848 c4848M10289 = c4848M10288.m10288(C4848.m10279((Iterable) c20840.f65487));
                    c2733.m4255(c4848M10279, new InterfaceC5930() { // from class: l.ۢۨ֨
                        @Override // p067l.InterfaceC5930
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6905(C2733 c2734) {
                            C4848 c4849 = c4848M10289;
                            C3686 c3687 = c3686;
                            C2733 c2735 = this.f31934;
                            c2735.m4254(c4849, c3687);
                            c2735.m4263();
                        }
                    });
                }
                return c2733;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4245(AbstractC18156 abstractC18156, C3686 c3686) {
        C8769 c8769 = this.f4592;
        C12826.requireNonNull(c8769);
        C7271 c7271 = new C7271(c8769, this, c3686);
        c8769.m20297(this, c3686);
        C2576 c2576 = new C2576(c7271);
        while (!abstractC18156.mo10047()) {
            if (c8769.f23804 != null) {
                C4848 c4848 = c8769.f23799;
                StringBuilder sb = new StringBuilder();
                Iterator it = c2576.f4255.f18964.f4591.iterator();
                while (it.hasNext()) {
                    C3108 c3108 = (C3108) ((AbstractC6462) it.next());
                    sb.append(String.format("var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n", c3108.f16992, c3108.m5292(EnumC20544.f63504), c3108.m5292(EnumC20544.f63505), c3108.m5292(EnumC20544.f63507)));
                }
                c8769.f23799 = c4848.m10290(C7335.m16928(c2576.f4254, "inferenceGraph" + c2576.hashCode(), sb.toString()));
            }
            C20683 c20683Mo23270 = abstractC18156.mo23270(c2576);
            C4848 c4848M10279 = C4848.m10279((Iterable) c20683Mo23270.f31649);
            C4848 c4848M4265 = m4265();
            while (AbstractC6462.m14767(m4267(), c4848M10279)) {
                try {
                    EnumC20012[] enumC20012ArrValues = EnumC20012.values();
                    int length = enumC20012ArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (m4249(c4848M10279, enumC20012ArrValues[i].f60842).m10293()) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            throw C8769.m20286((C18258) null);
                        }
                    }
                    c8769.m20297(this, c3686);
                } catch (C14646 unused) {
                    m4261(c4848M4265);
                    c8769.m20300(c4848M10279, this);
                    c8769.m20297(this, c3686);
                }
            }
            C1446.m31704(c2576.f4254.contains(c20683Mo23270));
            c2576.f4254.remove(c20683Mo23270);
            c2576.m3881(c20683Mo23270, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4253(C3686 c3686) {
        C8769 c8769 = this.f4592;
        C12826.requireNonNull(c8769);
        m4245(new C17485(this, c8769), c3686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4254(C4848 c4848, C3686 c3686) {
        C8769 c8769 = this.f4592;
        C12826.requireNonNull(c8769);
        m4245(new C4746(this, c8769, c4848, c4848), c3686);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4260(C4848 c4848, C3686 c3686) {
        C8769 c8769 = this.f4592;
        C12826.requireNonNull(c8769);
        m4245(new C6087(this, c8769, c4848.m10291(m4267())), c3686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4256(boolean z, C3686 c3686, EnumSet enumSet) {
        C8769 c8769;
        while (true) {
            C4848 c4848M4249 = m4249(this.f4594, enumSet);
            boolean zIsEmpty = m4267().isEmpty();
            c8769 = this.f4592;
            if (zIsEmpty || z) {
                break;
            }
            if (c4848M4249.isEmpty()) {
                c8769.m20300(m4267(), this);
                break;
            }
            Iterator it = this.f4591.iterator();
            while (it.hasNext()) {
                ((C3108) ((AbstractC6462) it.next())).m5294(this.f4593, c4848M4249, m4248(c4848M4249));
            }
        }
        c8769.m20297(this, c3686);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m4249(C4848 c4848, EnumSet enumSet) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.m10291(m4267()).iterator();
        while (it.hasNext()) {
            C3108 c3108 = (C3108) m4259((AbstractC6462) it.next());
            Iterator it2 = enumSet.iterator();
            while (it2.hasNext()) {
                EnumC12793 enumC12793 = (EnumC12793) it2.next();
                if (enumC12793.mo8179(c3108, this)) {
                    c3108.m5301(enumC12793.mo8180(c3108, this));
                    c20271.m45777(c3108.f16992);
                    break;
                }
            }
        }
        return c20271.m45783();
    }

    public final String toString() {
        return "Inference vars: " + this.f4594 + "\nUndet vars: " + this.f4591;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m4251(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, boolean z) {
        HashMap map = this.f4589;
        AbstractC6462 abstractC6463 = (AbstractC6462) map.get(abstractC7257);
        if (abstractC6463 != null) {
            return abstractC6463;
        }
        AbstractC6462 abstractC6462M19463 = this.f4593.m19463(abstractC6462);
        if (abstractC6462M19463 != abstractC6462 && !z) {
            map.put(abstractC7257, abstractC6462M19463);
        }
        return abstractC6462M19463;
    }
}
